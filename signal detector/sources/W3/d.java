package W3;

import S3.o;
import X3.h;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends X3.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, c3.f fVar, Object obj2, int i) {
        super(fVar);
        this.f4026b = i;
        this.f4028d = obj;
        this.f4027c = obj2;
    }

    @Override // X3.f
    public final void a() throws RemoteException {
        X3.d bVar;
        int i = this.f4026b;
        Object obj = this.f4027c;
        Object obj2 = this.f4028d;
        int i3 = 0;
        switch (i) {
            case 0:
                c3.f fVar = (c3.f) obj;
                f fVar2 = (f) obj2;
                try {
                    fVar2.f4033a.f4190m.n2(fVar2.f4034b, g.a(), new e(fVar2, fVar));
                    break;
                } catch (RemoteException e6) {
                    X3.e eVar = f.f4032c;
                    Object[] objArr = {fVar2.f4034b};
                    eVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", X3.e.e(eVar.f4174b, "error requesting in-app review for %s", objArr), e6);
                    }
                    fVar.a(new RuntimeException(e6));
                    return;
                }
            case 1:
                h hVar = (h) obj2;
                d dVar = (d) obj;
                X3.d dVar2 = hVar.f4190m;
                X3.e eVar2 = hVar.f4180b;
                ArrayList arrayList = hVar.f4182d;
                if (dVar2 == null && !hVar.f4185g) {
                    eVar2.c("Initiate binding to the service.", new Object[0]);
                    arrayList.add(dVar);
                    o oVar = new o(1, hVar);
                    hVar.f4189l = oVar;
                    hVar.f4185g = true;
                    if (!hVar.f4179a.bindService(hVar.f4186h, oVar, 1)) {
                        eVar2.c("Failed to bind to the service.", new Object[0]);
                        hVar.f4185g = false;
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            J0.c cVar = new J0.c("Failed to bind to the service.");
                            c3.f fVar3 = ((X3.f) obj3).f4175a;
                            if (fVar3 != null) {
                                fVar3.a(cVar);
                            }
                        }
                        arrayList.clear();
                        break;
                    }
                } else if (!hVar.f4185g) {
                    dVar.run();
                    break;
                } else {
                    eVar2.c("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(dVar);
                    break;
                }
                break;
            default:
                h hVar2 = (h) ((o) obj2).f3497b;
                IBinder iBinder = (IBinder) obj;
                int i6 = X3.c.f4172b;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof X3.d ? (X3.d) iInterfaceQueryLocalInterface : new X3.b(iBinder);
                }
                hVar2.f4190m = bVar;
                hVar2.f4180b.c("linkToDeath", new Object[0]);
                try {
                    hVar2.f4190m.asBinder().linkToDeath(hVar2.f4187j, 0);
                } catch (RemoteException e7) {
                    X3.e eVar3 = hVar2.f4180b;
                    Object[] objArr2 = new Object[0];
                    eVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", X3.e.e(eVar3.f4174b, "linkToDeath failed", objArr2), e7);
                    }
                }
                hVar2.f4185g = false;
                ArrayList arrayList2 = hVar2.f4182d;
                int size2 = arrayList2.size();
                while (i3 < size2) {
                    Object obj4 = arrayList2.get(i3);
                    i3++;
                    ((Runnable) obj4).run();
                }
                hVar2.f4182d.clear();
                break;
        }
    }

    public d(o oVar, IBinder iBinder) {
        this.f4026b = 2;
        this.f4028d = oVar;
        this.f4027c = iBinder;
    }
}
