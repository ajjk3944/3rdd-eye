package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class M5 extends r {

    /* renamed from: b, reason: collision with root package name */
    private final C4324d f35067b;

    public M5(C4324d c4324d) {
        this.f35067b = c4324d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC4449s
    public final InterfaceC4449s e(String str, Z2 z22, List list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                AbstractC4354g2.g("getEventName", 0, list);
                return new C4465u(this.f35067b.d().e());
            case "getTimestamp":
                AbstractC4354g2.g("getTimestamp", 0, list);
                return new C4386k(Double.valueOf(this.f35067b.d().a()));
            case "getParamValue":
                AbstractC4354g2.g("getParamValue", 1, list);
                return W3.b(this.f35067b.d().b(z22.b((InterfaceC4449s) list.get(0)).zzf()));
            case "getParams":
                AbstractC4354g2.g("getParams", 0, list);
                Map mapG = this.f35067b.d().g();
                r rVar = new r();
                for (String str2 : mapG.keySet()) {
                    rVar.f(str2, W3.b(mapG.get(str2)));
                }
                return rVar;
            case "setParamValue":
                AbstractC4354g2.g("setParamValue", 2, list);
                String strZzf = z22.b((InterfaceC4449s) list.get(0)).zzf();
                InterfaceC4449s interfaceC4449sB = z22.b((InterfaceC4449s) list.get(1));
                this.f35067b.d().d(strZzf, AbstractC4354g2.d(interfaceC4449sB));
                return interfaceC4449sB;
            case "setEventName":
                AbstractC4354g2.g("setEventName", 1, list);
                InterfaceC4449s interfaceC4449sB2 = z22.b((InterfaceC4449s) list.get(0));
                if (InterfaceC4449s.f35450e0.equals(interfaceC4449sB2) || InterfaceC4449s.f35451f0.equals(interfaceC4449sB2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f35067b.d().f(interfaceC4449sB2.zzf());
                return new C4465u(interfaceC4449sB2.zzf());
            default:
                return super.e(str, z22, list);
        }
    }
}
