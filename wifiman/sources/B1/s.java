package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface s {

    /* renamed from: a, reason: collision with root package name */
    public static final b f32772a = b.f32773a;

    public interface a extends s {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f32773a = new b();

        private b() {
        }

        public final a a() {
            return new t("spread");
        }

        public final s b() {
            return new t("wrap");
        }

        public final s c(float f10) {
            return new t(f10, (DefaultConstructorMarker) null);
        }
    }
}
