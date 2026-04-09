package W0;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class f {
    public static void a(H0.c cVar) {
        cVar.a();
        try {
            int i = WorkDatabase.f5675l;
            cVar.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f5674k) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            cVar.q();
        } finally {
            cVar.e();
        }
    }
}
