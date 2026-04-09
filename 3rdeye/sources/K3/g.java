package k3;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p9.p;

/* compiled from: Speedometer.kt */
/* loaded from: classes.dex */
public final class g extends m implements p<Integer, Float, String> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f43376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar) {
        super(2);
        this.f43376g = eVar;
    }

    @Override // p9.p
    public final String invoke(Integer num, Float f10) {
        num.intValue();
        return String.format(this.f43376g.getLocale(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
    }
}
