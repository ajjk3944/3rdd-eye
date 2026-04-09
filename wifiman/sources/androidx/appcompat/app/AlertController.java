package androidx.appcompat.app;

import F1.W;
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
import androidx.appcompat.widget.O;
import androidx.core.widget.NestedScrollView;
import h.AbstractC5927a;
import h.AbstractC5932f;
import h.AbstractC5936j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f26382A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f26384C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f26385D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f26386E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f26387F;

    /* renamed from: G, reason: collision with root package name */
    private View f26388G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f26389H;

    /* renamed from: J, reason: collision with root package name */
    private int f26391J;

    /* renamed from: K, reason: collision with root package name */
    private int f26392K;

    /* renamed from: L, reason: collision with root package name */
    int f26393L;

    /* renamed from: M, reason: collision with root package name */
    int f26394M;

    /* renamed from: N, reason: collision with root package name */
    int f26395N;

    /* renamed from: O, reason: collision with root package name */
    int f26396O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f26397P;

    /* renamed from: R, reason: collision with root package name */
    Handler f26399R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26401a;

    /* renamed from: b, reason: collision with root package name */
    final p f26402b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f26403c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26404d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f26405e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f26406f;

    /* renamed from: g, reason: collision with root package name */
    ListView f26407g;

    /* renamed from: h, reason: collision with root package name */
    private View f26408h;

    /* renamed from: i, reason: collision with root package name */
    private int f26409i;

    /* renamed from: j, reason: collision with root package name */
    private int f26410j;

    /* renamed from: k, reason: collision with root package name */
    private int f26411k;

    /* renamed from: l, reason: collision with root package name */
    private int f26412l;

    /* renamed from: m, reason: collision with root package name */
    private int f26413m;

    /* renamed from: o, reason: collision with root package name */
    Button f26415o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f26416p;

    /* renamed from: q, reason: collision with root package name */
    Message f26417q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f26418r;

    /* renamed from: s, reason: collision with root package name */
    Button f26419s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f26420t;

    /* renamed from: u, reason: collision with root package name */
    Message f26421u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f26422v;

    /* renamed from: w, reason: collision with root package name */
    Button f26423w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f26424x;

    /* renamed from: y, reason: collision with root package name */
    Message f26425y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f26426z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f26414n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f26383B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f26390I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f26398Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f26400S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        private final int f26427a;

        /* renamed from: b, reason: collision with root package name */
        private final int f26428b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC5936j.f48202c2);
            this.f26428b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5936j.f48207d2, -1);
            this.f26427a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC5936j.f48212e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f26427a, getPaddingRight(), z11 ? getPaddingBottom() : this.f26428b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f26415o || (message3 = alertController.f26417q) == null) ? (view != alertController.f26419s || (message2 = alertController.f26421u) == null) ? (view != alertController.f26423w || (message = alertController.f26425y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f26399R.obtainMessage(1, alertController2.f26402b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f26430A;

        /* renamed from: B, reason: collision with root package name */
        public int f26431B;

        /* renamed from: C, reason: collision with root package name */
        public int f26432C;

        /* renamed from: D, reason: collision with root package name */
        public int f26433D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f26435F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f26436G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f26437H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f26439J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f26440K;

        /* renamed from: L, reason: collision with root package name */
        public String f26441L;

        /* renamed from: M, reason: collision with root package name */
        public String f26442M;

        /* renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f26443N;

        /* renamed from: a, reason: collision with root package name */
        public final Context f26445a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f26446b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f26448d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f26450f;

        /* renamed from: g, reason: collision with root package name */
        public View f26451g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f26452h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f26453i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f26454j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f26455k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f26456l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f26457m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f26458n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f26459o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f26460p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f26461q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f26463s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f26464t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f26465u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f26466v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f26467w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f26468x;

        /* renamed from: y, reason: collision with root package name */
        public int f26469y;

        /* renamed from: z, reason: collision with root package name */
        public View f26470z;

        /* renamed from: c, reason: collision with root package name */
        public int f26447c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f26449e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f26434E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f26438I = -1;

        /* renamed from: O, reason: collision with root package name */
        public boolean f26444O = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f26462r = true;

        class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f26471a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f26471a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f26435F;
                if (zArr != null && zArr[i10]) {
                    this.f26471a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C1018b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            private final int f26473a;

            /* renamed from: b, reason: collision with root package name */
            private final int f26474b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f26475c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f26476d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1018b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f26475c = recycleListView;
                this.f26476d = alertController;
                Cursor cursor2 = getCursor();
                this.f26473a = cursor2.getColumnIndexOrThrow(b.this.f26441L);
                this.f26474b = cursor2.getColumnIndexOrThrow(b.this.f26442M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f26473a));
                this.f26475c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f26474b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f26446b.inflate(this.f26476d.f26394M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f26478a;

            c(AlertController alertController) {
                this.f26478a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f26468x.onClick(this.f26478a.f26402b, i10);
                if (b.this.f26437H) {
                    return;
                }
                this.f26478a.f26402b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f26480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f26481b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f26480a = recycleListView;
                this.f26481b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f26435F;
                if (zArr != null) {
                    zArr[i10] = this.f26480a.isItemChecked(i10);
                }
                b.this.f26439J.onClick(this.f26481b.f26402b, i10, this.f26480a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f26445a = context;
            this.f26446b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f26446b.inflate(alertController.f26393L, (ViewGroup) null);
            if (this.f26436G) {
                dVar = this.f26440K == null ? new a(this.f26445a, alertController.f26394M, R.id.text1, this.f26466v, recycleListView) : new C1018b(this.f26445a, this.f26440K, false, recycleListView, alertController);
            } else {
                int i10 = this.f26437H ? alertController.f26395N : alertController.f26396O;
                if (this.f26440K != null) {
                    dVar = new SimpleCursorAdapter(this.f26445a, i10, this.f26440K, new String[]{this.f26441L}, new int[]{R.id.text1});
                } else {
                    dVar = this.f26467w;
                    if (dVar == null) {
                        dVar = new d(this.f26445a, i10, R.id.text1, this.f26466v);
                    }
                }
            }
            alertController.f26389H = dVar;
            alertController.f26390I = this.f26438I;
            if (this.f26468x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f26439J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f26443N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f26437H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f26436G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f26407g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f26451g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f26450f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f26448d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f26447c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f26449e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f26452h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f26453i;
            if (charSequence3 != null || this.f26454j != null) {
                alertController.j(-1, charSequence3, this.f26455k, null, this.f26454j);
            }
            CharSequence charSequence4 = this.f26456l;
            if (charSequence4 != null || this.f26457m != null) {
                alertController.j(-2, charSequence4, this.f26458n, null, this.f26457m);
            }
            CharSequence charSequence5 = this.f26459o;
            if (charSequence5 != null || this.f26460p != null) {
                alertController.j(-3, charSequence5, this.f26461q, null, this.f26460p);
            }
            if (this.f26466v != null || this.f26440K != null || this.f26467w != null) {
                b(alertController);
            }
            View view2 = this.f26470z;
            if (view2 != null) {
                if (this.f26434E) {
                    alertController.s(view2, this.f26430A, this.f26431B, this.f26432C, this.f26433D);
                    return;
                } else {
                    alertController.r(view2);
                    return;
                }
            }
            int i12 = this.f26469y;
            if (i12 != 0) {
                alertController.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f26483a;

        public c(DialogInterface dialogInterface) {
            this.f26483a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f26483a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
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

    public AlertController(Context context, p pVar, Window window) {
        this.f26401a = context;
        this.f26402b = pVar;
        this.f26403c = window;
        this.f26399R = new c(pVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC5936j.f48105F, AbstractC5927a.f47948k, 0);
        this.f26391J = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48109G, 0);
        this.f26392K = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48117I, 0);
        this.f26393L = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48125K, 0);
        this.f26394M = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48129L, 0);
        this.f26395N = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48137N, 0);
        this.f26396O = typedArrayObtainStyledAttributes.getResourceId(AbstractC5936j.f48121J, 0);
        this.f26397P = typedArrayObtainStyledAttributes.getBoolean(AbstractC5936j.f48133M, true);
        this.f26404d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5936j.f48113H, 0);
        typedArrayObtainStyledAttributes.recycle();
        pVar.l(1);
    }

    static boolean a(View view) {
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

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
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

    private int i() {
        int i10 = this.f26392K;
        return (i10 != 0 && this.f26398Q == 1) ? i10 : this.f26391J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f26403c.findViewById(AbstractC5932f.f48047t);
        View viewFindViewById2 = this.f26403c.findViewById(AbstractC5932f.f48046s);
        W.B0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f26415o = button;
        button.setOnClickListener(this.f26400S);
        if (TextUtils.isEmpty(this.f26416p) && this.f26418r == null) {
            this.f26415o.setVisibility(8);
            i10 = 0;
        } else {
            this.f26415o.setText(this.f26416p);
            Drawable drawable = this.f26418r;
            if (drawable != null) {
                int i11 = this.f26404d;
                drawable.setBounds(0, 0, i11, i11);
                this.f26415o.setCompoundDrawables(this.f26418r, null, null, null);
            }
            this.f26415o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f26419s = button2;
        button2.setOnClickListener(this.f26400S);
        if (TextUtils.isEmpty(this.f26420t) && this.f26422v == null) {
            this.f26419s.setVisibility(8);
        } else {
            this.f26419s.setText(this.f26420t);
            Drawable drawable2 = this.f26422v;
            if (drawable2 != null) {
                int i12 = this.f26404d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f26419s.setCompoundDrawables(this.f26422v, null, null, null);
            }
            this.f26419s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f26423w = button3;
        button3.setOnClickListener(this.f26400S);
        if (TextUtils.isEmpty(this.f26424x) && this.f26426z == null) {
            this.f26423w.setVisibility(8);
        } else {
            this.f26423w.setText(this.f26424x);
            Drawable drawable3 = this.f26426z;
            if (drawable3 != null) {
                int i13 = this.f26404d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f26423w.setCompoundDrawables(this.f26426z, null, null, null);
            }
            this.f26423w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f26401a)) {
            if (i10 == 1) {
                b(this.f26415o);
            } else if (i10 == 2) {
                b(this.f26419s);
            } else if (i10 == 4) {
                b(this.f26423w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f26403c.findViewById(AbstractC5932f.f48048u);
        this.f26382A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f26382A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f26387F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f26406f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f26382A.removeView(this.f26387F);
        if (this.f26407g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f26382A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f26382A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f26407g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f26408h;
        if (viewInflate == null) {
            viewInflate = this.f26409i != 0 ? LayoutInflater.from(this.f26401a).inflate(this.f26409i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f26403c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f26403c.findViewById(AbstractC5932f.f48041n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f26414n) {
            frameLayout.setPadding(this.f26410j, this.f26411k, this.f26412l, this.f26413m);
        }
        if (this.f26407g != null) {
            ((LinearLayout.LayoutParams) ((O.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f26388G != null) {
            viewGroup.addView(this.f26388G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f26403c.findViewById(AbstractC5932f.f48026D).setVisibility(8);
            return;
        }
        this.f26385D = (ImageView) this.f26403c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f26405e) || !this.f26397P) {
            this.f26403c.findViewById(AbstractC5932f.f48026D).setVisibility(8);
            this.f26385D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f26403c.findViewById(AbstractC5932f.f48037j);
        this.f26386E = textView;
        textView.setText(this.f26405e);
        int i10 = this.f26383B;
        if (i10 != 0) {
            this.f26385D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f26384C;
        if (drawable != null) {
            this.f26385D.setImageDrawable(drawable);
        } else {
            this.f26386E.setPadding(this.f26385D.getPaddingLeft(), this.f26385D.getPaddingTop(), this.f26385D.getPaddingRight(), this.f26385D.getPaddingBottom());
            this.f26385D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f26403c.findViewById(AbstractC5932f.f48045r);
        int i10 = AbstractC5932f.f48027E;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = AbstractC5932f.f48040m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = AbstractC5932f.f48038k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(AbstractC5932f.f48042o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(AbstractC5932f.f48053z)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f26382A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f26406f == null && this.f26407g == null) ? null : viewGroupH.findViewById(AbstractC5932f.f48025C);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(AbstractC5932f.f48023A)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f26407g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f26407g;
            if (view == null) {
                view = this.f26382A;
            }
            if (view != null) {
                o(viewGroupH2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f26407g;
        if (listView2 == null || (listAdapter = this.f26389H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f26390I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5927a.f47947j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f26401a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f26407g;
    }

    public void e() {
        this.f26402b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f26382A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f26382A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f26399R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f26424x = charSequence;
            this.f26425y = message;
            this.f26426z = drawable;
        } else if (i10 == -2) {
            this.f26420t = charSequence;
            this.f26421u = message;
            this.f26422v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f26416p = charSequence;
            this.f26417q = message;
            this.f26418r = drawable;
        }
    }

    public void k(View view) {
        this.f26388G = view;
    }

    public void l(int i10) {
        this.f26384C = null;
        this.f26383B = i10;
        ImageView imageView = this.f26385D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f26385D.setImageResource(this.f26383B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f26384C = drawable;
        this.f26383B = 0;
        ImageView imageView = this.f26385D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f26385D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f26406f = charSequence;
        TextView textView = this.f26387F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f26405e = charSequence;
        TextView textView = this.f26386E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f26408h = null;
        this.f26409i = i10;
        this.f26414n = false;
    }

    public void r(View view) {
        this.f26408h = view;
        this.f26409i = 0;
        this.f26414n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f26408h = view;
        this.f26409i = 0;
        this.f26414n = true;
        this.f26410j = i10;
        this.f26411k = i11;
        this.f26412l = i12;
        this.f26413m = i13;
    }
}
