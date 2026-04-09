package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zj0 implements dp2 {
    public final Context f;

    public /* synthetic */ zj0(Context context) {
        this.f = context;
    }

    public ApplicationInfo a(String str, int i) {
        return this.f.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo b(String str, int i) {
        return this.f.getPackageManager().getPackageInfo(str, i);
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ((en2) obj).l(this.f);
    }

    public boolean d() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f;
        if (callingUid == iMyUid) {
            return a30.f(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
