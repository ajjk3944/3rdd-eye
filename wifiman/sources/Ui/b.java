package Ui;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.J;
import Yg.u;
import Yg.v;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class b {

    static final class a implements OnCompleteListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f22934a;

        a(InterfaceC3069n interfaceC3069n) {
            this.f22934a = interfaceC3069n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC3069n interfaceC3069n = this.f22934a;
                u.a aVar = u.f25017b;
                interfaceC3069n.resumeWith(u.c(v.a(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC3069n.a.a(this.f22934a, null, 1, null);
                    return;
                }
                InterfaceC3069n interfaceC3069n2 = this.f22934a;
                u.a aVar2 = u.f25017b;
                interfaceC3069n2.resumeWith(u.c(task.getResult()));
            }
        }
    }

    /* renamed from: Ui.b$b, reason: collision with other inner class name */
    static final class C0837b implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f22935a;

        C0837b(CancellationTokenSource cancellationTokenSource) {
            this.f22935a = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f22935a.cancel();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public static final Object a(Task task, InterfaceC5380e interfaceC5380e) {
        return b(task, null, interfaceC5380e);
    }

    private static final Object b(Task task, CancellationTokenSource cancellationTokenSource, InterfaceC5380e interfaceC5380e) throws Exception {
        if (!task.isComplete()) {
            C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
            c3073p.A();
            task.addOnCompleteListener(Ui.a.f22933a, new a(c3073p));
            if (cancellationTokenSource != null) {
                c3073p.B(new C0837b(cancellationTokenSource));
            }
            Object objU = c3073p.u();
            if (objU == AbstractC5467b.g()) {
                h.c(interfaceC5380e);
            }
            return objU;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
