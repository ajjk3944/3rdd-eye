package lg;

import android.widget.ProgressBar;
import android.widget.TextView;
import c1.o;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import jg.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f28805b;

    public /* synthetic */ b(l lVar, int i4) {
        this.f28804a = i4;
        this.f28805b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28804a) {
            case 0:
                l lVar = this.f28805b;
                switch (lVar.f27676a) {
                    case 0:
                        StorageCleanActivity storageCleanActivity = (StorageCleanActivity) lVar.f27677b;
                        o oVar = storageCleanActivity.F;
                        if (oVar == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        TextView textView = (TextView) oVar.f2576i;
                        nk.k.d(textView, "tvSizeAppCache");
                        StorageCleanActivity.D(storageCleanActivity, textView, 0L);
                        return;
                    default:
                        StorageCleanActivity storageCleanActivity2 = (StorageCleanActivity) lVar.f27677b;
                        o oVar2 = storageCleanActivity2.F;
                        if (oVar2 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        TextView textView2 = (TextView) oVar2.f2575h;
                        nk.k.d(textView2, "tvSizeApkFile");
                        StorageCleanActivity.D(storageCleanActivity2, textView2, 0L);
                        o oVar3 = storageCleanActivity2.F;
                        if (oVar3 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        TextView textView3 = (TextView) oVar3.j;
                        nk.k.d(textView3, "tvSizeEmptyFolder");
                        StorageCleanActivity.D(storageCleanActivity2, textView3, 0L);
                        o oVar4 = storageCleanActivity2.F;
                        if (oVar4 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        TextView textView4 = (TextView) oVar4.f2577k;
                        nk.k.d(textView4, "tvSizeLogFile");
                        StorageCleanActivity.D(storageCleanActivity2, textView4, 0L);
                        o oVar5 = storageCleanActivity2.F;
                        if (oVar5 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        TextView textView5 = (TextView) oVar5.f2569a;
                        nk.k.d(textView5, "tvSizeTempFile");
                        StorageCleanActivity.D(storageCleanActivity2, textView5, 0L);
                        return;
                }
            default:
                l lVar2 = this.f28805b;
                switch (lVar2.f27676a) {
                    case 0:
                        o oVar6 = ((StorageCleanActivity) lVar2.f27677b).F;
                        if (oVar6 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar = (ProgressBar) oVar6.f2572d;
                        nk.k.d(progressBar, "progressAppCache");
                        progressBar.setVisibility(8);
                        return;
                    default:
                        StorageCleanActivity storageCleanActivity3 = (StorageCleanActivity) lVar2.f27677b;
                        o oVar7 = storageCleanActivity3.F;
                        if (oVar7 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar2 = (ProgressBar) oVar7.f2572d;
                        nk.k.d(progressBar2, "progressAppCache");
                        progressBar2.setVisibility(8);
                        o oVar8 = storageCleanActivity3.F;
                        if (oVar8 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar3 = (ProgressBar) oVar8.f2571c;
                        nk.k.d(progressBar3, "progressApkFile");
                        progressBar3.setVisibility(8);
                        o oVar9 = storageCleanActivity3.F;
                        if (oVar9 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar4 = (ProgressBar) oVar9.f2573e;
                        nk.k.d(progressBar4, "progressEmptyFolder");
                        progressBar4.setVisibility(8);
                        o oVar10 = storageCleanActivity3.F;
                        if (oVar10 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar5 = (ProgressBar) oVar10.f2574f;
                        nk.k.d(progressBar5, "progressLogFile");
                        progressBar5.setVisibility(8);
                        o oVar11 = storageCleanActivity3.F;
                        if (oVar11 == null) {
                            nk.k.k("scanningBinding");
                            throw null;
                        }
                        ProgressBar progressBar6 = (ProgressBar) oVar11.g;
                        nk.k.d(progressBar6, "progressTempFile");
                        progressBar6.setVisibility(8);
                        return;
                }
        }
    }
}
