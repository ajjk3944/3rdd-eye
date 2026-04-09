package di;

import Bh.G;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* loaded from: classes4.dex */
public final class z extends C5393b {

    /* renamed from: c, reason: collision with root package name */
    private final S f46115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List value, S type) {
        super(value, new y(type));
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(type, "type");
        this.f46115c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(S s10, G it) {
        AbstractC6492s.i(it, "it");
        return s10;
    }

    public final S e() {
        return this.f46115c;
    }
}
