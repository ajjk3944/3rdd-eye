package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2199nR implements InterfaceC0853Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass45 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final F6 A09;
    public final int A0A;

    public C2199nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2199nR(int i10, int i11, int i12, float f10) {
        this(null, -1, i10, i11, i12, 1279, 719, f10, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2199nR(F6 f62) {
        this(f62, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2199nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f62, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i10, @MetaExoPlayerCustomization("Removed from upstream") int i11, int i12, int i13, int i14, int i15, float f10, float f11, long j10, AnonymousClass45 anonymousClass45) {
        this.A09 = f62;
        this.A0A = i10;
        this.A05 = i11;
        this.A02 = i12;
        this.A06 = i13;
        this.A04 = i14;
        this.A03 = i15;
        this.A00 = f10;
        this.A01 = f11;
        this.A07 = j10;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C05261a A00(C2337pg c2337pg, int[] iArr, int i10, F6 f62, BP<EU> bp) {
        return new C05261a(c2337pg, iArr, i10, f62, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0853Em
    public final InterfaceC2186nE[] A5b(C0852El[] c0852ElArr, F6 f62, C2222no c2222no, Timeline timeline) {
        InterfaceC2186nE interfaceC2186nEA00;
        BP bpA00 = C05261a.A00(c0852ElArr);
        InterfaceC2186nE[] interfaceC2186nEArr = new InterfaceC2186nE[c0852ElArr.length];
        for (int i10 = 0; i10 < c0852ElArr.length; i10++) {
            C0852El c0852El = c0852ElArr[i10];
            if (c0852El != null && c0852El.A02.length != 0) {
                int length = c0852El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC2186nEA00 = new C1Z(c0852El.A01, c0852El.A02[0], c0852El.A00);
                } else {
                    interfaceC2186nEA00 = A00(c0852El.A01, c0852El.A02, c0852El.A00, f62, (BP) bpA00.get(i10));
                }
                interfaceC2186nEArr[i10] = interfaceC2186nEA00;
            }
        }
        return interfaceC2186nEArr;
    }
}
