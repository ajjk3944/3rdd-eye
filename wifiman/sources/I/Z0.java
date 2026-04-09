package I;

import I1.c;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class Z0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    private final k1 f8109a;

    /* renamed from: b, reason: collision with root package name */
    private int f8110b;

    /* renamed from: c, reason: collision with root package name */
    private final V.b f8111c = new V.b(new InterfaceC6835l[16], 0);

    /* renamed from: d, reason: collision with root package name */
    private final k f8112d;

    /* renamed from: e, reason: collision with root package name */
    private final InputConnection f8113e;

    public static final class a implements c.b {
        a() {
        }

        @Override // I1.c.b
        public boolean a(I1.d dVar, int i10, Bundle bundle) {
            if ((i10 & 1) != 0) {
                try {
                    dVar.d();
                    Object objE = dVar.e();
                    AbstractC6492s.g(objE, "null cannot be cast to non-null type android.os.Parcelable");
                    Parcelable parcelable = (Parcelable) objE;
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                } catch (Exception e10) {
                    Z0.this.j("Can't insert content from IME; requestPermission() failed, " + e10);
                    return false;
                }
            }
            return Z0.this.f8109a.c(a1.c(dVar, bundle));
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f8115a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8116b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i10) {
            super(1);
            this.f8115a = charSequence;
            this.f8116b = i10;
        }

        public final void a(I i10) {
            H.a(i10, String.valueOf(this.f8115a), this.f8116b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8117a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8118b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11) {
            super(1);
            this.f8117a = i10;
            this.f8118b = i11;
        }

        public final void a(I i10) {
            H.c(i10, this.f8117a, this.f8118b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, int i11) {
            super(1);
            this.f8119a = i10;
            this.f8120b = i11;
        }

        public final void a(I i10) {
            H.d(i10, this.f8119a, this.f8120b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        public final void a(I i10) {
            V.b bVar = Z0.this.f8111c;
            int iO = bVar.o();
            if (iO > 0) {
                Object[] objArrM = bVar.m();
                int i11 = 0;
                do {
                    ((InterfaceC6835l) objArrM[i11]).invoke(i10);
                    i11++;
                } while (i11 < iO);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f8122a = new f();

        f() {
            super(1);
        }

        public final void a(I i10) {
            H.e(i10);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class g extends AbstractC6494u implements InterfaceC6835l {
        g() {
            super(1);
        }

        public final void a(I i10) {
            i10.u(0, Z0.this.i().length());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8125b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i10, int i11) {
            super(1);
            this.f8124a = i10;
            this.f8125b = i11;
        }

        public final void a(I i10) {
            H.g(i10, this.f8124a, this.f8125b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class i extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f8126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8127b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(CharSequence charSequence, int i10) {
            super(1);
            this.f8126a = charSequence;
            this.f8127b = i10;
        }

        public final void a(I i10) {
            H.h(i10, String.valueOf(this.f8126a), this.f8127b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    static final class j extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, int i11) {
            super(1);
            this.f8128a = i10;
            this.f8129b = i11;
        }

        public final void a(I i10) {
            i10.u(this.f8128a, this.f8129b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((I) obj);
            return Yg.J.f24997a;
        }
    }

    public static final class k extends InputConnectionWrapper {
        k(Z0 z02) {
            super(z02, false);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            return false;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            return true;
        }
    }

    public Z0(k1 k1Var, EditorInfo editorInfo) {
        this.f8109a = k1Var;
        k kVar = new k(this);
        this.f8112d = kVar;
        this.f8113e = I1.c.d(kVar, editorInfo, new a());
    }

    private final void f(InterfaceC6835l interfaceC6835l) {
        g();
        try {
            this.f8111c.b(interfaceC6835l);
        } finally {
            h();
        }
    }

    private final boolean g() {
        this.f8110b++;
        return true;
    }

    private final boolean h() {
        int i10 = this.f8110b - 1;
        this.f8110b = i10;
        if (i10 == 0 && this.f8111c.u()) {
            this.f8109a.d(new e());
            this.f8111c.h();
        }
        return this.f8110b > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H.h i() {
        return this.f8109a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(String str) {
    }

    private final void k(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        j("beginBatchEdit()");
        return g();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        j("clearMetaKeyStates(" + i10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        j("closeConnection()");
        this.f8111c.h();
        this.f8110b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("commitCompletion(");
        sb2.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb2.append(')');
        j(sb2.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        j("commitContent(" + inputContentInfo + ", " + i10 + ", " + bundle + ')');
        return C2930f.f8307a.a(this.f8113e, inputContentInfo, i10, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        j("commitText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        f(new b(charSequence, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        j("deleteSurroundingText(" + i10 + ", " + i11 + ')');
        f(new c(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        j("deleteSurroundingTextInCodePoints(" + i10 + ", " + i11 + ')');
        f(new d(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        j("endBatchEdit()");
        return h();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        j("finishComposingText()");
        f(f.f8122a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        j("getCursorCapsMode(" + i10 + ')');
        return TextUtils.getCapsMode(i(), L0.S.l(i().f()), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        j("getExtractedText(" + extractedTextRequest + ", " + i10 + ')');
        return a1.b(i());
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        j("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        String string = L0.S.h(i().f()) ? null : H.i.a(i()).toString();
        j("getSelectedText(" + i10 + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        String string = H.i.b(i(), i10).toString();
        j("getTextAfterCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        String string = H.i.c(i(), i10).toString();
        j("getTextBeforeCursor(" + i10 + ", " + i11 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        j("performContextMenuAction(" + i10 + ')');
        switch (i10) {
            case R.id.selectAll:
                f(new g());
                break;
            case R.id.cut:
                k(277);
                break;
            case R.id.copy:
                k(278);
                break;
            case R.id.paste:
                k(279);
                break;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iA;
        j("performEditorAction(" + i10 + ')');
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
                    j("IME sent an unrecognized editor action: " + i10);
                    iA = R0.r.f19498b.a();
                    break;
            }
        } else {
            iA = R0.r.f19498b.a();
        }
        this.f8109a.b(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        j("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        C2938j.f8357a.b(this.f8109a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        j("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.f8113e.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        j("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return C2938j.f8357a.d(this.f8109a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        j("reportFullscreenMode(" + z10 + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        j("requestCursorUpdates(" + i10 + ')');
        this.f8109a.requestCursorUpdates(i10);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        j("sendKeyEvent(" + keyEvent + ')');
        this.f8109a.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        j("setComposingRegion(" + i10 + ", " + i11 + ')');
        f(new h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        j("setComposingText(\"" + ((Object) charSequence) + "\", " + i10 + ')');
        f(new i(charSequence, i10));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        j("setSelection(" + i10 + ", " + i11 + ')');
        f(new j(i10, i11));
        return true;
    }
}
