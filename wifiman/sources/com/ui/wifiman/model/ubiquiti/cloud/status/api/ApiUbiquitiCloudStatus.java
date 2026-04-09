package com.ui.wifiman.model.ubiquiti.cloud.status.api;

import Y6.g;
import Y6.i;
import Yg.m;
import Yg.n;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0019\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;", "", "", "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;", "_components", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "f", "()Ljava/util/List;", "", "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;", SnmpConfigurator.O_BIND_ADDRESS, "LYg/m;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/util/Map;", "components", "Component", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiUbiquitiCloudStatus {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List _components;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m components = n.b(new InterfaceC6824a() { // from class: Pd.a
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return ApiUbiquitiCloudStatus.c(this.f18572a);
        }
    });

    public ApiUbiquitiCloudStatus(@g(name = "components") List<Component> list) {
        this._components = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map c(ApiUbiquitiCloudStatus apiUbiquitiCloudStatus) {
        InterfaceC8780j interfaceC8780jD0;
        InterfaceC8780j interfaceC8780jC;
        List list = apiUbiquitiCloudStatus._components;
        if (list == null || (interfaceC8780jD0 = AbstractC3689v.d0(list)) == null || (interfaceC8780jC = AbstractC8783m.C(interfaceC8780jD0, new InterfaceC6835l() { // from class: Pd.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ApiUbiquitiCloudStatus.d((ApiUbiquitiCloudStatus.Component) obj));
            }
        })) == null) {
            return U.h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC8780jC) {
            Component.b bVarC = ((Component) obj).c();
            AbstractC6492s.f(bVarC);
            linkedHashMap.put(bVarC, obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Component it) {
        AbstractC6492s.i(it, "it");
        return it.c() != null;
    }

    public final ApiUbiquitiCloudStatus copy(@g(name = "components") List<Component> _components) {
        return new ApiUbiquitiCloudStatus(_components);
    }

    public final Map e() {
        return (Map) this.components.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiUbiquitiCloudStatus) && AbstractC6492s.d(this._components, ((ApiUbiquitiCloudStatus) other)._components);
    }

    /* renamed from: f, reason: from getter */
    public final List get_components() {
        return this._components;
    }

    public int hashCode() {
        List list = this._components;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "ApiUbiquitiCloudStatus(_components=" + this._components + ")";
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0012B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;", "", "", "id", "_status", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "d", "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;", SnmpConfigurator.O_COMMUNITY, "()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$b;", "type", "Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;", "()Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component$a;", "status", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class Component {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String _status;

        public static abstract class a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1490a f43659a = new C1490a(null);

            /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus$Component$a$a, reason: collision with other inner class name */
            public static final class C1490a {
                public /* synthetic */ C1490a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public final a a(String id2) {
                    AbstractC6492s.i(id2, "id");
                    switch (id2.hashCode()) {
                        case -1376284817:
                            if (id2.equals("partial_outage")) {
                                return c.b.f43663b;
                            }
                            return null;
                        case -920193993:
                            if (id2.equals("major_outage")) {
                                return c.C1493a.f43662b;
                            }
                            return null;
                        case -31441761:
                            if (id2.equals("degraded_performance")) {
                                return b.C1491a.f43660b;
                            }
                            return null;
                        case 129704914:
                            if (id2.equals("operational")) {
                                return b.C1492b.f43661b;
                            }
                            return null;
                        default:
                            return null;
                    }
                }

                private C1490a() {
                }
            }

            public static abstract class b extends a {

                /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus$Component$a$b$a, reason: collision with other inner class name */
                public static final class C1491a extends b {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C1491a f43660b = new C1491a();

                    private C1491a() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1491a);
                    }

                    public int hashCode() {
                        return 1882041144;
                    }

                    public String toString() {
                        return "DegradedPerformance";
                    }
                }

                /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus$Component$a$b$b, reason: collision with other inner class name */
                public static final class C1492b extends b {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C1492b f43661b = new C1492b();

                    private C1492b() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1492b);
                    }

                    public int hashCode() {
                        return -1436734108;
                    }

                    public String toString() {
                        return "Fine";
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private b() {
                    super(null);
                }
            }

            public static abstract class c extends a {

                /* renamed from: com.ui.wifiman.model.ubiquiti.cloud.status.api.ApiUbiquitiCloudStatus$Component$a$c$a, reason: collision with other inner class name */
                public static final class C1493a extends c {

                    /* renamed from: b, reason: collision with root package name */
                    public static final C1493a f43662b = new C1493a();

                    private C1493a() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1493a);
                    }

                    public int hashCode() {
                        return 794794570;
                    }

                    public String toString() {
                        return "Major";
                    }
                }

                public static final class b extends c {

                    /* renamed from: b, reason: collision with root package name */
                    public static final b f43663b = new b();

                    private b() {
                        super(null);
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof b);
                    }

                    public int hashCode() {
                        return 1963445714;
                    }

                    public String toString() {
                        return "Partial";
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final a Companion;
            private static final m typeById$delegate;

            /* renamed from: id, reason: collision with root package name */
            private final String f43664id;
            public static final b TELEPORT_NCA_API = new b("TELEPORT_NCA_API", 0, "zcxp48kb64sd");
            public static final b SPEEDTEST = new b("SPEEDTEST", 1, "tnsxmcnssfj8");
            public static final b UNIFI_REMOTE_ACCESS = new b("UNIFI_REMOTE_ACCESS", 2, "rq00dnp58ym6");
            public static final b UNIFI_CLOUD_CONSOLE = new b("UNIFI_CLOUD_CONSOLE", 3, "lxk7tg6cz19c");

            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Map a() {
                    return (Map) b.typeById$delegate.getValue();
                }

                private a() {
                }
            }

            private static final /* synthetic */ b[] $values() {
                return new b[]{TELEPORT_NCA_API, SPEEDTEST, UNIFI_REMOTE_ACCESS, UNIFI_CLOUD_CONSOLE};
            }

            static {
                b[] bVarArr$values = $values();
                $VALUES = bVarArr$values;
                $ENTRIES = AbstractC5827b.a(bVarArr$values);
                Companion = new a(null);
                typeById$delegate = n.b(new InterfaceC6824a() { // from class: Pd.c
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return ApiUbiquitiCloudStatus.Component.b.typeById_delegate$lambda$1();
                    }
                });
            }

            private b(String str, int i10, String str2) {
                this.f43664id = str2;
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Map typeById_delegate$lambda$1() {
                b[] bVarArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(bVarArrValues.length), 16));
                for (b bVar : bVarArrValues) {
                    linkedHashMap.put(bVar.f43664id, bVar);
                }
                return linkedHashMap;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public Component(@g(name = "id") String str, @g(name = "status") String str2) {
            this.id = str;
            this._status = str2;
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final a b() {
            String str = this._status;
            if (str != null) {
                return a.f43659a.a(str);
            }
            return null;
        }

        public final b c() {
            String str = this.id;
            if (str != null) {
                return (b) b.Companion.a().get(str);
            }
            return null;
        }

        public final Component copy(@g(name = "id") String id2, @g(name = "status") String _status) {
            return new Component(id2, _status);
        }

        /* renamed from: d, reason: from getter */
        public final String get_status() {
            return this._status;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Component)) {
                return false;
            }
            Component component = (Component) other;
            return AbstractC6492s.d(this.id, component.id) && AbstractC6492s.d(this._status, component._status);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this._status;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Component(id=" + this.id + ", _status=" + this._status + ")";
        }

        public /* synthetic */ Component(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
        }
    }
}
