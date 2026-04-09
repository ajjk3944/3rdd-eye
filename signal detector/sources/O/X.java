package o;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class X extends W {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f22469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f22469c = appCompatTextView;
    }

    @Override // h2.d, o.V
    public final void k(int i, float f2) {
        super/*android.widget.TextView*/.setLineHeight(i, f2);
    }
}
