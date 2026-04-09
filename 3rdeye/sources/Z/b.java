package Z;

import Z.h;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.mg2;
import com.yandex.mobile.ads.impl.oh;
import java.lang.reflect.InvocationTargetException;
import v.C5664t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13896d;

    public /* synthetic */ b(Object obj, boolean z10, int i) {
        this.f13894b = i;
        this.f13896d = obj;
        this.f13895c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f13894b) {
            case 0:
                final h hVar = (h) this.f13896d;
                int iOrdinal = hVar.f13916g.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 2) {
                        throw new AssertionError("AudioSource is released");
                    }
                    return;
                }
                hVar.f13911b.set(null);
                hVar.f13912c.set(false);
                hVar.c(h.b.STARTED);
                final boolean z10 = this.f13895c;
                hVar.f13910a.execute(new Runnable() { // from class: Z.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar2 = hVar;
                        int iOrdinal2 = hVar2.f13916g.ordinal();
                        if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                throw new AssertionError("AudioSource is released");
                            }
                            return;
                        }
                        boolean z11 = hVar2.f13926r;
                        boolean z12 = z10;
                        if (z11 == z12) {
                            return;
                        }
                        hVar2.f13926r = z12;
                        if (hVar2.f13916g == h.b.STARTED) {
                            hVar2.a();
                        }
                    }
                });
                hVar.e();
                return;
            case 1:
                mg2.b((ViewGroup) this.f13896d, this.f13895c);
                return;
            case 2:
                ((oh.a) this.f13896d).a(this.f13895c);
                return;
            default:
                C5664t c5664t = (C5664t) this.f13896d;
                boolean z11 = this.f13895c;
                c5664t.f46867F = z11;
                if (z11 && c5664t.f46876f == C5664t.f.PENDING_OPEN) {
                    c5664t.J(false);
                    return;
                }
                return;
        }
    }
}
