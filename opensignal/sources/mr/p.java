package mr;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16970g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Field field, boolean z10, boolean z11, int i10) {
        super(field, z10, z11);
        this.f16970g = i10;
    }

    @Override // mr.q, mr.v
    public void c(Object[] objArr) {
        switch (this.f16970g) {
            case 1:
                br.l.e(objArr, "args");
                super.c(objArr);
                d(mq.l.n0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
