package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112ej implements InterfaceC1921tk {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0828Yg f13928a;

    /* renamed from: b, reason: collision with root package name */
    public final C0784Vn f13929b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f13930c;

    public C1112ej(InterfaceC0828Yg interfaceC0828Yg, C0784Vn c0784Vn, Qt qt) {
        this.f13928a = interfaceC0828Yg;
        this.f13929b = c0784Vn;
        this.f13930c = qt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        InterfaceC0828Yg interfaceC0828Yg;
        String str;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.ge)).booleanValue() || (interfaceC0828Yg = this.f13928a) == null) {
            return;
        }
        ViewParent parent = interfaceC0828Yg.b0().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        C0697Ql c0697QlA = this.f13929b.a();
        c0697QlA.r("action", "hcp");
        c0697QlA.r("hcp", str);
        c0697QlA.o(this.f13930c);
        c0697QlA.s();
    }
}
