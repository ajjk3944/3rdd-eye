package l9;

import k9.C5260a;

/* compiled from: JDK8PlatformImplementations.kt */
/* renamed from: l9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5303a extends C5260a {

    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: l9.a$a, reason: collision with other inner class name */
    public static final class C0493a {

        /* renamed from: a, reason: collision with root package name */
        public static final Integer f43926a;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f43926a = num;
        }
    }
}
