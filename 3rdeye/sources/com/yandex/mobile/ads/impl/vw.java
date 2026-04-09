package com.yandex.mobile.ads.impl;

import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;

@M9.h
/* loaded from: classes3.dex */
public final class vw {
    public static final b Companion = new b(0);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34712a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f34713b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f34714c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34715d;

    public static final class a implements Q9.H<vw> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34716a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1547o0 f34717b;

        static {
            a aVar = new a();
            f34716a = aVar;
            C1547o0 c1547o0 = new C1547o0("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", aVar, 4);
            c1547o0.k("has_location_consent", false);
            c1547o0.k("age_restricted_user", false);
            c1547o0.k("has_user_consent", false);
            c1547o0.k("has_cmp_value", false);
            f34717b = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public final M9.b<?>[] childSerializers() {
            C1532h c1532h = C1532h.f11487a;
            return new M9.b[]{c1532h, N9.a.b(c1532h), N9.a.b(c1532h), c1532h};
        }

        @Override // M9.b
        public final Object deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            C1547o0 c1547o0 = f34717b;
            P9.b bVarD = decoder.d(c1547o0);
            int i = 0;
            boolean zI = false;
            boolean zI2 = false;
            Boolean bool = null;
            Boolean bool2 = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(c1547o0);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    zI = bVarD.I(c1547o0, 0);
                    i |= 1;
                } else if (iX == 1) {
                    bool = (Boolean) bVarD.G(c1547o0, 1, C1532h.f11487a, bool);
                    i |= 2;
                } else if (iX == 2) {
                    bool2 = (Boolean) bVarD.G(c1547o0, 2, C1532h.f11487a, bool2);
                    i |= 4;
                } else {
                    if (iX != 3) {
                        throw new M9.n(iX);
                    }
                    zI2 = bVarD.I(c1547o0, 3);
                    i |= 8;
                }
            }
            bVarD.b(c1547o0);
            return new vw(i, zI, bool, bool2, zI2);
        }

        @Override // M9.b
        public final O9.e getDescriptor() {
            return f34717b;
        }

        @Override // M9.b
        public final void serialize(P9.e encoder, Object obj) {
            vw value = (vw) obj;
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            C1547o0 c1547o0 = f34717b;
            P9.c cVarD = encoder.d(c1547o0);
            vw.a(value, cVarD, c1547o0);
            cVarD.b(c1547o0);
        }

        @Override // Q9.H
        public final M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    public static final class b {
        private b() {
        }

        public final M9.b<vw> serializer() {
            return a.f34716a;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    public /* synthetic */ vw(int i, boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        if (15 != (i & 15)) {
            Q9.G0.a(i, 15, a.f34716a.getDescriptor());
            throw null;
        }
        this.f34712a = z10;
        this.f34713b = bool;
        this.f34714c = bool2;
        this.f34715d = z11;
    }

    public final Boolean a() {
        return this.f34713b;
    }

    public final boolean b() {
        return this.f34715d;
    }

    public final boolean c() {
        return this.f34712a;
    }

    public final Boolean d() {
        return this.f34714c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        return this.f34712a == vwVar.f34712a && kotlin.jvm.internal.l.b(this.f34713b, vwVar.f34713b) && kotlin.jvm.internal.l.b(this.f34714c, vwVar.f34714c) && this.f34715d == vwVar.f34715d;
    }

    public final int hashCode() {
        int i = (this.f34712a ? 1231 : 1237) * 31;
        Boolean bool = this.f34713b;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f34714c;
        return (this.f34715d ? 1231 : 1237) + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelConsentsData(hasLocationConsent=" + this.f34712a + ", ageRestrictedUser=" + this.f34713b + ", hasUserConsent=" + this.f34714c + ", hasCmpValue=" + this.f34715d + ")";
    }

    public vw(boolean z10, Boolean bool, Boolean bool2, boolean z11) {
        this.f34712a = z10;
        this.f34713b = bool;
        this.f34714c = bool2;
        this.f34715d = z11;
    }

    public static final /* synthetic */ void a(vw vwVar, P9.c cVar, C1547o0 c1547o0) {
        cVar.B(c1547o0, 0, vwVar.f34712a);
        C1532h c1532h = C1532h.f11487a;
        cVar.w(c1547o0, 1, c1532h, vwVar.f34713b);
        cVar.w(c1547o0, 2, c1532h, vwVar.f34714c);
        cVar.B(c1547o0, 3, vwVar.f34715d);
    }
}
