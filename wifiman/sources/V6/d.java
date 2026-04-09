package V6;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public abstract class d {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22989a;

        static {
            int[] iArr = new int[C2.a.values().length];
            try {
                iArr[C2.a.LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2.a.REMOTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2.a.DATA_DISK_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2.a.RESOURCE_DISK_CACHE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2.a.MEMORY_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f22989a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S6.a b(C2.a aVar) {
        int i10 = a.f22989a[aVar.ordinal()];
        if (i10 == 1) {
            return S6.a.DISK;
        }
        if (i10 == 2) {
            return S6.a.NETWORK;
        }
        if (i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                return S6.a.MEMORY;
            }
            throw new NoWhenBranchMatchedException();
        }
        return S6.a.DISK;
    }
}
