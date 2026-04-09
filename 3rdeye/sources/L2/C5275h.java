package l2;

import T1.B;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.ads.banner.PhShimmerBannerAdView;
import java.util.ArrayList;
import java.util.List;
import t4.C5606d;
import y3.u;

/* compiled from: MaskKeyframeAnimation.java */
/* renamed from: l2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5275h implements A3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f43713b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f43714c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f43715d;

    public /* synthetic */ C5275h(Object obj, Object obj2, Object obj3) {
        this.f43713b = obj;
        this.f43714c = obj2;
        this.f43715d = obj3;
    }

    public static C5275h a(View view) {
        int i = i8.q.banner_container;
        if (((PhShimmerBannerAdView) B.f(i, view)) != null) {
            i = i8.q.fragment_container;
            FrameLayout frameLayout = (FrameLayout) B.f(i, view);
            if (frameLayout != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                Toolbar toolbar = (Toolbar) B.f(R.id.toolbar, view);
                if (toolbar != null) {
                    return new C5275h(linearLayout, frameLayout, toolbar);
                }
                i = R.id.toolbar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return new u(new C5606d(6), new B7.d(8), (D3.e) ((D3.d) this.f43713b).get(), (E3.j) ((E3.k) this.f43714c).get(), (E3.l) ((E3.m) this.f43715d).get());
    }

    public C5275h(List list) {
        this.f43715d = list;
        this.f43713b = new ArrayList(list.size());
        this.f43714c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.f43713b).add(new C5279l((List) ((p2.h) list.get(i)).f45043b.f2034b));
            ((ArrayList) this.f43714c).add(((p2.h) list.get(i)).f45044c.a());
        }
    }
}
