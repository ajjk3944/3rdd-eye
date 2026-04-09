package com.ui.wifiman.model.discovery.engine.snmp;

import Zg.AbstractC3689v;
import com.ui.wifiman.model.discovery.engine.snmp.Snmp;
import com.ui.wifiman.model.discovery.engine.snmp.c;
import ee.AbstractC5456b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import gg.y;
import inet.ipaddr.g;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kg.InterfaceC6468e;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import kotlin.text.t;
import m9.C6783c;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Target;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TransportIpAddress;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;

/* loaded from: classes4.dex */
public final class c implements Snmp {

    /* renamed from: e, reason: collision with root package name */
    public static final a f42787e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final y f42788a = C6783c.f53633a.e(1, 5000, "Snmp");

    /* renamed from: b, reason: collision with root package name */
    private final y f42789b;

    /* renamed from: c, reason: collision with root package name */
    private final PDU f42790c;

    /* renamed from: d, reason: collision with root package name */
    private final i f42791d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        private final String oid;
        public static final b description = new b("description", 0, "1.3.6.1.2.1.1.1");
        public static final b objectID = new b("objectID", 1, "1.3.6.1.2.1.1.2");
        public static final b uptime = new b("uptime", 2, "1.3.6.1.2.1.1.3");
        public static final b contact = new b("contact", 3, "1.3.6.1.2.1.1.4");
        public static final b deviceName = new b("deviceName", 4, "1.3.6.1.2.1.1.5");
        public static final b location = new b("location", 5, "1.3.6.1.2.1.1.6");
        public static final b services = new b("services", 6, "1.3.6.1.2.1.1.7");

        private static final /* synthetic */ b[] $values() {
            return new b[]{description, objectID, uptime, contact, deviceName, location, services};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10, String str2) {
            this.oid = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final String getOid() {
            return this.oid;
        }

        public final OID getOidWithInterface() {
            return new OID(this.oid + ".0");
        }
    }

    /* renamed from: com.ui.wifiman.model.discovery.engine.snmp.c$c, reason: collision with other inner class name */
    static final class C1406c implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f42793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f42794c;

        C1406c(g gVar, long j10) {
            this.f42793b = gVar;
            this.f42794c = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(final c cVar, final org.snmp4j.Snmp snmp, g gVar, long j10, final j emitter) {
            AbstractC6492s.i(emitter, "emitter");
            final N n10 = new N();
            final N n11 = new N();
            emitter.d(new InterfaceC6468e() { // from class: com.ui.wifiman.model.discovery.engine.snmp.e
                @Override // kg.InterfaceC6468e
                public final void cancel() {
                    c.C1406c.f(n11, n10, snmp);
                }
            });
            n10.f51689a = new ResponseListener() { // from class: com.ui.wifiman.model.discovery.engine.snmp.f
                @Override // org.snmp4j.event.ResponseListener
                public final void onResponse(ResponseEvent responseEvent) {
                    c.C1406c.g(cVar, emitter, responseEvent);
                }
            };
            PDU pduH = cVar.h();
            n11.f51689a = pduH;
            try {
                snmp.send(pduH, cVar.i(gVar, j10), (Object) null, (ResponseListener) n10.f51689a);
            } catch (IOException unused) {
                emitter.c(new Snmp.Error.Internal("Failed to send snmp request", null, 2, null));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(N n10, N n11, org.snmp4j.Snmp snmp) {
            Object obj;
            Object obj2 = n10.f51689a;
            if (obj2 == null || (obj = n11.f51689a) == null) {
                return;
            }
            try {
                snmp.cancel((PDU) obj2, (ResponseListener) obj);
            } catch (Exception e10) {
                Z7.b.i("Failed to cancel snmp request", e10, "SNMP");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(c cVar, j jVar, ResponseEvent responseEvent) {
            Snmp.a aVarG;
            if (responseEvent == null || (aVarG = cVar.g(responseEvent)) == null) {
                return;
            }
            jVar.h(aVarG);
        }

        @Override // kg.n
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final org.snmp4j.Snmp client) {
            AbstractC6492s.i(client, "client");
            final c cVar = c.this;
            final g gVar = this.f42793b;
            final long j10 = this.f42794c;
            return i.N(new k() { // from class: com.ui.wifiman.model.discovery.engine.snmp.d
                @Override // gg.k
                public final void a(j jVar) {
                    c.C1406c.e(cVar, client, gVar, j10, jVar);
                }
            }, EnumC5911a.BUFFER);
        }
    }

    public c() {
        y yVarA = Gg.a.a();
        AbstractC6492s.h(yVarA, "computation(...)");
        this.f42789b = yVarA;
        InterfaceC5826a entries = b.getEntries();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).getOidWithInterface());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new VariableBinding((OID) it2.next()));
        }
        this.f42790c = new PDU(-96, arrayList2);
        i iVarI2 = i.N(new k() { // from class: Oc.c
            @Override // gg.k
            public final void a(j jVar) {
                com.ui.wifiman.model.discovery.engine.snmp.c.j(jVar);
            }
        }, EnumC5911a.LATEST).F1(this.f42788a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f42791d = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Snmp.a g(ResponseEvent responseEvent) {
        InetAddress inetAddress;
        g gVarA;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Address peerAddress = responseEvent.getPeerAddress();
        TransportIpAddress transportIpAddress = peerAddress instanceof TransportIpAddress ? (TransportIpAddress) peerAddress : null;
        if (transportIpAddress == null || (inetAddress = transportIpAddress.getInetAddress()) == null || (gVarA = AbstractC5456b.a(inetAddress)) == null) {
            return null;
        }
        Variable variable = responseEvent.getResponse().getVariable(b.deviceName.getOidWithInterface());
        String str = (variable == null || (string6 = variable.toString()) == null || t.m0(string6)) ? null : string6;
        Variable variable2 = responseEvent.getResponse().getVariable(b.description.getOidWithInterface());
        String str2 = (variable2 == null || (string5 = variable2.toString()) == null || t.m0(string5)) ? null : string5;
        Variable variable3 = responseEvent.getResponse().getVariable(b.uptime.getOidWithInterface());
        String str3 = (variable3 == null || (string4 = variable3.toString()) == null || t.m0(string4)) ? null : string4;
        Variable variable4 = responseEvent.getResponse().getVariable(b.contact.getOidWithInterface());
        String str4 = (variable4 == null || (string3 = variable4.toString()) == null || t.m0(string3)) ? null : string3;
        Variable variable5 = responseEvent.getResponse().getVariable(b.location.getOidWithInterface());
        String str5 = (variable5 == null || (string2 = variable5.toString()) == null || t.m0(string2)) ? null : string2;
        Variable variable6 = responseEvent.getResponse().getVariable(b.services.getOidWithInterface());
        return new Snmp.a(gVarA, str, str2, str3, str4, str5, (variable6 == null || (string = variable6.toString()) == null || t.m0(string)) ? null : string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PDU h() {
        Object objClone = this.f42790c.clone();
        AbstractC6492s.g(objClone, "null cannot be cast to non-null type org.snmp4j.PDU");
        return (PDU) objClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target i(g gVar, long j10) {
        String str = String.format("udp:%1$s/161", Arrays.copyOf(new Object[]{gVar}, 1));
        AbstractC6492s.h(str, "format(...)");
        CommunityTarget communityTarget = new CommunityTarget(GenericAddress.parse(str), new OctetString("public"));
        communityTarget.setRetries(0);
        communityTarget.setTimeout(j10);
        communityTarget.setVersion(1);
        return communityTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final N n10 = new N();
        emitter.d(new InterfaceC6468e() { // from class: Oc.b
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                com.ui.wifiman.model.discovery.engine.snmp.c.k(n10);
            }
        });
        try {
            Z7.b.g("SNMP Client creating transport mapping", "SNMP");
            DefaultUdpTransportMapping defaultUdpTransportMapping = new DefaultUdpTransportMapping();
            Z7.b.g("SNMP Client creating", "SNMP");
            n10.f51689a = new org.snmp4j.Snmp(defaultUdpTransportMapping);
            Z7.b.g("SNMP Client created", "SNMP");
            try {
                Z7.b.g("SNMP Client transport thread starting", "SNMP");
                defaultUdpTransportMapping.listen();
                Z7.b.g("SNMP Client transport thread started", "SNMP");
                emitter.h(n10.f51689a);
            } catch (IOException e10) {
                emitter.c(new Snmp.Error.Internal("Failed to start listener thread", e10));
            }
        } catch (IOException e11) {
            emitter.c(new Snmp.Error.Internal("Failed instantiate SNMP transport mapping", e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(N n10) {
        try {
            Z7.b.g("SNMP Client closing", "SNMP");
            org.snmp4j.Snmp snmp = (org.snmp4j.Snmp) n10.f51689a;
            if (snmp != null) {
                snmp.close();
            }
            Z7.b.g("SNMP Client closed", "SNMP");
        } catch (IOException e10) {
            Z7.b.i("SNMP Client close failed", e10, "SNMP");
        }
    }

    @Override // com.ui.wifiman.model.discovery.engine.snmp.Snmp
    public i a(g ipAddress, long j10) {
        AbstractC6492s.i(ipAddress, "ipAddress");
        i iVarX0 = this.f42791d.I1(new C1406c(ipAddress, j10)).g2(this.f42788a).X0(this.f42789b);
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }
}
