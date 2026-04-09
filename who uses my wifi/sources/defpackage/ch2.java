package defpackage;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ch2 {
    public String a;
    public q74 b;
    public o94 c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public ch2(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    public final void a() {
        try {
            String strB = ob1.n("GET_VARIATIONS_HEADER") ? c81.b() : null;
            if (strB != null && !strB.isEmpty()) {
                this.a = strB;
                byte[] bArrDecode = Base64.decode(strB, 10);
                this.b = q74.A(bArrDecode, h54.a());
                iz1 iz1Var = mz1.C9;
                tw1 tw1Var = tw1.e;
                kz1 kz1Var = tw1Var.c;
                kz1 kz1Var2 = tw1Var.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    this.c = o94.A(bArrDecode, h54.a());
                }
                if (((Boolean) kz1Var2.a(mz1.A9)).booleanValue() && ((Boolean) kz1Var2.a(mz1.z9)).booleanValue()) {
                    this.d.schedule(new fu1(20, this), ((Integer) kz1Var2.a(mz1.B9)).intValue(), TimeUnit.MINUTES);
                }
            }
        } catch (a64 e) {
            e = e;
            hg4.C.h.e("ChromeVariations", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            hg4.C.h.e("ChromeVariations", e);
        }
    }
}
