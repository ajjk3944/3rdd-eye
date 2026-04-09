package y0;

import android.view.MotionEvent;
import java.util.List;
import o.C7028t;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8585f {

    /* renamed from: a, reason: collision with root package name */
    private final C7028t f66282a;

    /* renamed from: b, reason: collision with root package name */
    private final C8561A f66283b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66284c;

    public C8585f(C7028t c7028t, C8561A c8561a) {
        this.f66282a = c7028t;
        this.f66283b = c8561a;
    }

    public final boolean a(long j10) {
        Object obj;
        List listB = this.f66283b.b();
        int size = listB.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listB.get(i10);
            if (C8603x.d(((C8562B) obj).d(), j10)) {
                break;
            }
            i10++;
        }
        C8562B c8562b = (C8562B) obj;
        if (c8562b != null) {
            return c8562b.a();
        }
        return false;
    }

    public final C7028t b() {
        return this.f66282a;
    }

    public final MotionEvent c() {
        return this.f66283b.a();
    }

    public final boolean d() {
        return this.f66284c;
    }

    public final void e(boolean z10) {
        this.f66284c = z10;
    }
}
