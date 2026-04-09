package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class F extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4403e;

    /* renamed from: f, reason: collision with root package name */
    public int f4404f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4403e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4402d = obj;
        this.f4404f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.I(this.f4403e, this);
    }
}
