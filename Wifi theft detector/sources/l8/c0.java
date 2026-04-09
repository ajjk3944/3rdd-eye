package l8;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class c0 extends ViewDataBinding {
    public final SwitchCompat A;
    public final SwitchCompat B;
    public final u1 C;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f23226w;

    /* renamed from: x, reason: collision with root package name */
    public final RelativeLayout f23227x;

    /* renamed from: y, reason: collision with root package name */
    public final RelativeLayout f23228y;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f23229z;

    public c0(Object obj, View view, int i10, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, SwitchCompat switchCompat, SwitchCompat switchCompat2, u1 u1Var) {
        super(obj, view, i10);
        this.f23226w = relativeLayout;
        this.f23227x = relativeLayout2;
        this.f23228y = relativeLayout3;
        this.f23229z = relativeLayout4;
        this.A = switchCompat;
        this.B = switchCompat2;
        this.C = u1Var;
    }
}
