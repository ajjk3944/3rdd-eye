package xh;

import Zg.AbstractC3689v;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final l f66133a = new l();

    private l() {
    }

    @Override // xh.h
    public List a() {
        return AbstractC3689v.l();
    }

    @Override // xh.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    public Void c() {
        return null;
    }

    @Override // xh.h
    public Object call(Object[] args) {
        AbstractC6492s.i(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // xh.h
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC6492s.h(TYPE, "TYPE");
        return TYPE;
    }
}
