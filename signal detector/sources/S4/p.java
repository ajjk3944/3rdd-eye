package S4;

import a2.AbstractC0271g;
import android.content.Intent;
import android.view.View;
import com.lefan.signal.ui.noise.NoiseBean;
import com.lefan.signal.ui.noise.NoiseDetailActivity;
import com.lefan.signal.ui.noise.NoiseHistoryActivity;
import d5.AbstractC2282j;
import e2.InterfaceC2302a;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements InterfaceC2302a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NoiseHistoryActivity f3549a;

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = NoiseHistoryActivity.f19009T;
        NoiseHistoryActivity noiseHistoryActivity = this.f3549a;
        NoiseBean noiseBean = (NoiseBean) AbstractC2282j.V(i, noiseHistoryActivity.f19013R);
        if (noiseBean == null) {
            return;
        }
        Intent intent = new Intent(noiseHistoryActivity, (Class<?>) NoiseDetailActivity.class);
        intent.putExtra("noise_bean", noiseBean);
        noiseHistoryActivity.startActivity(intent);
    }
}
