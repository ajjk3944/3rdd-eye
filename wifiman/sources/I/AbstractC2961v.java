package I;

import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: I.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2961v {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC6835l f8400a = a.f8401a;

    /* renamed from: I.v$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8401a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2952q invoke(View view) {
            return Build.VERSION.SDK_INT >= 34 ? new C2959u(view) : new C2957t(view);
        }
    }

    public static final InterfaceC2952q a(View view) {
        return (InterfaceC2952q) f8400a.invoke(view);
    }
}
