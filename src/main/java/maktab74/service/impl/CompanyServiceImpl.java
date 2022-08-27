package maktab74.service.impl;

import maktab74.base.service.impl.BaseServiceImpl;
import maktab74.domain.Company;
import maktab74.repository.CompanyRepository;
import maktab74.service.CompanyService;


public class CompanyServiceImpl extends BaseServiceImpl<Company, Long, CompanyRepository> implements CompanyService {

    public CompanyServiceImpl(CompanyRepository repository) {
        super(repository);
    }


}

