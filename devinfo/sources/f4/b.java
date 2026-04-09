package f4;

import android.graphics.ImageDecoder;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnFailureListener;
import e4.c2;
import e4.s;
import g8.v;
import u0.z1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements OnFailureListener, z1, t8.g, s, j6.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23631a;

    public /* synthetic */ b(int i4) {
        this.f23631a = i4;
    }

    public static /* bridge */ /* synthetic */ ImageDecoder.Source e(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillManager f(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue g(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher h(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return AutofillManager.class;
    }

    @Override // u0.z1
    public boolean a() {
        return false;
    }

    @Override // j6.n
    public void b(j6.m mVar, j6.o oVar, boolean z3) {
        switch (this.f23631a) {
            case 25:
                mVar.g(oVar);
                break;
            case 26:
                mVar.e(oVar);
                break;
            case 27:
                mVar.c(oVar);
                break;
            case 28:
                mVar.b();
                break;
            default:
                mVar.f();
                break;
        }
    }

    @Override // t8.g
    public Object get() {
        return v.a();
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        nk.k.e(view, "v");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
        return c2Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }
}
