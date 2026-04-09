package m7;

import android.graphics.PointF;
import android.opengl.GLSurfaceView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class e implements GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public static final a f53189a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public abstract float a(float f10);

    public abstract PointF b(PointF pointF);

    public abstract float[] c();

    public abstract float[] d();

    public abstract float[] e();

    public abstract float f();

    public abstract float g();

    public abstract float h();
}
