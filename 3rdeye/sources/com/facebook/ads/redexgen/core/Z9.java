package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C3272dL c3272dL, final C2915Ua c2915Ua, final AbstractC3547hy abstractC3547hy, final InterfaceC3003Xn interfaceC3003Xn, final Z5 z52, Handler handler, Z6 z62) {
        c3272dL.A0F().AAv(z52.name().toLowerCase(Locale.US));
        return abstractC3547hy.A2F() ? new Z4(c3272dL, handler, z62, abstractC3547hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3272dL c3272dL2 = c3272dL;
                C2915Ua c2915Ua2 = c2915Ua;
                InterfaceC3003Xn interfaceC3003Xn2 = interfaceC3003Xn;
                Z5 z53 = z52;
                AbstractC3547hy abstractC3547hy2 = abstractC3547hy;
                Z9.A04(c3272dL2, c2915Ua2, interfaceC3003Xn2, z53, abstractC3547hy2.A25(), abstractC3547hy2.A23());
            }
        }) : new ZA(c3272dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3272dL c3272dL2 = c3272dL;
                C2915Ua c2915Ua2 = c2915Ua;
                InterfaceC3003Xn interfaceC3003Xn2 = interfaceC3003Xn;
                Z5 z53 = z52;
                AbstractC3547hy abstractC3547hy2 = abstractC3547hy;
                Z9.A04(c3272dL2, c2915Ua2, interfaceC3003Xn2, z53, abstractC3547hy2.A25(), abstractC3547hy2.A23());
            }
        });
    }

    public static ImageView A01(C3272dL c3272dL, C2915Ua c2915Ua, AbstractC3547hy abstractC3547hy, Z5 z52, InterfaceC3003Xn interfaceC3003Xn, Handler handler) {
        return A00(c3272dL, c2915Ua, abstractC3547hy, interfaceC3003Xn, z52, handler, Z6.A03);
    }

    public static void A04(C3272dL c3272dL, C2915Ua c2915Ua, InterfaceC3003Xn interfaceC3003Xn, Z5 z52, String str, N9 n9) {
        if (c2915Ua != null) {
            c2915Ua.A04(UZ.A0A, null);
        }
        c3272dL.A0F().AAu(z52.name().toLowerCase(Locale.US));
        if (O3.A00(c3272dL.A02()).A0O(c3272dL.A02(), true)) {
            interfaceC3003Xn.AAf(str, n9);
        } else {
            if (TextUtils.isEmpty(n9.A00())) {
                return;
            }
            WN.A0O(new WN(), c3272dL, WQ.A00(n9.A00()), str);
        }
    }
}
