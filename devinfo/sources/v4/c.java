package v4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import ig.l;
import java.util.ArrayList;
import km.i;
import km.o;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f35820i = new ThreadLocal();

    /* renamed from: e, reason: collision with root package name */
    public final o f35825e;

    /* renamed from: h, reason: collision with root package name */
    public b f35827h;

    /* renamed from: a, reason: collision with root package name */
    public final n0 f35821a = new n0(0);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f35822b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final i f35823c = new i(25, this);

    /* renamed from: d, reason: collision with root package name */
    public final l f35824d = new l(19, this);

    /* renamed from: f, reason: collision with root package name */
    public boolean f35826f = false;
    public float g = 1.0f;

    public c(o oVar) {
        this.f35825e = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, v4.a] */
    public final void a(e eVar) {
        ArrayList arrayList = this.f35822b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f35825e.f28445a).postFrameCallback(new r5.f(this.f35824d));
            if (Build.VERSION.SDK_INT >= 33) {
                this.g = ValueAnimator.getDurationScale();
                if (this.f35827h == null) {
                    this.f35827h = new b(this);
                }
                final b bVar = this.f35827h;
                if (bVar.f35818a == null) {
                    ?? r22 = new ValueAnimator.DurationScaleChangeListener() { // from class: v4.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f10) {
                            bVar.f35819b.g = f10;
                        }
                    };
                    bVar.f35818a = r22;
                    ValueAnimator.registerDurationScaleChangeListener(r22);
                }
            }
        }
        if (arrayList.contains(eVar)) {
            return;
        }
        arrayList.add(eVar);
    }
}
