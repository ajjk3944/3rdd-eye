package x;

import C.S;
import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import x.f;

/* compiled from: OutputConfigurationCompatBaseImpl.java */
/* loaded from: classes.dex */
public class k implements f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47615a;

    /* compiled from: OutputConfigurationCompatBaseImpl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<Surface> f47616a;

        /* renamed from: b, reason: collision with root package name */
        public final Size f47617b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47618c;

        /* renamed from: d, reason: collision with root package name */
        public final int f47619d;

        /* renamed from: e, reason: collision with root package name */
        public String f47620e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f47621f = false;

        /* renamed from: g, reason: collision with root package name */
        public long f47622g = 1;

        public a(Surface surface) throws NoSuchMethodException, SecurityException {
            Size size;
            int iIntValue;
            int iIntValue2;
            this.f47616a = Collections.singletonList(surface);
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                size = (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
                S.c("OutputConfigCompat", "Unable to retrieve surface size.", e4);
                size = null;
            }
            this.f47617b = size;
            try {
                iIntValue = ((Integer) Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class).invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                S.c("OutputConfigCompat", "Unable to retrieve surface format.", e10);
                iIntValue = 0;
            }
            this.f47618c = iIntValue;
            try {
                iIntValue2 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                S.c("OutputConfigCompat", "Unable to retrieve surface generation id.", e11);
                iIntValue2 = -1;
            }
            this.f47619d = iIntValue2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47617b.equals(aVar.f47617b) && this.f47618c == aVar.f47618c && this.f47619d == aVar.f47619d && this.f47621f == aVar.f47621f && this.f47622g == aVar.f47622g && Objects.equals(this.f47620e, aVar.f47620e)) {
                    List<Surface> list = this.f47616a;
                    int size = list.size();
                    List<Surface> list2 = aVar.f47616a;
                    int iMin = Math.min(size, list2.size());
                    for (int i = 0; i < iMin; i++) {
                        if (list.get(i) == list2.get(i)) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f47616a.hashCode() ^ 31;
            int i = this.f47619d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f47617b.hashCode() ^ ((i << 5) - i);
            int i10 = this.f47618c ^ ((iHashCode2 << 5) - iHashCode2);
            int i11 = (this.f47621f ? 1 : 0) ^ ((i10 << 5) - i10);
            int i12 = (i11 << 5) - i11;
            String str = this.f47620e;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i12;
            int i13 = (iHashCode3 << 5) - iHashCode3;
            long j4 = this.f47622g;
            return ((int) (j4 ^ (j4 >>> 32))) ^ i13;
        }
    }

    public k(Surface surface) {
        this.f47615a = new a(surface);
    }

    @Override // x.f.a
    public Surface a() {
        List<Surface> list = ((a) this.f47615a).f47616a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // x.f.a
    public void c(Surface surface) {
        if (a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!j()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // x.f.a
    public void d(long j4) {
        ((a) this.f47615a).f47622g = j4;
    }

    @Override // x.f.a
    public String e() {
        return ((a) this.f47615a).f47620e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        return Objects.equals(this.f47615a, ((k) obj).f47615a);
    }

    @Override // x.f.a
    public void f() {
        ((a) this.f47615a).f47621f = true;
    }

    @Override // x.f.a
    public void g(String str) {
        ((a) this.f47615a).f47620e = str;
    }

    public final int hashCode() {
        return this.f47615a.hashCode();
    }

    @Override // x.f.a
    public Object i() {
        return null;
    }

    public boolean j() {
        return ((a) this.f47615a).f47621f;
    }

    public k(Object obj) {
        this.f47615a = obj;
    }

    @Override // x.f.a
    public void b(long j4) {
    }

    @Override // x.f.a
    public void h(int i) {
    }
}
