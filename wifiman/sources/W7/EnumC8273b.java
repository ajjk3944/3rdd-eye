package w7;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import z7.j;

/* renamed from: w7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8273b {
    V1(a.f64477a),
    V2(C2281b.f64478a);

    private final InterfaceC6824a factory;

    /* renamed from: w7.b$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64477a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(C8272a.f64474a.a(), 10001, new byte[]{1, 0, 0, 0}, null);
        }
    }

    /* renamed from: w7.b$b, reason: collision with other inner class name */
    static final class C2281b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final C2281b f64478a = new C2281b();

        C2281b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j invoke() {
            return new j(C8272a.f64474a.a(), 10001, new byte[]{2, 8, 0, 0}, null);
        }
    }

    EnumC8273b(InterfaceC6824a interfaceC6824a) {
        this.factory = interfaceC6824a;
    }

    public final InterfaceC6824a getFactory$library_server_lan_release() {
        return this.factory;
    }
}
