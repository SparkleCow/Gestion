package Services.Persistance;

import Models.Instructor;
import Services.FileManagement.FileInstructorManagement;

import java.util.List;

public class InstructorServiceImp implements CrudService<Instructor>{
    private final FileInstructorManagement fileInstructorManagement = new FileInstructorManagement();
    @Override
    public void create(Instructor instructor) {

    }

    @Override
    public List<Instructor> findAll() {
        return null;
    }

    @Override
    public Instructor findById(String id) {
        return fileInstructorManagement.findInstructorById(id);
    }

    @Override
    public void update(Instructor instructor) {

    }

    @Override
    public void delete(Instructor instructor) {

    }
}
