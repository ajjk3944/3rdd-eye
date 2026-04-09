package e7;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import t6.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public u f22433a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f22435c;

    /* renamed from: d, reason: collision with root package name */
    public int f22436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConstraintTrackingWorker constraintTrackingWorker, ek.c cVar) {
        super(cVar);
        this.f22435c = constraintTrackingWorker;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f22434b = obj;
        this.f22436d |= LinearLayoutManager.INVALID_OFFSET;
        return ConstraintTrackingWorker.c(this.f22435c, this);
    }
}
