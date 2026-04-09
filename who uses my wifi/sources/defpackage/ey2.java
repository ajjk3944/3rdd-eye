package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ey2 extends ca2 {
    public final pd2 f;
    public final fa2 g;

    public ey2(pd2 pd2Var, fa2 fa2Var) {
        this.f = pd2Var;
        this.g = fa2Var;
    }

    @Override // defpackage.da2
    public final void O2(wu1 wu1Var) {
        wu1Var.getClass();
        this.f.b(new xt1(wu1Var.f, wu1Var.g));
    }

    @Override // defpackage.da2
    public final void p1(ParcelFileDescriptor parcelFileDescriptor, fa2 fa2Var) {
        this.f.a(new ny2(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), fa2Var));
    }

    @Override // defpackage.da2
    public final void v1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f.a(new ny2(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.g));
    }
}
