package ie;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class e implements InterfaceC6147d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f49150a;

    public e(Map data) {
        AbstractC6492s.i(data, "data");
        this.f49150a = data;
    }

    @Override // ie.InterfaceC6147d
    public C6146c a(S8.e channel) {
        AbstractC6492s.i(channel, "channel");
        return (C6146c) this.f49150a.get(channel);
    }
}
