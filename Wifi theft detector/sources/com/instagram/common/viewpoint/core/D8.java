package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C2222no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i10, C2222no c2222no, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = c2222no;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long jA0P = C5C.A0P(j10);
        if (jA0P == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C0807Cs c0807Cs, final int i10) {
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

    public final D8 A02(int i10, C2222no c2222no, long j10) {
        return new D8(this.A03, i10, c2222no, j10);
    }

    public final void A03(int i10, C2374qI c2374qI, int i11, Object obj, long j10) {
        A0C(new C0807Cs(1, i10, c2374qI, i11, obj, A00(j10), C.TIME_UNSET));
    }

    public final void A04(Handler handler, D9 d92) {
        AbstractC05983y.A01(handler);
        AbstractC05983y.A01(d92);
        this.A03.add(new D7(handler, d92));
    }

    public final void A05(Cq cq, int i10, int i11, C2374qI c2374qI, int i12, Object obj, long j10, long j11) {
        A09(cq, new C0807Cs(i10, i11, c2374qI, i12, obj, A00(j10), A00(j11)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i10, int i11, C2374qI c2374qI, int i12, Object obj, long j10, long j11, int i13) {
        A01(cq, new C0807Cs(i10, i11, c2374qI, i12, obj, A00(j10), A00(j11)), i13);
    }

    public final void A07(Cq cq, int i10, int i11, C2374qI c2374qI, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        A0A(cq, new C0807Cs(i10, i11, c2374qI, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i10, int i11, C2374qI c2374qI, int i12, Object obj, long j10, long j11, Object obj2, Object obj3) {
        A0B(cq, new C0807Cs(i10, i11, c2374qI, i12, obj, A00(j10), A00(j11)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C0807Cs c0807Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, cq, c0807Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C0807Cs c0807Cs, final IOException iOException, final boolean z10) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d92 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(d92, cq, c0807Cs, iOException, z10);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C0807Cs c0807Cs, final Object obj, final Object obj2) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 d92 = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(d92, cq, c0807Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C0807Cs c0807Cs) {
        Iterator<D7> it = this.A03.iterator();
        while (it.hasNext()) {
            D7 next = it.next();
            final D9 listener = next.A01;
            C5C.A1B(next.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c0807Cs);
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

    public final /* synthetic */ void A0E(D9 d92, Cq cq, C0807Cs c0807Cs) {
        d92.AEb(this.A00, this.A01, cq, c0807Cs);
    }

    public final /* synthetic */ void A0F(D9 d92, Cq cq, C0807Cs c0807Cs, IOException iOException, boolean z10) {
        d92.AEg(this.A00, this.A01, cq, c0807Cs, iOException, z10);
    }

    public final /* synthetic */ void A0G(D9 d92, Cq cq, C0807Cs c0807Cs, Object obj, Object obj2) {
        d92.AEd(this.A00, this.A01, cq, c0807Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d92, C0807Cs c0807Cs) {
        d92.ADk(this.A00, this.A01, c0807Cs);
    }
}
