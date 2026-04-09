package d5;

import android.util.Pair;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ Object B;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7027a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7028d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7029g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IOException f7030r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f7031x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7032y;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z10, int i10) {
        this.f7027a = i10;
        this.f7032y = obj;
        this.B = obj2;
        this.f7028d = obj3;
        this.f7029g = obj4;
        this.f7030r = iOException;
        this.f7031x = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7027a) {
            case 0:
                bm.e eVar = (bm.e) this.f7032y;
                Pair pair = (Pair) this.B;
                ((AnalyticsCollector) ((o0) eVar.f2831g).f7052i).onLoadError(((Integer) pair.first).intValue(), (o5.z) pair.second, (o5.q) this.f7028d, (o5.v) this.f7029g, this.f7030r, this.f7031x);
                break;
            case 1:
                o5.e0 e0Var = (o5.e0) this.f7032y;
                ((o5.f0) this.B).onLoadError(e0Var.f18922a, e0Var.f18923b, (o5.q) this.f7028d, (o5.v) this.f7029g, this.f7030r, this.f7031x);
                break;
            default:
                ya.a0 a0Var = (ya.a0) this.f7032y;
                ((ya.b0) this.B).onLoadError(a0Var.f26035a, a0Var.f26036b, (ya.m) this.f7028d, (ya.r) this.f7029g, this.f7030r, this.f7031x);
                break;
        }
    }
}
