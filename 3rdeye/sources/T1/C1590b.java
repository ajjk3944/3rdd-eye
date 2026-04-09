package T1;

import w1.k;

/* compiled from: WorkDatabase.kt */
/* renamed from: T1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590b extends k.b {

    /* renamed from: a, reason: collision with root package name */
    public final B7.d f12166a;

    public C1590b(B7.d clock) {
        kotlin.jvm.internal.l.f(clock, "clock");
        this.f12166a = clock;
    }

    @Override // w1.k.b
    public final void a(F1.b db) {
        kotlin.jvm.internal.l.f(db, "db");
        db.r();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f12166a.getClass();
            sb.append(System.currentTimeMillis() - u.f12221a);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.C(sb.toString());
            db.u();
        } finally {
            db.v();
        }
    }
}
