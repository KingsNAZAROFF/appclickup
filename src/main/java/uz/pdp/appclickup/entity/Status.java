package uz.pdp.appclickup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickup.entity.enums.Type;
import uz.pdp.appclickup.entity.template.AbsLongEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Space space;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Category category;

    @Column(nullable = false)
    private String color;

    @Enumerated(EnumType.STRING)
    private Type type;

}
