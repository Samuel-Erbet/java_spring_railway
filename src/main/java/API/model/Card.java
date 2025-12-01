package API.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    // tabela que representa os dados de um cartão

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //numero unico
    @Column(unique = true)
    private String number;

    @Column(name = "card_limit", scale = 13, precision = 2)
    private BigDecimal limit;


    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
