package b5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.activity.BackEventCompat;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f4591a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f4592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4594d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4595e;

    /* renamed from: f, reason: collision with root package name */
    public BackEventCompat f4596f;

    public a(View view) {
        this.f4592b = view;
        Context context = view.getContext();
        this.f4593c = k.f(context, j4.b.motionDurationMedium2, 300);
        this.f4594d = k.f(context, j4.b.motionDurationShort3, 150);
        this.f4595e = k.f(context, j4.b.motionDurationShort2, 100);
    }

    public float a(float f10) {
        return this.f4591a.getInterpolation(f10);
    }

    public BackEventCompat b() {
        if (this.f4596f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f4596f;
        this.f4596f = null;
        return backEventCompat;
    }

    public BackEventCompat c() {
        BackEventCompat backEventCompat = this.f4596f;
        this.f4596f = null;
        return backEventCompat;
    }

    public void d(BackEventCompat backEventCompat) {
        this.f4596f = backEventCompat;
    }

    public BackEventCompat e(BackEventCompat backEventCompat) {
        if (this.f4596f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f4596f;
        this.f4596f = backEventCompat;
        return backEventCompat2;
    }
}
