package o;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class W extends h2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f22461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f22461b = appCompatTextView;
    }

    @Override // h2.d, o.V
    public final void c(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // h2.d, o.V
    public final void h(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }
}
