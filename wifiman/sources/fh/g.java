package Fh;

import Sh.v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.builtins.o;
import mi.C6840a;
import mi.C6843d;

/* loaded from: classes4.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ClassLoader f6675a;

    /* renamed from: b, reason: collision with root package name */
    private final C6843d f6676b;

    public g(ClassLoader classLoader) {
        AbstractC6492s.i(classLoader, "classLoader");
        this.f6675a = classLoader;
        this.f6676b = new C6843d();
    }

    private final v.a d(String str) {
        f fVarA;
        Class clsA = e.a(this.f6675a, str);
        if (clsA == null || (fVarA = f.f6672c.a(clsA)) == null) {
            return null;
        }
        return new v.a.C0766a(fVarA, null, 2, null);
    }

    @Override // Sh.v
    public v.a a(Zh.b classId, Yh.e jvmMetadataVersion) {
        AbstractC6492s.i(classId, "classId");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        return d(h.b(classId));
    }

    @Override // Sh.v
    public v.a b(Qh.g javaClass, Yh.e jvmMetadataVersion) {
        String strB;
        AbstractC6492s.i(javaClass, "javaClass");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        Zh.c cVarE = javaClass.e();
        if (cVarE == null || (strB = cVarE.b()) == null) {
            return null;
        }
        return d(strB);
    }

    @Override // li.InterfaceC6598A
    public InputStream c(Zh.c packageFqName) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        if (packageFqName.i(o.f51802z)) {
            return this.f6676b.a(C6840a.f54038r.r(packageFqName));
        }
        return null;
    }
}
