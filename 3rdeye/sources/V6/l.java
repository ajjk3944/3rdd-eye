package V6;

import N7.Ka;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes.dex */
public final class l<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f13015c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A7.d f13016d;

    public l(k kVar, m mVar, A7.d dVar) {
        this.f13014b = kVar;
        this.f13015c = mVar;
        this.f13016d = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        m mVar = this.f13015c;
        this.f13014b.getClass();
        int i = mVar.f13025j;
        A7.d dVar = this.f13016d;
        return com.google.gson.internal.c.g(Integer.valueOf(k.c(i, (Ka.b) t10, dVar)), Integer.valueOf(k.c(i, (Ka.b) t11, dVar)));
    }
}
