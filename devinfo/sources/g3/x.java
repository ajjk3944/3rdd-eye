package g3;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import i2.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends j {
    public final View A;
    public final b2.e B;
    public f1.f C;
    public mk.c D;
    public mk.c E;
    public mk.c F;

    public x(Context context, mk.c cVar, u0.o oVar, f1.g gVar, int i4, m1 m1Var) {
        View view = (View) cVar.invoke(context);
        b2.e eVar = new b2.e();
        super(context, oVar, i4, eVar, view, m1Var);
        this.A = view;
        this.B = eVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i4);
        Object objC = gVar != null ? gVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (gVar != null) {
            setSavableRegistryEntry(gVar.d(strValueOf, new i(this, 2)));
        }
        c cVar2 = c.f24457e;
        this.D = cVar2;
        this.E = cVar2;
        this.F = cVar2;
    }

    public static final void o(x xVar) {
        xVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(f1.f fVar) {
        f1.f fVar2 = this.C;
        if (fVar2 != null) {
            ((yb.e) fVar2).z();
        }
        this.C = fVar;
    }

    public final b2.e getDispatcher() {
        return this.B;
    }

    public final mk.c getReleaseBlock() {
        return this.F;
    }

    public final mk.c getResetBlock() {
        return this.E;
    }

    public /* bridge */ /* synthetic */ j2.a getSubCompositionView() {
        return null;
    }

    public final mk.c getUpdateBlock() {
        return this.D;
    }

    public final void setReleaseBlock(mk.c cVar) {
        this.F = cVar;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(mk.c cVar) {
        this.E = cVar;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(mk.c cVar) {
        this.D = cVar;
        setUpdate(new i(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
