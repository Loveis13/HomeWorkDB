package ru.hogwards.school.Service;


import org.springframework.web.multipart.MultipartFile;
import ru.hogwards.school.model.Avatar;

import java.io.IOException;

public interface AvatarService  {
    void uploadAvatar( Long studentId,  MultipartFile avatar) throws IOException;
    Avatar findAvatar(Long id);
}
