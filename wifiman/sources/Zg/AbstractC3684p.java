package Zg;

import bh.AbstractC4110a;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: Zg.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3684p extends AbstractC3683o {
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!AbstractC3682n.c((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof Yg.B) && (obj2 instanceof Yg.B)) {
                    if (!AbstractC4110a.c(((Yg.B) obj).A(), ((Yg.B) obj2).A())) {
                        return false;
                    }
                } else if ((obj instanceof Yg.I) && (obj2 instanceof Yg.I)) {
                    if (!AbstractC4110a.a(((Yg.I) obj).A(), ((Yg.I) obj2).A())) {
                        return false;
                    }
                } else if ((obj instanceof Yg.D) && (obj2 instanceof Yg.D)) {
                    if (!AbstractC4110a.b(((Yg.D) obj).A(), ((Yg.D) obj2).A())) {
                        return false;
                    }
                } else if ((obj instanceof Yg.F) && (obj2 instanceof Yg.F)) {
                    if (!AbstractC4110a.d(((Yg.F) obj).A(), ((Yg.F) obj2).A())) {
                        return false;
                    }
                } else if (!AbstractC6492s.d(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
