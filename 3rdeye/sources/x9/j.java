package x9;

import java.util.Iterator;
import k8.F;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public class j extends F {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    public static final class a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f47846a;

        public a(Iterator it) {
            this.f47846a = it;
        }

        @Override // x9.g
        public final Iterator<T> iterator() {
            return this.f47846a;
        }
    }

    public static <T> g<T> D(Iterator<? extends T> it) {
        kotlin.jvm.internal.l.f(it, "<this>");
        return new C5783a(new a(it));
    }
}
