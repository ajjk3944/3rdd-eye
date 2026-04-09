package I;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: I.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2938j {

    /* renamed from: a, reason: collision with root package name */
    public static final C2938j f8357a = new C2938j();

    private C2938j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i10) {
        intConsumer.accept(i10);
    }

    public final void b(k1 k1Var, HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        final int iE = k1Var.e(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: I.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2938j.c(intConsumer, iE);
                }
            });
        } else {
            intConsumer.accept(iE);
        }
    }

    public final boolean d(k1 k1Var, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return k1Var.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
