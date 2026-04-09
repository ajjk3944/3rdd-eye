package sa;

import U9.D;
import U9.F;
import U9.InterfaceC1608e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import sa.c;
import sa.f;

/* compiled from: Retrofit.java */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f46338a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1608e.a f46339b;

    /* renamed from: c, reason: collision with root package name */
    public final U9.t f46340c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f.a> f46341d;

    /* renamed from: e, reason: collision with root package name */
    public final List<c.a> f46342e;

    /* renamed from: f, reason: collision with root package name */
    public final Executor f46343f;

    public w(InterfaceC1608e.a aVar, U9.t tVar, List list, List list2, Executor executor) {
        this.f46339b = aVar;
        this.f46340c = tVar;
        this.f46341d = list;
        this.f46342e = list2;
        this.f46343f = executor;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<c.a> list = this.f46342e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            c<?, ?> cVarA = list.get(i).a(type, annotationArr);
            if (cVarA != null) {
                return cVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<T, D> b(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<f.a> list = this.f46341d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            f<T, D> fVarA = list.get(i).a(type);
            if (fVarA != null) {
                return fVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> f<F, T> c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<f.a> list = this.f46341d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            f<F, T> fVar = (f<F, T>) list.get(i).b(type, annotationArr, this);
            if (fVar != null) {
                return fVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<f.a> list = this.f46341d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
