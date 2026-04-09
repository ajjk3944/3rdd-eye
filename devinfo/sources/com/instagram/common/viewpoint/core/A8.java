package com.instagram.common.viewpoint.core;

import android.os.Looper;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: assets/audience_network/classes2.dex */
public final class A8 implements InterfaceC1900oj {
    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
    public InterfaceC01993b A00;
    public C4X A01;
    public C02254d<AnonymousClass88> A02;
    public boolean A03;
    public final AnonymousClass45 A07;
    public final C1963pl A05 = new C1963pl();
    public final C1961pj A06 = new C1961pj();
    public final C8A A08 = new C8A(this.A05);
    public final SparseArray<AnonymousClass86> A04 = new SparseArray<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.86] */
    @RequiresNonNull({"player"})
    private final AnonymousClass86 A03(final Timeline timeline, final int i4, C1844no c1844no) {
        final C1844no c1844no2 = c1844no;
        if (timeline.A0N()) {
            c1844no2 = null;
        }
        final long jA6J = this.A07.A6J();
        boolean z3 = timeline.equals(this.A00.A7g()) && i4 == this.A00.A7b();
        if (c1844no2 != null && c1844no2.A00()) {
            if (z3 && this.A00.A7Y() == c1844no2.A00 && this.A00.A7Z() == c1844no2.A01) {
                jA04 = this.A00.A7e();
            }
        } else if (z3) {
            jA04 = this.A00.A7T();
            String[] strArr = A09;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
        } else {
            jA04 = timeline.A0N() ? 0L : timeline.A0K(i4, this.A06).A04();
            String[] strArr2 = A09;
            if (strArr2[3].length() == strArr2[1].length()) {
                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
            }
        }
        final C1844no c1844noA06 = this.A08.A06();
        final Timeline timelineA7g = this.A00.A7g();
        final int iA7b = this.A00.A7b();
        final long jA7e = this.A00.A7e();
        final long jA9J = this.A00.A9J();
        return new Object(jA6J, timeline, i4, c1844no2, jA04, timelineA7g, iA7b, c1844noA06, jA7e, jA9J) { // from class: com.facebook.ads.redexgen.X.86
            public final int A00;
            public final int A01;
            public final long A02;
            public final long A03;
            public final long A04;
            public final long A05;
            public final Timeline A06;
            public final Timeline A07;
            public final C1844no A08;
            public final C1844no A09;

            {
                this.A04 = jA6J;
                this.A07 = timeline;
                this.A01 = i4;
                this.A09 = c1844no2;
                this.A03 = jA04;
                this.A06 = timelineA7g;
                this.A00 = iA7b;
                this.A08 = c1844noA06;
                this.A02 = jA7e;
                this.A05 = jA9J;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AnonymousClass86 anonymousClass86 = (AnonymousClass86) obj;
                if (this.A04 == anonymousClass86.A04 && this.A01 == anonymousClass86.A01 && this.A03 == anonymousClass86.A03 && this.A00 == anonymousClass86.A00 && this.A02 == anonymousClass86.A02 && this.A05 == anonymousClass86.A05 && CB.A01(this.A07, anonymousClass86.A07) && CB.A01(this.A09, anonymousClass86.A09) && CB.A01(this.A06, anonymousClass86.A06) && CB.A01(this.A08, anonymousClass86.A08)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return CB.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
            }
        };
    }

    public A8(AnonymousClass45 anonymousClass45) {
        this.A07 = (AnonymousClass45) AbstractC02203y.A01(anonymousClass45);
        this.A02 = new C02254d<>(C5C.A0d(), anonymousClass45, new InterfaceC02234b() { // from class: com.facebook.ads.redexgen.X.og
        });
    }

    private final AnonymousClass86 A00() {
        return A04(this.A08.A06());
    }

    private AnonymousClass86 A01(int i4, C1844no c1844no) {
        AbstractC02203y.A01(this.A00);
        boolean z3 = true;
        if (c1844no != null) {
            if (this.A08.A05(c1844no) == null) {
                z3 = false;
            }
            if (z3) {
                return A04(c1844no);
            }
            return A03(Timeline.A02, i4, c1844no);
        }
        Timeline timelineA7g = this.A00.A7g();
        if (i4 >= timelineA7g.A07()) {
            z3 = false;
        }
        if (!z3) {
            timelineA7g = Timeline.A02;
        }
        return A03(timelineA7g, i4, null);
    }

    private AnonymousClass86 A02(C1977pz c1977pz) {
        if (c1977pz instanceof AD) {
            AD ad2 = (AD) c1977pz;
            if (ad2.A05 != null) {
                return A04(new C1844no(ad2.A05));
            }
        }
        return A00();
    }

    private AnonymousClass86 A04(C1844no c1844no) {
        Timeline timelineA05;
        AbstractC02203y.A01(this.A00);
        if (c1844no == null) {
            timelineA05 = null;
        } else {
            timelineA05 = this.A08.A05(c1844no);
        }
        if (c1844no == null || timelineA05 == null) {
            int windowIndex = this.A00.A7b();
            Timeline knownTimeline = this.A00.A7g();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(timelineA05, timelineA05.A0J(c1844no.A04, this.A05).A00, c1844no);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
    private final void A05(AnonymousClass86 anonymousClass86, int i4, InterfaceC02224a<AnonymousClass88> interfaceC02224a) {
        this.A04.put(i4, anonymousClass86);
        this.A02.A0A(i4, interfaceC02224a);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1900oj
    public final void ACe() {
        if (!this.A03) {
            final AnonymousClass86 anonymousClass86A00 = A00();
            this.A03 = true;
            A05(anonymousClass86A00, -1, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oe
            });
        }
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void ADZ(final C1944pR c1944pR) {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, 27, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oc
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void ADa(final List<C1946pT> list) {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, 27, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oR
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void ADk(int i4, C1844no c1844no, final C0429Cs c0429Cs) {
        final AnonymousClass86 anonymousClass86A01 = A01(i4, c1844no);
        A05(anonymousClass86A01, TTAdConstant.IMAGE_MODE_CAROUSEL_IMG, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oh
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEb(int i4, C1844no c1844no, final Cq cq, final C0429Cs c0429Cs) {
        final AnonymousClass86 anonymousClass86A01 = A01(i4, c1844no);
        A05(anonymousClass86A01, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.od
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEd(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i4, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C1844no c1844no, final Cq cq, final C0429Cs c0429Cs, Object obj, Object obj2) {
        final AnonymousClass86 anonymousClass86A01 = A01(i4, c1844no);
        A05(anonymousClass86A01, 1001, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oT
        });
    }

    @Override // com.instagram.common.viewpoint.core.D9
    public final void AEg(int i4, C1844no c1844no, final Cq cq, final C0429Cs c0429Cs, final IOException iOException, final boolean z3) {
        final AnonymousClass86 anonymousClass86A01 = A01(i4, c1844no);
        A05(anonymousClass86A01, 1003, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oi
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFI(final C1975px c1975px) {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, 12, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.ob
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFK(final C1977pz c1977pz) {
        final AnonymousClass86 anonymousClass86A02 = A02(c1977pz);
        A05(anonymousClass86A02, 10, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.of
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFM(final boolean z3, final int i4) {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, -1, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oa
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AFt() {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, -1, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oS
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AGA(Timeline timeline, final int i4) {
        this.A08.A07((InterfaceC01993b) AbstractC02203y.A01(this.A00));
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, 0, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oY
        });
    }

    @Override // com.instagram.common.viewpoint.core.C3U
    public final void AGE(final C1951pY c1951pY) {
        final AnonymousClass86 anonymousClass86A00 = A00();
        A05(anonymousClass86A00, 2, new InterfaceC02224a() { // from class: com.facebook.ads.redexgen.X.oW
        });
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1900oj
    public final void AJf(final InterfaceC01993b interfaceC01993b, Looper looper) {
        AbstractC02203y.A08(this.A00 == null || this.A08.A03.isEmpty());
        this.A00 = (InterfaceC01993b) AbstractC02203y.A01(interfaceC01993b);
        this.A01 = this.A07.A5P(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC02234b() { // from class: com.facebook.ads.redexgen.X.oZ
        });
    }
}
