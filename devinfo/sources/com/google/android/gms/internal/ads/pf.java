package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pf extends zf {

    /* renamed from: i, reason: collision with root package name */
    public static final mx0 f14993i = new mx0(9);

    /* renamed from: h, reason: collision with root package name */
    public final Context f14994h;

    public pf(ff ffVar, zc zcVar, int i4, Context context) {
        super(ffVar, "BJ0iIx7YCr6PyW+pyNNozQaB62BBi5nixFl6WJUaFdU4X2GlfptGfOLgFJ7ri6Ag", "ovMA5nrmsfMPPc1p4911nPRjAFxE4I+3QWZwZMrn+uQ=", zcVar, i4, 29);
        this.f14994h = context;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        zc zcVar = this.f19075d;
        zcVar.b();
        ((md) zcVar.f14755b).A("E");
        Context context = this.f14994h;
        AtomicReference atomicReferenceO = f14993i.o(context.getPackageName());
        if (atomicReferenceO.get() == null) {
            synchronized (atomicReferenceO) {
                try {
                    if (atomicReferenceO.get() == null) {
                        atomicReferenceO.set((String) this.f19076e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceO.get();
        zc zcVar2 = this.f19075d;
        synchronized (zcVar2) {
            String strEncodeToString = Base64.encodeToString(str.getBytes(), 11);
            zcVar2.b();
            ((md) zcVar2.f14755b).A(strEncodeToString);
        }
    }
}
