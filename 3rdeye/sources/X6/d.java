package X6;

/* compiled from: AspectView.kt */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements p9.l<Float, Float> {

    /* renamed from: g, reason: collision with root package name */
    public static final d f13581g = new d(1);

    @Override // p9.l
    public final Float invoke(Float f10) {
        float fFloatValue = f10.floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        return Float.valueOf(fFloatValue);
    }
}
