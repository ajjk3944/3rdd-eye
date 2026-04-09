package n5;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import n5.ServiceConnectionC5363F;
import n5.h;
import s1.ExecutorC5546b;

/* compiled from: WithinAppServiceBinder.java */
/* renamed from: n5.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC5362E extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public final h.a f44307b;

    public BinderC5362E(h.a aVar) {
        this.f44307b = aVar;
    }

    public final void a(ServiceConnectionC5363F.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = aVar.f44314a;
        h.a aVar2 = this.f44307b;
        aVar2.getClass();
        int i = h.f44342g;
        h hVar = h.this;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.f44343b.execute(new J4.h(hVar, intent, taskCompletionSource, 20));
        taskCompletionSource.getTask().addOnCompleteListener(new ExecutorC5546b(), new B.d(aVar, 22));
    }
}
