package I;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
abstract class r implements InterfaceC2952q {

    /* renamed from: a, reason: collision with root package name */
    private final View f8397a;

    /* renamed from: b, reason: collision with root package name */
    private InputMethodManager f8398b;

    /* renamed from: c, reason: collision with root package name */
    private final F1.K f8399c;

    public r(View view) {
        this.f8397a = view;
        this.f8399c = new F1.K(view);
    }

    private final InputMethodManager d() {
        Object systemService = this.f8397a.getContext().getSystemService("input_method");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @Override // I.InterfaceC2952q
    public void a(int i10, int i11, int i12, int i13) {
        g().updateSelection(this.f8397a, i10, i11, i12, i13);
    }

    @Override // I.InterfaceC2952q
    public void b() {
        g().restartInput(this.f8397a);
    }

    @Override // I.InterfaceC2952q
    public void c(CursorAnchorInfo cursorAnchorInfo) {
        g().updateCursorAnchorInfo(this.f8397a, cursorAnchorInfo);
    }

    @Override // I.InterfaceC2952q
    public void e() {
    }

    protected final View f() {
        return this.f8397a;
    }

    protected final InputMethodManager g() {
        InputMethodManager inputMethodManager = this.f8398b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManagerD = d();
        this.f8398b = inputMethodManagerD;
        return inputMethodManagerD;
    }
}
