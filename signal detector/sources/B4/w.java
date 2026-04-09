package B4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import c5.C0408e;
import c5.C0412i;
import h5.InterfaceC2370d;
import java.io.File;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class w extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f757e = yVar;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((w) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new w(this.f757e, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        ApplicationInfo applicationInfo;
        String str;
        R2.a.H(obj);
        try {
            Context contextM = this.f757e.m();
            objD = (contextM == null || (applicationInfo = contextM.getApplicationInfo()) == null || (str = applicationInfo.sourceDir) == null) ? null : new File(str);
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        if (objD instanceof C0408e) {
            return null;
        }
        return objD;
    }
}
