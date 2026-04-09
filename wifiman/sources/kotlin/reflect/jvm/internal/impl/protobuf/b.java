package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.a;

/* loaded from: classes4.dex */
public abstract class b implements p {

    /* renamed from: a, reason: collision with root package name */
    private static final f f51939a = f.c();

    private n d(n nVar) throws InvalidProtocolBufferException {
        if (nVar == null || nVar.m()) {
            return nVar;
        }
        throw e(nVar).a().n(nVar);
    }

    private UninitializedMessageException e(n nVar) {
        return nVar instanceof a ? ((a) nVar).g() : new UninitializedMessageException(nVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public n c(InputStream inputStream, f fVar) {
        return d(h(inputStream, fVar));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n a(InputStream inputStream, f fVar) {
        return d(i(inputStream, fVar));
    }

    public n h(InputStream inputStream, f fVar) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return i(new a.AbstractC1921a.C1922a(inputStream, e.A(i10, inputStream)), fVar);
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        }
    }

    public n i(InputStream inputStream, f fVar) throws InvalidProtocolBufferException {
        e eVarG = e.g(inputStream);
        n nVar = (n) b(eVarG, fVar);
        try {
            eVarG.a(0);
            return nVar;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.n(nVar);
        }
    }
}
