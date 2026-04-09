package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29340a;

    /* renamed from: b, reason: collision with root package name */
    private final View f29341b;

    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* renamed from: androidx.compose.ui.platform.coreshims.c$c, reason: collision with other inner class name */
    private static class C1075c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private c(ContentCaptureSession contentCaptureSession, View view) {
        this.f29340a = contentCaptureSession;
        this.f29341b = view;
    }

    public static c f(ContentCaptureSession contentCaptureSession, View view) {
        return new c(contentCaptureSession, view);
    }

    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = androidx.compose.ui.platform.coreshims.b.a(this.f29340a);
        androidx.compose.ui.platform.coreshims.a aVarA = d.a(this.f29341b);
        Objects.requireNonNull(aVarA);
        return b.a(contentCaptureSessionA, aVarA.a(), j10);
    }

    public e b(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.i(b.c(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), autofillId, j10));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), autofillId, charSequence);
        }
    }

    public void d(List list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            C1075c.a(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), list);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), this.f29341b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), viewStructureB);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), (ViewStructure) list.get(i11));
            }
            ViewStructure viewStructureB2 = b.b(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), this.f29341b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), viewStructureB2);
        }
    }

    public void e(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSessionA = androidx.compose.ui.platform.coreshims.b.a(this.f29340a);
            androidx.compose.ui.platform.coreshims.a aVarA = d.a(this.f29341b);
            Objects.requireNonNull(aVarA);
            b.f(contentCaptureSessionA, aVarA.a(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureB = b.b(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), this.f29341b);
            a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), viewStructureB);
            ContentCaptureSession contentCaptureSessionA2 = androidx.compose.ui.platform.coreshims.b.a(this.f29340a);
            androidx.compose.ui.platform.coreshims.a aVarA2 = d.a(this.f29341b);
            Objects.requireNonNull(aVarA2);
            b.f(contentCaptureSessionA2, aVarA2.a(), jArr);
            ViewStructure viewStructureB2 = b.b(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), this.f29341b);
            a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.b.a(this.f29340a), viewStructureB2);
        }
    }
}
