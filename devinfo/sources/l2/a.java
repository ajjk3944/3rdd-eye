package l2;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;
import j1.q;
import je.y;
import k1.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28545a;

    /* renamed from: b, reason: collision with root package name */
    public final View f28546b;

    public a(ContentCaptureSession contentCaptureSession, View view) {
        this.f28545a = contentCaptureSession;
        this.f28546b = view;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionD = y.d(this.f28545a);
            q qVarF = nh.a.f(this.f28546b);
            Objects.requireNonNull(qVarF);
            contentCaptureSessionD.notifyViewsDisappeared(y.b(qVarF.f27058a), new long[]{Long.MIN_VALUE});
        }
    }

    public final AutofillId b(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionD = y.d(this.f28545a);
        q qVarF = nh.a.f(this.f28546b);
        Objects.requireNonNull(qVarF);
        return contentCaptureSessionD.newAutofillId(y.b(qVarF.f27058a), j);
    }

    public final km.y c(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return new km.y(1, y.d(this.f28545a).newVirtualViewStructure(autofillId, j));
    }

    public final void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.d(this.f28545a).notifyViewAppeared(viewStructure);
        }
    }

    public final void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.d(this.f28545a).notifyViewDisappeared(autofillId);
        }
    }

    public final void f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f28545a).notifyViewTextChanged(autofillId, str);
        }
    }
}
