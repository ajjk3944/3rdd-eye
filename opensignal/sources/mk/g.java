package mk;

import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ar.k;
import ch.n;
import cj.h;
import cj.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class g extends Binder implements vj.d, h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f16866h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final df.c f16867d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f16868e;

    /* renamed from: f, reason: collision with root package name */
    public String f16869f;

    /* renamed from: g, reason: collision with root package name */
    public long f16870g;

    public g(df.c cVar) {
        attachInterface(this, "com.opensignal.sdk.data.task.JobResultTestIBinder");
        this.f16867d = cVar;
        this.f16868e = new CopyOnWriteArrayList();
        this.f16869f = "";
    }

    @Override // cj.h
    public final void J(l lVar) {
        synchronized (this.f16868e) {
            n.b("JsonJobResultBinder", "removeListener");
            n.b("JsonJobResultBinder", "Before total listeners: " + this.f16868e.size());
            this.f16868e.remove(lVar);
            n.b("JsonJobResultBinder", "After total listeners: " + this.f16868e.size());
        }
    }

    @Override // cj.h
    public final void P(l lVar) {
        n.b("JsonJobResultBinder", "addListener() called with: listener = " + lVar);
        synchronized (this.f16868e) {
            if (lVar != null) {
                try {
                    if (!this.f16868e.contains(lVar)) {
                        this.f16868e.add(lVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n.b("JsonJobResultBinder", "After Add listeners: " + this.f16868e.size());
        }
    }

    public final void d(k kVar) {
        synchronized (this.f16868e) {
            try {
                Iterator it = this.f16868e.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    br.l.b(lVar);
                    kVar.a(lVar);
                }
            } catch (DeadObjectException e4) {
                n.b("JsonJobResultBinder", e4, "Main process died");
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("com.opensignal.sdk.data.task.JobResultTestIBinder");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("com.opensignal.sdk.data.task.JobResultTestIBinder");
            return true;
        }
        l lVar = null;
        l lVar2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.opensignal.sdk.data.task.OnJobResultTestListener");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) {
                    cj.k kVar = new cj.k();
                    kVar.f3988d = strongBinder;
                    lVar = kVar;
                } else {
                    lVar = (l) iInterfaceQueryLocalInterface;
                }
            }
            P(lVar);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 2) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.opensignal.sdk.data.task.OnJobResultTestListener");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof l)) {
                cj.k kVar2 = new cj.k();
                kVar2.f3988d = strongBinder2;
                lVar2 = kVar2;
            } else {
                lVar2 = (l) iInterfaceQueryLocalInterface2;
            }
        }
        J(lVar2);
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
