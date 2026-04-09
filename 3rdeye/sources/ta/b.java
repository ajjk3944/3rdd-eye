package ta;

import U9.D;
import U9.v;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.singular.sdk.internal.Constants;
import ia.C4468d;
import ia.e;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import sa.f;

/* compiled from: GsonRequestBodyConverter.java */
/* loaded from: classes3.dex */
public final class b<T> implements f<T, D> {

    /* renamed from: c, reason: collision with root package name */
    public static final v f46470c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f46471d;

    /* renamed from: a, reason: collision with root package name */
    public final Gson f46472a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f46473b;

    static {
        Pattern pattern = v.f12729d;
        f46470c = v.a.a("application/json; charset=UTF-8");
        f46471d = Charset.forName(Constants.ENCODING);
    }

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f46472a = gson;
        this.f46473b = typeAdapter;
    }

    @Override // sa.f
    public final D convert(Object obj) throws IOException {
        C4468d c4468d = new C4468d();
        E5.c cVarF = this.f46472a.f(new OutputStreamWriter(new e(c4468d), f46471d));
        this.f46473b.c(cVarF, obj);
        cVarF.close();
        return D.create(f46470c, c4468d.g(c4468d.f38643c));
    }
}
