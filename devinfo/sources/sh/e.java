package sh;

import android.content.Intent;
import android.view.View;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.widget.WidgetsActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33670a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f33671b;

    public /* synthetic */ e(l lVar, int i4) {
        this.f33670a = i4;
        this.f33671b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33670a) {
            case 0:
                ((MainActivity) this.f33671b.U()).E(n0.class);
                l.j0("Sensors");
                break;
            case 1:
                this.f33671b.b0(new Intent(view.getContext(), (Class<?>) WidgetsActivity.class));
                l.j0("Widgets");
                break;
            case 2:
                this.f33671b.b0(new Intent(view.getContext(), (Class<?>) MonitorActivity.class));
                l.j0("Monitor");
                break;
            default:
                ((MainActivity) this.f33671b.U()).E(x0.class);
                l.j0("Tests");
                break;
        }
    }
}
