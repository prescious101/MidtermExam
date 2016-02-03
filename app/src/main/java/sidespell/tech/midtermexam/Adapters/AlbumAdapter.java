package sidespell.tech.midtermexam.Adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

import sidespell.tech.midtermexam.entities.Album;

/**
 * Created by BSIT on 2/2/2016.
 */
public class AlbumAdapter extends ArrayAdapter<Album> {

    private Context mContext;
    private int mLayoutId;
    private List<Album> mAlbums;


    public AlbumAdapter(Context context, int resource, List<Album> albums) {
        super(context, resource, albums);

        mContext = context;
        mLayoutId = resource;
        mAlbums =   albums;


    }








}
