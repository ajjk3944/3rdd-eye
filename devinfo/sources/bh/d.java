package bh;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import e4.c2;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements f.b, e4.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccountProActivity f2192a;

    public /* synthetic */ d(AccountProActivity accountProActivity) {
        this.f2192a = accountProActivity;
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) throws Resources.NotFoundException {
        int i4 = AccountProActivity.H;
        nk.k.e(view, "v");
        v3.b bVarX = nh.a.x(c2Var);
        int i10 = bVarX.f35796d;
        int i11 = bVarX.f35795c;
        int i12 = bVarX.f35793a;
        AccountProActivity accountProActivity = this.f2192a;
        qg.a aVar = accountProActivity.D;
        if (aVar == null) {
            nk.k.k("binding");
            throw null;
        }
        zh.i.a(aVar.f32320u, bVarX);
        qg.a aVar2 = accountProActivity.D;
        if (aVar2 == null) {
            nk.k.k("binding");
            throw null;
        }
        Toolbar toolbar = aVar2.f32320u;
        toolbar.setPadding(i12, bVarX.f35794b, i11, toolbar.getPaddingBottom());
        qg.a aVar3 = accountProActivity.D;
        if (aVar3 == null) {
            nk.k.k("binding");
            throw null;
        }
        ScrollView scrollView = aVar3.f32317r;
        if (aVar3 == null) {
            nk.k.k("binding");
            throw null;
        }
        scrollView.setPadding(i12, aVar3.f32320u.getLayoutParams().height, i11, i10);
        int dimensionPixelSize = accountProActivity.getResources().getDimensionPixelSize(R.dimen.content_padding_x1_5);
        qg.a aVar4 = accountProActivity.D;
        if (aVar4 == null) {
            nk.k.k("binding");
            throw null;
        }
        Button button = aVar4.f32304c;
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i13 = i10 + dimensionPixelSize;
        marginLayoutParams.bottomMargin = i13;
        int i14 = i12 + dimensionPixelSize;
        marginLayoutParams.leftMargin = i14;
        int i15 = dimensionPixelSize + i11;
        marginLayoutParams.rightMargin = i15;
        button.setLayoutParams(marginLayoutParams);
        qg.a aVar5 = accountProActivity.D;
        if (aVar5 == null) {
            nk.k.k("binding");
            throw null;
        }
        ProgressBar progressBar = aVar5.f32316q;
        ViewGroup.LayoutParams layoutParams2 = progressBar.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i13;
        marginLayoutParams2.leftMargin = i14;
        marginLayoutParams2.rightMargin = i15;
        progressBar.setLayoutParams(marginLayoutParams2);
        return v0.j(view, c2Var);
    }

    @Override // f.b
    public void k(Object obj) {
        int i4 = AccountProActivity.H;
        nk.k.e((yj.u) obj, "it");
        this.f2192a.D();
    }
}
