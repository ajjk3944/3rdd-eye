package ec;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Environment;
import android.os.Trace;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b0 f22555b = new b0(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22556a;

    public /* synthetic */ b0(int i4) {
        this.f22556a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22556a) {
            case 0:
                com.google.android.gms.internal.measurement.n4.f19836i.incrementAndGet();
                return;
            case 1:
                try {
                    Method method = a4.m.f199b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (w4.i.c()) {
                        w4.i.a().d();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    Method method2 = a4.m.f199b;
                    Trace.endSection();
                    throw th2;
                }
            default:
                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                String path = Environment.getExternalStorageDirectory().getPath();
                int i4 = StorageAnalyzeActivity.C;
                Intent intent = new Intent(deviceInfoApp, (Class<?>) StorageAnalyzeActivity.class);
                intent.putExtra("analyze_path", path);
                Intent intentAddFlags = intent.setAction("android.intent.action.VIEW").addFlags(335544320);
                t3.a aVar = new t3.a();
                aVar.f34156a = deviceInfoApp;
                aVar.f34157b = "shortcut_storage_analyze";
                aVar.f34159d = deviceInfoApp.getString(R.string.storage_analyze);
                aVar.f34160e = deviceInfoApp.getString(R.string.storage_analyze);
                PorterDuff.Mode mode = IconCompat.f899k;
                aVar.f34161f = IconCompat.b(deviceInfoApp.getResources(), deviceInfoApp.getPackageName(), R.drawable.ic_shortcut_storage_analyze);
                aVar.f34158c = new Intent[]{intentAddFlags};
                if (TextUtils.isEmpty(aVar.f34159d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr = aVar.f34158c;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                t3.a aVar2 = new t3.a();
                aVar2.f34156a = deviceInfoApp;
                aVar2.f34157b = "shortcut_apps_analyze";
                aVar2.f34159d = deviceInfoApp.getString(R.string.apps_analyze);
                aVar2.f34160e = deviceInfoApp.getString(R.string.apps_analyze);
                aVar2.f34161f = IconCompat.b(deviceInfoApp.getResources(), deviceInfoApp.getPackageName(), R.drawable.ic_shortcut_app_analyze);
                aVar2.f34158c = new Intent[]{new Intent("android.intent.action.VIEW").setComponent(new ComponentName(deviceInfoApp, (Class<?>) AppsAnalyzeActivity.class)).addFlags(335544320)};
                if (TextUtils.isEmpty(aVar2.f34159d)) {
                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                }
                Intent[] intentArr2 = aVar2.f34158c;
                if (intentArr2 == null || intentArr2.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                try {
                    t3.c.d(deviceInfoApp);
                    t3.c.a(deviceInfoApp, Arrays.asList(aVar, aVar2));
                } catch (Exception unused) {
                }
                ci.b.m();
                ii.a.p();
                return;
        }
    }
}
