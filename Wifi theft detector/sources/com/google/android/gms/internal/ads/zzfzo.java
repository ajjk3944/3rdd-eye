package com.google.android.gms.internal.ads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
final class zzfzo extends SuspendLambda implements l9.p {
    public zzfzo(c9.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c9.c create(Object obj, c9.c cVar) {
        return new zzfzo(cVar);
    }

    @Override // l9.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzo) create((zzfyy) obj, (c9.c) obj2)).invokeSuspend(y8.s.f25199a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.f();
        kotlin.c.b(obj);
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        kotlin.jvm.internal.p.d(zzfyyVarZzd, "getDefaultInstance(...)");
        return zzfyyVarZzd;
    }
}
