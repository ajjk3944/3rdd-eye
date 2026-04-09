package a4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b4.InterfaceC0353r;
import java.io.File;

/* loaded from: classes.dex */
public final class h implements InterfaceC0353r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4696a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4697b;

    public /* synthetic */ h(f fVar, int i) {
        this.f4696a = i;
        this.f4697b = fVar;
    }

    @Override // b4.InterfaceC0353r
    public final Object a() {
        String string;
        switch (this.f4696a) {
            case 0:
                Context context = this.f4697b.f4693b.f2065b;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                        return null;
                    }
                    return new File(context.getExternalFilesDir(null), string);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                Context context2 = this.f4697b.f4693b.f2065b;
                return new k(context2, context2.getPackageName());
        }
    }
}
