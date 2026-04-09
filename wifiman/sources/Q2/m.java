package Q2;

import Q2.o;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import androidx.lifecycle.AbstractC4013k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    final Map f19134a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final o.b f19135b;

    class a implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k f19136a;

        a(AbstractC4013k abstractC4013k) {
            this.f19136a = abstractC4013k;
        }

        @Override // Q2.l
        public void a() {
        }

        @Override // Q2.l
        public void b() {
        }

        @Override // Q2.l
        public void f() {
            m.this.f19134a.remove(this.f19136a);
        }
    }

    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final w f19138a;

        b(w wVar) {
            this.f19138a = wVar;
        }

        private void b(w wVar, Set set) {
            List listQ0 = wVar.q0();
            int size = listQ0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) listQ0.get(i10);
                b(fragment.r(), set);
                com.bumptech.glide.j jVarA = m.this.a(fragment.O());
                if (jVarA != null) {
                    set.add(jVarA);
                }
            }
        }

        @Override // Q2.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f19138a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f19135b = bVar;
    }

    com.bumptech.glide.j a(AbstractC4013k abstractC4013k) {
        W2.l.a();
        return (com.bumptech.glide.j) this.f19134a.get(abstractC4013k);
    }

    com.bumptech.glide.j b(Context context, com.bumptech.glide.b bVar, AbstractC4013k abstractC4013k, w wVar, boolean z10) {
        W2.l.a();
        com.bumptech.glide.j jVarA = a(abstractC4013k);
        if (jVarA != null) {
            return jVarA;
        }
        k kVar = new k(abstractC4013k);
        com.bumptech.glide.j jVarA2 = this.f19135b.a(bVar, kVar, new b(wVar), context);
        this.f19134a.put(abstractC4013k, jVarA2);
        kVar.b(new a(abstractC4013k));
        if (z10) {
            jVarA2.b();
        }
        return jVarA2;
    }
}
