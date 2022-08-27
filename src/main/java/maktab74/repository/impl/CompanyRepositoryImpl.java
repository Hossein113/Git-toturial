package maktab74.repository.impl;

import maktab74.base.repository.impl.BaseRepositoryImple;
import maktab74.domain.Company;
import maktab74.repository.CompanyRepository;

import javax.persistence.EntityManager;

public class CompanyRepositoryImpl extends BaseRepositoryImple<Company, Long> implements CompanyRepository {
    public CompanyRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Company> getEntityClass() {
        return Company.class;
    }

}
