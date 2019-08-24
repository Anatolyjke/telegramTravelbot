package by.telegrambot.webservice.entity;


import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, exclude = {"cityInfo"})
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"name"})
@Entity
@Table(name = "city")
public class City extends BaseEntity<Long> {

    private static final long serialVersionUID = -3723496888477359242L;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CityInfo> cityInfo;
}