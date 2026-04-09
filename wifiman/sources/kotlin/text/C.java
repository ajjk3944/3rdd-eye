package kotlin.text;

import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class C extends B {
    public static Double n(String str) {
        AbstractC6492s.i(str, "<this>");
        try {
            if (s.f52286b.m(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float o(String str) {
        AbstractC6492s.i(str, "<this>");
        try {
            if (s.f52286b.m(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
