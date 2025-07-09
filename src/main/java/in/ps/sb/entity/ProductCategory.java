package in.ps.sb.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public enum ProductCategory {

	ELECTRONICS(1, List.of("Gadgets", "Devices", "Accessories")), 
	CLOTHES(2, List.of("Men", "Women", "Kids"));

	// BEAUTY, HOUSEHOLD, HYGIENE, FOOTWEARS, PERFUMES, FURNITURE;
	//above categories are to be finetuned and added later

	@Id
	private final int categoryId;
	private final List<String> categories;

	/*
	 * ProductCategory(int categoryId, List<String> categories) { this.categoryId =
	 * categoryId; this.categories = categories; }
	 */

	public int getCategoryId() {
		return categoryId;
	}

	public List<String> getCategories() {
		return categories;
	}

}
