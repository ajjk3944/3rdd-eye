package oc;

import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import e4.c2;
import e4.l1;
import java.util.Iterator;
import java.util.List;
import yb.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public final View f30515c;

    /* renamed from: d, reason: collision with root package name */
    public int f30516d;

    /* renamed from: e, reason: collision with root package name */
    public int f30517e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f30518f;

    public h(View view) {
        super(0);
        this.f30518f = new int[2];
        this.f30515c = view;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(l1 l1Var) {
        this.f30515c.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void e(l1 l1Var) {
        View view = this.f30515c;
        int[] iArr = this.f30518f;
        view.getLocationOnScreen(iArr);
        this.f30516d = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final c2 f(c2 c2Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((l1) it.next()).f22371a.d() & 8) != 0) {
                this.f30515c.setTranslationY(jc.a.c(r0.f22371a.c(), this.f30517e, 0));
                break;
            }
        }
        return c2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final i g(l1 l1Var, i iVar) {
        View view = this.f30515c;
        int[] iArr = this.f30518f;
        view.getLocationOnScreen(iArr);
        int i4 = this.f30516d - iArr[1];
        this.f30517e = i4;
        view.setTranslationY(i4);
        return iVar;
    }
}
