package xb;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import retrofit2.HttpException;

/* renamed from: xb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8442c implements InterfaceC8440a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f65547a;

    public C8442c(InterfaceC6835l httpCodeToException) {
        AbstractC6492s.i(httpCodeToException, "httpCodeToException");
        this.f65547a = httpCodeToException;
    }

    @Override // xb.InterfaceC8440a
    public Throwable a(Throwable source) {
        Throwable th2;
        AbstractC6492s.i(source, "source");
        return (!(source instanceof HttpException) || (th2 = (Throwable) this.f65547a.invoke(source)) == null) ? source : th2;
    }
}
