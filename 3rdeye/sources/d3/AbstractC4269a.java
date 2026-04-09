package d3;

import N2.l;
import U2.o;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.AdRequest;
import d3.AbstractC4269a;
import g3.C4388a;
import g3.C4389b;
import t4.C5606d;

/* compiled from: BaseRequestOptions.java */
/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4269a<T extends AbstractC4269a<T>> implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int f37372b;
    public boolean i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f37383n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f37384o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37386q;

    /* renamed from: c, reason: collision with root package name */
    public l f37373c = l.f4552c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f37374d = com.bumptech.glide.h.NORMAL;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37375e = true;

    /* renamed from: f, reason: collision with root package name */
    public int f37376f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f37377g = -1;

    /* renamed from: h, reason: collision with root package name */
    public L2.f f37378h = C4388a.f37950b;

    /* renamed from: j, reason: collision with root package name */
    public boolean f37379j = true;

    /* renamed from: k, reason: collision with root package name */
    public L2.h f37380k = new L2.h();

    /* renamed from: l, reason: collision with root package name */
    public h3.b f37381l = new h3.b();

    /* renamed from: m, reason: collision with root package name */
    public Class<?> f37382m = Object.class;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37385p = true;

    public static boolean g(int i, int i10) {
        return (i & i10) != 0;
    }

    public T a(AbstractC4269a<?> abstractC4269a) {
        if (this.f37384o) {
            return (T) clone().a(abstractC4269a);
        }
        int i = abstractC4269a.f37372b;
        if (g(abstractC4269a.f37372b, 1048576)) {
            this.f37386q = abstractC4269a.f37386q;
        }
        if (g(abstractC4269a.f37372b, 4)) {
            this.f37373c = abstractC4269a.f37373c;
        }
        if (g(abstractC4269a.f37372b, 8)) {
            this.f37374d = abstractC4269a.f37374d;
        }
        if (g(abstractC4269a.f37372b, 16)) {
            this.f37372b &= -33;
        }
        if (g(abstractC4269a.f37372b, 32)) {
            this.f37372b &= -17;
        }
        if (g(abstractC4269a.f37372b, 64)) {
            this.f37372b &= -129;
        }
        if (g(abstractC4269a.f37372b, 128)) {
            this.f37372b &= -65;
        }
        if (g(abstractC4269a.f37372b, 256)) {
            this.f37375e = abstractC4269a.f37375e;
        }
        if (g(abstractC4269a.f37372b, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f37377g = abstractC4269a.f37377g;
            this.f37376f = abstractC4269a.f37376f;
        }
        if (g(abstractC4269a.f37372b, 1024)) {
            this.f37378h = abstractC4269a.f37378h;
        }
        if (g(abstractC4269a.f37372b, 4096)) {
            this.f37382m = abstractC4269a.f37382m;
        }
        if (g(abstractC4269a.f37372b, 8192)) {
            this.f37372b &= -16385;
        }
        if (g(abstractC4269a.f37372b, 16384)) {
            this.f37372b &= -8193;
        }
        if (g(abstractC4269a.f37372b, 65536)) {
            this.f37379j = abstractC4269a.f37379j;
        }
        if (g(abstractC4269a.f37372b, 131072)) {
            this.i = abstractC4269a.i;
        }
        if (g(abstractC4269a.f37372b, 2048)) {
            this.f37381l.putAll(abstractC4269a.f37381l);
            this.f37385p = abstractC4269a.f37385p;
        }
        if (!this.f37379j) {
            this.f37381l.clear();
            int i10 = this.f37372b;
            this.i = false;
            this.f37372b = i10 & (-133121);
            this.f37385p = true;
        }
        this.f37372b |= abstractC4269a.f37372b;
        this.f37380k.f4033b.h(abstractC4269a.f37380k.f4033b);
        k();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            L2.h hVar = new L2.h();
            t10.f37380k = hVar;
            hVar.f4033b.h(this.f37380k.f4033b);
            h3.b bVar = new h3.b();
            t10.f37381l = bVar;
            bVar.putAll(this.f37381l);
            t10.f37383n = false;
            t10.f37384o = false;
            return t10;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final T d(Class<?> cls) {
        if (this.f37384o) {
            return (T) clone().d(cls);
        }
        this.f37382m = cls;
        this.f37372b |= 4096;
        k();
        return this;
    }

    public final T e(l lVar) {
        if (this.f37384o) {
            return (T) clone().e(lVar);
        }
        C5606d.l(lVar, "Argument must not be null");
        this.f37373c = lVar;
        this.f37372b |= 4;
        k();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4269a) {
            return f((AbstractC4269a) obj);
        }
        return false;
    }

    public final boolean f(AbstractC4269a<?> abstractC4269a) {
        abstractC4269a.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = h3.l.f38217a;
        return this.f37375e == abstractC4269a.f37375e && this.f37376f == abstractC4269a.f37376f && this.f37377g == abstractC4269a.f37377g && this.i == abstractC4269a.i && this.f37379j == abstractC4269a.f37379j && this.f37373c.equals(abstractC4269a.f37373c) && this.f37374d == abstractC4269a.f37374d && this.f37380k.equals(abstractC4269a.f37380k) && this.f37381l.equals(abstractC4269a.f37381l) && this.f37382m.equals(abstractC4269a.f37382m) && h3.l.b(this.f37378h, abstractC4269a.f37378h);
    }

    public final AbstractC4269a h(U2.l lVar, U2.f fVar) {
        if (this.f37384o) {
            return clone().h(lVar, fVar);
        }
        L2.g<U2.l> gVar = U2.l.f12412f;
        C5606d.l(lVar, "Argument must not be null");
        l(gVar, lVar);
        return o(fVar, false);
    }

    public int hashCode() {
        char[] cArr = h3.l.f38217a;
        return h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.g(0, h3.l.g(0, h3.l.g(this.f37379j ? 1 : 0, h3.l.g(this.i ? 1 : 0, h3.l.g(this.f37377g, h3.l.g(this.f37376f, h3.l.g(this.f37375e ? 1 : 0, h3.l.h(h3.l.g(0, h3.l.h(h3.l.g(0, h3.l.h(h3.l.g(0, h3.l.g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f37373c), this.f37374d), this.f37380k), this.f37381l), this.f37382m), this.f37378h), null);
    }

    public final T i(int i, int i10) {
        if (this.f37384o) {
            return (T) clone().i(i, i10);
        }
        this.f37377g = i;
        this.f37376f = i10;
        this.f37372b |= AdRequest.MAX_CONTENT_URL_LENGTH;
        k();
        return this;
    }

    public final T j(com.bumptech.glide.h hVar) {
        if (this.f37384o) {
            return (T) clone().j(hVar);
        }
        C5606d.l(hVar, "Argument must not be null");
        this.f37374d = hVar;
        this.f37372b |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.f37383n) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final AbstractC4269a l(L2.g gVar, U2.l lVar) {
        if (this.f37384o) {
            return clone().l(gVar, lVar);
        }
        C5606d.k(gVar);
        C5606d.k(lVar);
        this.f37380k.f4033b.put(gVar, lVar);
        k();
        return this;
    }

    public final AbstractC4269a m(C4389b c4389b) {
        if (this.f37384o) {
            return clone().m(c4389b);
        }
        this.f37378h = c4389b;
        this.f37372b |= 1024;
        k();
        return this;
    }

    public final AbstractC4269a n() {
        if (this.f37384o) {
            return clone().n();
        }
        this.f37375e = false;
        this.f37372b |= 256;
        k();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T o(L2.l<Bitmap> lVar, boolean z10) {
        if (this.f37384o) {
            return (T) clone().o(lVar, z10);
        }
        o oVar = new o(lVar, z10);
        p(Bitmap.class, lVar, z10);
        p(Drawable.class, oVar, z10);
        p(BitmapDrawable.class, oVar, z10);
        p(Y2.c.class, new Y2.e(lVar), z10);
        k();
        return this;
    }

    public final <Y> T p(Class<Y> cls, L2.l<Y> lVar, boolean z10) {
        if (this.f37384o) {
            return (T) clone().p(cls, lVar, z10);
        }
        C5606d.k(lVar);
        this.f37381l.put(cls, lVar);
        int i = this.f37372b;
        this.f37379j = true;
        this.f37372b = 67584 | i;
        this.f37385p = false;
        if (z10) {
            this.f37372b = i | 198656;
            this.i = true;
        }
        k();
        return this;
    }

    public final AbstractC4269a q() {
        if (this.f37384o) {
            return clone().q();
        }
        this.f37386q = true;
        this.f37372b |= 1048576;
        k();
        return this;
    }
}
