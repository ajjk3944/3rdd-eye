package k6;

import H6.C0675l;
import N7.Yb;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import z0.C5848a;

/* compiled from: DivActionTypedUtils.kt */
/* renamed from: k6.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5246y {
    public static final void a(View view) {
        kotlin.jvm.internal.l.f(view, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) C5848a.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static final Double b(Yb yb, A7.d dVar) {
        kotlin.jvm.internal.l.f(yb, "<this>");
        if (yb instanceof Yb.e) {
            return Double.valueOf(((Yb.e) yb).f7807b.f5746a.a(dVar).longValue());
        }
        if (yb instanceof Yb.f) {
            return ((Yb.f) yb).f7808b.f7605a.a(dVar);
        }
        return null;
    }

    public static final Object c(Yb yb, A7.d dVar) {
        kotlin.jvm.internal.l.f(yb, "<this>");
        if (yb instanceof Yb.e) {
            return ((Yb.e) yb).f7807b.f5746a.a(dVar);
        }
        if (yb instanceof Yb.g) {
            return ((Yb.g) yb).f7809b.f8877a.a(dVar);
        }
        if (yb instanceof Yb.b) {
            return ((Yb.b) yb).f7804b.f8623a.a(dVar);
        }
        if (yb instanceof Yb.c) {
            return ((Yb.c) yb).f7805b.f9353a.a(dVar);
        }
        if (yb instanceof Yb.f) {
            return ((Yb.f) yb).f7808b.f7605a.a(dVar);
        }
        if (yb instanceof Yb.h) {
            return ((Yb.h) yb).f7810b.f9989a.a(dVar);
        }
        if (yb instanceof Yb.a) {
            return ((Yb.a) yb).f7803b.f7875a.a(dVar);
        }
        if (yb instanceof Yb.d) {
            return ((Yb.d) yb).f7806b.f5942a.a(dVar);
        }
        throw new b9.j();
    }

    public static final void d(C0675l c0675l, Throwable throwable) {
        kotlin.jvm.internal.l.f(c0675l, "<this>");
        kotlin.jvm.internal.l.f(throwable, "throwable");
        c0675l.getViewComponent$div_release().a().a(c0675l.getDivData(), c0675l.getDataTag()).a(throwable);
    }

    public static final void e(C0675l c0675l, Throwable th) {
        kotlin.jvm.internal.l.f(c0675l, "<this>");
        Q6.c cVarA = c0675l.getViewComponent$div_release().a().a(c0675l.getDivData(), c0675l.getDataTag());
        cVarA.f11320d.add(th);
        cVarA.b();
    }
}
