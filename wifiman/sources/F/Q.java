package F;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.R;
import android.content.res.Resources;

/* loaded from: classes.dex */
public enum Q {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll);

    private final int stringId;

    Q(int i10) {
        this.stringId = i10;
    }

    public final String resolvedString(InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-309609081, i10, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (ContextMenu.android.kt:89)");
        }
        String strA = H0.f.a(this.stringId, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return strA;
    }
}
