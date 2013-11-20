package de.fhb.mi.paperfly.friends;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import de.fhb.mi.paperfly.PaperFlyApp;
import de.fhb.mi.paperfly.R;

/**
 * @author Andy Klay    klay@fh-brandenburg.de
 */
public class FriendsFragment extends Fragment {

    public static final String TAG = "FriendsFragment";

    private View rootView;
    private ListView friendsList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        this.rootView = inflater.inflate(R.layout.fragment_friends, container, false);
        initViewsById();

        return rootView;
    }

    private void initViewsById() {



    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "onAttach");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

        //TODO
//        List<String> chatList;
  //      if (globalRoom) {
    //        chatList = ((PaperFlyApp) getActivity().getApplication()).getChatGlobal();
      //  } else {
        //    chatList = ((PaperFlyApp) getActivity().getApplication()).getChatRoom();
       // }
       // messagesAdapter = new ArrayAdapter<String>(rootView.getContext(), android.R.layout.simple_list_item_1, chatList);
       // messagesList.setAdapter(messagesAdapter);
       // messageInput.requestFocus();
    }

}