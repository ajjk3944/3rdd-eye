package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.nv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1851nv implements InterfaceC0434Cx {
    public static String[] A07 = {"KBisateWM8YQ4arKDgRYpdTDxezzMkCv", "VJ2uSooodcJBZOLyoDYKaqw5tYDrMz4W", "bemaZsDF2tY6J54Bg3tOUH55klLpC", "LnVxhCvG0lD6F7ZPu", "7ofy39p1yDzqV7NnIWFVVnn8VzEJdml2", "3pklWVRHTZe0TjeZrFE3TnxhkITdP", "TfKHOeXRiNIOMg3PDS", "WMeybOD3P6lu5fyh7Idh"};
    public Looper A00;
    public Timeline A01;
    public C8O A02;
    public final ArrayList<InterfaceC0433Cw> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC0433Cw> A06 = new HashSet<>(1);
    public final D8 A04 = new D8();
    public final A1 A03 = new A1();

    public abstract void A09();

    public abstract void A0A(InterfaceC02675t interfaceC02675t);

    public final C8O A00() {
        return (C8O) AbstractC02203y.A02(this.A02);
    }

    public final A1 A01(C1844no c1844no) {
        return this.A03.A00(0, c1844no);
    }

    public final D8 A02(C1844no c1844no) {
        return this.A04.A02(0, c1844no, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC0433Cw> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AG1(this, timeline);
        }
    }

    public final void A06(InterfaceC0433Cw interfaceC0433Cw) {
        boolean z3 = !this.A06.isEmpty();
        this.A06.remove(interfaceC0433Cw);
        if (z3) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC0433Cw interfaceC0433Cw) {
        AbstractC02203y.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC0433Cw);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A08(com.instagram.common.viewpoint.core.InterfaceC0433Cw r4, com.instagram.common.viewpoint.core.InterfaceC02675t r5, com.instagram.common.viewpoint.core.C8O r6) {
        /*
            r3 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r0 = r3.A00
            if (r0 == 0) goto Lc
            android.os.Looper r0 = r3.A00
            if (r0 != r2) goto L31
        Lc:
            r0 = 1
        Ld:
            com.instagram.common.viewpoint.core.AbstractC02203y.A07(r0)
            r3.A02 = r6
            com.facebook.ads.androidx.media3.common.Timeline r1 = r3.A01
            java.util.ArrayList<com.facebook.ads.redexgen.X.Cw> r0 = r3.A05
            r0.add(r4)
            android.os.Looper r0 = r3.A00
            if (r0 != 0) goto L28
            r3.A00 = r2
            java.util.HashSet<com.facebook.ads.redexgen.X.Cw> r0 = r3.A06
            r0.add(r4)
            r3.A0A(r5)
        L27:
            return
        L28:
            if (r1 == 0) goto L27
            r3.A07(r4)
            r4.AG1(r3, r1)
            goto L27
        L31:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC1851nv.A08(com.facebook.ads.redexgen.X.Cw, com.facebook.ads.redexgen.X.5t, com.facebook.ads.redexgen.X.8O):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void A3z(Handler handler, D9 d92) {
        AbstractC02203y.A01(handler);
        AbstractC02203y.A01(d92);
        this.A04.A04(handler, d92);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void AH7(InterfaceC0433Cw interfaceC0433Cw, InterfaceC02675t interfaceC02675t) {
        A08(interfaceC0433Cw, interfaceC02675t, C8O.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void AHl(InterfaceC0433Cw interfaceC0433Cw) {
        this.A05.remove(interfaceC0433Cw);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            String[] strArr = A07;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "pnZ7WVnnf2PAl7J7h";
            strArr2[6] = "ddcJoNElLz9Uvwup8w";
            A09();
            return;
        }
        A06(interfaceC0433Cw);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0434Cx
    public final void AIS(D9 d92) {
        this.A04.A0D(d92);
    }
}
