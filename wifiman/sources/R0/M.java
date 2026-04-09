package R0;

import Zg.AbstractC3689v;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class M implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3466t f19401a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19402b;

    /* renamed from: c, reason: collision with root package name */
    private int f19403c;

    /* renamed from: d, reason: collision with root package name */
    private Q f19404d;

    /* renamed from: e, reason: collision with root package name */
    private int f19405e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19406f;

    /* renamed from: g, reason: collision with root package name */
    private final List f19407g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f19408h = true;

    public M(Q q10, InterfaceC3466t interfaceC3466t, boolean z10) {
        this.f19401a = interfaceC3466t;
        this.f19402b = z10;
        this.f19404d = q10;
    }

    private final void b(InterfaceC3456i interfaceC3456i) {
        c();
        try {
            this.f19407g.add(interfaceC3456i);
        } finally {
            d();
        }
    }

    private final boolean c() {
        this.f19403c++;
        return true;
    }

    private final boolean d() {
        int i10 = this.f19403c - 1;
        this.f19403c = i10;
        if (i10 == 0 && !this.f19407g.isEmpty()) {
            this.f19401a.e(AbstractC3689v.l1(this.f19407g));
            this.f19407g.clear();
        }
        return this.f19403c > 0;
    }

    private final void e(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f19408h;
        return z10 ? c() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f19408h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f19407g.clear();
        this.f19403c = 0;
        this.f19408h = false;
        this.f19401a.a(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f19408h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f19408h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f19408h;
        return z10 ? this.f19402b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f19408h;
        if (z10) {
            b(new C3448a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        b(new C3454g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        b(new C3455h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final void f(Q q10) {
        this.f19404d = q10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        b(new C3461n());
        return true;
    }

    public final void g(Q q10, InterfaceC3467u interfaceC3467u) {
        if (this.f19408h) {
            f(q10);
            if (this.f19406f) {
                interfaceC3467u.d(this.f19405e, AbstractC3469w.a(q10));
            }
            L0.S sG = q10.g();
            int iL = sG != null ? L0.S.l(sG.r()) : -1;
            L0.S sG2 = q10.g();
            interfaceC3467u.a(L0.S.l(q10.h()), L0.S.k(q10.h()), iL, sG2 != null ? L0.S.k(sG2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f19404d.i(), L0.S.l(this.f19404d.h()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f19406f = z10;
        if (z10) {
            this.f19405e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3469w.a(this.f19404d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (L0.S.h(this.f19404d.h())) {
            return null;
        }
        return S.a(this.f19404d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return S.b(this.f19404d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return S.c(this.f19404d, i10).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f19408h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    b(new P(0, this.f19404d.i().length()));
                    break;
                case R.id.cut:
                    e(277);
                    break;
                case R.id.copy:
                    e(278);
                    break;
                case R.id.paste:
                    e(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = r.f19498b.c();
                    break;
                case 3:
                    iA = r.f19498b.g();
                    break;
                case 4:
                    iA = r.f19498b.h();
                    break;
                case 5:
                    iA = r.f19498b.d();
                    break;
                case 6:
                    iA = r.f19498b.b();
                    break;
                case 7:
                    iA = r.f19498b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = r.f19498b.a();
                    break;
            }
        } else {
            iA = r.f19498b.a();
        }
        this.f19401a.b(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f19408h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = this.f19408h;
        if (!z14) {
            return z14;
        }
        boolean z15 = false;
        boolean z16 = (i10 & 1) != 0;
        boolean z17 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            boolean z18 = (i10 & 16) != 0;
            boolean z19 = (i10 & 8) != 0;
            boolean z20 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z20 || z15) {
                z11 = z15;
                z10 = z20;
                z13 = z19;
                z12 = z18;
            } else if (i11 >= 34) {
                z12 = true;
                z13 = true;
                z10 = true;
                z11 = true;
            } else {
                z11 = z15;
                z12 = true;
                z13 = true;
                z10 = true;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
        }
        this.f19401a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        this.f19401a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f19408h;
        if (z10) {
            b(new N(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f19408h;
        if (z10) {
            b(new O(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f19408h;
        if (!z10) {
            return z10;
        }
        b(new P(i10, i11));
        return true;
    }
}
