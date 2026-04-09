package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.DP;
import g.AbstractC2327a;
import java.lang.ref.WeakReference;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2346d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20317a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC2347e f20318b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f20319c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f20320d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f20321e;

    /* renamed from: f, reason: collision with root package name */
    public Button f20322f;

    /* renamed from: g, reason: collision with root package name */
    public Button f20323g;

    /* renamed from: h, reason: collision with root package name */
    public Button f20324h;
    public NestedScrollView i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f20325j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f20326k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f20327l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f20328m;

    /* renamed from: n, reason: collision with root package name */
    public View f20329n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f20330o;

    /* renamed from: q, reason: collision with root package name */
    public final int f20332q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20333r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20334s;

    /* renamed from: t, reason: collision with root package name */
    public final int f20335t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20336u;

    /* renamed from: v, reason: collision with root package name */
    public final DP f20337v;

    /* renamed from: p, reason: collision with root package name */
    public int f20331p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final A3.o f20338w = new A3.o(2, this);

    public C2346d(Context context, DialogInterfaceC2347e dialogInterfaceC2347e, Window window) {
        this.f20317a = context;
        this.f20318b = dialogInterfaceC2347e;
        this.f20319c = window;
        DP dp = new DP();
        dp.f7768b = new WeakReference(dialogInterfaceC2347e);
        this.f20337v = dp;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC2327a.f20118e, R.attr.alertDialogStyle, 0);
        this.f20332q = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f20333r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f20334s = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f20335t = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f20336u = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC2347e.c().j(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
