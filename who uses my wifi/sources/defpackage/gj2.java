package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gj2 {
    public final Context a;
    public final ra4 b;
    public final yz2 c;
    public final tu2 d;
    public final pq3 e;
    public final pq3 f;
    public final ScheduledExecutorService g;

    public gj2(Context context, ra4 ra4Var, yz2 yz2Var, tu2 tu2Var, pq3 pq3Var, pq3 pq3Var2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = ra4Var;
        this.c = yz2Var;
        this.d = tu2Var;
        this.e = pq3Var;
        this.f = pq3Var2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) tw1.e.c.a(mz1.Wa));
    }

    public final n70 a(String str, Random random) {
        return TextUtils.isEmpty(str) ? pu1.r(str) : pu1.L(c(str, this.d.a, random), Throwable.class, new w32(this, str, 1), this.e);
    }

    public final n70 c(String str, MotionEvent motionEvent, Random random) {
        try {
            iz1 iz1Var = mz1.Wa;
            tw1 tw1Var = tw1.e;
            kz1 kz1Var = tw1Var.c;
            kz1 kz1Var2 = tw1Var.c;
            if (!str.contains((CharSequence) kz1Var.a(iz1Var)) || this.b.s()) {
                return pu1.r(str);
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) kz1Var2.a(mz1.Xa), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent != null) {
                return pu1.L(pu1.O(gq3.r(this.c.a()), new k62(this, builderBuildUpon, str, motionEvent), this.f), Throwable.class, new z02(this, builderBuildUpon, 3), this.e);
            }
            builderBuildUpon.appendQueryParameter((String) kz1Var2.a(mz1.Ya), "11");
            return pu1.r(builderBuildUpon.toString());
        } catch (Exception e) {
            return pu1.B(e);
        }
    }
}
