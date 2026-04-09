package com.bumptech.glide;

import a3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import d3.AbstractC4269a;
import d3.C4270b;
import d3.InterfaceC4272d;
import d3.InterfaceC4273e;
import d3.InterfaceC4274f;
import e3.InterfaceC4313g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import m0.C5308a;
import t4.C5606d;

/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public final class k<TranscodeType> extends AbstractC4269a<k<TranscodeType>> {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f22265A = true;

    /* renamed from: B, reason: collision with root package name */
    public boolean f22266B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f22267C;

    /* renamed from: r, reason: collision with root package name */
    public final Context f22268r;

    /* renamed from: s, reason: collision with root package name */
    public final l f22269s;

    /* renamed from: t, reason: collision with root package name */
    public final Class<TranscodeType> f22270t;

    /* renamed from: u, reason: collision with root package name */
    public final e f22271u;

    /* renamed from: v, reason: collision with root package name */
    public m<?, ? super TranscodeType> f22272v;

    /* renamed from: w, reason: collision with root package name */
    public Object f22273w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f22274x;

    /* renamed from: y, reason: collision with root package name */
    public k<TranscodeType> f22275y;

    /* renamed from: z, reason: collision with root package name */
    public k<TranscodeType> f22276z;

    /* compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22277a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22278b;

        static {
            int[] iArr = new int[h.values().length];
            f22278b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22278b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22278b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22278b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f22277a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22277a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22277a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22277a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22277a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22277a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22277a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22277a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        d3.g gVar;
        this.f22269s = lVar;
        this.f22270t = cls;
        this.f22268r = context;
        C5308a c5308a = lVar.f22280b.f22239d.f22250f;
        m<?, ? super TranscodeType> mVar = (m) c5308a.get(cls);
        if (mVar == null) {
            Iterator it = ((C5308a.C0496a) c5308a.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        this.f22272v = mVar == null ? e.f22244k : mVar;
        this.f22271u = bVar.f22239d;
        Iterator<InterfaceC4274f<Object>> it2 = lVar.f22287j.iterator();
        while (it2.hasNext()) {
            r((InterfaceC4274f) it2.next());
        }
        synchronized (lVar) {
            gVar = lVar.f22288k;
        }
        a(gVar);
    }

    @Override // d3.AbstractC4269a
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (super.equals(kVar)) {
            return Objects.equals(this.f22270t, kVar.f22270t) && this.f22272v.equals(kVar.f22272v) && Objects.equals(this.f22273w, kVar.f22273w) && Objects.equals(this.f22274x, kVar.f22274x) && Objects.equals(this.f22275y, kVar.f22275y) && Objects.equals(this.f22276z, kVar.f22276z) && this.f22265A == kVar.f22265A && this.f22266B == kVar.f22266B;
        }
        return false;
    }

    @Override // d3.AbstractC4269a
    public final int hashCode() {
        return h3.l.g(this.f22266B ? 1 : 0, h3.l.g(this.f22265A ? 1 : 0, h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(h3.l.h(super.hashCode(), this.f22270t), this.f22272v), this.f22273w), this.f22274x), this.f22275y), this.f22276z), null)));
    }

    public final k<TranscodeType> r(InterfaceC4274f<TranscodeType> interfaceC4274f) {
        if (this.f37384o) {
            return clone().r(interfaceC4274f);
        }
        if (interfaceC4274f != null) {
            if (this.f22274x == null) {
                this.f22274x = new ArrayList();
            }
            this.f22274x.add(interfaceC4274f);
        }
        k();
        return this;
    }

    @Override // d3.AbstractC4269a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final k<TranscodeType> a(AbstractC4269a<?> abstractC4269a) {
        C5606d.k(abstractC4269a);
        return (k) super.a(abstractC4269a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC4272d t(Object obj, InterfaceC4313g interfaceC4313g, InterfaceC4273e interfaceC4273e, m mVar, h hVar, int i, int i10, AbstractC4269a abstractC4269a) {
        InterfaceC4273e interfaceC4273e2;
        InterfaceC4273e c4270b;
        InterfaceC4273e interfaceC4273e3;
        AbstractC4269a abstractC4269a2;
        d3.h hVar2;
        h hVar3;
        if (this.f22276z != null) {
            c4270b = new C4270b(obj, interfaceC4273e);
            interfaceC4273e2 = c4270b;
        } else {
            interfaceC4273e2 = null;
            c4270b = interfaceC4273e;
        }
        k<TranscodeType> kVar = this.f22275y;
        if (kVar == null) {
            interfaceC4273e3 = interfaceC4273e2;
            Object obj2 = this.f22273w;
            ArrayList arrayList = this.f22274x;
            e eVar = this.f22271u;
            N2.m mVar2 = eVar.f22251g;
            mVar.getClass();
            abstractC4269a2 = abstractC4269a;
            hVar2 = new d3.h(this.f22268r, eVar, obj, obj2, this.f22270t, abstractC4269a2, i, i10, hVar, interfaceC4313g, arrayList, c4270b, mVar2);
        } else {
            if (this.f22267C) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            m mVar3 = kVar.f22265A ? mVar : kVar.f22272v;
            if (AbstractC4269a.g(kVar.f37372b, 8)) {
                hVar3 = this.f22275y.f37374d;
            } else {
                int i11 = a.f22278b[hVar.ordinal()];
                if (i11 == 1) {
                    hVar3 = h.NORMAL;
                } else if (i11 == 2) {
                    hVar3 = h.HIGH;
                } else {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalArgumentException("unknown priority: " + this.f37374d);
                    }
                    hVar3 = h.IMMEDIATE;
                }
            }
            h hVar4 = hVar3;
            k<TranscodeType> kVar2 = this.f22275y;
            int i12 = kVar2.f37377g;
            int i13 = kVar2.f37376f;
            if (h3.l.i(i, i10)) {
                k<TranscodeType> kVar3 = this.f22275y;
                if (!h3.l.i(kVar3.f37377g, kVar3.f37376f)) {
                    i12 = abstractC4269a.f37377g;
                    i13 = abstractC4269a.f37376f;
                }
            }
            int i14 = i13;
            int i15 = i12;
            d3.i iVar = new d3.i(obj, c4270b);
            Object obj3 = this.f22273w;
            ArrayList arrayList2 = this.f22274x;
            e eVar2 = this.f22271u;
            N2.m mVar4 = eVar2.f22251g;
            mVar.getClass();
            d3.i iVar2 = iVar;
            interfaceC4273e3 = interfaceC4273e2;
            d3.h hVar5 = new d3.h(this.f22268r, eVar2, obj, obj3, this.f22270t, abstractC4269a, i, i10, hVar, interfaceC4313g, arrayList2, iVar2, mVar4);
            this.f22267C = true;
            k<TranscodeType> kVar4 = this.f22275y;
            InterfaceC4272d interfaceC4272dT = kVar4.t(obj, interfaceC4313g, iVar2, mVar3, hVar4, i15, i14, kVar4);
            this.f22267C = false;
            iVar2.f37422c = hVar5;
            iVar2.f37423d = interfaceC4272dT;
            abstractC4269a2 = abstractC4269a;
            hVar2 = iVar2;
        }
        if (interfaceC4273e3 == null) {
            return hVar2;
        }
        k<TranscodeType> kVar5 = this.f22276z;
        int i16 = kVar5.f37377g;
        int i17 = kVar5.f37376f;
        if (h3.l.i(i, i10)) {
            k<TranscodeType> kVar6 = this.f22276z;
            if (!h3.l.i(kVar6.f37377g, kVar6.f37376f)) {
                i16 = abstractC4269a2.f37377g;
                i17 = abstractC4269a2.f37376f;
            }
        }
        int i18 = i17;
        k<TranscodeType> kVar7 = this.f22276z;
        C4270b c4270b2 = interfaceC4273e3;
        InterfaceC4272d interfaceC4272dT2 = kVar7.t(obj, interfaceC4313g, c4270b2, kVar7.f22272v, kVar7.f37374d, i16, i18, kVar7);
        c4270b2.f37389c = hVar2;
        c4270b2.f37390d = interfaceC4272dT2;
        return c4270b2;
    }

    @Override // d3.AbstractC4269a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.f22272v = kVar.f22272v.clone();
        if (kVar.f22274x != null) {
            kVar.f22274x = new ArrayList(kVar.f22274x);
        }
        k<TranscodeType> kVar2 = kVar.f22275y;
        if (kVar2 != null) {
            kVar.f22275y = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.f22276z;
        if (kVar3 != null) {
            kVar.f22276z = kVar3.clone();
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.widget.ImageView r5) {
        /*
            r4 = this;
            h3.l.a()
            t4.C5606d.k(r5)
            int r0 = r4.f37372b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = d3.AbstractC4269a.g(r0, r1)
            if (r0 != 0) goto L71
            boolean r0 = r4.f37379j
            if (r0 == 0) goto L71
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L71
            int[] r0 = com.bumptech.glide.k.a.f22277a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L61;
                case 2: goto L4f;
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3d;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L71
        L2b:
            com.bumptech.glide.k r0 = r4.clone()
            U2.l$c r2 = U2.l.f12408b
            U2.j r3 = new U2.j
            r3.<init>()
            d3.a r0 = r0.h(r2, r3)
            r0.f37385p = r1
            goto L72
        L3d:
            com.bumptech.glide.k r0 = r4.clone()
            U2.l$e r2 = U2.l.f12407a
            U2.q r3 = new U2.q
            r3.<init>()
            d3.a r0 = r0.h(r2, r3)
            r0.f37385p = r1
            goto L72
        L4f:
            com.bumptech.glide.k r0 = r4.clone()
            U2.l$c r2 = U2.l.f12408b
            U2.j r3 = new U2.j
            r3.<init>()
            d3.a r0 = r0.h(r2, r3)
            r0.f37385p = r1
            goto L72
        L61:
            com.bumptech.glide.k r0 = r4.clone()
            U2.l$d r1 = U2.l.f12409c
            U2.i r2 = new U2.i
            r2.<init>()
            d3.a r0 = r0.h(r1, r2)
            goto L72
        L71:
            r0 = r4
        L72:
            com.bumptech.glide.e r1 = r4.f22271u
            B7.d r1 = r1.f22247c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.f22270t
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L89
            e3.b r1 = new e3.b
            r1.<init>(r5)
            goto L96
        L89:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L9a
            e3.d r1 = new e3.d
            r1.<init>(r5)
        L96:
            r4.w(r1, r0)
            return
        L9a:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.v(android.widget.ImageView):void");
    }

    public final void w(InterfaceC4313g interfaceC4313g, AbstractC4269a abstractC4269a) {
        C5606d.k(interfaceC4313g);
        if (!this.f22266B) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC4272d interfaceC4272dT = t(new Object(), interfaceC4313g, null, this.f22272v, abstractC4269a.f37374d, abstractC4269a.f37377g, abstractC4269a.f37376f, abstractC4269a);
        InterfaceC4272d interfaceC4272dG = interfaceC4313g.g();
        if (interfaceC4272dT.f(interfaceC4272dG) && (abstractC4269a.f37375e || !interfaceC4272dG.j())) {
            C5606d.l(interfaceC4272dG, "Argument must not be null");
            if (interfaceC4272dG.isRunning()) {
                return;
            }
            interfaceC4272dG.h();
            return;
        }
        this.f22269s.i(interfaceC4313g);
        interfaceC4313g.b(interfaceC4272dT);
        l lVar = this.f22269s;
        synchronized (lVar) {
            lVar.f22285g.f14157b.add(interfaceC4313g);
            o oVar = lVar.f22283e;
            oVar.f14128a.add(interfaceC4272dT);
            if (oVar.f14130c) {
                interfaceC4272dT.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                oVar.f14129b.add(interfaceC4272dT);
            } else {
                interfaceC4272dT.h();
            }
        }
    }

    public final k<TranscodeType> x(Object obj) {
        if (this.f37384o) {
            return clone().x(obj);
        }
        this.f22273w = obj;
        this.f22266B = true;
        k();
        return this;
    }
}
