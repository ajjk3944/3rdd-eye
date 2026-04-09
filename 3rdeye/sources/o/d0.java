package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44647a;

    /* renamed from: b, reason: collision with root package name */
    public final View f44648b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f44649c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f44650d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f44651e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f44652f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f44653g;

    public d0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f44650d = layoutParams;
        this.f44651e = new Rect();
        this.f44652f = new int[2];
        this.f44653g = new int[2];
        this.f44647a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f44648b = viewInflate;
        this.f44649c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(d0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
    }
}
