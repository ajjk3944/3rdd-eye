package o6;

import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.AbstractC6492s;
import p6.AbstractC7230a;
import p6.C7233d;
import p6.C7234e;
import u6.InterfaceC8137b;

/* renamed from: o6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7094e {

    /* renamed from: a, reason: collision with root package name */
    public static final C7094e f55502a;

    /* renamed from: b, reason: collision with root package name */
    private static final C7233d f55503b;

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC7092c f55504c;

    /* renamed from: o6.e$a */
    public static final class a implements InterfaceC7092c {
        a() {
        }

        @Override // o6.InterfaceC7092c
        public void a(InterfaceC8137b context, Paint paint, Path path, float f10, float f11, float f12, float f13) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(paint, "paint");
            AbstractC6492s.i(path, "path");
            path.moveTo(f10, f11);
            path.lineTo(f12, f11);
            path.lineTo(f12, f13);
            path.lineTo(f10, f13);
            path.close();
            context.d().drawPath(path, paint);
        }
    }

    static {
        C7094e c7094e = new C7094e();
        f55502a = c7094e;
        f55503b = c7094e.c(50);
        f55504c = new a();
    }

    private C7094e() {
    }

    public final C7233d a() {
        return f55503b;
    }

    public final InterfaceC7092c b() {
        return f55504c;
    }

    public final C7233d c(int i10) {
        return d(i10, i10, i10, i10);
    }

    public final C7233d d(int i10, int i11, int i12, int i13) {
        C7234e c7234e = C7234e.f57693a;
        return new C7233d(new AbstractC7230a.b(i10, c7234e), new AbstractC7230a.b(i11, c7234e), new AbstractC7230a.b(i12, c7234e), new AbstractC7230a.b(i13, c7234e));
    }
}
