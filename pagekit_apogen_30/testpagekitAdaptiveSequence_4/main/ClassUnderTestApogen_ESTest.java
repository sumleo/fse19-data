/*
 * This file was automatically generated by EvoSuite
 * Fri Feb 28 19:42:36 GMT 2020
 */

package main;

import org.junit.Test;
import static org.junit.Assert.*;
import custom_classes.Email;
import custom_classes.Id;
import custom_classes.Name;
import custom_classes.UserPassword;
import custom_classes.UserRoles;
import custom_classes.Username;
import main.ClassUnderTestApogen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, resetStaticState = true) 
public class ClassUnderTestApogen_ESTest extends ClassUnderTestApogen_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 20 covered goals:
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
   * Goal 11. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 12. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 13. main.ClassUnderTestApogen.goToDashboardDashBoardMenuPage()V: Line 337
   * Goal 14. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 15. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 16. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 17. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 18. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 19. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   * Goal 20. main.ClassUnderTestApogen.user_editEditUserPage(Lcustom_classes/Username;Lcustom_classes/Name;Lcustom_classes/Email;Lcustom_classes/UserPassword;)V: Line 88
   */

  @Test(timeout = 1001000)
  public void test0()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      int int0 = (-208);
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.SYSTEM_ADMIN;
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.deleteUserRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.deleteRoleDeleteRolePage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToDashboardDashBoardMenuPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      Username username0 = Username.FOO;
      Name name0 = Name.JOHN;
      Email email0 = Email.FOO;
      UserPassword userPassword0 = UserPassword.ADMIN;
      classUnderTestApogen0.user_editEditUserPage(username0, name0, email0, userPassword0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * Goal 1. main.ClassUnderTestApogen.add_userUsersPage()V: Line 569
   * Goal 2. main.ClassUnderTestApogen.cancelAddRolePage()V: Line 680
   * Goal 3. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 4. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 6. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousPermissionsPage()V: Line 295
   * Goal 8. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 9. main.ClassUnderTestApogen.goToEditUsersPage(Lcustom_classes/Id;)V: Line 600
   * Goal 10. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 11. main.ClassUnderTestApogen.goToPermissionsEditUserPage()V: Line 28
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsPermissionsPage()V: Line 309
   * Goal 13. main.ClassUnderTestApogen.goToUserAddUserPage()V: Line 267
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   */

  @Test(timeout = 1001000)
  public void test1()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      int int0 = 1524;
      Id id0 = new Id(int0);
      classUnderTestApogen0.goToEditUsersPage(id0);
      classUnderTestApogen0.goToPermissionsEditUserPage();
      classUnderTestApogen0.goToPermissionsPermissionsPage();
      classUnderTestApogen0.goToAnonymousPermissionsPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.cancelAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.add_userUsersPage();
      classUnderTestApogen0.goToUserAddUserPage();
  }

  //Test case number: 2
  /*
   * 15 covered goals:
   * Goal 1. main.ClassUnderTestApogen.addRoleAddRolePage()V: Line 665
   * Goal 2. main.ClassUnderTestApogen.cancelDeleteWidgetPage()V: Line 542
   * Goal 3. main.ClassUnderTestApogen.deletePagekitDashboardPage(Lcustom_classes/Id;)V: Line 113
   * Goal 4. main.ClassUnderTestApogen.goToAddRoleAnonymousPage(Lcustom_classes/UserRoles;)V: Line 389
   * Goal 5. main.ClassUnderTestApogen.goToAdministratorAdministratorPage()V: Line 482
   * Goal 6. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 7. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 8. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 9. main.ClassUnderTestApogen.goToDashBoardMenuDashboardPage()V: Line 131
   * Goal 10. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 11. main.ClassUnderTestApogen.goToHomeAnonymousPage()V: Line 449
   * Goal 12. main.ClassUnderTestApogen.goToPermissionsUsersPage()V: Line 618
   * Goal 13. main.ClassUnderTestApogen.goToUserEditUserPage()V: Line 56
   * Goal 14. main.ClassUnderTestApogen.goToUsersDashBoardMenuPage()V: Line 351
   * Goal 15. main.ClassUnderTestApogen.goToUsersPermissionsPage()V: Line 323
   */

  @Test(timeout = 1001000)
  public void test2()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      int int0 = (-1075);
      Id id0 = new Id(int0);
      classUnderTestApogen0.deletePagekitDashboardPage(id0);
      classUnderTestApogen0.cancelDeleteWidgetPage();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUserEditUserPage();
      classUnderTestApogen0.goToPermissionsUsersPage();
      classUnderTestApogen0.goToUsersPermissionsPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      UserRoles userRoles0 = UserRoles.PUBLIC_USER;
      classUnderTestApogen0.goToAddRoleAnonymousPage(userRoles0);
      classUnderTestApogen0.addRoleAddRolePage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAdministratorAdministratorPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
      classUnderTestApogen0.goToHomeAnonymousPage();
      classUnderTestApogen0.goToDashBoardMenuDashboardPage();
      classUnderTestApogen0.goToUsersDashBoardMenuPage();
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * Goal 1. main.ClassUnderTestApogen.goToAdministratorAnonymousPage()V: Line 407
   * Goal 2. main.ClassUnderTestApogen.goToAnonymousAdministratorPage()V: Line 496
   * Goal 3. main.ClassUnderTestApogen.goToAnonymousUsersPage()V: Line 583
   * Goal 4. main.ClassUnderTestApogen.goToEditUserDashboardPage()V: Line 195
   * Goal 5. main.ClassUnderTestApogen.goToUsersEditUserPage()V: Line 70
   */

  @Test(timeout = 1001000)
  public void test3()  throws Throwable  {
      ClassUnderTestApogen classUnderTestApogen0 = new ClassUnderTestApogen();
      classUnderTestApogen0.goToEditUserDashboardPage();
      classUnderTestApogen0.goToUsersEditUserPage();
      classUnderTestApogen0.goToAnonymousUsersPage();
      classUnderTestApogen0.goToAdministratorAnonymousPage();
      classUnderTestApogen0.goToAnonymousAdministratorPage();
  }
}
