package diary.services.exception;

import java.util.UUID;

import static java.lang.String.format;

/**
 * UserNotFoundException - Сущность не найдена
 */
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(Class clazz, UUID id) {
        super(format("Сущность не найдена '%s' '%s'", clazz.getName(), id.toString()));
    }
}
