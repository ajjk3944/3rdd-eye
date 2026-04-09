package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.f;
import androidx.work.d;
import androidx.work.impl.a;
import d2.h;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import l2.e;
import l2.g;
import l2.j;
import l2.k;
import l2.m;
import l2.n;
import l2.p;
import l2.q;
import l2.s;
import l2.t;
import l2.v;
import u1.c;

@TypeConverters({d.class, v.class})
@Database(entities = {l2.a.class, p.class, s.class, g.class, j.class, m.class, l2.d.class}, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: l, reason: collision with root package name */
    public static final long f4381l = TimeUnit.DAYS.toMillis(1);

    public class a implements c.InterfaceC0488c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f4382a;

        public a(Context context) {
            this.f4382a = context;
        }

        @Override // u1.c.InterfaceC0488c
        public c a(c.b bVar) {
            c.b.a aVarA = c.b.a(this.f4382a);
            aVarA.c(bVar.f24489b).b(bVar.f24490c).d(true);
            return new v1.c().a(aVarA.a());
        }
    }

    public class b extends RoomDatabase.b {
        @Override // androidx.room.RoomDatabase.b
        public void c(u1.b bVar) {
            super.c(bVar);
            bVar.u();
            try {
                bVar.y(WorkDatabase.w());
                bVar.B();
            } finally {
                bVar.E();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        RoomDatabase.a aVarA;
        if (z10) {
            aVarA = f.c(context, WorkDatabase.class).c();
        } else {
            aVarA = f.a(context, WorkDatabase.class, h.d());
            aVarA.f(new a(context));
        }
        return (WorkDatabase) aVarA.g(executor).a(u()).b(androidx.work.impl.a.f4391a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f4392b).b(androidx.work.impl.a.f4393c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f4394d).b(androidx.work.impl.a.f4395e).b(androidx.work.impl.a.f4396f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f4397g).e().d();
    }

    public static RoomDatabase.b u() {
        return new b();
    }

    public static long v() {
        return System.currentTimeMillis() - f4381l;
    }

    public static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract l2.b t();

    public abstract e x();

    public abstract l2.h y();

    public abstract k z();
}
