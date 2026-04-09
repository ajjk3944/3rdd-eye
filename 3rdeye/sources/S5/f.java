package S5;

import A9.E;
import A9.F;
import A9.U;
import L0.I;
import L0.S;
import T1.B;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.InterfaceC1771d;
import androidx.lifecycle.InterfaceC1790x;
import androidx.recyclerview.widget.RecyclerView;
import b9.C1992A;
import b9.C2001h;
import c9.C2092m;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p9.InterfaceC5480a;
import t4.C5606d;
import x2.AbstractActivityC5757a;

/* compiled from: Balloon.kt */
/* loaded from: classes2.dex */
public final class f implements InterfaceC1771d {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC5757a f11917b;

    /* renamed from: c, reason: collision with root package name */
    public final a f11918c;

    /* renamed from: d, reason: collision with root package name */
    public final T5.a f11919d;

    /* renamed from: e, reason: collision with root package name */
    public final PopupWindow f11920e;

    /* renamed from: f, reason: collision with root package name */
    public final PopupWindow f11921f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11922g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11923h;
    public final Object i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f11924j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f11925k;

    /* compiled from: Balloon.kt */
    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f11926A;

        /* renamed from: B, reason: collision with root package name */
        public final boolean f11927B;

        /* renamed from: C, reason: collision with root package name */
        public long f11928C;

        /* renamed from: D, reason: collision with root package name */
        public InterfaceC1790x f11929D;

        /* renamed from: E, reason: collision with root package name */
        public final int f11930E;

        /* renamed from: F, reason: collision with root package name */
        public final int f11931F;

        /* renamed from: G, reason: collision with root package name */
        public l f11932G;

        /* renamed from: H, reason: collision with root package name */
        public final W5.a f11933H;

        /* renamed from: I, reason: collision with root package name */
        public final long f11934I;

        /* renamed from: J, reason: collision with root package name */
        public final n f11935J;

        /* renamed from: K, reason: collision with root package name */
        public final int f11936K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f11937L;

        /* renamed from: M, reason: collision with root package name */
        public final int f11938M;

        /* renamed from: N, reason: collision with root package name */
        public boolean f11939N;

        /* renamed from: O, reason: collision with root package name */
        public final boolean f11940O;

        /* renamed from: P, reason: collision with root package name */
        public final boolean f11941P;

        /* renamed from: a, reason: collision with root package name */
        public int f11942a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11943b;

        /* renamed from: c, reason: collision with root package name */
        public int f11944c;

        /* renamed from: d, reason: collision with root package name */
        public int f11945d;

        /* renamed from: e, reason: collision with root package name */
        public int f11946e;

        /* renamed from: f, reason: collision with root package name */
        public int f11947f;

        /* renamed from: g, reason: collision with root package name */
        public int f11948g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f11949h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public int f11950j;

        /* renamed from: k, reason: collision with root package name */
        public float f11951k;

        /* renamed from: l, reason: collision with root package name */
        public S5.c f11952l;

        /* renamed from: m, reason: collision with root package name */
        public final S5.b f11953m;

        /* renamed from: n, reason: collision with root package name */
        public S5.a f11954n;

        /* renamed from: o, reason: collision with root package name */
        public final float f11955o;

        /* renamed from: p, reason: collision with root package name */
        public int f11956p;

        /* renamed from: q, reason: collision with root package name */
        public float f11957q;

        /* renamed from: r, reason: collision with root package name */
        public String f11958r;

        /* renamed from: s, reason: collision with root package name */
        public int f11959s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f11960t;

        /* renamed from: u, reason: collision with root package name */
        public float f11961u;

        /* renamed from: v, reason: collision with root package name */
        public final int f11962v;

        /* renamed from: w, reason: collision with root package name */
        public final q f11963w;

        /* renamed from: x, reason: collision with root package name */
        public float f11964x;

        /* renamed from: y, reason: collision with root package name */
        public final float f11965y;

        /* renamed from: z, reason: collision with root package name */
        public final boolean f11966z;

        public a(AbstractActivityC5757a context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f11942a = RecyclerView.UNDEFINED_DURATION;
            this.f11943b = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.f11944c = RecyclerView.UNDEFINED_DURATION;
            this.f11949h = true;
            this.i = RecyclerView.UNDEFINED_DURATION;
            this.f11950j = com.google.gson.internal.c.y(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
            this.f11951k = 0.5f;
            this.f11952l = S5.c.ALIGN_BALLOON;
            this.f11953m = S5.b.ALIGN_ANCHOR;
            this.f11954n = S5.a.BOTTOM;
            this.f11955o = 2.5f;
            this.f11956p = -16777216;
            this.f11957q = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            this.f11958r = "";
            this.f11959s = -1;
            this.f11961u = 12.0f;
            this.f11962v = 17;
            this.f11963w = q.START;
            float f10 = 28;
            com.google.gson.internal.c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            com.google.gson.internal.c.y(TypedValue.applyDimension(1, f10, Resources.getSystem().getDisplayMetrics()));
            com.google.gson.internal.c.y(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.f11964x = 1.0f;
            this.f11965y = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            W5.c cVar = W5.c.f13338a;
            this.f11966z = true;
            this.f11926A = true;
            this.f11927B = true;
            this.f11928C = -1L;
            this.f11930E = RecyclerView.UNDEFINED_DURATION;
            this.f11931F = RecyclerView.UNDEFINED_DURATION;
            this.f11932G = l.FADE;
            this.f11933H = W5.a.FADE;
            this.f11934I = 500L;
            this.f11935J = n.NONE;
            this.f11936K = RecyclerView.UNDEFINED_DURATION;
            boolean z10 = context.getResources().getConfiguration().getLayoutDirection() == 1;
            this.f11937L = z10;
            this.f11938M = z10 ? -1 : 1;
            this.f11939N = true;
            this.f11940O = true;
            this.f11941P = true;
        }
    }

    /* compiled from: Balloon.kt */
    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C9.g<Object>> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f11967g = new b(0);

        @Override // p9.InterfaceC5480a
        public final C9.g<Object> invoke() {
            return C9.j.a(0, 7, null);
        }
    }

    /* compiled from: Balloon.kt */
    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<E> {

        /* renamed from: g, reason: collision with root package name */
        public static final c f11968g = new c(0);

        @Override // p9.InterfaceC5480a
        public final E invoke() {
            I9.c cVar = U.f211a;
            return F.a(F9.q.f1782a);
        }
    }

    /* compiled from: Balloon.kt */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11969a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11970b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11971c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f11972d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f11973e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f11974f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f11975g;

        static {
            int[] iArr = new int[S5.a.values().length];
            try {
                iArr[S5.a.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[S5.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[S5.a.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[S5.a.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11969a = iArr;
            int[] iArr2 = new int[S5.c.values().length];
            try {
                iArr2[S5.c.ALIGN_BALLOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[S5.c.ALIGN_ANCHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f11970b = iArr2;
            int[] iArr3 = new int[l.values().length];
            try {
                iArr3[l.ELASTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[l.CIRCULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[l.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[l.OVERSHOOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[l.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f11971c = iArr3;
            int[] iArr4 = new int[W5.a.values().length];
            try {
                iArr4[W5.a.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            f11972d = iArr4;
            int[] iArr5 = new int[n.values().length];
            try {
                iArr5[n.HEARTBEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[n.SHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[n.BREATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[n.ROTATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            f11973e = iArr5;
            int[] iArr6 = new int[r.values().length];
            try {
                iArr6[r.DROPDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[r.ALIGNMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[r.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f11974f = iArr6;
            int[] iArr7 = new int[k.values().length];
            try {
                iArr7[k.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[k.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[k.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[k.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            f11975g = iArr7;
            int[] iArr8 = new int[m.values().length];
            try {
                iArr8[m.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[m.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[m.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[m.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: ViewExtension.kt */
    public static final class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f11976b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f11977c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C0166f f11978d;

        /* compiled from: ViewExtension.kt */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C0166f f11979a;

            public a(C0166f c0166f) {
                this.f11979a = c0166f;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                kotlin.jvm.internal.l.f(animation, "animation");
                super.onAnimationEnd(animation);
                this.f11979a.invoke();
            }
        }

        public e(View view, long j4, C0166f c0166f) {
            this.f11976b = view;
            this.f11977c = j4;
            this.f11978d = c0166f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f11976b;
            if (view.isAttachedToWindow()) {
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getRight() + view.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                animatorCreateCircularReveal.setDuration(this.f11977c);
                animatorCreateCircularReveal.start();
                animatorCreateCircularReveal.addListener(new a(this.f11978d));
            }
        }
    }

    /* compiled from: Balloon.kt */
    /* renamed from: S5.f$f, reason: collision with other inner class name */
    public static final class C0166f extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public C0166f() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [b9.g, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [b9.g, java.lang.Object] */
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            f fVar = f.this;
            fVar.f11922g = false;
            fVar.f11920e.dismiss();
            fVar.f11921f.dismiss();
            ((Handler) fVar.i.getValue()).removeCallbacks((S5.d) fVar.f11924j.getValue());
            return C1992A.f18074a;
        }
    }

    static {
        C2001h.b(b.f11967g);
        C2001h.b(c.f11968g);
    }

    public f(AbstractActivityC5757a abstractActivityC5757a, a aVar) {
        AbstractC1781n lifecycle;
        this.f11917b = abstractActivityC5757a;
        this.f11918c = aVar;
        View viewInflate = LayoutInflater.from(abstractActivityC5757a).inflate(R.layout.balloon_layout_body, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate;
        int i = R.id.balloon_arrow;
        ImageView imageView = (ImageView) B.f(R.id.balloon_arrow, viewInflate);
        if (imageView != null) {
            i = R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) B.f(R.id.balloon_card, viewInflate);
            if (radiusLayout != null) {
                i = R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) B.f(R.id.balloon_content, viewInflate);
                if (frameLayout2 != null) {
                    i = R.id.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) B.f(R.id.balloon_text, viewInflate);
                    if (vectorTextView != null) {
                        i = R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) B.f(R.id.balloon_wrapper, viewInflate);
                        if (frameLayout3 != null) {
                            this.f11919d = new T5.a(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                            View viewInflate2 = LayoutInflater.from(abstractActivityC5757a).inflate(R.layout.balloon_layout_overlay, (ViewGroup) null, false);
                            if (viewInflate2 == null) {
                                throw new NullPointerException("rootView");
                            }
                            BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) viewInflate2;
                            PopupWindow popupWindow = new PopupWindow(frameLayout, -2, -2);
                            this.f11920e = popupWindow;
                            this.f11921f = new PopupWindow(balloonAnchorOverlayView, -1, -1);
                            b9.i iVar = b9.i.NONE;
                            this.i = C2001h.a(iVar, i.f11983g);
                            this.f11924j = C2001h.a(iVar, new g(this));
                            this.f11925k = C2001h.a(iVar, new h(this));
                            radiusLayout.setAlpha(aVar.f11964x);
                            radiusLayout.setRadius(aVar.f11957q);
                            WeakHashMap<View, S> weakHashMap = I.f3792a;
                            float f10 = aVar.f11965y;
                            I.d.s(radiusLayout, f10);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(aVar.f11956p);
                            gradientDrawable.setCornerRadius(aVar.f11957q);
                            radiusLayout.setBackground(gradientDrawable);
                            radiusLayout.setPadding(aVar.f11945d, aVar.f11946e, aVar.f11947f, aVar.f11948g);
                            ViewGroup.LayoutParams layoutParams = frameLayout3.getLayoutParams();
                            kotlin.jvm.internal.l.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.setFocusable(aVar.f11939N);
                            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                            popupWindow.setElevation(f10);
                            popupWindow.setAttachedInDecor(aVar.f11941P);
                            kotlin.jvm.internal.l.e(vectorTextView.getContext(), "getContext(...)");
                            q qVar = q.START;
                            float f11 = 28;
                            com.google.gson.internal.c.y(TypedValue.applyDimension(1, f11, Resources.getSystem().getDisplayMetrics()));
                            com.google.gson.internal.c.y(TypedValue.applyDimension(1, f11, Resources.getSystem().getDisplayMetrics()));
                            com.google.gson.internal.c.y(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
                            kotlin.jvm.internal.l.f(aVar.f11963w, "value");
                            X5.a aVar2 = vectorTextView.i;
                            if (aVar2 != null) {
                                aVar2.f13563e = aVar.f11937L;
                                U5.b.a(vectorTextView, aVar2);
                            }
                            kotlin.jvm.internal.l.e(vectorTextView.getContext(), "getContext(...)");
                            CharSequence value = aVar.f11958r;
                            kotlin.jvm.internal.l.f(value, "value");
                            float f12 = aVar.f11961u;
                            int i10 = aVar.f11959s;
                            boolean z10 = aVar.f11960t;
                            int i11 = aVar.f11962v;
                            vectorTextView.setMovementMethod(null);
                            if (z10) {
                                String string = value.toString();
                                int i12 = Build.VERSION.SDK_INT;
                                value = i12 >= 24 ? Html.fromHtml(string, 0) : i12 >= 24 ? J0.b.a(string, 0) : Html.fromHtml(string);
                            } else if (z10) {
                                throw new b9.j();
                            }
                            vectorTextView.setText(value);
                            vectorTextView.setTextSize(f12);
                            vectorTextView.setGravity(i11);
                            vectorTextView.setTextColor(i10);
                            vectorTextView.setIncludeFontPadding(true);
                            vectorTextView.setTypeface(vectorTextView.getTypeface(), 0);
                            j(vectorTextView, radiusLayout);
                            i();
                            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: S5.e
                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    f this$0 = this.f11916b;
                                    kotlin.jvm.internal.l.f(this$0, "this$0");
                                    FrameLayout frameLayout4 = this$0.f11919d.f12291b;
                                    Animation animation = frameLayout4.getAnimation();
                                    if (animation != null) {
                                        animation.cancel();
                                        animation.reset();
                                    }
                                    frameLayout4.clearAnimation();
                                    this$0.d();
                                }
                            });
                            popupWindow.setTouchInterceptor(new j(this));
                            balloonAnchorOverlayView.setOnClickListener(new F8.c(this, 4));
                            kotlin.jvm.internal.l.e(frameLayout, "getRoot(...)");
                            a(frameLayout);
                            InterfaceC1790x interfaceC1790x = aVar.f11929D;
                            if (interfaceC1790x == null && androidx.work.s.n(abstractActivityC5757a)) {
                                aVar.f11929D = abstractActivityC5757a;
                                abstractActivityC5757a.getLifecycle().addObserver(this);
                                return;
                            } else {
                                if (interfaceC1790x == null || (lifecycle = interfaceC1790x.getLifecycle()) == null) {
                                    return;
                                }
                                lifecycle.addObserver(this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static void a(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        v9.g gVarO = v9.h.O(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(C2092m.T(gVarO, 10));
        v9.f it = gVarO.iterator();
        while (it.f47101d) {
            arrayList.add(viewGroup.getChildAt(it.a()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                a((ViewGroup) view);
            }
        }
    }

    public final boolean b(View view) {
        if (this.f11922g || this.f11923h) {
            return false;
        }
        AbstractActivityC5757a abstractActivityC5757a = this.f11917b;
        if ((androidx.work.s.n(abstractActivityC5757a) && abstractActivityC5757a.isFinishing()) || this.f11920e.getContentView().getParent() != null) {
            return false;
        }
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        return view.isAttachedToWindow();
    }

    public final void d() {
        if (this.f11922g) {
            C0166f c0166f = new C0166f();
            a aVar = this.f11918c;
            if (aVar.f11932G != l.CIRCULAR) {
                c0166f.invoke();
                return;
            }
            View contentView = this.f11920e.getContentView();
            kotlin.jvm.internal.l.e(contentView, "getContentView(...)");
            contentView.post(new e(contentView, aVar.f11934I, c0166f));
        }
    }

    public final float e(View view) {
        int i = C5606d.x(this.f11919d.f12294e).x;
        int i10 = C5606d.x(view).x;
        a aVar = this.f11918c;
        float f10 = 0;
        float f11 = (aVar.f11950j * aVar.f11955o) + f10;
        float fH = ((h() - f11) - f10) - f10;
        int i11 = d.f11970b[aVar.f11952l.ordinal()];
        if (i11 == 1) {
            return (r0.f12296g.getWidth() * aVar.f11951k) - (aVar.f11950j * 0.5f);
        }
        if (i11 != 2) {
            throw new b9.j();
        }
        if (view.getWidth() + i10 >= i) {
            if (h() + i >= i10) {
                float f12 = i10;
                float f13 = i;
                float width = (((view.getWidth() * aVar.f11951k) + f12) - f13) - (aVar.f11950j * 0.5f);
                float width2 = (view.getWidth() * aVar.f11951k) + f12;
                float f14 = width2 - (aVar.f11950j * 0.5f);
                if (f14 <= f13) {
                    return 0.0f;
                }
                if (f14 > f13 && view.getWidth() <= h()) {
                    return (width2 - (aVar.f11950j * 0.5f)) - f13;
                }
                if (width > aVar.f11950j * 2) {
                    if (width <= h() - (aVar.f11950j * 2)) {
                        return width;
                    }
                }
            }
            return fH;
        }
        return f11;
    }

    public final float f(View view) {
        int i;
        a aVar = this.f11918c;
        boolean z10 = aVar.f11940O;
        kotlin.jvm.internal.l.f(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z10) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        } else {
            i = 0;
        }
        int i10 = C5606d.x(this.f11919d.f12294e).y - i;
        int i11 = C5606d.x(view).y - i;
        float f10 = 0;
        float f11 = (aVar.f11950j * aVar.f11955o) + f10;
        float fG = ((g() - f11) - f10) - f10;
        int i12 = aVar.f11950j / 2;
        int i13 = d.f11970b[aVar.f11952l.ordinal()];
        if (i13 == 1) {
            return (r2.f12296g.getHeight() * aVar.f11951k) - i12;
        }
        if (i13 != 2) {
            throw new b9.j();
        }
        if (view.getHeight() + i11 >= i10) {
            if (g() + i10 >= i11) {
                float height = (((view.getHeight() * aVar.f11951k) + i11) - i10) - i12;
                if (height > aVar.f11950j * 2) {
                    if (height <= g() - (aVar.f11950j * 2)) {
                        return height;
                    }
                }
            }
            return fG;
        }
        return f11;
    }

    public final int g() {
        int i = this.f11918c.f11944c;
        return i != Integer.MIN_VALUE ? i : this.f11919d.f12290a.getMeasuredHeight();
    }

    public final int h() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        a aVar = this.f11918c;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        int i10 = aVar.f11942a;
        if (i10 != Integer.MIN_VALUE) {
            return i10 > i ? i : i10;
        }
        int measuredWidth = this.f11919d.f12290a.getMeasuredWidth();
        aVar.getClass();
        return v9.h.L(measuredWidth, 0, aVar.f11943b);
    }

    public final void i() {
        a aVar = this.f11918c;
        int i = aVar.f11950j - 1;
        int i10 = (int) aVar.f11965y;
        FrameLayout frameLayout = this.f11919d.f12294e;
        int i11 = d.f11969a[aVar.f11954n.ordinal()];
        if (i11 == 1) {
            frameLayout.setPadding(i10, i, i10, i < i10 ? i10 : i);
            return;
        }
        if (i11 == 2) {
            frameLayout.setPadding(i10, i, i10, i < i10 ? i10 : i);
        } else if (i11 == 3) {
            frameLayout.setPadding(i, i10, i, i10);
        } else {
            if (i11 != 4) {
                return;
            }
            frameLayout.setPadding(i, i10, i, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.widget.TextView r7, android.view.View r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.f.j(android.widget.TextView, android.view.View):void");
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onDestroy(InterfaceC1790x interfaceC1790x) {
        AbstractC1781n lifecycle;
        this.f11923h = true;
        this.f11921f.dismiss();
        this.f11920e.dismiss();
        InterfaceC1790x interfaceC1790x2 = this.f11918c.f11929D;
        if (interfaceC1790x2 == null || (lifecycle = interfaceC1790x2.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onCreate(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onPause(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onResume(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final /* synthetic */ void onStart(InterfaceC1790x interfaceC1790x) {
    }

    @Override // androidx.lifecycle.InterfaceC1771d
    public final void onStop(InterfaceC1790x interfaceC1790x) {
    }
}
