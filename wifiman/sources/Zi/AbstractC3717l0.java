package Zi;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.C7972g;

/* renamed from: Zi.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3717l0 extends AbstractC3694a {

    /* renamed from: a, reason: collision with root package name */
    private final Vi.b f25660a;

    /* renamed from: b, reason: collision with root package name */
    private final Vi.b f25661b;

    public /* synthetic */ AbstractC3717l0(Vi.b bVar, Vi.b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bVar2);
    }

    @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
    public abstract Xi.f a();

    @Override // Vi.o
    public void e(Yi.f encoder, Object obj) {
        AbstractC6492s.i(encoder, "encoder");
        int iK = k(obj);
        Xi.f fVarA = a();
        Yi.d dVarX = encoder.x(fVarA, iK);
        Iterator itJ = j(obj);
        int i10 = 0;
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            dVarX.q(a(), i10, s(), key);
            i10 += 2;
            dVarX.q(a(), i11, t(), value);
        }
        dVarX.b(fVarA);
    }

    public final Vi.b s() {
        return this.f25660a;
    }

    public final Vi.b t() {
        return this.f25661b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m(Yi.c decoder, Map builder, int i10, int i11) {
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, i11 * 2), 2);
        int i12 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK <= 0 || i12 > iJ) && (iK >= 0 || iJ > i12)) {
            return;
        }
        while (true) {
            n(decoder, i10 + i12, builder, false);
            if (i12 == iJ) {
                return;
            } else {
                i12 += iK;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Zi.AbstractC3694a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void n(Yi.c decoder, int i10, Map builder, boolean z10) {
        int iK;
        AbstractC6492s.i(decoder, "decoder");
        AbstractC6492s.i(builder, "builder");
        Object objJ = Yi.c.j(decoder, a(), i10, this.f25660a, null, 8, null);
        if (z10) {
            iK = decoder.k(a());
            if (iK != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iK).toString());
            }
        } else {
            iK = i10 + 1;
        }
        int i11 = iK;
        builder.put(objJ, (!builder.containsKey(objJ) || (this.f25661b.a().h() instanceof Xi.e)) ? Yi.c.j(decoder, a(), i11, this.f25661b, null, 8, null) : decoder.p(a(), i11, this.f25661b, Zg.U.i(builder, objJ)));
    }

    private AbstractC3717l0(Vi.b bVar, Vi.b bVar2) {
        super(null);
        this.f25660a = bVar;
        this.f25661b = bVar2;
    }
}
