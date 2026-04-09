package y8;

import android.app.Activity;
import android.content.Context;
import androidx.preference.Preference;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.settings.c;
import kotlin.jvm.internal.l;

/* compiled from: R8$$SyntheticClass */
/* renamed from: y8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5818a implements Preference.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f48357c;

    public /* synthetic */ C5818a(Context context, int i) {
        this.f48356b = i;
        this.f48357c = context;
    }

    @Override // androidx.preference.Preference.c
    public final boolean e(Preference it) {
        switch (this.f48356b) {
            case 0:
                l.f(it, "it");
                e.f37006D.getClass();
                e eVarA = e.a.a();
                Context context = this.f48357c;
                eVarA.f37011C.getClass();
                c.a(context);
                break;
            default:
                l.f(it, "it");
                e.f37006D.getClass();
                e.a.a().f37011C.getClass();
                Context context2 = this.f48357c;
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    e.a.a().n(activity);
                    break;
                }
                break;
        }
        return true;
    }
}
