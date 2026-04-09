package C3;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC4275d;
import com.google.android.gms.common.api.internal.InterfaceC4282k;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.V;
import r3.C7566d;
import s3.AbstractC7892g;
import s3.C7889d;

/* loaded from: classes.dex */
public final class s extends AbstractC7892g {

    /* renamed from: I, reason: collision with root package name */
    private final V f2222I;

    /* renamed from: J, reason: collision with root package name */
    private final V f2223J;

    /* renamed from: K, reason: collision with root package name */
    private final V f2224K;

    /* renamed from: L, reason: collision with root package name */
    private final V f2225L;

    public s(Context context, Looper looper, C7889d c7889d, InterfaceC4275d interfaceC4275d, InterfaceC4282k interfaceC4282k) {
        super(context, looper, 23, c7889d, interfaceC4275d, interfaceC4282k);
        this.f2222I = new V();
        this.f2223J = new V();
        this.f2224K = new V();
        this.f2225L = new V();
    }

    private final boolean j0(C7566d c7566d) {
        C7566d c7566d2;
        C7566d[] c7566dArrJ = j();
        if (c7566dArrJ != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= c7566dArrJ.length) {
                    c7566d2 = null;
                    break;
                }
                c7566d2 = c7566dArrJ[i10];
                if (c7566d.b().equals(c7566d2.b())) {
                    break;
                }
                i10++;
            }
            if (c7566d2 != null && c7566d2.e() >= c7566d.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // s3.AbstractC7888c
    protected final String C() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // s3.AbstractC7888c
    protected final String D() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // s3.AbstractC7888c
    public final void K(int i10) {
        super.K(i10);
        synchronized (this.f2222I) {
            this.f2222I.clear();
        }
        synchronized (this.f2223J) {
            this.f2223J.clear();
        }
        synchronized (this.f2224K) {
            this.f2224K.clear();
        }
    }

    @Override // s3.AbstractC7888c
    public final boolean Q() {
        return true;
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public final int h() {
        return 11717000;
    }

    public final void k0(I3.n nVar, TaskCompletionSource taskCompletionSource) {
        if (j0(I3.w.f8598j)) {
            ((L) B()).F(nVar, new u(5, null, new r(taskCompletionSource), null, null));
        } else {
            taskCompletionSource.setResult(((L) B()).L(w().getPackageName()));
        }
    }

    public final void l0(I3.d dVar, TaskCompletionSource taskCompletionSource) {
        if (j0(I3.w.f8598j)) {
            ((L) B()).e0(dVar, u.b(new q(taskCompletionSource)));
        } else if (j0(I3.w.f8594f)) {
            ((L) B()).R(dVar, new q(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((L) B()).zzs());
        }
    }

    @Override // s3.AbstractC7888c
    protected final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new K(iBinder);
    }

    @Override // s3.AbstractC7888c
    public final C7566d[] t() {
        return I3.w.f8604p;
    }
}
