package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9H {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C1996qI A07;
    public final boolean A08;
    public final InterfaceC02063k[] A09;

    public static String A06(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, 18, 40, 47, 42, 40, Utf8.REPLACEMENT_BYTE, 35, 38, 46, 11, Utf8.REPLACEMENT_BYTE, 46, 35, 37, 30, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, Utf8.REPLACEMENT_BYTE, 46, 35, 37, 30, 56, 43, 41, 33, 11, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C9H(C1996qI c1996qI, int i4, int i10, int i11, int i12, int i13, int i14, int i15, InterfaceC02063k[] interfaceC02063kArr, boolean z3) {
        this.A07 = c1996qI;
        this.A01 = i4;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A02 = i13;
        this.A03 = i14;
        this.A00 = i15;
        this.A09 = interfaceC02063kArr;
        this.A08 = z3;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2002qQ c2002qQ, boolean z3) {
        if (z3) {
            return A00();
        }
        return c2002qQ.A01().A00;
    }

    private AudioTrack A02(C2002qQ c2002qQ, int i4) {
        int iA04 = C5C.A04(c2002qQ.A05);
        if (i4 != 0) {
            return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1, i4);
        }
        return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z3, C2002qQ c2002qQ, int i4) {
        if (C5C.A02 >= 29) {
            return A05(z3, c2002qQ, i4);
        }
        if (C5C.A02 >= 21) {
            return A04(z3, c2002qQ, i4);
        }
        AudioTrack audioTrackA02 = A02(c2002qQ, i4);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return audioTrackA02;
    }

    private AudioTrack A04(boolean z3, C2002qQ c2002qQ, int i4) {
        return new AudioTrack(A01(c2002qQ, z3), C1877oM.A0D(this.A06, this.A02, this.A03), this.A00, 1, i4);
    }

    private AudioTrack A05(boolean z3, C2002qQ c2002qQ, int i4) throws UnsupportedOperationException, IllegalArgumentException {
        AudioFormat audioFormatA0D = C1877oM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2002qQ, z3);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(audioFormatA0D);
        boolean z10 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i4);
        if (this.A04 != 1) {
            z10 = false;
        }
        AudioTrack audioTrackBuild = sessionId.setOffloadedPlayback(z10).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return audioTrackBuild;
    }

    public final long A08(long j) {
        return (1000000 * j) / this.A06;
    }

    public final long A09(long j) {
        return (1000000 * j) / this.A07.A0G;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z3, C2002qQ c2002qQ, int i4) throws C03438t {
        try {
            AudioTrack audioTrackA03 = A03(z3, c2002qQ, i4);
            C1877oM.A0M().incrementAndGet();
            int state = audioTrackA03.getState();
            if (state == 1) {
                return audioTrackA03;
            }
            try {
                audioTrackA03.release();
                C1877oM.A0M().decrementAndGet();
            } catch (Exception e2) {
                AbstractC02284g.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C1877oM.A0M().get())), e2);
            }
            throw new C03438t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C1877oM.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new C03438t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e10, C1877oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final C03418r A0B() {
        final int i4 = this.A03;
        final int i10 = this.A06;
        final int i11 = this.A02;
        final boolean z3 = this.A08;
        final boolean z10 = this.A04 == 1;
        final int i12 = this.A00;
        return new Object(i4, i10, i11, z3, z10, i12) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i4;
                this.A03 = i10;
                this.A01 = i11;
                this.A05 = z3;
                this.A04 = z10;
                this.A00 = i12;
            }
        };
    }

    public final C9H A0C(int i4) {
        return new C9H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i4, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C9H c9h) {
        return c9h.A04 == this.A04 && c9h.A03 == this.A03 && c9h.A06 == this.A06 && c9h.A02 == this.A02 && c9h.A05 == this.A05;
    }
}
