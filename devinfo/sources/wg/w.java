package wg;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends a {

    /* renamed from: b, reason: collision with root package name */
    public View f36724b;

    /* renamed from: c, reason: collision with root package name */
    public final DeviceInfoApp f36725c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f36726d;

    /* renamed from: e, reason: collision with root package name */
    public final vg.c f36727e;

    /* renamed from: f, reason: collision with root package name */
    public final o1 f36728f;
    public TextView g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f36729h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f36730i;

    public w() {
        DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
        this.f36725c = deviceInfoApp;
        this.f36726d = new Handler(Looper.getMainLooper());
        this.f36727e = new vg.c(deviceInfoApp);
        this.f36728f = new o1(17, this);
    }

    @Override // wg.a
    public final void a() {
        View viewInflate = LayoutInflater.from(this.f36725c).inflate(R.layout.monitor_ram, (ViewGroup) null);
        this.f36724b = viewInflate;
        this.g = (TextView) viewInflate.findViewById(R.id.label);
        this.f36729h = (TextView) this.f36724b.findViewById(R.id.value);
        this.f36730i = (TextView) this.f36724b.findViewById(R.id.tv_usage);
    }

    @Override // wg.a
    public final View b() {
        return this.f36724b;
    }

    @Override // wg.a
    public final void c() {
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        int iC = com.liuzh.deviceinfo.utilities.f.c();
        boolean zI = com.liuzh.deviceinfo.utilities.f.i();
        float f10 = iC;
        this.g.setTextSize(f10);
        this.g.setTextColor(zI ? -1 : -16777216);
        this.f36729h.setTextSize(f10);
        this.f36729h.setTextColor(zI ? -1 : -16777216);
        this.f36730i.setTextSize(f10);
        this.f36730i.setTextColor(zI ? -1 : -16777216);
    }

    @Override // wg.a
    public final void d() {
        this.f36726d.post(this.f36728f);
    }

    @Override // wg.a
    public final void e() {
        this.f36726d.removeCallbacks(this.f36728f);
    }
}
