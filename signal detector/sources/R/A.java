package R;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3257e;

    public A(int i, Class cls, int i3, int i6, int i7) {
        this.f3257e = i7;
        this.f3259a = i;
        this.f3262d = cls;
        this.f3261c = i3;
        this.f3260b = i6;
    }

    @Override // R.C
    public final Object c(View view) {
        switch (this.f3257e) {
            case 0:
                return Boolean.valueOf(J.c(view));
            case 1:
                return J.a(view);
            case 2:
                return L.b(view);
            default:
                return Boolean.valueOf(J.b(view));
        }
    }

    @Override // R.C
    public final void d(View view, Object obj) {
        switch (this.f3257e) {
            case 0:
                J.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                J.e(view, (CharSequence) obj);
                break;
            case 2:
                L.c(view, (CharSequence) obj);
                break;
            default:
                J.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // R.C
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f3257e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
