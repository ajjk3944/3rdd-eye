package l7;

import ac.k;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.play_billing.u;
import java.util.concurrent.TimeoutException;
import p1.m;
import p1.z;
import pb.y;
import t7.o;
import t7.r;
import xa.g;
import ya.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f28603a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28604b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28605c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28606d;

    public d(qz qzVar) throws g {
        this.f28604b = qzVar.getLayoutParams();
        ViewParent parent = qzVar.getParent();
        this.f28606d = qzVar.U();
        if (!(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f28605c = viewGroup;
        this.f28603a = viewGroup.indexOfChild(qzVar.N());
        viewGroup.removeView(qzVar.N());
        qzVar.T0(true);
    }

    public void a(float f10) {
        ((Paint) this.f28604b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void b(int i4) {
        if (this.f28603a == i4) {
            return;
        }
        this.f28603a = i4;
        Paint paint = (Paint) this.f28604b;
        if (Build.VERSION.SDK_INT >= 29) {
            p1.b.c(i4, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(p1.b.e(i4)));
        }
    }

    public void c(long j) {
        ((Paint) this.f28604b).setColor(z.u(j));
    }

    public void d(m mVar) {
        this.f28606d = mVar;
        ((Paint) this.f28604b).setColorFilter(mVar != null ? mVar.f31003a : null);
    }

    public void e(int i4) {
        ((Paint) this.f28604b).setStyle(i4 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public Looper f() {
        Looper looper;
        Object obj = this.f28606d;
        synchronized (obj) {
            try {
                if (this.f28603a != 0) {
                    y.i((HandlerThread) this.f28604b, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f28604b) == null) {
                    a0.m("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f28604b = handlerThread;
                    handlerThread.start();
                    this.f28605c = new k(((HandlerThread) this.f28604b).getLooper(), 1);
                    a0.m("Looper thread started.");
                } else {
                    a0.m("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f28603a++;
                looper = ((HandlerThread) this.f28604b).getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void g(Throwable th2) {
        o oVar = (o) this.f28606d;
        if (th2 instanceof TimeoutException) {
            oVar.I(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 28, r.f34492r);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            oVar.I(95, 28, r.f34492r);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f28605c).run();
    }

    public d(Paint paint) {
        this.f28604b = paint;
        this.f28603a = 3;
    }
}
