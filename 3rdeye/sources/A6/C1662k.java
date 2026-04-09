package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.x0;

/* compiled from: RtbToken.kt */
@M9.h
/* renamed from: a6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662k {
    public static final b Companion = new b(null);
    private final String sdkUserAgent;

    /* compiled from: RtbToken.kt */
    /* renamed from: a6.k$a */
    public static final class a implements H<C1662k> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.RtbRequest", aVar, 1);
            c1547o0.k("sdk_user_agent", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            return new M9.b[]{N9.a.b(C0.f11399a)};
        }

        @Override // M9.b
        public C1662k deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            x0 x0Var = null;
            boolean z10 = true;
            int i = 0;
            Object objG = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new n(iX);
                    }
                    objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                    i = 1;
                }
            }
            bVarD.b(descriptor2);
            return new C1662k(i, (String) objG, x0Var);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1662k value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1662k.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: RtbToken.kt */
    /* renamed from: a6.k$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1662k> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public C1662k() {
        this((String) null, 1, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C1662k copy$default(C1662k c1662k, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c1662k.sdkUserAgent;
        }
        return c1662k.copy(str);
    }

    public static final void write$Self(C1662k self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        if (!output.F(serialDesc, 0) && self.sdkUserAgent == null) {
            return;
        }
        output.w(serialDesc, 0, C0.f11399a, self.sdkUserAgent);
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final C1662k copy(String str) {
        return new C1662k(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1662k) && kotlin.jvm.internal.l.b(this.sdkUserAgent, ((C1662k) obj).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return B8.j(new StringBuilder("RtbRequest(sdkUserAgent="), this.sdkUserAgent, ')');
    }

    public /* synthetic */ C1662k(int i, String str, x0 x0Var) {
        if ((i & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public C1662k(String str) {
        this.sdkUserAgent = str;
    }

    public /* synthetic */ C1662k(String str, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
