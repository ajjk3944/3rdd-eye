package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A05' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.facebook.ads.redexgen.X.Np, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class EnumC0709Np {
    public static byte[] A01;
    public static final /* synthetic */ EnumC0709Np[] A02;
    public static final EnumC0709Np A03;
    public static final EnumC0709Np A04;
    public static final EnumC0709Np A05;
    public final String A00;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-91, -88, -85, -92, -66, -81, -79, -92, -94, -96, -94, -89, -92, 5, 7, 4, 13, 14, 20, 5, 7, -6, -8, -10, -8, -3, -6, 15, -3, -6, 14, 1, -3, 15, 23, 8, 10, -3, -5, -7, -5, 0, -3};
    }

    static {
        A02();
        String strA01 = A01(27, 16, 101);
        A05 = new EnumC0709Np(strA01, 0, strA01);
        String strA012 = A01(13, 14, 98);
        A04 = new EnumC0709Np(strA012, 1, strA012);
        String strA013 = A01(0, 13, 12);
        A03 = new EnumC0709Np(strA013, 2, strA013);
        A02 = A03();
    }

    public EnumC0709Np(String str, int i4, String str2) {
        this.A00 = str2;
    }

    public static EnumC0709Np A00(String str) {
        for (EnumC0709Np enumC0709Np : values()) {
            if (enumC0709Np.A00.equalsIgnoreCase(str)) {
                return enumC0709Np;
            }
        }
        return A03;
    }

    public static /* synthetic */ EnumC0709Np[] A03() {
        return new EnumC0709Np[]{A05, A04, A03};
    }

    public static EnumC0709Np valueOf(String str) {
        return (EnumC0709Np) Enum.valueOf(EnumC0709Np.class, str);
    }

    public static EnumC0709Np[] values() {
        return (EnumC0709Np[]) A02.clone();
    }
}
