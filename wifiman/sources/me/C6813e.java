package me;

import S8.j;
import Zg.AbstractC3689v;
import Zg.U;
import Zg.d0;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6516j;
import kotlin.text.InterfaceC6518l;
import mh.InterfaceC6835l;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import sh.AbstractC7978m;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: me.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6813e implements InterfaceC6809a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f53980a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.text.p f53981b;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: me.e$a */
    static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final String key;
        public static final a OWE_TRANSITION = new a("OWE_TRANSITION", 0, "OWE_TRANSITION");
        public static final a OWE = new a("OWE", 1, "OWE");
        public static final a DPP = new a("DPP", 2, "DPP");
        public static final a WEP = new a("WEP", 3, "WEP");
        public static final a WAPI = new a("WAPI", 4, "WAPI");
        public static final a WPS = new a("WPS", 5, "WPS");
        public static final a PSK = new a("PSK", 6, "PSK");
        public static final a PSK_FT = new a("PSK_FT", 7, "FT/PSK");
        public static final a WPA = new a("WPA", 8, "WPA");
        public static final a WPA2 = new a("WPA2", 9, "WPA2");
        public static final a RSN = new a("RSN", 10, "RSN");
        public static final a EAP = new a("EAP", 11, "EAP");
        public static final a EAP_FT = new a("EAP_FT", 12, "FT/EAP");
        public static final a EAP_FILS = new a("EAP_FILS", 13, "EAP-FILS");
        public static final a EAP_SHA1 = new a("EAP_SHA1", 14, "EAP/SHA1");
        public static final a EAP_SHA256 = new a("EAP_SHA256", 15, "EAP/SHA256");
        public static final a ENC_SHA1 = new a("ENC_SHA1", 16, "SHA1");
        public static final a ENC_SHA256 = new a("ENC_SHA256", 17, "SHA256");
        public static final a EAP_SUITE_B_192 = new a("EAP_SUITE_B_192", 18, "SUITE_B_192");
        public static final a ENC_SUITE_B = new a("ENC_SUITE_B", 19, "SUITE_B");
        public static final a SAE = new a("SAE", 20, "SAE");
        public static final a SAE_FT = new a("SAE_FT", 21, "FT/SAE");

        private static final /* synthetic */ a[] $values() {
            return new a[]{OWE_TRANSITION, OWE, DPP, WEP, WAPI, WPS, PSK, PSK_FT, WPA, WPA2, RSN, EAP, EAP_FT, EAP_FILS, EAP_SHA1, EAP_SHA256, ENC_SHA1, ENC_SHA256, EAP_SUITE_B_192, ENC_SUITE_B, SAE, SAE_FT};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.key = str2;
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

        public final String getKey() {
            return this.key;
        }
    }

    public C6813e() {
        InterfaceC5826a entries = a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((a) obj).getKey(), obj);
        }
        this.f53980a = linkedHashMap;
        this.f53981b = new kotlin.text.p("\\[([^\\[\\]]+)\\]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC6518l it) {
        AbstractC6492s.i(it, "it");
        C6516j c6516j = it.c().get(1);
        if (c6516j != null) {
            return c6516j.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC8780j f(String it) {
        AbstractC6492s.i(it, "it");
        return kotlin.text.t.S0(it, new String[]{MqttTopic.SINGLE_LEVEL_WILDCARD}, false, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a g(C6813e c6813e, String it) {
        AbstractC6492s.i(it, "it");
        return (a) c6813e.f53980a.get(it);
    }

    @Override // me.InterfaceC6809a
    public S8.j a(String capabilities) {
        AbstractC6492s.i(capabilities, "capabilities");
        j.a aVar = S8.j.f20385c;
        Set setB = d0.b();
        if (!kotlin.text.t.m0(capabilities)) {
            InterfaceC8780j interfaceC8780jH = kotlin.text.p.h(this.f53981b, capabilities, 0, 2, null);
            for (String str : AbstractC8783m.v(interfaceC8780jH) ? AbstractC8783m.O(interfaceC8780jH, new InterfaceC6835l() { // from class: me.b
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C6813e.e((InterfaceC6518l) obj);
                }
            }) : AbstractC8783m.s(capabilities)) {
                HashSet hashSetY = AbstractC8783m.Y(AbstractC8783m.O(AbstractC8783m.j(AbstractC8783m.N(kotlin.text.t.S0(str, new String[]{"-"}, false, 0, 6, null), new InterfaceC6835l() { // from class: me.c
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return C6813e.f((String) obj);
                    }
                })), new InterfaceC6835l() { // from class: me.d
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return C6813e.g(this.f53979a, (String) obj);
                    }
                }));
                if (hashSetY.contains(a.WEP)) {
                    setB.add(j.b.e.f20392a);
                }
                if (hashSetY.contains(a.WAPI)) {
                    setB.add(j.b.d.f20391a);
                }
                if (hashSetY.contains(a.WPS)) {
                    setB.add(j.b.i.f20401a);
                }
                if (hashSetY.contains(a.WPA)) {
                    if (hashSetY.contains(a.PSK)) {
                        setB.add(j.b.f.C0731b.f20394a);
                    }
                    if (hashSetY.contains(a.PSK_FT)) {
                        setB.add(j.b.f.C0731b.f20394a);
                    }
                    a aVar2 = a.EAP;
                    if (hashSetY.contains(aVar2)) {
                        setB.add(j.b.f.a.f20393a);
                    }
                    if (hashSetY.contains(a.EAP_SHA1)) {
                        setB.add(j.b.f.a.f20393a);
                    }
                    if (hashSetY.contains(a.EAP_FT)) {
                        setB.add(j.b.f.a.f20393a);
                    }
                    if (hashSetY.contains(a.EAP_FILS)) {
                        setB.add(j.b.f.a.f20393a);
                        setB.add(j.b.a.f20388a);
                    }
                    if (kotlin.text.t.W(str, aVar2.getKey(), false, 2, null) && kotlin.text.t.W(str, a.ENC_SHA1.getKey(), false, 2, null)) {
                        setB.add(j.b.f.a.f20393a);
                    }
                }
                if (hashSetY.contains(a.WPA2) || hashSetY.contains(a.RSN)) {
                    if (hashSetY.contains(a.PSK)) {
                        setB.add(j.b.g.C0732b.f20396a);
                    }
                    if (hashSetY.contains(a.PSK_FT)) {
                        setB.add(j.b.g.C0732b.f20396a);
                    }
                    if (hashSetY.contains(a.EAP_SHA1)) {
                        setB.add(j.b.g.a.f20395a);
                    }
                    if (!kotlin.text.t.W(str, a.ENC_SHA256.getKey(), false, 2, null)) {
                        if (hashSetY.contains(a.EAP)) {
                            setB.add(j.b.g.a.f20395a);
                        }
                        if (hashSetY.contains(a.EAP_FT)) {
                            setB.add(j.b.g.a.f20395a);
                        }
                        if (hashSetY.contains(a.EAP_FILS)) {
                            setB.add(j.b.g.a.f20395a);
                            setB.add(j.b.a.f20388a);
                        }
                    }
                    if (kotlin.text.t.W(str, a.EAP.getKey(), false, 2, null) && kotlin.text.t.W(str, a.ENC_SHA1.getKey(), false, 2, null)) {
                        setB.add(j.b.g.a.f20395a);
                    }
                }
                a aVar3 = a.SAE;
                if (hashSetY.contains(aVar3)) {
                    setB.add(j.b.h.d.f20400a);
                }
                if (hashSetY.contains(a.SAE_FT)) {
                    setB.add(j.b.h.d.f20400a);
                }
                if (kotlin.text.t.W(str, aVar3.getKey(), false, 2, null)) {
                    setB.add(j.b.h.d.f20400a);
                }
                if (hashSetY.contains(a.EAP_SHA256)) {
                    setB.add(j.b.h.C0733b.f20398a);
                }
                if (kotlin.text.t.W(str, a.EAP_SUITE_B_192.getKey(), false, 2, null)) {
                    setB.add(j.b.h.C0733b.f20398a);
                }
                if (kotlin.text.t.W(str, a.EAP.getKey(), false, 2, null)) {
                    if (kotlin.text.t.W(str, a.ENC_SHA256.getKey(), false, 2, null)) {
                        setB.add(j.b.h.C0733b.f20398a);
                    }
                    if (kotlin.text.t.W(str, a.ENC_SUITE_B.getKey(), false, 2, null)) {
                        setB.add(j.b.h.C0733b.f20398a);
                    }
                }
                if (hashSetY.contains(a.OWE_TRANSITION)) {
                    setB.add(j.b.h.c.f20399a);
                    setB.add(j.b.C0730b.f20389a);
                }
                if (hashSetY.contains(a.OWE)) {
                    setB.add(j.b.h.c.f20399a);
                }
                if (hashSetY.contains(a.DPP)) {
                    setB.add(j.b.h.a.f20397a);
                }
            }
            if (setB.isEmpty()) {
                setB.add(j.b.C0730b.f20389a);
            }
        }
        return aVar.a(d0.a(setB));
    }
}
