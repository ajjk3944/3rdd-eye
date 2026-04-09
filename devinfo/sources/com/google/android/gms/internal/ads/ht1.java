package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ht1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11969a;

    /* renamed from: b, reason: collision with root package name */
    public final gt1 f11970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ it1 f11971c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.gt1, java.util.function.IntConsumer] */
    public /* synthetic */ ht1(it1 it1Var, Context context) {
        this.f11971c = it1Var;
        this.f11969a = new WeakReference(context);
        ?? r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.gt1
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i4) {
                it1 it1Var2 = this.f11609a.f11971c;
                if (it1Var2.X) {
                    return;
                }
                it1Var2.X1(1, 19, Integer.valueOf(i4));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.f11970b = r02;
        context.registerDeviceIdChangeListener(new w(2, it1Var.f12468v.A(it1Var.f12466t, null)), r02);
    }

    public final /* synthetic */ void a() {
        Context context = (Context) this.f11969a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.f11970b);
    }
}
