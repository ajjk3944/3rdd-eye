package xh;

import android.content.res.Resources;
import android.view.View;
import com.liuzh.deviceinfo.R;
import e4.c2;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j implements e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f37135b;

    public /* synthetic */ j(int i4, View view) {
        this.f37134a = i4;
        this.f37135b = view;
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        switch (this.f37134a) {
            case 0:
                v3.b bVarX = nh.a.x(c2Var);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                this.f37135b.setPadding(bVarX.f35793a, dimensionPixelSize + bVarX.f35794b, bVarX.f35795c, bVarX.f35796d);
                break;
            default:
                v3.b bVarX2 = nh.a.x(c2Var);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.toolbar_height);
                this.f37135b.setPadding(bVarX2.f35793a, dimensionPixelSize2 + bVarX2.f35794b, bVarX2.f35795c, bVarX2.f35796d);
                break;
        }
        return v0.j(view, c2Var);
    }
}
