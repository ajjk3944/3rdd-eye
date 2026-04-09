package m2;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class q implements androidx.work.n {

    /* renamed from: c, reason: collision with root package name */
    public static final String f23424c = androidx.work.k.f("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f23425a;

    /* renamed from: b, reason: collision with root package name */
    public final o2.a f23426b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ UUID f23427a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.work.d f23428b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n2.a f23429c;

        public a(UUID uuid, androidx.work.d dVar, n2.a aVar) {
            this.f23427a = uuid;
            this.f23428b = dVar;
            this.f23429c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.p pVarG;
            String string = this.f23427a.toString();
            androidx.work.k kVarC = androidx.work.k.c();
            String str = q.f23424c;
            kVarC.a(str, String.format("Updating progress for %s (%s)", this.f23427a, this.f23428b), new Throwable[0]);
            q.this.f23425a.c();
            try {
                pVarG = q.this.f23425a.B().g(string);
            } finally {
                try {
                } finally {
                }
            }
            if (pVarG == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (pVarG.f23093b == WorkInfo$State.RUNNING) {
                q.this.f23425a.A().c(new l2.m(string, this.f23428b));
            } else {
                androidx.work.k.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f23429c.o(null);
            q.this.f23425a.r();
        }
    }

    public q(WorkDatabase workDatabase, o2.a aVar) {
        this.f23425a = workDatabase;
        this.f23426b = aVar;
    }

    @Override // androidx.work.n
    public com.google.common.util.concurrent.a a(Context context, UUID uuid, androidx.work.d dVar) {
        n2.a aVarS = n2.a.s();
        this.f23426b.b(new a(uuid, dVar, aVarS));
        return aVarS;
    }
}
