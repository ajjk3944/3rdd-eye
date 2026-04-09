package ta;

import U9.F;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import java.io.IOException;
import java.io.Reader;
import sa.f;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes3.dex */
public final class c<T> implements f<F, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f46474a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f46475b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f46474a = gson;
        this.f46475b = typeAdapter;
    }

    @Override // sa.f
    public final Object convert(F f10) throws IOException {
        F f11 = f10;
        Reader readerCharStream = f11.charStream();
        this.f46474a.getClass();
        E5.a aVar = new E5.a(readerCharStream);
        aVar.f1424c = false;
        try {
            T tB = this.f46475b.b(aVar);
            if (aVar.C0() == E5.b.END_DOCUMENT) {
                return tB;
            }
            throw new h("JSON document was not fully consumed.");
        } finally {
            f11.close();
        }
    }
}
