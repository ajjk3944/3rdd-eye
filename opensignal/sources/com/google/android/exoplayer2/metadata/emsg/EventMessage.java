package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.Metadata;
import i6.a;
import java.util.Arrays;
import qb.v;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Format B;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final Format D;

    /* renamed from: a, reason: collision with root package name */
    public final String f4244a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4245d;

    /* renamed from: g, reason: collision with root package name */
    public final long f4246g;

    /* renamed from: r, reason: collision with root package name */
    public final long f4247r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f4248x;

    /* renamed from: y, reason: collision with root package name */
    public int f4249y;

    static {
        g0 g0Var = new g0();
        g0Var.k = "application/id3";
        B = new Format(g0Var);
        g0 g0Var2 = new g0();
        g0Var2.k = "application/x-scte35";
        D = new Format(g0Var2);
        CREATOR = new a(16);
    }

    public EventMessage(String str, String str2, long j, long j7, byte[] bArr) {
        this.f4244a = str;
        this.f4245d = str2;
        this.f4246g = j;
        this.f4247r = j7;
        this.f4248x = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final Format a() {
        String str = this.f4244a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return D;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return B;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] b() {
        if (a() != null) {
            return this.f4248x;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f4246g == eventMessage.f4246g && this.f4247r == eventMessage.f4247r && v.a(this.f4244a, eventMessage.f4244a) && v.a(this.f4245d, eventMessage.f4245d) && Arrays.equals(this.f4248x, eventMessage.f4248x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4249y == 0) {
            String str = this.f4244a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4245d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f4246g;
            int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j7 = this.f4247r;
            this.f4249y = Arrays.hashCode(this.f4248x) + ((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
        }
        return this.f4249y;
    }

    public final String toString() {
        String str = this.f4244a;
        int iD = c7.a.d(79, str);
        String str2 = this.f4245d;
        StringBuilder sb2 = new StringBuilder(c7.a.d(iD, str2));
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(this.f4247r);
        sb2.append(", durationMs=");
        sb2.append(this.f4246g);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4244a);
        parcel.writeString(this.f4245d);
        parcel.writeLong(this.f4246g);
        parcel.writeLong(this.f4247r);
        parcel.writeByteArray(this.f4248x);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4244a = string;
        this.f4245d = parcel.readString();
        this.f4246g = parcel.readLong();
        this.f4247r = parcel.readLong();
        this.f4248x = parcel.createByteArray();
    }
}
