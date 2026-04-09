package Y4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.wifi.WifiFragment;

/* loaded from: classes.dex */
public final class O extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public q5.o f4423d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiFragment f4425f;

    /* renamed from: g, reason: collision with root package name */
    public int f4426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(WifiFragment wifiFragment, j5.b bVar) {
        super(bVar);
        this.f4425f = wifiFragment;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f4424e = obj;
        this.f4426g |= LinearLayoutManager.INVALID_OFFSET;
        return WifiFragment.X(this.f4425f, null, this);
    }
}
