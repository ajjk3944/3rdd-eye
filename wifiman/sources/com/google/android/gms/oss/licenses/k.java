package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e2.AbstractC5413a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
final class k extends AbstractC5413a {

    /* renamed from: o, reason: collision with root package name */
    private List f36947o;

    /* renamed from: p, reason: collision with root package name */
    private final b f36948p;

    k(Context context, b bVar) {
        super(context.getApplicationContext());
        this.f36948p = bVar;
    }

    @Override // e2.AbstractC5413a
    public final /* bridge */ /* synthetic */ Object B() throws NumberFormatException {
        ArrayList arrayListB = G3.f.b(i(), K3.c.f10273a);
        j jVarC = this.f36948p.c();
        Task taskG = jVarC.g(new i(jVarC, arrayListB));
        try {
            Tasks.await(taskG);
            return taskG.isSuccessful() ? (List) taskG.getResult() : arrayListB;
        } catch (InterruptedException | ExecutionException e10) {
            Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e10.getMessage())));
            return arrayListB;
        }
    }

    @Override // e2.AbstractC5414b
    public final /* synthetic */ void f(Object obj) {
        List list = (List) obj;
        this.f36947o = list;
        super.f(list);
    }

    @Override // e2.AbstractC5414b
    protected final void p() {
        List list = this.f36947o;
        if (list != null) {
            super.f(list);
        } else {
            h();
        }
    }

    @Override // e2.AbstractC5414b
    protected final void q() {
        b();
    }
}
