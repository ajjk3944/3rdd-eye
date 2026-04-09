package c2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import c9.C2092m;
import c9.C2095p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueUtils.kt */
/* renamed from: c2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059i {
    public static final void a(WorkDatabase workDatabase, androidx.work.b configuration, T1.s continuation) {
        int i;
        kotlin.jvm.internal.l.f(workDatabase, "workDatabase");
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(continuation, "continuation");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayListX = C2092m.X(continuation);
        int i10 = 0;
        while (!arrayListX.isEmpty()) {
            T1.s sVar = (T1.s) C2095p.g0(arrayListX);
            List<? extends androidx.work.w> list = sVar.f12215e;
            kotlin.jvm.internal.l.e(list, "current.work");
            List<? extends androidx.work.w> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((androidx.work.w) it.next()).f17043b.f17146j.a() && (i = i + 1) < 0) {
                        C2092m.Z();
                        throw null;
                    }
                }
            }
            i10 += i;
            List<T1.s> list3 = sVar.f12218h;
            if (list3 != null) {
                arrayListX.addAll(list3);
            }
        }
        if (i10 == 0) {
            return;
        }
        int iB = workDatabase.y().B();
        int i11 = iB + i10;
        int i12 = configuration.f16875l;
        if (i11 > i12) {
            throw new IllegalArgumentException(B4.i.j(androidx.work.s.i("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i12, ";\nalready enqueued count: ", iB, ";\ncurrent enqueue operation count: "), i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }
}
