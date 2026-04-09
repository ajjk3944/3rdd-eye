package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dx1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.za0;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* loaded from: classes3.dex */
public final class yt1 {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f35977a;

    /* renamed from: b, reason: collision with root package name */
    private final zw1 f35978b;

    /* renamed from: c, reason: collision with root package name */
    private final r22 f35979c;

    public /* synthetic */ yt1(C4198s4 c4198s4) {
        this(c4198s4, new zw1(), new r22());
    }

    public final String a(Context context, cc advertisingConfiguration, j50 environmentConfiguration, xk xkVar, bu1 bu1Var) {
        String hostAddress;
        int i;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        C4198s4 c4198s4 = this.f35977a;
        EnumC4191r4 adLoadingPhaseType = EnumC4191r4.f32476z;
        c4198s4.getClass();
        kotlin.jvm.internal.l.f(adLoadingPhaseType, "adLoadingPhaseType");
        c4198s4.a(adLoadingPhaseType, null);
        oq oqVar = new oq(advertisingConfiguration, environmentConfiguration);
        hx1.f28410a.getClass();
        String strA = ((ix1) hx1.a.a(context)).a();
        String strA2 = sc.a().a();
        dx1.f26520a.getClass();
        String strA3 = dx1.a.a(context).a();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            kotlin.jvm.internal.l.e(networkInterfaces, "getNetworkInterfaces(...)");
            loop0: while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                kotlin.jvm.internal.l.e(inetAddresses, "getInetAddresses(...)");
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (inetAddressNextElement instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) inetAddressNextElement;
                        kotlin.jvm.internal.l.f(inet6Address, "<this>");
                        byte[] address = inet6Address.getAddress();
                        if (address != null && ((i = address[0] & 240) == 32 || i == 48)) {
                            hostAddress = ((Inet6Address) inetAddressNextElement).getHostAddress();
                            break loop0;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        hostAddress = null;
        zw1 sensitiveModeChecker = this.f35978b;
        oq1 oq1Var = new oq1();
        af1 af1Var = new af1(context, es0.a(context));
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        String strA4 = this.f35979c.a(context, new za0(za0.b.a(context, sensitiveModeChecker, oqVar, oq1Var, af1Var).a(xkVar != null ? xkVar.a() : null).a(context, xkVar != null ? xkVar.c() : null).h(strA).i(strA2).g(strA3).d(hostAddress).a(bu1Var).a(xkVar != null ? xkVar.b() : null), 0).toString());
        c4198s4.a(adLoadingPhaseType);
        return strA4;
    }

    public yt1(C4198s4 adLoadingPhasesManager, zw1 sensitiveModeChecker, r22 stringEncryptor) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(sensitiveModeChecker, "sensitiveModeChecker");
        kotlin.jvm.internal.l.f(stringEncryptor, "stringEncryptor");
        this.f35977a = adLoadingPhasesManager;
        this.f35978b = sensitiveModeChecker;
        this.f35979c = stringEncryptor;
    }
}
