require 'calabash-android/calabash_steps'
require 'rspec'
require 'pry'
require 'pry-nav'

Given(/^I should see the list of all matches/) do
  wait_for_elements_exist([" * id:'title'"],:timeout => 15)
  get_title.should == "All"
  matches = get_visible_matches
  matches[0]["date"].should == "February 14, 2015"
  matches[0]["match_type"].should == "Pool A"

  matches[1]["date"].should == "February 14, 2015"
  matches[1]["match_type"].should == "Pool A"

  matches[2]["date"].should == "February 15, 2015"
  matches[2]["match_type"].should == "Pool B"

  matches[3]["date"].should == "February 15, 2015"
  matches[3]["match_type"].should == "Pool B"
end

When(/^I click on '([^"]*)'$/) do |link|
  touch("* marked:'#{link}'")
end

Then(/^I should see only 'Australia' matches/) do
  wait_for_elements_exist([" * id:'title'"],:timeout => 15)
  get_title.should == "Australia"
  get_visible_matches.each do |match|
    [match["team1"], match["team2"]].should include("Australia")
  end
end

Then(/^I should see all matches which are scheduled on 'February 14, 2015'/) do
  wait_for_elements_exist([" * id:'title'"],:timeout => 15)
  get_title.should == "February 14, 2015"
  get_visible_matches.each do |match|
    match["date"].should == "February 14, 2015"
  end
end

Then(/^I should see all matches of 'Pool A'/) do
  wait_for_elements_exist([" * id:'title'"],:timeout => 15)
  get_title.should == "Pool A"
  get_visible_matches.each do |match|
    match["match_type"].should == "Pool A"
  end
end

Then(/^I should see all matches which are going to be played on 'University Oval, Dunedin' stadium/) do
  wait_for_elements_exist([" * id:'title'"],:timeout => 15)
  get_title.should == "Universi..."
  get_visible_matches.each do |match|
    match["stadium"].should == "University Oval, Dunedin"
  end
end

def get_title
  query("* id:'title'")[0]["text"]
end

def get_visible_matches
  matches = []
  no_of_matches = query("* id:'match'").size - 1

  (0..no_of_matches).each do |i|
    match_details = query("* id:'match' index:#{i} descendant TextView")
    matches << {
        "team1"=> match_details[0]["text"],
        "team2"=> match_details[2]["text"],
        "date"=> match_details[3]["text"],
        "match_type"=> match_details[4]["text"],
        "stadium"=> match_details[6]["text"]
    }
  end
  matches
end