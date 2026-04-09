package s7;

import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: s7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7918e implements InterfaceC7917d {

    /* renamed from: a, reason: collision with root package name */
    private final ij.c f61369a = new ij.c(200);

    @Override // s7.InterfaceC7917d
    public String a(C7916c identification) {
        AbstractC6492s.i(identification, "identification");
        Iterator it = this.f61369a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            UUID uuid = (UUID) entry.getKey();
            C7916c c7916c = (C7916c) entry.getValue();
            if (c7916c.e(identification)) {
                this.f61369a.get(uuid);
                c7916c.f(identification);
                String string = uuid.toString();
                AbstractC6492s.h(string, "key.toString()");
                return string;
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f61369a.put(uuidRandomUUID, identification);
        String string2 = uuidRandomUUID.toString();
        AbstractC6492s.h(string2, "newUuid.toString()");
        return string2;
    }
}
