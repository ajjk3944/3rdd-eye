package ph;

import android.content.res.Resources;
import android.view.View;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.R;
import e4.c2;
import e4.s;
import e4.v0;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f31978b;

    public /* synthetic */ d(int i4, View view) {
        this.f31977a = i4;
        this.f31978b = view;
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        int i4 = this.f31977a;
        View view2 = this.f31978b;
        switch (i4) {
            case 0:
                k.e(view, "v");
                v3.b bVarX = nh.a.x(c2Var);
                view2.setPadding(bVarX.f35793a, bVarX.f35794b + view.getResources().getDimensionPixelSize(R.dimen.toolbar_height), bVarX.f35795c, bVarX.f35796d);
                break;
            case 1:
                v3.b bVarX2 = nh.a.x(c2Var);
                view2.setPadding(bVarX2.f35793a, 0, bVarX2.f35795c, bVarX2.f35796d);
                break;
            case 2:
                v3.b bVarX3 = nh.a.x(c2Var);
                int i10 = bVarX3.f35795c;
                int i11 = bVarX3.f35793a;
                View viewFindViewById = view2.findViewById(R.id.note_content);
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding);
                if (viewFindViewById != null) {
                    viewFindViewById.setPadding(i11 + dimensionPixelSize, dimensionPixelSize, i10 + dimensionPixelSize, dimensionPixelSize);
                }
                view2.findViewById(R.id.main_container).setPadding(i11, 0, i10, bVarX3.f35796d);
                break;
            case 3:
                v3.b bVarX4 = nh.a.x(c2Var);
                view2.setPadding(bVarX4.f35793a, 0, bVarX4.f35795c, bVarX4.f35796d);
                break;
            case 4:
                v3.b bVarX5 = nh.a.x(c2Var);
                view2.setPadding(bVarX5.f35793a, 0, bVarX5.f35795c, bVarX5.f35796d);
                break;
            case 5:
                v3.b bVarX6 = nh.a.x(c2Var);
                view2.setPadding(bVarX6.f35793a, 0, bVarX6.f35795c, bVarX6.f35796d);
                break;
            case 6:
                v3.b bVarX7 = nh.a.x(c2Var);
                view2.setPadding(bVarX7.f35793a, 0, bVarX7.f35795c, bVarX7.f35796d);
                break;
            case 7:
                v3.b bVarX8 = nh.a.x(c2Var);
                int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                view2.setPadding(bVarX8.f35793a + dimensionPixelSize2, dimensionPixelSize2, bVarX8.f35795c + dimensionPixelSize2, bVarX8.f35796d + dimensionPixelSize2);
                break;
            case 8:
                v3.b bVarX9 = nh.a.x(c2Var);
                view2.setPadding(bVarX9.f35793a, 0, bVarX9.f35795c, bVarX9.f35796d);
                break;
            default:
                int i12 = MainActivity.N;
                k.e(view, "v");
                v3.b bVarX10 = nh.a.x(c2Var);
                view2.setPadding(bVarX10.f35793a, bVarX10.f35794b, bVarX10.f35795c, 0);
                break;
        }
        return v0.j(view, c2Var);
    }
}
