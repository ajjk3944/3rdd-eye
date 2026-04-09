package com.bumptech.glide.request;

import W2.k;
import W2.l;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.bitmap.n;
import com.google.ar.core.ImageMetadata;
import java.util.Map;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f34600a;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f34604e;

    /* renamed from: f, reason: collision with root package name */
    private int f34605f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f34606g;

    /* renamed from: h, reason: collision with root package name */
    private int f34607h;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34612m;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f34614o;

    /* renamed from: p, reason: collision with root package name */
    private int f34615p;

    /* renamed from: t, reason: collision with root package name */
    private boolean f34619t;

    /* renamed from: u, reason: collision with root package name */
    private Resources.Theme f34620u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f34621v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f34622w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f34623x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f34625z;

    /* renamed from: b, reason: collision with root package name */
    private float f34601b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private E2.a f34602c = E2.a.f4022e;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.g f34603d = com.bumptech.glide.g.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    private boolean f34608i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f34609j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f34610k = -1;

    /* renamed from: l, reason: collision with root package name */
    private C2.e f34611l = V2.a.c();

    /* renamed from: n, reason: collision with root package name */
    private boolean f34613n = true;

    /* renamed from: q, reason: collision with root package name */
    private C2.g f34616q = new C2.g();

    /* renamed from: r, reason: collision with root package name */
    private Map f34617r = new W2.b();

    /* renamed from: s, reason: collision with root package name */
    private Class f34618s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    private boolean f34624y = true;

    private boolean L(int i10) {
        return M(this.f34600a, i10);
    }

    private static boolean M(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a S() {
        return this;
    }

    public final Resources.Theme A() {
        return this.f34620u;
    }

    public final Map B() {
        return this.f34617r;
    }

    public final boolean D() {
        return this.f34625z;
    }

    public final boolean E() {
        return this.f34622w;
    }

    protected final boolean F() {
        return this.f34621v;
    }

    public final boolean G(a aVar) {
        return Float.compare(aVar.f34601b, this.f34601b) == 0 && this.f34605f == aVar.f34605f && l.d(this.f34604e, aVar.f34604e) && this.f34607h == aVar.f34607h && l.d(this.f34606g, aVar.f34606g) && this.f34615p == aVar.f34615p && l.d(this.f34614o, aVar.f34614o) && this.f34608i == aVar.f34608i && this.f34609j == aVar.f34609j && this.f34610k == aVar.f34610k && this.f34612m == aVar.f34612m && this.f34613n == aVar.f34613n && this.f34622w == aVar.f34622w && this.f34623x == aVar.f34623x && this.f34602c.equals(aVar.f34602c) && this.f34603d == aVar.f34603d && this.f34616q.equals(aVar.f34616q) && this.f34617r.equals(aVar.f34617r) && this.f34618s.equals(aVar.f34618s) && l.d(this.f34611l, aVar.f34611l) && l.d(this.f34620u, aVar.f34620u);
    }

    public final boolean H() {
        return this.f34608i;
    }

    public final boolean I() {
        return L(8);
    }

    boolean K() {
        return this.f34624y;
    }

    public final boolean N() {
        return this.f34612m;
    }

    public final boolean O() {
        return l.t(this.f34610k, this.f34609j);
    }

    public a P() {
        this.f34619t = true;
        return S();
    }

    public a Q(int i10, int i11) {
        if (this.f34621v) {
            return clone().Q(i10, i11);
        }
        this.f34610k = i10;
        this.f34609j = i11;
        this.f34600a |= 512;
        return U();
    }

    public a R(com.bumptech.glide.g gVar) {
        if (this.f34621v) {
            return clone().R(gVar);
        }
        this.f34603d = (com.bumptech.glide.g) k.d(gVar);
        this.f34600a |= 8;
        return U();
    }

    protected final a U() {
        if (this.f34619t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return S();
    }

    public a V(C2.e eVar) {
        if (this.f34621v) {
            return clone().V(eVar);
        }
        this.f34611l = (C2.e) k.d(eVar);
        this.f34600a |= 1024;
        return U();
    }

    public a W(float f10) {
        if (this.f34621v) {
            return clone().W(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f34601b = f10;
        this.f34600a |= 2;
        return U();
    }

    public a X(boolean z10) {
        if (this.f34621v) {
            return clone().X(true);
        }
        this.f34608i = !z10;
        this.f34600a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        return U();
    }

    public a Y(C2.k kVar) {
        return Z(kVar, true);
    }

    a Z(C2.k kVar, boolean z10) {
        if (this.f34621v) {
            return clone().Z(kVar, z10);
        }
        n nVar = new n(kVar, z10);
        a0(Bitmap.class, kVar, z10);
        a0(Drawable.class, nVar, z10);
        a0(BitmapDrawable.class, nVar.c(), z10);
        a0(O2.c.class, new O2.f(kVar), z10);
        return U();
    }

    a a0(Class cls, C2.k kVar, boolean z10) {
        if (this.f34621v) {
            return clone().a0(cls, kVar, z10);
        }
        k.d(cls);
        k.d(kVar);
        this.f34617r.put(cls, kVar);
        int i10 = this.f34600a;
        this.f34613n = true;
        this.f34600a = 67584 | i10;
        this.f34624y = false;
        if (z10) {
            this.f34600a = i10 | 198656;
            this.f34612m = true;
        }
        return U();
    }

    public a b(a aVar) {
        if (this.f34621v) {
            return clone().b(aVar);
        }
        if (M(aVar.f34600a, 2)) {
            this.f34601b = aVar.f34601b;
        }
        if (M(aVar.f34600a, 262144)) {
            this.f34622w = aVar.f34622w;
        }
        if (M(aVar.f34600a, ImageMetadata.SHADING_MODE)) {
            this.f34625z = aVar.f34625z;
        }
        if (M(aVar.f34600a, 4)) {
            this.f34602c = aVar.f34602c;
        }
        if (M(aVar.f34600a, 8)) {
            this.f34603d = aVar.f34603d;
        }
        if (M(aVar.f34600a, 16)) {
            this.f34604e = aVar.f34604e;
            this.f34605f = 0;
            this.f34600a &= -33;
        }
        if (M(aVar.f34600a, 32)) {
            this.f34605f = aVar.f34605f;
            this.f34604e = null;
            this.f34600a &= -17;
        }
        if (M(aVar.f34600a, 64)) {
            this.f34606g = aVar.f34606g;
            this.f34607h = 0;
            this.f34600a &= -129;
        }
        if (M(aVar.f34600a, 128)) {
            this.f34607h = aVar.f34607h;
            this.f34606g = null;
            this.f34600a &= -65;
        }
        if (M(aVar.f34600a, PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            this.f34608i = aVar.f34608i;
        }
        if (M(aVar.f34600a, 512)) {
            this.f34610k = aVar.f34610k;
            this.f34609j = aVar.f34609j;
        }
        if (M(aVar.f34600a, 1024)) {
            this.f34611l = aVar.f34611l;
        }
        if (M(aVar.f34600a, 4096)) {
            this.f34618s = aVar.f34618s;
        }
        if (M(aVar.f34600a, 8192)) {
            this.f34614o = aVar.f34614o;
            this.f34615p = 0;
            this.f34600a &= -16385;
        }
        if (M(aVar.f34600a, TLSTM.TLS_MAX_FRAGMENT_SIZE)) {
            this.f34615p = aVar.f34615p;
            this.f34614o = null;
            this.f34600a &= -8193;
        }
        if (M(aVar.f34600a, 32768)) {
            this.f34620u = aVar.f34620u;
        }
        if (M(aVar.f34600a, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            this.f34613n = aVar.f34613n;
        }
        if (M(aVar.f34600a, 131072)) {
            this.f34612m = aVar.f34612m;
        }
        if (M(aVar.f34600a, 2048)) {
            this.f34617r.putAll(aVar.f34617r);
            this.f34624y = aVar.f34624y;
        }
        if (M(aVar.f34600a, ImageMetadata.LENS_APERTURE)) {
            this.f34623x = aVar.f34623x;
        }
        if (!this.f34613n) {
            this.f34617r.clear();
            int i10 = this.f34600a;
            this.f34612m = false;
            this.f34600a = i10 & (-133121);
            this.f34624y = true;
        }
        this.f34600a |= aVar.f34600a;
        this.f34616q.d(aVar.f34616q);
        return U();
    }

    public a c() {
        if (this.f34619t && !this.f34621v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f34621v = true;
        return P();
    }

    public a c0(boolean z10) {
        if (this.f34621v) {
            return clone().c0(z10);
        }
        this.f34625z = z10;
        this.f34600a |= ImageMetadata.SHADING_MODE;
        return U();
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            C2.g gVar = new C2.g();
            aVar.f34616q = gVar;
            gVar.d(this.f34616q);
            W2.b bVar = new W2.b();
            aVar.f34617r = bVar;
            bVar.putAll(this.f34617r);
            aVar.f34619t = false;
            aVar.f34621v = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a e(Class cls) {
        if (this.f34621v) {
            return clone().e(cls);
        }
        this.f34618s = (Class) k.d(cls);
        this.f34600a |= 4096;
        return U();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return G((a) obj);
        }
        return false;
    }

    public a f(E2.a aVar) {
        if (this.f34621v) {
            return clone().f(aVar);
        }
        this.f34602c = (E2.a) k.d(aVar);
        this.f34600a |= 4;
        return U();
    }

    public final E2.a h() {
        return this.f34602c;
    }

    public int hashCode() {
        return l.o(this.f34620u, l.o(this.f34611l, l.o(this.f34618s, l.o(this.f34617r, l.o(this.f34616q, l.o(this.f34603d, l.o(this.f34602c, l.p(this.f34623x, l.p(this.f34622w, l.p(this.f34613n, l.p(this.f34612m, l.n(this.f34610k, l.n(this.f34609j, l.p(this.f34608i, l.o(this.f34614o, l.n(this.f34615p, l.o(this.f34606g, l.n(this.f34607h, l.o(this.f34604e, l.n(this.f34605f, l.l(this.f34601b)))))))))))))))))))));
    }

    public final int i() {
        return this.f34605f;
    }

    public final Drawable k() {
        return this.f34604e;
    }

    public final Drawable l() {
        return this.f34614o;
    }

    public final int m() {
        return this.f34615p;
    }

    public final boolean n() {
        return this.f34623x;
    }

    public final C2.g o() {
        return this.f34616q;
    }

    public final int p() {
        return this.f34609j;
    }

    public final int q() {
        return this.f34610k;
    }

    public final Drawable r() {
        return this.f34606g;
    }

    public final int t() {
        return this.f34607h;
    }

    public final com.bumptech.glide.g u() {
        return this.f34603d;
    }

    public final Class w() {
        return this.f34618s;
    }

    public final C2.e x() {
        return this.f34611l;
    }

    public final float z() {
        return this.f34601b;
    }
}
