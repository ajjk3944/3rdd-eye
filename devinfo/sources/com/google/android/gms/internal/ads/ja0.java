package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface ja0 {
    void K();

    int M1();

    void a(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void b(View view);

    JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void d(Bundle bundle);

    void e();

    void g(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType);

    void h(va.j1 j1Var);

    boolean i();

    void j(View view);

    void k(vn vnVar);

    void l();

    JSONObject m(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i4);

    void o(Bundle bundle);

    void p(va.l1 l1Var);

    void q(String str);

    void s(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void t(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void u();

    boolean v(Bundle bundle);

    void w(View view, MotionEvent motionEvent);

    void z();

    boolean z1();
}
