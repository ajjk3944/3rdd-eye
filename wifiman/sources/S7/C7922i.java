package s7;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: s7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7922i extends AbstractC7915b {

    /* renamed from: b, reason: collision with root package name */
    private final String f61374b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f61375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7922i(String uid, Set connections, Map extras) {
        super(extras);
        AbstractC6492s.i(uid, "uid");
        AbstractC6492s.i(connections, "connections");
        AbstractC6492s.i(extras, "extras");
        this.f61374b = uid;
        this.f61375c = connections;
    }

    @Override // s7.AbstractC7915b
    public Set c() {
        return this.f61375c;
    }
}
