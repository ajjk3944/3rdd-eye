package com.facebook.ads.redexgen.core;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.7h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC23467h implements InterfaceC3688kN {
    public static String[] A06 = {"A1ZwXb6JdBVxSPYV1ZzpyUVQy2gRfJA9", "vkvPFBYHwcZnb4NzphHjmgFJFbjiYwSo", "W7sj7Up3ABI8RZFTAAZOEHe7srfTkl57", "fls3PiASqtk6GqNgTZFqwBZFoYeyHn2V", "1yDmXHBn42mad7W8CPx8A7RWKYn1BqT7", "CjPJSc8sfbO2R56Y3Yx9Z137FYjSqvlb", "2KSypf5DjPiLYF3nQ7brfSsHONTUzR5A", "k5ePLg8NJJ"};
    public long A00;
    public long A01;
    public C21780t A02;
    public final ArrayDeque<C21780t> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC23477i> A04;
    public final PriorityQueue<C21780t> A05;

    public abstract C3683kI A0Z();

    public abstract void A0b(C23487j c23487j);

    public abstract boolean A0d();

    public AbstractC23467h() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C21780t());
        }
        this.A04 = new ArrayDeque<>();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque<AbstractC23477i> arrayDeque = this.A04;
            final C5S c5s = new C5S() { // from class: com.facebook.ads.redexgen.X.kL
                @Override // com.facebook.ads.redexgen.core.C5S
                public final void AGz(AbstractC3870nX abstractC3870nX) {
                    this.A00.A0c((C21770s) abstractC3870nX);
                }
            };
            arrayDeque.add(new AbstractC23477i(c5s) { // from class: com.facebook.ads.redexgen.X.0s
                public C5S<C21770s> A00;

                /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.5S != com.facebook.ads.androidx.media3.decoder.DecoderOutputBuffer$Owner<com.facebook.ads.androidx.media3.extractor.text.cea.CeaDecoder$CeaOutputBuffer> */
                {
                    this.A00 = c5s;
                }

                @Override // com.facebook.ads.redexgen.core.AbstractC23477i, com.facebook.ads.redexgen.core.AbstractC3870nX
                public final void A0B() {
                    this.A00.AGz(this);
                }
            });
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0U(C21780t c21780t) {
        c21780t.A0A();
        this.A03.add(c21780t);
    }

    public final long A0V() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0W, reason: merged with bridge method [inline-methods] */
    public C23487j A5j() throws C3687kM {
        C3M.A08(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        return null;
     */
    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.ads.redexgen.core.AbstractC23477i A5l() throws com.facebook.ads.redexgen.core.C3687kM {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC23467h.A5l():com.facebook.ads.redexgen.X.7i");
    }

    public final AbstractC23477i A0Y() {
        return this.A04.pollFirst();
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    /* renamed from: A0a, reason: merged with bridge method [inline-methods] */
    public void AGZ(C23487j c23487j) throws C3687kM {
        C3M.A07(c23487j == this.A02);
        C21780t c21780t = (C21780t) c23487j;
        if (c21780t.A04()) {
            A0U(c21780t);
        } else {
            long j4 = this.A01;
            this.A01 = 1 + j4;
            c21780t.A00 = j4;
            this.A05.add(c21780t);
        }
        if (A06[7].length() != 10) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "rj1eyhsOe6SuoM1rYy40tvsoNCkJE80J";
        strArr[1] = "ibYLffFAaVDMN4cD1vowu1tbJEM8Lkom";
        this.A02 = null;
    }

    public final void A0c(AbstractC23477i abstractC23477i) {
        abstractC23477i.A0A();
        this.A04.add(abstractC23477i);
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3688kN
    public void AIx(long j4) {
        this.A00 = j4;
    }

    @Override // com.facebook.ads.redexgen.core.C5O
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0U((C21780t) AbstractC22614a.A0f(this.A05.poll()));
        }
        if (this.A02 != null) {
            A0U(this.A02);
            this.A02 = null;
        }
    }
}
