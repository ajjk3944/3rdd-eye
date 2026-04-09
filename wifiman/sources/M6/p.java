package M6;

import P6.G;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.polidea.rxandroidble3.exceptions.BleScanException;
import kg.InterfaceC6468e;

/* loaded from: classes3.dex */
public abstract class p extends I6.j {

    /* renamed from: a, reason: collision with root package name */
    final G f12730a;

    class a implements InterfaceC6468e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f12731a;

        a(Object obj) {
            this.f12731a = obj;
        }

        @Override // kg.InterfaceC6468e
        public void cancel() {
            I6.q.k("Scan operation is requested to stop.", new Object[0]);
            p pVar = p.this;
            pVar.h(pVar.f12730a, this.f12731a);
        }
    }

    p(G g10) {
        this.f12730a = g10;
    }

    @Override // I6.j
    protected final void b(gg.t tVar, O6.i iVar) {
        Object objD = d(tVar);
        try {
            tVar.d(new a(objD));
            I6.q.k("Scan operation is requested to start.", new Object[0]);
            if (!g(this.f12730a, objD)) {
                tVar.c(new BleScanException(0));
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // I6.j
    protected BleException c(DeadObjectException deadObjectException) {
        return new BleScanException(1, deadObjectException);
    }

    abstract Object d(gg.t tVar);

    abstract boolean g(G g10, Object obj);

    abstract void h(G g10, Object obj);
}
