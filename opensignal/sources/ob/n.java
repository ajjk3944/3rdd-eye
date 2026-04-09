package ob;

import com.google.android.exoplayer2.m1;
import qb.v;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f19270a;

    /* renamed from: b, reason: collision with root package name */
    public final m1[] f19271b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f19272c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19273d;

    public n(m1[] m1VarArr, f[] fVarArr, h hVar) {
        this.f19271b = m1VarArr;
        this.f19272c = (f[]) fVarArr.clone();
        this.f19273d = hVar;
        this.f19270a = m1VarArr.length;
    }

    public final boolean a(n nVar, int i10) {
        return nVar != null && v.a(this.f19271b[i10], nVar.f19271b[i10]) && v.a(this.f19272c[i10], nVar.f19272c[i10]);
    }

    public final boolean b(int i10) {
        return this.f19271b[i10] != null;
    }
}
