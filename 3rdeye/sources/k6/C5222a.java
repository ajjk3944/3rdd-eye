package k6;

import b9.C1992A;
import java.util.List;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5222a extends kotlin.jvm.internal.m implements p9.l<List<Object>, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f43409g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5222a(int i) {
        super(1);
        this.f43409g = i;
    }

    @Override // p9.l
    public final C1992A invoke(List<Object> list) {
        List<Object> mutate = list;
        kotlin.jvm.internal.l.f(mutate, "$this$mutate");
        mutate.remove(this.f43409g);
        return C1992A.f18074a;
    }
}
