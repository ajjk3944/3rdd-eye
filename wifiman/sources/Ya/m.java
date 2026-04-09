package ya;

import Ii.N;
import Yg.J;
import Yg.v;
import bb.C4079a;
import com.ui.uidb.UiDB;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import okhttp3.OkHttpClient;
import org.snmp4j.mp.PduHandle;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class m implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final a f66639e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final za.d f66640a;

    /* renamed from: b, reason: collision with root package name */
    private final n f66641b;

    /* renamed from: c, reason: collision with root package name */
    private final UiDB f66642c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC8439a.b f66643d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f66644a;

        /* renamed from: b, reason: collision with root package name */
        Object f66645b;

        /* renamed from: c, reason: collision with root package name */
        long f66646c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f66647d;

        /* renamed from: f, reason: collision with root package name */
        int f66649f;

        b(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66647d = obj;
            this.f66649f |= PduHandle.NONE;
            return m.this.c(this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66650a;

        c(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return m.this.new c(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66650a;
            if (i10 == 0) {
                v.b(obj);
                za.d dVar = m.this.f66640a;
                this.f66650a = 1;
                obj = dVar.c(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            UiDB.c cVar = (UiDB.c) obj;
            if (cVar != null) {
                return new InterfaceC8439a.b(cVar.c(), cVar.d());
            }
            return null;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f66652a;

        /* renamed from: b, reason: collision with root package name */
        Object f66653b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f66654c;

        /* renamed from: e, reason: collision with root package name */
        int f66656e;

        d(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f66654c = obj;
            this.f66656e |= PduHandle.NONE;
            return m.this.a(this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f66657a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiDB.c f66659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(UiDB.c cVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f66659c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return m.this.new e(this.f66659c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f66657a;
            if (i10 == 0) {
                v.b(obj);
                za.d dVar = m.this.f66640a;
                UiDB.c cVar = this.f66659c;
                this.f66657a = 1;
                if (dVar.a(cVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public m(UiDB.b environment, OkHttpClient sharedOkhttpClient, za.d storage, n nVar) {
        AbstractC6492s.i(environment, "environment");
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        AbstractC6492s.i(storage, "storage");
        this.f66640a = storage;
        this.f66641b = nVar;
        this.f66642c = UiDB.a.b(UiDB.f42191a, environment, true, sharedOkhttpClient, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m() {
        return "Source [Remote] - storage load initiated";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(long j10) {
        return "Source [Remote] - storage load finished. Took " + j10 + " ms";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(m mVar) {
        C4079a c4079aB;
        List listA;
        InterfaceC8439a.b bVarB = mVar.b();
        return "Source [Remote] - contains " + ((bVarB == null || (c4079aB = bVarB.b()) == null || (listA = c4079aB.a()) == null) ? 0 : listA.size()) + " products";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q() {
        return "Source [Remote] - SYNC";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(Ya.a aVar) {
        return "Source [Remote] - SYNC initiated (etag: " + aVar + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String s(UiDB.c cVar) {
        return "Source [Remote] - Remote fetch success. Received snapshot with " + cVar.d().a().size() + " products";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t() {
        return "Source [Remote] - SYNC - Not Changed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String u(m mVar) {
        C4079a c4079aB;
        List listA;
        InterfaceC8439a.b bVarB = mVar.b();
        return "Source [Remote] - contains " + ((bVarB == null || (c4079aB = bVarB.b()) == null || (listA = c4079aB.a()) == null) ? 0 : listA.size()) + " products";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ya.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(dh.InterfaceC5380e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ya.m.d
            if (r0 == 0) goto L13
            r0 = r8
            ya.m$d r0 = (ya.m.d) r0
            int r1 = r0.f66656e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66656e = r1
            goto L18
        L13:
            ya.m$d r0 = new ya.m$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f66654c
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f66656e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L36
            java.lang.Object r1 = r0.f66653b
            com.ui.uidb.UiDB$c r1 = (com.ui.uidb.UiDB.c) r1
            java.lang.Object r0 = r0.f66652a
            ya.m r0 = (ya.m) r0
            Yg.v.b(r8)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            goto Lb8
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f66652a
            ya.m r2 = (ya.m) r2
            Yg.v.b(r8)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            goto L96
        L47:
            r0 = r2
            goto Lc9
        L4a:
            Yg.v.b(r8)
            ya.e r8 = new ya.e     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            r8.<init>()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            Ba.a.b(r8)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            xa.a$b r8 = r7.b()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 == 0) goto L6a
            bb.a$a r8 = r8.a()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 == 0) goto L6a
            Ya.a r8 = r8.b()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 != 0) goto L80
            goto L6a
        L68:
            r0 = r7
            goto Lc9
        L6a:
            ya.n r8 = r7.f66641b     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 == 0) goto L7f
            xa.a$b r8 = r8.b()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 == 0) goto L7f
            bb.a$a r8 = r8.a()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 == 0) goto L7f
            Ya.a r8 = r8.b()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            goto L80
        L7f:
            r8 = r3
        L80:
            ya.f r2 = new ya.f     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            r2.<init>()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            Ba.a.b(r2)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            com.ui.uidb.UiDB r2 = r7.f66642c     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            r0.f66652a = r7     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            r0.f66656e = r5     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            java.lang.Object r8 = r2.a(r8, r0)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L68
            if (r8 != r1) goto L95
            return r1
        L95:
            r2 = r7
        L96:
            com.ui.uidb.UiDB$c r8 = (com.ui.uidb.UiDB.c) r8     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            ya.g r5 = new ya.g     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            r5.<init>()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            Ba.a.b(r5)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            Ii.J r5 = Ii.C3048c0.b()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            ya.m$e r6 = new ya.m$e     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            r6.<init>(r8, r3)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            r0.f66652a = r2     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            r0.f66653b = r8     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            r0.f66656e = r4     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            java.lang.Object r0 = Ii.AbstractC3059i.g(r5, r6, r0)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> L47
            if (r0 != r1) goto Lb6
            return r1
        Lb6:
            r1 = r8
            r0 = r2
        Lb8:
            xa.a$b r8 = new xa.a$b     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            bb.a$a r2 = r1.c()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            bb.a r1 = r1.d()     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            r8.<init>(r2, r1)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            r0.p(r8)     // Catch: com.ui.uidb.UiDB.Error.NotChanged -> Lc9
            goto Ld1
        Lc9:
            ya.h r8 = new ya.h
            r8.<init>()
            Ba.a.b(r8)
        Ld1:
            ya.i r8 = new ya.i
            r8.<init>()
            Ba.a.b(r8)
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.m.a(dh.e):java.lang.Object");
    }

    @Override // ya.n
    public InterfaceC8439a.b b() {
        return this.f66643d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ya.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(dh.InterfaceC5380e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ya.m.b
            if (r0 == 0) goto L13
            r0 = r8
            ya.m$b r0 = (ya.m.b) r0
            int r1 = r0.f66649f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f66649f = r1
            goto L18
        L13:
            ya.m$b r0 = new ya.m$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f66647d
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f66649f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L33
            long r1 = r0.f66646c
            java.lang.Object r3 = r0.f66645b
            ya.m r3 = (ya.m) r3
            java.lang.Object r0 = r0.f66644a
            ya.m r0 = (ya.m) r0
            Yg.v.b(r8)
            goto L67
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3c:
            Yg.v.b(r8)
            ya.j r8 = new ya.j
            r8.<init>()
            Ba.a.b(r8)
            long r4 = java.lang.System.currentTimeMillis()
            Ii.J r8 = Ii.C3048c0.b()
            ya.m$c r2 = new ya.m$c
            r6 = 0
            r2.<init>(r6)
            r0.f66644a = r7
            r0.f66645b = r7
            r0.f66646c = r4
            r0.f66649f = r3
            java.lang.Object r8 = Ii.AbstractC3059i.g(r8, r2, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r0 = r7
            r3 = r0
            r1 = r4
        L67:
            xa.a$b r8 = (xa.InterfaceC8439a.b) r8
            r3.p(r8)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            ya.k r8 = new ya.k
            r8.<init>()
            Ba.a.b(r8)
            ya.l r8 = new ya.l
            r8.<init>()
            Ba.a.b(r8)
            Yg.J r8 = Yg.J.f24997a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.m.c(dh.e):java.lang.Object");
    }

    public void p(InterfaceC8439a.b bVar) {
        this.f66643d = bVar;
    }
}
