package phamtanphat.ptp.khoaphamtraining.apptodolist02072019.respository.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import phamtanphat.ptp.khoaphamtraining.apptodolist02072019.api.modelapi.Loginresponse;
import phamtanphat.ptp.khoaphamtraining.apptodolist02072019.respository.Loginrespository;

public class loginviewmodel extends ViewModel {
    public loginviewmodel() {
    }

    public MutableLiveData<Loginresponse> checkLogin(String username,String password){
        return Loginrespository.getInstance().getDataLogin(username,password);
    }
}
