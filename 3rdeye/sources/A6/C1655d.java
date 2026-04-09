package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.x0;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* compiled from: AppNode.kt */
@M9.h
/* renamed from: a6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1655d {
    public static final b Companion = new b(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    /* compiled from: AppNode.kt */
    /* renamed from: a6.d$a */
    public static final class a implements H<C1655d> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AppNode", aVar, 3);
            c1547o0.k("bundle", false);
            c1547o0.k("ver", false);
            c1547o0.k(FacebookMediationAdapter.KEY_ID, false);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            return new M9.b[]{c02, c02, c02};
        }

        @Override // M9.b
        public C1655d deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            int i = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            boolean z10 = true;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strN = bVarD.n(descriptor2, 0);
                    i |= 1;
                } else if (iX == 1) {
                    strN2 = bVarD.n(descriptor2, 1);
                    i |= 2;
                } else {
                    if (iX != 2) {
                        throw new n(iX);
                    }
                    strN3 = bVarD.n(descriptor2, 2);
                    i |= 4;
                }
            }
            bVarD.b(descriptor2);
            return new C1655d(i, strN, strN2, strN3, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1655d value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1655d.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: AppNode.kt */
    /* renamed from: a6.d$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1655d> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public /* synthetic */ C1655d(int i, String str, String str2, String str3, x0 x0Var) {
        if (7 != (i & 7)) {
            G0.a(i, 7, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ C1655d copy$default(C1655d c1655d, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1655d.bundle;
        }
        if ((i & 2) != 0) {
            str2 = c1655d.ver;
        }
        if ((i & 4) != 0) {
            str3 = c1655d.appId;
        }
        return c1655d.copy(str, str2, str3);
    }

    public static final void write$Self(C1655d self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.bundle);
        output.k(serialDesc, 1, self.ver);
        output.k(serialDesc, 2, self.appId);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final C1655d copy(String bundle, String ver, String appId) {
        kotlin.jvm.internal.l.f(bundle, "bundle");
        kotlin.jvm.internal.l.f(ver, "ver");
        kotlin.jvm.internal.l.f(appId, "appId");
        return new C1655d(bundle, ver, appId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655d)) {
            return false;
        }
        C1655d c1655d = (C1655d) obj;
        return kotlin.jvm.internal.l.b(this.bundle, c1655d.bundle) && kotlin.jvm.internal.l.b(this.ver, c1655d.ver) && kotlin.jvm.internal.l.b(this.appId, c1655d.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + B4.g.n(this.bundle.hashCode() * 31, 31, this.ver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppNode(bundle=");
        sb.append(this.bundle);
        sb.append(", ver=");
        sb.append(this.ver);
        sb.append(", appId=");
        return B8.j(sb, this.appId, ')');
    }

    public C1655d(String bundle, String ver, String appId) {
        kotlin.jvm.internal.l.f(bundle, "bundle");
        kotlin.jvm.internal.l.f(ver, "ver");
        kotlin.jvm.internal.l.f(appId, "appId");
        this.bundle = bundle;
        this.ver = ver;
        this.appId = appId;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }
}
