package L0;

import L0.I;
import android.text.TextUtils;
import android.view.View;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class G extends I.b<CharSequence> {
    @Override // L0.I.b
    public final CharSequence a(View view) {
        return I.i.b(view);
    }

    @Override // L0.I.b
    public final void b(View view, CharSequence charSequence) {
        I.i.e(view, charSequence);
    }

    @Override // L0.I.b
    public final boolean d(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
