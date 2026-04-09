package kotlin.sequences;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes4.dex */
public abstract class j {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l9.p f22104a;

        public a(l9.p pVar) {
            this.f22104a = pVar;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return j.a(this.f22104a);
        }
    }

    public static final Iterator a(l9.p block) {
        kotlin.jvm.internal.p.e(block, "block");
        h hVar = new h();
        hVar.j(IntrinsicsKt__IntrinsicsJvmKt.a(block, hVar, hVar));
        return hVar;
    }

    public static g b(l9.p block) {
        kotlin.jvm.internal.p.e(block, "block");
        return new a(block);
    }
}
