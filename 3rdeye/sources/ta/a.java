package ta;

import U9.F;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import sa.f;
import sa.w;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes3.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f46469a;

    public a(Gson gson) {
        this.f46469a = gson;
    }

    @Override // sa.f.a
    public final f a(Type type) {
        D5.a aVar = new D5.a(type);
        Gson gson = this.f46469a;
        return new b(gson, gson.d(aVar));
    }

    @Override // sa.f.a
    public final f<F, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        D5.a aVar = new D5.a(type);
        Gson gson = this.f46469a;
        return new c(gson, gson.d(aVar));
    }
}
