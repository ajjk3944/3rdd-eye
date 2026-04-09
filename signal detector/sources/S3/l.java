package S3;

import android.os.IBinder;
import android.os.RemoteException;
import b4.AbstractRunnableC0359x;
import b4.C0339d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3491b;

    public /* synthetic */ l(int i, Object obj) {
        this.f3490a = i;
        this.f3491b = obj;
    }

    private final void a() {
        p pVar = (p) this.f3491b;
        int i = 0;
        pVar.f3500b.f("reportBinderDeath", new Object[0]);
        if (pVar.i.get() != null) {
            throw new ClassCastException();
        }
        pVar.f3500b.f("%s : Binder has died.", pVar.f3501c);
        ArrayList arrayList = pVar.f3502d;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RemoteException remoteException = new RemoteException(String.valueOf(pVar.f3501c).concat(" : Binder has died."));
            c3.f fVar = ((k) obj).f3489a;
            if (fVar != null) {
                fVar.a(remoteException);
            }
        }
        pVar.f3502d.clear();
        synchronized (pVar.f3504f) {
            pVar.d();
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = 0;
        switch (this.f3490a) {
            case 0:
                a();
                return;
            case 1:
                X3.h hVar = (X3.h) this.f3491b;
                String str = hVar.f4181c;
                X3.e eVar = hVar.f4180b;
                eVar.c("reportBinderDeath", new Object[0]);
                if (hVar.i.get() != null) {
                    throw new ClassCastException();
                }
                eVar.c("%s : Binder has died.", str);
                ArrayList arrayList = hVar.f4182d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    c3.f fVar = ((X3.f) obj).f4175a;
                    if (fVar != null) {
                        fVar.a(remoteException);
                    }
                }
                arrayList.clear();
                hVar.b();
                return;
            default:
                C0339d c0339d = (C0339d) this.f3491b;
                c0339d.f5738b.c("reportBinderDeath", new Object[0]);
                if (c0339d.i.get() != null) {
                    throw new ClassCastException();
                }
                c0339d.f5738b.c("%s : Binder has died.", c0339d.f5739c);
                ArrayList arrayList2 = c0339d.f5740d;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    RemoteException remoteException2 = new RemoteException(String.valueOf(c0339d.f5739c).concat(" : Binder has died."));
                    c3.f fVar2 = ((AbstractRunnableC0359x) obj2).f5778a;
                    if (fVar2 != null) {
                        fVar2.a(remoteException2);
                    }
                }
                c0339d.f5740d.clear();
                synchronized (c0339d.f5742f) {
                    c0339d.d();
                }
                return;
        }
    }
}
