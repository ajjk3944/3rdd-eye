package sh;

import android.content.res.Resources;
import android.view.View;
import com.liuzh.deviceinfo.R;
import e4.c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o implements e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f33741b;

    public /* synthetic */ o(int i4, View view) {
        this.f33740a = i4;
        this.f33741b = view;
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        switch (this.f33740a) {
            case 0:
                v3.b bVarX = nh.a.x(c2Var);
                this.f33741b.setPadding(bVarX.f35793a, 0, bVarX.f35795c, bVarX.f35796d);
                break;
            case 1:
                v3.b bVarX2 = nh.a.x(c2Var);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                this.f33741b.setPadding(bVarX2.f35793a, dimensionPixelSize + bVarX2.f35794b, bVarX2.f35795c, bVarX2.f35796d);
                break;
            case 2:
                v3.b bVarX3 = nh.a.x(c2Var);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                this.f33741b.setPadding(bVarX3.f35793a, dimensionPixelSize2 + bVarX3.f35794b, bVarX3.f35795c, bVarX3.f35796d);
                break;
            default:
                v3.b bVarX4 = nh.a.x(c2Var);
                int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                this.f33741b.setPadding(bVarX4.f35793a, dimensionPixelSize3 + bVarX4.f35794b, bVarX4.f35795c, bVarX4.f35796d);
                break;
        }
        return e4.v0.j(view, c2Var);
    }
}
