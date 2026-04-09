package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dy2 extends ca2 {
    public final /* synthetic */ fy2 f;

    public dy2(fy2 fy2Var) {
        this.f = fy2Var;
    }

    @Override // defpackage.da2
    public final void O2(wu1 wu1Var) {
        pd2 pd2Var = this.f.f;
        wu1Var.getClass();
        pd2Var.b(new xt1(wu1Var.f, wu1Var.g));
    }

    @Override // defpackage.da2
    public final void p1(ParcelFileDescriptor parcelFileDescriptor, fa2 fa2Var) {
        this.f.f.a(new ny2(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), fa2Var));
    }

    @Override // defpackage.da2
    public final void v1(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        fy2 fy2Var = this.f;
        fy2Var.f.a(new ny2(autoCloseInputStream, fy2Var.j));
    }
}
