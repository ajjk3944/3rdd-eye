package Y5;

import M9.n;
import Q9.C0;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.U;
import Q9.x0;
import Y5.b;
import Y5.e;
import Y5.h;
import Y5.i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;

/* compiled from: FirstPartyData.kt */
@M9.h
/* loaded from: classes2.dex */
public final class c {
    public static final b Companion = new b(null);
    private Map<String, String> _customData;
    private volatile Y5.b _demographic;
    private volatile e _location;
    private volatile h _revenue;
    private volatile i _sessionContext;

    /* compiled from: FirstPartyData.kt */
    public static final class a implements H<c> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.fpd.FirstPartyData", aVar, 5);
            c1547o0.k("session_context", true);
            c1547o0.k("demographic", true);
            c1547o0.k("location", true);
            c1547o0.k("revenue", true);
            c1547o0.k("custom_data", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            M9.b<?> bVarB = N9.a.b(i.a.INSTANCE);
            M9.b<?> bVarB2 = N9.a.b(b.a.INSTANCE);
            M9.b<?> bVarB3 = N9.a.b(e.a.INSTANCE);
            M9.b<?> bVarB4 = N9.a.b(h.a.INSTANCE);
            C0 c02 = C0.f11399a;
            return new M9.b[]{bVarB, bVarB2, bVarB3, bVarB4, N9.a.b(new U(c02, c02))};
        }

        @Override // M9.b
        public c deserialize(P9.d decoder) {
            l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            boolean z10 = true;
            int i = 0;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            Object objG5 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, i.a.INSTANCE, objG);
                    i |= 1;
                } else if (iX == 1) {
                    objG2 = bVarD.G(descriptor2, 1, b.a.INSTANCE, objG2);
                    i |= 2;
                } else if (iX == 2) {
                    objG3 = bVarD.G(descriptor2, 2, e.a.INSTANCE, objG3);
                    i |= 4;
                } else if (iX == 3) {
                    objG4 = bVarD.G(descriptor2, 3, h.a.INSTANCE, objG4);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new n(iX);
                    }
                    C0 c02 = C0.f11399a;
                    objG5 = bVarD.G(descriptor2, 4, new U(c02, c02), objG5);
                    i |= 16;
                }
            }
            bVarD.b(descriptor2);
            return new c(i, (i) objG, (Y5.b) objG2, (e) objG3, (h) objG4, (Map) objG5, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, c value) {
            l.f(encoder, "encoder");
            l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            c.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: FirstPartyData.kt */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<c> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    public c() {
    }

    public static final void write$Self(c self, P9.c output, O9.e serialDesc) {
        l.f(self, "self");
        l.f(output, "output");
        l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self._sessionContext != null) {
            output.w(serialDesc, 0, i.a.INSTANCE, self._sessionContext);
        }
        if (output.F(serialDesc, 1) || self._demographic != null) {
            output.w(serialDesc, 1, b.a.INSTANCE, self._demographic);
        }
        if (output.F(serialDesc, 2) || self._location != null) {
            output.w(serialDesc, 2, e.a.INSTANCE, self._location);
        }
        if (output.F(serialDesc, 3) || self._revenue != null) {
            output.w(serialDesc, 3, h.a.INSTANCE, self._revenue);
        }
        if (!output.F(serialDesc, 4) && self._customData == null) {
            return;
        }
        C0 c02 = C0.f11399a;
        output.w(serialDesc, 4, new U(c02, c02), self._customData);
    }

    public final synchronized void clearAll() {
        try {
            this._sessionContext = null;
            this._demographic = null;
            this._location = null;
            this._revenue = null;
            Map<String, String> map = this._customData;
            if (map != null) {
                map.clear();
            }
            this._customData = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map<String, String> getCustomData() {
        Map<String, String> concurrentHashMap;
        concurrentHashMap = this._customData;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this._customData = concurrentHashMap;
        }
        return concurrentHashMap;
    }

    public final synchronized Y5.b getDemographic() {
        Y5.b bVar;
        bVar = this._demographic;
        if (bVar == null) {
            bVar = new Y5.b();
            this._demographic = bVar;
        }
        return bVar;
    }

    public final synchronized e getLocation() {
        e eVar;
        eVar = this._location;
        if (eVar == null) {
            eVar = new e();
            this._location = eVar;
        }
        return eVar;
    }

    public final synchronized h getRevenue() {
        h hVar;
        hVar = this._revenue;
        if (hVar == null) {
            hVar = new h();
            this._revenue = hVar;
        }
        return hVar;
    }

    public final synchronized i getSessionContext() {
        i iVar;
        iVar = this._sessionContext;
        if (iVar == null) {
            iVar = new i();
            this._sessionContext = iVar;
        }
        return iVar;
    }

    public /* synthetic */ c(int i, i iVar, Y5.b bVar, e eVar, h hVar, Map map, x0 x0Var) {
        if ((i & 1) == 0) {
            this._sessionContext = null;
        } else {
            this._sessionContext = iVar;
        }
        if ((i & 2) == 0) {
            this._demographic = null;
        } else {
            this._demographic = bVar;
        }
        if ((i & 4) == 0) {
            this._location = null;
        } else {
            this._location = eVar;
        }
        if ((i & 8) == 0) {
            this._revenue = null;
        } else {
            this._revenue = hVar;
        }
        if ((i & 16) == 0) {
            this._customData = null;
        } else {
            this._customData = map;
        }
    }

    private static /* synthetic */ void get_customData$annotations() {
    }

    private static /* synthetic */ void get_demographic$annotations() {
    }

    private static /* synthetic */ void get_location$annotations() {
    }

    private static /* synthetic */ void get_revenue$annotations() {
    }

    private static /* synthetic */ void get_sessionContext$annotations() {
    }
}
