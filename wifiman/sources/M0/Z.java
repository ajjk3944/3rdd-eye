package M0;

import android.text.StaticLayout;

/* loaded from: classes.dex */
final class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f12359a = new Z();

    private Z() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static final void b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(Y.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
