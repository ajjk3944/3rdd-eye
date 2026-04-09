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
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final c F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11021a;

    /* renamed from: b, reason: collision with root package name */
    public final g f11022b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f11023c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f11024d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f11025e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f11026f;

    /* renamed from: g, reason: collision with root package name */
    public View f11027g;

    /* renamed from: h, reason: collision with root package name */
    public int f11028h;
    public Button j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public Message f11030l;

    /* renamed from: m, reason: collision with root package name */
    public Button f11031m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f11032n;

    /* renamed from: o, reason: collision with root package name */
    public Message f11033o;

    /* renamed from: p, reason: collision with root package name */
    public Button f11034p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f11035q;

    /* renamed from: r, reason: collision with root package name */
    public Message f11036r;

    /* renamed from: s, reason: collision with root package name */
    public NestedScrollView f11037s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f11038t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f11039u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f11040v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f11041w;

    /* renamed from: x, reason: collision with root package name */
    public View f11042x;

    /* renamed from: y, reason: collision with root package name */
    public ListAdapter f11043y;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11029i = false;

    /* renamed from: z, reason: collision with root package name */
    public int f11044z = -1;
    public final com.google.android.exoplayer2.ui.e0 G = new com.google.android.exoplayer2.ui.e0(3, this);

    public e(Context context, g gVar, Window window) {
        this.f11021a = context;
        this.f11022b = gVar;
        this.f11023c = window;
        c cVar = new c();
        cVar.f11008b = new WeakReference(gVar);
        this.F = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.j.AlertDialog, h.a.alertDialogStyle, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_android_layout, 0);
        typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_buttonPanelSideLayout, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_multiChoiceItemLayout, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_singleChoiceItemLayout, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(h.j.AlertDialog_listItemLayout, 0);
        this.E = typedArrayObtainStyledAttributes.getBoolean(h.j.AlertDialog_showTitle, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.c().f(1);
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

    public final void c(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.F.obtainMessage(i10, onClickListener) : null;
        if (i10 == -3) {
            this.f11035q = charSequence;
            this.f11036r = messageObtainMessage;
        } else if (i10 == -2) {
            this.f11032n = charSequence;
            this.f11033o = messageObtainMessage;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.k = charSequence;
            this.f11030l = messageObtainMessage;
        }
    }
}
