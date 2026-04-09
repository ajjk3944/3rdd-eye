package I;

import R0.C3465s;
import R0.C3470x;
import R0.C3471y;
import R0.r;
import android.view.inputmethod.EditorInfo;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.transport.TLSTM;

/* loaded from: classes.dex */
public abstract class V {
    private static final boolean a(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void b(EditorInfo editorInfo, CharSequence charSequence, long j10, C3465s c3465s, String[] strArr) {
        int iE = c3465s.e();
        r.a aVar = R0.r.f19498b;
        int i10 = 3;
        int i11 = 6;
        if (R0.r.m(iE, aVar.a())) {
            if (!c3465s.h()) {
                i11 = 0;
            }
        } else if (R0.r.m(iE, aVar.e())) {
            i11 = 1;
        } else if (R0.r.m(iE, aVar.c())) {
            i11 = 2;
        } else if (R0.r.m(iE, aVar.d())) {
            i11 = 5;
        } else if (R0.r.m(iE, aVar.f())) {
            i11 = 7;
        } else if (R0.r.m(iE, aVar.g())) {
            i11 = 3;
        } else if (R0.r.m(iE, aVar.h())) {
            i11 = 4;
        } else if (!R0.r.m(iE, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i11;
        c3465s.g();
        Q0.f8079a.a(editorInfo, c3465s.d());
        int iF = c3465s.f();
        C3471y.a aVar2 = C3471y.f19528b;
        if (C3471y.n(iF, aVar2.h())) {
            i10 = 1;
        } else if (C3471y.n(iF, aVar2.a())) {
            editorInfo.imeOptions |= PduHandle.NONE;
            i10 = 1;
        } else if (C3471y.n(iF, aVar2.d())) {
            i10 = 2;
        } else if (!C3471y.n(iF, aVar2.g())) {
            if (C3471y.n(iF, aVar2.j())) {
                i10 = 17;
            } else if (C3471y.n(iF, aVar2.c())) {
                i10 = 33;
            } else if (C3471y.n(iF, aVar2.f())) {
                i10 = 129;
            } else if (C3471y.n(iF, aVar2.e())) {
                i10 = 18;
            } else {
                if (!C3471y.n(iF, aVar2.b())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i10 = 8194;
            }
        }
        editorInfo.inputType = i10;
        if (!c3465s.h() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (R0.r.m(c3465s.e(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
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
        editorInfo.initialSelStart = L0.S.n(j10);
        editorInfo.initialSelEnd = L0.S.i(j10);
        I1.a.e(editorInfo, charSequence);
        if (strArr != null) {
            I1.a.c(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!G.c.a() || C3471y.n(c3465s.f(), aVar2.f()) || C3471y.n(c3465s.f(), aVar2.e())) {
            I1.a.f(editorInfo, false);
        } else {
            I1.a.f(editorInfo, true);
            U.f8083a.a(editorInfo);
        }
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, C3465s c3465s, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, c3465s, strArr);
    }
}
