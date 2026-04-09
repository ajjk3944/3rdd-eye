package I;

import R0.C3448a;
import R0.C3454g;
import R0.C3455h;
import R0.C3461n;
import R0.InterfaceC3456i;
import Zg.AbstractC3689v;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class V0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    private final H0 f8090a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8091b;

    /* renamed from: c, reason: collision with root package name */
    private final F.E f8092c;

    /* renamed from: d, reason: collision with root package name */
    private final M.G f8093d;

    /* renamed from: e, reason: collision with root package name */
    private final w1 f8094e;

    /* renamed from: f, reason: collision with root package name */
    private int f8095f;

    /* renamed from: g, reason: collision with root package name */
    private R0.Q f8096g;

    /* renamed from: h, reason: collision with root package name */
    private int f8097h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8098i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8099j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f8100k = true;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(InterfaceC3456i interfaceC3456i) {
            V0.this.c(interfaceC3456i);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC3456i) obj);
            return Yg.J.f24997a;
        }
    }

    public V0(R0.Q q10, H0 h02, boolean z10, F.E e10, M.G g10, w1 w1Var) {
        this.f8090a = h02;
        this.f8091b = z10;
        this.f8092c = e10;
        this.f8093d = g10;
        this.f8094e = w1Var;
        this.f8096g = q10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC3456i interfaceC3456i) {
        d();
        try {
            this.f8099j.add(interfaceC3456i);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.f8095f++;
        return true;
    }

    private final boolean e() {
        int i10 = this.f8095f - 1;
        this.f8095f = i10;
        if (i10 == 0 && !this.f8099j.isEmpty()) {
            this.f8090a.e(AbstractC3689v.l1(this.f8099j));
            this.f8099j.clear();
        }
        return this.f8095f > 0;
    }

    private final void f(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f8100k;
        return z10 ? d() : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f8100k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f8099j.clear();
        this.f8095f = 0;
        this.f8100k = false;
        this.f8090a.f(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f8100k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f8100k;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f8100k;
        return z10 ? this.f8091b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f8100k;
        if (z10) {
            c(new C3448a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        c(new C3454g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        c(new C3455h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        c(new C3461n());
        return true;
    }

    public final void g(R0.Q q10) {
        this.f8096g = q10;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f8096g.i(), L0.S.l(this.f8096g.h()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f8098i = z10;
        if (z10) {
            this.f8097h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return W0.b(this.f8096g);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (L0.S.h(this.f8096g.h())) {
            return null;
        }
        return R0.S.a(this.f8096g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return R0.S.b(this.f8096g, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return R0.S.c(this.f8096g, i10).toString();
    }

    public final void h(R0.Q q10, I0 i02) {
        if (this.f8100k) {
            g(q10);
            if (this.f8098i) {
                i02.d(this.f8097h, W0.b(q10));
            }
            L0.S sG = q10.g();
            int iL = sG != null ? L0.S.l(sG.r()) : -1;
            L0.S sG2 = q10.g();
            i02.a(L0.S.l(q10.h()), L0.S.k(q10.h()), iL, sG2 != null ? L0.S.k(sG2.r()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f8100k;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    c(new R0.P(0, this.f8096g.i().length()));
                    break;
                case R.id.cut:
                    f(277);
                    break;
                case R.id.copy:
                    f(278);
                    break;
                case R.id.paste:
                    f(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iA = R0.r.f19498b.c();
                    break;
                case 3:
                    iA = R0.r.f19498b.g();
                    break;
                case 4:
                    iA = R0.r.f19498b.h();
                    break;
                case 5:
                    iA = R0.r.f19498b.d();
                    break;
                case 6:
                    iA = R0.r.f19498b.b();
                    break;
                case 7:
                    iA = R0.r.f19498b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                    iA = R0.r.f19498b.a();
                    break;
            }
        } else {
            iA = R0.r.f19498b.a();
        }
        this.f8090a.b(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C2934h.f8325a.b(this.f8092c, this.f8093d, handwritingGesture, this.f8094e, executor, intConsumer, new a());
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f8100k;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C2934h.f8325a.d(this.f8092c, this.f8093d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z14 = this.f8100k;
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
        this.f8090a.d(z16, z17, z12, z13, z10, z11);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        this.f8090a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f8100k;
        if (z10) {
            c(new R0.N(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f8100k;
        if (z10) {
            c(new R0.O(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f8100k;
        if (!z10) {
            return z10;
        }
        c(new R0.P(i10, i11));
        return true;
    }
}
