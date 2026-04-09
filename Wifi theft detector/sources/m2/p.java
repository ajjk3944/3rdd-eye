package m2;

import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public class p implements androidx.work.f {

    /* renamed from: d, reason: collision with root package name */
    public static final String f23415d = androidx.work.k.f("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final o2.a f23416a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.a f23417b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.q f23418c;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n2.a f23419a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ UUID f23420b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.work.e f23421c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f23422d;

        public a(n2.a aVar, UUID uuid, androidx.work.e eVar, Context context) {
            this.f23419a = aVar;
            this.f23420b = uuid;
            this.f23421c = eVar;
            this.f23422d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f23419a.isCancelled()) {
                    String string = this.f23420b.toString();
                    WorkInfo$State workInfo$StateF = p.this.f23418c.f(string);
                    if (workInfo$StateF == null || workInfo$StateF.d()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    p.this.f23417b.b(string, this.f23421c);
                    this.f23422d.startService(androidx.work.impl.foreground.a.a(this.f23422d, string, this.f23421c));
                }
                this.f23419a.o(null);
            } catch (Throwable th) {
                this.f23419a.p(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, k2.a aVar, o2.a aVar2) {
        this.f23417b = aVar;
        this.f23416a = aVar2;
        this.f23418c = workDatabase.B();
    }

    @Override // androidx.work.f
    public com.google.common.util.concurrent.a a(Context context, UUID uuid, androidx.work.e eVar) {
        n2.a aVarS = n2.a.s();
        this.f23416a.b(new a(aVarS, uuid, eVar, context));
        return aVarS;
    }
}
