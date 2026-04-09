package com.yandex.mobile.ads.impl;

import N7.B8;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.em;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class dc0 implements em {

    /* renamed from: H, reason: collision with root package name */
    private static final dc0 f26064H = new dc0(new a());

    /* renamed from: I, reason: collision with root package name */
    public static final em.a<dc0> f26065I = new E0(2);

    /* renamed from: A, reason: collision with root package name */
    public final int f26066A;

    /* renamed from: B, reason: collision with root package name */
    public final int f26067B;

    /* renamed from: C, reason: collision with root package name */
    public final int f26068C;

    /* renamed from: D, reason: collision with root package name */
    public final int f26069D;

    /* renamed from: E, reason: collision with root package name */
    public final int f26070E;

    /* renamed from: F, reason: collision with root package name */
    public final int f26071F;

    /* renamed from: G, reason: collision with root package name */
    private int f26072G;

    /* renamed from: b, reason: collision with root package name */
    public final String f26073b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26074c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26076e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26077f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26078g;

    /* renamed from: h, reason: collision with root package name */
    public final int f26079h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final String f26080j;

    /* renamed from: k, reason: collision with root package name */
    public final yz0 f26081k;

    /* renamed from: l, reason: collision with root package name */
    public final String f26082l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26083m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26084n;

    /* renamed from: o, reason: collision with root package name */
    public final List<byte[]> f26085o;

    /* renamed from: p, reason: collision with root package name */
    public final a40 f26086p;

    /* renamed from: q, reason: collision with root package name */
    public final long f26087q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26088r;

    /* renamed from: s, reason: collision with root package name */
    public final int f26089s;

    /* renamed from: t, reason: collision with root package name */
    public final float f26090t;

    /* renamed from: u, reason: collision with root package name */
    public final int f26091u;

    /* renamed from: v, reason: collision with root package name */
    public final float f26092v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f26093w;

    /* renamed from: x, reason: collision with root package name */
    public final int f26094x;

    /* renamed from: y, reason: collision with root package name */
    public final lq f26095y;

    /* renamed from: z, reason: collision with root package name */
    public final int f26096z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        private int f26097A;

        /* renamed from: B, reason: collision with root package name */
        private int f26098B;

        /* renamed from: C, reason: collision with root package name */
        private int f26099C;

        /* renamed from: D, reason: collision with root package name */
        private int f26100D;

        /* renamed from: a, reason: collision with root package name */
        private String f26101a;

        /* renamed from: b, reason: collision with root package name */
        private String f26102b;

        /* renamed from: c, reason: collision with root package name */
        private String f26103c;

        /* renamed from: d, reason: collision with root package name */
        private int f26104d;

        /* renamed from: e, reason: collision with root package name */
        private int f26105e;

        /* renamed from: f, reason: collision with root package name */
        private int f26106f;

        /* renamed from: g, reason: collision with root package name */
        private int f26107g;

        /* renamed from: h, reason: collision with root package name */
        private String f26108h;
        private yz0 i;

        /* renamed from: j, reason: collision with root package name */
        private String f26109j;

        /* renamed from: k, reason: collision with root package name */
        private String f26110k;

        /* renamed from: l, reason: collision with root package name */
        private int f26111l;

        /* renamed from: m, reason: collision with root package name */
        private List<byte[]> f26112m;

        /* renamed from: n, reason: collision with root package name */
        private a40 f26113n;

        /* renamed from: o, reason: collision with root package name */
        private long f26114o;

        /* renamed from: p, reason: collision with root package name */
        private int f26115p;

        /* renamed from: q, reason: collision with root package name */
        private int f26116q;

        /* renamed from: r, reason: collision with root package name */
        private float f26117r;

        /* renamed from: s, reason: collision with root package name */
        private int f26118s;

        /* renamed from: t, reason: collision with root package name */
        private float f26119t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f26120u;

        /* renamed from: v, reason: collision with root package name */
        private int f26121v;

        /* renamed from: w, reason: collision with root package name */
        private lq f26122w;

        /* renamed from: x, reason: collision with root package name */
        private int f26123x;

        /* renamed from: y, reason: collision with root package name */
        private int f26124y;

        /* renamed from: z, reason: collision with root package name */
        private int f26125z;

        public /* synthetic */ a(dc0 dc0Var, int i) {
            this(dc0Var);
        }

        public a() {
            this.f26106f = -1;
            this.f26107g = -1;
            this.f26111l = -1;
            this.f26114o = Long.MAX_VALUE;
            this.f26115p = -1;
            this.f26116q = -1;
            this.f26117r = -1.0f;
            this.f26119t = 1.0f;
            this.f26121v = -1;
            this.f26123x = -1;
            this.f26124y = -1;
            this.f26125z = -1;
            this.f26099C = -1;
            this.f26100D = 0;
        }

        public final a a(int i) {
            this.f26099C = i;
            return this;
        }

        public final a b(int i) {
            this.f26106f = i;
            return this;
        }

        public final a c(int i) {
            this.f26123x = i;
            return this;
        }

        public final a d(int i) {
            this.f26097A = i;
            return this;
        }

        public final a e(int i) {
            this.f26098B = i;
            return this;
        }

        public final a f(int i) {
            this.f26116q = i;
            return this;
        }

        public final a g(int i) {
            this.f26101a = Integer.toString(i);
            return this;
        }

        public final a h(int i) {
            this.f26111l = i;
            return this;
        }

        public final a i(int i) {
            this.f26125z = i;
            return this;
        }

        public final a j(int i) {
            this.f26107g = i;
            return this;
        }

        public final a k(int i) {
            this.f26118s = i;
            return this;
        }

        public final a l(int i) {
            this.f26124y = i;
            return this;
        }

        public final a m(int i) {
            this.f26104d = i;
            return this;
        }

        public final a n(int i) {
            this.f26121v = i;
            return this;
        }

        public final a o(int i) {
            this.f26115p = i;
            return this;
        }

        public final a a(String str) {
            this.f26108h = str;
            return this;
        }

        public final a b() {
            this.f26109j = "image/jpeg";
            return this;
        }

        public final a c(String str) {
            this.f26102b = str;
            return this;
        }

        public final a d(String str) {
            this.f26103c = str;
            return this;
        }

        public final a e(String str) {
            this.f26110k = str;
            return this;
        }

        public final a a(lq lqVar) {
            this.f26122w = lqVar;
            return this;
        }

        public final a b(String str) {
            this.f26101a = str;
            return this;
        }

        public final a a(a40 a40Var) {
            this.f26113n = a40Var;
            return this;
        }

        public final a b(float f10) {
            this.f26119t = f10;
            return this;
        }

        public final void a(float f10) {
            this.f26117r = f10;
        }

        public final a a(List<byte[]> list) {
            this.f26112m = list;
            return this;
        }

        public final a a(yz0 yz0Var) {
            this.i = yz0Var;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f26120u = bArr;
            return this;
        }

        public final a a(long j4) {
            this.f26114o = j4;
            return this;
        }

        public final dc0 a() {
            return new dc0(this, 0);
        }

        private a(dc0 dc0Var) {
            this.f26101a = dc0Var.f26073b;
            this.f26102b = dc0Var.f26074c;
            this.f26103c = dc0Var.f26075d;
            this.f26104d = dc0Var.f26076e;
            this.f26105e = dc0Var.f26077f;
            this.f26106f = dc0Var.f26078g;
            this.f26107g = dc0Var.f26079h;
            this.f26108h = dc0Var.f26080j;
            this.i = dc0Var.f26081k;
            this.f26109j = dc0Var.f26082l;
            this.f26110k = dc0Var.f26083m;
            this.f26111l = dc0Var.f26084n;
            this.f26112m = dc0Var.f26085o;
            this.f26113n = dc0Var.f26086p;
            this.f26114o = dc0Var.f26087q;
            this.f26115p = dc0Var.f26088r;
            this.f26116q = dc0Var.f26089s;
            this.f26117r = dc0Var.f26090t;
            this.f26118s = dc0Var.f26091u;
            this.f26119t = dc0Var.f26092v;
            this.f26120u = dc0Var.f26093w;
            this.f26121v = dc0Var.f26094x;
            this.f26122w = dc0Var.f26095y;
            this.f26123x = dc0Var.f26096z;
            this.f26124y = dc0Var.f26066A;
            this.f26125z = dc0Var.f26067B;
            this.f26097A = dc0Var.f26068C;
            this.f26098B = dc0Var.f26069D;
            this.f26099C = dc0Var.f26070E;
            this.f26100D = dc0Var.f26071F;
        }
    }

    public /* synthetic */ dc0(a aVar, int i) {
        this(aVar);
    }

    public final boolean a(dc0 dc0Var) {
        if (this.f26085o.size() != dc0Var.f26085o.size()) {
            return false;
        }
        for (int i = 0; i < this.f26085o.size(); i++) {
            if (!Arrays.equals(this.f26085o.get(i), dc0Var.f26085o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && dc0.class == obj.getClass()) {
            dc0 dc0Var = (dc0) obj;
            int i10 = this.f26072G;
            if ((i10 == 0 || (i = dc0Var.f26072G) == 0 || i10 == i) && this.f26076e == dc0Var.f26076e && this.f26077f == dc0Var.f26077f && this.f26078g == dc0Var.f26078g && this.f26079h == dc0Var.f26079h && this.f26084n == dc0Var.f26084n && this.f26087q == dc0Var.f26087q && this.f26088r == dc0Var.f26088r && this.f26089s == dc0Var.f26089s && this.f26091u == dc0Var.f26091u && this.f26094x == dc0Var.f26094x && this.f26096z == dc0Var.f26096z && this.f26066A == dc0Var.f26066A && this.f26067B == dc0Var.f26067B && this.f26068C == dc0Var.f26068C && this.f26069D == dc0Var.f26069D && this.f26070E == dc0Var.f26070E && this.f26071F == dc0Var.f26071F && Float.compare(this.f26090t, dc0Var.f26090t) == 0 && Float.compare(this.f26092v, dc0Var.f26092v) == 0 && s82.a(this.f26073b, dc0Var.f26073b) && s82.a(this.f26074c, dc0Var.f26074c) && s82.a(this.f26080j, dc0Var.f26080j) && s82.a(this.f26082l, dc0Var.f26082l) && s82.a(this.f26083m, dc0Var.f26083m) && s82.a(this.f26075d, dc0Var.f26075d) && Arrays.equals(this.f26093w, dc0Var.f26093w) && s82.a(this.f26081k, dc0Var.f26081k) && s82.a(this.f26095y, dc0Var.f26095y) && s82.a(this.f26086p, dc0Var.f26086p) && a(dc0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26072G == 0) {
            String str = this.f26073b;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f26074c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f26075d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f26076e) * 31) + this.f26077f) * 31) + this.f26078g) * 31) + this.f26079h) * 31;
            String str4 = this.f26080j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            yz0 yz0Var = this.f26081k;
            int iHashCode5 = (iHashCode4 + (yz0Var == null ? 0 : yz0Var.hashCode())) * 31;
            String str5 = this.f26082l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f26083m;
            this.f26072G = ((((((((((((((B8.g(this.f26092v, (B8.g(this.f26090t, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f26084n) * 31) + ((int) this.f26087q)) * 31) + this.f26088r) * 31) + this.f26089s) * 31, 31) + this.f26091u) * 31, 31) + this.f26094x) * 31) + this.f26096z) * 31) + this.f26066A) * 31) + this.f26067B) * 31) + this.f26068C) * 31) + this.f26069D) * 31) + this.f26070E) * 31) + this.f26071F;
        }
        return this.f26072G;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f26073b);
        sb.append(", ");
        sb.append(this.f26074c);
        sb.append(", ");
        sb.append(this.f26082l);
        sb.append(", ");
        sb.append(this.f26083m);
        sb.append(", ");
        sb.append(this.f26080j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.f26075d);
        sb.append(", [");
        sb.append(this.f26088r);
        sb.append(", ");
        sb.append(this.f26089s);
        sb.append(", ");
        sb.append(this.f26090t);
        sb.append("], [");
        sb.append(this.f26096z);
        sb.append(", ");
        return B4.i.j(sb, this.f26066A, "])");
    }

    private dc0(a aVar) {
        this.f26073b = aVar.f26101a;
        this.f26074c = aVar.f26102b;
        this.f26075d = s82.e(aVar.f26103c);
        this.f26076e = aVar.f26104d;
        this.f26077f = aVar.f26105e;
        int i = aVar.f26106f;
        this.f26078g = i;
        int i10 = aVar.f26107g;
        this.f26079h = i10;
        this.i = i10 != -1 ? i10 : i;
        this.f26080j = aVar.f26108h;
        this.f26081k = aVar.i;
        this.f26082l = aVar.f26109j;
        this.f26083m = aVar.f26110k;
        this.f26084n = aVar.f26111l;
        List<byte[]> list = aVar.f26112m;
        this.f26085o = list == null ? Collections.EMPTY_LIST : list;
        a40 a40Var = aVar.f26113n;
        this.f26086p = a40Var;
        this.f26087q = aVar.f26114o;
        this.f26088r = aVar.f26115p;
        this.f26089s = aVar.f26116q;
        this.f26090t = aVar.f26117r;
        int i11 = aVar.f26118s;
        this.f26091u = i11 == -1 ? 0 : i11;
        float f10 = aVar.f26119t;
        this.f26092v = f10 == -1.0f ? 1.0f : f10;
        this.f26093w = aVar.f26120u;
        this.f26094x = aVar.f26121v;
        this.f26095y = aVar.f26122w;
        this.f26096z = aVar.f26123x;
        this.f26066A = aVar.f26124y;
        this.f26067B = aVar.f26125z;
        int i12 = aVar.f26097A;
        this.f26068C = i12 == -1 ? 0 : i12;
        int i13 = aVar.f26098B;
        this.f26069D = i13 != -1 ? i13 : 0;
        this.f26070E = aVar.f26099C;
        int i14 = aVar.f26100D;
        if (i14 != 0 || a40Var == null) {
            this.f26071F = i14;
        } else {
            this.f26071F = 1;
        }
    }

    public final int b() {
        int i;
        int i10 = this.f26088r;
        if (i10 == -1 || (i = this.f26089s) == -1) {
            return -1;
        }
        return i10 * i;
    }

    public final a a() {
        return new a(this, 0);
    }

    public final dc0 a(int i) {
        a aVar = new a(this, 0);
        aVar.f26100D = i;
        return new dc0(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static dc0 a(Bundle bundle) {
        a aVar = new a();
        if (bundle != null) {
            ClassLoader classLoader = fm.class.getClassLoader();
            int i = s82.f32899a;
            bundle.setClassLoader(classLoader);
        }
        int i10 = 0;
        String string = bundle.getString(Integer.toString(0, 36));
        dc0 dc0Var = f26064H;
        String str = dc0Var.f26073b;
        if (string == null) {
            string = str;
        }
        aVar.f26101a = string;
        String string2 = bundle.getString(Integer.toString(1, 36));
        String str2 = dc0Var.f26074c;
        if (string2 == null) {
            string2 = str2;
        }
        aVar.f26102b = string2;
        String string3 = bundle.getString(Integer.toString(2, 36));
        String str3 = dc0Var.f26075d;
        if (string3 == null) {
            string3 = str3;
        }
        aVar.f26103c = string3;
        aVar.f26104d = bundle.getInt(Integer.toString(3, 36), dc0Var.f26076e);
        aVar.f26105e = bundle.getInt(Integer.toString(4, 36), dc0Var.f26077f);
        aVar.f26106f = bundle.getInt(Integer.toString(5, 36), dc0Var.f26078g);
        aVar.f26107g = bundle.getInt(Integer.toString(6, 36), dc0Var.f26079h);
        String string4 = bundle.getString(Integer.toString(7, 36));
        String str4 = dc0Var.f26080j;
        if (string4 == null) {
            string4 = str4;
        }
        aVar.f26108h = string4;
        yz0 yz0Var = (yz0) bundle.getParcelable(Integer.toString(8, 36));
        yz0 yz0Var2 = dc0Var.f26081k;
        if (yz0Var == null) {
            yz0Var = yz0Var2;
        }
        aVar.i = yz0Var;
        String string5 = bundle.getString(Integer.toString(9, 36));
        String str5 = dc0Var.f26082l;
        if (string5 == null) {
            string5 = str5;
        }
        aVar.f26109j = string5;
        String string6 = bundle.getString(Integer.toString(10, 36));
        String str6 = dc0Var.f26083m;
        if (string6 == null) {
            string6 = str6;
        }
        aVar.f26110k = string6;
        aVar.f26111l = bundle.getInt(Integer.toString(11, 36), dc0Var.f26084n);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i10, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i10++;
        }
        aVar.f26112m = arrayList;
        aVar.f26113n = (a40) bundle.getParcelable(Integer.toString(13, 36));
        String string7 = Integer.toString(14, 36);
        dc0 dc0Var2 = f26064H;
        aVar.f26114o = bundle.getLong(string7, dc0Var2.f26087q);
        aVar.f26115p = bundle.getInt(Integer.toString(15, 36), dc0Var2.f26088r);
        aVar.f26116q = bundle.getInt(Integer.toString(16, 36), dc0Var2.f26089s);
        aVar.f26117r = bundle.getFloat(Integer.toString(17, 36), dc0Var2.f26090t);
        aVar.f26118s = bundle.getInt(Integer.toString(18, 36), dc0Var2.f26091u);
        aVar.f26119t = bundle.getFloat(Integer.toString(19, 36), dc0Var2.f26092v);
        aVar.f26120u = bundle.getByteArray(Integer.toString(20, 36));
        aVar.f26121v = bundle.getInt(Integer.toString(21, 36), dc0Var2.f26094x);
        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
        if (bundle2 != null) {
            aVar.f26122w = (lq) lq.f30067g.fromBundle(bundle2);
        }
        aVar.f26123x = bundle.getInt(Integer.toString(23, 36), dc0Var2.f26096z);
        aVar.f26124y = bundle.getInt(Integer.toString(24, 36), dc0Var2.f26066A);
        aVar.f26125z = bundle.getInt(Integer.toString(25, 36), dc0Var2.f26067B);
        aVar.f26097A = bundle.getInt(Integer.toString(26, 36), dc0Var2.f26068C);
        aVar.f26098B = bundle.getInt(Integer.toString(27, 36), dc0Var2.f26069D);
        aVar.f26099C = bundle.getInt(Integer.toString(28, 36), dc0Var2.f26070E);
        aVar.f26100D = bundle.getInt(Integer.toString(29, 36), dc0Var2.f26071F);
        return new dc0(aVar);
    }
}
