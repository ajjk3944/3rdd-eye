package o4;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.M;
import java.security.GeneralSecurityException;
import v4.d;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C7074i implements InterfaceC7073h {

    /* renamed from: a, reason: collision with root package name */
    private final v4.d f55270a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f55271b;

    /* renamed from: o4.i$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final d.a f55272a;

        a(d.a aVar) {
            this.f55272a = aVar;
        }

        private M b(M m10) {
            this.f55272a.e(m10);
            return this.f55272a.a(m10);
        }

        M a(AbstractC5081h abstractC5081h) {
            return b(this.f55272a.d(abstractC5081h));
        }
    }

    public C7074i(v4.d dVar, Class cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f55270a = dVar;
        this.f55271b = cls;
    }

    private a e() {
        return new a(this.f55270a.f());
    }

    private Object f(M m10) throws GeneralSecurityException {
        if (Void.class.equals(this.f55271b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f55270a.j(m10);
        return this.f55270a.e(m10, this.f55271b);
    }

    @Override // o4.InterfaceC7073h
    public final M a(AbstractC5081h abstractC5081h) throws GeneralSecurityException {
        try {
            return e().a(abstractC5081h);
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f55270a.f().b().getName(), e10);
        }
    }

    @Override // o4.InterfaceC7073h
    public final A4.y b(AbstractC5081h abstractC5081h) throws GeneralSecurityException {
        try {
            return (A4.y) A4.y.b0().u(c()).w(e().a(abstractC5081h).e()).t(this.f55270a.g()).i();
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // o4.InterfaceC7073h
    public final String c() {
        return this.f55270a.d();
    }

    @Override // o4.InterfaceC7073h
    public final Object d(AbstractC5081h abstractC5081h) throws GeneralSecurityException {
        try {
            return f(this.f55270a.h(abstractC5081h));
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f55270a.c().getName(), e10);
        }
    }
}
