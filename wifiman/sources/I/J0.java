package I;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public final class J0 implements I0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f8031a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f8032b = Yg.n.a(Yg.q.NONE, new a());

    /* renamed from: c, reason: collision with root package name */
    private final F1.K f8033c;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = J0.this.f8031a.getContext().getSystemService("input_method");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public J0(View view) {
        this.f8031a = view;
        this.f8033c = new F1.K(view);
    }

    private final InputMethodManager g() {
        return (InputMethodManager) this.f8032b.getValue();
    }

    @Override // I.I0
    public void a(int i10, int i11, int i12, int i13) {
        g().updateSelection(this.f8031a, i10, i11, i12, i13);
    }

    @Override // I.I0
    public void b() {
        g().restartInput(this.f8031a);
    }

    @Override // I.I0
    public void c(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.f8031a, cursorAnchorInfo);
    }

    @Override // I.I0
    public void d(int i10, ExtractedText extractedText) {
        g().updateExtractedText(this.f8031a, i10, extractedText);
    }

    @Override // I.I0
    public void e() {
        if (Build.VERSION.SDK_INT >= 34) {
            C2942l.f8362a.a(g(), this.f8031a);
        }
    }

    @Override // I.I0
    public boolean isActive() {
        return g().isActive(this.f8031a);
    }
}
