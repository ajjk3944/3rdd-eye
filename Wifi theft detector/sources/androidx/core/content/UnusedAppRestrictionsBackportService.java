package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import g0.b;
import h0.d;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public b.a f2488a = new a();

    public class a extends b.a {
        public a() {
        }

        @Override // g0.b
        public void d(g0.a aVar) {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.a(new d(aVar));
        }
    }

    public abstract void a(d dVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2488a;
    }
}
