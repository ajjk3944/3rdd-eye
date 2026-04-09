package B7;

import A7.c;
import Yg.J;
import Zg.AbstractC3682n;
import com.ubnt.discovery.server.lan.processing.parser.UnknownFieldException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import mh.InterfaceC6835l;
import s7.C7916c;
import s7.InterfaceC7921h;
import t7.C8040d;
import v7.C8195b;
import v7.EnumC8194a;
import y7.C8625e;
import y7.C8626f;
import y7.g;
import y7.h;
import y7.i;
import y7.j;
import y7.k;

/* loaded from: classes3.dex */
public final class a extends A7.a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0047a f1220c = new C0047a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f1221a = 4;

    /* renamed from: b, reason: collision with root package name */
    private final int f1222b = 4;

    /* renamed from: B7.a$a, reason: collision with other inner class name */
    public static final class C0047a {
        public /* synthetic */ C0047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0047a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f1223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list) {
            super(1);
            this.f1223a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        public final void a(C7916c.a build) {
            C8040d next;
            AbstractC6492s.i(build, "$this$build");
            Iterator it = this.f1223a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it.next();
                    if (((InterfaceC7921h) next) instanceof C8040d) {
                        break;
                    }
                }
            }
            C8040d c8040d = next instanceof C8040d ? next : null;
            if (c8040d != null) {
                build.b(c8040d.b());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7916c.a) obj);
            return J.f24997a;
        }
    }

    @Override // A7.a
    public int c() {
        return this.f1222b;
    }

    @Override // A7.a
    public int d() {
        return this.f1221a;
    }

    @Override // A7.a
    public C7916c e(List extras) {
        AbstractC6492s.i(extras, "extras");
        return C7916c.f61363c.a(new b(extras));
    }

    @Override // A7.a
    public InterfaceC7921h f(c packetHeader, A7.b fieldHeader, byte[] data) {
        AbstractC6492s.i(packetHeader, "packetHeader");
        AbstractC6492s.i(fieldHeader, "fieldHeader");
        AbstractC6492s.i(data, "data");
        int iB = fieldHeader.b();
        if (iB == 1) {
            return new C8040d(data);
        }
        if (iB == 5) {
            return new C8626f(new String(data, C6510d.f52215b));
        }
        if (iB == 14) {
            return new j(C8195b.f63487a.a(data, EnumC8194a.BIG_ENDIAN));
        }
        if (iB == 16) {
            return new g(new String(data, C6510d.f52215b));
        }
        if (iB == 7) {
            return new k(new String(data, C6510d.f52215b));
        }
        if (iB == 8) {
            return new h(new String(data, C6510d.f52215b));
        }
        switch (iB) {
            case 10:
                return new t7.g(C8195b.f63487a.b(data, EnumC8194a.LITTLE_ENDIAN));
            case 11:
                return new i(new String(data, C6510d.f52215b));
            case 12:
                return new C8625e(new String(data, C6510d.f52215b));
            default:
                throw new UnknownFieldException(fieldHeader.b());
        }
    }

    @Override // A7.a
    public A7.b g(byte[] data, int i10, int i11) {
        AbstractC6492s.i(data, "data");
        C8195b c8195b = C8195b.f63487a;
        int i12 = i10 + 2;
        byte[] bArrR = AbstractC3682n.r(data, i10, i12);
        EnumC8194a enumC8194a = EnumC8194a.BIG_ENDIAN;
        return new A7.b(c8195b.b(bArrR, enumC8194a), c8195b.b(AbstractC3682n.r(data, i12, i10 + 4), enumC8194a));
    }

    @Override // A7.a
    public c h(byte[] data, int i10, int i11) {
        AbstractC6492s.i(data, "data");
        byte b10 = data[i10 + 1];
        return new c(data[i10], b10 == 0, C8195b.f63487a.b(AbstractC3682n.r(data, i10 + 2, i10 + 4), EnumC8194a.BIG_ENDIAN));
    }
}
