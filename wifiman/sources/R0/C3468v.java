package R0;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* renamed from: R0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3468v implements InterfaceC3467u {

    /* renamed from: a, reason: collision with root package name */
    private final View f19517a;

    /* renamed from: b, reason: collision with root package name */
    private final Yg.m f19518b = Yg.n.a(Yg.q.NONE, new a());

    /* renamed from: c, reason: collision with root package name */
    private final F1.K f19519c;

    /* renamed from: R0.v$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = C3468v.this.f19517a.getContext().getSystemService("input_method");
            AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public C3468v(View view) {
        this.f19517a = view;
        this.f19519c = new F1.K(view);
    }

    private final InputMethodManager h() {
        return (InputMethodManager) this.f19518b.getValue();
    }

    @Override // R0.InterfaceC3467u
    public void a(int i10, int i11, int i12, int i13) {
        h().updateSelection(this.f19517a, i10, i11, i12, i13);
    }

    @Override // R0.InterfaceC3467u
    public void b() {
        h().restartInput(this.f19517a);
    }

    @Override // R0.InterfaceC3467u
    public void c(CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.f19517a, cursorAnchorInfo);
    }

    @Override // R0.InterfaceC3467u
    public void d(int i10, ExtractedText extractedText) {
        h().updateExtractedText(this.f19517a, i10, extractedText);
    }

    @Override // R0.InterfaceC3467u
    public void e() {
        this.f19519c.a();
    }

    @Override // R0.InterfaceC3467u
    public void f() {
        this.f19519c.b();
    }

    @Override // R0.InterfaceC3467u
    public boolean isActive() {
        return h().isActive(this.f19517a);
    }
}
