package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.p0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1917p0 extends AbstractC02685u {
    public static byte[] A08;
    public static String[] A09 = {"2IbL45Ge7WjUS4gtY5SZcZFVqhRirSld", "R240sFcJ0pzYp66WnJ67Fmsy55XV16O5", "h", "VUex99WpL2gwlvzu7iug41y", "F", "dnMRZWWEUUUJRwdjb1Aq9wn", "Gu9WZr0VQrtP2JtflAIpRNlkyE1rsTK5", "oyOSTbE54dsFuYwfZhcf3OLki3UIwS0J"};

    @MetaExoPlayerCustomization("Keep track of the non-adjusted timestamp")
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final C02735z A05;
    public final int A06;
    public final int A07;

    public static String A03(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 25);
            if (A09[2].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[1] = "TMnkcu7Wbc02Avo68LXTGXdgCiHDzCoJ";
            strArr[6] = "32B0HSZuRu1EwrCyQNusNP3p455vxDa3";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{40, 32, 32, 40, 97, 42, 55, 32, 97, 43, 42, 44, 32, 43, 42, 61};
    }

    static {
        A05();
        AnonymousClass35.A03(A03(0, 16, 86));
    }

    public C1917p0(int i4) {
        this(i4, 0);
    }

    public C1917p0(int i4, int i10) {
        this.A05 = new C02735z();
        this.A06 = i4;
        this.A07 = i10;
    }

    public static C1917p0 A02() {
        return new C1917p0(0);
    }

    private ByteBuffer A04(final int i4) {
        if (this.A06 == 1) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i4);
            if (A09[2].length() != 11) {
                A09[2] = "";
                return byteBufferAllocate;
            }
        } else {
            int i10 = this.A06;
            if (A09[2].length() != 11) {
                String[] strArr = A09;
                strArr[7] = "Xhbg2bf7wDHhg84e2eXJTK6LXJwKWSr7";
                strArr[0] = "Xvqd08ordVMo4CmGxDs2k5pAuekgSSjU";
                if (i10 == 2) {
                    return ByteBuffer.allocateDirect(i4);
                }
                final int iCapacity = this.A02 == null ? 0 : this.A02.capacity();
                throw new IllegalStateException(iCapacity, i4) { // from class: com.facebook.ads.redexgen.X.63
                    public static byte[] A02;
                    public final int A00;
                    public final int A01;

                    static {
                        A01();
                    }

                    public static String A00(int i11, int i12, int i13) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i11, i11 + i12);
                        for (int i14 = 0; i14 < bArrCopyOfRange.length; i14++) {
                            bArrCopyOfRange[i14] = (byte) ((bArrCopyOfRange[i14] - i13) - 17);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A02 = new byte[]{-118, -90, -118, -84, -87, -36, -51, -51, -52, -39, -121, -37, -42, -42, -121, -38, -44, -56, -45, -45, -121, -113};
                    }

                    {
                        super(A00(4, 18, 86) + iCapacity + A00(0, 3, 89) + i4 + A00(3, 1, 114));
                        this.A00 = iCapacity;
                        this.A01 = i4;
                    }
                };
            }
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02685u
    public void A0A() {
        super.A0A();
        if (this.A02 != null) {
            this.A02.clear();
        }
        if (this.A03 != null) {
            this.A03.clear();
        }
        this.A04 = false;
    }

    public final void A0B() {
        if (this.A02 != null) {
            this.A02.flip();
        }
        if (this.A03 != null) {
            this.A03.flip();
        }
    }

    @EnsuresNonNull({"data"})
    public final void A0C(int i4) {
        int i10 = i4 + this.A07;
        ByteBuffer newData = this.A02;
        if (newData == null) {
            ByteBuffer currentData = A04(i10);
            this.A02 = currentData;
            return;
        }
        int position = newData.capacity();
        int capacity = newData.position();
        int i11 = capacity + i10;
        if (position >= i11) {
            this.A02 = newData;
            return;
        }
        ByteBuffer byteBufferA04 = A04(i11);
        byteBufferA04.order(newData.order());
        if (capacity > 0) {
            newData.flip();
            String[] strArr = A09;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A09[3] = "fNtiW8alSIVNhAh4w2LF63Pxxp";
            byteBufferA04.put(newData);
        }
        this.A02 = byteBufferA04;
    }

    @EnsuresNonNull({"supplementalData"})
    public final void A0D(int i4) {
        if (this.A03 == null || this.A03.capacity() < i4) {
            this.A03 = ByteBuffer.allocate(i4);
        } else {
            this.A03.clear();
        }
    }

    public final boolean A0E() {
        return A09(1073741824);
    }
}
