package yb;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26226a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f26227d;

    public /* synthetic */ h(i iVar, int i10) {
        this.f26226a = i10;
        this.f26227d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f26226a) {
            case 0:
                break;
            case 1:
                i iVar = this.f26227d;
                synchronized (iVar) {
                    if (iVar.f26228a == 1) {
                        iVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f26227d.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar2 = this.f26227d;
            synchronized (iVar2) {
                try {
                    if (iVar2.f26228a != 2) {
                        return;
                    }
                    if (iVar2.f26231d.isEmpty()) {
                        iVar2.c();
                        return;
                    }
                    j jVar = (j) iVar2.f26231d.poll();
                    iVar2.f26232e.put(jVar.f26234a, jVar);
                    ((ScheduledExecutorService) iVar2.f26233f.f26242c).schedule(new re.a(iVar2, 25, jVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(jVar));
                    }
                    k kVar = iVar2.f26233f;
                    Messenger messenger = iVar2.f26229b;
                    int i10 = jVar.f26236c;
                    Context context = (Context) kVar.f26241b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = jVar.f26234a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.f26237d);
                    messageObtain.setData(bundle);
                    try {
                        q3.a aVar = iVar2.f26230c;
                        Messenger messenger2 = (Messenger) aVar.f20679d;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = (zzd) aVar.f20680g;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f4804a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e4) {
                        iVar2.a(e4.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
