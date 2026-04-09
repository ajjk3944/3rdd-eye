package D1;

import H1.p;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.apm.insight.R;
import com.bumptech.glide.h;
import l1.C2641g;
import l1.InterfaceC2639e;
import l1.l;
import n1.k;
import u1.AbstractC2950e;
import u1.n;
import u1.s;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: D, reason: collision with root package name */
    public boolean f1204D;

    /* renamed from: a, reason: collision with root package name */
    public int f1205a;

    /* renamed from: d, reason: collision with root package name */
    public int f1208d;
    public boolean i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1216m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1217n;

    /* renamed from: b, reason: collision with root package name */
    public k f1206b = k.f22241d;

    /* renamed from: c, reason: collision with root package name */
    public h f1207c = h.f6510c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1209e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f1210f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f1211g = -1;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2639e f1212h = G1.a.f1511b;

    /* renamed from: j, reason: collision with root package name */
    public l1.h f1213j = new l1.h();

    /* renamed from: k, reason: collision with root package name */
    public H1.c f1214k = new H1.c(0);

    /* renamed from: l, reason: collision with root package name */
    public Class f1215l = Object.class;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1203C = true;

    public static boolean g(int i, int i3) {
        return (i & i3) != 0;
    }

    public a a(a aVar) {
        if (this.f1217n) {
            return clone().a(aVar);
        }
        int i = aVar.f1205a;
        if (g(aVar.f1205a, 1048576)) {
            this.f1204D = aVar.f1204D;
        }
        if (g(aVar.f1205a, 4)) {
            this.f1206b = aVar.f1206b;
        }
        if (g(aVar.f1205a, 8)) {
            this.f1207c = aVar.f1207c;
        }
        if (g(aVar.f1205a, 16)) {
            this.f1208d = 0;
            this.f1205a &= -33;
        }
        if (g(aVar.f1205a, 32)) {
            this.f1208d = aVar.f1208d;
            this.f1205a &= -17;
        }
        if (g(aVar.f1205a, 64)) {
            this.f1205a &= -129;
        }
        if (g(aVar.f1205a, 128)) {
            this.f1205a &= -65;
        }
        if (g(aVar.f1205a, 256)) {
            this.f1209e = aVar.f1209e;
        }
        if (g(aVar.f1205a, 512)) {
            this.f1211g = aVar.f1211g;
            this.f1210f = aVar.f1210f;
        }
        if (g(aVar.f1205a, 1024)) {
            this.f1212h = aVar.f1212h;
        }
        if (g(aVar.f1205a, 4096)) {
            this.f1215l = aVar.f1215l;
        }
        if (g(aVar.f1205a, 8192)) {
            this.f1205a &= -16385;
        }
        if (g(aVar.f1205a, 16384)) {
            this.f1205a &= -8193;
        }
        if (g(aVar.f1205a, 131072)) {
            this.i = aVar.i;
        }
        if (g(aVar.f1205a, 2048)) {
            this.f1214k.putAll(aVar.f1214k);
            this.f1203C = aVar.f1203C;
        }
        this.f1205a |= aVar.f1205a;
        this.f1213j.f21823b.g(aVar.f1213j.f21823b);
        k();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            l1.h hVar = new l1.h();
            aVar.f1213j = hVar;
            hVar.f21823b.g(this.f1213j.f21823b);
            H1.c cVar = new H1.c(0);
            aVar.f1214k = cVar;
            cVar.putAll(this.f1214k);
            aVar.f1216m = false;
            aVar.f1217n = false;
            return aVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final a c(Class cls) {
        if (this.f1217n) {
            return clone().c(cls);
        }
        this.f1215l = cls;
        this.f1205a |= 4096;
        k();
        return this;
    }

    public final a d(k kVar) {
        if (this.f1217n) {
            return clone().d(kVar);
        }
        this.f1206b = kVar;
        this.f1205a |= 4;
        k();
        return this;
    }

    public final a e() {
        if (this.f1217n) {
            return clone().e();
        }
        this.f1208d = R.drawable.ic_website_unknow;
        this.f1205a = (this.f1205a | 32) & (-17);
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return f((a) obj);
        }
        return false;
    }

    public final boolean f(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f1208d != aVar.f1208d) {
            return false;
        }
        char[] cArr = p.f1779a;
        return this.f1209e == aVar.f1209e && this.f1210f == aVar.f1210f && this.f1211g == aVar.f1211g && this.i == aVar.i && this.f1206b.equals(aVar.f1206b) && this.f1207c == aVar.f1207c && this.f1213j.equals(aVar.f1213j) && this.f1214k.equals(aVar.f1214k) && this.f1215l.equals(aVar.f1215l) && this.f1212h.equals(aVar.f1212h);
    }

    public final a h(n nVar, AbstractC2950e abstractC2950e) {
        if (this.f1217n) {
            return clone().h(nVar, abstractC2950e);
        }
        l(n.f23750g, nVar);
        return p(abstractC2950e, false);
    }

    public int hashCode() {
        char[] cArr = p.f1779a;
        return p.h(p.h(p.h(p.h(p.h(p.h(p.h(p.g(0, p.g(0, p.g(1, p.g(this.i ? 1 : 0, p.g(this.f1211g, p.g(this.f1210f, p.g(this.f1209e ? 1 : 0, p.h(p.g(0, p.h(p.g(0, p.h(p.g(this.f1208d, p.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f1206b), this.f1207c), this.f1213j), this.f1214k), this.f1215l), this.f1212h), null);
    }

    public final a i(int i, int i3) {
        if (this.f1217n) {
            return clone().i(i, i3);
        }
        this.f1211g = i;
        this.f1210f = i3;
        this.f1205a |= 512;
        k();
        return this;
    }

    public final a j() {
        if (this.f1217n) {
            return clone().j();
        }
        this.f1207c = h.f6511d;
        this.f1205a |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.f1216m) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a l(C2641g c2641g, n nVar) {
        if (this.f1217n) {
            return clone().l(c2641g, nVar);
        }
        H1.g.b(c2641g);
        this.f1213j.f21823b.put(c2641g, nVar);
        k();
        return this;
    }

    public final a m(G1.b bVar) {
        if (this.f1217n) {
            return clone().m(bVar);
        }
        this.f1212h = bVar;
        this.f1205a |= 1024;
        k();
        return this;
    }

    public final a n() {
        if (this.f1217n) {
            return clone().n();
        }
        this.f1209e = false;
        this.f1205a |= 256;
        k();
        return this;
    }

    public final a o(Class cls, l lVar, boolean z6) {
        if (this.f1217n) {
            return clone().o(cls, lVar, z6);
        }
        H1.g.b(lVar);
        this.f1214k.put(cls, lVar);
        int i = this.f1205a;
        this.f1205a = 67584 | i;
        this.f1203C = false;
        if (z6) {
            this.f1205a = i | 198656;
            this.i = true;
        }
        k();
        return this;
    }

    public final a p(l lVar, boolean z6) {
        if (this.f1217n) {
            return clone().p(lVar, z6);
        }
        s sVar = new s(lVar, z6);
        o(Bitmap.class, lVar, z6);
        o(Drawable.class, sVar, z6);
        o(BitmapDrawable.class, sVar, z6);
        o(y1.b.class, new y1.c(lVar), z6);
        k();
        return this;
    }

    public final a q() {
        if (this.f1217n) {
            return clone().q();
        }
        this.f1204D = true;
        this.f1205a |= 1048576;
        k();
        return this;
    }
}
