Feature: Purchase The Product In Automation Application

@Automation1
Scenario: Login Page
Given user Launch The Application
Then user Click On The Login Button And It Navigates To Account Creation Page

@Automation2
Scenario: Create An Account Page
When user Enter The "altrin172@gmail.com" In Email Id Field
Then user Click On The Create An Account Button And Its Navigate To Create An Account Page

@Automation3
Scenario: Create An Account Page
When user Select The Title
And user Enter The "Altrin" In First Name Field
And user Enter The "Mohan" In Last Name Field
And user Click The Email Id In Email Id Field
And user Enter The "12345" In Password Field
And user Enter The Date Of Birth In Date Of Birth Field
And user Enter The Month Of Birth In Month Of Birth Field
And user Enter The Year Of Birth In Year Of Birth Field
And user Select The Sign Up For Our Newsletter
And user Select The Receive Special Offers From Our Partners
And user Click The First Name In First Name Field
And user Click The Last Name In Last Name Field
And user Enter The "Apple" In The Company Field
And user Enter The "1 Apple Park Way" In Address Field
And user Enter The "Infinite Loop" In Address Line 2 Field
And user Enter The "Cupertino" In The City Field
And user Select The State In State Field
And user Enter The "95014" In Zip Code Field
And user Enter The "www.apple.com" In Additional Information Field
And user Enter The "+1(213) 555-3890" In Home Phone Field
And user Enter The "+1(213) 555-3890" In Mobile Phone Field
And user Enter The "Apple" In Alias Field
Then user Click On The Register Button And Its Navigate To Account Page

@Automation4
Scenario: Account Page
Then user Click On The Register Button And Its Navigate To My Account Page

@Automation5
Scenario: My Account Page
Then user Click On The Women Button And Its Navigate To Category Page

@Automation6
Scenario: Category Page
Then user Click The Faded Short Sleeve T-shirts And Its Navigate To Product Page

@Automation7
Scenario: Product Page
When user Click The Plus Button Thrice In Quantity Field
Then user Click The Add To Cart Button And Its Pop Up Notification
 
@Automation8
Scenario: Pop Up Notification
Then user Click The Proceed To Check Out Button And Its Navigate To Order Page

@Automation9
Scenario: Order Page
Then user Click The Proceed To Check Out Button And Its Navigate To Step One Page

@Automation10
Scenario: Step One Page
Then user Click The Proceed To Check Out Button And Its Navigate To Order Two Page

@Automation11
Scenario: Order Two Page
When user Click Check Box In I Agree Field
Then user Click The Proceed To Check Out Button And Its Navigate To Shipping Page

@Automation12
Scenario: Shipping Page
Then user Click The Pay By Bank Where Button And Its Navigate To Payment Page

@Automation13
Scenario: Payment Page
Then user Click The I Confirm My Order Button And Its Navigate To Complete Page
