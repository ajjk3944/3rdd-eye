package e4;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.liuzh.deviceinfo.monitor.MonitorManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22423b;

    public /* synthetic */ z(int i4, View view) {
        this.f22422a = i4;
        this.f22423b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f22422a;
        View view = this.f22423b;
        switch (i4) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                MonitorManager monitorManager = MonitorManager.f21223f;
                view.animate().alpha(1.0f).setListener(null).start();
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
