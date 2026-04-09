package n5;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import g5.InterfaceC4392b;
import java.util.concurrent.ExecutionException;
import s1.ExecutorC5546b;

/* compiled from: GmsRpc.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f44355a;

    /* renamed from: b, reason: collision with root package name */
    public final o f44356b;

    /* renamed from: c, reason: collision with root package name */
    public final Rpc f44357c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4392b<q5.f> f44358d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4392b<e5.g> f44359e;

    /* renamed from: f, reason: collision with root package name */
    public final h5.c f44360f;

    public l(B4.e eVar, o oVar, InterfaceC4392b<q5.f> interfaceC4392b, InterfaceC4392b<e5.g> interfaceC4392b2, h5.c cVar) {
        eVar.a();
        Rpc rpc = new Rpc(eVar.f487a);
        this.f44355a = eVar;
        this.f44356b = oVar;
        this.f44357c = rpc;
        this.f44358d = interfaceC4392b;
        this.f44359e = interfaceC4392b2;
        this.f44360f = cVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new ExecutorC5546b(), new D7.c(this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.l.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f44357c.send(bundle);
        } catch (InterruptedException | ExecutionException e4) {
            return Tasks.forException(e4);
        }
    }
}
