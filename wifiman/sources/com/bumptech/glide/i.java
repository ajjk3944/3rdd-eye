package com.bumptech.glide;

import W2.l;
import android.content.Context;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class i extends com.bumptech.glide.request.a implements Cloneable {

    /* renamed from: f1, reason: collision with root package name */
    protected static final com.bumptech.glide.request.f f34212f1 = (com.bumptech.glide.request.f) ((com.bumptech.glide.request.f) ((com.bumptech.glide.request.f) new com.bumptech.glide.request.f().f(E2.a.f4020c)).R(g.LOW)).X(true);

    /* renamed from: A, reason: collision with root package name */
    private final Context f34213A;

    /* renamed from: B, reason: collision with root package name */
    private final j f34214B;

    /* renamed from: C, reason: collision with root package name */
    private final Class f34215C;

    /* renamed from: D, reason: collision with root package name */
    private final b f34216D;

    /* renamed from: E, reason: collision with root package name */
    private final d f34217E;

    /* renamed from: F, reason: collision with root package name */
    private k f34218F;

    /* renamed from: G, reason: collision with root package name */
    private Object f34219G;

    /* renamed from: H, reason: collision with root package name */
    private List f34220H;

    /* renamed from: I, reason: collision with root package name */
    private i f34221I;

    /* renamed from: J, reason: collision with root package name */
    private i f34222J;

    /* renamed from: N, reason: collision with root package name */
    private Float f34223N;

    /* renamed from: X, reason: collision with root package name */
    private boolean f34224X = true;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f34225Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f34226Z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f34227a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f34228b;

        static {
            int[] iArr = new int[g.values().length];
            f34228b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34228b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34228b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34228b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f34227a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34227a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34227a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34227a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34227a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34227a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34227a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34227a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected i(b bVar, j jVar, Class cls, Context context) {
        this.f34216D = bVar;
        this.f34214B = jVar;
        this.f34215C = cls;
        this.f34213A = context;
        this.f34218F = jVar.t(cls);
        this.f34217E = bVar.i();
        k0(jVar.r());
        b(jVar.s());
    }

    private com.bumptech.glide.request.c f0(T2.d dVar, com.bumptech.glide.request.e eVar, com.bumptech.glide.request.a aVar, Executor executor) {
        return g0(new Object(), dVar, eVar, null, this.f34218F, aVar.u(), aVar.q(), aVar.p(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.request.c g0(Object obj, T2.d dVar, com.bumptech.glide.request.e eVar, com.bumptech.glide.request.d dVar2, k kVar, g gVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        com.bumptech.glide.request.d dVar3;
        com.bumptech.glide.request.d bVar;
        if (this.f34222J != null) {
            bVar = new com.bumptech.glide.request.b(obj, dVar2);
            dVar3 = bVar;
        } else {
            dVar3 = null;
            bVar = dVar2;
        }
        com.bumptech.glide.request.c cVarH0 = h0(obj, dVar, eVar, bVar, kVar, gVar, i10, i11, aVar, executor);
        if (dVar3 == null) {
            return cVarH0;
        }
        int iQ = this.f34222J.q();
        int iP = this.f34222J.p();
        if (l.t(i10, i11) && !this.f34222J.O()) {
            iQ = aVar.q();
            iP = aVar.p();
        }
        i iVar = this.f34222J;
        com.bumptech.glide.request.b bVar2 = dVar3;
        bVar2.o(cVarH0, iVar.g0(obj, dVar, eVar, bVar2, iVar.f34218F, iVar.u(), iQ, iP, this.f34222J, executor));
        return bVar2;
    }

    private com.bumptech.glide.request.c h0(Object obj, T2.d dVar, com.bumptech.glide.request.e eVar, com.bumptech.glide.request.d dVar2, k kVar, g gVar, int i10, int i11, com.bumptech.glide.request.a aVar, Executor executor) {
        i iVar = this.f34221I;
        if (iVar == null) {
            if (this.f34223N == null) {
                return s0(obj, dVar, eVar, aVar, dVar2, kVar, gVar, i10, i11, executor);
            }
            com.bumptech.glide.request.i iVar2 = new com.bumptech.glide.request.i(obj, dVar2);
            iVar2.n(s0(obj, dVar, eVar, aVar, iVar2, kVar, gVar, i10, i11, executor), s0(obj, dVar, eVar, aVar.clone().W(this.f34223N.floatValue()), iVar2, kVar, j0(gVar), i10, i11, executor));
            return iVar2;
        }
        if (this.f34226Z) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        k kVar2 = iVar.f34224X ? kVar : iVar.f34218F;
        g gVarU = iVar.I() ? this.f34221I.u() : j0(gVar);
        int iQ = this.f34221I.q();
        int iP = this.f34221I.p();
        if (l.t(i10, i11) && !this.f34221I.O()) {
            iQ = aVar.q();
            iP = aVar.p();
        }
        com.bumptech.glide.request.i iVar3 = new com.bumptech.glide.request.i(obj, dVar2);
        com.bumptech.glide.request.c cVarS0 = s0(obj, dVar, eVar, aVar, iVar3, kVar, gVar, i10, i11, executor);
        this.f34226Z = true;
        i iVar4 = this.f34221I;
        com.bumptech.glide.request.c cVarG0 = iVar4.g0(obj, dVar, eVar, iVar3, kVar2, gVarU, iQ, iP, iVar4, executor);
        this.f34226Z = false;
        iVar3.n(cVarS0, cVarG0);
        return iVar3;
    }

    private g j0(g gVar) {
        int i10 = a.f34228b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + u());
    }

    private void k0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0((com.bumptech.glide.request.e) it.next());
        }
    }

    private T2.d m0(T2.d dVar, com.bumptech.glide.request.e eVar, com.bumptech.glide.request.a aVar, Executor executor) {
        W2.k.d(dVar);
        if (!this.f34225Y) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.c cVarF0 = f0(dVar, eVar, aVar, executor);
        com.bumptech.glide.request.c cVarJ = dVar.j();
        if (cVarF0.d(cVarJ) && !o0(aVar, cVarJ)) {
            if (!((com.bumptech.glide.request.c) W2.k.d(cVarJ)).isRunning()) {
                cVarJ.i();
            }
            return dVar;
        }
        this.f34214B.p(dVar);
        dVar.e(cVarF0);
        this.f34214B.z(dVar, cVarF0);
        return dVar;
    }

    private boolean o0(com.bumptech.glide.request.a aVar, com.bumptech.glide.request.c cVar) {
        return !aVar.H() && cVar.isComplete();
    }

    private i r0(Object obj) {
        if (F()) {
            return clone().r0(obj);
        }
        this.f34219G = obj;
        this.f34225Y = true;
        return (i) U();
    }

    private com.bumptech.glide.request.c s0(Object obj, T2.d dVar, com.bumptech.glide.request.e eVar, com.bumptech.glide.request.a aVar, com.bumptech.glide.request.d dVar2, k kVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f34213A;
        d dVar3 = this.f34217E;
        return com.bumptech.glide.request.h.y(context, dVar3, obj, this.f34219G, this.f34215C, aVar, i10, i11, gVar, dVar, eVar, this.f34220H, dVar2, dVar3.e(), kVar.c(), executor);
    }

    public i d0(com.bumptech.glide.request.e eVar) {
        if (F()) {
            return clone().d0(eVar);
        }
        if (eVar != null) {
            if (this.f34220H == null) {
                this.f34220H = new ArrayList();
            }
            this.f34220H.add(eVar);
        }
        return (i) U();
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public i b(com.bumptech.glide.request.a aVar) {
        W2.k.d(aVar);
        return (i) super.b(aVar);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return super.equals(iVar) && Objects.equals(this.f34215C, iVar.f34215C) && this.f34218F.equals(iVar.f34218F) && Objects.equals(this.f34219G, iVar.f34219G) && Objects.equals(this.f34220H, iVar.f34220H) && Objects.equals(this.f34221I, iVar.f34221I) && Objects.equals(this.f34222J, iVar.f34222J) && Objects.equals(this.f34223N, iVar.f34223N) && this.f34224X == iVar.f34224X && this.f34225Y == iVar.f34225Y;
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return l.p(this.f34225Y, l.p(this.f34224X, l.o(this.f34223N, l.o(this.f34222J, l.o(this.f34221I, l.o(this.f34220H, l.o(this.f34219G, l.o(this.f34218F, l.o(this.f34215C, super.hashCode())))))))));
    }

    @Override // com.bumptech.glide.request.a
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public i clone() {
        i iVar = (i) super.clone();
        iVar.f34218F = iVar.f34218F.clone();
        if (iVar.f34220H != null) {
            iVar.f34220H = new ArrayList(iVar.f34220H);
        }
        i iVar2 = iVar.f34221I;
        if (iVar2 != null) {
            iVar.f34221I = iVar2.clone();
        }
        i iVar3 = iVar.f34222J;
        if (iVar3 != null) {
            iVar.f34222J = iVar3.clone();
        }
        return iVar;
    }

    public T2.d l0(T2.d dVar) {
        return n0(dVar, null, W2.e.b());
    }

    T2.d n0(T2.d dVar, com.bumptech.glide.request.e eVar, Executor executor) {
        return m0(dVar, eVar, this, executor);
    }

    public i p0(Object obj) {
        return r0(obj);
    }
}
