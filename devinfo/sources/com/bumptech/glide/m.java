package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.datastore.preferences.protobuf.c1;
import com.google.android.gms.internal.measurement.i4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m extends p8.a {
    public m A;
    public final boolean B = true;
    public boolean C;
    public boolean D;

    /* renamed from: s, reason: collision with root package name */
    public final Context f6543s;

    /* renamed from: t, reason: collision with root package name */
    public final p f6544t;

    /* renamed from: u, reason: collision with root package name */
    public final Class f6545u;

    /* renamed from: v, reason: collision with root package name */
    public final h f6546v;

    /* renamed from: w, reason: collision with root package name */
    public a f6547w;

    /* renamed from: x, reason: collision with root package name */
    public Object f6548x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f6549y;

    /* renamed from: z, reason: collision with root package name */
    public m f6550z;

    static {
    }

    public m(b bVar, p pVar, Class cls, Context context) {
        p8.f fVar;
        this.f6544t = pVar;
        this.f6545u = cls;
        this.f6543s = context;
        x.e eVar = pVar.f6556a.f6472c.f6495f;
        a aVar = (a) eVar.get(cls);
        if (aVar == null) {
            Iterator it = ((c1) eVar.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f6547w = aVar == null ? h.f6489k : aVar;
        this.f6546v = bVar.f6472c;
        Iterator it2 = pVar.f6563i.iterator();
        while (it2.hasNext()) {
            v((p8.e) it2.next());
        }
        synchronized (pVar) {
            fVar = pVar.j;
        }
        a(fVar);
    }

    public final void A(q8.e eVar, p8.a aVar) {
        t8.f.b(eVar);
        if (!this.C) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        p8.c cVarX = x(new Object(), eVar, null, this.f6547w, aVar.f31455c, aVar.f31459h, aVar.g, aVar);
        p8.c cVarF = eVar.f();
        if (cVarX.h(cVarF) && (aVar.f31458f || !cVarF.b())) {
            t8.f.c(cVarF, "Argument must not be null");
            if (cVarF.isRunning()) {
                return;
            }
            cVarF.g();
            return;
        }
        this.f6544t.j(eVar);
        eVar.a(cVarX);
        p pVar = this.f6544t;
        synchronized (pVar) {
            pVar.f6561f.f28985a.add(eVar);
            i4 i4Var = pVar.f6559d;
            ((Set) i4Var.f19782c).add(cVarX);
            if (i4Var.f19781b) {
                cVarX.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) i4Var.f19783d).add(cVarX);
            } else {
                cVarX.g();
            }
        }
    }

    public final m B(eg.j jVar) {
        if (this.f31466p) {
            return clone().B(jVar);
        }
        this.f6549y = null;
        return v(jVar);
    }

    public final m C(Object obj) {
        if (this.f31466p) {
            return clone().C(obj);
        }
        this.f6548x = obj;
        this.C = true;
        n();
        return this;
    }

    @Override // p8.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return super.equals(mVar) && Objects.equals(this.f6545u, mVar.f6545u) && this.f6547w.equals(mVar.f6547w) && Objects.equals(this.f6548x, mVar.f6548x) && Objects.equals(this.f6549y, mVar.f6549y) && Objects.equals(this.f6550z, mVar.f6550z) && Objects.equals(this.A, mVar.A) && this.B == mVar.B && this.C == mVar.C;
    }

    @Override // p8.a
    public final int hashCode() {
        return t8.m.g(this.C ? 1 : 0, t8.m.g(this.B ? 1 : 0, t8.m.h(t8.m.h(t8.m.h(t8.m.h(t8.m.h(t8.m.h(t8.m.h(super.hashCode(), this.f6545u), this.f6547w), this.f6548x), this.f6549y), this.f6550z), this.A), null)));
    }

    public final m v(p8.e eVar) {
        if (this.f31466p) {
            return clone().v(eVar);
        }
        if (eVar != null) {
            if (this.f6549y == null) {
                this.f6549y = new ArrayList();
            }
            this.f6549y.add(eVar);
        }
        n();
        return this;
    }

    @Override // p8.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final m a(p8.a aVar) {
        t8.f.b(aVar);
        return (m) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p8.c x(Object obj, q8.e eVar, p8.d dVar, a aVar, i iVar, int i4, int i10, p8.a aVar2) {
        p8.d dVar2;
        p8.d bVar;
        p8.a aVar3;
        p8.g gVar;
        i iVar2;
        if (this.A != null) {
            bVar = new p8.b(obj, dVar);
            dVar2 = bVar;
        } else {
            dVar2 = null;
            bVar = dVar;
        }
        m mVar = this.f6550z;
        if (mVar == null) {
            Context context = this.f6543s;
            h hVar = this.f6546v;
            aVar3 = aVar2;
            gVar = new p8.g(context, hVar, obj, this.f6548x, this.f6545u, aVar3, i4, i10, iVar, eVar, this.f6549y, bVar, hVar.g, aVar.f6467a);
        } else {
            if (this.D) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            a aVar4 = mVar.B ? aVar : mVar.f6547w;
            if (p8.a.h(mVar.f31453a, 8)) {
                iVar2 = this.f6550z.f31455c;
            } else {
                int iOrdinal = iVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iVar2 = i.f6498a;
                } else if (iOrdinal == 2) {
                    iVar2 = i.f6499b;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("unknown priority: " + this.f31455c);
                    }
                    iVar2 = i.f6500c;
                }
            }
            i iVar3 = iVar2;
            m mVar2 = this.f6550z;
            int i11 = mVar2.f31459h;
            int i12 = mVar2.g;
            if (t8.m.i(i4, i10)) {
                m mVar3 = this.f6550z;
                if (!t8.m.i(mVar3.f31459h, mVar3.g)) {
                    i11 = aVar2.f31459h;
                    i12 = aVar2.g;
                }
            }
            int i13 = i12;
            p8.h hVar2 = new p8.h(obj, bVar);
            Context context2 = this.f6543s;
            p8.h hVar3 = hVar2;
            h hVar4 = this.f6546v;
            p8.g gVar2 = new p8.g(context2, hVar4, obj, this.f6548x, this.f6545u, aVar2, i4, i10, iVar, eVar, this.f6549y, hVar3, hVar4.g, aVar.f6467a);
            this.D = true;
            m mVar4 = this.f6550z;
            p8.c cVarX = mVar4.x(obj, eVar, hVar3, aVar4, iVar3, i11, i13, mVar4);
            this.D = false;
            hVar3.f31501c = gVar2;
            hVar3.f31502d = cVarX;
            aVar3 = aVar2;
            gVar = hVar3;
        }
        if (dVar2 == null) {
            return gVar;
        }
        m mVar5 = this.A;
        int i14 = mVar5.f31459h;
        int i15 = mVar5.g;
        if (t8.m.i(i4, i10)) {
            m mVar6 = this.A;
            if (!t8.m.i(mVar6.f31459h, mVar6.g)) {
                i14 = aVar3.f31459h;
                i15 = aVar3.g;
            }
        }
        int i16 = i15;
        m mVar7 = this.A;
        p8.b bVar2 = dVar2;
        p8.c cVarX2 = mVar7.x(obj, eVar, bVar2, mVar7.f6547w, mVar7.f31455c, i14, i16, mVar7);
        bVar2.f31471c = gVar;
        bVar2.f31472d = cVarX2;
        return bVar2;
    }

    @Override // p8.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        m mVar = (m) super.clone();
        mVar.f6547w = mVar.f6547w.clone();
        if (mVar.f6549y != null) {
            mVar.f6549y = new ArrayList(mVar.f6549y);
        }
        m mVar2 = mVar.f6550z;
        if (mVar2 != null) {
            mVar.f6550z = mVar2.clone();
        }
        m mVar3 = mVar.A;
        if (mVar3 != null) {
            mVar.A = mVar3.clone();
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(android.widget.ImageView r5) {
        /*
            r4 = this;
            t8.m.a()
            t8.f.b(r5)
            r0 = 2048(0x800, float:2.87E-42)
            int r1 = r4.f31453a
            boolean r0 = p8.a.h(r1, r0)
            if (r0 != 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.bumptech.glide.l.f6511a
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
            com.bumptech.glide.m r0 = r4.clone()
            g8.m r2 = g8.m.f24579c
            g8.h r3 = new g8.h
            r3.<init>()
            p8.a r0 = r0.i(r2, r3)
            r0.f31467q = r1
            goto L6e
        L39:
            com.bumptech.glide.m r0 = r4.clone()
            g8.m r2 = g8.m.f24578b
            g8.t r3 = new g8.t
            r3.<init>()
            p8.a r0 = r0.i(r2, r3)
            r0.f31467q = r1
            goto L6e
        L4b:
            com.bumptech.glide.m r0 = r4.clone()
            g8.m r2 = g8.m.f24579c
            g8.h r3 = new g8.h
            r3.<init>()
            p8.a r0 = r0.i(r2, r3)
            r0.f31467q = r1
            goto L6e
        L5d:
            com.bumptech.glide.m r0 = r4.clone()
            g8.m r1 = g8.m.f24580d
            g8.g r2 = new g8.g
            r2.<init>()
            p8.a r0 = r0.i(r1, r2)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.bumptech.glide.h r1 = r4.f6546v
            i7.b r1 = r1.f6492c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.f6545u
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L86
            q8.a r1 = new q8.a
            r2 = 0
            r1.<init>(r5, r2)
            goto L94
        L86:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L98
            q8.a r1 = new q8.a
            r2 = 1
            r1.<init>(r5, r2)
        L94:
            r4.A(r1, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.z(android.widget.ImageView):void");
    }
}
