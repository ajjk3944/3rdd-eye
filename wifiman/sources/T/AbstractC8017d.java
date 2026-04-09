package t;

import androidx.compose.ui.platform.C3917f0;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8017d {
    public static final String a(C3917f0 c3917f0) {
        int itemCount = c3917f0.a().getItemCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < itemCount; i10++) {
            z10 = z10 || c3917f0.a().getItemAt(i10).getText() != null;
        }
        if (!z10) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int itemCount2 = c3917f0.a().getItemCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < itemCount2; i11++) {
            CharSequence text = c3917f0.a().getItemAt(i11).getText();
            if (text != null) {
                if (z11) {
                    sb2.append("\n");
                }
                sb2.append(text);
                z11 = true;
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
