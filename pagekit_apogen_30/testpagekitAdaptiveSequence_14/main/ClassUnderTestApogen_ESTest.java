/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 29 02:29:24 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Email;
import custom_classes.Id;
import custom_classes.Name;
import custom_classes.UserPassword;
import custom_classes.UserRoles;
import custom_classes.UserStatus;
import custom_classes.Username;
import custom_classes.WidgetLocation;
import custom_classes.WidgetNumberOfUsers;
import custom_classes.WidgetTotalUser;
import custom_classes.WidgetUnit;
import custom_classes.WidgetUserDisplay;
import custom_classes.WidgetUserType;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.formEditLocationPage(Lcustom_classes/WidgetLocation;Lcustom_classes/WidgetUnit;)V: Line 695
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 6. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 7. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 8. main.ClassUnderTestApogen.goToEditComponentLocationDashboardPage(Lcustom_classes/Id;)V: Line 152
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 14. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 15. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 16. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 17. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 18. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 19. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1564;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.ADMIN;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditComponentLocationDashboardPage(id0);
      WidgetLocation widgetLocation0 = WidgetLocation.GENOA;
      WidgetUnit widgetUnit0 = WidgetUnit.IMPERIAL;
      classUnderTestApogen0.formEditLocationPage(widgetLocation0, widgetUnit0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
  }

  //Test case number: 1
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 217
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 4. main.ClassUnderTestApogen.cancelDeleteWidgetPage()V: Line 542
   * Goal 5. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 6. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 7. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 8. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 12. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 13. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 14. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 15. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 16. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 17. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      Name name1 = Name.MARK;
      Email email1 = Email.ASD;
      classUnderTestApogen0.user_editEditUserPage(username0, name1, email1, userPassword0);
      Username username1 = Username.ADMIN;
      Name name2 = Name.MARK;
      Email email2 = Email.FOO;
      classUnderTestApogen0.user_editEditUserPage(username1, name2, email2, userPassword0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      int int0 = (-13);
      Id id0 = new Id(int0);
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username2 = Username.ADMIN;
      Email email3 = Email.FOO;
      UserPassword userPassword1 = UserPassword.ADMIN;
      UserStatus userStatus0 = UserStatus.ACTIVE;
      classUnderTestApogen0.addUserAddUserPage(username2, name2, email3, userPassword1, userStatus0);
      classUnderTestApogen0.goToRolesAddUserPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 220
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 4. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 5. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 6. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 7. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 8. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 9. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 10. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 11. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 12. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 13. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1501;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      UserStatus userStatus0 = UserStatus.ACTIVE;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToRolesAddUserPage();
  }

  //Test case number: 3
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.deleteRoleDeleteRolePage()V: Line 633
   * Goal 4. main.ClassUnderTestApogen.deleteUserRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 369
   * Goal 5. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 6. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousDeleteRolePage()V: Line 648
   * Goal 9. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 10. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 11. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 12. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 14. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 15. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 16. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 17. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.goToAnonymousDeleteRolePage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.deleteRoleDeleteRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
  }

  //Test case number: 4
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 2. main.ClassUnderTestApogen.formEditLocationPage(Lcustom_classes/WidgetLocation;Lcustom_classes/WidgetUnit;)V: Line 695
   * Goal 3. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 7. main.ClassUnderTestApogen.goToEditComponentLocationDashboardPage(Lcustom_classes/Id;)V: Line 152
   * Goal 8. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 14. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 15. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 16. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 17. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      int int0 = 1017;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      Username username0 = Username.ADMIN;
      Name name0 = Name.MARK;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      Id id1 = new Id(int0);
      classUnderTestApogen0.goToEditUsersPage(id1);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id1);
      WidgetUserType widgetUserType0 = WidgetUserType.LOGGEDIN;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.SHOW;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.EIGHTEEN;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      int int1 = 1888;
      Id id2 = new Id(int1);
      classUnderTestApogen0.goToEditComponentLocationDashboardPage(id2);
      WidgetLocation widgetLocation0 = WidgetLocation.GENOA;
      WidgetUnit widgetUnit0 = WidgetUnit.METRIC;
      classUnderTestApogen0.formEditLocationPage(widgetLocation0, widgetUnit0);
  }

  //Test case number: 5
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 2. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 3. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 7. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 8. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 14. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 15. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 16. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 17. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 18. main.ClassUnderTestApogen.okDeleteWidgetPage()V: Line 556
   * Goal 19. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-2260);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.okDeleteWidgetPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.FOO;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
  }

  //Test case number: 6
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 4. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 5. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 6. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 7. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 9. main.ClassUnderTestApogen.goToAnonymousEditRolePage()V: Line 528
   * Goal 10. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 11. main.ClassUnderTestApogen.goToEditRoleAnonymousPage(Lcustom_classes/UserRoles;Lcustom_classes/UserRoles;)V: Line 426
   * Goal 12. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 13. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 14. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 15. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 16. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 17. main.ClassUnderTestApogen.okDeleteWidgetPage()V: Line 556
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 2819;
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.okDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles1 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.cancelAddRolePage();
      UserRoles userRoles2 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToEditRoleAnonymousPage(userRoles0, userRoles2);
      classUnderTestApogen0.goToAnonymousEditRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
  }
}
