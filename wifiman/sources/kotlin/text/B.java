package kotlin.text;

import kotlin.jvm.internal.AbstractC6492s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class B extends A {
    public static StringBuilder m(StringBuilder sb2, String... value) {
        AbstractC6492s.i(sb2, "<this>");
        AbstractC6492s.i(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }
}
