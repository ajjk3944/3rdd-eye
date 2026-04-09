package r0;

import java.util.ArrayList;
import s0.o;

/* compiled from: HelperWidget.java */
/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5512i extends C5508e {

    /* renamed from: r0, reason: collision with root package name */
    public C5508e[] f45653r0 = new C5508e[4];

    /* renamed from: s0, reason: collision with root package name */
    public int f45654s0 = 0;

    public final void R(int i, ArrayList arrayList, o oVar) {
        for (int i10 = 0; i10 < this.f45654s0; i10++) {
            C5508e c5508e = this.f45653r0[i10];
            ArrayList<C5508e> arrayList2 = oVar.f45941a;
            if (!arrayList2.contains(c5508e)) {
                arrayList2.add(c5508e);
            }
        }
        for (int i11 = 0; i11 < this.f45654s0; i11++) {
            s0.i.a(this.f45653r0[i11], i, arrayList, oVar);
        }
    }

    public void S() {
    }
}
