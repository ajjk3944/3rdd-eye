package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import androidx.core.widget.NestedScrollView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;
import java.lang.ref.WeakReference;
import n1.d;

/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: A, reason: collision with root package name */
    public final int f14279A;

    /* renamed from: B, reason: collision with root package name */
    public final int f14280B;

    /* renamed from: C, reason: collision with root package name */
    public final int f14281C;

    /* renamed from: D, reason: collision with root package name */
    public final int f14282D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f14283E;

    /* renamed from: F, reason: collision with root package name */
    public final c f14284F;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14286a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.d f14287b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f14288c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f14289d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14290e;

    /* renamed from: f, reason: collision with root package name */
    public RecycleListView f14291f;

    /* renamed from: g, reason: collision with root package name */
    public View f14292g;
    public Button i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f14294j;

    /* renamed from: k, reason: collision with root package name */
    public Message f14295k;

    /* renamed from: l, reason: collision with root package name */
    public Button f14296l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f14297m;

    /* renamed from: n, reason: collision with root package name */
    public Message f14298n;

    /* renamed from: o, reason: collision with root package name */
    public Button f14299o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f14300p;

    /* renamed from: q, reason: collision with root package name */
    public Message f14301q;

    /* renamed from: r, reason: collision with root package name */
    public NestedScrollView f14302r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f14303s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f14304t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f14305u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f14306v;

    /* renamed from: w, reason: collision with root package name */
    public View f14307w;

    /* renamed from: x, reason: collision with root package name */
    public ListAdapter f14308x;

    /* renamed from: z, reason: collision with root package name */
    public final int f14310z;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14293h = false;

    /* renamed from: y, reason: collision with root package name */
    public int f14309y = -1;

    /* renamed from: G, reason: collision with root package name */
    public final a f14285G = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: b, reason: collision with root package name */
        public final int f14311b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14312c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4353a.f37894t);
            this.f14312c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f14311b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.i || (message3 = alertController.f14295k) == null) ? (view != alertController.f14296l || (message2 = alertController.f14298n) == null) ? (view != alertController.f14299o || (message = alertController.f14301q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            alertController.f14284F.obtainMessage(1, alertController.f14287b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ContextThemeWrapper f14314a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f14315b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f14316c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f14317d;

        /* renamed from: e, reason: collision with root package name */
        public View f14318e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f14319f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f14320g;

        /* renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f14321h;
        public CharSequence i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f14322j;

        /* renamed from: k, reason: collision with root package name */
        public g f14323k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence[] f14324l;

        /* renamed from: m, reason: collision with root package name */
        public Object f14325m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f14326n;

        /* renamed from: o, reason: collision with root package name */
        public View f14327o;

        /* renamed from: p, reason: collision with root package name */
        public boolean[] f14328p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f14329q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f14330r;

        /* renamed from: s, reason: collision with root package name */
        public int f14331s = -1;

        /* renamed from: t, reason: collision with root package name */
        public d.a f14332t;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f14314a = contextThemeWrapper;
            this.f14315b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f14333a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f14333a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, androidx.appcompat.app.d dVar, Window window) {
        this.f14286a = context;
        this.f14287b = dVar;
        this.f14288c = window;
        c cVar = new c();
        cVar.f14333a = new WeakReference<>(dVar);
        this.f14284F = cVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C4353a.f37880e, R.attr.alertDialogStyle, 0);
        this.f14310z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f14279A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f14280B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f14281C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f14282D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f14283E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dVar.c().w(1);
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

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f14284F.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f14300p = charSequence;
            this.f14301q = messageObtainMessage;
        } else if (i == -2) {
            this.f14297m = charSequence;
            this.f14298n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f14294j = charSequence;
            this.f14295k = messageObtainMessage;
        }
    }
}
