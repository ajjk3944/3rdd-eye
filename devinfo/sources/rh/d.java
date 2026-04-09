package rh;

import android.os.Build;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.z;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.splash.SplashActivity;
import com.liuzh.deviceinfo.utilities.l;
import p6.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32955a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f32956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f32957c;

    public /* synthetic */ d(ImageView imageView, TextView textView) {
        this.f32957c = imageView;
        this.f32956b = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strV;
        switch (this.f32955a) {
            case 0:
                int i4 = SplashActivity.K;
                boolean z3 = com.liuzh.deviceinfo.utilities.d.f21252a;
                int i10 = Build.VERSION.SDK_INT;
                this.f32957c.setImageResource(pd.b.c(i10));
                this.f32956b.setText(com.liuzh.deviceinfo.utilities.d.b(i10));
                break;
            default:
                i iVarP = ii.a.p();
                if (iVarP == null) {
                    strV = l.v();
                } else {
                    strV = iVarP.K() + " " + iVarP.F();
                }
                bi.d.b(new z(iVarP == null ? R.drawable.ic_cpu : iVarP.D(), 3, this.f32956b, strV, this.f32957c));
                break;
        }
    }

    public /* synthetic */ d(TextView textView, ImageView imageView) {
        this.f32956b = textView;
        this.f32957c = imageView;
    }
}
