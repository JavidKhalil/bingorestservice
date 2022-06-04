package com.nebidesign.restfirst.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "randomnumbersdomain", catalog = "randomnum")
public class RandomNumbersDomain {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date createdDate;
    private Date generatedDate;

    @ElementCollection
    private List<Integer> winnerNumbers;

    public RandomNumbersDomain(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }

    public Date getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(Date generatedDate) {
        this.generatedDate = generatedDate;
    }

    public void setWinnerNumbers(List<Integer> winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }
}
