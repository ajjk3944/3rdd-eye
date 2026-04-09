package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/v;", "<init>", "()V", "androidx/lifecycle/g0", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements v {
    public static final ProcessLifecycleOwner E = new ProcessLifecycleOwner();

    /* renamed from: a, reason: collision with root package name */
    public int f1465a;

    /* renamed from: d, reason: collision with root package name */
    public int f1466d;

    /* renamed from: x, reason: collision with root package name */
    public Handler f1469x;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1467g = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1468r = true;

    /* renamed from: y, reason: collision with root package name */
    public final x f1470y = new x(this);
    public final f0 B = new f0(0, this);
    public final b9.c D = new b9.c(4, this);

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i10 = this.f1466d + 1;
        this.f1466d = i10;
        if (i10 == 1) {
            if (this.f1467g) {
                this.f1470y.v1(m.ON_RESUME);
                this.f1467g = false;
            } else {
                Handler handler = this.f1469x;
                br.l.b(handler);
                handler.removeCallbacks(this.B);
            }
        }
    }

    @Override // androidx.lifecycle.v
    public final o h() {
        return this.f1470y;
    }
}
