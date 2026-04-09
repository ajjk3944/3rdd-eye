package G1;

import A9.C0575f;
import A9.F;
import A9.U;
import B0.g;
import F9.q;
import G1.f;
import J8.H;
import P7.C1484a;
import P7.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import f8.AbstractActivityC4340c;
import java.io.File;
import kotlin.jvm.internal.l;
import n.AbstractC5340b;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1868c;

    public /* synthetic */ e(Object obj, int i) {
        this.f1867b = i;
        this.f1868c = obj;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        f.b bVar;
        Object obj = this.f1868c;
        switch (this.f1867b) {
            case 0:
                f fVar = (f) obj;
                if (fVar.f1870c == null || !fVar.f1872e) {
                    bVar = new f.b(fVar.f1869b, fVar.f1870c, new f.a(), fVar.f1871d, fVar.f1873f);
                } else {
                    Context context = fVar.f1869b;
                    l.f(context, "context");
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    l.e(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    bVar = new f.b(fVar.f1869b, new File(noBackupFilesDir, fVar.f1870c).getAbsolutePath(), new f.a(), fVar.f1871d, fVar.f1873f);
                }
                bVar.setWriteAheadLoggingEnabled(fVar.f1875h);
                return bVar;
            case 1:
                PermissionProcessBar permissionProcessBar = (PermissionProcessBar) obj;
                permissionProcessBar.f22195j = 2;
                permissionProcessBar.o(2);
                Button button = permissionProcessBar.f22197l;
                Resources resources = permissionProcessBar.getResources();
                ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
                button.setBackground(g.a.a(resources, R.drawable.next_step_3, null));
                permissionProcessBar.n(new G2.a());
                return null;
            case 2:
                w9.i<Object>[] iVarArr = PHSplashActivity.i;
                return (TextView) ((PHSplashActivity) obj).findViewById(R.id.ph_splash_title_text);
            case 3:
                H h10 = (H) obj;
                return Build.VERSION.SDK_INT >= 33 ? h10.f2817a.getPackageManager().getPackageInfo(h10.f2817a.getPackageName(), PackageManager.PackageInfoFlags.of(4100L)) : h10.f2817a.getPackageManager().getPackageInfo(h10.f2817a.getPackageName(), 4100);
            case 4:
                ((c) obj).invoke();
                Long l5 = 5L;
                return Long.valueOf(l5.longValue() * 60000);
            case 5:
                I9.c cVar = U.f211a;
                C0575f.e(F.a(q.f1782a), null, null, new m((C1484a) obj, null), 3);
                return C1992A.f18074a;
            case 6:
                l8.b bVar2 = ((U7.f) obj).f12508b;
                l8.d<Integer> PH_INTERSTITIAL_CAPPING_SECONDS = i8.d.f38584z;
                l.e(PH_INTERSTITIAL_CAPPING_SECONDS, "PH_INTERSTITIAL_CAPPING_SECONDS");
                return Long.valueOf(((Number) bVar2.h(PH_INTERSTITIAL_CAPPING_SECONDS)).intValue());
            case 7:
                int i = AbstractActivityC4340c.i;
                return (TextView) ((AbstractActivityC4340c) obj).findViewById(R.id.tvPriceOld);
            case 8:
                ((androidx.room.c) obj).getClass();
                return C1992A.f18074a;
            default:
                return ((AbstractC5340b) obj).d();
        }
    }
}
