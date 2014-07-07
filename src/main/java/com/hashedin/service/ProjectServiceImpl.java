package com.hashedin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.Project;
import com.hashedin.repository.ProjectRepository;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;


    public Project find(Long projectId)
    {
        // Returns the Task for given taskId.
        return projectRepository.find(projectId);
    }


    @Transactional
    public Project save(Project project)
    {
        // Saves the given task object and returns the same.
    	projectRepository.save(project);
        return project;
    }


    @Override
    public List<Project> findAll()
    {
        // Returns all the tasks in our system.
        return projectRepository.findAll();
    }


    @Override
    public Project update(Project project, Long projectId)
    {
        // Updates the task with the given taskId;
        return null;
    }


    @Transactional
    public Project delete(Long projectId)
    {
        // Deletes the task with the give taskId and returns the same.
        return projectRepository.delete(projectId);
    }
	
}
