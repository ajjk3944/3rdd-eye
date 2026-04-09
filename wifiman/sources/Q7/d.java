package Q7;

import Sj.a;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class d implements Q7.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19231d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a f19232a;

    /* renamed from: b, reason: collision with root package name */
    private final a.c f19233b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageManager f19234c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(com.google.firebase.crashlytics.a crashlytics, a.c tree, PackageManager packageManager) {
        AbstractC6492s.i(crashlytics, "crashlytics");
        AbstractC6492s.i(tree, "tree");
        AbstractC6492s.i(packageManager, "packageManager");
        this.f19232a = crashlytics;
        this.f19233b = tree;
        this.f19234c = packageManager;
    }

    private final void c(Context context) throws PackageManager.NameNotFoundException {
        String initiatingPackageName = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                InstallSourceInfo installSourceInfo = this.f19234c.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                }
            } catch (PackageManager.NameNotFoundException | IllegalArgumentException unused) {
            }
        } else {
            initiatingPackageName = this.f19234c.getInstallerPackageName(context.getPackageName());
        }
        com.google.firebase.crashlytics.a aVar = this.f19232a;
        if (initiatingPackageName == null) {
            initiatingPackageName = "unavailable/uninstalled";
        }
        aVar.h("installer_package", initiatingPackageName);
    }

    @Override // Q7.a
    public void a(String id2) {
        AbstractC6492s.i(id2, "id");
        this.f19232a.i(id2);
        this.f19232a.h("id", id2);
    }

    @Override // Q7.a
    public void b(Context context) throws PackageManager.NameNotFoundException {
        AbstractC6492s.i(context, "context");
        this.f19232a.g(true);
        c(context);
        Sj.a.f20830a.q(this.f19233b);
    }
}
