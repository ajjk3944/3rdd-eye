package yh;

import Bh.g0;
import Jh.H;
import Jh.I;
import Sh.x;
import Zg.AbstractC3689v;
import Zh.b;
import Zh.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.J;

/* renamed from: yh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8673a {

    /* renamed from: a, reason: collision with root package name */
    public static final C8673a f66778a = new C8673a();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f66779b;

    /* renamed from: c, reason: collision with root package name */
    private static final b f66780c;

    /* renamed from: yh.a$a, reason: collision with other inner class name */
    public static final class C2372a implements x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f66781a;

        C2372a(J j10) {
            this.f66781a = j10;
        }

        @Override // Sh.x.c
        public void a() {
        }

        @Override // Sh.x.c
        public x.a b(b classId, g0 source) {
            AbstractC6492s.i(classId, "classId");
            AbstractC6492s.i(source, "source");
            if (!AbstractC6492s.d(classId, H.f10097a.a())) {
                return null;
            }
            this.f66781a.f51685a = true;
            return null;
        }
    }

    static {
        List listO = AbstractC3689v.o(I.f10102a, I.f10113l, I.f10114m, I.f10105d, I.f10107f, I.f10110i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b.a aVar = b.f25401d;
        Iterator it = listO.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(aVar.c((c) it.next()));
        }
        f66779b = linkedHashSet;
        b.a aVar2 = b.f25401d;
        c REPEATABLE_ANNOTATION = I.f10111j;
        AbstractC6492s.h(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        f66780c = aVar2.c(REPEATABLE_ANNOTATION);
    }

    private C8673a() {
    }

    public final b a() {
        return f66780c;
    }

    public final Set b() {
        return f66779b;
    }

    public final boolean c(x klass) {
        AbstractC6492s.i(klass, "klass");
        J j10 = new J();
        klass.d(new C2372a(j10), null);
        return j10.f51685a;
    }
}
