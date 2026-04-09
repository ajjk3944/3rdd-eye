package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
/* renamed from: com.facebook.ads.redexgen.X.7R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7R implements InterfaceC3601iw {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", "jb"};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<C2709Lx> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.MB
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C7R.A00((C2709Lx) obj, (C2709Lx) obj2);
        }
    });

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, 61, 34, 40, 63, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public C7R(long j4) {
        this.A01 = j4;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(C2709Lx c2709Lx, C2709Lx c2709Lx2) {
        if (c2709Lx.A00 - c2709Lx2.A00 == 0) {
            return c2709Lx.compareTo(c2709Lx2);
        }
        return c2709Lx.A00 < c2709Lx2.A00 ? -1 : 1;
    }

    private void A03(InterfaceC2699Ln interfaceC2699Ln, long j4) {
        C4S.A02(A01(0, 10, 87));
        while (this.A00 + j4 > this.A01 && !this.A02.isEmpty()) {
            C2709Lx c2709LxFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            interfaceC2699Ln.AHl(c2709LxFirst);
        }
        C4S.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2698Lm
    public final void AFJ(InterfaceC2699Ln interfaceC2699Ln, C2709Lx c2709Lx) {
        this.A02.add(c2709Lx);
        this.A00 += c2709Lx.A01;
        A03(interfaceC2699Ln, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2698Lm
    public final void AFK(InterfaceC2699Ln interfaceC2699Ln, C2709Lx c2709Lx) {
        this.A02.remove(c2709Lx);
        this.A00 -= c2709Lx.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2698Lm
    public final void AFL(InterfaceC2699Ln interfaceC2699Ln, C2709Lx c2709Lx, C2709Lx c2709Lx2) {
        AFK(interfaceC2699Ln, c2709Lx);
        AFJ(interfaceC2699Ln, c2709Lx2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3601iw
    public final void AFM(InterfaceC2699Ln interfaceC2699Ln, String str, long j4, long j10) {
        if (j10 != -1) {
            A03(interfaceC2699Ln, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3601iw
    public final boolean AHz() {
        return true;
    }
}
