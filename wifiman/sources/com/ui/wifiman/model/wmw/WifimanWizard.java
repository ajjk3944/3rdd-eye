package com.ui.wifiman.model.wmw;

import com.ui.wifiman.model.wmw.b;
import gg.AbstractC5912b;
import h9.C5969a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface WifimanWizard {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "Connection", "AdoptionTimeout", "NoDeviceAdopted", "Upgrade", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Connection;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$AdoptionTimeout;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AdoptionTimeout extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final AdoptionTimeout f44063a = new AdoptionTimeout();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String message = "Failed to adopt the device in expected time range";

            private AdoptionTimeout() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof AdoptionTimeout);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return message;
            }

            public int hashCode() {
                return 652032829;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "AdoptionTimeout";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Connection;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Connection extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Throwable cause;

            public Connection(String str, Throwable th2) {
                super(null);
                this.message = str;
                this.cause = th2;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$NoDeviceAdopted;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoDeviceAdopted extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public NoDeviceAdopted(String str) {
                super(null);
                this.message = str;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error;", "<init>", "()V", "DeviceUnavailable", "Failed", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$DeviceUnavailable;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class Upgrade extends Error {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$DeviceUnavailable;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class DeviceUnavailable extends Upgrade {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DeviceUnavailable(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade$Failed;", "Lcom/ui/wifiman/model/wmw/WifimanWizard$Error$Upgrade;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Failed extends Upgrade {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Failed(String message, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                    this.cause = th2;
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                public /* synthetic */ Failed(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : th2);
                }
            }

            public /* synthetic */ Upgrade(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Upgrade() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static abstract class a {

        /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC1520a extends a {

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$a, reason: collision with other inner class name */
            public static final class C1521a extends AbstractC1520a {

                /* renamed from: a, reason: collision with root package name */
                private final b.a f44071a;

                /* renamed from: b, reason: collision with root package name */
                private final long f44072b;

                /* renamed from: c, reason: collision with root package name */
                private final com.ui.wmw.g f44073c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1521a(b.a adoption, long j10, com.ui.wmw.g wmwSession) {
                    super(null);
                    AbstractC6492s.i(adoption, "adoption");
                    AbstractC6492s.i(wmwSession, "wmwSession");
                    this.f44071a = adoption;
                    this.f44072b = j10;
                    this.f44073c = wmwSession;
                }

                @Override // com.ui.wifiman.model.wmw.WifimanWizard.a.AbstractC1520a
                public b.a a() {
                    return this.f44071a;
                }

                public final com.ui.wmw.g b() {
                    return this.f44073c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1521a)) {
                        return false;
                    }
                    C1521a c1521a = (C1521a) obj;
                    return AbstractC6492s.d(this.f44071a, c1521a.f44071a) && this.f44072b == c1521a.f44072b && AbstractC6492s.d(this.f44073c, c1521a.f44073c);
                }

                public int hashCode() {
                    return (((this.f44071a.hashCode() * 31) + Long.hashCode(this.f44072b)) * 31) + this.f44073c.hashCode();
                }

                public String toString() {
                    return "Connected(adoption=" + this.f44071a + ", since=" + this.f44072b + ", wmwSession=" + this.f44073c + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$b */
            public static final class b extends AbstractC1520a {

                /* renamed from: a, reason: collision with root package name */
                private final b.a f44074a;

                /* renamed from: b, reason: collision with root package name */
                private final float f44075b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(b.a adoption, float f10) {
                    super(null);
                    AbstractC6492s.i(adoption, "adoption");
                    this.f44074a = adoption;
                    this.f44075b = f10;
                }

                @Override // com.ui.wifiman.model.wmw.WifimanWizard.a.AbstractC1520a
                public b.a a() {
                    return this.f44074a;
                }

                public final float b() {
                    return this.f44075b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return AbstractC6492s.d(this.f44074a, bVar.f44074a) && Float.compare(this.f44075b, bVar.f44075b) == 0;
                }

                public int hashCode() {
                    return (this.f44074a.hashCode() * 31) + Float.hashCode(this.f44075b);
                }

                public String toString() {
                    return "Connecting(adoption=" + this.f44074a + ", progressLevel=" + this.f44075b + ")";
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$c */
            public static abstract class c extends AbstractC1520a {

                /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$c$a, reason: collision with other inner class name */
                public static final class C1522a extends c {

                    /* renamed from: a, reason: collision with root package name */
                    private final b.a f44076a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Error f44077b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1522a(b.a adoption, Error reason) {
                        super(null);
                        AbstractC6492s.i(adoption, "adoption");
                        AbstractC6492s.i(reason, "reason");
                        this.f44076a = adoption;
                        this.f44077b = reason;
                    }

                    @Override // com.ui.wifiman.model.wmw.WifimanWizard.a.AbstractC1520a
                    public b.a a() {
                        return this.f44076a;
                    }

                    public final Error b() {
                        return this.f44077b;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C1522a)) {
                            return false;
                        }
                        C1522a c1522a = (C1522a) obj;
                        return AbstractC6492s.d(this.f44076a, c1522a.f44076a) && AbstractC6492s.d(this.f44077b, c1522a.f44077b);
                    }

                    public int hashCode() {
                        return (this.f44076a.hashCode() * 31) + this.f44077b.hashCode();
                    }

                    public String toString() {
                        return "ConnectionFailed(adoption=" + this.f44076a + ", reason=" + this.f44077b + ")";
                    }
                }

                /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$c$b */
                public static final class b extends c {

                    /* renamed from: a, reason: collision with root package name */
                    private final b.a f44078a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(b.a adoption) {
                        super(null);
                        AbstractC6492s.i(adoption, "adoption");
                        this.f44078a = adoption;
                    }

                    @Override // com.ui.wifiman.model.wmw.WifimanWizard.a.AbstractC1520a
                    public b.a a() {
                        return this.f44078a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof b) && AbstractC6492s.d(this.f44078a, ((b) obj).f44078a);
                    }

                    public int hashCode() {
                        return this.f44078a.hashCode();
                    }

                    public String toString() {
                        return "Idle(adoption=" + this.f44078a + ")";
                    }
                }

                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private c() {
                    super(null);
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$a$d */
            public static final class d extends AbstractC1520a {

                /* renamed from: a, reason: collision with root package name */
                private final b.a f44079a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(b.a adoption) {
                    super(null);
                    AbstractC6492s.i(adoption, "adoption");
                    this.f44079a = adoption;
                }

                @Override // com.ui.wifiman.model.wmw.WifimanWizard.a.AbstractC1520a
                public b.a a() {
                    return this.f44079a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && AbstractC6492s.d(this.f44079a, ((d) obj).f44079a);
                }

                public int hashCode() {
                    return this.f44079a.hashCode();
                }

                public String toString() {
                    return "Discovering(adoption=" + this.f44079a + ")";
                }
            }

            public /* synthetic */ AbstractC1520a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract b.a a();

            private AbstractC1520a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f44080a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -670953230;
            }

            public String toString() {
                return "NotBonded";
            }
        }

        public static abstract class c extends a {

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$c$a, reason: collision with other inner class name */
            public static final class C1523a extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final C1523a f44081a = new C1523a();

                private C1523a() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1523a);
                }

                public int hashCode() {
                    return 157255326;
                }

                public String toString() {
                    return "BluetoothAdapterDisabled";
                }
            }

            public static final class b extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final b f44082a = new b();

                private b() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 1259897070;
                }

                public String toString() {
                    return "BluetoothAdapterUnavailable";
                }
            }

            /* renamed from: com.ui.wifiman.model.wmw.WifimanWizard$a$c$c, reason: collision with other inner class name */
            public static final class C1524c extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final C1524c f44083a = new C1524c();

                private C1524c() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1524c);
                }

                public int hashCode() {
                    return 680801971;
                }

                public String toString() {
                    return "InsufficientPermission";
                }
            }

            public static final class d extends c {

                /* renamed from: a, reason: collision with root package name */
                public static final d f44084a = new d();

                private d() {
                    super(null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof d);
                }

                public int hashCode() {
                    return -1391785326;
                }

                public String toString() {
                    return "LocationDisabled";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    AbstractC5912b a();

    AbstractC5912b b(C5969a c5969a);

    AbstractC5912b c();

    gg.i d();

    gg.i e();

    gg.i getState();
}
