package Nb;

import Zg.AbstractC3689v;
import gg.i;
import java.util.List;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: Nb.a$a, reason: collision with other inner class name */
    static final class C0589a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0589a f16333a = new C0589a();

        C0589a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(AbstractC3689v.s0(it));
        }
    }

    public abstract void a(c cVar);

    public abstract i b(String str);

    public final i c(String id2) {
        AbstractC6492s.i(id2, "id");
        i iVarN0 = b(id2).N0(C0589a.f16333a);
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    public void d(String id2, boolean z10) {
        AbstractC6492s.i(id2, "id");
        if (e(id2, z10) < 1) {
            a(new c(id2, z10, null));
        }
    }

    public abstract int e(String str, boolean z10);
}
