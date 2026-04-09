package com.mbridge.msdk.config.component.load.downloader;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f13373a;

    /* renamed from: b, reason: collision with root package name */
    private int f13374b;

    /* renamed from: c, reason: collision with root package name */
    private long f13375c;

    public class a implements Parcelable.Creator<DownloadProgress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadProgress[] newArray(int i10) {
            return new DownloadProgress[i10];
        }
    }

    public DownloadProgress(long j10, long j11, int i10) {
        this.f13373a = j10;
        this.f13375c = j11;
        this.f13374b = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.f13373a;
    }

    public int getCurrentDownloadRate() {
        return this.f13374b;
    }

    public long getTotal() {
        return this.f13375c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f13373a);
        parcel.writeLong(this.f13375c);
        parcel.writeInt(this.f13374b);
    }

    public DownloadProgress(Parcel parcel) {
        this.f13373a = parcel.readLong();
        this.f13375c = parcel.readLong();
        this.f13374b = parcel.readInt();
    }
}
