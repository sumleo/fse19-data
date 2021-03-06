/*
 * This file was automatically generated by EvoSuite
 * Tue May 05 19:21:13 GMT 2020
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
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 217
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 4. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 5. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 6. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 7. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 8. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 9. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 10. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      Name name0 = Name.MARK;
      Email email0 = Email.ASD;
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.FOO;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.BLOCKED;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      Username username1 = Username.ADMIN;
      Email email1 = Email.FOO;
      UserPassword userPassword1 = UserPassword.ADMIN;
      UserStatus userStatus1 = UserStatus.ACTIVE;
      classUnderTestApogen0.addUserAddUserPage(username1, name0, email1, userPassword1, userStatus1);
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 220
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 4. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 5. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 6. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 7. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 8. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 9. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 10. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 11. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.BLOCKED;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      classUnderTestApogen0.goToRolesAddUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      UserPassword userPassword1 = UserPassword.FOO;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword1);
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 3. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 7. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 8. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 9. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 10. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 11. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 12. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 13. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToRolesAddUserPage();
  }

  //Test case number: 3
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.cancelDeleteWidgetPage()V: Line 542
   * Goal 3. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 4. main.ClassUnderTestApogen.deleteRoleDeleteRolePage()V: Line 633
   * Goal 5. main.ClassUnderTestApogen.deleteUserRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 369
   * Goal 6. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 7. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 8. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 9. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 10. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 11. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 12. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 13. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 14. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 15. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-1126);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.deleteRoleDeleteRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 3. main.ClassUnderTestApogen.formEditLocationPage(Lcustom_classes/WidgetLocation;Lcustom_classes/WidgetUnit;)V: Line 695
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 6. main.ClassUnderTestApogen.goToEditComponentLocationDashboardPage(Lcustom_classes/Id;)V: Line 152
   * Goal 7. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 8. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 9. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 10. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 11. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 12. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      int int0 = 3238;
      Id id0 = new Id(int0);
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditComponentLocationDashboardPage(id0);
      WidgetLocation widgetLocation0 = WidgetLocation.GENOA;
      WidgetUnit widgetUnit0 = WidgetUnit.IMPERIAL;
      classUnderTestApogen0.formEditLocationPage(widgetLocation0, widgetUnit0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      int int1 = (-538);
      Id id1 = new Id(int1);
      classUnderTestApogen0.deletePagekitDashboardPage(id1);
  }

  //Test case number: 5
  /*
   * 10 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 3. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 6. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 7. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 8. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 9. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 10. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 3552;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LASTREGISTERED;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.HIDE;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.EIGHTEEN;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserDisplay widgetUserDisplay1 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser1 = WidgetTotalUser.SHOW;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay1, widgetTotalUser1, widgetNumberOfUsers0);
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
  }

  //Test case number: 6
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 3. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousEditRolePage()V: Line 528
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 9. main.ClassUnderTestApogen.goToEditRoleAnonymousPage(Lcustom_classes/UserRoles;Lcustom_classes/UserRoles;)V: Line 426
   * Goal 10. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 13. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 14. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   */

  @Test(timeout = 1001000)
  public void test6()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      UserRoles userRoles1 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles2 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToEditRoleAnonymousPage(userRoles0, userRoles2);
      classUnderTestApogen0.goToAnonymousEditRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
  }

  //Test case number: 7
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 2. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 3. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 5. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 6. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 7. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 8. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 9. main.ClassUnderTestApogen.okDeleteWidgetPage()V: Line 556
   */

  @Test(timeout = 1001000)
  public void test7()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      int int0 = 338;
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.okDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
  }
}
