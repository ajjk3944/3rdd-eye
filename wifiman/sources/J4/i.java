package j4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* loaded from: classes3.dex */
final class i extends k4.j {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f50121b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f50122c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(l lVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f50121b = taskCompletionSource2;
        this.f50122c = lVar;
    }

    @Override // k4.j
    protected final void a() {
        try {
            k4.f fVar = (k4.f) this.f50122c.f50127a.e();
            String str = this.f50122c.f50128b;
            Bundle bundle = new Bundle();
            Map mapA = m.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            l lVar = this.f50122c;
            fVar.m(str, bundle, new k(lVar, this.f50121b, lVar.f50128b));
        } catch (RemoteException e10) {
            l.f50126c.b(e10, "error requesting in-app review for %s", this.f50122c.f50128b);
            this.f50121b.trySetException(new RuntimeException(e10));
        }
    }
}
