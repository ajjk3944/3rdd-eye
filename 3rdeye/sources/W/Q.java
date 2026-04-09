package W;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.camera.core.impl.C1717u0;
import androidx.camera.core.impl.Q0;
import com.applovin.impl.B1;
import com.applovin.impl.C2158z0;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13183g;

    public /* synthetic */ Q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f13178b = i;
        this.f13179c = obj;
        this.f13180d = obj2;
        this.f13181e = obj3;
        this.f13182f = obj4;
        this.f13183g = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13178b) {
            case 0:
                T t10 = (T) this.f13179c;
                androidx.camera.core.impl.J jB = t10.b();
                androidx.camera.core.impl.J j4 = (androidx.camera.core.impl.J) this.f13181e;
                if (j4 == jB) {
                    t10.f13195u = ((N.s) this.f13180d).d(j4, true);
                    Z z10 = (Z) ((C1717u0) ((X.a) this.f13182f).getConfig()).b(X.a.f13413H);
                    Objects.requireNonNull(z10);
                    z10.b(t10.f13195u, (Q0) this.f13183g);
                    t10.M();
                    break;
                }
                break;
            default:
                ((C2158z0) this.f13179c).a((View) this.f13180d, (FrameLayout) this.f13181e, (ViewTreeObserver) this.f13182f, (B1) this.f13183g);
                break;
        }
    }
}
