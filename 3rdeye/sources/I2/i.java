package I2;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import b9.C1992A;
import com.zipoapps.premiumhelper.ui.settings.PHSettingsActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2425c;

    public /* synthetic */ i(Object obj, int i) {
        this.f2424b = i;
        this.f2425c = obj;
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f2424b) {
            case 0:
                e8.c it = (e8.c) obj;
                kotlin.jvm.internal.l.f(it, "it");
                ((G1.e) this.f2425c).invoke();
                return C1992A.f18074a;
            case 1:
                Resources resources = (Resources) obj;
                kotlin.jvm.internal.l.f(resources, "resources");
                TypedArray typedArrayObtainStyledAttributes = ((PHSettingsActivity) this.f2425c).getTheme().obtainStyledAttributes(new int[]{R.attr.windowLightStatusBar});
                kotlin.jvm.internal.l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                Boolean boolValueOf = typedArrayObtainStyledAttributes.hasValue(0) ? Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(0, false)) : null;
                boolean zBooleanValue = (resources.getConfiguration().uiMode & 48) == 32;
                Boolean boolValueOf2 = boolValueOf != null ? Boolean.valueOf(!boolValueOf.booleanValue()) : null;
                Boolean bool = boolValueOf2 != null ? boolValueOf2 : null;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            default:
                ((com.zipoapps.premiumhelper.e) this.f2425c).e().d((Throwable) obj);
                return C1992A.f18074a;
        }
    }
}
