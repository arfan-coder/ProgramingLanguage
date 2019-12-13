package com.example.programinglanguage;

import android.os.Parcel;
import android.os.Parcelable;

public class ProgramingLanguage implements Parcelable {
    private String programName, programDetail;
    private Integer programingPhoto;

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramDetail() {
        return programDetail;
    }

    public void setProgramDetail(String programDetail) {
        this.programDetail = programDetail;
    }

    public Integer getProgramingPhoto() {
        return programingPhoto;
    }

    public void setProgramingPhoto(Integer programingPhoto) {
        this.programingPhoto = programingPhoto;
    }

    public ProgramingLanguage() {

    }

    public ProgramingLanguage(String programName, String programDetail, Integer programingPhoto) {
        this.programName = programName;
        this.programDetail = programDetail;
        this.programingPhoto = programingPhoto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.programName);
        dest.writeString(this.programDetail);
        dest.writeValue(this.programingPhoto);
    }

    protected ProgramingLanguage(Parcel in) {
        this.programName = in.readString();
        this.programDetail = in.readString();
        this.programingPhoto = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<ProgramingLanguage> CREATOR = new Parcelable.Creator<ProgramingLanguage>() {
        @Override
        public ProgramingLanguage createFromParcel(Parcel source) {
            return new ProgramingLanguage(source);
        }

        @Override
        public ProgramingLanguage[] newArray(int size) {
            return new ProgramingLanguage[size];
        }
    };
}
