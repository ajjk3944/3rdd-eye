package J0;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f9713a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final v f9714b = new v("TestTagsAsResourceId", false, a.f9716a);

    /* renamed from: c, reason: collision with root package name */
    public static final int f9715c = 8;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9716a = new a();

        a() {
            super(2);
        }

        public final Boolean a(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private r() {
    }

    public final v a() {
        return f9714b;
    }
}
