package com.instagram.common.viewpoint.core;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public final class B7 {
    public static byte[] A06;
    public static String[] A07 = {"eoBlep8s1FBIN6Rt", "z5PVad8lFvymSbVcRUVN6mCVOAyUTpZZ", "CSzRbjHFCczJ9I", "vibjkM4Umklha9WpeyLj2yq757BqeZSZ", "UWrS", "", "nE8lp", "HlO2gnmnWOpwEq19Q9DE2Hcik4TJ8nc9"};
    public static final B7 A08;

    @Nullable
    public MediaCodecPoolTracker A01;

    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<B0>> A04 = new HashMap();
    public final B6 A03 = new B6(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{-63, -71, -56, -75, -126, -72, -75, -54, -123, -72, -126, -75, -54, -123, -126, -72, -71, -73, -61, -72, -71, -58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z10, C1970jQ c1970jQ, EnumC1967jL enumC1967jL, String str, B0 b02) {
        if (A0I(z10, c1970jQ) && A0G(str, c1970jQ)) {
            boolean z11 = true;
            synchronized (this) {
                if (this.A00 < c1970jQ.A07) {
                    Set<B0> setA06 = this.A04.get(str);
                    if (setA06 == null) {
                        setA06 = A06();
                        this.A04.put(str, setA06);
                    }
                    if (setA06.contains(b02)) {
                        z11 = false;
                    } else if (((z10 && c1970jQ.A0N) || (!z10 && c1970jQ.A0M)) && setA06.size() < c1970jQ.A06) {
                        setA06.add(b02);
                        this.A00++;
                        z11 = false;
                    }
                }
                if (!z11) {
                    try {
                        try {
                            this.A05 = SystemClock.elapsedRealtime();
                            b02.reset();
                            A03().A09(enumC1967jL, b02.hashCode());
                            return;
                        } finally {
                            this.A05 = -1L;
                        }
                    } catch (IllegalStateException unused) {
                        A0B(str, b02);
                    }
                }
            }
        }
        try {
            if (!c1970jQ.A0R || (!z10 && !c1970jQ.A0Q)) {
                b02.stop();
            }
        } finally {
            A03().A08(enumC1967jL, b02.hashCode());
            b02.AHb();
            A03().A07(enumC1967jL, b02.hashCode());
        }
    }

    static {
        A08();
        A08 = new B7();
    }

    private B0 A01(boolean z10, C1970jQ c1970jQ, EnumC1967jL enumC1967jL, String str) throws Exception {
        if (A0I(z10, c1970jQ) && A0G(str, c1970jQ)) {
            synchronized (this) {
                Set<B0> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<B0> it = set.iterator();
                    B0 ret = it.next();
                    it.remove();
                    A03().A0A(z10, str, enumC1967jL, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            C1965jJ c1965jJA05 = A03().A05(z10, str, enumC1967jL);
            B0 b0A03 = this.A03.A03(z10, str);
            A03().A06(c1965jJA05, b0A03.hashCode());
            return b0A03;
        } catch (Exception e10) {
            throw new MediaCodecInitializationException(str, e10);
        }
    }

    public static B7 A02() {
        B7 b72 = A08;
        String[] strArr = A07;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "gdX1n";
        strArr2[4] = "uqN6";
        return b72;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaCodecPoolTracker A03() {
        if (this.A01 != null) {
            return this.A01;
        }
        return NoOpMediaCodecPoolTracker.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<B0> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(MediaCodecPoolTracker mediaCodecPoolTracker) {
        if (this.A01 == null) {
            this.A01 = mediaCodecPoolTracker;
        }
    }

    private void A0A(C1970jQ c1970jQ) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c1970jQ.A0S);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, B0 b02) {
        Set<B0> set = this.A04.get(str);
        if (set != null && set.remove(b02)) {
            int i10 = this.A00;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[1].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "FxBrmOrzGAHEl951IE67fieu752sH0JZ";
            strArr2[1] = "QwM4isUBZzXVsf3PyxWpFGvjBfZOcOMZ";
            this.A00 = i10 - 1;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 10));
    }

    public static boolean A0G(String str, C1970jQ c1970jQ) {
        if (A0E(str) && c1970jQ.A0C) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z10, C1970jQ c1970jQ) {
        if (c1970jQ.A0E && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > 5000) {
            return false;
        }
        return A0J(z10, c1970jQ);
    }

    public static boolean A0J(boolean z10, C1970jQ c1970jQ) {
        return (z10 && c1970jQ.A0N) || (!z10 && c1970jQ.A0M);
    }

    public final B0 A0K(boolean z10, C1970jQ c1970jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC1967jL enumC1967jL, String str) throws Exception {
        A09(mediaCodecPoolTracker);
        A0A(c1970jQ);
        if (c1970jQ.A0K) {
            B0 b0A02 = this.A03.A02(z10, c1970jQ, enumC1967jL, str);
            String[] strArr = A07;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "ttyEUrXfsAwEm9Eniby4AXTGkmRMb34Z";
            strArr2[1] = "BAFCEyHtTeugEvQpUcdazZ0OUcRhptwZ";
            return b0A02;
        }
        return A01(z10, c1970jQ, enumC1967jL, str);
    }

    public final void A0L(boolean z10, C1970jQ c1970jQ, MediaCodecPoolTracker mediaCodecPoolTracker, EnumC1967jL enumC1967jL, String str, B0 b02) throws Throwable {
        A09(mediaCodecPoolTracker);
        if (c1970jQ.A0K) {
            this.A03.A0A(z10, c1970jQ, enumC1967jL, str, b02);
        } else {
            A0C(z10, c1970jQ, enumC1967jL, str, b02);
        }
    }
}
