package rj;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final String f32984a;

    /* renamed from: b, reason: collision with root package name */
    public final b f32985b;

    /* renamed from: c, reason: collision with root package name */
    public final aj.b f32986c;

    /* renamed from: d, reason: collision with root package name */
    public int f32987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32988e;

    public a(String str, b bVar, aj.b bVar2, int i4) {
        this.f32984a = str;
        this.f32985b = bVar;
        this.f32986c = bVar2;
        this.f32987d = i4;
    }

    @Override // rj.c
    public final long a() {
        return this.f32986c.f406a;
    }

    public final boolean b() {
        String strC = this.f32986c.c();
        nk.k.d(strC, "getPath(...)");
        String lowerCase = strC.toLowerCase(Locale.ROOT);
        nk.k.d(lowerCase, "toLowerCase(...)");
        List list = mj.a.f29398a;
        String lowerCase2 = lowerCase.toLowerCase();
        if (lowerCase2.contains("cache") || lowerCase2.contains("temp")) {
            return false;
        }
        Iterator it = mj.a.f29398a.iterator();
        while (it.hasNext()) {
            if (lowerCase2.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return nk.k.a(this.f32984a, aVar.f32984a) && nk.k.a(this.f32985b, aVar.f32985b) && nk.k.a(this.f32986c, aVar.f32986c) && this.f32987d == aVar.f32987d;
    }

    public final int hashCode() {
        return ((this.f32986c.hashCode() + ((this.f32985b.hashCode() + (this.f32984a.hashCode() * 31)) * 31)) * 31) + this.f32987d;
    }

    public final String toString() {
        return "ChildItem(md5=" + this.f32984a + ", parent=" + this.f32985b + ", node=" + this.f32986c + ", indexInParent=" + this.f32987d + ")";
    }
}
