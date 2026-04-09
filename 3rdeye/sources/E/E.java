package E;

import C.J;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: TakePictureRequest.java */
/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f1294a;

    public E() {
        this.f1294a = ((CaptureFailedRetryQuirk) K.b.f2936a.e(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
    }

    public abstract Executor a();

    public abstract int b();

    public abstract Rect c();

    public abstract J.d d();

    public abstract int e();

    public abstract J.e f();

    public abstract J.f g();

    public abstract int h();

    public abstract Matrix i();

    public abstract List<AbstractC1707p> j();
}
