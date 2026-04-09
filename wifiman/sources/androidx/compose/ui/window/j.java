package androidx.compose.ui.window;

import F1.AbstractC2753i0;
import T.AbstractC3550q;
import Yg.J;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.platform.B1;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import c.AbstractC4137F;
import c.AbstractC4140I;
import c.DialogC4163r;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q2.AbstractC7419g;

/* loaded from: classes.dex */
final class j extends DialogC4163r implements B1 {

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6824a f29946d;

    /* renamed from: e, reason: collision with root package name */
    private i f29947e;

    /* renamed from: f, reason: collision with root package name */
    private final View f29948f;

    /* renamed from: g, reason: collision with root package name */
    private final h f29949g;

    /* renamed from: h, reason: collision with root package name */
    private final float f29950h;

    /* renamed from: i, reason: collision with root package name */
    private final int f29951i;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(AbstractC4137F abstractC4137F) {
            if (j.this.f29947e.b()) {
                j.this.f29946d.invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC4137F) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29953a;

        static {
            int[] iArr = new int[Y0.t.values().length];
            try {
                iArr[Y0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29953a = iArr;
        }
    }

    public j(InterfaceC6824a interfaceC6824a, i iVar, View view, Y0.t tVar, Y0.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || iVar.a()) ? f0.j.f46656a : f0.j.f46657b), 0, 2, null);
        this.f29946d = interfaceC6824a;
        this.f29947e = iVar;
        this.f29948f = view;
        float fJ = Y0.h.j(8);
        this.f29950h = fJ;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.f29951i = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        AbstractC2753i0.b(window, this.f29947e.a());
        h hVar = new h(getContext(), window);
        hVar.setTag(f0.h.f46607H, "Dialog:" + uuid);
        hVar.setClipChildren(false);
        hVar.setElevation(dVar.d1(fJ));
        hVar.setOutlineProvider(new a());
        this.f29949g = hVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(hVar);
        T.b(hVar, T.a(view));
        U.b(hVar, U.a(view));
        AbstractC7419g.b(hVar, AbstractC7419g.a(view));
        o(this.f29946d, this.f29947e, tVar);
        AbstractC4140I.b(b(), this, false, new b(), 2, null);
    }

    private static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof h) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    private final void m(Y0.t tVar) {
        h hVar = this.f29949g;
        int i10 = c.f29953a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        hVar.setLayoutDirection(i11);
    }

    private final void n(s sVar) {
        boolean zA = t.a(sVar, androidx.compose.ui.window.b.i(this.f29948f));
        Window window = getWindow();
        AbstractC6492s.f(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void k() {
        this.f29949g.e();
    }

    public final void l(AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        this.f29949g.m(abstractC3550q, interfaceC6839p);
    }

    public final void o(InterfaceC6824a interfaceC6824a, i iVar, Y0.t tVar) {
        Window window;
        this.f29946d = interfaceC6824a;
        this.f29947e = iVar;
        n(iVar.d());
        m(tVar);
        if (iVar.e() && !this.f29949g.k() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.f29949g.n(iVar.e());
        if (Build.VERSION.SDK_INT < 31) {
            if (iVar.a()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.f29951i);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent && this.f29947e.c()) {
            this.f29946d.invoke();
        }
        return zOnTouchEvent;
    }
}
