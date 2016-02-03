package sidespell.tech.midtermexam.entities;

import android.graphics.Bitmap;

/**
 * Created by BSIT on 2/2/2016.
 */
public class Album {


    private String mSongName;
    private String mSinger;
    private String mYear;
    private String mGenre;
    private String mBandName;
    private Bitmap mAlbumImage;

    public String getmSongName() {
        return mSongName;
    }

    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public String getmSinger() {
        return mSinger;
    }

    public void setmSinger(String mSinger) {
        this.mSinger = mSinger;
    }

    public String getmYear() {
        return mYear;
    }

    public void setmYear(String mYear) {
        this.mYear = mYear;
    }

    public String getmGenre() {
        return mGenre;
    }

    public void setmGenre(String mGenre) {
        this.mGenre = mGenre;
    }

    public String getmBandName() {
        return mBandName;
    }

    public void setmBandName(String mBandName) {
        this.mBandName = mBandName;
    }

    public Bitmap getmAlbumImage() {
        return mAlbumImage;
    }

    public void setmAlbumImage(Bitmap mAlbumImage) {
        this.mAlbumImage = mAlbumImage;
    }
}
