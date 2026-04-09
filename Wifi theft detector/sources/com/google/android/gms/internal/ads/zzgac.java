package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
final class zzgac extends SuspendLambda implements l9.p {
    int zza;
    final /* synthetic */ zzgaf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgac(zzgaf zzgafVar, c9.c cVar) {
        super(2, cVar);
        this.zzb = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new zzgac(this.zzb, cVar);
    }

    @Override // l9.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgac) create((kotlinx.coroutines.j0) obj, (c9.c) obj2)).invokeSuspend(y8.s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = kotlin.coroutines.intrinsics.a.f();
        int i10 = this.zza;
        kotlin.c.b(obj);
        if (i10 == 0) {
            zzgaf zzgafVar = this.zzb;
            this.zza = 1;
            if (zzgafVar.zzm(this) == objF) {
                return objF;
            }
        }
        return y8.s.f25199a;
    }
}
