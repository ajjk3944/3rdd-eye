package p;

import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class v0 extends km.y {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f30893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(AppCompatTextView appCompatTextView) {
        super(6, appCompatTextView);
        this.f30893c = appCompatTextView;
    }

    @Override // km.y, p.u0
    public final void l(int i4) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i4);
    }

    @Override // km.y, p.u0
    public final void o(int i4) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i4);
    }
}
