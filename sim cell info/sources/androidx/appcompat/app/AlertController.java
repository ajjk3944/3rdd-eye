package androidx.appcompat.app;

import a.j;
import a0.s;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.widget.AbsListView;
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
import android.widget.TextView;
import androidx.appcompat.widget.i0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f276a;

    /* renamed from: b, reason: collision with root package name */
    final b.b f277b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f278c;

    /* renamed from: d, reason: collision with root package name */
    private final int f279d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f280e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f281f;

    /* renamed from: g, reason: collision with root package name */
    ListView f282g;

    /* renamed from: h, reason: collision with root package name */
    private View f283h;

    /* renamed from: i, reason: collision with root package name */
    private int f284i;

    /* renamed from: j, reason: collision with root package name */
    private int f285j;

    /* renamed from: k, reason: collision with root package name */
    private int f286k;

    /* renamed from: l, reason: collision with root package name */
    private int f287l;

    /* renamed from: m, reason: collision with root package name */
    private int f288m;

    /* renamed from: o, reason: collision with root package name */
    Button f290o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f291p;

    /* renamed from: q, reason: collision with root package name */
    Message f292q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f293r;

    /* renamed from: s, reason: collision with root package name */
    Button f294s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f295t;

    /* renamed from: u, reason: collision with root package name */
    Message f296u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f297v;

    /* renamed from: w, reason: collision with root package name */
    Button f298w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f299x;

    /* renamed from: y, reason: collision with root package name */
    Message f300y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f301z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f289n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: b, reason: collision with root package name */
        private final int f302b;

        /* renamed from: c, reason: collision with root package name */
        private final int f303c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f2);
            this.f303c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.g2, -1);
            this.f302b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.h2, -1);
        }

        public void a(boolean z2, boolean z3) {
            if (z3 && z2) {
                return;
            }
            setPadding(getPaddingLeft(), z2 ? getPaddingTop() : this.f302b, getPaddingRight(), z3 ? getPaddingBottom() : this.f303c);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f290o || (message2 = alertController.f292q) == null) && (view != alertController.f294s || (message2 = alertController.f296u) == null)) ? (view != alertController.f298w || (message = alertController.f300y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f277b).sendToTarget();
        }
    }

    class b implements NestedScrollView.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f306b;

        b(View view, View view2) {
            this.f305a = view;
            this.f306b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.b
        public void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.f(nestedScrollView, this.f305a, this.f306b);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f308b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f309c;

        c(View view, View view2) {
            this.f308b = view;
            this.f309c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.A, this.f308b, this.f309c);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f311a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f312b;

        d(View view, View view2) {
            this.f311a = view;
            this.f312b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.f(absListView, this.f311a, this.f312b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f315c;

        e(View view, View view2) {
            this.f314b = view;
            this.f315c = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.f(AlertController.this.f282g, this.f314b, this.f315c);
        }
    }

    public static class f {
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
        public e O;

        /* renamed from: a, reason: collision with root package name */
        public final Context f317a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f318b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f320d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f322f;

        /* renamed from: g, reason: collision with root package name */
        public View f323g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f324h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f325i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f326j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f327k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f328l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f329m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f330n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f331o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f332p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f333q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f335s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f336t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f337u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f338v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f339w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f340x;

        /* renamed from: y, reason: collision with root package name */
        public int f341y;

        /* renamed from: z, reason: collision with root package name */
        public View f342z;

        /* renamed from: c, reason: collision with root package name */
        public int f319c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f321e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f334r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f343b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f343b = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i2]) {
                    this.f343b.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* renamed from: b, reason: collision with root package name */
            private final int f345b;

            /* renamed from: c, reason: collision with root package name */
            private final int f346c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecycleListView f347d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ AlertController f348e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z2, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z2);
                this.f347d = recycleListView;
                this.f348e = alertController;
                Cursor cursor2 = getCursor();
                this.f345b = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f346c = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f345b));
                this.f347d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f346c) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f318b.inflate(this.f348e.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f350b;

            c(AlertController alertController) {
                this.f350b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                f.this.f340x.onClick(this.f350b.f277b, i2);
                if (f.this.H) {
                    return;
                }
                this.f350b.f277b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecycleListView f352b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AlertController f353c;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f352b = recycleListView;
                this.f353c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i2] = this.f352b.isItemChecked(i2);
                }
                f.this.J.onClick(this.f353c.f277b, i2, this.f352b.isItemChecked(i2));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f317a = context;
            this.f318b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f318b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f317a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f338v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f317a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f317a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f339w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f317a
                java.lang.CharSequence[] r3 = r10.f338v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f340x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f282g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f323g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f322f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f320d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i2 = this.f319c;
                if (i2 != 0) {
                    alertController.m(i2);
                }
                int i3 = this.f321e;
                if (i3 != 0) {
                    alertController.m(alertController.c(i3));
                }
            }
            CharSequence charSequence2 = this.f324h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f325i;
            if (charSequence3 != null || this.f326j != null) {
                alertController.k(-1, charSequence3, this.f327k, null, this.f326j);
            }
            CharSequence charSequence4 = this.f328l;
            if (charSequence4 != null || this.f329m != null) {
                alertController.k(-2, charSequence4, this.f330n, null, this.f329m);
            }
            CharSequence charSequence5 = this.f331o;
            if (charSequence5 != null || this.f332p != null) {
                alertController.k(-3, charSequence5, this.f333q, null, this.f332p);
            }
            if (this.f338v != null || this.K != null || this.f339w != null) {
                b(alertController);
            }
            View view2 = this.f342z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i4 = this.f341y;
            if (i4 != 0) {
                alertController.r(i4);
            }
        }
    }

    private static final class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f355a;

        public g(DialogInterface dialogInterface) {
            this.f355a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f355a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, b.b bVar, Window window) {
        this.f276a = context;
        this.f277b = bVar;
        this.f278c = window;
        this.R = new g(bVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.F, a.a.f13n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.M, true);
        this.f279d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        bVar.d(1);
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

    static void f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup i(View view, View view2) {
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

    private int j() {
        int i2 = this.K;
        return (i2 != 0 && this.Q == 1) ? i2 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f278c.findViewById(a.f.f93v);
        View viewFindViewById2 = this.f278c.findViewById(a.f.f92u);
        if (Build.VERSION.SDK_INT >= 23) {
            s.Y(view, i2, i3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 == null) {
                return;
            }
        } else {
            if (viewFindViewById != null && (i2 & 1) == 0) {
                viewGroup.removeView(viewFindViewById);
                viewFindViewById = null;
            }
            if (viewFindViewById2 != null && (i2 & 2) == 0) {
                viewGroup.removeView(viewFindViewById2);
                viewFindViewById2 = null;
            }
            if (viewFindViewById == null && viewFindViewById2 == null) {
                return;
            }
            if (this.f281f != null) {
                this.A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
                this.A.post(new c(viewFindViewById, viewFindViewById2));
                return;
            }
            ListView listView = this.f282g;
            if (listView != null) {
                listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
                this.f282g.post(new e(viewFindViewById, viewFindViewById2));
                return;
            } else {
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (viewFindViewById2 == null) {
                    return;
                }
            }
        }
        viewGroup.removeView(viewFindViewById2);
    }

    private void u(ViewGroup viewGroup) {
        int i2;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f290o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f291p) && this.f293r == null) {
            this.f290o.setVisibility(8);
            i2 = 0;
        } else {
            this.f290o.setText(this.f291p);
            Drawable drawable = this.f293r;
            if (drawable != null) {
                int i3 = this.f279d;
                drawable.setBounds(0, 0, i3, i3);
                this.f290o.setCompoundDrawables(this.f293r, null, null, null);
            }
            this.f290o.setVisibility(0);
            i2 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f294s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f295t) && this.f297v == null) {
            this.f294s.setVisibility(8);
        } else {
            this.f294s.setText(this.f295t);
            Drawable drawable2 = this.f297v;
            if (drawable2 != null) {
                int i4 = this.f279d;
                drawable2.setBounds(0, 0, i4, i4);
                this.f294s.setCompoundDrawables(this.f297v, null, null, null);
            }
            this.f294s.setVisibility(0);
            i2 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f298w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f299x) && this.f301z == null) {
            this.f298w.setVisibility(8);
        } else {
            this.f298w.setText(this.f299x);
            Drawable drawable3 = this.f293r;
            if (drawable3 != null) {
                int i5 = this.f279d;
                drawable3.setBounds(0, 0, i5, i5);
                this.f290o.setCompoundDrawables(this.f293r, null, null, null);
            }
            this.f298w.setVisibility(0);
            i2 |= 4;
        }
        if (z(this.f276a)) {
            if (i2 == 1) {
                button = this.f290o;
            } else if (i2 == 2) {
                button = this.f294s;
            } else if (i2 == 4) {
                button = this.f298w;
            }
            b(button);
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f278c.findViewById(a.f.f94w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f281f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f282g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f282g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f283h;
        if (viewInflate == null) {
            viewInflate = this.f284i != 0 ? LayoutInflater.from(this.f276a).inflate(this.f284i, viewGroup, false) : null;
        }
        boolean z2 = viewInflate != null;
        if (!z2 || !a(viewInflate)) {
            this.f278c.setFlags(131072, 131072);
        }
        if (!z2) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f278c.findViewById(a.f.f85n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f289n) {
            frameLayout.setPadding(this.f285j, this.f286k, this.f287l, this.f288m);
        }
        if (this.f282g != null) {
            ((i0.a) viewGroup.getLayoutParams()).f989a = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f278c.findViewById(a.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f278c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f280e)) || !this.P) {
            this.f278c.findViewById(a.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f278c.findViewById(a.f.f81j);
        this.E = textView;
        textView.setText(this.f280e);
        int i2 = this.B;
        if (i2 != 0) {
            this.D.setImageResource(i2);
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
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f278c.findViewById(a.f.f91t);
        int i2 = a.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = a.f.f84m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i4 = a.f.f82k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(a.f.f86o);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i4);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z4 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(a.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f281f == null && this.f282g == null) ? null : viewGroupI.findViewById(a.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(a.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f282g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z3, z4);
        }
        if (!z2) {
            View view = this.f282g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z3 | (z4 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f282g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.a.f12m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f276a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f282g;
    }

    public void e() {
        this.f277b.setContentView(j());
        y();
    }

    public boolean g(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public boolean h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.q(keyEvent);
    }

    public void k(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f299x = charSequence;
            this.f300y = message;
            this.f301z = drawable;
        } else if (i2 == -2) {
            this.f295t = charSequence;
            this.f296u = message;
            this.f297v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f291p = charSequence;
            this.f292q = message;
            this.f293r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i2 == 0) {
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
        this.f281f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f280e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i2) {
        this.f283h = null;
        this.f284i = i2;
        this.f289n = false;
    }

    public void s(View view) {
        this.f283h = view;
        this.f284i = 0;
        this.f289n = false;
    }

    public void t(View view, int i2, int i3, int i4, int i5) {
        this.f283h = view;
        this.f284i = 0;
        this.f289n = true;
        this.f285j = i2;
        this.f286k = i3;
        this.f287l = i4;
        this.f288m = i5;
    }
}
