package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.lo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4778lo implements InterfaceC4804mo {
    @Override // io.appmetrica.analytics.impl.InterfaceC4804mo
    public final C4752ko a(List<C4752ko> list) {
        LinkedList linkedList = new LinkedList();
        boolean z10 = true;
        for (C4752ko c4752ko : list) {
            if (!c4752ko.f41158a) {
                linkedList.add(c4752ko.f41159b);
                z10 = false;
            }
        }
        return z10 ? new C4752ko(this, true, "") : new C4752ko(this, false, TextUtils.join(", ", linkedList));
    }
}
