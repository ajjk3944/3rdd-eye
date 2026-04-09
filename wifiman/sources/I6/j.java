package I6;

import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleException;
import gg.u;

/* loaded from: classes3.dex */
public abstract class j implements M6.j {

    class a implements u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O6.i f8652a;

        a(O6.i iVar) {
            this.f8652a = iVar;
        }

        @Override // gg.u
        public void a(gg.t tVar) {
            try {
                j.this.b(tVar, this.f8652a);
            } catch (DeadObjectException e10) {
                tVar.c(j.this.c(e10));
                q.e(e10, "QueueOperation terminated with a DeadObjectException", new Object[0]);
            } catch (Throwable th2) {
                tVar.c(th2);
                q.e(th2, "QueueOperation terminated with an unexpected exception", new Object[0]);
            }
        }
    }

    @Override // M6.j
    public final gg.s N0(O6.i iVar) {
        return gg.s.o(new a(iVar));
    }

    @Override // M6.j
    public i S() {
        return i.f8649c;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(M6.j jVar) {
        return jVar.S().f8651a - S().f8651a;
    }

    protected abstract void b(gg.t tVar, O6.i iVar);

    protected abstract BleException c(DeadObjectException deadObjectException);
}
