package I2;

import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import java.util.List;
import p9.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionProcessBar f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e8.c f2427c;

    public /* synthetic */ k(PermissionProcessBar permissionProcessBar, e8.c cVar) {
        this.f2426b = permissionProcessBar;
        this.f2427c = cVar;
    }

    @Override // p9.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.jvm.internal.l.f((e8.c) obj, "<unused var>");
        kotlin.jvm.internal.l.f((List) obj2, "<unused var>");
        PermissionProcessBar permissionProcessBar = this.f2426b;
        String string = permissionProcessBar.getString(R.string.permissions_required);
        kotlin.jvm.internal.l.e(string, "getString(...)");
        String string2 = permissionProcessBar.getString(R.string.rationale_permission);
        kotlin.jvm.internal.l.e(string2, "getString(...)");
        String string3 = permissionProcessBar.getString(R.string.OK);
        kotlin.jvm.internal.l.e(string3, "getString(...)");
        e8.f.d(permissionProcessBar, this.f2427c, string, string2, string3);
        return C1992A.f18074a;
    }
}
