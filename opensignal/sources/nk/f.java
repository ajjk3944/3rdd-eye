package nk;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18375a;

    public /* synthetic */ f(int i10) {
        this.f18375a = i10;
    }

    public static void a(Type type, Class cls) {
        Class<?> clsD = p0.d(type);
        if (cls.isAssignableFrom(clsD)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + clsD.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0365  */
    @Override // nk.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nk.r create(java.lang.reflect.Type r26, java.util.Set r27, nk.j0 r28) throws java.lang.NoSuchFieldException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 2268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nk.f.create(java.lang.reflect.Type, java.util.Set, nk.j0):nk.r");
    }
}
