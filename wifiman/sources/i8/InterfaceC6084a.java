package i8;

import Cd.j;
import Qe.c;
import ae.AbstractC3789a;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.speedtest.Speedtest;
import com.ui.wifiman.model.ubiquiti.console.e;
import ec.AbstractC5452a;
import ef.AbstractC5460b;
import gg.AbstractC5912b;
import hc.C5973a;
import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import qd.InterfaceC7451a;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6084a {

    /* renamed from: i8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1811a {

        /* renamed from: i8.a$a$a, reason: collision with other inner class name */
        public static final class C1812a extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC6835l f48869a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1812a(InterfaceC6835l builder) {
                super(null);
                AbstractC6492s.i(builder, "builder");
                this.f48869a = builder;
            }

            public final InterfaceC6835l a() {
                return this.f48869a;
            }
        }

        /* renamed from: i8.a$a$b */
        public static final class b extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC6835l f48870a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC6835l action) {
                super(null);
                AbstractC6492s.i(action, "action");
                this.f48870a = action;
            }

            public final InterfaceC6835l a() {
                return this.f48870a;
            }
        }

        /* renamed from: i8.a$a$c */
        public static final class c extends AbstractC1811a {
        }

        /* renamed from: i8.a$a$d */
        public static final class d extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f48871a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 389040325;
            }

            public String toString() {
                return "LocationProviderEnableRequest";
            }
        }

        /* renamed from: i8.a$a$e */
        public static final class e extends AbstractC1811a {
            public e() {
                super(null);
            }
        }

        /* renamed from: i8.a$a$f */
        public static final class f extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f48872a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Object route) {
                super(null);
                AbstractC6492s.i(route, "route");
                this.f48872a = route;
            }

            public final Object a() {
                return this.f48872a;
            }
        }

        /* renamed from: i8.a$a$g */
        public static final class g extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            private final C5973a f48873a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(C5973a toast) {
                super(null);
                AbstractC6492s.i(toast, "toast");
                this.f48873a = toast;
            }

            public final C5973a a() {
                return this.f48873a;
            }
        }

        /* renamed from: i8.a$a$h */
        public static final class h extends AbstractC1811a {

            /* renamed from: a, reason: collision with root package name */
            private final Integer f48874a;

            /* renamed from: b, reason: collision with root package name */
            private final Integer f48875b;

            /* renamed from: c, reason: collision with root package name */
            private final Integer f48876c;

            /* renamed from: d, reason: collision with root package name */
            private final boolean f48877d;

            /* renamed from: e, reason: collision with root package name */
            private final InterfaceC6835l f48878e;

            public /* synthetic */ h(Integer num, Integer num2, Integer num3, boolean z10, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? false : z10, interfaceC6835l);
            }

            public final Integer a() {
                return this.f48874a;
            }

            public final Integer b() {
                return this.f48875b;
            }

            public final boolean c() {
                return this.f48877d;
            }

            public final InterfaceC6835l d() {
                return this.f48878e;
            }

            public final Integer e() {
                return this.f48876c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Integer num, Integer num2, Integer num3, boolean z10, InterfaceC6835l intent) {
                super(null);
                AbstractC6492s.i(intent, "intent");
                this.f48874a = num;
                this.f48875b = num2;
                this.f48876c = num3;
                this.f48877d = z10;
                this.f48878e = intent;
            }
        }

        public /* synthetic */ AbstractC1811a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC1811a() {
        }
    }

    /* renamed from: i8.a$b */
    public static abstract class b {

        /* renamed from: i8.a$b$A */
        public static final class A extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f48879b = AbstractC5460b.f46388a;

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC5460b f48880a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public A(AbstractC5460b topic) {
                super(null);
                AbstractC6492s.i(topic, "topic");
                this.f48880a = topic;
            }

            public final AbstractC5460b a() {
                return this.f48880a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof A) && AbstractC6492s.d(this.f48880a, ((A) obj).f48880a);
            }

            public int hashCode() {
                return this.f48880a.hashCode();
            }

            public String toString() {
                return "SpeedFactorsExplanation(topic=" + this.f48880a + ")";
            }
        }

        /* renamed from: i8.a$b$B */
        public static abstract class B extends b {

            /* renamed from: i8.a$b$B$a, reason: collision with other inner class name */
            public static final class C1813a extends B {

                /* renamed from: a, reason: collision with root package name */
                public static final C1813a f48881a = new C1813a();

                private C1813a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1813a);
                }

                public int hashCode() {
                    return -1811685677;
                }

                public String toString() {
                    return "InternetServerPicker";
                }
            }

            /* renamed from: i8.a$b$B$b, reason: collision with other inner class name */
            public static abstract class AbstractC1814b extends B {

                /* renamed from: i8.a$b$B$b$a, reason: collision with other inner class name */
                public static final class C1815a extends AbstractC1814b {

                    /* renamed from: a, reason: collision with root package name */
                    private final long f48882a;

                    /* renamed from: b, reason: collision with root package name */
                    private final boolean f48883b;

                    public /* synthetic */ C1815a(long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j10, (i10 & 2) != 0 ? false : z10);
                    }

                    public final boolean a() {
                        return this.f48883b;
                    }

                    public final long b() {
                        return this.f48882a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1815a)) {
                            return false;
                        }
                        C1815a c1815a = (C1815a) obj;
                        return this.f48882a == c1815a.f48882a && this.f48883b == c1815a.f48883b;
                    }

                    public int hashCode() {
                        return (Long.hashCode(this.f48882a) * 31) + Boolean.hashCode(this.f48883b);
                    }

                    public String toString() {
                        return "Detail(resultId=" + this.f48882a + ", justFinished=" + this.f48883b + ")";
                    }

                    public C1815a(long j10, boolean z10) {
                        super(null);
                        this.f48882a = j10;
                        this.f48883b = z10;
                    }
                }

                /* renamed from: i8.a$b$B$b$b, reason: collision with other inner class name */
                public static final class C1816b extends AbstractC1814b {

                    /* renamed from: a, reason: collision with root package name */
                    private final Speedtest.Error f48884a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1816b(Speedtest.Error error) {
                        super(null);
                        AbstractC6492s.i(error, "error");
                        this.f48884a = error;
                    }

                    public final Speedtest.Error a() {
                        return this.f48884a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1816b) && AbstractC6492s.d(this.f48884a, ((C1816b) obj).f48884a);
                    }

                    public int hashCode() {
                        return this.f48884a.hashCode();
                    }

                    public String toString() {
                        return "Error(error=" + this.f48884a + ")";
                    }
                }

                /* renamed from: i8.a$b$B$b$c */
                public static final class c extends AbstractC1814b {

                    /* renamed from: a, reason: collision with root package name */
                    private final long f48885a;

                    public c(long j10) {
                        super(null);
                        this.f48885a = j10;
                    }

                    public final long a() {
                        return this.f48885a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof c) && this.f48885a == ((c) obj).f48885a;
                    }

                    public int hashCode() {
                        return Long.hashCode(this.f48885a);
                    }

                    public String toString() {
                        return "Feedback(resultId=" + this.f48885a + ")";
                    }
                }

                /* renamed from: i8.a$b$B$b$d */
                public static final class d extends b {

                    /* renamed from: a, reason: collision with root package name */
                    public static final d f48886a = new d();

                    private d() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof d);
                    }

                    public int hashCode() {
                        return -1848832323;
                    }

                    public String toString() {
                        return "Manager";
                    }
                }

                public /* synthetic */ AbstractC1814b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private AbstractC1814b() {
                    super(null);
                }
            }

            /* renamed from: i8.a$b$B$c */
            public static abstract class c extends B {

                /* renamed from: i8.a$b$B$c$a, reason: collision with other inner class name */
                public static final class C1817a extends c {

                    /* renamed from: a, reason: collision with root package name */
                    private final InterfaceC7451a.C2063a f48887a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1817a(InterfaceC7451a.C2063a params) {
                        super(null);
                        AbstractC6492s.i(params, "params");
                        this.f48887a = params;
                    }

                    public final InterfaceC7451a.C2063a a() {
                        return this.f48887a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1817a) && AbstractC6492s.d(this.f48887a, ((C1817a) obj).f48887a);
                    }

                    public int hashCode() {
                        return this.f48887a.hashCode();
                    }

                    public String toString() {
                        return "App2App(params=" + this.f48887a + ")";
                    }
                }

                /* renamed from: i8.a$b$B$c$b, reason: collision with other inner class name */
                public static final class C1818b extends c {

                    /* renamed from: a, reason: collision with root package name */
                    private final inet.ipaddr.g f48888a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f48889b;

                    public /* synthetic */ C1818b(inet.ipaddr.g gVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
                        this(gVar, str);
                    }

                    public final String a() {
                        return this.f48889b;
                    }

                    public final inet.ipaddr.g b() {
                        return this.f48888a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1818b)) {
                            return false;
                        }
                        C1818b c1818b = (C1818b) obj;
                        return AbstractC6492s.d(this.f48888a, c1818b.f48888a) && e.b.h(this.f48889b, c1818b.f48889b);
                    }

                    public int hashCode() {
                        return (this.f48888a.hashCode() * 31) + e.b.j(this.f48889b);
                    }

                    public String toString() {
                        return "Combined(gatewayIp=" + this.f48888a + ", consoleId=" + e.b.l(this.f48889b) + ")";
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    private C1818b(inet.ipaddr.g gatewayIp, String consoleId) {
                        super(null);
                        AbstractC6492s.i(gatewayIp, "gatewayIp");
                        AbstractC6492s.i(consoleId, "consoleId");
                        this.f48888a = gatewayIp;
                        this.f48889b = consoleId;
                    }
                }

                /* renamed from: i8.a$b$B$c$c, reason: collision with other inner class name */
                public static final class C1819c extends c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1819c f48890a = new C1819c();

                    private C1819c() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1819c);
                    }

                    public int hashCode() {
                        return 572793710;
                    }

                    public String toString() {
                        return "Internet";
                    }
                }

                /* renamed from: i8.a$b$B$c$d */
                public static final class d extends c {

                    /* renamed from: a, reason: collision with root package name */
                    private final j.c f48891a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(j.c params) {
                        super(null);
                        AbstractC6492s.i(params, "params");
                        this.f48891a = params;
                    }

                    public final j.c a() {
                        return this.f48891a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof d) && AbstractC6492s.d(this.f48891a, ((d) obj).f48891a);
                    }

                    public int hashCode() {
                        return this.f48891a.hashCode();
                    }

                    public String toString() {
                        return "Local(params=" + this.f48891a + ")";
                    }
                }

                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private c() {
                    super(null);
                }
            }

            public /* synthetic */ B(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private B() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$C */
        public static final class C extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f48892a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C(String packageName) {
                super(null);
                AbstractC6492s.i(packageName, "packageName");
                this.f48892a = packageName;
            }

            public final String a() {
                return this.f48892a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C) && AbstractC6492s.d(this.f48892a, ((C) obj).f48892a);
            }

            public int hashCode() {
                return this.f48892a.hashCode();
            }

            public String toString() {
                return "StartPlayStore(packageName=" + this.f48892a + ")";
            }
        }

        /* renamed from: i8.a$b$D */
        public static abstract class D extends b {

            /* renamed from: i8.a$b$D$a, reason: collision with other inner class name */
            public static final class C1820a extends D {

                /* renamed from: a, reason: collision with root package name */
                public static final C1820a f48893a = new C1820a();

                private C1820a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1820a);
                }

                public int hashCode() {
                    return 112323881;
                }

                public String toString() {
                    return "AppLanguageSettings";
                }
            }

            /* renamed from: i8.a$b$D$b, reason: collision with other inner class name */
            public static final class C1821b extends D {

                /* renamed from: a, reason: collision with root package name */
                public static final C1821b f48894a = new C1821b();

                private C1821b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1821b);
                }

                public int hashCode() {
                    return 1140032436;
                }

                public String toString() {
                    return "BluetoothProviderDialog";
                }
            }

            /* renamed from: i8.a$b$D$c */
            public static final class c extends D {

                /* renamed from: a, reason: collision with root package name */
                private final String f48895a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(String phoneNum) {
                    super(null);
                    AbstractC6492s.i(phoneNum, "phoneNum");
                    this.f48895a = phoneNum;
                }

                public final String a() {
                    return this.f48895a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && AbstractC6492s.d(this.f48895a, ((c) obj).f48895a);
                }

                public int hashCode() {
                    return this.f48895a.hashCode();
                }

                public String toString() {
                    return "CallDial(phoneNum=" + this.f48895a + ")";
                }
            }

            /* renamed from: i8.a$b$D$d */
            public static final class d extends D {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC5452a f48896a;

                /* renamed from: b, reason: collision with root package name */
                private final AbstractC5452a f48897b;

                /* renamed from: c, reason: collision with root package name */
                private final AbstractC5452a f48898c;

                /* renamed from: d, reason: collision with root package name */
                private final File f48899d;

                public /* synthetic */ d(AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, AbstractC5452a abstractC5452a3, File file, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(abstractC5452a, abstractC5452a2, abstractC5452a3, (i10 & 8) != 0 ? null : file);
                }

                public final File a() {
                    return this.f48899d;
                }

                public final AbstractC5452a b() {
                    return this.f48898c;
                }

                public final AbstractC5452a c() {
                    return this.f48896a;
                }

                public final AbstractC5452a d() {
                    return this.f48897b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return AbstractC6492s.d(this.f48896a, dVar.f48896a) && AbstractC6492s.d(this.f48897b, dVar.f48897b) && AbstractC6492s.d(this.f48898c, dVar.f48898c) && AbstractC6492s.d(this.f48899d, dVar.f48899d);
                }

                public int hashCode() {
                    int iHashCode = this.f48896a.hashCode() * 31;
                    AbstractC5452a abstractC5452a = this.f48897b;
                    int iHashCode2 = (iHashCode + (abstractC5452a == null ? 0 : abstractC5452a.hashCode())) * 31;
                    AbstractC5452a abstractC5452a2 = this.f48898c;
                    int iHashCode3 = (iHashCode2 + (abstractC5452a2 == null ? 0 : abstractC5452a2.hashCode())) * 31;
                    File file = this.f48899d;
                    return iHashCode3 + (file != null ? file.hashCode() : 0);
                }

                public String toString() {
                    return "EmailComposer(email=" + this.f48896a + ", subject=" + this.f48897b + ", body=" + this.f48898c + ", attachement=" + this.f48899d + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(AbstractC5452a email, AbstractC5452a abstractC5452a, AbstractC5452a abstractC5452a2, File file) {
                    super(null);
                    AbstractC6492s.i(email, "email");
                    this.f48896a = email;
                    this.f48897b = abstractC5452a;
                    this.f48898c = abstractC5452a2;
                    this.f48899d = file;
                }
            }

            /* renamed from: i8.a$b$D$e */
            public static final class e extends D {

                /* renamed from: a, reason: collision with root package name */
                public static final e f48900a = new e();

                private e() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof e);
                }

                public int hashCode() {
                    return -2134741695;
                }

                public String toString() {
                    return "LocationProviderDialog";
                }
            }

            /* renamed from: i8.a$b$D$f */
            public static final class f extends D {

                /* renamed from: a, reason: collision with root package name */
                private final String f48901a;

                /* renamed from: b, reason: collision with root package name */
                private final String f48902b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(String chooserTitle, String body) {
                    super(null);
                    AbstractC6492s.i(chooserTitle, "chooserTitle");
                    AbstractC6492s.i(body, "body");
                    this.f48901a = chooserTitle;
                    this.f48902b = body;
                }

                public final String a() {
                    return this.f48902b;
                }

                public final String b() {
                    return this.f48901a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return AbstractC6492s.d(this.f48901a, fVar.f48901a) && AbstractC6492s.d(this.f48902b, fVar.f48902b);
                }

                public int hashCode() {
                    return (this.f48901a.hashCode() * 31) + this.f48902b.hashCode();
                }

                public String toString() {
                    return "TextShare(chooserTitle=" + this.f48901a + ", body=" + this.f48902b + ")";
                }
            }

            /* renamed from: i8.a$b$D$g */
            public static final class g extends D {

                /* renamed from: a, reason: collision with root package name */
                public static final g f48903a = new g();

                private g() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof g);
                }

                public int hashCode() {
                    return -503782997;
                }

                public String toString() {
                    return "WifiSettings";
                }
            }

            public /* synthetic */ D(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private D() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$E */
        public static abstract class E extends b {

            /* renamed from: i8.a$b$E$a, reason: collision with other inner class name */
            public static final class C1822a extends E {

                /* renamed from: a, reason: collision with root package name */
                private final String f48904a;

                public /* synthetic */ C1822a(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                public final String a() {
                    return this.f48904a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1822a) && e.b.h(this.f48904a, ((C1822a) obj).f48904a);
                }

                public int hashCode() {
                    return e.b.j(this.f48904a);
                }

                public String toString() {
                    return "ConsoleDelete(id=" + e.b.l(this.f48904a) + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private C1822a(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f48904a = id2;
                }
            }

            /* renamed from: i8.a$b$E$b, reason: collision with other inner class name */
            public static final class C1823b extends E {

                /* renamed from: a, reason: collision with root package name */
                private final String f48905a;

                public /* synthetic */ C1823b(String str, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str);
                }

                public final String a() {
                    return this.f48905a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1823b) && e.b.h(this.f48905a, ((C1823b) obj).f48905a);
                }

                public int hashCode() {
                    return e.b.j(this.f48905a);
                }

                public String toString() {
                    return "ConsoleUnavailable(id=" + e.b.l(this.f48905a) + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private C1823b(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f48905a = id2;
                }
            }

            /* renamed from: i8.a$b$E$c */
            public static final class c extends E {

                /* renamed from: a, reason: collision with root package name */
                public static final c f48906a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public int hashCode() {
                    return -1373682080;
                }

                public String toString() {
                    return "InvitationPasteFailed";
                }
            }

            /* renamed from: i8.a$b$E$d */
            public static final class d extends E {

                /* renamed from: a, reason: collision with root package name */
                private final String f48907a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(String secret) {
                    super(null);
                    AbstractC6492s.i(secret, "secret");
                    this.f48907a = secret;
                }

                public final String a() {
                    return this.f48907a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && AbstractC6492s.d(this.f48907a, ((d) obj).f48907a);
                }

                public int hashCode() {
                    return this.f48907a.hashCode();
                }

                public String toString() {
                    return "InvitationPopup(secret=" + this.f48907a + ")";
                }
            }

            /* renamed from: i8.a$b$E$e */
            public static final class e extends E {

                /* renamed from: a, reason: collision with root package name */
                private final boolean f48908a;

                public e(boolean z10) {
                    super(null);
                    this.f48908a = z10;
                }

                public final boolean a() {
                    return this.f48908a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && this.f48908a == ((e) obj).f48908a;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.f48908a);
                }

                public String toString() {
                    return "VpnProfile(connectWhenFinished=" + this.f48908a + ")";
                }
            }

            public /* synthetic */ E(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private E() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$F */
        public static final class F extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final F f48909a = new F();

            private F() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof F);
            }

            public int hashCode() {
                return -225822059;
            }

            public String toString() {
                return "TermsOfUse";
            }
        }

        /* renamed from: i8.a$b$G */
        public static final class G extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final G f48910a = new G();

            private G() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof G);
            }

            public int hashCode() {
                return 1665523921;
            }

            public String toString() {
                return "UbntApps";
            }
        }

        /* renamed from: i8.a$b$H */
        public static final class H extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final H f48911a = new H();

            private H() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof H);
            }

            public int hashCode() {
                return -1603846934;
            }

            public String toString() {
                return "UbntCommunity";
            }
        }

        /* renamed from: i8.a$b$I */
        public static final class I extends b {

            /* renamed from: a, reason: collision with root package name */
            private final S8.e f48912a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public I(S8.e channel) {
                super(null);
                AbstractC6492s.i(channel, "channel");
                this.f48912a = channel;
            }

            public final S8.e a() {
                return this.f48912a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof I) && AbstractC6492s.d(this.f48912a, ((I) obj).f48912a);
            }

            public int hashCode() {
                return this.f48912a.hashCode();
            }

            public String toString() {
                return "WifiChannelDetail(channel=" + this.f48912a + ")";
            }
        }

        /* renamed from: i8.a$b$J */
        public static abstract class J extends b {

            /* renamed from: i8.a$b$J$a, reason: collision with other inner class name */
            public static final class C1824a extends J {

                /* renamed from: b, reason: collision with root package name */
                public static final int f48913b = Cf.c.f2713b;

                /* renamed from: a, reason: collision with root package name */
                private final Cf.c f48914a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1824a(Cf.c params) {
                    super(null);
                    AbstractC6492s.i(params, "params");
                    this.f48914a = params;
                }

                public final Cf.c a() {
                    return this.f48914a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1824a) && AbstractC6492s.d(this.f48914a, ((C1824a) obj).f48914a);
                }

                public int hashCode() {
                    return this.f48914a.hashCode();
                }

                public String toString() {
                    return "Detail(params=" + this.f48914a + ")";
                }
            }

            /* renamed from: i8.a$b$J$b, reason: collision with other inner class name */
            public static final class C1825b extends b {

                /* renamed from: a, reason: collision with root package name */
                public static final C1825b f48915a = new C1825b();

                private C1825b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1825b);
                }

                public int hashCode() {
                    return -555609769;
                }

                public String toString() {
                    return "DisplayPreferences";
                }
            }

            public /* synthetic */ J(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private J() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$K */
        public static final class K extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f48916b = xf.d.f66040b;

            /* renamed from: a, reason: collision with root package name */
            private final xf.d f48917a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public K(xf.d params) {
                super(null);
                AbstractC6492s.i(params, "params");
                this.f48917a = params;
            }

            public final xf.d a() {
                return this.f48917a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof K) && AbstractC6492s.d(this.f48917a, ((K) obj).f48917a);
            }

            public int hashCode() {
                return this.f48917a.hashCode();
            }

            public String toString() {
                return "WifiSignalDetail(params=" + this.f48917a + ")";
            }
        }

        /* renamed from: i8.a$b$L */
        public static abstract class L extends b {

            /* renamed from: i8.a$b$L$a, reason: collision with other inner class name */
            public static final class C1826a extends L {

                /* renamed from: a, reason: collision with root package name */
                public static final C1826a f48918a = new C1826a();

                private C1826a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1826a);
                }

                public int hashCode() {
                    return -648821636;
                }

                public String toString() {
                    return "Status";
                }
            }

            public /* synthetic */ L(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private L() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$a, reason: collision with other inner class name */
        public static final class C1827a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1827a f48919a = new C1827a();

            private C1827a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1827a);
            }

            public int hashCode() {
                return -814202779;
            }

            public String toString() {
                return "Acknowledgements";
            }
        }

        /* renamed from: i8.a$b$b, reason: collision with other inner class name */
        public static final class C1828b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1828b f48920a = new C1828b();

            private C1828b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1828b);
            }

            public int hashCode() {
                return 368169626;
            }

            public String toString() {
                return "AppFeedback";
            }
        }

        /* renamed from: i8.a$b$c, reason: case insensitive filesystem */
        public static final class C6085c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final c.a f48921a;

            public C6085c(c.a aVar) {
                super(null);
                this.f48921a = aVar;
            }

            public final c.a a() {
                return this.f48921a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6085c) && this.f48921a == ((C6085c) obj).f48921a;
            }

            public int hashCode() {
                c.a aVar = this.f48921a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "AppRoot(tab=" + this.f48921a + ")";
            }

            public /* synthetic */ C6085c(c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : aVar);
            }
        }

        /* renamed from: i8.a$b$d, reason: case insensitive filesystem */
        public static abstract class AbstractC6086d extends b {

            /* renamed from: i8.a$b$d$a, reason: collision with other inner class name */
            public static final class C1829a extends AbstractC6086d {

                /* renamed from: a, reason: collision with root package name */
                public static final C1829a f48922a = new C1829a();

                private C1829a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1829a);
                }

                public int hashCode() {
                    return 2121077417;
                }

                public String toString() {
                    return "Install";
                }
            }

            /* renamed from: i8.a$b$d$b, reason: collision with other inner class name */
            public static final class C1830b extends AbstractC6086d {

                /* renamed from: a, reason: collision with root package name */
                public static final C1830b f48923a = new C1830b();

                private C1830b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1830b);
                }

                public int hashCode() {
                    return 506811137;
                }

                public String toString() {
                    return "SupportedDevices";
                }
            }

            public /* synthetic */ AbstractC6086d(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC6086d() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$e, reason: case insensitive filesystem */
        public static abstract class AbstractC6087e extends b {

            /* renamed from: i8.a$b$e$a, reason: collision with other inner class name */
            public static final class C1831a extends AbstractC6087e {

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC3789a f48924a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1831a(AbstractC3789a link) {
                    super(null);
                    AbstractC6492s.i(link, "link");
                    this.f48924a = link;
                }

                public final AbstractC3789a a() {
                    return this.f48924a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1831a) && AbstractC6492s.d(this.f48924a, ((C1831a) obj).f48924a);
                }

                public int hashCode() {
                    return this.f48924a.hashCode();
                }

                public String toString() {
                    return "UnifiNetwork(link=" + this.f48924a + ")";
                }
            }

            public /* synthetic */ AbstractC6087e(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC6087e() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$f, reason: case insensitive filesystem */
        public static abstract class AbstractC6088f extends b {

            /* renamed from: i8.a$b$f$a, reason: collision with other inner class name */
            public static final class C1832a extends AbstractC6088f {

                /* renamed from: a, reason: collision with root package name */
                public static final C1832a f48925a = new C1832a();

                private C1832a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1832a);
                }

                public int hashCode() {
                    return -78522712;
                }

                public String toString() {
                    return "Settings";
                }
            }

            public /* synthetic */ AbstractC6088f(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC6088f() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$g, reason: case insensitive filesystem */
        public static final class C6089g extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f48926b = Je.b.f10007a;

            /* renamed from: a, reason: collision with root package name */
            private final Je.b f48927a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6089g(Je.b params) {
                super(null);
                AbstractC6492s.i(params, "params");
                this.f48927a = params;
            }

            public final Je.b a() {
                return this.f48927a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6089g) && AbstractC6492s.d(this.f48927a, ((C6089g) obj).f48927a);
            }

            public int hashCode() {
                return this.f48927a.hashCode();
            }

            public String toString() {
                return "DeviceDetail(params=" + this.f48927a + ")";
            }
        }

        /* renamed from: i8.a$b$h, reason: case insensitive filesystem */
        public static final class C6090h extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f48928b = Je.m.f10030b;

            /* renamed from: a, reason: collision with root package name */
            private final Je.m f48929a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6090h(Je.m params) {
                super(null);
                AbstractC6492s.i(params, "params");
                this.f48929a = params;
            }

            public final Je.m a() {
                return this.f48929a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6090h) && AbstractC6492s.d(this.f48929a, ((C6090h) obj).f48929a);
            }

            public int hashCode() {
                return this.f48929a.hashCode();
            }

            public String toString() {
                return "DeviceEdit(params=" + this.f48929a + ")";
            }
        }

        /* renamed from: i8.a$b$i, reason: case insensitive filesystem */
        public static final class C6091i extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f48930b = Je.b.f10007a;

            /* renamed from: a, reason: collision with root package name */
            private final Je.b f48931a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6091i(Je.b params) {
                super(null);
                AbstractC6492s.i(params, "params");
                this.f48931a = params;
            }

            public final Je.b a() {
                return this.f48931a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6091i) && AbstractC6492s.d(this.f48931a, ((C6091i) obj).f48931a);
            }

            public int hashCode() {
                return this.f48931a.hashCode();
            }

            public String toString() {
                return "DiscoveryDetail(params=" + this.f48931a + ")";
            }
        }

        /* renamed from: i8.a$b$j, reason: case insensitive filesystem */
        public static abstract class AbstractC6092j extends b {

            /* renamed from: i8.a$b$j$a, reason: collision with other inner class name */
            public static final class C1833a extends AbstractC6092j {

                /* renamed from: a, reason: collision with root package name */
                public static final C1833a f48932a = new C1833a();

                private C1833a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1833a);
                }

                public int hashCode() {
                    return 376040986;
                }

                public String toString() {
                    return "Bluetooth";
                }
            }

            /* renamed from: i8.a$b$j$b, reason: collision with other inner class name */
            public static final class C1834b extends AbstractC6092j {

                /* renamed from: a, reason: collision with root package name */
                public static final C1834b f48933a = new C1834b();

                private C1834b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1834b);
                }

                public int hashCode() {
                    return -1191129595;
                }

                public String toString() {
                    return "Lan";
                }
            }

            public /* synthetic */ AbstractC6092j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC6092j() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$k, reason: case insensitive filesystem */
        public static abstract class AbstractC6093k extends b {

            /* renamed from: i8.a$b$k$a, reason: collision with other inner class name */
            public static final class C1835a extends AbstractC6093k {

                /* renamed from: a, reason: collision with root package name */
                private final long f48934a;

                public C1835a(long j10) {
                    super(null);
                    this.f48934a = j10;
                }

                public final long a() {
                    return this.f48934a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1835a) && this.f48934a == ((C1835a) obj).f48934a;
                }

                public int hashCode() {
                    return Long.hashCode(this.f48934a);
                }

                public String toString() {
                    return "Delete(id=" + this.f48934a + ")";
                }
            }

            /* renamed from: i8.a$b$k$b, reason: collision with other inner class name */
            public static final class C1836b extends AbstractC6093k {

                /* renamed from: a, reason: collision with root package name */
                private final long f48935a;

                public C1836b(long j10) {
                    super(null);
                    this.f48935a = j10;
                }

                public final long a() {
                    return this.f48935a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1836b) && this.f48935a == ((C1836b) obj).f48935a;
                }

                public int hashCode() {
                    return Long.hashCode(this.f48935a);
                }

                public String toString() {
                    return "Detail(id=" + this.f48935a + ")";
                }
            }

            /* renamed from: i8.a$b$k$c */
            public static final class c extends AbstractC6093k {

                /* renamed from: a, reason: collision with root package name */
                private final long f48936a;

                public c(long j10) {
                    super(null);
                    this.f48936a = j10;
                }

                public final long a() {
                    return this.f48936a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.f48936a == ((c) obj).f48936a;
                }

                public int hashCode() {
                    return Long.hashCode(this.f48936a);
                }

                public String toString() {
                    return "Save(id=" + this.f48936a + ")";
                }
            }

            public /* synthetic */ AbstractC6093k(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC6093k() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$l, reason: case insensitive filesystem */
        public static final class C6094l extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C6094l f48937a = new C6094l();

            private C6094l() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C6094l);
            }

            public int hashCode() {
                return 303415115;
            }

            public String toString() {
                return "IspDetail";
            }
        }

        /* renamed from: i8.a$b$m */
        public static final class m extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f48938a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(String packageName) {
                super(null);
                AbstractC6492s.i(packageName, "packageName");
                this.f48938a = packageName;
            }

            public final String a() {
                return this.f48938a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && AbstractC6492s.d(this.f48938a, ((m) obj).f48938a);
            }

            public int hashCode() {
                return this.f48938a.hashCode();
            }

            public String toString() {
                return "LaunchApp(packageName=" + this.f48938a + ")";
            }
        }

        /* renamed from: i8.a$b$n */
        public static final class n extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final n f48939a = new n();

            private n() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public int hashCode() {
                return 1770938020;
            }

            public String toString() {
                return "NavigateBack";
            }
        }

        /* renamed from: i8.a$b$o */
        public static final class o extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f48940a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(String uri) {
                super(null);
                AbstractC6492s.i(uri, "uri");
                this.f48940a = uri;
            }

            public final String a() {
                return this.f48940a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof o) && AbstractC6492s.d(this.f48940a, ((o) obj).f48940a);
            }

            public int hashCode() {
                return this.f48940a.hashCode();
            }

            public String toString() {
                return "OpenBrowser(uri=" + this.f48940a + ")";
            }
        }

        /* renamed from: i8.a$b$p */
        public static abstract class p extends b {

            /* renamed from: i8.a$b$p$a, reason: collision with other inner class name */
            public static final class C1837a extends p {

                /* renamed from: a, reason: collision with root package name */
                public static final C1837a f48941a = new C1837a();

                private C1837a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1837a);
                }

                public int hashCode() {
                    return -1364331377;
                }

                public String toString() {
                    return "Create";
                }
            }

            /* renamed from: i8.a$b$p$b, reason: collision with other inner class name */
            public static final class C1838b extends p {

                /* renamed from: a, reason: collision with root package name */
                private final String f48942a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1838b(String id2) {
                    super(null);
                    AbstractC6492s.i(id2, "id");
                    this.f48942a = id2;
                }

                public final String a() {
                    return this.f48942a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1838b) && AbstractC6492s.d(this.f48942a, ((C1838b) obj).f48942a);
                }

                public int hashCode() {
                    return this.f48942a.hashCode();
                }

                public String toString() {
                    return "Detail(id=" + this.f48942a + ")";
                }
            }

            public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private p() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$q */
        public static final class q extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final q f48943a = new q();

            private q() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public int hashCode() {
                return 1031635886;
            }

            public String toString() {
                return "PrivacyPolicy";
            }
        }

        /* renamed from: i8.a$b$r */
        public static final class r extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final r f48944a = new r();

            private r() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof r);
            }

            public int hashCode() {
                return 706230776;
            }

            public String toString() {
                return "SSOAccountPicker";
            }
        }

        /* renamed from: i8.a$b$s */
        public static final class s extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final s f48945a = new s();

            private s() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public int hashCode() {
                return -2038482163;
            }

            public String toString() {
                return "SSOAccountSettings";
            }
        }

        /* renamed from: i8.a$b$t */
        public static final class t extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f48946a;

            public /* synthetic */ t(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }

            public final String a() {
                return this.f48946a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof t) && AbstractC6492s.d(this.f48946a, ((t) obj).f48946a);
            }

            public int hashCode() {
                String str = this.f48946a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "SSOLogin(username=" + this.f48946a + ")";
            }

            public t(String str) {
                super(null);
                this.f48946a = str;
            }
        }

        /* renamed from: i8.a$b$u */
        public static final class u extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final u f48947a = new u();

            private u() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof u);
            }

            public int hashCode() {
                return 488428365;
            }

            public String toString() {
                return "SSOLogout";
            }
        }

        /* renamed from: i8.a$b$v */
        public static abstract class v extends b {

            /* renamed from: i8.a$b$v$a, reason: collision with other inner class name */
            public static final class C1839a extends v {

                /* renamed from: a, reason: collision with root package name */
                public static final C1839a f48948a = new C1839a();

                private C1839a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1839a);
                }

                public int hashCode() {
                    return -1293880181;
                }

                public String toString() {
                    return "ChannelQuality";
                }
            }

            /* renamed from: i8.a$b$v$b, reason: collision with other inner class name */
            public static final class C1840b extends v {

                /* renamed from: a, reason: collision with root package name */
                public static final C1840b f48949a = new C1840b();

                private C1840b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1840b);
                }

                public int hashCode() {
                    return 332830036;
                }

                public String toString() {
                    return "Networks";
                }
            }

            public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private v() {
                super(null);
            }
        }

        /* renamed from: i8.a$b$w */
        public static final class w extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final w f48950a = new w();

            private w() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof w);
            }

            public int hashCode() {
                return 1015378639;
            }

            public String toString() {
                return "Settings";
            }
        }

        /* renamed from: i8.a$b$x */
        public static final class x extends b {

            /* renamed from: a, reason: collision with root package name */
            private final File f48951a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public x(File imageFile) {
                super(null);
                AbstractC6492s.i(imageFile, "imageFile");
                this.f48951a = imageFile;
            }

            public final File a() {
                return this.f48951a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof x) && AbstractC6492s.d(this.f48951a, ((x) obj).f48951a);
            }

            public int hashCode() {
                return this.f48951a.hashCode();
            }

            public String toString() {
                return "ShareImage(imageFile=" + this.f48951a + ")";
            }
        }

        /* renamed from: i8.a$b$z */
        public static final class z extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final z f48954a = new z();

            private z() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof z);
            }

            public int hashCode() {
                return 1214526062;
            }

            public String toString() {
                return "SignalApComparisonConfig";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: i8.a$b$y */
        public static final class y extends b {

            /* renamed from: a, reason: collision with root package name */
            private final File f48952a;

            /* renamed from: b, reason: collision with root package name */
            private final AbstractC5452a f48953b;

            public /* synthetic */ y(File file, AbstractC5452a abstractC5452a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(file, (i10 & 2) != 0 ? new AbstractC5452a.C1741a(R.string.share_support_file_chooser_title, new Object[0]) : abstractC5452a);
            }

            public final AbstractC5452a a() {
                return this.f48953b;
            }

            public final File b() {
                return this.f48952a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof y)) {
                    return false;
                }
                y yVar = (y) obj;
                return AbstractC6492s.d(this.f48952a, yVar.f48952a) && AbstractC6492s.d(this.f48953b, yVar.f48953b);
            }

            public int hashCode() {
                return (this.f48952a.hashCode() * 31) + this.f48953b.hashCode();
            }

            public String toString() {
                return "ShareSupportInfo(supportFile=" + this.f48952a + ", subject=" + this.f48953b + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(File supportFile, AbstractC5452a subject) {
                super(null);
                AbstractC6492s.i(supportFile, "supportFile");
                AbstractC6492s.i(subject, "subject");
                this.f48952a = supportFile;
                this.f48953b = subject;
            }
        }

        private b() {
        }
    }

    AbstractC5912b a(b... bVarArr);

    gg.s b();
}
