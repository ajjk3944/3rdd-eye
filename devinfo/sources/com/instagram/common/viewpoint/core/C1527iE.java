package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcelable;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* renamed from: com.facebook.ads.redexgen.X.iE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1527iE {
    public static byte[] A03;
    public final C0725Of A00;
    public final InterfaceC1321er A01;
    public final List<C1526iD> A02;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C1527iE(List<AbstractC0723Od> list, Bundle bundle, InterfaceC1321er interfaceC1321er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1321er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.A02.add(new C1526iD(list.get(i4), (Bundle) parcelableArrayList.get(i4)));
        }
        this.A00 = (C0725Of) AbstractC0958Xo.A00(bundle.getByteArray(A00(0, 10, WebSocketProtocol.PAYLOAD_SHORT)));
    }

    public C1527iE(List<AbstractC0723Od> list, InterfaceC1321er interfaceC1321er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC1321er;
        Iterator<AbstractC0723Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C1526iD(it.next()));
        }
        this.A00 = new C0725Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, WebSocketProtocol.PAYLOAD_SHORT), AbstractC0958Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C1526iD> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C0725Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C1526iD> it = this.A02.iterator();
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
        double dA9V = this.A01.A9V();
        this.A00.A04(d10, dA9V);
        Iterator<C1526iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA9V);
        }
    }
}
