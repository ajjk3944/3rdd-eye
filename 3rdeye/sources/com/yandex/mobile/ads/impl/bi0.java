package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

/* loaded from: classes3.dex */
public final class bi0 implements yz0.b {
    public static final Parcelable.Creator<bi0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f25279b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25280c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25281d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25282e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25283f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25284g;

    public class a implements Parcelable.Creator<bi0> {
        @Override // android.os.Parcelable.Creator
        public final bi0 createFromParcel(Parcel parcel) {
            return new bi0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final bi0[] newArray(int i) {
            return new bi0[i];
        }
    }

    public bi0(int i, String str, String str2, String str3, boolean z10, int i10) {
        zf.a(i10 == -1 || i10 > 0);
        this.f25279b = i;
        this.f25280c = str;
        this.f25281d = str2;
        this.f25282e = str3;
        this.f25283f = z10;
        this.f25284g = i10;
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ dc0 a() {
        return N4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ byte[] b() {
        return N4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bi0.class == obj.getClass()) {
            bi0 bi0Var = (bi0) obj;
            if (this.f25279b == bi0Var.f25279b && s82.a(this.f25280c, bi0Var.f25280c) && s82.a(this.f25281d, bi0Var.f25281d) && s82.a(this.f25282e, bi0Var.f25282e) && this.f25283f == bi0Var.f25283f && this.f25284g == bi0Var.f25284g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f25279b + 527) * 31;
        String str = this.f25280c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25281d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25282e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f25283f ? 1 : 0)) * 31) + this.f25284g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f25281d + "\", genre=\"" + this.f25280c + "\", bitrate=" + this.f25279b + ", metadataInterval=" + this.f25284g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25279b);
        parcel.writeString(this.f25280c);
        parcel.writeString(this.f25281d);
        parcel.writeString(this.f25282e);
        boolean z10 = this.f25283f;
        int i10 = s82.f32899a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f25284g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[PHI: r6
  0x00bc: PHI (r6v1 int) = (r6v0 int), (r6v2 int), (r6v0 int) binds: [B:31:0x009d, B:39:0x00c0, B:36:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.yandex.mobile.ads.impl.bi0 a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r15) throws java.lang.NumberFormatException {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L33
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L36
            int r7 = r7 * 1000
            if (r7 <= 0) goto L24
            r1 = r4
        L22:
            r9 = r7
            goto L3e
        L24:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L37
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> L37
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L37
            java.lang.String r1 = r8.toString()     // Catch: java.lang.NumberFormatException -> L37
            com.yandex.mobile.ads.impl.rs0.d(r3, r1)     // Catch: java.lang.NumberFormatException -> L37
        L33:
            r1 = r5
            r9 = r6
            goto L3e
        L36:
            r7 = r6
        L37:
            java.lang.String r1 = "Invalid bitrate header: "
            com.yandex.mobile.ads.impl.fv0.a(r1, r2, r3)
            r1 = r5
            goto L22
        L3e:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L52
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L53
        L52:
            r10 = r7
        L53:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L66
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L67
        L66:
            r11 = r7
        L67:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L7a
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r12 = r1
            r1 = r4
            goto L7b
        L7a:
            r12 = r7
        L7b:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r15.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L94
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r13 = r1
            r1 = r4
            goto L95
        L94:
            r13 = r5
        L95:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r15 = r15.get(r2)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto Lbc
            java.lang.Object r15 = r15.get(r5)
            java.lang.String r15 = (java.lang.String) r15
            int r2 = java.lang.Integer.parseInt(r15)     // Catch: java.lang.NumberFormatException -> Lc0
            if (r2 <= 0) goto Lad
            r14 = r2
            goto Lc4
        Lad:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbf
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lbf
            r4.append(r15)     // Catch: java.lang.NumberFormatException -> Lbf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.NumberFormatException -> Lbf
            com.yandex.mobile.ads.impl.rs0.d(r3, r4)     // Catch: java.lang.NumberFormatException -> Lbf
        Lbc:
            r4 = r1
            r14 = r6
            goto Lc4
        Lbf:
            r6 = r2
        Lc0:
            com.yandex.mobile.ads.impl.fv0.a(r0, r15, r3)
            goto Lbc
        Lc4:
            if (r4 == 0) goto Lcc
            com.yandex.mobile.ads.impl.bi0 r8 = new com.yandex.mobile.ads.impl.bi0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r7 = r8
        Lcc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.bi0.a(java.util.Map):com.yandex.mobile.ads.impl.bi0");
    }

    public bi0(Parcel parcel) {
        this.f25279b = parcel.readInt();
        this.f25280c = parcel.readString();
        this.f25281d = parcel.readString();
        this.f25282e = parcel.readString();
        this.f25283f = s82.a(parcel);
        this.f25284g = parcel.readInt();
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final void a(aw0.a aVar) {
        String str = this.f25281d;
        if (str != null) {
            aVar.h(str);
        }
        String str2 = this.f25280c;
        if (str2 != null) {
            aVar.g(str2);
        }
    }
}
