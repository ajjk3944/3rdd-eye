package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
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
import com.google.android.gms.internal.ads.vw1;
import com.liuzh.deviceinfo.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final vw1 F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25252a;

    /* renamed from: b, reason: collision with root package name */
    public final e f25253b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f25254c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f25255d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f25256e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f25257f;
    public View g;

    /* renamed from: h, reason: collision with root package name */
    public int f25258h;
    public Button j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f25260k;

    /* renamed from: l, reason: collision with root package name */
    public Message f25261l;

    /* renamed from: m, reason: collision with root package name */
    public Button f25262m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f25263n;

    /* renamed from: o, reason: collision with root package name */
    public Message f25264o;

    /* renamed from: p, reason: collision with root package name */
    public Button f25265p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f25266q;

    /* renamed from: r, reason: collision with root package name */
    public Message f25267r;

    /* renamed from: s, reason: collision with root package name */
    public NestedScrollView f25268s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f25269t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f25270u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f25271v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f25272w;

    /* renamed from: x, reason: collision with root package name */
    public View f25273x;

    /* renamed from: y, reason: collision with root package name */
    public ListAdapter f25274y;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25259i = false;

    /* renamed from: z, reason: collision with root package name */
    public int f25275z = -1;
    public final aa.j G = new aa.j(2, this);

    public d(Context context, e eVar, Window window) {
        this.f25252a = context;
        this.f25253b = eVar;
        this.f25254c = window;
        vw1 vw1Var = new vw1();
        vw1Var.f17751b = new WeakReference(eVar);
        this.F = vw1Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.a.f24780e, R.attr.alertDialogStyle, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        eVar.d().h(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
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

    public final void c(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.F.obtainMessage(i4, onClickListener) : null;
        if (i4 == -3) {
            this.f25266q = charSequence;
            this.f25267r = messageObtainMessage;
        } else if (i4 == -2) {
            this.f25263n = charSequence;
            this.f25264o = messageObtainMessage;
        } else {
            if (i4 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f25260k = charSequence;
            this.f25261l = messageObtainMessage;
        }
    }
}
