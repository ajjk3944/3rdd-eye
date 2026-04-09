package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2003vB implements XD {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17231a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17232b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f17233c;

    /* renamed from: d, reason: collision with root package name */
    public TE f17234d;

    public AbstractC2003vB(boolean z6) {
        this.f17231a = z6;
    }

    public final void b(TE te) {
        for (int i = 0; i < this.f17233c; i++) {
            ((InterfaceC1958uK) this.f17232b.get(i)).getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public final void c(InterfaceC1958uK interfaceC1958uK) {
        interfaceC1958uK.getClass();
        ArrayList arrayList = this.f17232b;
        if (arrayList.contains(interfaceC1958uK)) {
            return;
        }
        arrayList.add(interfaceC1958uK);
        this.f17233c++;
    }

    public final void e(TE te) {
        this.f17234d = te;
        for (int i = 0; i < this.f17233c; i++) {
            ((InterfaceC1958uK) this.f17232b.get(i)).d(this, te, this.f17231a);
        }
    }

    public final void g(int i) {
        TE te = this.f17234d;
        String str = Vt.f12096a;
        for (int i3 = 0; i3 < this.f17233c; i3++) {
            ((InterfaceC1958uK) this.f17232b.get(i3)).g(te, this.f17231a, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.XD
    public Map h() {
        return Collections.EMPTY_MAP;
    }

    public final void j() {
        TE te = this.f17234d;
        String str = Vt.f12096a;
        for (int i = 0; i < this.f17233c; i++) {
            ((InterfaceC1958uK) this.f17232b.get(i)).m(te, this.f17231a);
        }
        this.f17234d = null;
    }
}
