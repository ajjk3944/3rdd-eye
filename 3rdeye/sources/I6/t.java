package I6;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import b9.C1992A;
import java.io.File;
import p9.InterfaceC5480a;

/* compiled from: ViewCopies.kt */
/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements InterfaceC5480a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2593h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Object obj, Object obj2) {
        super(0);
        this.f2592g = i;
        this.f2593h = obj;
        this.i = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        switch (this.f2592g) {
            case 0:
                v.c((View) this.i, (ImageView) this.f2593h);
                return C1992A.f18074a;
            default:
                Context applicationContext = (Context) this.f2593h;
                kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
                String name = ((Z0.b) this.i).f13982a;
                kotlin.jvm.internal.l.f(name, "name");
                String fileName = kotlin.jvm.internal.l.k(".preferences_pb", name);
                kotlin.jvm.internal.l.f(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), kotlin.jvm.internal.l.k(fileName, "datastore/"));
        }
    }
}
