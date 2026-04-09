package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/j;", "", "Landroidx/lifecycle/f;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/f;)V", "Landroidx/lifecycle/n;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ly8/s;", "onStateChanged", "(Landroidx/lifecycle/n;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "[Landroidx/lifecycle/f;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final f[] generatedAdapters;

    public CompositeGeneratedAdaptersObserver(f[] generatedAdapters) {
        kotlin.jvm.internal.p.e(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.lifecycle.j
    public void onStateChanged(n source, Lifecycle.Event event) {
        kotlin.jvm.internal.p.e(source, "source");
        kotlin.jvm.internal.p.e(event, "event");
        new s();
        f[] fVarArr = this.generatedAdapters;
        if (fVarArr.length > 0) {
            f fVar = fVarArr[0];
            throw null;
        }
        if (fVarArr.length <= 0) {
            return;
        }
        f fVar2 = fVarArr[0];
        throw null;
    }
}
