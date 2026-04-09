package V8;

import G6.G;
import V8.e;
import h9.C5969a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class f implements e.a {

    /* renamed from: a, reason: collision with root package name */
    private final G f23169a;

    public f(G client) {
        AbstractC6492s.i(client, "client");
        this.f23169a = client;
    }

    @Override // T8.b.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(C5969a hwAddress, UUID uuid, UUID readCharacteristic, UUID uuid2, UUID writeCharacteristic, e.b params) {
        AbstractC6492s.i(hwAddress, "hwAddress");
        AbstractC6492s.i(readCharacteristic, "readCharacteristic");
        AbstractC6492s.i(writeCharacteristic, "writeCharacteristic");
        AbstractC6492s.i(params, "params");
        return new k(this.f23169a, hwAddress, uuid, readCharacteristic, uuid2, writeCharacteristic, params, null);
    }
}
