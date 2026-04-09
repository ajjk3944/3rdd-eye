package dh;

import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: dh.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5381f extends InterfaceC5384i.b {

    /* renamed from: m0, reason: collision with root package name */
    public static final b f46086m0 = b.f46087a;

    /* renamed from: dh.f$a */
    public static final class a {
        public static InterfaceC5384i.b a(InterfaceC5381f interfaceC5381f, InterfaceC5384i.c key) {
            InterfaceC5384i.b bVarB;
            AbstractC6492s.i(key, "key");
            if (!(key instanceof AbstractC5377b)) {
                if (InterfaceC5381f.f46086m0 != key) {
                    return null;
                }
                AbstractC6492s.g(interfaceC5381f, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC5381f;
            }
            AbstractC5377b abstractC5377b = (AbstractC5377b) key;
            if (!abstractC5377b.a(interfaceC5381f.getKey()) || (bVarB = abstractC5377b.b(interfaceC5381f)) == null) {
                return null;
            }
            return bVarB;
        }

        public static InterfaceC5384i b(InterfaceC5381f interfaceC5381f, InterfaceC5384i.c key) {
            AbstractC6492s.i(key, "key");
            if (!(key instanceof AbstractC5377b)) {
                return InterfaceC5381f.f46086m0 == key ? C5385j.f46088a : interfaceC5381f;
            }
            AbstractC5377b abstractC5377b = (AbstractC5377b) key;
            return (!abstractC5377b.a(interfaceC5381f.getKey()) || abstractC5377b.b(interfaceC5381f) == null) ? interfaceC5381f : C5385j.f46088a;
        }
    }

    /* renamed from: dh.f$b */
    public static final class b implements InterfaceC5384i.c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f46087a = new b();

        private b() {
        }
    }

    void C(InterfaceC5380e interfaceC5380e);

    InterfaceC5380e y(InterfaceC5380e interfaceC5380e);
}
