package xr;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class c extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final c f25487g;

    /* renamed from: r, reason: collision with root package name */
    public static final c f25488r;

    /* renamed from: x, reason: collision with root package name */
    public static final c f25489x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f25490y;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25491d;

    static {
        int i10 = 1;
        f25487g = new c(i10, 0);
        f25488r = new c(i10, 1);
        f25489x = new c(i10, 2);
        f25490y = new c(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f25491d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f25491d) {
            case 0:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                br.l.e(parameterizedType, "it");
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                br.l.e(parameterizedType2, "it");
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                br.l.d(actualTypeArguments, "it.actualTypeArguments");
                return mq.l.Y(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!qs.g.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return qs.g.e(simpleName);
                }
                return null;
        }
    }
}
