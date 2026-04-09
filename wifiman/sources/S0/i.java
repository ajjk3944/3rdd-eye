package s0;

import Zg.AbstractC3682n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private float[] f60955a = new float[64];

    public static /* synthetic */ ArrayList b(i iVar, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return iVar.a(str, arrayList);
    }

    public final ArrayList a(String str, ArrayList arrayList) {
        int i10;
        char cCharAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && AbstractC6492s.k(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && AbstractC6492s.k(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = str.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 97) * (i14 - 122) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || AbstractC6492s.k(str.charAt(i10), 32) > 0) {
                            long jA = AbstractC7866b.a(str, i10, length);
                            i11 = (int) (jA >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA & Counter32.MAX_COUNTER32_VALUE));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.f60955a;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.f60955a = fArr2;
                                    AbstractC3682n.j(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                AbstractC7872h.a(cCharAt, arrayList, this.f60955a, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }
}
