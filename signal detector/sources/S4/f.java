package S4;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.lefan.signal.ui.noise.NoiseActivity;

/* loaded from: classes.dex */
public final class f extends j5.b {

    /* renamed from: d, reason: collision with root package name */
    public q5.o f3522d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NoiseActivity f3524f;

    /* renamed from: g, reason: collision with root package name */
    public int f3525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NoiseActivity noiseActivity, j5.b bVar) {
        super(bVar);
        this.f3524f = noiseActivity;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        this.f3523e = obj;
        this.f3525g |= LinearLayoutManager.INVALID_OFFSET;
        return NoiseActivity.C(this.f3524f, 0.0d, 0.0d, this);
    }
}
