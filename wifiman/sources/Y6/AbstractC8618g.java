package y6;

import sh.AbstractC7978m;
import sh.InterfaceC7970e;

/* renamed from: y6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8618g {
    public static final InterfaceC7970e a(float f10, float f11) {
        return f11 > f10 ? AbstractC7978m.b(f10, f11) : AbstractC7978m.b(f11, f10);
    }

    public static final String b(float f10) {
        if (f10 >= 0.0f) {
            return String.valueOf(f10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 8722);
        sb2.append(-f10);
        return sb2.toString();
    }
}
