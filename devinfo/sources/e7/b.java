package e7;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f22430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f22431b;

    /* renamed from: c, reason: collision with root package name */
    public int f22432c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintTrackingWorker constraintTrackingWorker, ek.c cVar) {
        super(cVar);
        this.f22431b = constraintTrackingWorker;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f22430a = obj;
        this.f22432c |= LinearLayoutManager.INVALID_OFFSET;
        return ConstraintTrackingWorker.b(this.f22431b, null, null, null, this);
    }
}
