/**
 * 
 */
package IOGeocacheing.services;

import java.util.List;

import org.springframework.stereotype.Component;

import IOGeocacheing.POJO.Challange;
import IOGeocacheing.POJO.Credentials;
import IOGeocacheing.POJO.Profile;
import IOGeocacheing.services.IDao;

/**
 * @author nuddler
 *
 */
@Component
public class MockDao implements IDao {

    /* (non-Javadoc)
     * @see services.IDao#loginAdmin(POJO.Credentials)
     */
    @Override
    public boolean loginAdmin(Credentials credentials) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see services.IDao#confirmChallange(int, POJO.Credentials)
     */
    @Override
    public boolean confirmChallange(int id, Credentials credentials) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see services.IDao#showChallanges()
     */
    @Override
    public List<Challange> showChallanges() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see services.IDao#showChallangeDetails(int)
     */
    @Override
    public Challange showChallangeDetails(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see services.IDao#removeChallange(int, POJO.Credentials)
     */
    @Override
    public boolean removeChallange(int id, Credentials credentials) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see services.IDao#showProfiles(POJO.Credentials)
     */
    @Override
    public List<Profile> showProfiles(Credentials credentials) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see services.IDao#showProfileDetails(int, POJO.Credentials)
     */
    @Override
    public Profile showProfileDetails(int id, Credentials credentials) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see services.IDao#removeProfile(int, POJO.Credentials)
     */
    @Override
    public boolean removeProfile(int id, Credentials credentials) {
        // TODO Auto-generated method stub
        return false;
    }

}
