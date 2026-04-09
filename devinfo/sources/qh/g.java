package qh;

import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.SettingsActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f32403b;

    public /* synthetic */ g(SettingsActivity settingsActivity, int i4) {
        this.f32402a = i4;
        this.f32403b = settingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) throws Resources.NotFoundException {
        int i10 = this.f32402a;
        SettingsActivity settingsActivity = this.f32403b;
        switch (i10) {
            case 0:
                int i11 = SettingsActivity.J;
                t7.m mVar = new t7.m(settingsActivity);
                RecyclerView recyclerView = new RecyclerView(settingsActivity, null);
                int dimensionPixelSize = settingsActivity.getResources().getDimensionPixelSize(R.dimen.content_padding_half);
                recyclerView.setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                recyclerView.setClipToPadding(false);
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                zh.g gVar = new zh.g();
                gVar.f38294i = -1;
                recyclerView.setAdapter(gVar);
                mVar.z(recyclerView);
                mVar.y(R.string.recommend_colors);
                mVar.x(android.R.string.ok, new h(4, recyclerView, settingsActivity));
                mVar.w(android.R.string.cancel, null);
                i.e eVarA = mVar.A();
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                com.liuzh.deviceinfo.utilities.f.a();
                dj.b.t(eVarA, com.liuzh.deviceinfo.utilities.f.d());
                break;
            default:
                int i12 = SettingsActivity.J;
                settingsActivity.getClass();
                com.liuzh.deviceinfo.utilities.d.c(settingsActivity);
                break;
        }
    }
}
