package mr;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public static final e f16963d = new e(1);

    @Override // ar.k
    public final Object a(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        br.l.e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            br.l.d(string, "toString(this)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            br.l.d(string, "toString(this)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
