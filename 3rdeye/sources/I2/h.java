package I2;

import android.content.Context;
import b9.C1992A;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import p9.p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2423b;

    public /* synthetic */ h(Context context) {
        this.f2423b = context;
    }

    @Override // p9.p
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        kotlin.jvm.internal.l.f((e8.d) obj, "<unused var>");
        if (zBooleanValue) {
            Context context = this.f2423b;
            String string = context.getString(R.string.permissions_required);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            String string2 = context.getString(R.string.permission_settings_message);
            kotlin.jvm.internal.l.e(string2, "getString(...)");
            String string3 = context.getString(R.string.OK);
            kotlin.jvm.internal.l.e(string3, "getString(...)");
            String string4 = context.getString(R.string.cancel);
            kotlin.jvm.internal.l.e(string4, "getString(...)");
            e8.f.c(context, string, string2, string3, string4);
        }
        return C1992A.f18074a;
    }
}
