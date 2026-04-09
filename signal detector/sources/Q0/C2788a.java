package q0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2788a extends v {

    /* renamed from: k, reason: collision with root package name */
    public Intent f22945k;

    /* renamed from: l, reason: collision with root package name */
    public String f22946l;

    public static String g(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        q5.i.d(packageName, "context.packageName");
        return y5.l.f0(str, "${applicationId}", packageName);
    }

    @Override // q0.v
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2788a) && super.equals(obj)) {
            Intent intent = this.f22945k;
            if ((intent != null ? intent.filterEquals(((C2788a) obj).f22945k) : ((C2788a) obj).f22945k == null) && q5.i.a(this.f22946l, ((C2788a) obj).f22946l)) {
                return true;
            }
        }
        return false;
    }

    @Override // q0.v
    public final void f(Context context, AttributeSet attributeSet) {
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, N.f22942a);
        q5.i.d(typedArrayObtainAttributes, "context.resources.obtain…tyNavigator\n            )");
        String strG = g(context, typedArrayObtainAttributes.getString(4));
        if (this.f22945k == null) {
            this.f22945k = new Intent();
        }
        Intent intent = this.f22945k;
        q5.i.b(intent);
        intent.setPackage(strG);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.f22945k == null) {
                this.f22945k = new Intent();
            }
            Intent intent2 = this.f22945k;
            q5.i.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.f22945k == null) {
            this.f22945k = new Intent();
        }
        Intent intent3 = this.f22945k;
        q5.i.b(intent3);
        intent3.setAction(string2);
        String strG2 = g(context, typedArrayObtainAttributes.getString(2));
        if (strG2 != null) {
            Uri uri = Uri.parse(strG2);
            if (this.f22945k == null) {
                this.f22945k = new Intent();
            }
            Intent intent4 = this.f22945k;
            q5.i.b(intent4);
            intent4.setData(uri);
        }
        this.f22946l = g(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // q0.v
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.f22945k;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.f22946l;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // q0.v
    public final String toString() {
        Intent intent = this.f22945k;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.f22945k;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
