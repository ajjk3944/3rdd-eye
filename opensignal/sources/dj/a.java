package dj;

import android.os.Parcel;
import android.os.Parcelable;
import br.l;
import cj.m;
import cj.n;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7385a;

    public a(ch.d dVar) {
        l.e(dVar, "serviceLocator");
        this.f7385a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.a(this.f7385a, ((a) obj).f7385a);
    }

    public final int hashCode() {
        return this.f7385a.hashCode();
    }

    @Override // cj.n
    public final void run() {
        ch.n.b("GetTasksCommand", "run() called");
        ch.d dVar = this.f7385a;
        ArrayList arrayListE = dVar.M0().e();
        Object obj = ((ConcurrentHashMap) dVar.i().f10199d).get(mk.c.GET_TASKS);
        vj.a aVar = obj instanceof vj.a ? (vj.a) obj : null;
        ch.n.b("GetTasksCommand", "getTasksBinder: " + aVar);
        if (aVar != null) {
            ch.n.b("GetTasksBinder", "onNewResult() called with: tasksList = " + arrayListE);
            m mVar = ((mk.d) aVar).f16859d;
            if (mVar != null) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.opensignal.sdk.data.task.OnTasksResultListener");
                    int size = arrayListE.size();
                    parcelObtain.writeInt(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Parcelable parcelable = (Parcelable) arrayListE.get(i10);
                        if (parcelable != null) {
                            parcelObtain.writeInt(1);
                            parcelable.writeToParcel(parcelObtain, 0);
                        } else {
                            parcelObtain.writeInt(0);
                        }
                    }
                    mVar.f3989d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }

    public final String toString() {
        return "GetTasksCommand(serviceLocator=" + this.f7385a + ')';
    }
}
