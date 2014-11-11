package IOGeocacheing.services;

import java.util.List;

import IOGeocacheing.POJO.Challange;
import IOGeocacheing.POJO.Credentials;
import IOGeocacheing.POJO.Profile;

public interface IDao {

    public boolean loginAdmin(Credentials credentials);
    
    public boolean confirmChallange(int id, Credentials credentials);
    
    public List<Challange> showChallanges();
    
    public Challange showChallangeDetails(int id);
    
    public boolean removeChallange(int id, Credentials credentials);
    
    public List<Profile> showProfiles(Credentials credentials);
    
    public Profile showProfileDetails(int id, Credentials credentials);
    
    public boolean removeProfile(int id, Credentials credentials);

}
