package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/n;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ly8/s;", "onStateChanged", "(Landroidx/lifecycle/n;Landroidx/lifecycle/Lifecycle$Event;)V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f3480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.o f3482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l9.a f3483d;

    @Override // androidx.lifecycle.j
    public void onStateChanged(n source, Lifecycle.Event event) {
        Object objB;
        kotlin.jvm.internal.p.e(source, "source");
        kotlin.jvm.internal.p.e(event, "event");
        if (event != Lifecycle.Event.INSTANCE.c(this.f3480a)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f3481b.d(this);
                kotlinx.coroutines.o oVar = this.f3482c;
                Result.Companion companion = Result.INSTANCE;
                oVar.resumeWith(Result.b(kotlin.c.a(new LifecycleDestroyedException())));
                return;
            }
            return;
        }
        this.f3481b.d(this);
        kotlinx.coroutines.o oVar2 = this.f3482c;
        l9.a aVar = this.f3483d;
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(aVar.invoke());
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        oVar2.resumeWith(objB);
    }
}
