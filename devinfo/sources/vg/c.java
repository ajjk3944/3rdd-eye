package vg;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.liuzh.deviceinfo.utilities.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Context f36221a;

    /* renamed from: b, reason: collision with root package name */
    public double f36222b;

    /* renamed from: c, reason: collision with root package name */
    public double f36223c;

    /* renamed from: d, reason: collision with root package name */
    public double f36224d;

    /* renamed from: e, reason: collision with root package name */
    public double f36225e;

    /* renamed from: f, reason: collision with root package name */
    public String f36226f;

    public c(Context context) {
        this.f36221a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            this.f36223c = ((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024.0d) / 1024.0d;
            double blockSizeLong = ((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024.0d) / 1024.0d;
            this.f36222b = blockSizeLong;
            this.f36224d = blockSizeLong - this.f36223c;
            long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            long blockSizeLong3 = statFs.getBlockSizeLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            Long.signum(blockSizeLong3);
            this.f36225e = ((blockSizeLong2 - (blockSizeLong3 * availableBlocksLong)) * 100) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
            this.f36226f = str;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        try {
            StatFs statFs = new StatFs("/data");
            this.f36223c = (((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            double blockSizeLong = (((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            this.f36222b = blockSizeLong;
            this.f36224d = blockSizeLong - this.f36223c;
            long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            long blockSizeLong3 = statFs.getBlockSizeLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            Long.signum(blockSizeLong3);
            this.f36225e = ((blockSizeLong2 - (blockSizeLong3 * availableBlocksLong)) * 100) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
            this.f36226f = "/data";
        } catch (Exception unused) {
        }
    }

    public final boolean c() {
        String[] strArrT;
        Context context = this.f36221a;
        try {
            if (TextUtils.equals(Environment.getExternalStorageState(), "mounted") && context.getExternalFilesDirs(null).length >= 2 && (strArrT = l.T(context)) != null && strArrT.length != 0) {
                StatFs statFs = new StatFs(strArrT[0]);
                this.f36223c = (((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024.0d) / 1024.0d) / 1024.0d;
                double blockSizeLong = (((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024.0d) / 1024.0d) / 1024.0d;
                this.f36222b = blockSizeLong;
                this.f36224d = blockSizeLong - this.f36223c;
                long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
                long blockSizeLong3 = statFs.getBlockSizeLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong();
                Long.signum(blockSizeLong3);
                this.f36225e = ((blockSizeLong2 - (blockSizeLong3 * availableBlocksLong)) * 100) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
                this.f36226f = strArrT[0];
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final void d() {
        try {
            this.f36226f = Environment.getExternalStorageDirectory().getPath();
            StatFs statFs = new StatFs(this.f36226f);
            this.f36223c = (((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            double blockSizeLong = (((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            this.f36222b = blockSizeLong;
            this.f36224d = blockSizeLong - this.f36223c;
            long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            long blockSizeLong3 = statFs.getBlockSizeLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            Long.signum(blockSizeLong3);
            this.f36225e = ((blockSizeLong2 - (blockSizeLong3 * availableBlocksLong)) * 100) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
        } catch (Exception unused) {
        }
    }

    public final void e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) this.f36221a.getSystemService("activity");
            if (activityManager == null) {
                return;
            }
            activityManager.getMemoryInfo(memoryInfo);
            double d10 = (memoryInfo.availMem / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            this.f36223c = d10;
            double d11 = (memoryInfo.totalMem / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
            this.f36222b = d11;
            double d12 = d11 - d10;
            this.f36224d = d12;
            this.f36225e = (d12 * 100.0d) / d11;
        } catch (Exception unused) {
        }
    }

    public final void f() {
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            this.f36223c = (((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            double blockSizeLong = (((statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1024.0d) / 1024.0d) / 1024.0d;
            this.f36222b = blockSizeLong;
            this.f36224d = blockSizeLong - this.f36223c;
            long blockSizeLong2 = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            long blockSizeLong3 = statFs.getBlockSizeLong();
            long availableBlocksLong = statFs.getAvailableBlocksLong();
            Long.signum(blockSizeLong3);
            this.f36225e = ((blockSizeLong2 - (blockSizeLong3 * availableBlocksLong)) * 100) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
            this.f36226f = Environment.getRootDirectory().getAbsolutePath();
        } catch (Exception unused) {
        }
    }
}
