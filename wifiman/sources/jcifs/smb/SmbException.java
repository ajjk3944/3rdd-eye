package jcifs.smb;

import Qg.a;
import Qg.b;
import Qg.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jcifs.CIFSException;

/* loaded from: classes4.dex */
public class SmbException extends CIFSException implements b, a, c {

    /* renamed from: b, reason: collision with root package name */
    private static final Map f50240b;

    /* renamed from: c, reason: collision with root package name */
    private static final Map f50241c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f50242d;

    /* renamed from: a, reason: collision with root package name */
    private int f50243a;

    static {
        HashMap map = new HashMap();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = b.f19353S;
            if (i11 >= iArr.length) {
                break;
            }
            map.put(Integer.valueOf(iArr[i11]), b.f19354T[i11]);
            i11++;
        }
        HashMap map2 = new HashMap();
        int i12 = 0;
        while (true) {
            int[][] iArr2 = a.f19351Q;
            if (i12 >= iArr2.length) {
                break;
            }
            map2.put(Integer.valueOf(iArr2[i12][0]), Integer.valueOf(iArr2[i12][1]));
            String str = (String) map.get(Integer.valueOf(iArr2[i12][1]));
            if (str != null) {
                map.put(Integer.valueOf(iArr2[i12][0]), str);
            }
            i12++;
        }
        map.put(0, "NT_STATUS_SUCCESS");
        f50240b = Collections.unmodifiableMap(map);
        f50242d = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        while (true) {
            int[] iArr3 = c.f19355U;
            if (i10 >= iArr3.length) {
                f50241c = Collections.unmodifiableMap(map3);
                return;
            } else {
                map3.put(Integer.valueOf(iArr3[i10]), c.f19356V[i10]);
                i10++;
            }
        }
    }

    public SmbException() {
    }

    public SmbException(String str) {
        super(str);
        this.f50243a = -1073741823;
    }
}
