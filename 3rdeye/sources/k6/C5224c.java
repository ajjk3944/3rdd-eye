package k6;

import b9.C1992A;
import java.util.List;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5224c extends kotlin.jvm.internal.m implements p9.l<List<Object>, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f43412g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f43413h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5224c(int i, Object obj) {
        super(1);
        this.f43412g = i;
        this.f43413h = obj;
    }

    @Override // p9.l
    public final C1992A invoke(List<Object> list) {
        List<Object> mutate = list;
        kotlin.jvm.internal.l.f(mutate, "$this$mutate");
        mutate.set(this.f43412g, this.f43413h);
        return C1992A.f18074a;
    }
}
