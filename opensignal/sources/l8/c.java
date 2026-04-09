package l8;

import android.graphics.Bitmap;
import wt.d0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final wt.q f14897a;

    /* renamed from: b, reason: collision with root package name */
    public final wt.q f14898b;

    /* renamed from: c, reason: collision with root package name */
    public final wt.q f14899c;

    /* renamed from: d, reason: collision with root package name */
    public final wt.q f14900d;

    /* renamed from: e, reason: collision with root package name */
    public final p8.a f14901e;

    /* renamed from: f, reason: collision with root package name */
    public final m8.d f14902f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f14903g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14904h;

    /* renamed from: i, reason: collision with root package name */
    public final b f14905i;
    public final b j;
    public final b k;

    public c() {
        du.f fVar = d0.f24610a;
        xt.c cVar = bu.n.f2983a.f25527y;
        du.e eVar = du.e.f7570g;
        m8.d dVar = m8.d.AUTOMATIC;
        Bitmap.Config config = q8.i.f20737b;
        b bVar = b.ENABLED;
        this.f14897a = cVar;
        this.f14898b = eVar;
        this.f14899c = eVar;
        this.f14900d = eVar;
        this.f14901e = p8.a.f20336a;
        this.f14902f = dVar;
        this.f14903g = config;
        this.f14904h = true;
        this.f14905i = bVar;
        this.j = bVar;
        this.k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return br.l.a(this.f14897a, cVar.f14897a) && br.l.a(this.f14898b, cVar.f14898b) && br.l.a(this.f14899c, cVar.f14899c) && br.l.a(this.f14900d, cVar.f14900d) && br.l.a(this.f14901e, cVar.f14901e) && this.f14902f == cVar.f14902f && this.f14903g == cVar.f14903g && this.f14904h == cVar.f14904h && this.f14905i == cVar.f14905i && this.j == cVar.j && this.k == cVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.f14900d.hashCode() + ((this.f14899c.hashCode() + ((this.f14898b.hashCode() + (this.f14897a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f14901e.getClass();
        return this.k.hashCode() + ((this.j.hashCode() + ((this.f14905i.hashCode() + w.g.b(w.g.b((this.f14903g.hashCode() + ((this.f14902f.hashCode() + ((p8.a.class.hashCode() + iHashCode) * 31)) * 31)) * 31, this.f14904h, 31), false, 923521)) * 31)) * 31);
    }
}
