package oi;

import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.widget.WidgetsActivity;
import e4.c2;
import e4.s;
import e4.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f30572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScrollView f30573c;

    public /* synthetic */ h(Toolbar toolbar, ScrollView scrollView, int i4) {
        this.f30571a = i4;
        this.f30572b = toolbar;
        this.f30573c = scrollView;
    }

    @Override // e4.s
    public final c2 j(View view, c2 c2Var) {
        int i4 = this.f30571a;
        ScrollView scrollView = this.f30573c;
        Toolbar toolbar = this.f30572b;
        switch (i4) {
            case 0:
                int i10 = WidgetsActivity.B;
                v3.b bVarX = nh.a.x(c2Var);
                zh.i.a(toolbar, bVarX);
                scrollView.setPadding(bVarX.f35793a, toolbar.getLayoutParams().height, bVarX.f35795c, bVarX.f35796d);
                break;
            default:
                int i11 = MonitorActivity.B;
                v3.b bVarX2 = nh.a.x(c2Var);
                zh.i.a(toolbar, bVarX2);
                scrollView.setPadding(bVarX2.f35793a, toolbar.getLayoutParams().height, bVarX2.f35795c, bVarX2.f35796d);
                break;
        }
        return v0.j(view, c2Var);
    }
}
