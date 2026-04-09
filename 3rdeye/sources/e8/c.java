package e8;

import I2.i;
import I2.j;
import I2.k;
import I2.l;
import J8.C0687b;
import android.app.Application;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;
import e.AbstractC4292c;
import f.C4329b;
import java.util.ArrayList;
import x2.AbstractActivityC5757a;
import y0.C5788a;

/* compiled from: MultiplePermissionsRequester.kt */
/* loaded from: classes3.dex */
public final class c extends AbstractC4324a {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f37763d;

    /* renamed from: e, reason: collision with root package name */
    public i f37764e;

    /* renamed from: f, reason: collision with root package name */
    public j f37765f;

    /* renamed from: g, reason: collision with root package name */
    public k f37766g;

    /* renamed from: h, reason: collision with root package name */
    public l f37767h;
    public final C0687b i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC4292c<String[]> f37768j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f37769k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PermissionProcessBar permissionProcessBar, String[] permissions) {
        super(permissionProcessBar);
        kotlin.jvm.internal.l.f(permissions, "permissions");
        this.f37763d = permissions;
        this.f37768j = permissionProcessBar.registerForActivityResult(new C4329b(), new D7.c(this, 13));
        C0687b c0687b = new C0687b(permissionProcessBar.getClass(), new C4325b(this));
        this.i = c0687b;
        Application application = permissionProcessBar.getApplication();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(c0687b);
        } else {
            va.a.f47104a.c("Initialization of MultiplePermissionsRequester should be done when host activity had already created", new Object[0]);
        }
    }

    @Override // e8.AbstractC4324a
    public final AbstractC4292c<?> a() {
        return this.f37768j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e8.AbstractC4324a
    public final void b() {
        k kVar;
        if (this.f37769k) {
            return;
        }
        AbstractActivityC5757a abstractActivityC5757a = this.f37760b;
        if (abstractActivityC5757a.isFinishing()) {
            return;
        }
        String[] strArr = this.f37763d;
        for (String str : strArr) {
            if (!f.a(abstractActivityC5757a, str)) {
                if (!f.b(abstractActivityC5757a, strArr) || this.f37761c || (kVar = this.f37766g) == null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str2 : strArr) {
                        if (!f.a(abstractActivityC5757a, str2)) {
                            arrayList.add(str2);
                        }
                    }
                    this.f37768j.b(arrayList.toArray(new String[0]));
                    return;
                }
                this.f37761c = true;
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : strArr) {
                    if (C5788a.b(abstractActivityC5757a, str3)) {
                        arrayList2.add(str3);
                    }
                }
                kVar.invoke(this, arrayList2);
                return;
            }
        }
        i iVar = this.f37764e;
        if (iVar != null) {
            iVar.invoke(this);
        }
    }
}
