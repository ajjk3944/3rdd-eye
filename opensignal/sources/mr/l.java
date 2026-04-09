package mr;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Field field, boolean z10, int i10) {
        super(field, z10);
        this.f16968e = i10;
    }

    @Override // mr.v
    public void c(Object[] objArr) {
        switch (this.f16968e) {
            case 1:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                d(mq.l.n0(objArr));
                break;
            default:
                super.c(objArr);
                break;
        }
    }
}
