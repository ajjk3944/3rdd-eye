package B3;

/* loaded from: classes.dex */
public abstract class i {
    public static Object a(Class cls, String str, g... gVarArr) {
        return c(cls, "isIsolated", null, false, gVarArr);
    }

    public static Object b(String str, String str2, ClassLoader classLoader, g... gVarArr) {
        return c(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, gVarArr);
    }

    private static Object c(Class cls, String str, Object obj, boolean z10, g... gVarArr) {
        int length = gVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            g gVar = gVarArr[i10];
            gVar.getClass();
            clsArr[i10] = gVar.b();
            objArr[i10] = gVarArr[i10].c();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
