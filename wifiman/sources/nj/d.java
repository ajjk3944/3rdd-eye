package Nj;

import Mj.w;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final w f16641a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f16642b;

    private d(w wVar, Throwable th2) {
        this.f16641a = wVar;
        this.f16642b = th2;
    }

    public static d a(Throwable th2) {
        if (th2 != null) {
            return new d(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static d b(w wVar) {
        if (wVar != null) {
            return new d(wVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
