package com.instagram.common.viewpoint.core;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9Y, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9Y {
    public static String[] A0M = {"T7VAgrMlNjunoCY92EX", "RGUT9owbnhx8phDbzrCYMg", "CVNC8QX", "fBdqcrRV46KfIZmPA23V4p", "8FvZMHzhr", "kMgSgwu", "1eJdCrNjGcKHTUWf60z", "EzFxZEW8JHF4ThmiFQVxs9z"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C9Y(int i4, int i10, float f10, float f11, int i11) {
        this.A0H = i4;
        this.A0G = i10;
        this.A0F = f10;
        this.A0D = f11;
        this.A0E = i4 / i11;
        this.A0K = i4 / 400;
        this.A0I = i4 / 65;
        this.A0J = this.A0I * 2;
        this.A0L = new short[this.A0J];
        this.A0A = new short[this.A0J * i10];
        this.A0B = new short[this.A0J * i10];
        this.A0C = new short[this.A0J * i10];
    }

    private int A00(int i4) {
        int iMin = Math.min(this.A0J, this.A09);
        A0D(this.A0A, i4, iMin);
        int frameCount = this.A09;
        this.A09 = frameCount - iMin;
        return iMin;
    }

    private int A01(short[] sArr, int i4) {
        int minP;
        int maxP;
        int i10 = this.A0H > 4000 ? this.A0H / 4000 : 1;
        int i11 = this.A0G;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[5] = "ihqHcMR";
        if (i11 == 1 && i10 == 1) {
            int i12 = this.A0K;
            int skip = this.A0I;
            minP = A04(sArr, i4, i12, skip);
        } else {
            A0E(sArr, i4, i10);
            short[] sArr2 = this.A0L;
            int i13 = this.A0K / i10;
            int skip2 = this.A0I;
            minP = A04(sArr2, 0, i13, skip2 / i10);
            if (i10 != 1) {
                int minP2 = minP * i10;
                int skip3 = i10 * 4;
                int period = minP2 - skip3;
                int i14 = (i10 * 4) + minP2;
                int skip4 = this.A0K;
                if (period < skip4) {
                    period = this.A0K;
                }
                int skip5 = this.A0I;
                if (i14 > skip5) {
                    i14 = this.A0I;
                }
                int skip6 = this.A0G;
                if (skip6 == 1) {
                    minP = A04(sArr, i4, period, i14);
                } else {
                    A0E(sArr, i4, 1);
                    minP = A04(this.A0L, 0, period, i14);
                }
            }
        }
        int period2 = this.A02;
        int skip7 = this.A01;
        if (A0F(period2, skip7)) {
            maxP = this.A08;
        } else {
            maxP = minP;
        }
        int skip8 = this.A02;
        this.A07 = skip8;
        if (A0M[5].length() != 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[6] = "cTOoGT7MMdDrVmklJ8r";
        strArr[0] = "keLDEQoIXNVpWb6w58r";
        this.A08 = minP;
        return maxP;
    }

    private int A02(short[] sArr, int i4, float f10, int i10) {
        int i11;
        if (f10 < 0.5f) {
            i11 = (int) ((i10 * f10) / (1.0f - f10));
        } else {
            i11 = i10;
            int newFrameCount = (int) ((i10 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            this.A09 = newFrameCount;
        }
        int newFrameCount2 = i10 + i11;
        this.A0B = A0G(this.A0B, this.A05, newFrameCount2);
        int i12 = this.A0G * i4;
        short[] sArr2 = this.A0B;
        int i13 = this.A05;
        int newFrameCount3 = this.A0G;
        int i14 = i13 * newFrameCount3;
        int newFrameCount4 = this.A0G;
        System.arraycopy(sArr, i12, sArr2, i14, newFrameCount4 * i10);
        A0C(i11, this.A0G, this.A0B, this.A05 + i10, sArr, i4 + i10, sArr, i4);
        int newFrameCount5 = this.A05;
        this.A05 = newFrameCount5 + i10 + i11;
        return i11;
    }

    private int A03(short[] sArr, int i4, float f10, int i10) {
        int newFrameCount;
        if (f10 >= 2.0f) {
            newFrameCount = (int) (i10 / (f10 - 1.0f));
        } else {
            this.A09 = (int) ((i10 * (2.0f - f10)) / (f10 - 1.0f));
            newFrameCount = i10;
        }
        short[] sArr2 = this.A0B;
        int newFrameCount2 = this.A05;
        this.A0B = A0G(sArr2, newFrameCount2, newFrameCount);
        A0C(newFrameCount, this.A0G, this.A0B, this.A05, sArr, i4, sArr, i4 + i10);
        int newFrameCount3 = this.A05;
        this.A05 = newFrameCount3 + newFrameCount;
        return newFrameCount;
    }

    private int A04(short[] sArr, int i4, int i10, int i11) {
        int i12 = 0;
        int i13 = 255;
        int period = 1;
        int maxDiff = 0;
        int bestPeriod = this.A0G;
        int i14 = i4 * bestPeriod;
        while (i10 <= i11) {
            int diff = 0;
            for (int minDiff = 0; minDiff < i10; minDiff++) {
                int bestPeriod2 = i14 + minDiff;
                short s10 = sArr[bestPeriod2];
                int bestPeriod3 = i14 + i10;
                int worstPeriod = s10 - sArr[bestPeriod3 + minDiff];
                int bestPeriod4 = Math.abs(worstPeriod);
                diff += bestPeriod4;
            }
            int worstPeriod2 = diff * i12;
            int bestPeriod5 = period * i10;
            if (worstPeriod2 < bestPeriod5) {
                period = diff;
                i12 = i10;
            }
            int worstPeriod3 = diff * i13;
            int bestPeriod6 = maxDiff * i10;
            if (worstPeriod3 > bestPeriod6) {
                maxDiff = diff;
                i13 = i10;
            }
            i10++;
        }
        this.A02 = period / i12;
        this.A01 = maxDiff / i13;
        return i12;
    }

    private short A05(short[] sArr, int i4, int i10, int i11) {
        short s10 = sArr[i4];
        short s11 = sArr[this.A0G + i4];
        int leftPosition = this.A03 * i10;
        int i12 = this.A04 * i11;
        int position = (this.A04 + 1) * i11;
        int i13 = position - leftPosition;
        int position2 = position - i12;
        short left = (short) (((i13 * s10) + ((position2 - i13) * s11)) / position2);
        return left;
    }

    private void A06() {
        int i4 = this.A05;
        float f10 = this.A0F / this.A0D;
        float f11 = this.A0E * this.A0D;
        if (f10 > 1.00001d || f10 < 0.99999d) {
            A07(f10);
        } else {
            A0D(this.A0A, 0, this.A00);
            this.A00 = 0;
        }
        if (f11 != 1.0f) {
            A08(f11, i4);
        }
    }

    private void A07(float f10) {
        int frameCount;
        if (this.A00 < this.A0J) {
            return;
        }
        int i4 = this.A00;
        if (A0M[4].length() != 9) {
            throw new RuntimeException();
        }
        A0M[4] = "1EAucAhfj";
        int i10 = 0;
        do {
            int frameCount2 = this.A09;
            if (frameCount2 > 0) {
                int frameCount3 = A00(i10);
                i10 += frameCount3;
            } else {
                int iA01 = A01(this.A0A, i10);
                if (f10 > 1.0d) {
                    int frameCount4 = A03(this.A0A, i10, f10, iA01);
                    i10 += frameCount4 + iA01;
                } else {
                    int iA02 = A02(this.A0A, i10, f10, iA01);
                    int positionFrames = A0M[4].length();
                    if (positionFrames != 9) {
                        i10 += iA02;
                    } else {
                        String[] strArr = A0M;
                        strArr[7] = "LI3iTvxeiLHfC3eQqEyHhGd";
                        strArr[2] = "DQqtHf8";
                        i10 += iA02;
                    }
                }
            }
            frameCount = this.A0J;
        } while (frameCount + i10 <= i4);
        A0B(i10);
    }

    /* JADX WARN: Incorrect condition in loop: B:24:0x0070 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(float r10, int r11) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C9Y.A08(float, int):void");
    }

    private void A09(int i4) {
        int i10 = this.A05 - i4;
        short[] sArr = this.A0C;
        int frameCount = this.A06;
        this.A0C = A0G(sArr, frameCount, i10);
        short[] sArr2 = this.A0B;
        int i11 = this.A0G * i4;
        short[] sArr3 = this.A0C;
        int i12 = this.A06;
        int frameCount2 = this.A0G;
        int i13 = i12 * frameCount2;
        int frameCount3 = this.A0G;
        System.arraycopy(sArr2, i11, sArr3, i13, frameCount3 * i10);
        this.A05 = i4;
        int frameCount4 = this.A06;
        this.A06 = frameCount4 + i10;
    }

    private void A0A(int i4) {
        if (i4 == 0) {
            return;
        }
        System.arraycopy(this.A0C, this.A0G * i4, this.A0C, 0, (this.A06 - i4) * this.A0G);
        this.A06 -= i4;
    }

    private void A0B(int i4) {
        int i10 = this.A00 - i4;
        System.arraycopy(this.A0A, this.A0G * i4, this.A0A, 0, this.A0G * i10);
        this.A00 = i10;
    }

    public static void A0C(int i4, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int t10 = (i13 * i10) + i14;
            int d10 = (i12 * i10) + i14;
            for (int u4 = 0; u4 < i4; u4++) {
                int i16 = i4 - u4;
                int o4 = sArr2[d10] * i16;
                int i17 = sArr3[t10] * u4;
                sArr[i15] = (short) ((o4 + i17) / i4);
                i15 += i10;
                d10 += i10;
                t10 += i10;
            }
        }
    }

    private void A0D(short[] sArr, int i4, int i10) {
        this.A0B = A0G(this.A0B, this.A05, i10);
        System.arraycopy(sArr, this.A0G * i4, this.A0B, this.A05 * this.A0G, this.A0G * i10);
        this.A05 += i10;
    }

    private void A0E(short[] sArr, int i4, int i10) {
        int i11 = this.A0J / i10;
        int value = this.A0G * i10;
        int frameCount = this.A0G;
        int i12 = i4 * frameCount;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = 0;
            for (int samplesPerValue = 0; samplesPerValue < value; samplesPerValue++) {
                int frameCount2 = i13 * value;
                i14 += sArr[frameCount2 + i12 + samplesPerValue];
            }
            int i15 = i14 / value;
            String[] strArr = A0M;
            String str = strArr[6];
            String str2 = strArr[0];
            int samplesPerValue2 = str.length();
            int frameCount3 = str2.length();
            if (samplesPerValue2 != frameCount3) {
                throw new RuntimeException();
            }
            A0M[4] = "fFYg0yxzP";
            this.A0L[i13] = (short) i15;
        }
    }

    private boolean A0F(int i4, int i10) {
        if (i4 == 0 || this.A08 == 0 || i10 > i4 * 3 || i4 * 2 <= this.A07 * 3) {
            return false;
        }
        return true;
    }

    private short[] A0G(short[] sArr, int i4, int i10) {
        int length = sArr.length / this.A0G;
        if (i4 + i10 <= length) {
            return sArr;
        }
        int currentCapacityFrames = length * 3;
        int newCapacityFrames = (currentCapacityFrames / 2) + i10;
        int currentCapacityFrames2 = this.A0G;
        return Arrays.copyOf(sArr, currentCapacityFrames2 * newCapacityFrames);
    }

    public final int A0H() {
        return this.A05 * this.A0G * 2;
    }

    public final int A0I() {
        return this.A00 * this.A0G * 2;
    }

    public final void A0J() {
        this.A00 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A09 = 0;
        this.A08 = 0;
        this.A07 = 0;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final void A0K() {
        int i4 = this.A00;
        float f10 = this.A0F / this.A0D;
        float r10 = this.A0E * this.A0D;
        int i10 = this.A05;
        float s10 = i4;
        int remainingFrameCount = this.A06;
        int i11 = i10 + ((int) ((((s10 / f10) + remainingFrameCount) / r10) + 0.5f));
        short[] sArr = this.A0A;
        int i12 = this.A00;
        int remainingFrameCount2 = this.A0J;
        this.A0A = A0G(sArr, i12, (remainingFrameCount2 * 2) + i4);
        int expectedOutputFrames = 0;
        while (true) {
            int remainingFrameCount3 = this.A0J;
            int i13 = remainingFrameCount3 * 2;
            int remainingFrameCount4 = this.A0G;
            if (expectedOutputFrames >= i13 * remainingFrameCount4) {
                break;
            }
            short[] sArr2 = this.A0A;
            int remainingFrameCount5 = this.A0G;
            sArr2[(remainingFrameCount5 * i4) + expectedOutputFrames] = 0;
            expectedOutputFrames++;
        }
        int i14 = this.A00;
        int remainingFrameCount6 = this.A0J;
        this.A00 = i14 + (remainingFrameCount6 * 2);
        A06();
        int remainingFrameCount7 = this.A05;
        if (remainingFrameCount7 > i11) {
            this.A05 = i11;
        }
        this.A00 = 0;
        this.A09 = 0;
        this.A06 = 0;
    }

    public final void A0L(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.A0G, this.A05);
        short[] sArr = this.A0B;
        int framesToRead = this.A0G;
        shortBuffer.put(sArr, 0, framesToRead * iMin);
        int framesToRead2 = this.A05;
        this.A05 = framesToRead2 - iMin;
        short[] sArr2 = this.A0B;
        int i4 = this.A0G * iMin;
        short[] sArr3 = this.A0B;
        int i10 = this.A05;
        int framesToRead3 = this.A0G;
        System.arraycopy(sArr2, i4, sArr3, 0, i10 * framesToRead3);
    }

    public final void A0M(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining() / this.A0G;
        int framesToWrite = this.A0G;
        int i4 = framesToWrite * iRemaining * 2;
        short[] sArr = this.A0A;
        int framesToWrite2 = this.A00;
        this.A0A = A0G(sArr, framesToWrite2, iRemaining);
        short[] sArr2 = this.A0A;
        int bytesToWrite = this.A00;
        int framesToWrite3 = this.A0G;
        int bytesToWrite2 = bytesToWrite * framesToWrite3;
        int framesToWrite4 = i4 / 2;
        shortBuffer.get(sArr2, bytesToWrite2, framesToWrite4);
        int framesToWrite5 = this.A00;
        this.A00 = framesToWrite5 + iRemaining;
        A06();
    }
}
