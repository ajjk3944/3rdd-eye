package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import y9.c;

/* loaded from: classes4.dex */
public abstract class d1 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.b f22839a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.b f22840b;

    public /* synthetic */ d1(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2, kotlin.jvm.internal.i iVar) {
        this(bVar, bVar2);
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public abstract kotlinx.serialization.descriptors.f getDescriptor();

    public final kotlinx.serialization.b m() {
        return this.f22839a;
    }

    public final kotlinx.serialization.b n() {
        return this.f22840b;
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void g(y9.c decoder, Map builder, int i10, int i11) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        q9.a aVarI = q9.e.i(q9.e.j(0, i11 * 2), 2);
        int iC = aVarI.c();
        int iD = aVarI.d();
        int iE = aVarI.e();
        if ((iE <= 0 || iC > iD) && (iE >= 0 || iD > iC)) {
            return;
        }
        while (true) {
            h(decoder, i10 + iC, builder, false);
            if (iC == iD) {
                return;
            } else {
                iC += iE;
            }
        }
    }

    @Override // kotlinx.serialization.internal.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void h(y9.c decoder, int i10, Map builder, boolean z10) {
        int iO;
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlin.jvm.internal.p.e(builder, "builder");
        Object objC = c.a.c(decoder, getDescriptor(), i10, this.f22839a, null, 8, null);
        if (z10) {
            iO = decoder.o(getDescriptor());
            if (iO != i10 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i10 + ", returned index for value: " + iO).toString());
            }
        } else {
            iO = i10 + 1;
        }
        int i11 = iO;
        builder.put(objC, (!builder.containsKey(objC) || (this.f22840b.getDescriptor().getKind() instanceof kotlinx.serialization.descriptors.e)) ? c.a.c(decoder, getDescriptor(), i11, this.f22840b, null, 8, null) : decoder.y(getDescriptor(), i11, this.f22840b, kotlin.collections.a.i(builder, objC)));
    }

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object obj) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        int iE = e(obj);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        y9.d dVarJ = encoder.j(descriptor, iE);
        Iterator itD = d(obj);
        int i10 = 0;
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            dVarJ.C(getDescriptor(), i10, m(), key);
            i10 += 2;
            dVarJ.C(getDescriptor(), i11, n(), value);
        }
        dVarJ.c(descriptor);
    }

    public d1(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2) {
        super(null);
        this.f22839a = bVar;
        this.f22840b = bVar2;
    }
}
