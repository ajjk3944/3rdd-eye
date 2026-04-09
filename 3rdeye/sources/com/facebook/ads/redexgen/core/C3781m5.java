package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.m5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3781m5 implements EA {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final C3T A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final EU A09;
    public final int A0A;

    public C3781m5() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C3781m5(int i, int i10, int i11, float f10) {
        this(null, -1, i, i10, i11, 1279, 719, f10, 0.75f, 2000L, C3T.A00);
    }

    public C3781m5(EU eu) {
        this(eu, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, C3T.A00);
    }

    public C3781m5(@MetaExoPlayerCustomization("No longer set through factory") EU eu, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i10, int i11, int i12, int i13, int i14, float f10, float f11, long j4, C3T c3t) {
        this.A09 = eu;
        this.A0A = i;
        this.A05 = i10;
        this.A02 = i11;
        this.A06 = i12;
        this.A04 = i13;
        this.A03 = i14;
        this.A00 = f10;
        this.A01 = f11;
        this.A07 = j4;
        this.A08 = c3t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C21830y A00(C3915oH c3915oH, int[] iArr, int i, EU eu, AbstractC2416Am<C2497Ds> abstractC2416Am) {
        return new C21830y(c3915oH, iArr, i, eu, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, abstractC2416Am, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.EA
    public final InterfaceC3759lj[] A5T(E9[] e9Arr, EU eu, C3796mL c3796mL, Timeline timeline) {
        InterfaceC3759lj interfaceC3759ljA00;
        AbstractC2416Am abstractC2416AmA00 = C21830y.A00(e9Arr);
        InterfaceC3759lj[] interfaceC3759ljArr = new InterfaceC3759lj[e9Arr.length];
        for (int i = 0; i < e9Arr.length; i++) {
            E9 e92 = e9Arr[i];
            if (e92 != null && e92.A02.length != 0) {
                int length = e92.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC3759ljA00 = new C21820x(e92.A01, e92.A02[0], e92.A00);
                } else {
                    interfaceC3759ljA00 = A00(e92.A01, e92.A02, e92.A00, eu, (AbstractC2416Am) abstractC2416AmA00.get(i));
                }
                interfaceC3759ljArr[i] = interfaceC3759ljA00;
            }
        }
        return interfaceC3759ljArr;
    }
}
