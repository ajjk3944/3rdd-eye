package com.bumptech.glide;

import A1.w;
import H1.p;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.ads.PL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u.C2936e;

/* loaded from: classes.dex */
public final class l extends D1.a {

    /* renamed from: E, reason: collision with root package name */
    public final Context f6524E;

    /* renamed from: F, reason: collision with root package name */
    public final n f6525F;

    /* renamed from: G, reason: collision with root package name */
    public final Class f6526G;

    /* renamed from: H, reason: collision with root package name */
    public final f f6527H;

    /* renamed from: I, reason: collision with root package name */
    public a f6528I;

    /* renamed from: J, reason: collision with root package name */
    public Object f6529J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f6530K;

    /* renamed from: L, reason: collision with root package name */
    public l f6531L;
    public l M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f6532N = true;

    /* renamed from: O, reason: collision with root package name */
    public boolean f6533O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f6534P;

    static {
    }

    public l(b bVar, n nVar, Class cls, Context context) {
        D1.e eVar;
        this.f6525F = nVar;
        this.f6526G = cls;
        this.f6524E = context;
        C2936e c2936e = nVar.f6568a.f6486c.f6503f;
        a aVar = (a) c2936e.get(cls);
        if (aVar == null) {
            Iterator it = ((PL) c2936e.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f6528I = aVar == null ? f.f6497k : aVar;
        this.f6527H = bVar.f6486c;
        Iterator it2 = nVar.i.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            r();
        }
        synchronized (nVar) {
            eVar = nVar.f6576j;
        }
        a(eVar);
    }

    @Override // D1.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return super.equals(lVar) && Objects.equals(this.f6526G, lVar.f6526G) && this.f6528I.equals(lVar.f6528I) && Objects.equals(this.f6529J, lVar.f6529J) && Objects.equals(this.f6530K, lVar.f6530K) && Objects.equals(this.f6531L, lVar.f6531L) && Objects.equals(this.M, lVar.M) && this.f6532N == lVar.f6532N && this.f6533O == lVar.f6533O;
    }

    @Override // D1.a
    public final int hashCode() {
        return p.g(this.f6533O ? 1 : 0, p.g(this.f6532N ? 1 : 0, p.h(p.h(p.h(p.h(p.h(p.h(p.h(super.hashCode(), this.f6526G), this.f6528I), this.f6529J), this.f6530K), this.f6531L), this.M), null)));
    }

    public final l r() {
        if (this.f1217n) {
            return clone().r();
        }
        k();
        return this;
    }

    @Override // D1.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final l a(D1.a aVar) {
        H1.g.b(aVar);
        return (l) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final D1.c t(Object obj, E1.c cVar, D1.d dVar, a aVar, h hVar, int i, int i3, D1.a aVar2) {
        D1.d dVar2;
        D1.d bVar;
        D1.a aVar3;
        D1.f fVar;
        h hVar2;
        if (this.M != null) {
            bVar = new D1.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        l lVar = this.f6531L;
        if (lVar == null) {
            Context context = this.f6524E;
            f fVar2 = this.f6527H;
            aVar3 = aVar2;
            fVar = new D1.f(context, fVar2, obj, this.f6529J, this.f6526G, aVar3, i, i3, hVar, cVar, this.f6530K, bVar, fVar2.f6504g, aVar.f6482a);
        } else {
            if (this.f6534P) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = lVar.f6532N ? aVar : lVar.f6528I;
            if (D1.a.g(lVar.f1205a, 8)) {
                hVar2 = this.f6531L.f1207c;
            } else {
                int iOrdinal = hVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    hVar2 = h.f6508a;
                } else if (iOrdinal == 2) {
                    hVar2 = h.f6509b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f1207c);
                    }
                    hVar2 = h.f6510c;
                }
            }
            h hVar3 = hVar2;
            l lVar2 = this.f6531L;
            int i6 = lVar2.f1211g;
            int i7 = lVar2.f1210f;
            if (p.i(i, i3)) {
                l lVar3 = this.f6531L;
                if (!p.i(lVar3.f1211g, lVar3.f1210f)) {
                    i6 = aVar2.f1211g;
                    i7 = aVar2.f1210f;
                }
            }
            int i8 = i7;
            D1.g gVar = new D1.g(obj, bVar);
            Context context2 = this.f6524E;
            D1.g gVar2 = gVar;
            f fVar3 = this.f6527H;
            D1.f fVar4 = new D1.f(context2, fVar3, obj, this.f6529J, this.f6526G, aVar2, i, i3, hVar, cVar, this.f6530K, gVar2, fVar3.f6504g, aVar.f6482a);
            this.f6534P = true;
            l lVar4 = this.f6531L;
            D1.c cVarT = lVar4.t(obj, cVar, gVar2, aVar4, hVar3, i6, i8, lVar4);
            this.f6534P = false;
            gVar2.f1254c = fVar4;
            gVar2.f1255d = cVarT;
            aVar3 = aVar2;
            fVar = gVar2;
        }
        if (dVar2 == null) {
            return fVar;
        }
        l lVar5 = this.M;
        int i9 = lVar5.f1211g;
        int i10 = lVar5.f1210f;
        if (p.i(i, i3)) {
            l lVar6 = this.M;
            if (!p.i(lVar6.f1211g, lVar6.f1210f)) {
                i9 = aVar3.f1211g;
                i10 = aVar3.f1210f;
            }
        }
        int i11 = i10;
        l lVar7 = this.M;
        D1.b bVar2 = dVar2;
        D1.c cVarT2 = lVar7.t(obj, cVar, bVar2, lVar7.f6528I, lVar7.f1207c, i9, i11, lVar7);
        bVar2.f1220c = fVar;
        bVar2.f1221d = cVarT2;
        return bVar2;
    }

    @Override // D1.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        l lVar = (l) super.clone();
        lVar.f6528I = lVar.f6528I.clone();
        if (lVar.f6530K != null) {
            lVar.f6530K = new ArrayList(lVar.f6530K);
        }
        l lVar2 = lVar.f6531L;
        if (lVar2 != null) {
            lVar.f6531L = lVar2.clone();
        }
        l lVar3 = lVar.M;
        if (lVar3 != null) {
            lVar.M = lVar3.clone();
        }
        return lVar;
    }

    public final void v(E1.c cVar, D1.a aVar) {
        H1.g.b(cVar);
        if (!this.f6533O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        D1.c cVarT = t(new Object(), cVar, null, this.f6528I, aVar.f1207c, aVar.f1211g, aVar.f1210f, aVar);
        D1.c cVarH = cVar.h();
        if (cVarT.c(cVarH) && (aVar.f1209e || !cVarH.k())) {
            H1.g.c(cVarH, "Argument must not be null");
            if (cVarH.isRunning()) {
                return;
            }
            cVarH.j();
            return;
        }
        this.f6525F.k(cVar);
        cVar.f(cVarT);
        n nVar = this.f6525F;
        synchronized (nVar) {
            nVar.f6573f.f142a.add(cVar);
            w wVar = nVar.f6571d;
            ((Set) wVar.f141d).add(cVarT);
            if (wVar.f140c) {
                cVarT.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) wVar.f139b).add(cVarT);
            } else {
                cVarT.j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(android.widget.ImageView r5) {
        /*
            r4 = this;
            H1.p.a()
            H1.g.b(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.f1205a
            boolean r0 = D1.a.g(r1, r0)
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.bumptech.glide.k.f6522a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L27;
                default: goto L26;
            }
        L26:
            goto L6d
        L27:
            com.bumptech.glide.l r0 = r4.clone()
            u1.n r2 = u1.n.f23746c
            u1.i r3 = new u1.i
            r3.<init>()
            D1.a r0 = r0.h(r2, r3)
            r0.f1203C = r1
            goto L6e
        L39:
            com.bumptech.glide.l r0 = r4.clone()
            u1.n r2 = u1.n.f23745b
            u1.u r3 = new u1.u
            r3.<init>()
            D1.a r0 = r0.h(r2, r3)
            r0.f1203C = r1
            goto L6e
        L4b:
            com.bumptech.glide.l r0 = r4.clone()
            u1.n r2 = u1.n.f23746c
            u1.i r3 = new u1.i
            r3.<init>()
            D1.a r0 = r0.h(r2, r3)
            r0.f1203C = r1
            goto L6e
        L5d:
            com.bumptech.glide.l r0 = r4.clone()
            u1.n r1 = u1.n.f23747d
            u1.h r2 = new u1.h
            r2.<init>()
            D1.a r0 = r0.h(r1, r2)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.bumptech.glide.f r1 = r4.f6527H
            G3.f r1 = r1.f6500c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.f6526G
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L86
            E1.a r1 = new E1.a
            r2 = 0
            r1.<init>(r5, r2)
            goto L94
        L86:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L98
            E1.a r1 = new E1.a
            r2 = 1
            r1.<init>(r5, r2)
        L94:
            r4.v(r1, r0)
            return
        L98:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.w(android.widget.ImageView):void");
    }

    public final l x(Object obj) {
        if (this.f1217n) {
            return clone().x(obj);
        }
        this.f6529J = obj;
        this.f6533O = true;
        k();
        return this;
    }
}
