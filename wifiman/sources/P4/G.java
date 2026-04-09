package p4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p4.I;

/* loaded from: classes3.dex */
public final class G extends AbstractC7219b {

    /* renamed from: a, reason: collision with root package name */
    private final I f57557a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.b f57558b;

    /* renamed from: c, reason: collision with root package name */
    private final C4.a f57559c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f57560d;

    private G(I i10, C4.b bVar, C4.a aVar, Integer num) {
        this.f57557a = i10;
        this.f57558b = bVar;
        this.f57559c = aVar;
        this.f57560d = num;
    }

    public static G a(I.a aVar, C4.b bVar, Integer num) throws GeneralSecurityException {
        I.a aVar2 = I.a.f57565d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            I iA = I.a(aVar);
            return new G(iA, bVar, b(iA, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    private static C4.a b(I i10, Integer num) {
        if (i10.b() == I.a.f57565d) {
            return C4.a.a(new byte[0]);
        }
        if (i10.b() == I.a.f57564c) {
            return C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i10.b() == I.a.f57563b) {
            return C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i10.b());
    }
}
