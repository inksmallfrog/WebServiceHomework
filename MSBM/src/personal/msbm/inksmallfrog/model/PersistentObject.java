package personal.msbm.inksmallfrog.model;

import java.io.Serializable;

/**
 * Created by inksmallfrog on 2016/10/26.
 */
public interface PersistentObject extends Serializable {
    void setId(Integer id);
}
