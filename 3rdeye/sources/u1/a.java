package U1;

import A9.C0583j;
import android.os.Bundle;
import androidx.work.m;
import b2.C1842w;
import b9.n;
import java.util.concurrent.CancellationException;
import s.BinderC5541e;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12351d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.f12349b = i;
        this.f12351d = obj;
        this.f12350c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f12350c;
        Object obj2 = this.f12351d;
        switch (this.f12349b) {
            case 0:
                m mVarE = m.e();
                String str = b.f12352e;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                C1842w c1842w = (C1842w) obj;
                sb.append(c1842w.f17138a);
                mVarE.a(str, sb.toString());
                ((b) obj2).f12353a.b(c1842w);
                break;
            case 1:
                C0583j c0583j = (C0583j) obj;
                try {
                    c0583j.resumeWith(((A4.a) obj2).get());
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        c0583j.m(cause);
                        return;
                    } else {
                        c0583j.resumeWith(n.a(cause));
                        return;
                    }
                }
            default:
                ((BinderC5541e) obj2).f45882c.onMinimized((Bundle) obj);
                break;
        }
    }

    public a(C0583j c0583j, A4.a aVar) {
        this.f12349b = 1;
        this.f12350c = c0583j;
        this.f12351d = aVar;
    }
}
