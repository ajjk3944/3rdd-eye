package androidx.media3.extractor.metadata.flac;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.f0;
import c7.a;
import cc.a0;

@Deprecated
/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a0(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f1960a;

    /* renamed from: d, reason: collision with root package name */
    public final String f1961d;

    public VorbisComment(String str, String str2) {
        this.f1960a = str;
        this.f1961d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f1960a.equals(vorbisComment.f1960a) && this.f1961d.equals(vorbisComment.f1961d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1961d.hashCode() + a.g(this.f1960a, 527, 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public final void k(f0 f0Var) {
        String str = this.f1960a;
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c4 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c4 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c4 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        String str2 = this.f1961d;
        switch (c4) {
            case 0:
                f0Var.f1627c = str2;
                break;
            case 1:
                f0Var.f1625a = str2;
                break;
            case 2:
                f0Var.f1631g = str2;
                break;
            case 3:
                f0Var.f1628d = str2;
                break;
            case 4:
                f0Var.f1626b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.f1960a + "=" + this.f1961d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1960a);
        parcel.writeString(this.f1961d);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i10 = d0.f105a;
        this.f1960a = string;
        this.f1961d = parcel.readString();
    }
}
