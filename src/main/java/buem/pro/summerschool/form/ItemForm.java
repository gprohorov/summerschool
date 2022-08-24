package buem.pro.summerschool.form;
/*
  @author   george
  @project   summerschool
  @class  ItemForm
  @version  1.0.0 
  @since 16.08.22 - 12.07
*/

import buem.pro.summerschool.model.ItemType;

import java.time.LocalDateTime;

public class ItemForm {
    private String id;
    private String name;
    private ItemType type;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ItemForm() {
    }

    public ItemForm(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ItemForm(String name, ItemType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public ItemForm(String id, String name, ItemType type, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ItemForm(String id, String name, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ItemForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
