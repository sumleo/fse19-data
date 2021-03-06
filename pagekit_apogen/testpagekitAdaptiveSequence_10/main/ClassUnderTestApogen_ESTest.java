/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 26 21:19:32 GMT 2020
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
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 3. main.ClassUnderTestApogen.deleteRoleDeleteRolePage()V: Line 633
   * Goal 4. main.ClassUnderTestApogen.deleteUserRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 369
   * Goal 5. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 6. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 7. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 9. main.ClassUnderTestApogen.goToAnonymousDeleteRolePage()V: Line 648
   * Goal 10. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 11. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 12. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 14. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 15. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 16. main.ClassUnderTestApogen.okDeleteWidgetPage()V: Line 556
   * Goal 17. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 542;
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.okDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.ADMIN;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.goToAnonymousDeleteRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles1 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles1);
      classUnderTestApogen0.deleteRoleDeleteRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
  }

  //Test case number: 1
  /*
   * 17 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 217
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 5. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 6. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 7. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 8. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 9. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 10. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 12. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 13. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 14. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 15. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 16. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 17. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1677;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LASTREGISTERED;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.THUMBNAIL;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.HIDE;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.TWENTYFOUR;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.ADMIN;
      Name name0 = Name.MARK;
      Email email0 = Email.ASD;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.BLOCKED;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToRolesAddUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 220
   * Goal 2. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 3. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 8. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 9. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 10. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 11. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 12. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 14. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 15. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 16. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 17. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 18. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 19. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-954);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LASTREGISTERED;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.HIDE;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.EIGHTEEN;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.BLOCKED;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
  }

  //Test case number: 3
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 3. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 7. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 8. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 13. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 15. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 16. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-1056);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LOGGEDIN;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.SHOW;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.EIGHTEEN;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserDisplay widgetUserDisplay1 = WidgetUserDisplay.THUMBNAIL;
      WidgetTotalUser widgetTotalUser1 = WidgetTotalUser.SHOW;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay1, widgetTotalUser1, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetTotalUser widgetTotalUser2 = WidgetTotalUser.HIDE;
      WidgetNumberOfUsers widgetNumberOfUsers1 = WidgetNumberOfUsers.TWENTYFOUR;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay1, widgetTotalUser2, widgetNumberOfUsers1);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType1 = WidgetUserType.LASTREGISTERED;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType1, widgetUserDisplay1, widgetTotalUser0, widgetNumberOfUsers1);
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.ASD;
      UserPassword userPassword0 = UserPassword.FOO;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
  }

  //Test case number: 4
  /*
   * 9 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.cancelDeleteWidgetPage()V: Line 542
   * Goal 3. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 8. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 9. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   */

  @Test(timeout = 1001000)
  public void test4()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = 1283;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
  }

  //Test case number: 5
  /*
   * 18 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.formEditLocationPage(Lcustom_classes/WidgetLocation;Lcustom_classes/WidgetUnit;)V: Line 695
   * Goal 3. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 6. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 7. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 8. main.ClassUnderTestApogen.goToEditComponentLocationDashboardPage(Lcustom_classes/Id;)V: Line 152
   * Goal 9. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 10. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 14. main.ClassUnderTestApogen.goToRolesAddUserPage()V: Line 253
   * Goal 15. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 16. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 17. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 18. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test5()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      int int0 = 2352;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToRolesAddUserPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      WidgetUnit widgetUnit0 = WidgetUnit.METRIC;
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      Id id1 = new Id(id0.value);
      classUnderTestApogen0.goToEditComponentLocationDashboardPage(id1);
      WidgetLocation widgetLocation0 = WidgetLocation.MILANO;
      classUnderTestApogen0.formEditLocationPage(widgetLocation0, widgetUnit0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
  }
}
