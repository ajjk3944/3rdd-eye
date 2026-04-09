package androidx.compose.ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3928j implements InterfaceC3925i {

    /* renamed from: b, reason: collision with root package name */
    private static final a f29400b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f29401c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityManager f29402a;

    /* renamed from: androidx.compose.ui.platform.j$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3928j(Context context) {
        Object systemService = context.getSystemService("accessibility");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f29402a = (AccessibilityManager) systemService;
    }
}
