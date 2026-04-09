package I;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.w1;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import mh.InterfaceC6835l;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2934h {

    /* renamed from: a, reason: collision with root package name */
    public static final C2934h f8325a = new C2934h();

    private C2934h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(F.E e10, M.G g10, HandwritingGesture handwritingGesture, w1 w1Var, Executor executor, final IntConsumer intConsumer, InterfaceC6835l interfaceC6835l) {
        final int iL = e10 != null ? E0.f7990a.l(e10, handwritingGesture, g10, w1Var, interfaceC6835l) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: I.g
                @Override // java.lang.Runnable
                public final void run() {
                    C2934h.c(intConsumer, iL);
                }
            });
        } else {
            intConsumer.accept(iL);
        }
    }

    public final boolean d(F.E e10, M.G g10, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (e10 != null) {
            return E0.f7990a.D(e10, previewableHandwritingGesture, g10, cancellationSignal);
        }
        return false;
    }
}
