package m2;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final d2.c f23374a = new d2.c();

    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public class C0436a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2.j f23375b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UUID f23376c;

        public C0436a(d2.j jVar, UUID uuid) {
            this.f23375b = jVar;
            this.f23376c = uuid;
        }

        @Override // m2.a
        public void h() {
            WorkDatabase workDatabaseO = this.f23375b.o();
            workDatabaseO.c();
            try {
                a(this.f23375b, this.f23376c.toString());
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f23375b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2.j f23377b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23378c;

        public b(d2.j jVar, String str) {
            this.f23377b = jVar;
            this.f23378c = str;
        }

        @Override // m2.a
        public void h() {
            WorkDatabase workDatabaseO = this.f23377b.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().h(this.f23378c).iterator();
                while (it.hasNext()) {
                    a(this.f23377b, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                g(this.f23377b);
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public class c extends a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2.j f23379b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23380c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f23381d;

        public c(d2.j jVar, String str, boolean z10) {
            this.f23379b = jVar;
            this.f23380c = str;
            this.f23381d = z10;
        }

        @Override // m2.a
        public void h() {
            WorkDatabase workDatabaseO = this.f23379b.o();
            workDatabaseO.c();
            try {
                Iterator it = workDatabaseO.B().e(this.f23380c).iterator();
                while (it.hasNext()) {
                    a(this.f23379b, (String) it.next());
                }
                workDatabaseO.r();
                workDatabaseO.g();
                if (this.f23381d) {
                    g(this.f23379b);
                }
            } catch (Throwable th) {
                workDatabaseO.g();
                throw th;
            }
        }
    }

    public static a b(UUID uuid, d2.j jVar) {
        return new C0436a(jVar, uuid);
    }

    public static a c(String str, d2.j jVar, boolean z10) {
        return new c(jVar, str, z10);
    }

    public static a d(String str, d2.j jVar) {
        return new b(jVar, str);
    }

    public void a(d2.j jVar, String str) {
        f(jVar.o(), str);
        jVar.m().l(str);
        Iterator it = jVar.n().iterator();
        while (it.hasNext()) {
            ((d2.e) it.next()).a(str);
        }
    }

    public androidx.work.m e() {
        return this.f23374a;
    }

    public final void f(WorkDatabase workDatabase, String str) {
        l2.q qVarB = workDatabase.B();
        l2.b bVarT = workDatabase.t();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo$State workInfo$StateF = qVarB.f(str2);
            if (workInfo$StateF != WorkInfo$State.SUCCEEDED && workInfo$StateF != WorkInfo$State.FAILED) {
                qVarB.b(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(bVarT.a(str2));
        }
    }

    public void g(d2.j jVar) {
        d2.f.b(jVar.i(), jVar.o(), jVar.n());
    }

    public abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f23374a.a(androidx.work.m.f4528a);
        } catch (Throwable th) {
            this.f23374a.a(new m.b.a(th));
        }
    }
}
