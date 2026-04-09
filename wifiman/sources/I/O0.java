package I;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC6835l f8060a = a.f8061a;

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8061a = new a();

        a() {
            super(1, J0.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J0 invoke(View view) {
            return new J0(view);
        }
    }

    public static final N0 b() {
        return new C2920a();
    }

    public static final InterfaceC6835l c() {
        return f8060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f.c().x(editorInfo);
        }
    }
}
