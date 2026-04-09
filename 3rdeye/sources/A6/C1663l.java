package a6;

import M9.n;
import N7.H7;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.Q;
import Q9.x0;
import a6.C1657f;
import a6.C1659h;
import a6.C1662k;

/* compiled from: RtbToken.kt */
@M9.h
/* renamed from: a6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1663l {
    public static final b Companion = new b(null);
    private final C1659h device;
    private final C1657f.h ext;
    private final int ordinalView;
    private final C1662k request;
    private final C1657f.j user;

    /* compiled from: RtbToken.kt */
    /* renamed from: a6.l$a */
    public static final class a implements H<C1663l> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.RtbToken", aVar, 5);
            c1547o0.k("device", false);
            c1547o0.k("user", true);
            c1547o0.k("ext", true);
            c1547o0.k(com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, true);
            c1547o0.k("ordinal_view", false);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            return new M9.b[]{C1659h.a.INSTANCE, N9.a.b(C1657f.j.a.INSTANCE), N9.a.b(C1657f.h.a.INSTANCE), N9.a.b(C1662k.a.INSTANCE), Q.f11448a};
        }

        @Override // M9.b
        public C1663l deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objH = null;
            boolean z10 = true;
            int i = 0;
            int i10 = 0;
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objH = bVarD.h(descriptor2, 0, C1659h.a.INSTANCE, objH);
                    i |= 1;
                } else if (iX == 1) {
                    objG = bVarD.G(descriptor2, 1, C1657f.j.a.INSTANCE, objG);
                    i |= 2;
                } else if (iX == 2) {
                    objG2 = bVarD.G(descriptor2, 2, C1657f.h.a.INSTANCE, objG2);
                    i |= 4;
                } else if (iX == 3) {
                    objG3 = bVarD.G(descriptor2, 3, C1662k.a.INSTANCE, objG3);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new n(iX);
                    }
                    i10 = bVarD.i(descriptor2, 4);
                    i |= 16;
                }
            }
            bVarD.b(descriptor2);
            return new C1663l(i, (C1659h) objH, (C1657f.j) objG, (C1657f.h) objG2, (C1662k) objG3, i10, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1663l value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1663l.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: RtbToken.kt */
    /* renamed from: a6.l$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1663l> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public /* synthetic */ C1663l(int i, C1659h c1659h, C1657f.j jVar, C1657f.h hVar, C1662k c1662k, int i10, x0 x0Var) {
        if (17 != (i & 17)) {
            G0.a(i, 17, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = c1659h;
        if ((i & 2) == 0) {
            this.user = null;
        } else {
            this.user = jVar;
        }
        if ((i & 4) == 0) {
            this.ext = null;
        } else {
            this.ext = hVar;
        }
        if ((i & 8) == 0) {
            this.request = null;
        } else {
            this.request = c1662k;
        }
        this.ordinalView = i10;
    }

    public static /* synthetic */ C1663l copy$default(C1663l c1663l, C1659h c1659h, C1657f.j jVar, C1657f.h hVar, C1662k c1662k, int i, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1659h = c1663l.device;
        }
        if ((i10 & 2) != 0) {
            jVar = c1663l.user;
        }
        if ((i10 & 4) != 0) {
            hVar = c1663l.ext;
        }
        if ((i10 & 8) != 0) {
            c1662k = c1663l.request;
        }
        if ((i10 & 16) != 0) {
            i = c1663l.ordinalView;
        }
        int i11 = i;
        C1657f.h hVar2 = hVar;
        return c1663l.copy(c1659h, jVar, hVar2, c1662k, i11);
    }

    public static final void write$Self(C1663l self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.y(serialDesc, 0, C1659h.a.INSTANCE, self.device);
        if (output.F(serialDesc, 1) || self.user != null) {
            output.w(serialDesc, 1, C1657f.j.a.INSTANCE, self.user);
        }
        if (output.F(serialDesc, 2) || self.ext != null) {
            output.w(serialDesc, 2, C1657f.h.a.INSTANCE, self.ext);
        }
        if (output.F(serialDesc, 3) || self.request != null) {
            output.w(serialDesc, 3, C1662k.a.INSTANCE, self.request);
        }
        output.n(4, self.ordinalView, serialDesc);
    }

    public final C1659h component1() {
        return this.device;
    }

    public final C1657f.j component2() {
        return this.user;
    }

    public final C1657f.h component3() {
        return this.ext;
    }

    public final C1662k component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    public final C1663l copy(C1659h device, C1657f.j jVar, C1657f.h hVar, C1662k c1662k, int i) {
        kotlin.jvm.internal.l.f(device, "device");
        return new C1663l(device, jVar, hVar, c1662k, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1663l)) {
            return false;
        }
        C1663l c1663l = (C1663l) obj;
        return kotlin.jvm.internal.l.b(this.device, c1663l.device) && kotlin.jvm.internal.l.b(this.user, c1663l.user) && kotlin.jvm.internal.l.b(this.ext, c1663l.ext) && kotlin.jvm.internal.l.b(this.request, c1663l.request) && this.ordinalView == c1663l.ordinalView;
    }

    public final C1659h getDevice() {
        return this.device;
    }

    public final C1657f.h getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    public final C1662k getRequest() {
        return this.request;
    }

    public final C1657f.j getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        C1657f.j jVar = this.user;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        C1657f.h hVar = this.ext;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C1662k c1662k = this.request;
        return ((iHashCode3 + (c1662k != null ? c1662k.hashCode() : 0)) * 31) + this.ordinalView;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RtbToken(device=");
        sb.append(this.device);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", ordinalView=");
        return H7.p(sb, this.ordinalView, ')');
    }

    public C1663l(C1659h device, C1657f.j jVar, C1657f.h hVar, C1662k c1662k, int i) {
        kotlin.jvm.internal.l.f(device, "device");
        this.device = device;
        this.user = jVar;
        this.ext = hVar;
        this.request = c1662k;
        this.ordinalView = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1663l(C1659h c1659h, C1657f.j jVar, C1657f.h hVar, C1662k c1662k, int i, int i10, kotlin.jvm.internal.g gVar) {
        int i11;
        C1662k c1662k2;
        jVar = (i10 & 2) != 0 ? null : jVar;
        hVar = (i10 & 4) != 0 ? null : hVar;
        if ((i10 & 8) != 0) {
            i11 = i;
            c1662k2 = null;
        } else {
            i11 = i;
            c1662k2 = c1662k;
        }
        this(c1659h, jVar, hVar, c1662k2, i11);
    }

    public static /* synthetic */ void getOrdinalView$annotations() {
    }
}
