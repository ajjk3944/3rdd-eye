package e4;

import android.R;
import android.content.res.Resources;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22300a;

    /* renamed from: b, reason: collision with root package name */
    public final View f22301b;

    public /* synthetic */ a0(int i4, View view) {
        this.f22300a = i4;
        this.f22301b = view;
    }

    public void a() {
        View view = this.f22301b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void b() {
        View viewFindViewById;
        View view = this.f22301b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new z(0, viewFindViewById));
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        switch (this.f22300a) {
            case 1:
                v3.b bVarX = nh.a.x(c2Var);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.toolbar_height);
                this.f22301b.setPadding(bVarX.f35793a, dimensionPixelSize + bVarX.f35794b, bVarX.f35795c, bVarX.f35796d);
                break;
            case 2:
                v3.b bVarX2 = nh.a.x(c2Var);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.toolbar_height);
                this.f22301b.setPadding(bVarX2.f35793a, dimensionPixelSize2 + bVarX2.f35794b, bVarX2.f35795c, bVarX2.f35796d);
                break;
            default:
                v3.b bVarX3 = nh.a.x(c2Var);
                int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(com.liuzh.deviceinfo.R.dimen.toolbar_height);
                this.f22301b.setPadding(bVarX3.f35793a, dimensionPixelSize3 + bVarX3.f35794b, bVarX3.f35795c, 0);
                break;
        }
        return v0.j(view, c2Var);
    }
}
