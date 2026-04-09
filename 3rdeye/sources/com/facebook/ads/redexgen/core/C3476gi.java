package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.gi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3476gi {
    public static byte[] A03;
    public final O1 A00;
    public final InterfaceC3286dZ A01;
    public final List<C3475gh> A02;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C3476gi(List<AbstractC2761Nz> list, Bundle bundle, InterfaceC3286dZ interfaceC3286dZ) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC3286dZ;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i = 0; i < list.size(); i++) {
            this.A02.add(new C3475gh(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.A00 = (O1) X2.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C3476gi(List<AbstractC2761Nz> list, InterfaceC3286dZ interfaceC3286dZ) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC3286dZ;
        Iterator<AbstractC2761Nz> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C3475gh(it.next()));
        }
        this.A00 = new O1();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), X2.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C3475gh> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final O1 A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C3475gh> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double dA9N = this.A01.A9N();
        this.A00.A04(d10, dA9N);
        Iterator<C3475gh> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA9N);
        }
    }
}
