package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f15214a;

    /* renamed from: b, reason: collision with root package name */
    private long f15215b;

    /* renamed from: c, reason: collision with root package name */
    private String f15216c;

    public class a implements Parcelable.Creator<BatchReportMessage> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    }

    public BatchReportMessage(String str, String str2, long j10) {
        this.f15216c = str;
        this.f15214a = str2;
        this.f15215b = j10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f15214a;
    }

    public long getTimestamp() {
        return this.f15215b;
    }

    public String getUuid() {
        return this.f15216c;
    }

    public void setReportMessage(String str) {
        this.f15214a = str;
    }

    public void setTimestamp(long j10) {
        this.f15215b = j10;
    }

    public void setUuid(String str) {
        this.f15216c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15216c);
        parcel.writeString(this.f15214a);
        parcel.writeLong(this.f15215b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f15216c = parcel.readString();
        this.f15214a = parcel.readString();
        this.f15215b = parcel.readLong();
    }
}
