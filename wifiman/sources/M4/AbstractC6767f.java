package m4;

import java.util.Arrays;

/* renamed from: m4.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6767f extends AbstractC6763b {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
