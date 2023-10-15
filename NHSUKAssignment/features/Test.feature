Feature: NHS costs online service

@England
Scenario: As a citizen of the UK_England, I need to know what help I can get with my NHS costs - So that I can get the treatment I need

	Given I am a citizen of the UK_England

	When I put my circumstances into the Checker tool for England

	Then I should get a result of whether I will get help or not for England
	
@Scotland
Scenario: As a citizen of the UK_Scotland, I need to know what help I can get with my NHS costs - So that I can get the treatment I need

	Given I am a citizen of the UK_Scotland

	When I put my circumstances into the Checker tool for Scotland

	Then I should get a result of whether I will get help or not for Scotland
	
@Wales
Scenario: As a citizen of the UK_Wales, I need to know what help I can get with my NHS costs - So that I can get the treatment I need

	Given I am a citizen of the UK_Wales

	When I put my circumstances into the Checker tool for Wales

	Then I should get a result of whether I will get help or not for Wales
	
@Northern_Ireland
Scenario: As a citizen of the UK_Northern Ireland, I need to know what help I can get with my NHS costs - So that I can get the treatment I need

	Given I am a citizen of the UK_Northern Ireland

	When I put my circumstances into the Checker tool for Northern Ireland

	Then I should get a result of whether I will get help or not for Northern Irelenad
