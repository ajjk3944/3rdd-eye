package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public class CW {
    public final int A00;
    public final C3796mL A01;
    public final long A02;
    public final CopyOnWriteArrayList<CV> A03;

    public CW() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public CW(CopyOnWriteArrayList<CV> copyOnWriteArrayList, int i, C3796mL c3796mL, long j4) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = c3796mL;
        this.A02 = j4;
    }

    private long A00(long j4) {
        long jA0P = AbstractC22614a.A0P(j4);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final CE ce, final CG cg, final int i) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC22614a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CS
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final CW A02(int i, C3796mL c3796mL, long j4) {
        return new CW(this.A03, i, c3796mL, j4);
    }

    public final void A03(int i, C3949or c3949or, int i10, Object obj, long j4) {
        A0C(new CG(1, i, c3949or, i10, obj, A00(j4), -9223372036854775807L));
    }

    public final void A04(Handler handler, CX cx) {
        C3M.A01(handler);
        C3M.A01(cx);
        this.A03.add(new CV(handler, cx));
    }

    public final void A05(CE ce, int i, int i10, C3949or c3949or, int i11, Object obj, long j4, long j10) {
        A09(ce, new CG(i, i10, c3949or, i11, obj, A00(j4), A00(j10)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(CE ce, int i, int i10, C3949or c3949or, int i11, Object obj, long j4, long j10, int i12) {
        A01(ce, new CG(i, i10, c3949or, i11, obj, A00(j4), A00(j10)), i12);
    }

    public final void A07(CE ce, int i, int i10, C3949or c3949or, int i11, Object obj, long j4, long j10, IOException iOException, boolean z10) {
        A0A(ce, new CG(i, i10, c3949or, i11, obj, A00(j4), A00(j10)), iOException, z10);
    }

    public final void A08(@MetaExoPlayerCustomization CE ce, @MetaExoPlayerCustomization int i, int i10, C3949or c3949or, int i11, Object obj, long j4, long j10, Object obj2, Object obj3) {
        A0B(ce, new CG(i, i10, c3949or, i11, obj, A00(j4), A00(j10)), obj2, obj3);
    }

    public final void A09(final CE ce, final CG cg) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX listener = next.A01;
            AbstractC22614a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CT
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, ce, cg);
                }
            });
        }
    }

    public final void A0A(final CE ce, final CG cg, final IOException iOException, final boolean z10) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC22614a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CO
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(cx, ce, cg, iOException, z10);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final CE ce, @MetaExoPlayerCustomization final CG cg, final Object obj, final Object obj2) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX cx = next.A01;
            AbstractC22614a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CP
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(cx, ce, cg, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final CG cg) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV next = it.next();
            final CX listener = next.A01;
            AbstractC22614a.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.CQ
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, cg);
                }
            });
        }
    }

    public final void A0D(CX cx) {
        Iterator<CV> it = this.A03.iterator();
        while (it.hasNext()) {
            CV listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == cx) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(CX cx, CE ce, CG cg) {
        cx.ADw(this.A00, this.A01, ce, cg);
    }

    public final /* synthetic */ void A0F(CX cx, CE ce, CG cg, IOException iOException, boolean z10) {
        cx.AE1(this.A00, this.A01, ce, cg, iOException, z10);
    }

    public final /* synthetic */ void A0G(CX cx, CE ce, CG cg, Object obj, Object obj2) {
        cx.ADy(this.A00, this.A01, ce, cg, obj, obj2);
    }

    public final /* synthetic */ void A0H(CX cx, CG cg) {
        cx.AD6(this.A00, this.A01, cg);
    }
}
