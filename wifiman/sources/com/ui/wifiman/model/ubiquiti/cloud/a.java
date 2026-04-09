package com.ui.wifiman.model.ubiquiti.cloud;

import com.ui.common.semver.SemVer;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient;
import gg.D;
import gg.z;
import java.io.IOException;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mb.v;
import retrofit2.HttpException;
import wa.InterfaceC8290a;
import xa.o;

/* loaded from: classes4.dex */
public final class a implements UnifiCloudClient {

    /* renamed from: a, reason: collision with root package name */
    private final cb.c f43513a;

    /* renamed from: b, reason: collision with root package name */
    private final o f43514b;

    /* renamed from: c, reason: collision with root package name */
    private final SemVer f43515c;

    /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1478a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43516a;

        static {
            int[] iArr = new int[v.values().length];
            try {
                iArr[v.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.UNSUPPORTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[v.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43516a = iArr;
        }
    }

    static final class b implements n {

        /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.a$b$a, reason: collision with other inner class name */
        static final class C1479a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f43518a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC8290a f43519b;

            C1479a(a aVar, InterfaceC8290a interfaceC8290a) {
                this.f43518a = aVar;
                this.f43519b = interfaceC8290a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
            
                r8 = r8.getFirmwareVersion();
             */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient.a apply(java.util.List r27) {
                /*
                    Method dump skipped, instructions count: 355
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.ubiquiti.cloud.a.b.C1479a.apply(java.util.List):com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient$a");
            }
        }

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC8290a catalogBrowser) {
            AbstractC6492s.i(catalogBrowser, "catalogBrowser");
            return a.this.f43513a.c().a().A(new C1479a(a.this, catalogBrowser));
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43520a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable _error) {
            Throwable cause;
            AbstractC6492s.i(_error, "_error");
            RuntimeException runtimeException = _error instanceof RuntimeException ? (RuntimeException) _error : null;
            if (runtimeException != null && (cause = runtimeException.getCause()) != null) {
                _error = cause;
            }
            return _error instanceof UnauthorisedException ? z.p(new UnifiCloudClient.Error.Unauthorized((UnauthorisedException) _error)) : ((_error instanceof HttpException) || (_error instanceof IOException)) ? z.p(new UnifiCloudClient.Error.IO(_error)) : z.p(_error);
        }
    }

    public a(cb.c uniFiCore, o productCatalog) {
        AbstractC6492s.i(uniFiCore, "uniFiCore");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f43513a = uniFiCore;
        this.f43514b = productCatalog;
        this.f43515c = SemVer.f41336i.a("7.1.55");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0 = r1.getVersion();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.ui.wifiman.model.ubiquiti.console.e.a.b d(mb.Device r7) {
        /*
            r6 = this;
            java.util.List r0 = r7.getControllers()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            r3 = r1
            mb.x r3 = (mb.x) r3
            boolean r3 = r3 instanceof mb.NetworkController
            if (r3 == 0) goto La
            goto L1e
        L1d:
            r1 = r2
        L1e:
            mb.x r1 = (mb.x) r1
            if (r1 == 0) goto L44
            java.lang.String r0 = r1.getVersion()
            if (r0 == 0) goto L44
            com.ui.common.semver.SemVer$a r1 = com.ui.common.semver.SemVer.f41336i     // Catch: com.ui.common.semver.SemVer.FormatException -> L2f
            com.ui.common.semver.SemVer r0 = r1.a(r0)     // Catch: com.ui.common.semver.SemVer.FormatException -> L2f
            goto L45
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Invalid FW version obtained for network controller- "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 6
            Z7.b.e(r0, r2, r2, r1, r2)
        L44:
            r0 = r2
        L45:
            com.ui.wifiman.model.ubiquiti.console.e$a$b r1 = new com.ui.wifiman.model.ubiquiti.console.e$a$b
            mb.f r3 = r7.getFeatures()
            if (r3 == 0) goto L52
            mb.v r3 = r3.getTeleportState()
            goto L53
        L52:
            r3 = r2
        L53:
            r4 = -1
            if (r3 != 0) goto L58
            r3 = r4
            goto L60
        L58:
            int[] r5 = com.ui.wifiman.model.ubiquiti.cloud.a.C1478a.f43516a
            int r3 = r3.ordinal()
            r3 = r5[r3]
        L60:
            if (r3 == r4) goto L87
            r4 = 1
            if (r3 == r4) goto L7b
            r4 = 2
            if (r3 == r4) goto L78
            r4 = 3
            if (r3 == r4) goto L75
            r4 = 4
            if (r3 != r4) goto L6f
            goto L87
        L6f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L75:
            Rd.a$c r7 = Rd.a.c.f19716a
            goto Lc8
        L78:
            Rd.a$a r7 = Rd.a.C0705a.f19712a
            goto Lc8
        L7b:
            boolean r7 = r7.getOwner()
            if (r7 == 0) goto L84
            Rd.a$b$a r7 = Rd.a.b.C0706a.f19713a
            goto Lc8
        L84:
            Rd.a$b$b$a r7 = Rd.a.b.AbstractC0707b.C0708a.f19714a
            goto Lc8
        L87:
            mb.f r3 = r7.getFeatures()
            if (r3 == 0) goto L91
            java.lang.Boolean r2 = r3.getTeleport()
        L91:
            if (r2 != 0) goto L96
            Rd.a$c r7 = Rd.a.c.f19716a
            goto Lc8
        L96:
            mb.f r2 = r7.getFeatures()
            if (r2 == 0) goto La7
            java.lang.Boolean r2 = r2.getTeleport()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.AbstractC6492s.d(r2, r3)
            goto La8
        La7:
            r2 = 0
        La8:
            if (r2 != 0) goto Lad
            Rd.a$a r7 = Rd.a.C0705a.f19712a
            goto Lc8
        Lad:
            if (r0 == 0) goto Lbd
            com.ui.common.semver.SemVer r2 = r6.f43515c
            int r2 = r0.compareTo(r2)
            if (r2 >= 0) goto Lbd
            Rd.a$b$b$b r7 = new Rd.a$b$b$b
            r7.<init>(r0)
            goto Lc8
        Lbd:
            boolean r7 = r7.getOwner()
            if (r7 != 0) goto Lc6
            Rd.a$b$b$a r7 = Rd.a.b.AbstractC0707b.C0708a.f19714a
            goto Lc8
        Lc6:
            Rd.a$b$a r7 = Rd.a.b.C0706a.f19713a
        Lc8:
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.ubiquiti.cloud.a.d(mb.l):com.ui.wifiman.model.ubiquiti.console.e$a$b");
    }

    @Override // com.ui.wifiman.model.ubiquiti.cloud.UnifiCloudClient
    public z a() {
        z zVarF = this.f43514b.b().o0().s(new b()).F(c.f43520a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
