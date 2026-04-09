package c7;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2780c;

    public /* synthetic */ e(Object obj, int i4, int i10) {
        this.f2778a = i10;
        this.f2780c = obj;
        this.f2779b = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2778a) {
            case 0:
                WorkDatabase workDatabase = (WorkDatabase) ((o7.c) this.f2780c).f30419b;
                Long lA = workDatabase.s().a("next_job_scheduler_id");
                int i4 = 0;
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                workDatabase.s().b(new b7.f("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                if (iLongValue < 0 || iLongValue > this.f2779b) {
                    workDatabase.s().b(new b7.f("next_job_scheduler_id", Long.valueOf(1)));
                } else {
                    i4 = iLongValue;
                }
                return Integer.valueOf(i4);
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f2780c;
                boolean z3 = lottieAnimationView.f2983m;
                int i10 = this.f2779b;
                if (!z3) {
                    return f7.o.f(lottieAnimationView.getContext(), i10, null);
                }
                Context context = lottieAnimationView.getContext();
                return f7.o.f(context, i10, f7.o.k(i10, context));
        }
    }
}
