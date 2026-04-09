package e4;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i0 extends ak.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22356e;

    public i0(int i4, Class cls, int i10, int i11, int i12) {
        this.f22356e = i12;
        this.f443a = i4;
        this.f446d = cls;
        this.f445c = i10;
        this.f444b = i11;
    }

    @Override // ak.f
    public final Object c(View view) {
        switch (this.f22356e) {
            case 0:
                return Boolean.valueOf(q0.c(view));
            case 1:
                return q0.a(view);
            case 2:
                return s0.b(view);
            default:
                return Boolean.valueOf(q0.b(view));
        }
    }

    @Override // ak.f
    public final void d(View view, Object obj) {
        switch (this.f22356e) {
            case 0:
                q0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                q0.e(view, (CharSequence) obj);
                break;
            case 2:
                s0.c(view, (CharSequence) obj);
                break;
            default:
                q0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // ak.f
    public final boolean g(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f22356e) {
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
