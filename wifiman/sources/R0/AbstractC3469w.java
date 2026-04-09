package R0;

import android.view.inputmethod.ExtractedText;

/* renamed from: R0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3469w {
    public static final ExtractedText a(Q q10) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = q10.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = q10.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = L0.S.l(q10.h());
        extractedText.selectionEnd = L0.S.k(q10.h());
        extractedText.flags = !kotlin.text.t.V(q10.i(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
