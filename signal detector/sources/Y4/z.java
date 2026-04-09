package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class z extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4513e;

    /* renamed from: f, reason: collision with root package name */
    public int f4514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4513e = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4512d = obj;
        this.f4514f |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.E(this.f4513e, this);
    }
}
