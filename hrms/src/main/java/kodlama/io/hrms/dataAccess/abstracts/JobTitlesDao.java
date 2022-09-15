package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer> {

}
