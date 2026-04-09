package p4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p4.C7215A;

/* loaded from: classes3.dex */
public final class y extends AbstractC7219b {

    /* renamed from: a, reason: collision with root package name */
    private final C7215A f57665a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f57666b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f57667c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f57668d;

    private y(C7215A c7215a, C4.b bVar, C4.a aVar, Integer num) {
        this.f57665a = c7215a;
        this.f57666b = bVar;
        this.f57667c = aVar;
        this.f57668d = num;
    }

    public static y a(C7215A.a aVar, C4.b bVar, Integer num) throws GeneralSecurityException {
        C7215A.a aVar2 = C7215A.a.f57544d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            C7215A c7215aA = C7215A.a(aVar);
            return new y(c7215aA, bVar, b(c7215aA, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static C4.a b(C7215A c7215a, Integer num) {
        if (c7215a.b() == C7215A.a.f57544d) {
            return C4.a.a(new byte[0]);
        }
        if (c7215a.b() == C7215A.a.f57543c) {
            return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (c7215a.b() == C7215A.a.f57542b) {
            return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + c7215a.b());
    }
}
