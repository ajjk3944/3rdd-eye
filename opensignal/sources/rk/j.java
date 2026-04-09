package rk;

import android.os.AsyncTask;
import com.google.android.gms.internal.measurement.h4;
import java.lang.ref.WeakReference;
import lq.b0;

/* loaded from: classes.dex */
public final class j extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21634a = 2;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f21635b;

    public /* synthetic */ j() {
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01e3  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.j.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        switch (this.f21634a) {
            case 0:
                super.onPostExecute((b0) obj);
                k kVar = (k) this.f21635b.get();
                if (kVar != null) {
                    h4 h4Var = kVar.f21640e;
                    h4Var.f5055a = !h4Var.f5056d.isEmpty();
                    jm.e eVar = kVar.f21636a;
                    if (h4Var.f5056d.isEmpty()) {
                        eVar.h0();
                    } else {
                        Object obj2 = h4Var.f5056d;
                        eVar.j0();
                        mm.d dVar = eVar.B0;
                        dVar.getClass();
                        dVar.f16884f = obj2;
                        dVar.f10189a.b();
                    }
                    eVar.i0(h4Var);
                    break;
                }
                break;
            case 1:
                super.onPostExecute((b0) obj);
                p pVar = (p) this.f21635b.get();
                if (pVar != null) {
                    h4 h4Var2 = pVar.f21655e;
                    h4Var2.f5055a = false;
                    jm.e eVar2 = pVar.f21651a;
                    if (h4Var2.f5057g.isEmpty()) {
                        eVar2.h0();
                    } else {
                        Object obj3 = h4Var2.f5057g;
                        eVar2.j0();
                        mm.d dVar2 = eVar2.C0;
                        dVar2.getClass();
                        dVar2.f16884f = obj3;
                        dVar2.f10189a.b();
                    }
                    eVar2.i0(h4Var2);
                    break;
                }
                break;
            default:
                super.onPostExecute(obj);
                break;
        }
    }

    public j(k kVar) {
        this.f21635b = new WeakReference(kVar);
    }

    public j(p pVar) {
        this.f21635b = new WeakReference(pVar);
    }
}
