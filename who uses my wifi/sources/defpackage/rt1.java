package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rt1 extends hu1 {
    public static final zs1 i = new zs1(13);
    public final Context h;

    public rt1(jt1 jt1Var, fr1 fr1Var, int i2, Context context) {
        super(jt1Var, "yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", fr1Var, i2, 29);
        this.h = context;
    }

    @Override // defpackage.hu1
    public final void a() {
        fr1 fr1Var = this.d;
        fr1Var.b();
        ((qr1) fr1Var.g).A("E");
        Context context = this.h;
        AtomicReference atomicReferenceB = i.B(context.getPackageName());
        if (atomicReferenceB.get() == null) {
            synchronized (atomicReferenceB) {
                try {
                    if (atomicReferenceB.get() == null) {
                        atomicReferenceB.set((String) this.e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceB.get();
        fr1 fr1Var2 = this.d;
        synchronized (fr1Var2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            fr1Var2.b();
            ((qr1) fr1Var2.g).A(strEncodeToString);
        }
    }
}
