package wo;

import android.view.View;
import bc.y;

/* loaded from: classes.dex */
public abstract class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24545a = true;

    /* renamed from: d, reason: collision with root package name */
    public static final y f24546d = new y(2);

    public abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (f24545a) {
            f24545a = false;
            view.post(f24546d);
            a();
        }
    }
}
