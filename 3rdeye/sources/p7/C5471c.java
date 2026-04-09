package p7;

import M9.n;
import N7.H7;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.Q;
import com.applovin.sdk.AppLovinMediationProvider;
import kotlin.jvm.internal.l;

/* compiled from: ViewPreCreationProfile.kt */
@M9.h
/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5471c {
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public final int f45251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45253c;

    /* compiled from: ViewPreCreationProfile.kt */
    /* renamed from: p7.c$a */
    public static final class a implements H<C5471c> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45254a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C1547o0 f45255b;

        static {
            a aVar = new a();
            f45254a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.div.internal.viewpool.PreCreationModel", aVar, 3);
            c1547o0.k("capacity", false);
            c1547o0.k("min", true);
            c1547o0.k(AppLovinMediationProvider.MAX, true);
            f45255b = c1547o0;
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            Q q10 = Q.f11448a;
            return new M9.b[]{q10, q10, q10};
        }

        @Override // M9.b
        public final Object deserialize(P9.d dVar) {
            C1547o0 c1547o0 = f45255b;
            P9.b bVarD = dVar.d(c1547o0);
            boolean z10 = true;
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    i10 = bVarD.i(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    i11 = bVarD.i(c1547o0, 1);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new n(iX);
                    }
                    i12 = bVarD.i(c1547o0, 2);
                    i |= 4;
                }
            }
            bVarD.b(c1547o0);
            return new C5471c(i, i10, i11, i12);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f45255b;
        }

        @Override // M9.b
        public final void serialize(P9.e eVar, Object obj) {
            C5471c value = (C5471c) obj;
            l.f(value, "value");
            C1547o0 c1547o0 = f45255b;
            P9.c cVarD = eVar.d(c1547o0);
            cVarD.n(0, value.f45251a, c1547o0);
            boolean zF = cVarD.F(c1547o0, 1);
            int i = value.f45252b;
            if (zF || i != 0) {
                cVarD.n(1, i, c1547o0);
            }
            boolean zF2 = cVarD.F(c1547o0, 2);
            int i10 = value.f45253c;
            if (zF2 || i10 != Integer.MAX_VALUE) {
                cVarD.n(2, i10, c1547o0);
            }
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: ViewPreCreationProfile.kt */
    /* renamed from: p7.c$b */
    public static final class b {
        public final M9.b<C5471c> serializer() {
            return a.f45254a;
        }
    }

    public C5471c(int i) {
        this.f45251a = i;
        this.f45252b = 0;
        this.f45253c = Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5471c)) {
            return false;
        }
        C5471c c5471c = (C5471c) obj;
        return this.f45251a == c5471c.f45251a && this.f45252b == c5471c.f45252b && this.f45253c == c5471c.f45253c;
    }

    public final int hashCode() {
        return (((this.f45251a * 31) + this.f45252b) * 31) + this.f45253c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreCreationModel(capacity=");
        sb.append(this.f45251a);
        sb.append(", min=");
        sb.append(this.f45252b);
        sb.append(", max=");
        return H7.p(sb, this.f45253c, ')');
    }

    public C5471c(int i, int i10, int i11, int i12) {
        if (1 != (i & 1)) {
            G0.a(i, 1, a.f45255b);
            throw null;
        }
        this.f45251a = i10;
        if ((i & 2) == 0) {
            this.f45252b = 0;
        } else {
            this.f45252b = i11;
        }
        if ((i & 4) == 0) {
            this.f45253c = Integer.MAX_VALUE;
        } else {
            this.f45253c = i12;
        }
    }
}
