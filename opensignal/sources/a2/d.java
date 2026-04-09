package a2;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.google.android.gms.internal.measurement.y3;
import java.util.Objects;
import lq.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f29a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30b;

    public d(View view) {
        this.f29a = view;
        this.f30b = kc.f.E(j.NONE, new ht.g(17, this));
    }

    public AutofillId a(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionK = b.k(this.f30b);
        a aVarT = y3.t(this.f29a);
        Objects.requireNonNull(aVarT);
        return c.c(contentCaptureSessionK, a1.a.d(aVarT.f28a), j);
    }

    public d(ContentCaptureSession contentCaptureSession, View view) {
        this.f30b = contentCaptureSession;
        this.f29a = view;
    }
}
