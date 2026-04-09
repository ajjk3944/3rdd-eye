package kotlin.text;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: kotlin.text.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6514h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC6492s.k(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
