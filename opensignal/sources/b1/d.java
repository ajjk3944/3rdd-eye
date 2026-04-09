package b1;

import android.graphics.Bitmap;
import androidx.compose.ui.platform.AndroidComposeView;
import br.l;
import br.n;
import br.w;
import e2.k;
import g1.g0;
import g1.p;
import io.sentry.android.replay.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import lq.b0;
import x1.e1;
import x1.f0;
import x1.f1;
import x1.n1;
import y1.l0;
import y1.q1;

/* loaded from: classes.dex */
public final class d extends n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2366d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2367g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2368r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AndroidComposeView androidComposeView, ar.n nVar, int i10) {
        super(2);
        this.f2366d = 4;
        this.f2367g = androidComposeView;
        this.f2368r = nVar;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) throws IOException {
        boolean z10 = false;
        switch (this.f2366d) {
            case 0:
                b0 b0Var = b0.f15562a;
                int iIntValue = ((Number) obj).intValue();
                k kVar = (k) obj2;
                e eVar = (e) this.f2368r;
                if (!((q1) this.f2367g).f25766b.b(kVar.f7720g)) {
                    eVar.k(iIntValue, kVar);
                    eVar.D.c(b0Var);
                }
                return b0Var;
            case 1:
                j jVar = (j) obj;
                long jLongValue = ((Number) obj2).longValue();
                l.e(jVar, "$this$onScreenshotRecorded");
                Bitmap bitmap = (Bitmap) this.f2367g;
                String str = (String) ((w) this.f2368r).f2917a;
                l.e(bitmap, "bitmap");
                if (jVar.h() != null && !bitmap.isRecycled()) {
                    File fileH = jVar.h();
                    if (fileH != null) {
                        fileH.mkdirs();
                    }
                    File file = new File(jVar.h(), jLongValue + ".jpg");
                    file.createNewFile();
                    synchronized (bitmap) {
                        if (!bitmap.isRecycled()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, jVar.f11931a.getSessionReplay().f12078e.screenshotQuality, fileOutputStream);
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                jVar.b(file, jLongValue, str);
                            } finally {
                            }
                        }
                    }
                }
                return b0.f15562a;
            case 2:
                rr.l lVar = (rr.l) obj2;
                if (l.a((rr.l) obj, (rr.b) this.f2367g) && l.a(lVar, (rr.b) this.f2368r)) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                p pVar = (p) obj;
                j1.c cVar = (j1.c) obj2;
                f1 f1Var = (f1) this.f2367g;
                f0 f0Var = f1Var.f24821o;
                if (f0Var.T()) {
                    f1Var.E = pVar;
                    f1Var.D = cVar;
                    n1 snapshotObserver = x1.k.t(f0Var).getSnapshotObserver();
                    g0 g0Var = f1.J;
                    snapshotObserver.a(f1Var, x1.d.f24780x, (e1) this.f2368r);
                    f1Var.H = false;
                } else {
                    f1Var.H = true;
                }
                return b0.f15562a;
            default:
                ((Number) obj2).intValue();
                l0.a((AndroidComposeView) this.f2367g, (ar.n) this.f2368r, (n0.p) obj, n0.w.m(1));
                return b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        super(2);
        this.f2366d = i10;
        this.f2367g = obj;
        this.f2368r = obj2;
    }
}
