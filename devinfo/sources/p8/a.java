package p8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.bumptech.glide.i;
import g8.r;
import t8.m;
import x7.l;
import z7.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f31453a;

    /* renamed from: d, reason: collision with root package name */
    public int f31456d;

    /* renamed from: e, reason: collision with root package name */
    public int f31457e;
    public boolean j;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31464n;

    /* renamed from: o, reason: collision with root package name */
    public Resources.Theme f31465o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31466p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31468r;

    /* renamed from: b, reason: collision with root package name */
    public j f31454b = j.f38047d;

    /* renamed from: c, reason: collision with root package name */
    public i f31455c = i.f6500c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31458f = true;
    public int g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f31459h = -1;

    /* renamed from: i, reason: collision with root package name */
    public x7.e f31460i = s8.c.f33508b;

    /* renamed from: k, reason: collision with root package name */
    public x7.h f31461k = new x7.h();

    /* renamed from: l, reason: collision with root package name */
    public t8.c f31462l = new t8.c(0);

    /* renamed from: m, reason: collision with root package name */
    public Class f31463m = Object.class;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31467q = true;

    public static boolean h(int i4, int i10) {
        return (i4 & i10) != 0;
    }

    public a a(a aVar) {
        if (this.f31466p) {
            return clone().a(aVar);
        }
        int i4 = aVar.f31453a;
        if (h(aVar.f31453a, 1048576)) {
            this.f31468r = aVar.f31468r;
        }
        if (h(aVar.f31453a, 4)) {
            this.f31454b = aVar.f31454b;
        }
        if (h(aVar.f31453a, 8)) {
            this.f31455c = aVar.f31455c;
        }
        if (h(aVar.f31453a, 16)) {
            this.f31456d = 0;
            this.f31453a &= -33;
        }
        if (h(aVar.f31453a, 32)) {
            this.f31456d = aVar.f31456d;
            this.f31453a &= -17;
        }
        if (h(aVar.f31453a, 64)) {
            this.f31457e = 0;
            this.f31453a &= -129;
        }
        if (h(aVar.f31453a, 128)) {
            this.f31457e = aVar.f31457e;
            this.f31453a &= -65;
        }
        if (h(aVar.f31453a, 256)) {
            this.f31458f = aVar.f31458f;
        }
        if (h(aVar.f31453a, 512)) {
            this.f31459h = aVar.f31459h;
            this.g = aVar.g;
        }
        if (h(aVar.f31453a, Segment.SHARE_MINIMUM)) {
            this.f31460i = aVar.f31460i;
        }
        if (h(aVar.f31453a, Buffer.SEGMENTING_THRESHOLD)) {
            this.f31463m = aVar.f31463m;
        }
        if (h(aVar.f31453a, Segment.SIZE)) {
            this.f31453a &= -16385;
        }
        if (h(aVar.f31453a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f31453a &= -8193;
        }
        if (h(aVar.f31453a, 32768)) {
            this.f31465o = aVar.f31465o;
        }
        if (h(aVar.f31453a, 131072)) {
            this.j = aVar.j;
        }
        if (h(aVar.f31453a, 2048)) {
            this.f31462l.putAll(aVar.f31462l);
            this.f31467q = aVar.f31467q;
        }
        this.f31453a |= aVar.f31453a;
        this.f31461k.f37004b.g(aVar.f31461k.f37004b);
        n();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            x7.h hVar = new x7.h();
            aVar.f31461k = hVar;
            hVar.f37004b.g(this.f31461k.f37004b);
            t8.c cVar = new t8.c(0);
            aVar.f31462l = cVar;
            cVar.putAll(this.f31462l);
            aVar.f31464n = false;
            aVar.f31466p = false;
            return aVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final a d(Class cls) {
        if (this.f31466p) {
            return clone().d(cls);
        }
        this.f31463m = cls;
        this.f31453a |= Buffer.SEGMENTING_THRESHOLD;
        n();
        return this;
    }

    public final a e(j jVar) {
        if (this.f31466p) {
            return clone().e(jVar);
        }
        this.f31454b = jVar;
        this.f31453a |= 4;
        n();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return g((a) obj);
        }
        return false;
    }

    public final a f(int i4) {
        if (this.f31466p) {
            return clone().f(i4);
        }
        this.f31456d = i4;
        this.f31453a = (this.f31453a | 32) & (-17);
        n();
        return this;
    }

    public final boolean g(a aVar) {
        aVar.getClass();
        if (Float.compare(1.0f, 1.0f) != 0 || this.f31456d != aVar.f31456d) {
            return false;
        }
        char[] cArr = m.f34520a;
        return this.f31457e == aVar.f31457e && this.f31458f == aVar.f31458f && this.g == aVar.g && this.f31459h == aVar.f31459h && this.j == aVar.j && this.f31454b.equals(aVar.f31454b) && this.f31455c == aVar.f31455c && this.f31461k.equals(aVar.f31461k) && this.f31462l.equals(aVar.f31462l) && this.f31463m.equals(aVar.f31463m) && this.f31460i.equals(aVar.f31460i) && m.b(this.f31465o, aVar.f31465o);
    }

    public int hashCode() {
        char[] cArr = m.f34520a;
        return m.h(m.h(m.h(m.h(m.h(m.h(m.h(m.g(0, m.g(0, m.g(1, m.g(this.j ? 1 : 0, m.g(this.f31459h, m.g(this.g, m.g(this.f31458f ? 1 : 0, m.h(m.g(0, m.h(m.g(this.f31457e, m.h(m.g(this.f31456d, m.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f31454b), this.f31455c), this.f31461k), this.f31462l), this.f31463m), this.f31460i), this.f31465o);
    }

    public final a i(g8.m mVar, g8.d dVar) {
        if (this.f31466p) {
            return clone().i(mVar, dVar);
        }
        o(g8.m.g, mVar);
        return t(dVar, false);
    }

    public final a j(int i4, int i10) {
        if (this.f31466p) {
            return clone().j(i4, i10);
        }
        this.f31459h = i4;
        this.g = i10;
        this.f31453a |= 512;
        n();
        return this;
    }

    public final a k(int i4) {
        if (this.f31466p) {
            return clone().k(i4);
        }
        this.f31457e = i4;
        this.f31453a = (this.f31453a | 128) & (-65);
        n();
        return this;
    }

    public final a l() {
        if (this.f31466p) {
            return clone().l();
        }
        this.f31455c = i.f6501d;
        this.f31453a |= 8;
        n();
        return this;
    }

    public final a m(x7.g gVar) {
        if (this.f31466p) {
            return clone().m(gVar);
        }
        this.f31461k.f37004b.remove(gVar);
        n();
        return this;
    }

    public final void n() {
        if (this.f31464n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final a o(x7.g gVar, Object obj) {
        if (this.f31466p) {
            return clone().o(gVar, obj);
        }
        t8.f.b(gVar);
        t8.f.b(obj);
        this.f31461k.f37004b.put(gVar, obj);
        n();
        return this;
    }

    public final a p(x7.e eVar) {
        if (this.f31466p) {
            return clone().p(eVar);
        }
        this.f31460i = eVar;
        this.f31453a |= Segment.SHARE_MINIMUM;
        n();
        return this;
    }

    public final a q() {
        if (this.f31466p) {
            return clone().q();
        }
        this.f31458f = false;
        this.f31453a |= 256;
        n();
        return this;
    }

    public final a r(Resources.Theme theme) {
        if (this.f31466p) {
            return clone().r(theme);
        }
        this.f31465o = theme;
        if (theme != null) {
            this.f31453a |= 32768;
            return o(i8.e.f25939b, theme);
        }
        this.f31453a &= -32769;
        return m(i8.e.f25939b);
    }

    public final a s(Class cls, l lVar, boolean z3) {
        if (this.f31466p) {
            return clone().s(cls, lVar, z3);
        }
        t8.f.b(lVar);
        this.f31462l.put(cls, lVar);
        int i4 = this.f31453a;
        this.f31453a = 67584 | i4;
        this.f31467q = false;
        if (z3) {
            this.f31453a = i4 | 198656;
            this.j = true;
        }
        n();
        return this;
    }

    public final a t(l lVar, boolean z3) {
        if (this.f31466p) {
            return clone().t(lVar, z3);
        }
        r rVar = new r(lVar, z3);
        s(Bitmap.class, lVar, z3);
        s(Drawable.class, rVar, z3);
        s(BitmapDrawable.class, rVar, z3);
        s(k8.b.class, new k8.c(lVar), z3);
        n();
        return this;
    }

    public final a u() {
        if (this.f31466p) {
            return clone().u();
        }
        this.f31468r = true;
        this.f31453a |= 1048576;
        n();
        return this;
    }
}
