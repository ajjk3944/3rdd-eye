package C2;

import E3.m;
import H6.C0675l;
import android.app.Activity;
import android.widget.Toast;
import j6.q;
import java.util.ArrayDeque;

/* compiled from: CameraConnectionFragment.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f898c;

    public f(C0675l c0675l, W6.d dVar) {
        this.f897b = 3;
        this.f898c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f897b) {
            case 0:
                Toast.makeText((Activity) this.f898c, "Failed to configure camera", 0).show();
                break;
            case 1:
                M5.c cVar = ((M5.a) this.f898c).f4189f;
                cVar.getClass();
                N5.d dVar = new N5.d(cVar);
                N5.c cVar2 = cVar.f4201b;
                dVar.f4672a = cVar2;
                ((ArrayDeque) cVar2.f4675c).add(dVar);
                if (((N5.b) cVar2.f4676d) == null) {
                    cVar2.d();
                    break;
                }
                break;
            case 2:
                ((ThreadLocal) ((m) this.f898c).f1419e).set(Boolean.TRUE);
                break;
            case 3:
                ((W6.d) this.f898c).f13344b.clear();
                break;
            default:
                ((q.b) this.f898c).f43047b++;
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i) {
        this.f897b = i;
        this.f898c = obj;
    }
}
