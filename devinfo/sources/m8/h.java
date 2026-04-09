package m8;

import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements g, z {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f28959a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.t f28960b;

    public h(androidx.lifecycle.t tVar) {
        this.f28960b = tVar;
        tVar.a(this);
    }

    @Override // m8.g
    public final void f(i iVar) {
        this.f28959a.remove(iVar);
    }

    @Override // m8.g
    public final void n(i iVar) {
        this.f28959a.add(iVar);
        androidx.lifecycle.s sVar = ((c0) this.f28960b).f1110d;
        if (sVar == androidx.lifecycle.s.f1180a) {
            iVar.onDestroy();
        } else if (sVar.compareTo(androidx.lifecycle.s.f1183d) >= 0) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    @n0(androidx.lifecycle.r.ON_DESTROY)
    public void onDestroy(a0 a0Var) {
        ArrayList arrayListE = t8.m.e(this.f28959a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((i) obj).onDestroy();
        }
        a0Var.j().b(this);
    }

    @n0(androidx.lifecycle.r.ON_START)
    public void onStart(a0 a0Var) {
        ArrayList arrayListE = t8.m.e(this.f28959a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((i) obj).onStart();
        }
    }

    @n0(androidx.lifecycle.r.ON_STOP)
    public void onStop(a0 a0Var) {
        ArrayList arrayListE = t8.m.e(this.f28959a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((i) obj).onStop();
        }
    }
}
