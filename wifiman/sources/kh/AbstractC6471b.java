package kh;

import Zg.AbstractC3682n;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.asn1.BER;

/* renamed from: kh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6471b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f51477a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f51478b;

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f51479c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f51480d;

    static {
        byte[] bArr = {65, 66, BER.TIMETICKS, BER.OPAQUE, 69, BER.COUNTER64, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, BER.SEQUENCE, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f51477a = bArr;
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int i10 = 0;
        AbstractC3682n.w(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f51478b = iArr;
        byte[] bArr2 = {65, 66, BER.TIMETICKS, BER.OPAQUE, 69, BER.COUNTER64, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, BER.SEQUENCE, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f51479c = bArr2;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        AbstractC3682n.w(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i13 = 0;
        while (i10 < length2) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f51480d = iArr2;
    }
}
