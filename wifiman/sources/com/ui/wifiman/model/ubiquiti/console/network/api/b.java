package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.r;
import Y6.v;
import Y6.w;
import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import Zg.U;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.ui.wifiman.model.ubiquiti.console.UnifiConsoleConnectionError;
import com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleSpeedtest;
import com.ui.wifiman.model.ubiquiti.console.network.api.Identification;
import com.ui.wifiman.model.ubiquiti.console.network.api.b;
import eb.C5449m;
import eb.InterfaceC5443g;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.D;
import gg.i;
import gg.o;
import gg.q;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.InterfaceC6464a;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.text.C6510d;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class b implements Ud.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5443g.c f43821a;

    /* renamed from: b, reason: collision with root package name */
    private final r f43822b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f43823c;

    /* renamed from: d, reason: collision with root package name */
    private final i f43824d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SPEEDTEST_STATUS = new C1499a("SPEEDTEST_STATUS", 0);
        private final String typeId;

        /* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.b$a$a, reason: collision with other inner class name */
        static final class C1499a extends a {
            C1499a(String str, int i10) {
                super(str, i10, "speed-test:update", null);
            }

            @Override // com.ui.wifiman.model.ubiquiti.console.network.api.b.a
            public Y6.h getJsonAdapter(r moshi) {
                AbstractC6492s.i(moshi, "moshi");
                return w.a(moshi, O.m(Data.class, th.r.f62641c.d(O.l(ApiUnifiConsoleSpeedtest.State.class))));
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{SPEEDTEST_STATUS};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        public /* synthetic */ a(String str, int i10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, str2);
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract Y6.h<? extends Data<? extends com.ui.wifiman.model.ubiquiti.console.network.api.a>> getJsonAdapter(r rVar);

        public final String getTypeId() {
            return this.typeId;
        }

        private a(String str, int i10, String str2) {
            this.typeId = str2;
        }
    }

    /* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.b$b, reason: collision with other inner class name */
    static final class C1500b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1500b f43825a = new C1500b();

        C1500b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(C5449m c5449m) {
            try {
                c5449m.e();
            } catch (Throwable th2) {
                Z7.b.j("Failed to close Unifi Network API websocket", th2, null, 4, null);
            }
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final C5449m ws) {
            AbstractC6492s.i(ws, "ws");
            return ws.f().Z(new InterfaceC6464a() { // from class: com.ui.wifiman.model.ubiquiti.console.network.api.c
                @Override // kg.InterfaceC6464a
                public final void run() {
                    b.C1500b.c(ws);
                }
            });
        }
    }

    static final class c implements n {

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f43827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f43828b;

            public a(ByteBuffer byteBuffer, b bVar) {
                this.f43827a = byteBuffer;
                this.f43828b = bVar;
            }

            @Override // gg.q
            public final void a(o oVar) {
                s sVarA = null;
                try {
                    try {
                        byte[] bArrArray = this.f43827a.array();
                        b bVar = this.f43828b;
                        AbstractC6492s.f(bArrArray);
                        Identification.Meta meta = ((Identification) bVar.l(bArrArray, Identification.class)).getMeta();
                        if (meta != null) {
                            sVarA = z.a(meta, bArrArray);
                        }
                    } catch (UnifiConsoleConnectionError.RequestFailed e10) {
                        Z7.b.j("Failed to parse event message", e10, null, 4, null);
                    }
                    if (sVarA != null) {
                        oVar.onSuccess(sVarA);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(ByteBuffer responseBuffer) {
            AbstractC6492s.i(responseBuffer, "responseBuffer");
            gg.n nVarC = gg.n.c(new a(responseBuffer, b.this));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class d implements n {

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Identification.Meta f43830a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f43831b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f43832c;

            public a(Identification.Meta meta, b bVar, byte[] bArr) {
                this.f43830a = meta;
                this.f43831b = bVar;
                this.f43832c = bArr;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    String type = this.f43830a.getType();
                    com.ui.wifiman.model.ubiquiti.console.network.api.a aVar = null;
                    Y6.h hVar = type != null ? (Y6.h) this.f43831b.f43823c.get(type) : null;
                    if (hVar != null) {
                        b bVar = this.f43831b;
                        AbstractC6492s.f(this.f43832c);
                        List data = ((Data) bVar.k(this.f43832c, hVar)).getData();
                        if (data != null) {
                            aVar = (com.ui.wifiman.model.ubiquiti.console.network.api.a) AbstractC3689v.s0(data);
                        }
                    }
                    if (aVar != null) {
                        oVar.onSuccess(aVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            gg.n nVarC = gg.n.c(new a((Identification.Meta) sVar.a(), b.this, (byte[]) sVar.c()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f43833a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return gg.z.p(error);
        }
    }

    static final class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f43834a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return gg.z.p(error);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f43835a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return gg.z.p(error);
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43836a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            UnifiConsoleConnectionError unifiConsoleConnectionErrorC = UnifiConsoleConnectionError.INSTANCE.c(error);
            if (unifiConsoleConnectionErrorC != null) {
                error = unifiConsoleConnectionErrorC;
            }
            return AbstractC5912b.D(error);
        }
    }

    public b(InterfaceC5443g.c client) {
        AbstractC6492s.i(client, "client");
        this.f43821a = client;
        this.f43822b = new r.a().c();
        InterfaceC5826a<a> entries = a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (a aVar : entries) {
            String typeId = aVar.getTypeId();
            r moshi = this.f43822b;
            AbstractC6492s.h(moshi, "moshi");
            s sVarA = z.a(typeId, aVar.getJsonAdapter(moshi));
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        this.f43823c = linkedHashMap;
        i iVarI2 = InterfaceC5443g.c.b.c(this.f43821a, "wss/s/default/events?clients=v2", true, 0L, 4, null).w(C1500b.f43825a).v0(new c()).v0(new d()).X0(Gg.a.a()).F1(Gg.a.d()).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f43824d = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k(byte[] bArr, Y6.h hVar) throws UnifiConsoleConnectionError.RequestFailed {
        try {
            Object objC = hVar.c(new String(bArr, C6510d.f52215b));
            if (objC != null) {
                return objC;
            }
            throw new UnifiConsoleConnectionError.RequestFailed("Null content body when body expected", null, 2, null);
        } catch (JsonDataException e10) {
            throw new UnifiConsoleConnectionError.RequestFailed("Failed to parse content body", e10);
        } catch (JsonEncodingException e11) {
            throw new UnifiConsoleConnectionError.RequestFailed("Failed to parse content body", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(byte[] bArr, Class cls) throws UnifiConsoleConnectionError.RequestFailed {
        Y6.h hVarE = this.f43822b.c(cls).e();
        AbstractC6492s.h(hVarE, "lenient(...)");
        Object objK = k(bArr, hVarE);
        AbstractC6492s.h(objK, "deserializePayload(...)");
        return objK;
    }

    private final AbstractC5912b m(kb.o oVar, String str, String str2, Map map) {
        AbstractC5912b abstractC5912bL = this.f43821a.d(str, oVar, str2, map).W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    static /* synthetic */ AbstractC5912b n(b bVar, kb.o oVar, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            map = null;
        }
        return bVar.m(oVar, str, str2, map);
    }

    @Override // Ud.a
    public gg.z a() {
        kb.o oVar = kb.o.GET;
        r rVar = this.f43822b;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        gg.z zVarE = this.f43821a.b("v2/api/site/default/device", oVar, null, null).A(new Ud.b(this, w.a(rVar, O.l(ApiUnifiConsoleDevices.class)).e())).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        gg.z zVarF = zVarE.F(e.f43833a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    @Override // Ud.a
    public i b() {
        return this.f43824d;
    }

    @Override // Ud.a
    public AbstractC5912b c() {
        kb.o oVar = kb.o.POST;
        ApiUnifiConsoleRequestCmd apiUnifiConsoleRequestCmdA = ApiUnifiConsoleSpeedtest.f43776a.a();
        r rVar = this.f43822b;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(ApiUnifiConsoleRequestCmd.class)).i(apiUnifiConsoleRequestCmdA);
        AbstractC6492s.h(strI, "toJson(...)");
        AbstractC5912b abstractC5912bO = n(this, oVar, "api/s/default/cmd/devmgr/speedtest", strI, null, 8, null).O(h.f43836a);
        AbstractC6492s.h(abstractC5912bO, "onErrorResumeNext(...)");
        return abstractC5912bO;
    }

    @Override // Ud.a
    public gg.z d(Request request) {
        AbstractC6492s.i(request, "request");
        kb.o oVar = kb.o.POST;
        Request request2 = new Request(request.getClientID(), request.getClientName());
        r rVar = this.f43822b;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(Request.class)).i(request2);
        AbstractC6492s.h(strI, "toJson(...)");
        r rVar2 = this.f43822b;
        AbstractC6492s.h(rVar2, "access$getMoshi$p(...)");
        gg.z zVarE = this.f43821a.b("v2/api/site/default/teleport/access-request", oVar, strI, null).A(new Ud.b(this, w.a(rVar2, O.l(Response.class)).e())).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        gg.z zVarF = zVarE.F(g.f43835a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    @Override // Ud.a
    public gg.z e() {
        kb.o oVar = kb.o.GET;
        Y6.h hVarD = this.f43822b.d(v.j(List.class, ApiUnifiConsoleSiteFeature.class));
        AbstractC6492s.h(hVarD, "adapter(...)");
        gg.z zVarE = this.f43821a.b("v2/api/site/default/described-features", oVar, null, null).A(new Ud.b(this, hVarD)).O(Gg.a.d()).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        gg.z zVarF = zVarE.F(f.f43834a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
