/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 28 23:02:56 GMT 2020
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
import custom_classes.WidgetNumberOfUsers;
import custom_classes.WidgetTotalUser;
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
   * Goal 2. main.ClassUnderTestApogen.addUserAddUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;Lcustom_classes/UserStatus;)V: Line 217
   * Goal 3. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 4. main.ClassUnderTestApogen.formEditRegisteredUserPage(Lcustom_classes/WidgetUserType;Lcustom_classes/WidgetUserDisplay;Lcustom_classes/WidgetTotalUser;Lcustom_classes/WidgetNumberOfUsers;)V: Line 468
   * Goal 5. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 8. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 9. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 10. main.ClassUnderTestApogen.goToEditRegisteredUserDashboardPage(Lcustom_classes/Id;)V: Line 177
   * Goal 11. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 12. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 13. main.ClassUnderTestApogen.goToPermissionsAddUserPage()V: Line 239
   * Goal 14. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 15. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 16. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 17. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 18. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 19. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      int int0 = (-870);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType0 = WidgetUserType.LOGGEDIN;
      WidgetUserDisplay widgetUserDisplay0 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser0 = WidgetTotalUser.SHOW;
      WidgetNumberOfUsers widgetNumberOfUsers0 = WidgetNumberOfUsers.TWENTYFOUR;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      Username username0 = Username.ADMIN;
      Name name0 = Name.JOHN;
      Email email0 = Email.ASD;
      UserPassword userPassword0 = UserPassword.FOO;
      UserStatus userStatus0 = UserStatus.ACTIVE;
      classUnderTestApogen0.addUserAddUserPage(username0, name0, email0, userPassword0, userStatus0);
      classUnderTestApogen0.goToUsersAddUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType0, widgetUserDisplay0, widgetTotalUser0, widgetNumberOfUsers0);
      classUnderTestApogen0.goToEditRegisteredUserDashboardPage(id0);
      WidgetUserType widgetUserType1 = WidgetUserType.LOGGEDIN;
      WidgetUserDisplay widgetUserDisplay1 = WidgetUserDisplay.LIST;
      WidgetTotalUser widgetTotalUser1 = WidgetTotalUser.SHOW;
      WidgetNumberOfUsers widgetNumberOfUsers1 = WidgetNumberOfUsers.TWELVE;
      classUnderTestApogen0.formEditRegisteredUserPage(widgetUserType1, widgetUserDisplay1, widgetTotalUser1, widgetNumberOfUsers1);
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToPermissionsAddUserPage();
  }

  //Test case number: 1
  /*
   * 16 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 3. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 4. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 5. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 6. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 7. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 8. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 9. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 10. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 12. main.ClassUnderTestApogen.goToRolesEditUserPage()V: Line 42
   * Goal 13. main.ClassUnderTestApogen.goToUsersAddUserPage()V: Line 281
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 15. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   * Goal 16. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToRolesEditUserPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUsersAddUserPage();
  }
}
