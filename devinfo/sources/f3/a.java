package f3;

import b7.w;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, w wVar, int i4) {
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        if ((i4 & 32) != 0) {
            wVar = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            if (wVar != null) {
                sb2.append((CharSequence) wVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
