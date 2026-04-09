package s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: s3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7900o {

    /* renamed from: s3.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f61332a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f61333b;

        /* synthetic */ a(Object obj, V v10) {
            AbstractC7901p.l(obj);
            this.f61333b = obj;
            this.f61332a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC7901p.l(str);
            this.f61332a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f61333b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f61332a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f61332a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
