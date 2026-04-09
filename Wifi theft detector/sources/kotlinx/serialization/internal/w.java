package kotlinx.serialization.internal;

import java.util.Iterator;
import y9.c;

/* loaded from: classes4.dex */
public abstract class w extends a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.b f22927a;

    public /* synthetic */ w(kotlinx.serialization.b bVar, kotlin.jvm.internal.i iVar) {
        this(bVar);
    }

    @Override // kotlinx.serialization.internal.a
    public final void g(y9.c decoder, Object obj, int i10, int i11) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            h(decoder, i10 + i12, obj, false);
        }
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public abstract kotlinx.serialization.descriptors.f getDescriptor();

    @Override // kotlinx.serialization.internal.a
    public void h(y9.c decoder, int i10, Object obj, boolean z10) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        n(obj, i10, c.a.c(decoder, getDescriptor(), i10, this.f22927a, null, 8, null));
    }

    public abstract void n(Object obj, int i10, Object obj2);

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object obj) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        int iE = e(obj);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        y9.d dVarJ = encoder.j(descriptor, iE);
        Iterator itD = d(obj);
        for (int i10 = 0; i10 < iE; i10++) {
            dVarJ.C(getDescriptor(), i10, this.f22927a, itD.next());
        }
        dVarJ.c(descriptor);
    }

    public w(kotlinx.serialization.b bVar) {
        super(null);
        this.f22927a = bVar;
    }
}
