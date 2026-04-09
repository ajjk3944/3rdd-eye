package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.yandex.mobile.ads.impl.C4246z4;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xv0;

/* loaded from: classes3.dex */
public abstract class v42 implements em {

    /* renamed from: b, reason: collision with root package name */
    public static final v42 f34342b = new a();

    public class a extends v42 {
        @Override // com.yandex.mobile.ads.impl.v42
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int b() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final d a(int i, d dVar, long j4) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final b a(int i, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final Object a(int i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class b implements em {
        public static final em.a<b> i = new I0(3);

        /* renamed from: b, reason: collision with root package name */
        public Object f34343b;

        /* renamed from: c, reason: collision with root package name */
        public Object f34344c;

        /* renamed from: d, reason: collision with root package name */
        public int f34345d;

        /* renamed from: e, reason: collision with root package name */
        public long f34346e;

        /* renamed from: f, reason: collision with root package name */
        public long f34347f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f34348g;

        /* renamed from: h, reason: collision with root package name */
        private C4246z4 f34349h = C4246z4.f36166h;

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            int i10 = bundle.getInt(Integer.toString(0, 36), 0);
            long j4 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j10 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z10 = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            C4246z4 c4246z4 = bundle2 != null ? (C4246z4) C4246z4.f36167j.fromBundle(bundle2) : C4246z4.f36166h;
            b bVar = new b();
            bVar.a(null, null, i10, j4, j10, c4246z4, z10);
            return bVar;
        }

        public final int d(int i10) {
            return this.f34349h.a(i10).a(-1);
        }

        public final boolean e(int i10) {
            boolean z10;
            C4246z4.a aVarA = this.f34349h.a(i10);
            if (aVarA.f36175c == -1) {
                z10 = true;
                break;
            }
            z10 = false;
            for (int i11 = 0; i11 < aVarA.f36175c; i11++) {
                int i12 = aVarA.f36177e[i11];
                if (i12 == 0 || i12 == 1) {
                    z10 = true;
                    break;
                }
            }
            return !z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (s82.a(this.f34343b, bVar.f34343b) && s82.a(this.f34344c, bVar.f34344c) && this.f34345d == bVar.f34345d && this.f34346e == bVar.f34346e && this.f34347f == bVar.f34347f && this.f34348g == bVar.f34348g && s82.a(this.f34349h, bVar.f34349h)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(int i10) {
            return this.f34349h.a(i10).f36180h;
        }

        public final int hashCode() {
            Object obj = this.f34343b;
            int iHashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f34344c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f34345d) * 31;
            long j4 = this.f34346e;
            int i10 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.f34347f;
            return this.f34349h.hashCode() + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f34348g ? 1 : 0)) * 31);
        }

        public final int b(long j4) {
            C4246z4 c4246z4 = this.f34349h;
            long j10 = this.f34346e;
            int i10 = c4246z4.f36169c - 1;
            while (i10 >= 0 && j4 != Long.MIN_VALUE) {
                long j11 = c4246z4.a(i10).f36174b;
                if (j11 != Long.MIN_VALUE) {
                    if (j4 >= j11) {
                        break;
                    }
                    i10--;
                } else {
                    if (j10 != -9223372036854775807L && j4 >= j10) {
                        break;
                    }
                    i10--;
                }
            }
            if (i10 >= 0) {
                C4246z4.a aVarA = c4246z4.a(i10);
                if (aVarA.f36175c != -1) {
                    for (int i11 = 0; i11 < aVarA.f36175c; i11++) {
                        int i12 = aVarA.f36177e[i11];
                        if (i12 != 0 && i12 != 1) {
                        }
                    }
                }
                return i10;
            }
            return -1;
        }

        public final long c(int i10) {
            return this.f34349h.a(i10).f36179g;
        }

        public final int c(int i10, int i11) {
            return this.f34349h.a(i10).a(i11);
        }

        public final int d() {
            return this.f34349h.f36172f;
        }

        public final long c() {
            return this.f34347f;
        }

        public final long b(int i10) {
            return this.f34349h.a(i10).f36174b;
        }

        public final long b() {
            return this.f34349h.f36170d;
        }

        public final int b(int i10, int i11) {
            C4246z4.a aVarA = this.f34349h.a(i10);
            if (aVarA.f36175c != -1) {
                return aVarA.f36177e[i11];
            }
            return 0;
        }

        public final int a(int i10) {
            return this.f34349h.a(i10).f36175c;
        }

        public final long a(int i10, int i11) {
            C4246z4.a aVarA = this.f34349h.a(i10);
            if (aVarA.f36175c != -1) {
                return aVarA.f36178f[i11];
            }
            return -9223372036854775807L;
        }

        public final int a() {
            return this.f34349h.f36169c;
        }

        public final int a(long j4) {
            C4246z4 c4246z4 = this.f34349h;
            long j10 = this.f34346e;
            c4246z4.getClass();
            if (j4 != Long.MIN_VALUE && (j10 == -9223372036854775807L || j4 < j10)) {
                int i10 = c4246z4.f36172f;
                while (i10 < c4246z4.f36169c) {
                    if (c4246z4.a(i10).f36174b == Long.MIN_VALUE || c4246z4.a(i10).f36174b > j4) {
                        C4246z4.a aVarA = c4246z4.a(i10);
                        if (aVarA.f36175c == -1 || aVarA.a(-1) < aVarA.f36175c) {
                            break;
                        }
                    }
                    i10++;
                }
                if (i10 < c4246z4.f36169c) {
                    return i10;
                }
            }
            return -1;
        }

        public final b a(Object obj, Object obj2, int i10, long j4, long j10, C4246z4 c4246z4, boolean z10) {
            this.f34343b = obj;
            this.f34344c = obj2;
            this.f34345d = i10;
            this.f34346e = j4;
            this.f34347f = j10;
            this.f34349h = c4246z4;
            this.f34348g = z10;
            return this;
        }
    }

    private static v42 a(Bundle bundle) {
        xj0 xj0VarA = a(d.f34357v, dm.a(bundle, Integer.toString(0, 36)));
        xj0 xj0VarA2 = a(b.i, dm.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = xj0VarA.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = i;
            }
            intArray = iArr;
        }
        return new c(xj0VarA, xj0VarA2, intArray);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i, b bVar, boolean z10);

    public abstract d a(int i, d dVar, long j4);

    public abstract Object a(int i);

    public abstract int b();

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v42)) {
            return false;
        }
        v42 v42Var = (v42) obj;
        if (v42Var.b() != b() || v42Var.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < b(); i++) {
            if (!a(i, dVar, 0L).equals(v42Var.a(i, dVar2, 0L))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < a(); i10++) {
            if (!a(i10, bVar, true).equals(v42Var.a(i10, bVar2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != v42Var.a(true) || (iB = b(true)) != v42Var.b(true)) {
            return false;
        }
        while (iA != iB) {
            int iA2 = a(iA, 0, true);
            if (iA2 != v42Var.a(iA, 0, true)) {
                return false;
            }
            iA = iA2;
        }
        return true;
    }

    public final int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iB = b() + 217;
        for (int i = 0; i < b(); i++) {
            iB = (iB * 31) + a(i, dVar, 0L).hashCode();
        }
        int iA = a() + (iB * 31);
        for (int i10 = 0; i10 < a(); i10++) {
            iA = (iA * 31) + a(i10, bVar, true).hashCode();
        }
        int iA2 = a(true);
        while (iA2 != -1) {
            iA = (iA * 31) + iA2;
            iA2 = a(iA2, 0, true);
        }
        return iA;
    }

    public static final class c extends v42 {

        /* renamed from: c, reason: collision with root package name */
        private final xj0<d> f34350c;

        /* renamed from: d, reason: collision with root package name */
        private final xj0<b> f34351d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f34352e;

        /* renamed from: f, reason: collision with root package name */
        private final int[] f34353f;

        public c(xj0<d> xj0Var, xj0<b> xj0Var2, int[] iArr) {
            zf.a(xj0Var.size() == iArr.length);
            this.f34350c = xj0Var;
            this.f34351d = xj0Var2;
            this.f34352e = iArr;
            this.f34353f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f34353f[iArr[i]] = i;
            }
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a(boolean z10) {
            if (c()) {
                return -1;
            }
            if (z10) {
                return this.f34352e[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int b(boolean z10) {
            if (c()) {
                return -1;
            }
            return z10 ? this.f34352e[this.f34350c.size() - 1] : this.f34350c.size() - 1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a(int i, int i10, boolean z10) {
            if (i10 == 1) {
                return i;
            }
            if (i != b(z10)) {
                return z10 ? this.f34352e[this.f34353f[i] + 1] : i + 1;
            }
            if (i10 == 2) {
                return a(z10);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final b a(int i, b bVar, boolean z10) {
            b bVar2 = this.f34351d.get(i);
            bVar.a(bVar2.f34343b, bVar2.f34344c, bVar2.f34345d, bVar2.f34346e, bVar2.f34347f, bVar2.f34349h, bVar2.f34348g);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int b(int i, int i10, boolean z10) {
            if (i10 == 1) {
                return i;
            }
            if (i != a(z10)) {
                return z10 ? this.f34352e[this.f34353f[i] - 1] : i - 1;
            }
            if (i10 == 2) {
                return b(z10);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a() {
            return this.f34351d.size();
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final d a(int i, d dVar, long j4) {
            d dVar2 = this.f34350c.get(i);
            dVar.a(dVar2.f34358b, dVar2.f34360d, dVar2.f34361e, dVar2.f34362f, dVar2.f34363g, dVar2.f34364h, dVar2.i, dVar2.f34365j, dVar2.f34367l, dVar2.f34369n, dVar2.f34370o, dVar2.f34371p, dVar2.f34372q, dVar2.f34373r);
            dVar.f34368m = dVar2.f34368m;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int b() {
            return this.f34350c.size();
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final int a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.v42
        public final Object a(int i) {
            throw new UnsupportedOperationException();
        }
    }

    public int b(int i, int i10, boolean z10) {
        if (i10 == 0) {
            if (i == a(z10)) {
                return -1;
            }
            return i - 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == a(z10) ? b(z10) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends em> xj0<T> a(em.a<T> aVar, IBinder iBinder) {
        int i;
        if (iBinder == null) {
            return xj0.h();
        }
        xj0.a aVar2 = new xj0.a();
        int i10 = cm.f25700a;
        int i11 = xj0.f35328d;
        xj0.a aVar3 = new xj0.a();
        int i12 = 1;
        int i13 = 0;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i13);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            aVar3.b(bundle);
                            i13++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i;
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        xj0 xj0VarA = aVar3.a();
        for (int i14 = 0; i14 < xj0VarA.size(); i14++) {
            aVar2.b(aVar.fromBundle((Bundle) xj0VarA.get(i14)));
        }
        return aVar2.a();
    }

    public static final class d implements em {

        /* renamed from: s, reason: collision with root package name */
        public static final Object f34354s = new Object();

        /* renamed from: t, reason: collision with root package name */
        private static final Object f34355t = new Object();

        /* renamed from: u, reason: collision with root package name */
        private static final xv0 f34356u = new xv0.a().b("com.monetization.ads.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v, reason: collision with root package name */
        public static final em.a<d> f34357v = new J0(9);

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public Object f34359c;

        /* renamed from: e, reason: collision with root package name */
        public Object f34361e;

        /* renamed from: f, reason: collision with root package name */
        public long f34362f;

        /* renamed from: g, reason: collision with root package name */
        public long f34363g;

        /* renamed from: h, reason: collision with root package name */
        public long f34364h;
        public boolean i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f34365j;

        /* renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f34366k;

        /* renamed from: l, reason: collision with root package name */
        public xv0.e f34367l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f34368m;

        /* renamed from: n, reason: collision with root package name */
        public long f34369n;

        /* renamed from: o, reason: collision with root package name */
        public long f34370o;

        /* renamed from: p, reason: collision with root package name */
        public int f34371p;

        /* renamed from: q, reason: collision with root package name */
        public int f34372q;

        /* renamed from: r, reason: collision with root package name */
        public long f34373r;

        /* renamed from: b, reason: collision with root package name */
        public Object f34358b = f34354s;

        /* renamed from: d, reason: collision with root package name */
        public xv0 f34360d = f34356u;

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            xv0 xv0Var = bundle2 != null ? (xv0) xv0.f35437h.fromBundle(bundle2) : null;
            long j4 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j10 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j11 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            xv0.e eVar = bundle3 != null ? (xv0.e) xv0.e.f35475h.fromBundle(bundle3) : null;
            boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j12 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j13 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i = bundle.getInt(Integer.toString(11, 36), 0);
            int i10 = bundle.getInt(Integer.toString(12, 36), 0);
            long j14 = bundle.getLong(Integer.toString(13, 36), 0L);
            d dVar = new d();
            dVar.a(f34355t, xv0Var, null, j4, j10, j11, z10, z11, eVar, j12, j13, i, i10, j14);
            dVar.f34368m = z12;
            return dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (s82.a(this.f34358b, dVar.f34358b) && s82.a(this.f34360d, dVar.f34360d) && s82.a(this.f34361e, dVar.f34361e) && s82.a(this.f34367l, dVar.f34367l) && this.f34362f == dVar.f34362f && this.f34363g == dVar.f34363g && this.f34364h == dVar.f34364h && this.i == dVar.i && this.f34365j == dVar.f34365j && this.f34368m == dVar.f34368m && this.f34369n == dVar.f34369n && this.f34370o == dVar.f34370o && this.f34371p == dVar.f34371p && this.f34372q == dVar.f34372q && this.f34373r == dVar.f34373r) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = (this.f34360d.hashCode() + ((this.f34358b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f34361e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            xv0.e eVar = this.f34367l;
            int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j4 = this.f34362f;
            int i = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.f34363g;
            int i10 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f34364h;
            int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.f34365j ? 1 : 0)) * 31) + (this.f34368m ? 1 : 0)) * 31;
            long j12 = this.f34369n;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f34370o;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f34371p) * 31) + this.f34372q) * 31;
            long j14 = this.f34373r;
            return i13 + ((int) (j14 ^ (j14 >>> 32)));
        }

        public final boolean a() {
            boolean z10 = this.f34366k;
            xv0.e eVar = this.f34367l;
            if (z10 == (eVar != null)) {
                return eVar != null;
            }
            throw new IllegalStateException();
        }

        public final d a(Object obj, xv0 xv0Var, Object obj2, long j4, long j10, long j11, boolean z10, boolean z11, xv0.e eVar, long j12, long j13, int i, int i10, long j14) {
            xv0.g gVar;
            this.f34358b = obj;
            this.f34360d = xv0Var != null ? xv0Var : f34356u;
            this.f34359c = (xv0Var == null || (gVar = xv0Var.f35439c) == null) ? null : gVar.f35492g;
            this.f34361e = obj2;
            this.f34362f = j4;
            this.f34363g = j10;
            this.f34364h = j11;
            this.i = z10;
            this.f34365j = z11;
            this.f34366k = eVar != null;
            this.f34367l = eVar;
            this.f34369n = j12;
            this.f34370o = j13;
            this.f34371p = i;
            this.f34372q = i10;
            this.f34373r = j14;
            this.f34368m = false;
            return this;
        }
    }

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public final int a(int i, b bVar, d dVar, int i10, boolean z10) {
        int i11 = a(i, bVar, false).f34345d;
        if (a(i11, dVar, 0L).f34372q != i) {
            return i + 1;
        }
        int iA = a(i11, i10, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, dVar, 0L).f34371p;
    }

    public int a(int i, int i10, boolean z10) {
        if (i10 == 0) {
            if (i == b(z10)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == b(z10) ? a(z10) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i, long j4) {
        Pair<Object, Long> pairA = a(dVar, bVar, i, j4, 0L);
        pairA.getClass();
        return pairA;
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i, long j4, long j10) {
        zf.a(i, b());
        a(i, dVar, j10);
        if (j4 == -9223372036854775807L) {
            j4 = dVar.f34369n;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = dVar.f34371p;
        a(i10, bVar, false);
        while (i10 < dVar.f34372q && bVar.f34347f != j4) {
            int i11 = i10 + 1;
            if (a(i11, bVar, false).f34347f > j4) {
                break;
            }
            i10 = i11;
        }
        a(i10, bVar, true);
        long jMin = j4 - bVar.f34347f;
        long j11 = bVar.f34346e;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(jMin, j11 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f34344c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }
}
