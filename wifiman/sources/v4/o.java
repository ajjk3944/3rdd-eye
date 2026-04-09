package v4;

import A4.I;
import A4.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final String f63459a;

    /* renamed from: b, reason: collision with root package name */
    private final C4.a f63460b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5081h f63461c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f63462d;

    /* renamed from: e, reason: collision with root package name */
    private final I f63463e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f63464f;

    private o(String str, AbstractC5081h abstractC5081h, y.c cVar, I i10, Integer num) {
        this.f63459a = str;
        this.f63460b = s.e(str);
        this.f63461c = abstractC5081h;
        this.f63462d = cVar;
        this.f63463e = i10;
        this.f63464f = num;
    }

    public static o b(String str, AbstractC5081h abstractC5081h, y.c cVar, I i10, Integer num) throws GeneralSecurityException {
        if (i10 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC5081h, cVar, i10, num);
    }

    @Override // v4.q
    public C4.a a() {
        return this.f63460b;
    }

    public Integer c() {
        return this.f63464f;
    }

    public y.c d() {
        return this.f63462d;
    }

    public I e() {
        return this.f63463e;
    }

    public String f() {
        return this.f63459a;
    }

    public AbstractC5081h g() {
        return this.f63461c;
    }
}
