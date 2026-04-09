package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o0;
import i6.a;
import qb.v;

/* loaded from: classes.dex */
public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f4256a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4257d;

    public VorbisComment(String str, String str2) {
        this.f4256a = str;
        this.f4257d = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void c(o0 o0Var) {
        String str = this.f4256a;
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
        String str2 = this.f4257d;
        switch (c4) {
            case 0:
                o0Var.f4345c = str2;
                break;
            case 1:
                o0Var.f4343a = str2;
                break;
            case 2:
                o0Var.f4347e = str2;
                break;
            case 3:
                o0Var.f4346d = str2;
                break;
            case 4:
                o0Var.f4344b = str2;
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && VorbisComment.class == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.f4256a.equals(vorbisComment.f4256a) && this.f4257d.equals(vorbisComment.f4257d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4257d.hashCode() + c7.a.g(this.f4256a, 527, 31);
    }

    public final String toString() {
        String str = this.f4256a;
        int iD = c7.a.d(5, str);
        String str2 = this.f4257d;
        StringBuilder sb2 = new StringBuilder(c7.a.d(iD, str2));
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4256a);
        parcel.writeString(this.f4257d);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i10 = v.f20828a;
        this.f4256a = string;
        this.f4257d = parcel.readString();
    }
}
