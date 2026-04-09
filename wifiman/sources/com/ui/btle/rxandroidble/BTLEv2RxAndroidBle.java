package com.ui.btle.rxandroidble;

import G6.B;
import G6.G;
import I6.q;
import T8.a;
import android.content.Context;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.btle.rxandroidble.a;
import com.ui.btle.v2.BTLEv2$Error;
import gg.C;
import gg.EnumC5911a;
import gg.InterfaceC5910A;
import gg.i;
import gg.s;
import gg.z;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class BTLEv2RxAndroidBle implements T8.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f41084d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static volatile BTLEv2RxAndroidBle f41085e;

    /* renamed from: b, reason: collision with root package name */
    private final G f41086b;

    /* renamed from: c, reason: collision with root package name */
    private final i f41087c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$Error;", "Lcom/ui/btle/v2/BTLEv2$Error$Connection;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "btle-v2-rxandroidble_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Error extends BTLEv2$Error.Connection {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        public Error(String str, Throwable cause) {
            AbstractC6492s.i(cause, "cause");
            this.message = str;
            this.cause = cause;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public static final class a {

        /* renamed from: com.ui.btle.rxandroidble.BTLEv2RxAndroidBle$a$a, reason: collision with other inner class name */
        static final class C1280a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1280a f41090a = new C1280a();

            C1280a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Creating default BTLEManager instance";
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41091a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f41092b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, String str2) {
                super(0);
                this.f41091a = str;
                this.f41092b = str2;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f41091a + " - " + this.f41092b;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41093a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f41094b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, String str2) {
                super(0);
                this.f41093a = str;
                this.f41094b = str2;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f41093a + " - " + this.f41094b;
            }
        }

        static final class d extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f41095a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f41096b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str, String str2) {
                super(0);
                this.f41095a = str;
                this.f41096b = str2;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f41095a + " - " + this.f41096b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(int i10, String str, String str2) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                X8.a.c(new b(str, str2));
            } else if (i10 == 5) {
                X8.a.d(new c(str, str2), null);
            } else {
                if (i10 != 6) {
                    return;
                }
                X8.a.b(new d(str, str2), null);
            }
        }

        public final BTLEv2RxAndroidBle b(Context context) {
            BTLEv2RxAndroidBle bTLEv2RxAndroidBle;
            AbstractC6492s.i(context, "context");
            synchronized (this) {
                try {
                    if (BTLEv2RxAndroidBle.f41085e == null) {
                        if (com.ui.btle.rxandroidble.a.f41105a.d()) {
                            q.o(new B.a().b(2).c(new B.b() { // from class: U8.b
                                @Override // G6.B.b
                                public final void a(int i10, String str, String str2) {
                                    BTLEv2RxAndroidBle.a.c(i10, str, str2);
                                }
                            }).a());
                        }
                        X8.a.c(C1280a.f41090a);
                        G gA = G.a(context);
                        AbstractC6492s.h(gA, "create(context)");
                        BTLEv2RxAndroidBle.f41085e = new BTLEv2RxAndroidBle(gA);
                    }
                    bTLEv2RxAndroidBle = BTLEv2RxAndroidBle.f41085e;
                    AbstractC6492s.f(bTLEv2RxAndroidBle);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bTLEv2RxAndroidBle;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41097a;

        static {
            int[] iArr = new int[G.a.values().length];
            try {
                iArr[G.a.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.a.BLUETOOTH_NOT_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G.a.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[G.a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[G.a.READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f41097a = iArr;
        }
    }

    public static final class c implements C {
        public c() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(BTLEv2RxAndroidBle.this.f41086b.c());
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.d apply(G.a state) {
            AbstractC6492s.i(state, "state");
            return BTLEv2RxAndroidBle.this.f(state);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41100a = new e();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.d f41101a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.d dVar) {
                super(0);
                this.f41101a = dVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BTLE Manager state - " + this.f41101a;
            }
        }

        e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(a.d it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(new a(it));
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f41102a = new f();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f41103a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BTLE Manager state SUBSCRIBED";
            }
        }

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f41103a);
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f41104a = new g();

        g() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BTLE Manager state FINISHED";
        }
    }

    public BTLEv2RxAndroidBle(G client) {
        AbstractC6492s.i(client, "client");
        this.f41086b = client;
        s sVarD = client.d();
        z zVarI = z.i(new c());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        s sVarV = sVarD.H0(zVarI).v();
        a.C1281a c1281a = a.C1281a.f41109a;
        i iVarI2 = sVarV.o0(c1281a.a()).i0(new d()).F(e.f41100a).G(f.f41102a).y(new InterfaceC6464a() { // from class: U8.a
            @Override // kg.InterfaceC6464a
            public final void run() {
                BTLEv2RxAndroidBle.g();
            }
        }).d1(EnumC5911a.LATEST).F1(c1281a.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "client.observeStateChang…)\n            .refCount()");
        this.f41087c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.d f(G.a aVar) {
        int i10 = b.f41097a[aVar.ordinal()];
        if (i10 == 1) {
            return new a.d.b();
        }
        if (i10 == 2) {
            return new a.d.C0785a();
        }
        if (i10 == 3) {
            return new a.d.C0786d();
        }
        if (i10 == 4) {
            return new a.d.c();
        }
        if (i10 == 5) {
            return new a.d.e(new W8.c(this.f41086b), new V8.f(this.f41086b));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g() {
        X8.a.c(g.f41104a);
    }

    @Override // T8.a
    public i getState() {
        return this.f41087c;
    }
}
