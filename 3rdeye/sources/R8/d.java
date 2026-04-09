package r8;

import kotlin.jvm.internal.l;
import w9.i;

/* compiled from: TimberLoggerProperty.kt */
/* loaded from: classes3.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f45831a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f45832b;

    public d(String str) {
        this.f45831a = str;
    }

    public final c a(T thisRef, i<?> property) {
        l.f(thisRef, "thisRef");
        l.f(property, "property");
        c cVar = this.f45832b;
        if (cVar != null) {
            return cVar;
        }
        this.f45832b = new c(thisRef, this.f45831a);
        c cVar2 = this.f45832b;
        l.c(cVar2);
        return cVar2;
    }
}
