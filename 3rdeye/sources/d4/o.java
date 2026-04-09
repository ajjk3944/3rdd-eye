package d4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class o extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public int f37525b;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i, boolean z10) {
        super.setVisibility(i);
        if (z10) {
            this.f37525b = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f37525b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37525b = getVisibility();
    }
}
