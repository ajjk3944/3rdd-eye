package k3;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import p9.p;

/* compiled from: Speedometer.kt */
/* loaded from: classes.dex */
public final class f extends m implements p<Integer, Float, String> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f43375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar) {
        super(2);
        this.f43375g = eVar;
    }

    @Override // p9.p
    public final String invoke(Integer num, Float f10) {
        num.intValue();
        return String.format(this.f43375g.getLocale(), "%.0f", Arrays.copyOf(new Object[]{Float.valueOf(f10.floatValue())}, 1));
    }
}
