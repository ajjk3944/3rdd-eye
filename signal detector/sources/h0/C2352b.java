package h0;

import B4.E;
import B4.InterfaceC0140b;
import H1.p;
import R.O;
import S.n;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C0752Tp;
import com.google.android.gms.internal.ads.E4;
import com.google.android.gms.internal.ads.F4;
import com.google.android.gms.internal.ads.Mw;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.lefan.base.activity.SuggestActivity;
import com.lefan.base.view.ZoomImageView;
import e.C2284a;
import e.InterfaceC2285b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.WeakHashMap;
import k0.AbstractComponentCallbacksC2617v;
import k0.G;
import k0.K;
import k1.C2621c;
import l1.InterfaceC2636b;
import l3.InterfaceC2642a;
import n.MenuC2677k;
import n.SubMenuC2666C;
import n.v;
import o.C2723l;
import o.InterfaceC2729o;
import r1.B;
import r1.C2870A;
import r1.C2872b;
import r1.C2873c;
import r1.r;
import r1.s;
import r1.x;
import w2.q;
import w4.C2976b;
import x3.C2997b;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2352b implements n, PAGNativeAdInteractionListener, InterfaceC2285b, InterfaceC2642a, I1.a, v, InterfaceC2729o, Mw, s, InterfaceC2636b, E4, InterfaceC0140b, E, D3.a, O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20443a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20444b;

    public /* synthetic */ C2352b(int i, Object obj) {
        this.f20443a = i;
        this.f20444b = obj;
    }

    @Override // com.google.android.gms.internal.ads.E4
    public void a(F4 f42) {
        ((C0657Of) this.f20444b).c(f42);
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        C2284a c2284a = (C2284a) obj;
        K k6 = (K) this.f20444b;
        G g2 = (G) k6.f21493D.pollLast();
        if (g2 == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g2.f21482a;
        int i = g2.f21483b;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vO = k6.f21505c.o(str);
        if (abstractComponentCallbacksC2617vO != null) {
            abstractComponentCallbacksC2617vO.z(i, c2284a.f19838a, c2284a.f19839b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // n.v
    public void c(MenuC2677k menuC2677k, boolean z6) {
        if (menuC2677k instanceof SubMenuC2666C) {
            ((SubMenuC2666C) menuC2677k).f22007N.k().c(false);
        }
        v vVar = ((C2723l) this.f20444b).f22557e;
        if (vVar != null) {
            vVar.c(menuC2677k, z6);
        }
    }

    @Override // r1.s
    public r d(x xVar) {
        switch (this.f20443a) {
            case 10:
                return new C2873c(1, (C2870A) this.f20444b);
            default:
                return new C2872b((Resources) this.f20444b, B.f23327b);
        }
    }

    @Override // S.n
    public boolean e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f20444b;
        if (!swipeDismissBehavior.w(view)) {
            return false;
        }
        boolean z6 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f18110e;
        int width = (!(i == 0 && z6) && (i != 1 || z6)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = O.f3270a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        A0.e eVar = swipeDismissBehavior.f18107b;
        if (eVar != null) {
            eVar.q(view);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Mw
    public void f(int i, long j6, String str) {
        ((p2.e) this.f20444b).f22763h.e(i, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // n.v
    public boolean g(MenuC2677k menuC2677k) {
        C2723l c2723l = (C2723l) this.f20444b;
        if (menuC2677k == c2723l.f22555c) {
            return false;
        }
        c2723l.M = ((SubMenuC2666C) menuC2677k).f22008O.f22106a;
        v vVar = c2723l.f22557e;
        if (vVar != null) {
            return vVar.g(menuC2677k);
        }
        return false;
    }

    @Override // O0.a
    public View getRoot() {
        return (ZoomImageView) this.f20444b;
    }

    @Override // I1.a
    public Object h() {
        I.d dVar = (I.d) this.f20444b;
        return new n1.i((H1.h) dVar.f1851c, (V2.e) dVar.f1852d);
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
        h.k.k(N.h.a(((C2976b) this.f20444b).f23971a));
    }

    @Override // D3.a
    public void j(Typeface typeface) {
        C2997b c2997b = (C2997b) this.f20444b;
        if (c2997b.t(typeface)) {
            c2997b.l(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mw
    public void k(int i, long j6) {
        ((p2.e) this.f20444b).f22763h.b(i, System.currentTimeMillis() - j6);
    }

    @Override // l1.InterfaceC2636b
    public boolean l(Object obj, File file, l1.h hVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C0752Tp c0752Tp = (C0752Tp) this.f20444b;
        byte[] bArr = (byte[]) c0752Tp.e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e6) {
                        e = e6;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c0752Tp.i(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c0752Tp.i(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c0752Tp.i(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // B4.E
    public void n(int i) {
        SuggestActivity suggestActivity = (SuggestActivity) this.f20444b;
        HashMap map = suggestActivity.f18768P;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            suggestActivity.f18772T = 0;
            suggestActivity.f18774V.a("image/*");
            return;
        }
        map.remove(0);
        ImageView imageView = suggestActivity.f18769Q;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.base_add_img);
        }
        Button button = suggestActivity.f18773U;
        if (button != null) {
            button.setEnabled(map.isEmpty());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        q qVar = ((i2.k) this.f20444b).f20577u;
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        q qVar = ((i2.k) this.f20444b).f20577u;
        if (qVar != null) {
            qVar.d();
        }
    }

    public synchronized void p(C2621c c2621c) {
        c2621c.f21758b = null;
        c2621c.f21759c = null;
        ((ArrayDeque) this.f20444b).offer(c2621c);
    }

    public C2352b(ZoomImageView zoomImageView, ZoomImageView zoomImageView2) {
        this.f20443a = 18;
        this.f20444b = zoomImageView;
    }

    public C2352b(EditText editText) {
        this.f20443a = 0;
        this.f20444b = new C2351a(editText);
    }

    public C2352b(int i) {
        this.f20443a = i;
        switch (i) {
            case 17:
                char[] cArr = p.f1779a;
                this.f20444b = new ArrayDeque(0);
                break;
            default:
                this.f20444b = new C2870A(7);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }
}
