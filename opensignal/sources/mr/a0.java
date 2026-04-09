package mr;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f16950a = new a0();

    @Override // mr.g
    public final List a() {
        return mq.w.f16945a;
    }

    @Override // mr.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // mr.g
    public final Type i() {
        Class cls = Void.TYPE;
        br.l.d(cls, "TYPE");
        return cls;
    }

    @Override // mr.g
    public final Object s(Object[] objArr) {
        br.l.e(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
