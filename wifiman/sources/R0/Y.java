package R0;

import R0.C3470x;
import R0.C3471y;
import R0.r;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class Y {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: R0.W
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Y.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: R0.X
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                Y.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, C3465s c3465s, Q q10) {
        int iE = c3465s.e();
        r.a aVar = r.f19498b;
        int i10 = 6;
        if (r.m(iE, aVar.a())) {
            if (!c3465s.h()) {
                i10 = 0;
            }
        } else if (r.m(iE, aVar.e())) {
            i10 = 1;
        } else if (r.m(iE, aVar.c())) {
            i10 = 2;
        } else if (r.m(iE, aVar.d())) {
            i10 = 5;
        } else if (r.m(iE, aVar.f())) {
            i10 = 7;
        } else if (r.m(iE, aVar.g())) {
            i10 = 3;
        } else if (r.m(iE, aVar.h())) {
            i10 = 4;
        } else if (!r.m(iE, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        c3465s.g();
        int iF = c3465s.f();
        C3471y.a aVar2 = C3471y.f19528b;
        if (C3471y.n(iF, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (C3471y.n(iF, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= PduHandle.NONE;
        } else if (C3471y.n(iF, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (C3471y.n(iF, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (C3471y.n(iF, aVar2.j())) {
            editorInfo.inputType = 17;
        } else if (C3471y.n(iF, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (C3471y.n(iF, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (C3471y.n(iF, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!C3471y.n(iF, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!c3465s.h() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (r.m(c3465s.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = c3465s.c();
            C3470x.a aVar3 = C3470x.f19521b;
            if (C3470x.i(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (C3470x.i(iC, aVar3.e())) {
                editorInfo.inputType |= 8192;
            } else if (C3470x.i(iC, aVar3.c())) {
                editorInfo.inputType |= TLSTM.TLS_MAX_FRAGMENT_SIZE;
            }
            if (c3465s.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = L0.S.n(q10.h());
        editorInfo.initialSelEnd = L0.S.i(q10.h());
        I1.a.e(editorInfo, q10.i());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f.c().x(editorInfo);
        }
    }
}
