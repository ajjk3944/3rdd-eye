package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4246z4 implements em {

    /* renamed from: h, reason: collision with root package name */
    public static final C4246z4 f36166h = new C4246z4(null, new a[0], 0, -9223372036854775807L, 0);
    private static final a i = new a(new int[0], new Uri[0], new long[0]).a();

    /* renamed from: j, reason: collision with root package name */
    public static final em.a<C4246z4> f36167j = new I0(5);

    /* renamed from: b, reason: collision with root package name */
    public final Object f36168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36169c;

    /* renamed from: d, reason: collision with root package name */
    public final long f36170d;

    /* renamed from: e, reason: collision with root package name */
    public final long f36171e;

    /* renamed from: f, reason: collision with root package name */
    public final int f36172f;

    /* renamed from: g, reason: collision with root package name */
    private final a[] f36173g;

    /* renamed from: com.yandex.mobile.ads.impl.z4$a */
    public static final class a implements em {
        public static final em.a<a> i = new J0(11);

        /* renamed from: b, reason: collision with root package name */
        public final long f36174b;

        /* renamed from: c, reason: collision with root package name */
        public final int f36175c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f36176d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f36177e;

        /* renamed from: f, reason: collision with root package name */
        public final long[] f36178f;

        /* renamed from: g, reason: collision with root package name */
        public final long f36179g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f36180h;

        public /* synthetic */ a(int[] iArr, Uri[] uriArr, long[] jArr) {
            this(0L, -1, iArr, uriArr, jArr, 0L, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            long j4 = bundle.getLong(Integer.toString(0, 36));
            int i10 = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            long j10 = bundle.getLong(Integer.toString(5, 36));
            boolean z10 = bundle.getBoolean(Integer.toString(6, 36));
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new a(j4, i10, iArr, uriArr, longArray, j10, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f36174b == aVar.f36174b && this.f36175c == aVar.f36175c && Arrays.equals(this.f36176d, aVar.f36176d) && Arrays.equals(this.f36177e, aVar.f36177e) && Arrays.equals(this.f36178f, aVar.f36178f) && this.f36179g == aVar.f36179g && this.f36180h == aVar.f36180h) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10 = this.f36175c * 31;
            long j4 = this.f36174b;
            int iHashCode = (Arrays.hashCode(this.f36178f) + ((Arrays.hashCode(this.f36177e) + ((((i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + Arrays.hashCode(this.f36176d)) * 31)) * 31)) * 31;
            long j10 = this.f36179g;
            return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f36180h ? 1 : 0);
        }

        private a(long j4, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z10) {
            zf.a(iArr.length == uriArr.length);
            this.f36174b = j4;
            this.f36175c = i10;
            this.f36177e = iArr;
            this.f36176d = uriArr;
            this.f36178f = jArr;
            this.f36179g = j10;
            this.f36180h = z10;
        }

        public final int a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f36177e;
                if (i12 >= iArr.length || this.f36180h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public final a a() {
            int[] iArr = this.f36177e;
            int length = iArr.length;
            int iMax = Math.max(0, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArr = this.f36178f;
            int length2 = jArr.length;
            int iMax2 = Math.max(0, length2);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
            Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
            return new a(this.f36174b, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f36176d, 0), jArrCopyOf, this.f36179g, this.f36180h);
        }
    }

    private C4246z4(Object obj, a[] aVarArr, long j4, long j10, int i10) {
        this.f36168b = obj;
        this.f36170d = j4;
        this.f36171e = j10;
        this.f36169c = aVarArr.length + i10;
        this.f36173g = aVarArr;
        this.f36172f = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C4246z4 a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.i.fromBundle((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new C4246z4(null, aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4246z4.class == obj.getClass()) {
            C4246z4 c4246z4 = (C4246z4) obj;
            if (s82.a(this.f36168b, c4246z4.f36168b) && this.f36169c == c4246z4.f36169c && this.f36170d == c4246z4.f36170d && this.f36171e == c4246z4.f36171e && this.f36172f == c4246z4.f36172f && Arrays.equals(this.f36173g, c4246z4.f36173g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f36169c * 31;
        Object obj = this.f36168b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f36170d)) * 31) + ((int) this.f36171e)) * 31) + this.f36172f) * 31) + Arrays.hashCode(this.f36173g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f36168b);
        sb.append(", adResumePositionUs=");
        sb.append(this.f36170d);
        sb.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f36173g.length; i10++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f36173g[i10].f36174b);
            sb.append(", ads=[");
            for (int i11 = 0; i11 < this.f36173g[i10].f36177e.length; i11++) {
                sb.append("ad(state=");
                int i12 = this.f36173g[i10].f36177e[i11];
                if (i12 == 0) {
                    sb.append('_');
                } else if (i12 == 1) {
                    sb.append('R');
                } else if (i12 == 2) {
                    sb.append('S');
                } else if (i12 == 3) {
                    sb.append('P');
                } else if (i12 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.f36173g[i10].f36178f[i11]);
                sb.append(')');
                if (i11 < this.f36173g[i10].f36177e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i10 < this.f36173g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public final a a(int i10) {
        int i11 = this.f36172f;
        if (i10 < i11) {
            return i;
        }
        return this.f36173g[i10 - i11];
    }
}
