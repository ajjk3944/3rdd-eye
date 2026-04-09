package sg;

import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.diskpartition.DiskPartitionActivity;
import e4.c2;
import e4.s;
import e4.v0;
import nk.k;
import p.u2;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements u2, s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskPartitionActivity f33599a;

    public /* synthetic */ a(DiskPartitionActivity diskPartitionActivity) {
        this.f33599a = diskPartitionActivity;
    }

    @Override // p.u2
    public void a() {
        int i4 = DiskPartitionActivity.D;
        f fVar = (f) this.f33599a.C.getValue();
        fVar.f33608c.h(new h(fVar.f33607b, new ng.b()));
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        int i4 = DiskPartitionActivity.D;
        k.e(view, "v");
        v3.b bVarX = nh.a.x(c2Var);
        DiskPartitionActivity diskPartitionActivity = this.f33599a;
        f1 f1Var = diskPartitionActivity.B;
        if (f1Var == null) {
            k.k("binding");
            throw null;
        }
        i.a((Toolbar) f1Var.f1137e, bVarX);
        int dimensionPixelSize = diskPartitionActivity.getResources().getDimensionPixelSize(R.dimen.content_padding_half);
        f1 f1Var2 = diskPartitionActivity.B;
        if (f1Var2 == null) {
            k.k("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) f1Var2.f1136d;
        if (f1Var2 == null) {
            k.k("binding");
            throw null;
        }
        recyclerView.setPadding(bVarX.f35793a + dimensionPixelSize, ((Toolbar) f1Var2.f1137e).getLayoutParams().height + dimensionPixelSize, dimensionPixelSize + bVarX.f35795c, bVarX.f35796d + dimensionPixelSize);
        return v0.j(view, c2Var);
    }
}
