package K6;

import b9.C1992A;
import java.util.regex.PatternSyntaxException;
import p9.InterfaceC5480a;

/* compiled from: DivInputBinder.kt */
/* loaded from: classes.dex */
public final class D0 extends kotlin.jvm.internal.m implements p9.p<Exception, InterfaceC5480a<? extends C1992A>, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Q6.c cVar) {
        super(2);
        this.f3202g = cVar;
    }

    @Override // p9.p
    public final C1992A invoke(Exception exc, InterfaceC5480a<? extends C1992A> interfaceC5480a) {
        Exception exception = exc;
        InterfaceC5480a<? extends C1992A> other = interfaceC5480a;
        kotlin.jvm.internal.l.f(exception, "exception");
        kotlin.jvm.internal.l.f(other, "other");
        if (exception instanceof PatternSyntaxException) {
            this.f3202g.a(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exception).getPattern() + "'."));
        } else {
            other.invoke();
        }
        return C1992A.f18074a;
    }
}
