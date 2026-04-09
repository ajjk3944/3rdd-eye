package d5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import h9.r2;
import io.sentry.b5;
import io.sentry.f4;
import io.sentry.i6;
import io.sentry.n3;
import io.sentry.v1;
import io.sentry.x5;
import java.io.File;
import java.util.Timer;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements a5.j, db.r, dd.d, a5.k, f6.a, bf.f, h1.i, dd.a, ua.a, v1, io.sentry.util.d, n3, io.sentry.transport.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7094a;

    public /* synthetic */ v(int i10) {
        this.f7094a = i10;
    }

    @Override // a5.j
    public void a(Object obj) {
        ((androidx.media3.common.q0) obj).onRenderedFirstFrame();
    }

    @Override // f6.a, ua.a
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        switch (this.f7094a) {
            case 4:
                break;
            default:
                if ((i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) && (i11 != 77 || i12 != 76 || i13 != 76 || (i14 != 84 && i10 != 2))) {
                }
                break;
        }
        return false;
    }

    @Override // io.sentry.n3
    public void c(i6 i6Var) {
    }

    @Override // io.sentry.transport.f
    public long d() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.util.d
    public Object e() {
        switch (this.f7094a) {
            case 16:
                return x5.empty();
            case 18:
                return new f4();
            case 19:
                byte[] bArr = new byte[8];
                io.sentry.util.i.a().b(bArr);
                byte b2 = (byte) (bArr[6] & 15);
                bArr[6] = b2;
                bArr[6] = (byte) (b2 | 64);
                long j = 0;
                for (int i10 = 0; i10 < 8; i10++) {
                    j = (j << 8) | (bArr[i10] & 255);
                }
                char[] cArr = new char[16];
                io.sentry.util.l.a(cArr, j);
                return new String(cArr);
            case 21:
                return new FrameMetricsAggregator();
            case 28:
                try {
                    return Build.MODEL.split(" ", -1)[0];
                } catch (Throwable unused) {
                    b5 b5Var = b5.DEBUG;
                    return null;
                }
            default:
                return new Timer(true);
        }
    }

    @Override // bf.f
    public Object f(r2 r2Var) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(r2Var);
    }

    @Override // io.sentry.v1
    public Object g() {
        return null;
    }

    @Override // a5.k
    public void h(Object obj, androidx.media3.common.p pVar) {
        DefaultAnalyticsCollector.lambda$new$0((e5.c) obj, pVar);
    }

    @Override // h1.i
    public double i(double d6) {
        switch (this.f7094a) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                double d10 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d10 >= 0.0031308049535603718d ? (Math.pow(d10, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d10 / 0.07739938080495357d, d6);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                double d11 = d6 < 0.0d ? -d6 : d6;
                return Math.copySign(d11 >= 0.04045d ? Math.pow((0.9478672985781991d * d11) + 0.05213270142180095d, 2.4d) : d11 * 0.07739938080495357d, d6);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                float[] fArr = h1.d.f9687a;
                return h1.d.b(h1.d.f9689c, d6);
            case 9:
                float[] fArr2 = h1.d.f9687a;
                return h1.d.a(h1.d.f9689c, d6);
            case 10:
                float[] fArr3 = h1.d.f9687a;
                return h1.d.d(h1.d.f9690d, d6);
            case 11:
                float[] fArr4 = h1.d.f9687a;
                return h1.d.c(h1.d.f9690d, d6);
            default:
                return d6;
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        boolean z10;
        if (rVar.j()) {
            hf.a aVar = (hf.a) rVar.h();
            String str = aVar.f10637b;
            Log.isLoggable("FirebaseCrashlytics", 3);
            File file = aVar.f10638c;
            z10 = true;
            if (file.delete()) {
                file.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                io.sentry.android.core.e0.q("FirebaseCrashlytics", "Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            io.sentry.android.core.e0.q("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", rVar.g());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public Object k(Context context) {
        String string;
        switch (this.f7094a) {
            case 23:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                } catch (Throwable unused) {
                    return null;
                }
            case 24:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                } catch (Throwable unused2) {
                    return null;
                }
            case 25:
                try {
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (Throwable unused3) {
                    return null;
                }
            case 26:
                try {
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    int i10 = applicationInfo.labelRes;
                    if (i10 == 0) {
                        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
                        string = charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                    } else {
                        string = context.getString(i10);
                    }
                    return string;
                } catch (Throwable unused4) {
                    return null;
                }
            default:
                try {
                    return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
                } catch (Throwable unused5) {
                    return null;
                }
        }
    }

    @Override // dd.d
    public void y(Exception exc) {
        io.sentry.android.core.e0.c("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    public /* synthetic */ v(r2 r2Var) {
        this.f7094a = 13;
    }
}
