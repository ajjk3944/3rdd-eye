package com.ui.wmw.api.v1;

import Lf.b;
import Y6.r;
import Y6.w;
import Zg.AbstractC3689v;
import Zg.U;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.ui.binme.BinaryMessage;
import com.ui.comm.v4.a;
import com.ui.comm.v4.b;
import com.ui.wmw.WMWizard;
import com.ui.wmw.api.ApiVersion;
import com.ui.wmw.api.v1.ApiV1SettingsRequest;
import com.ui.wmw.api.v1.a;
import com.ui.wmw.api.v1.b;
import com.ui.wmw.api.v1.f;
import e9.C5432d;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.D;
import gg.q;
import gg.s;
import gg.z;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6467d;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import kotlin.text.C6510d;
import mh.InterfaceC6824a;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class f implements com.ui.wmw.api.v1.a {

    /* renamed from: g, reason: collision with root package name */
    public static final a f45431g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f45432a;

    /* renamed from: b, reason: collision with root package name */
    private final C5432d f45433b;

    /* renamed from: c, reason: collision with root package name */
    private final r f45434c;

    /* renamed from: d, reason: collision with root package name */
    private final s f45435d;

    /* renamed from: e, reason: collision with root package name */
    private final com.ui.comm.v4.b f45436e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f45437f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45438a;

        static {
            int[] iArr = new int[a.EnumC1672a.values().length];
            try {
                iArr[a.EnumC1672a.STATISTICS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC1672a.STATISTICS_PERIODIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC1672a.FIRMWARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC1672a.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC1672a.SETTINGS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC1672a.WIFI_SCAN_DONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f45438a = iArr;
        }
    }

    static final class c implements kg.n {

        public static final class a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f45440a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.comm.v4.a f45441b;

            public a(f fVar, com.ui.comm.v4.a aVar) {
                this.f45440a = fVar;
                this.f45441b = aVar;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    com.ui.wmw.api.v1.b bVarU = this.f45440a.u((a.e) this.f45441b);
                    if (bVarU != null) {
                        oVar.onSuccess(bVarU);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e(com.ui.comm.v4.a aVar) {
            return "WMW API - Event " + aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String f(com.ui.comm.v4.a aVar) {
            return "WMW API - Error " + aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String g(com.ui.comm.v4.a aVar) {
            return "WMW API - Log - " + aVar;
        }

        @Override // kg.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(final com.ui.comm.v4.a msg) {
            AbstractC6492s.i(msg, "msg");
            if (msg instanceof a.e) {
                Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.g
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.c.e(msg);
                    }
                });
                gg.n nVarC = gg.n.c(new a(f.this, msg));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
            if (msg instanceof a.c) {
                Nf.a.f(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.h
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.c.f(msg);
                    }
                }, null, 2, null);
                gg.n nVarH = gg.n.h();
                AbstractC6492s.f(nVarH);
                return nVarH;
            }
            if (msg instanceof a.h) {
                Nf.a.f(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.i
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.c.g(msg);
                    }
                }, null, 2, null);
                gg.n nVarH2 = gg.n.h();
                AbstractC6492s.f(nVarH2);
                return nVarH2;
            }
            if (!(msg instanceof a.i) && !(msg instanceof a.j) && !(msg instanceof a.f) && !(msg instanceof a.g) && !(msg instanceof a.C1303a) && !(msg instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.n nVarH3 = gg.n.h();
            AbstractC6492s.h(nVarH3, "empty(...)");
            return nVarH3;
        }
    }

    public static final class d implements kg.n {
        public d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ChunkRequest.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f45443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InputStream f45444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f45445c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f45446d;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f45447a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof IOException ? gg.n.i(new WMWizard.Error.Session.RequestFailed("Failed to load fw file content", error)) : gg.n.i(error);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L f45448a;

            b(L l10) {
                this.f45448a = l10;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f45448a.f51687a = 0;
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f45449a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f45450b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ M f45451c;

            static final class a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ M f45452a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ byte[] f45453b;

                a(M m10, byte[] bArr) {
                    this.f45452a = m10;
                    this.f45453b = bArr;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(ChunkRequest it) {
                    AbstractC6492s.i(it, "it");
                    this.f45452a.f51688a += this.f45453b.length;
                }
            }

            public static final class b implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ f f45454a;

                public b(f fVar) {
                    this.f45454a = fVar;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.r apply(a.g it) {
                    AbstractC6492s.i(it, "it");
                    if (it.a().a().length == 0) {
                        return gg.n.h();
                    }
                    f fVar = this.f45454a;
                    byte[] bArrA = it.a().a();
                    try {
                        r rVar = fVar.f45434c;
                        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                        Object objC = w.a(rVar, O.l(ChunkRequest.class)).e().c(new String(bArrA, C6510d.f52215b));
                        if (objC != null) {
                            return gg.n.o(objC);
                        }
                        throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
                    } catch (JsonDataException e10) {
                        throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
                    } catch (JsonEncodingException e11) {
                        throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
                    }
                }
            }

            c(f fVar, boolean z10, M m10) {
                this.f45449a = fVar;
                this.f45450b = z10;
                this.f45451c = m10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(byte[] requestBodyPayload) {
                AbstractC6492s.i(requestBodyPayload, "requestBodyPayload");
                f fVar = this.f45449a;
                b.a aVar = b.a.POST;
                String id2 = aVar.getId();
                a.EnumC1672a enumC1672a = a.EnumC1672a.FIRMWARE_UPLOAD_DATA;
                a.f fVar2 = new a.f(id2, enumC1672a.getPath(this.f45449a.f45432a), U.h(), new com.ui.comm.v4.b(b.a.BINARY, requestBodyPayload));
                if (this.f45450b) {
                    BinaryMessage.b bVar = BinaryMessage.b.ENABLED;
                    fVar2.e(bVar);
                    fVar2.d(bVar);
                }
                gg.n nVarS = fVar.f45433b.e(fVar2).A(new o(fVar2)).Q(60000L, TimeUnit.MILLISECONDS).u(new b(fVar)).s(new p(fVar2));
                AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
                z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
                AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
                return zVarX.o(new a(this.f45451c, requestBodyPayload));
            }
        }

        static final class d implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M f45455a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f45456b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ J f45457c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ N f45458d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ChunkRequest f45459e;

            public /* synthetic */ class a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f45460a;

                static {
                    int[] iArr = new int[com.ui.wmw.api.v1.c.values().length];
                    try {
                        iArr[com.ui.wmw.api.v1.c.IN_PROGRESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.ui.wmw.api.v1.c.IDLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.ui.wmw.api.v1.c.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[com.ui.wmw.api.v1.c.COMPLETE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f45460a = iArr;
                }
            }

            d(M m10, long j10, J j11, N n10, ChunkRequest chunkRequest) {
                this.f45455a = m10;
                this.f45456b = j10;
                this.f45457c = j11;
                this.f45458d = n10;
                this.f45459e = chunkRequest;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String d() {
                return "WMW API - Firmware Uploaded request completed";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String e(ChunkRequest chunkRequest) {
                return "WMW API - Firmware Uploaded Changing chunk size to " + chunkRequest.getChunkSize();
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final void accept(ChunkRequest chunkRequest) {
                AbstractC6492s.i(chunkRequest, "chunkRequest");
                com.ui.wmw.api.v1.c cVarC = chunkRequest.c();
                int i10 = cVarC == null ? -1 : a.f45460a[cVarC.ordinal()];
                if (i10 != -1 && i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        throw new WMWizard.Error.Session.RequestFailed("Firmware upload failed", null, 2, null);
                    }
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.f45455a.f51688a != this.f45456b) {
                        throw new WMWizard.Error.Session.InvalidResponse.Content("Firmware upload complete signalled by the device but we didn't sent all the data", null, 2, null);
                    }
                    Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.l
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return f.e.d.d();
                        }
                    });
                    this.f45457c.f51685a = true;
                }
                if (this.f45457c.f51685a || ((byte[]) this.f45458d.f51689a).length == chunkRequest.getChunkSize()) {
                    return;
                }
                this.f45458d.f51689a = new byte[chunkRequest.getChunkSize()];
                final ChunkRequest chunkRequest2 = this.f45459e;
                Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.m
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.e.d.e(chunkRequest2);
                    }
                });
            }
        }

        /* renamed from: com.ui.wmw.api.v1.f$e$e, reason: collision with other inner class name */
        static final class C1674e implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f45461a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f45462b;

            C1674e(long j10, M m10) {
                this.f45461a = j10;
                this.f45462b = m10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.ui.wmw.api.v1.d apply(ChunkRequest it) {
                AbstractC6492s.i(it, "it");
                return new com.ui.wmw.api.v1.d(this.f45461a, this.f45462b.f51688a);
            }
        }

        /* renamed from: com.ui.wmw.api.v1.f$e$f, reason: collision with other inner class name */
        public static final class C1675f implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L f45463a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InputStream f45464b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ N f45465c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ L f45466d;

            public C1675f(L l10, InputStream inputStream, N n10, L l11) {
                this.f45463a = l10;
                this.f45464b = inputStream;
                this.f45465c = n10;
                this.f45466d = l11;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    L l10 = this.f45463a;
                    InputStream inputStream = this.f45464b;
                    Object obj = this.f45465c.f51689a;
                    int i10 = this.f45466d.f51687a;
                    l10.f51687a = inputStream.read((byte[]) obj, i10, ((byte[]) obj).length - i10);
                    int i11 = this.f45463a.f51687a;
                    if (i11 < 0) {
                        throw new WMWizard.Error.Session.RequestFailed("Failed to read fw file", null, 2, null);
                    }
                    L l11 = this.f45466d;
                    int i12 = l11.f51687a + i11;
                    l11.f51687a = i12;
                    Object obj2 = this.f45465c.f51689a;
                    byte[] bArr = i12 == ((byte[]) obj2).length ? (byte[]) obj2 : null;
                    if (bArr != null) {
                        oVar.onSuccess(bArr);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        e(long j10, InputStream inputStream, f fVar, boolean z10) {
            this.f45443a = j10;
            this.f45444b = inputStream;
            this.f45445c = fVar;
            this.f45446d = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d(ChunkRequest chunkRequest) {
            return "WMW API - Firmware Uploaded started with chunk size " + chunkRequest.getChunkSize() + " and state " + chunkRequest.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean e(J j10) {
            return j10.f51685a;
        }

        @Override // kg.n
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final ChunkRequest initialChunkRequest) {
            AbstractC6492s.i(initialChunkRequest, "initialChunkRequest");
            Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.j
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return f.e.d(initialChunkRequest);
                }
            });
            M m10 = new M();
            final J j10 = new J();
            N n10 = new N();
            n10.f51689a = new byte[initialChunkRequest.getChunkSize()];
            L l10 = new L();
            gg.n nVarC = gg.n.c(new C1675f(new L(), this.f45444b, n10, l10));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC.s(a.f45447a).t().o0().n(new b(l10)).s(new c(this.f45445c, this.f45446d, m10)).o(new d(m10, this.f45443a, j10, n10, initialChunkRequest)).J(new InterfaceC6467d() { // from class: com.ui.wmw.api.v1.k
                @Override // kg.InterfaceC6467d
                public final boolean a() {
                    return f.e.e(j10);
                }
            }).N0(new C1674e(this.f45443a, m10)).z1(new com.ui.wmw.api.v1.d(this.f45443a, m10.f51688a));
        }
    }

    /* renamed from: com.ui.wmw.api.v1.f$f, reason: collision with other inner class name */
    public static final class C1676f implements kg.n {
        public C1676f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1BluetoothSettings.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class g implements kg.n {
        public g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1Device.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class h implements kg.n {
        public h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1Firmware.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class i implements kg.n {
        public i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1Settings.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class j implements kg.n {
        public j() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1DeviceStatistics.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class k implements kg.n {
        public k() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiVersion.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public static final class l implements kg.n {
        public l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(a.g it) {
            AbstractC6492s.i(it, "it");
            if (it.a().a().length == 0) {
                return gg.n.h();
            }
            f fVar = f.this;
            byte[] bArrA = it.a().a();
            try {
                r rVar = fVar.f45434c;
                AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                Object objC = w.a(rVar, O.l(ApiV1WifiScanResult.class)).e().c(new String(bArrA, C6510d.f52215b));
                if (objC != null) {
                    return gg.n.o(objC);
                }
                throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
            } catch (JsonDataException e10) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
            } catch (JsonEncodingException e11) {
                throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
            }
        }
    }

    public /* synthetic */ f(String str, C5432d c5432d, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c5432d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(a.e eVar) {
        return "WMW API - Unknown event received " + eVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ui.wmw.api.v1.b u(final a.e eVar) {
        a.EnumC1672a enumC1672a = (a.EnumC1672a) this.f45437f.get(eVar.f());
        if (enumC1672a == null) {
            return null;
        }
        switch (b.f45438a[enumC1672a.ordinal()]) {
            case 1:
            case 2:
                byte[] bArrA = eVar.a().a();
                try {
                    r rVar = this.f45434c;
                    AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
                    Object objC = w.a(rVar, O.l(ApiV1DeviceStatistics.class)).e().c(new String(bArrA, C6510d.f52215b));
                    if (objC != null) {
                        return new b.d((ApiV1DeviceStatistics) objC);
                    }
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
                } catch (JsonDataException e10) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e10);
                } catch (JsonEncodingException e11) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e11);
                }
            case 3:
                byte[] bArrA2 = eVar.a().a();
                try {
                    r rVar2 = this.f45434c;
                    AbstractC6492s.h(rVar2, "access$getMoshi$p(...)");
                    Object objC2 = w.a(rVar2, O.l(ApiV1Firmware.class)).e().c(new String(bArrA2, C6510d.f52215b));
                    if (objC2 != null) {
                        return new b.C1673b((ApiV1Firmware) objC2);
                    }
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
                } catch (JsonDataException e12) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e12);
                } catch (JsonEncodingException e13) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e13);
                }
            case 4:
                byte[] bArrA3 = eVar.a().a();
                try {
                    r rVar3 = this.f45434c;
                    AbstractC6492s.h(rVar3, "access$getMoshi$p(...)");
                    Object objC3 = w.a(rVar3, O.l(ApiV1BluetoothSettings.class)).e().c(new String(bArrA3, C6510d.f52215b));
                    if (objC3 != null) {
                        return new b.a((ApiV1BluetoothSettings) objC3);
                    }
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
                } catch (JsonDataException e14) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e14);
                } catch (JsonEncodingException e15) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e15);
                }
            case 5:
                return b.c.f45424a;
            case 6:
                byte[] bArrA4 = eVar.a().a();
                try {
                    r rVar4 = this.f45434c;
                    AbstractC6492s.h(rVar4, "access$getMoshi$p(...)");
                    Object objC4 = w.a(rVar4, O.l(ApiV1WifiScanDone.class)).e().c(new String(bArrA4, C6510d.f52215b));
                    if (objC4 != null) {
                        return new b.e((ApiV1WifiScanDone) objC4);
                    }
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Null content body when body expected", null, 2, null);
                } catch (JsonDataException e16) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e16);
                } catch (JsonEncodingException e17) {
                    throw new WMWizard.Error.Session.InvalidResponse.Content("Failed to parse content body", e17);
                }
            default:
                Nf.a.d(new InterfaceC6824a() { // from class: com.ui.wmw.api.v1.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return f.o(eVar);
                    }
                });
                return null;
        }
    }

    @Override // com.ui.wmw.api.v1.a
    public z a() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.DEVICE;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new g()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public s b() {
        return this.f45435d;
    }

    @Override // com.ui.wmw.api.v1.a
    public z c() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.SETTINGS;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new i()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public AbstractC5912b d(String name) {
        AbstractC6492s.i(name, "name");
        b.a aVar = b.a.POST;
        a.EnumC1672a enumC1672a = a.EnumC1672a.SETTINGS_NAME;
        ApiV1SettingsRequest.Name name2 = new ApiV1SettingsRequest.Name(name);
        String id2 = aVar.getId();
        String path = enumC1672a.getPath(this.f45432a);
        Map mapH = U.h();
        b.a aVar2 = b.a.JSON;
        r rVar = this.f45434c;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(ApiV1SettingsRequest.Name.class)).i(name2);
        AbstractC6492s.h(strI, "toJson(...)");
        byte[] bytes = strI.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        a.f fVar = new a.f(id2, path, mapH, new com.ui.comm.v4.b(aVar2, bytes));
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new n(this)).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        AbstractC5912b abstractC5912bN = nVarS.n();
        AbstractC6492s.h(abstractC5912bN, "ignoreElement(...)");
        return abstractC5912bN;
    }

    @Override // com.ui.wmw.api.v1.a
    public AbstractC5912b e(List channels) {
        AbstractC6492s.i(channels, "channels");
        b.a aVar = b.a.POST;
        a.EnumC1672a enumC1672a = a.EnumC1672a.WIFI_PRIORITY_CHANNELS;
        ApiV1SettingsRequest.WifiPriorityChannel wifiPriorityChannel = new ApiV1SettingsRequest.WifiPriorityChannel(channels);
        String id2 = aVar.getId();
        String path = enumC1672a.getPath(this.f45432a);
        Map mapH = U.h();
        b.a aVar2 = b.a.JSON;
        r rVar = this.f45434c;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(ApiV1SettingsRequest.WifiPriorityChannel.class)).i(wifiPriorityChannel);
        AbstractC6492s.h(strI, "toJson(...)");
        byte[] bytes = strI.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        a.f fVar = new a.f(id2, path, mapH, new com.ui.comm.v4.b(aVar2, bytes));
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new n(this)).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        AbstractC5912b abstractC5912bN = nVarS.n();
        AbstractC6492s.h(abstractC5912bN, "ignoreElement(...)");
        return abstractC5912bN;
    }

    @Override // com.ui.wmw.api.v1.a
    public z f() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.BLUETOOTH;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new C1676f()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public gg.i g(long j10, InputStream stream, boolean z10) {
        AbstractC6492s.i(stream, "stream");
        b.a aVar = b.a.POST;
        a.EnumC1672a enumC1672a = a.EnumC1672a.FIRMWARE_UPLOAD_START;
        Start start = new Start(j10);
        String id2 = aVar.getId();
        String path = enumC1672a.getPath(this.f45432a);
        Map mapH = U.h();
        b.a aVar2 = b.a.JSON;
        r rVar = this.f45434c;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(Start.class)).i(start);
        AbstractC6492s.h(strI, "toJson(...)");
        byte[] bytes = strI.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        a.f fVar = new a.f(id2, path, mapH, new com.ui.comm.v4.b(aVar2, bytes));
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new d()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        gg.i iVarW = zVarX.w(new e(j10, stream, this, z10));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    @Override // Lf.b
    public z getVersion() {
        b.a aVar = b.a.GET;
        String id2 = aVar.getId();
        Lf.a aVar2 = Lf.a.VERSION;
        a.f fVar = new a.f(id2, aVar2.getPath(), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new k()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + aVar2, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public AbstractC5912b h() {
        a.f fVar = new a.f(b.a.POST.getId(), a.EnumC1672a.WIFI_SCAN_STOP.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new n(this)).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        AbstractC5912b abstractC5912bN = nVarS.n();
        AbstractC6492s.h(abstractC5912bN, "ignoreElement(...)");
        return abstractC5912bN;
    }

    @Override // com.ui.wmw.api.v1.a
    public z i() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.FIRMWARE;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new h()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public AbstractC5912b j(ApiV1BluetoothSettings btSettings) {
        AbstractC6492s.i(btSettings, "btSettings");
        b.a aVar = b.a.POST;
        a.EnumC1672a enumC1672a = a.EnumC1672a.BLUETOOTH;
        String id2 = aVar.getId();
        String path = enumC1672a.getPath(this.f45432a);
        Map mapH = U.h();
        b.a aVar2 = b.a.JSON;
        r rVar = this.f45434c;
        AbstractC6492s.h(rVar, "access$getMoshi$p(...)");
        String strI = w.a(rVar, O.l(ApiV1BluetoothSettings.class)).i(btSettings);
        AbstractC6492s.h(strI, "toJson(...)");
        byte[] bytes = strI.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        a.f fVar = new a.f(id2, path, mapH, new com.ui.comm.v4.b(aVar2, bytes));
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new n(this)).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        AbstractC5912b abstractC5912bN = nVarS.n();
        AbstractC6492s.h(abstractC5912bN, "ignoreElement(...)");
        return abstractC5912bN;
    }

    @Override // com.ui.wmw.api.v1.a
    public AbstractC5912b k() {
        a.f fVar = new a.f(b.a.POST.getId(), a.EnumC1672a.WIFI_SCAN_START.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new n(this)).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        AbstractC5912b abstractC5912bN = nVarS.n();
        AbstractC6492s.h(abstractC5912bN, "ignoreElement(...)");
        return abstractC5912bN;
    }

    @Override // com.ui.wmw.api.v1.a
    public z l() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.WIFI_SCAN_RESULT;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new l()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    @Override // com.ui.wmw.api.v1.a
    public z m() {
        b.a aVar = b.a.GET;
        a.EnumC1672a enumC1672a = a.EnumC1672a.STATISTICS;
        a.f fVar = new a.f(aVar.getId(), enumC1672a.getPath(this.f45432a), U.h(), this.f45436e);
        gg.n nVarS = this.f45433b.e(fVar).A(new o(fVar)).Q(60000L, TimeUnit.MILLISECONDS).u(new j()).s(new p(fVar));
        AbstractC6492s.h(nVarS, "onErrorResumeNext(...)");
        z zVarX = nVarS.x(z.p(new WMWizard.Error.Session.InvalidResponse.Content("message body expected in response on " + aVar + " " + enumC1672a, null, 2, null)));
        AbstractC6492s.h(zVarX, "switchIfEmpty(...)");
        return zVarX;
    }

    private f(String sessionId, C5432d session) {
        AbstractC6492s.i(sessionId, "sessionId");
        AbstractC6492s.i(session, "session");
        this.f45432a = sessionId;
        this.f45433b = session;
        this.f45434c = new r.a().c();
        s sVarL1 = session.d().W(new c()).r0().l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f45435d = sVarL1;
        b.a aVar = b.a.JSON;
        byte[] bytes = "{}".getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        this.f45436e = new com.ui.comm.v4.b(aVar, bytes);
        InterfaceC5826a entries = a.EnumC1672a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((a.EnumC1672a) obj).getPath(this.f45432a), obj);
        }
        this.f45437f = linkedHashMap;
    }
}
