package A1;

import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0297t;
import androidx.lifecycle.InterfaceC0298u;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class i implements h, InterfaceC0297t {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f106a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final C0300w f107b;

    public i(C0300w c0300w) {
        this.f107b = c0300w;
        c0300w.a(this);
    }

    @Override // A1.h
    public final void f(j jVar) {
        this.f106a.add(jVar);
        EnumC0292n enumC0292n = this.f107b.f5259d;
        if (enumC0292n == EnumC0292n.f5243a) {
            jVar.onDestroy();
        } else if (enumC0292n.compareTo(EnumC0292n.f5246d) >= 0) {
            jVar.j();
        } else {
            jVar.e();
        }
    }

    @Override // A1.h
    public final void g(j jVar) {
        this.f106a.remove(jVar);
    }

    @F(EnumC0291m.ON_DESTROY)
    public void onDestroy(InterfaceC0298u interfaceC0298u) {
        ArrayList arrayListE = H1.p.e(this.f106a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j) obj).onDestroy();
        }
        interfaceC0298u.j().f(this);
    }

    @F(EnumC0291m.ON_START)
    public void onStart(InterfaceC0298u interfaceC0298u) {
        ArrayList arrayListE = H1.p.e(this.f106a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j) obj).j();
        }
    }

    @F(EnumC0291m.ON_STOP)
    public void onStop(InterfaceC0298u interfaceC0298u) {
        ArrayList arrayListE = H1.p.e(this.f106a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((j) obj).e();
        }
    }
}
