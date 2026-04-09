package H4;

import K2.j;
import R3.k;
import S3.p;
import android.util.Log;
import android.view.View;
import com.lefan.signal.MainActivity;
import q5.i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1809b;

    public /* synthetic */ d(MainActivity mainActivity, int i) {
        this.f1808a = i;
        this.f1809b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f1808a;
        MainActivity mainActivity = this.f1809b;
        switch (i) {
            case 0:
                mainActivity.f18811U = false;
                return;
            default:
                R3.d dVar = mainActivity.f18806P;
                if (dVar == null) {
                    i.g("appUpdateManager");
                    throw null;
                }
                k kVar = dVar.f3405a;
                String packageName = dVar.f3407c.getPackageName();
                p pVar = kVar.f3421a;
                if (pVar != null) {
                    k.f3419e.f("completeUpdate(%s)", packageName);
                    c3.f fVar = new c3.f();
                    pVar.a().post(new R3.g(pVar, fVar, fVar, new R3.g(kVar, fVar, fVar, packageName, 1), 2));
                    return;
                } else {
                    B2.a aVar = k.f3419e;
                    Object[] objArr = {-9};
                    aVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", B2.a.g(aVar.f521b, "onError(%d)", objArr));
                    }
                    com.bumptech.glide.d.r(new j(-9));
                    return;
                }
        }
    }
}
