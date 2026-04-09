package I2;

import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import java.util.Map;
import p9.q;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionProcessBar f2428b;

    public /* synthetic */ l(PermissionProcessBar permissionProcessBar) {
        this.f2428b = permissionProcessBar;
    }

    @Override // p9.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.l.f((e8.c) obj, "<unused var>");
        kotlin.jvm.internal.l.f((Map) obj2, "<unused var>");
        if (zBooleanValue) {
            PermissionProcessBar permissionProcessBar = this.f2428b;
            String string = permissionProcessBar.getString(R.string.permissions_required);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            String string2 = permissionProcessBar.getString(R.string.permission_settings_message);
            kotlin.jvm.internal.l.e(string2, "getString(...)");
            String string3 = permissionProcessBar.getString(R.string.OK);
            kotlin.jvm.internal.l.e(string3, "getString(...)");
            String string4 = permissionProcessBar.getString(R.string.cancel);
            kotlin.jvm.internal.l.e(string4, "getString(...)");
            e8.f.c(permissionProcessBar, string, string2, string3, string4);
        }
        return C1992A.f18074a;
    }
}
