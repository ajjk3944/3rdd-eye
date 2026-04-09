package d;

import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3559v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5265c {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f45671a = AbstractC3561w.e(a.f45672a);

    /* renamed from: d.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45672a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Activity invoke(InterfaceC3559v interfaceC3559v) {
            Context baseContext = (Context) interfaceC3559v.m(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof Activity) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            return (Activity) baseContext;
        }
    }

    public static final H0 a() {
        return f45671a;
    }
}
