package J8;

import b9.C1992A;

/* compiled from: ErrorHandlingUtils.kt */
/* renamed from: J8.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0698m extends kotlin.jvm.internal.k implements p9.l<Exception, C1992A> {

    /* renamed from: b, reason: collision with root package name */
    public static final C0698m f2872b = new C0698m(1, C0702q.class, "handleException", "handleException(Ljava/lang/Exception;)V", 1);

    @Override // p9.l
    public final C1992A invoke(Exception exc) {
        Exception p02 = exc;
        kotlin.jvm.internal.l.f(p02, "p0");
        K4.e eVarA = K4.e.a();
        String strD = androidx.work.s.d("Exception while performing action. Exception: ", p02.getMessage());
        O4.F f10 = eVarA.f3148a;
        long jCurrentTimeMillis = System.currentTimeMillis() - f10.f10237d;
        O4.v vVar = f10.f10240g;
        vVar.getClass();
        vVar.f10338e.a(new O4.w(vVar, jCurrentTimeMillis, strD));
        return C1992A.f18074a;
    }
}
