package v;

import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.U0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* renamed from: v.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5662q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5664t f46828c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H0 f46830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T0 f46831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ L0 f46832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f46833h;

    public /* synthetic */ RunnableC5662q(C5664t c5664t, String str, H0 h02, T0 t02, L0 l02, List list, int i) {
        this.f46827b = i;
        this.f46828c = c5664t;
        this.f46829d = str;
        this.f46830e = h02;
        this.f46831f = t02;
        this.f46832g = l02;
        this.f46833h = list;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f46827b) {
            case 0:
                C5664t c5664t = this.f46828c;
                String str = this.f46829d;
                H0 h02 = this.f46830e;
                T0<?> t02 = this.f46831f;
                L0 l02 = this.f46832g;
                List<U0.b> list = this.f46833h;
                c5664t.getClass();
                c5664t.u("Use case " + str + " RESET", null);
                c5664t.f46872b.e(str, h02, t02, l02, list);
                c5664t.q();
                c5664t.E();
                c5664t.L();
                if (c5664t.f46876f == C5664t.f.OPENED) {
                    c5664t.C();
                    break;
                }
                break;
            default:
                C5664t c5664t2 = this.f46828c;
                c5664t2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str2 = this.f46829d;
                sb.append(str2);
                sb.append(" UPDATED");
                c5664t2.u(sb.toString(), null);
                c5664t2.f46872b.e(str2, this.f46830e, this.f46831f, this.f46832g, (ArrayList) this.f46833h);
                c5664t2.L();
                break;
        }
    }
}
