package Ag;

import Yg.s;
import Yg.y;
import gg.D;
import gg.z;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f756a = new e();

    static final class a implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f757a = new a();

        a() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s apply(Object obj, Object obj2) {
            return new s(obj, obj2);
        }
    }

    static final class b implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final b f758a = new b();

        b() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y a(Object obj, Object obj2, Object obj3) {
            return new y(obj, obj2, obj3);
        }
    }

    private e() {
    }

    public final z a(D s12, D s22) {
        AbstractC6492s.i(s12, "s1");
        AbstractC6492s.i(s22, "s2");
        z zVarE0 = z.e0(s12, s22, a.f757a);
        AbstractC6492s.h(zVarE0, "Single.zip(s1, s2, BiFun…n { t, u -> Pair(t, u) })");
        return zVarE0;
    }

    public final z b(D s12, D s22, D s32) {
        AbstractC6492s.i(s12, "s1");
        AbstractC6492s.i(s22, "s2");
        AbstractC6492s.i(s32, "s3");
        z zVarD0 = z.d0(s12, s22, s32, b.f758a);
        AbstractC6492s.h(zVarD0, "Single.zip(s1, s2, s3, F… -> Triple(t1, t2, t3) })");
        return zVarD0;
    }
}
