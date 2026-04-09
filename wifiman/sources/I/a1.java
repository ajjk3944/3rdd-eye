package I;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AbstractC3934l;
import androidx.compose.ui.platform.C3917f0;
import androidx.compose.ui.platform.C3920g0;
import t.C8015b;
import t.C8016c;

/* loaded from: classes.dex */
public abstract class a1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText b(H.h hVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = hVar;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = hVar.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = L0.S.l(hVar.f());
        extractedText.selectionEnd = L0.S.k(hVar.f());
        extractedText.flags = !kotlin.text.t.V(hVar, '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }

    public static final C8016c c(I1.d dVar, Bundle bundle) {
        C3917f0 c3917f0C = AbstractC3934l.c(new ClipData(dVar.b(), new ClipData.Item(dVar.a())));
        int iA = C8016c.a.f61663a.a();
        C3920g0 c3920g0D = AbstractC3934l.d(dVar.b());
        Uri uriC = dVar.c();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new C8016c(c3917f0C, c3920g0D, iA, new C8015b(uriC, bundle), null);
    }
}
