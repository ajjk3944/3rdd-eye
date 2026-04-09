package cj;

import com.opensignal.sdk.data.task.ExecutingJobService;

/* loaded from: classes.dex */
public final class j extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public ExecutingJobService f3987g;

    @Override // androidx.lifecycle.o
    public final void Z0(androidx.lifecycle.o oVar) {
        i iVar = (i) oVar;
        br.l.e(iVar, "commandParameters");
        ExecutingJobService executingJobService = this.f3987g;
        if (executingJobService != null) {
            executingJobService.jobFinished(iVar.f3986g, false);
        }
    }
}
