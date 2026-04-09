package f2;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46918c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f46919d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final Context f46920a;

    /* renamed from: b, reason: collision with root package name */
    private final C5499E f46921b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public x(Context context, C5499E navigatorProvider) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(navigatorProvider, "navigatorProvider");
        this.f46920a = context;
        this.f46921b = navigatorProvider;
    }
}
