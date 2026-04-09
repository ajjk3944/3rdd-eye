package wm;

import ah.b;
import ah.c;
import android.content.Context;
import br.l;
import ch.n;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24544a;

    public a(Context context) {
        l.e(context, "context");
        this.f24544a = context;
    }

    public final void a(b bVar) {
        l.e(bVar, "listener");
        ch.l lVar = ch.l.f3962t5;
        if (lVar.F().f3943c) {
            Context context = this.f24544a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            l.c(applicationContext, "null cannot be cast to non-null type android.content.Context");
            if (lVar.f3775a == null) {
                lVar.f3775a = applicationContext;
            }
            c cVar = new c(context, bVar);
            if (lVar.R4 == null) {
                lVar.R4 = new ai.c(lVar.F(), lVar.I());
            }
            ai.c cVar2 = lVar.R4;
            if (cVar2 == null) {
                l.l("_assistantBroadcastReceiver");
                throw null;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar2.f384e;
            if (copyOnWriteArrayList.contains(cVar)) {
                n.g("AssistantBroadcastReceiver", "addInternalListener() InternalAssistantListener already added = " + cVar);
            } else {
                n.b("AssistantBroadcastReceiver", "addInternalListener() adding " + cVar);
                copyOnWriteArrayList.add(cVar);
                cVar2.a(applicationContext);
            }
            lVar.I().execute(new ah.a(context, 0));
        }
    }
}
