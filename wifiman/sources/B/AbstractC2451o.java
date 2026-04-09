package B;

import B.InterfaceC2440d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: B.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2451o {

    /* renamed from: B.o$a */
    public interface a {

        /* renamed from: B.o$a$a, reason: collision with other inner class name */
        static final class C0036a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C0036a f992a = new C0036a();

            C0036a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        InterfaceC6835l getKey();

        default InterfaceC6835l getType() {
            return C0036a.f992a;
        }
    }

    public final Object b(int i10) {
        InterfaceC2440d.a aVar = c().get(i10);
        return ((a) aVar.c()).getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract InterfaceC2440d c();

    public final int d() {
        return c().a();
    }

    public final Object e(int i10) {
        Object objInvoke;
        InterfaceC2440d.a aVar = c().get(i10);
        int iB = i10 - aVar.b();
        InterfaceC6835l key = ((a) aVar.c()).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? I.a(i10) : objInvoke;
    }
}
