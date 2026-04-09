package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class B extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4392e;

    /* renamed from: f, reason: collision with root package name */
    public int f4393f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4392e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4391d = obj;
        this.f4393f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.G(this.f4392e, this);
    }
}
