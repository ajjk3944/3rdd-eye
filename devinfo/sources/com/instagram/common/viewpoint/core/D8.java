package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C1844no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i4, C1844no c1844no, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i4;
        this.A01 = c1844no;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA0P = C5C.A0P(j);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C0429Cs c0429Cs, final int i4) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d92 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final D8 A02(int i4, C1844no c1844no, long j) {
        return new D8(this.A03, i4, c1844no, j);
    }

    public final void A03(int i4, C1996qI c1996qI, int i10, Object obj, long j) {
        A0C(new C0429Cs(1, i4, c1996qI, i10, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, D9 d92) {
        AbstractC02203y.A01(handler);
        AbstractC02203y.A01(d92);
        this.A03.add(new D7(handler, d92));
    }

    public final void A05(Cq cq, int i4, int i10, C1996qI c1996qI, int i11, Object obj, long j, long j8) {
        A09(cq, new C0429Cs(i4, i10, c1996qI, i11, obj, A00(j), A00(j8)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i4, int i10, C1996qI c1996qI, int i11, Object obj, long j, long j8, int i12) {
        A01(cq, new C0429Cs(i4, i10, c1996qI, i11, obj, A00(j), A00(j8)), i12);
    }

    public final void A07(Cq cq, int i4, int i10, C1996qI c1996qI, int i11, Object obj, long j, long j8, IOException iOException, boolean z3) {
        A0A(cq, new C0429Cs(i4, i10, c1996qI, i11, obj, A00(j), A00(j8)), iOException, z3);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i4, int i10, C1996qI c1996qI, int i11, Object obj, long j, long j8, Object obj2, Object obj3) {
        A0B(cq, new C0429Cs(i4, i10, c1996qI, i11, obj, A00(j), A00(j8)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C0429Cs c0429Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, cq, c0429Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C0429Cs c0429Cs, final IOException iOException, final boolean z3) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d92 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(d92, cq, c0429Cs, iOException, z3);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C0429Cs c0429Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d92 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(d92, cq, c0429Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C0429Cs c0429Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c0429Cs);
                }
            });
        }
    }

    public final void A0D(D9 d92) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == d92) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(D9 d92, Cq cq, C0429Cs c0429Cs) {
        d92.AEb(this.A00, this.A01, cq, c0429Cs);
    }

    public final /* synthetic */ void A0F(D9 d92, Cq cq, C0429Cs c0429Cs, IOException iOException, boolean z3) {
        d92.AEg(this.A00, this.A01, cq, c0429Cs, iOException, z3);
    }

    public final /* synthetic */ void A0G(D9 d92, Cq cq, C0429Cs c0429Cs, Object obj, Object obj2) {
        d92.AEd(this.A00, this.A01, cq, c0429Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d92, C0429Cs c0429Cs) {
        d92.ADk(this.A00, this.A01, c0429Cs);
    }
}
