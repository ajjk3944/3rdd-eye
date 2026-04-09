package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* renamed from: a, reason: collision with root package name */
    public final Context f337a;

    /* renamed from: b, reason: collision with root package name */
    public final u f338b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f340d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f341e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f342f;

    /* renamed from: g, reason: collision with root package name */
    public ListView f343g;

    /* renamed from: h, reason: collision with root package name */
    public View f344h;

    /* renamed from: i, reason: collision with root package name */
    public int f345i;

    /* renamed from: j, reason: collision with root package name */
    public int f346j;

    /* renamed from: k, reason: collision with root package name */
    public int f347k;

    /* renamed from: l, reason: collision with root package name */
    public int f348l;

    /* renamed from: m, reason: collision with root package name */
    public int f349m;

    /* renamed from: o, reason: collision with root package name */
    public Button f351o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f352p;

    /* renamed from: q, reason: collision with root package name */
    public Message f353q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f354r;

    /* renamed from: s, reason: collision with root package name */
    public Button f355s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f356t;

    /* renamed from: u, reason: collision with root package name */
    public Message f357u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f358v;

    /* renamed from: w, reason: collision with root package name */
    public Button f359w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f360x;

    /* renamed from: y, reason: collision with root package name */
    public Message f361y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f362z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f350n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        public final int f363a;

        /* renamed from: b, reason: collision with root package name */
        public final int f364b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f363a, getPaddingRight(), z11 ? getPaddingBottom() : this.f364b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.RecycleListView);
            this.f364b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.RecycleListView_paddingBottomNoButtons, -1);
            this.f363a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f351o || (message3 = alertController.f353q) == null) ? (view != alertController.f355s || (message2 = alertController.f357u) == null) ? (view != alertController.f359w || (message = alertController.f361y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f338b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f366a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f367b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f369d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f371f;

        /* renamed from: g, reason: collision with root package name */
        public View f372g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f373h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f374i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f375j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f376k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f377l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f378m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f379n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f380o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f381p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f382q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f384s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f385t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f386u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f387v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f388w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f389x;

        /* renamed from: y, reason: collision with root package name */
        public int f390y;

        /* renamed from: z, reason: collision with root package name */
        public View f391z;

        /* renamed from: c, reason: collision with root package name */
        public int f368c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f370e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f383r = true;

        public class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f392a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f392a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f392a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        public class C0005b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final int f394a;

            /* renamed from: b, reason: collision with root package name */
            public final int f395b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f396c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f397d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0005b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f396c = recycleListView;
                this.f397d = alertController;
                Cursor cursor2 = getCursor();
                this.f394a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f395b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f394a));
                this.f396c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f395b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f367b.inflate(this.f397d.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f399a;

            public c(AlertController alertController) {
                this.f399a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f389x.onClick(this.f399a.f338b, i10);
                if (b.this.H) {
                    return;
                }
                this.f399a.f338b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f401a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f402b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f401a = recycleListView;
                this.f402b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f401a.isItemChecked(i10);
                }
                b.this.J.onClick(this.f402b.f338b, i10, this.f401a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f366a = context;
            this.f367b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f372g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f371f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f369d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f368c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f370e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f373h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f374i;
            if (charSequence3 == null && this.f375j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f376k, null, this.f375j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f377l;
            if (charSequence4 != null || this.f378m != null) {
                alertController2.k(-2, charSequence4, this.f379n, null, this.f378m);
            }
            CharSequence charSequence5 = this.f380o;
            if (charSequence5 != null || this.f381p != null) {
                alertController2.k(-3, charSequence5, this.f382q, null, this.f381p);
            }
            if (this.f387v != null || this.K != null || this.f388w != null) {
                b(alertController2);
            }
            View view2 = this.f391z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f390y;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }

        public final void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f367b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f366a, i10, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f388w;
                    if (dVar == null) {
                        dVar = new d(bVar.f366a, i10, R.id.text1, bVar.f387v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f366a, alertController.M, R.id.text1, this.f387v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0005b(bVar.f366a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f389x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f343g = recycleListView;
        }
    }

    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f404a;

        public c(DialogInterface dialogInterface) {
            this.f404a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f404a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, u uVar, Window window) {
        this.f337a = context;
        this.f338b = uVar;
        this.f339c = window;
        this.R = new c(uVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, c.j.AlertDialog, c.a.alertDialogStyle, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_android_layout, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_listLayout, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(c.j.AlertDialog_listItemLayout, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(c.j.AlertDialog_showTitle, true);
        this.f340d = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        uVar.h(1);
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

    public static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(c.a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f359w;
        }
        if (i10 == -2) {
            return this.f355s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f351o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f337a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f343g;
    }

    public void f() {
        this.f338b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup i(View view, View view2) {
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

    public final int j() {
        int i10 = this.K;
        return i10 == 0 ? this.J : this.Q == 1 ? i10 : this.J;
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f360x = charSequence;
            this.f361y = message;
            this.f362z = drawable;
        } else if (i10 == -2) {
            this.f356t = charSequence;
            this.f357u = message;
            this.f358v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f352p = charSequence;
            this.f353q = message;
            this.f354r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f342f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f339c.findViewById(c.f.scrollIndicatorUp);
        View viewFindViewById2 = this.f339c.findViewById(c.f.scrollIndicatorDown);
        ViewCompat.w0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f341e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f344h = null;
        this.f345i = i10;
        this.f350n = false;
    }

    public void s(View view) {
        this.f344h = view;
        this.f345i = 0;
        this.f350n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f344h = view;
        this.f345i = 0;
        this.f350n = true;
        this.f346j = i10;
        this.f347k = i11;
        this.f348l = i12;
        this.f349m = i13;
    }

    public final void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f351o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f352p) && this.f354r == null) {
            this.f351o.setVisibility(8);
            i10 = 0;
        } else {
            this.f351o.setText(this.f352p);
            Drawable drawable = this.f354r;
            if (drawable != null) {
                int i11 = this.f340d;
                drawable.setBounds(0, 0, i11, i11);
                this.f351o.setCompoundDrawables(this.f354r, null, null, null);
            }
            this.f351o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f355s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f356t) && this.f358v == null) {
            this.f355s.setVisibility(8);
        } else {
            this.f355s.setText(this.f356t);
            Drawable drawable2 = this.f358v;
            if (drawable2 != null) {
                int i12 = this.f340d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f355s.setCompoundDrawables(this.f358v, null, null, null);
            }
            this.f355s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f359w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f360x) && this.f362z == null) {
            this.f359w.setVisibility(8);
        } else {
            this.f359w.setText(this.f360x);
            Drawable drawable3 = this.f362z;
            if (drawable3 != null) {
                int i13 = this.f340d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f359w.setCompoundDrawables(this.f362z, null, null, null);
            }
            this.f359w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f337a)) {
            if (i10 == 1) {
                b(this.f351o);
            } else if (i10 == 2) {
                b(this.f355s);
            } else if (i10 == 4) {
                b(this.f359w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f339c.findViewById(c.f.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f342f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f343g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f343g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void w(ViewGroup viewGroup) {
        View viewInflate = this.f344h;
        if (viewInflate == null) {
            viewInflate = this.f345i != 0 ? LayoutInflater.from(this.f337a).inflate(this.f345i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f339c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f339c.findViewById(c.f.custom);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f350n) {
            frameLayout.setPadding(this.f346j, this.f347k, this.f348l, this.f349m);
        }
        if (this.f343g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f339c.findViewById(c.f.title_template).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f339c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f341e) || !this.P) {
            this.f339c.findViewById(c.f.title_template).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f339c.findViewById(c.f.alertTitle);
        this.E = textView;
        textView.setText(this.f341e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f339c.findViewById(c.f.parentPanel);
        int i10 = c.f.topPanel;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = c.f.contentPanel;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = c.f.buttonPanel;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(c.f.customPanel);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(c.f.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f342f == null && this.f343g == null) ? null : viewGroupI.findViewById(c.f.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(c.f.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f343g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f343g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f343g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }
}
