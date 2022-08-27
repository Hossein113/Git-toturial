package maktab74.security;

import maktab74.base.domain.BaseEntity;
import maktab74.domain.Company;

public class CompanySecurity extends BaseEntity<Long> {

    private Company curentCompany;

    public CompanySecurity() {
        this.curentCompany = curentCompany;
    }

    public Company getCurentCompany() {
        return curentCompany;
    }

    public void setCurentCompany(Company curentCompany) {
        this.curentCompany = curentCompany;
    }

    public void logout() {
        this.curentCompany = null;
    }

    @Override
    public String toString() {
        return
                "curentCompany=" + curentCompany;

    }
}
