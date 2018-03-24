package test.group;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class GroupTesting {
	List<Person> persons = new LinkedList<>();

	@Before
	public void setup() {
		persons.add(new Person("Nokia", "Janne", "Luukkonen", new BigDecimal(2300)));
		persons.add(new Person("Nokia", "James", "Händikäp", new BigDecimal(500)));
		persons.add(new Person("Nokia", "Fiilus", "Mack", new BigDecimal(4500)));
		persons.add(new Person("Lumosit", "FP-Brown", "Black", new BigDecimal(7700)));
		persons.add(new Person("Lumosit", "FP-Cheese", "Black", new BigDecimal(4700)));
		persons.add(new Person("Sommerby", "Apple", "Sider", new BigDecimal(1700)));
		persons.add(new Person("Sommerby", "DIlli", "Dalli", new BigDecimal(3700)));
		persons.add(new Person("Dingo", "Band", "Of heaven", new BigDecimal(11700)));
	}

	@Test
	public void shouldReturnUsersGrouped() {

		Map<String, List<Person>> groupedByCompany = getGroupedByCompany(persons);
		assertThat(groupedByCompany).hasSize(3);
		assertThat(groupedByCompany.get("Nokia")).hasSize(3);
		assertThat(groupedByCompany.get("Lumosit")).hasSize(2);
		assertThat(groupedByCompany.get("Sommerby")).hasSize(2);
		assertThat(groupedByCompany.get("Dingo")).hasSize(1);
	}

	@Test
	public void shouldReturnPersonWithBiggestMonthlySalary() {
		assertThat(getBiggestSalary("Nokia", persons).getMontlySalary()).isEqualTo(new BigDecimal(4500));
		assertThat(getBiggestSalary("Nokia", persons).getFirstName()).isEqualTo("Fiilus");
	}

	@Test
	public void shouldDifferenceBetweenHighestAndLowestSalary() {
		assertThat(getDifferenceBetweenHighLowSalary(persons)).isEqualTo(new BigDecimal(11200));
	}

	@Test
	public void shouldReturnAverageSalariesOrderedByCompany() {
		List<CompanyAverage> averages = getCompanyAverages(persons);
		assertThat(averages).extracting("companyName").containsExactly("Dingo", "Lumosit", "Sommerby", "Nokia");
		assertThat(averages.get(0)).isEqualTo(new BigDecimal(11700));
		assertThat(averages.get(1)).isEqualTo(new BigDecimal(6200));
		assertThat(averages.get(2)).isEqualTo(new BigDecimal(2700));
		assertThat(averages.get(3)).isEqualTo(new BigDecimal(2433.33));
	}

	private BigDecimal getDifferenceBetweenHighLowSalary(List<Person> persons2) {
		// TODO Auto-generated method stub
		return null;
	}

	private List<CompanyAverage> getCompanyAverages(List<Person> persons2) {
		// TODO Auto-generated method stub
		return null;
	}

	private Person getBiggestSalary(String string, List<Person> persons2) {
		// TODO Auto-generated method stub
		return null;
	}

	private Map<String, List<Person>> getGroupedByCompany(List<Person> persons2) {
		// TODO Auto-generated method stub
		return null;
	}

}
