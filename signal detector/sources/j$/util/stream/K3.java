package j$.util.stream;

import java.security.AccessController;

/* loaded from: classes2.dex */
public abstract class K3 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20903a = ((Boolean) AccessController.doPrivileged(new j$.util.d0(2))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
