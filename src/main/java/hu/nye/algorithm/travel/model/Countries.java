package hu.nye.algorithm.travel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "countries")
public class Countries {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private int country_id;

  @Column
  private String country_name;

  @Column
  private int region_id;

  @Column
  private int settlement_number;

  @Column
  private int airport_number;

  @Column
  private int train_station_number;

  @Column
  private int bus_station_number;

  @Column
  private int ship_station_number;
}
