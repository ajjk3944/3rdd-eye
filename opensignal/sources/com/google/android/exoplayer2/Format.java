package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new cc.a0(1);
    public final int B;
    public final int D;
    public final String E;
    public final Metadata F;
    public final String G;
    public final String H;
    public final int I;
    public final List J;
    public final DrmInitData K;
    public final long L;
    public final int M;
    public final int N;
    public final float O;
    public final int P;
    public final float Q;
    public final byte[] R;
    public final int S;
    public final ColorInfo T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final int Y;
    public final int Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f4020a;

    /* renamed from: a0, reason: collision with root package name */
    public final Class f4021a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f4022b0;

    /* renamed from: d, reason: collision with root package name */
    public final String f4023d;

    /* renamed from: g, reason: collision with root package name */
    public final String f4024g;

    /* renamed from: r, reason: collision with root package name */
    public final int f4025r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4026x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4027y;

    public Format(g0 g0Var) {
        this.f4020a = g0Var.f4142a;
        this.f4023d = g0Var.f4143b;
        this.f4024g = qb.v.C(g0Var.f4144c);
        this.f4025r = g0Var.f4145d;
        this.f4026x = g0Var.f4146e;
        int i10 = g0Var.f4147f;
        this.f4027y = i10;
        int i11 = g0Var.f4148g;
        this.B = i11;
        this.D = i11 != -1 ? i11 : i10;
        this.E = g0Var.f4149h;
        this.F = g0Var.f4150i;
        this.G = g0Var.j;
        this.H = g0Var.k;
        this.I = g0Var.f4151l;
        List list = g0Var.f4152m;
        this.J = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = g0Var.f4153n;
        this.K = drmInitData;
        this.L = g0Var.f4154o;
        this.M = g0Var.f4155p;
        this.N = g0Var.f4156q;
        this.O = g0Var.f4157r;
        int i12 = g0Var.f4158s;
        this.P = i12 == -1 ? 0 : i12;
        float f10 = g0Var.f4159t;
        this.Q = f10 == -1.0f ? 1.0f : f10;
        this.R = g0Var.f4160u;
        this.S = g0Var.f4161v;
        this.T = g0Var.f4162w;
        this.U = g0Var.f4163x;
        this.V = g0Var.f4164y;
        this.W = g0Var.f4165z;
        int i13 = g0Var.A;
        this.X = i13 == -1 ? 0 : i13;
        int i14 = g0Var.B;
        this.Y = i14 != -1 ? i14 : 0;
        this.Z = g0Var.C;
        Class cls = g0Var.D;
        if (cls != null || drmInitData == null) {
            this.f4021a0 = cls;
        } else {
            this.f4021a0 = ba.m.class;
        }
    }

    public static String f(Format format) {
        if (format == null) {
            return "null";
        }
        String str = format.f4023d;
        String str2 = format.f4024g;
        int i10 = format.V;
        int i11 = format.U;
        float f10 = format.O;
        int i12 = format.N;
        int i13 = format.M;
        DrmInitData drmInitData = format.K;
        String str3 = format.E;
        int i14 = format.D;
        StringBuilder sb2 = new StringBuilder("id=");
        sb2.append(format.f4020a);
        sb2.append(", mimeType=");
        sb2.append(format.H);
        if (i14 != -1) {
            sb2.append(", bitrate=");
            sb2.append(i14);
        }
        if (str3 != null) {
            sb2.append(", codecs=");
            sb2.append(str3);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i15 = 0; i15 < drmInitData.f4098r; i15++) {
                UUID uuid = drmInitData.f4095a[i15].f4100d;
                if (uuid.equals(h.f4167b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(h.f4168c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h.f4170e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h.f4169d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(h.f4166a)) {
                    linkedHashSet.add("universal");
                } else {
                    String strValueOf = String.valueOf(uuid);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 10);
                    sb3.append("unknown (");
                    sb3.append(strValueOf);
                    sb3.append(")");
                    linkedHashSet.add(sb3.toString());
                }
            }
            sb2.append(", drm=[");
            hf.y yVar = new hf.y(String.valueOf(','), 3);
            Iterator it = linkedHashSet.iterator();
            StringBuilder sb4 = new StringBuilder();
            yVar.c(sb4, it);
            sb2.append(sb4.toString());
            sb2.append(']');
        }
        if (i13 != -1 && i12 != -1) {
            sb2.append(", res=");
            sb2.append(i13);
            sb2.append("x");
            sb2.append(i12);
        }
        if (f10 != -1.0f) {
            sb2.append(", fps=");
            sb2.append(f10);
        }
        if (i11 != -1) {
            sb2.append(", channels=");
            sb2.append(i11);
        }
        if (i10 != -1) {
            sb2.append(", sample_rate=");
            sb2.append(i10);
        }
        if (str2 != null) {
            sb2.append(", language=");
            sb2.append(str2);
        }
        if (str != null) {
            sb2.append(", label=");
            sb2.append(str);
        }
        if ((format.f4026x & 16384) != 0) {
            sb2.append(", trick-play-track");
        }
        return sb2.toString();
    }

    public final g0 d() {
        g0 g0Var = new g0();
        g0Var.f4142a = this.f4020a;
        g0Var.f4143b = this.f4023d;
        g0Var.f4144c = this.f4024g;
        g0Var.f4145d = this.f4025r;
        g0Var.f4146e = this.f4026x;
        g0Var.f4147f = this.f4027y;
        g0Var.f4148g = this.B;
        g0Var.f4149h = this.E;
        g0Var.f4150i = this.F;
        g0Var.j = this.G;
        g0Var.k = this.H;
        g0Var.f4151l = this.I;
        g0Var.f4152m = this.J;
        g0Var.f4153n = this.K;
        g0Var.f4154o = this.L;
        g0Var.f4155p = this.M;
        g0Var.f4156q = this.N;
        g0Var.f4157r = this.O;
        g0Var.f4158s = this.P;
        g0Var.f4159t = this.Q;
        g0Var.f4160u = this.R;
        g0Var.f4161v = this.S;
        g0Var.f4162w = this.T;
        g0Var.f4163x = this.U;
        g0Var.f4164y = this.V;
        g0Var.f4165z = this.W;
        g0Var.A = this.X;
        g0Var.B = this.Y;
        g0Var.C = this.Z;
        g0Var.D = this.f4021a0;
        return g0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e(Format format) {
        List list = this.J;
        if (list.size() != format.J.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) format.J.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && Format.class == obj.getClass()) {
            Format format = (Format) obj;
            int i11 = this.f4022b0;
            if ((i11 == 0 || (i10 = format.f4022b0) == 0 || i11 == i10) && this.f4025r == format.f4025r && this.f4026x == format.f4026x && this.f4027y == format.f4027y && this.B == format.B && this.I == format.I && this.L == format.L && this.M == format.M && this.N == format.N && this.P == format.P && this.S == format.S && this.U == format.U && this.V == format.V && this.W == format.W && this.X == format.X && this.Y == format.Y && this.Z == format.Z && Float.compare(this.O, format.O) == 0 && Float.compare(this.Q, format.Q) == 0 && qb.v.a(this.f4021a0, format.f4021a0) && qb.v.a(this.f4020a, format.f4020a) && qb.v.a(this.f4023d, format.f4023d) && qb.v.a(this.E, format.E) && qb.v.a(this.G, format.G) && qb.v.a(this.H, format.H) && qb.v.a(this.f4024g, format.f4024g) && Arrays.equals(this.R, format.R) && qb.v.a(this.F, format.F) && qb.v.a(this.T, format.T) && qb.v.a(this.K, format.K) && e(format)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.Format g(com.google.android.exoplayer2.Format r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.g(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    public final int hashCode() {
        if (this.f4022b0 == 0) {
            String str = this.f4020a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f4023d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f4024g;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f4025r) * 31) + this.f4026x) * 31) + this.f4027y) * 31) + this.B) * 31;
            String str4 = this.E;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.F;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : Arrays.hashCode(metadata.f4241a))) * 31;
            String str5 = this.G;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.H;
            int iFloatToIntBits = (((((((((((((((Float.floatToIntBits(this.Q) + ((((Float.floatToIntBits(this.O) + ((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.I) * 31) + ((int) this.L)) * 31) + this.M) * 31) + this.N) * 31)) * 31) + this.P) * 31)) * 31) + this.S) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
            Class cls = this.f4021a0;
            this.f4022b0 = iFloatToIntBits + (cls != null ? cls.hashCode() : 0);
        }
        return this.f4022b0;
    }

    public final String toString() {
        String str = this.f4020a;
        int iD = c7.a.d(104, str);
        String str2 = this.f4023d;
        int iD2 = c7.a.d(iD, str2);
        String str3 = this.G;
        int iD3 = c7.a.d(iD2, str3);
        String str4 = this.H;
        int iD4 = c7.a.d(iD3, str4);
        String str5 = this.E;
        int iD5 = c7.a.d(iD4, str5);
        String str6 = this.f4024g;
        StringBuilder sbS = c7.a.s(c7.a.d(iD5, str6), "Format(", str, ", ", str2);
        w.g.q(sbS, ", ", str3, ", ", str4);
        sbS.append(", ");
        sbS.append(str5);
        sbS.append(", ");
        sbS.append(this.D);
        sbS.append(", ");
        sbS.append(str6);
        sbS.append(", [");
        sbS.append(this.M);
        sbS.append(", ");
        sbS.append(this.N);
        sbS.append(", ");
        sbS.append(this.O);
        sbS.append("], [");
        sbS.append(this.U);
        sbS.append(", ");
        sbS.append(this.V);
        sbS.append("])");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4020a);
        parcel.writeString(this.f4023d);
        parcel.writeString(this.f4024g);
        parcel.writeInt(this.f4025r);
        parcel.writeInt(this.f4026x);
        parcel.writeInt(this.f4027y);
        parcel.writeInt(this.B);
        parcel.writeString(this.E);
        parcel.writeParcelable(this.F, 0);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeInt(this.I);
        List list = this.J;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) list.get(i11));
        }
        parcel.writeParcelable(this.K, 0);
        parcel.writeLong(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeFloat(this.O);
        parcel.writeInt(this.P);
        parcel.writeFloat(this.Q);
        byte[] bArr = this.R;
        int i12 = bArr != null ? 1 : 0;
        int i13 = qb.v.f20828a;
        parcel.writeInt(i12);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.S);
        parcel.writeParcelable(this.T, i10);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
    }

    public Format(Parcel parcel) {
        this.f4020a = parcel.readString();
        this.f4023d = parcel.readString();
        this.f4024g = parcel.readString();
        this.f4025r = parcel.readInt();
        this.f4026x = parcel.readInt();
        int i10 = parcel.readInt();
        this.f4027y = i10;
        int i11 = parcel.readInt();
        this.B = i11;
        this.D = i11 != -1 ? i11 : i10;
        this.E = parcel.readString();
        this.F = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readInt();
        int i12 = parcel.readInt();
        this.J = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            List list = this.J;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bArrCreateByteArray.getClass();
            list.add(bArrCreateByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.K = drmInitData;
        this.L = parcel.readLong();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readFloat();
        this.P = parcel.readInt();
        this.Q = parcel.readFloat();
        int i14 = qb.v.f20828a;
        this.R = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.S = parcel.readInt();
        this.T = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.f4021a0 = drmInitData != null ? ba.m.class : null;
    }
}
