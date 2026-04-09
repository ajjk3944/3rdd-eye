package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137f7 extends AbstractCallableC1676p7 {
    public static final L6 i = new L6(6);

    /* renamed from: h, reason: collision with root package name */
    public final Context f14030h;

    public C1137f7(X6 x6, S5 s5, int i3, Context context) {
        super(x6, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", s5, i3, 29);
        this.f14030h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC1676p7
    public final void a() {
        S5 s5 = this.f16133d;
        s5.b();
        ((C1136f6) s5.f13551b).A("E");
        Context context = this.f14030h;
        AtomicReference atomicReferenceL = i.l(context.getPackageName());
        if (atomicReferenceL.get() == null) {
            synchronized (atomicReferenceL) {
                try {
                    if (atomicReferenceL.get() == null) {
                        atomicReferenceL.set((String) this.f16134e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceL.get();
        S5 s52 = this.f16133d;
        synchronized (s52) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            s52.b();
            ((C1136f6) s52.f13551b).A(strEncodeToString);
        }
    }
}
