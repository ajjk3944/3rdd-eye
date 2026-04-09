package androidx.media3.extractor.metadata.emsg;

import a5.d0;
import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.q;
import androidx.media3.common.r;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final r B;
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final r D;

    /* renamed from: a, reason: collision with root package name */
    public final String f1948a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1949d;

    /* renamed from: g, reason: collision with root package name */
    public final long f1950g;

    /* renamed from: r, reason: collision with root package name */
    public final long f1951r;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f1952x;

    /* renamed from: y, reason: collision with root package name */
    public int f1953y;

    static {
        q qVar = new q();
        qVar.k = "application/id3";
        B = new r(qVar);
        q qVar2 = new q();
        qVar2.k = "application/x-scte35";
        D = new r(qVar2);
        CREATOR = new l(20);
    }

    public EventMessage(String str, String str2, long j, long j7, byte[] bArr) {
        this.f1948a = str;
        this.f1949d = str2;
        this.f1950g = j;
        this.f1951r = j7;
        this.f1952x = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final r a() {
        String str = this.f1948a;
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

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] b() {
        if (a() != null) {
            return this.f1952x;
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
            if (this.f1950g == eventMessage.f1950g && this.f1951r == eventMessage.f1951r && d0.a(this.f1948a, eventMessage.f1948a) && d0.a(this.f1949d, eventMessage.f1949d) && Arrays.equals(this.f1952x, eventMessage.f1952x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1953y == 0) {
            String str = this.f1948a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f1949d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f1950g;
            int i10 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j7 = this.f1951r;
            this.f1953y = Arrays.hashCode(this.f1952x) + ((i10 + ((int) (j7 ^ (j7 >>> 32)))) * 31);
        }
        return this.f1953y;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f1948a + ", id=" + this.f1951r + ", durationMs=" + this.f1950g + ", value=" + this.f1949d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1948a);
        parcel.writeString(this.f1949d);
        parcel.writeLong(this.f1950g);
        parcel.writeLong(this.f1951r);
        parcel.writeByteArray(this.f1952x);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1948a = string;
        this.f1949d = parcel.readString();
        this.f1950g = parcel.readLong();
        this.f1951r = parcel.readLong();
        this.f1952x = parcel.createByteArray();
    }
}
