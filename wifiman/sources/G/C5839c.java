package g;

import android.content.Context;
import android.content.Intent;
import f.C5484a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5839c extends AbstractC5837a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f47364a = new a(null);

    /* renamed from: g.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // g.AbstractC5837a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(input, "input");
        return input;
    }

    @Override // g.AbstractC5837a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5484a c(int i10, Intent intent) {
        return new C5484a(i10, intent);
    }
}
