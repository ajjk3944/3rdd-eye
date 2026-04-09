package Y4;

import android.net.wifi.WifiInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;

/* loaded from: classes.dex */
public final class H extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public WifiInfo f4407d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4409f;

    /* renamed from: g, reason: collision with root package name */
    public int f4410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(WifiDetectionActivity wifiDetectionActivity, j5.b bVar) {
        super(bVar);
        this.f4409f = wifiDetectionActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4408e = obj;
        this.f4410g |= LinearLayoutManager.INVALID_OFFSET;
        return WifiDetectionActivity.J(this.f4409f, this);
    }
}
