package K6;

import H6.C0672i;
import K6.C0759u0;
import N7.C1175g0;
import N7.T5;
import android.view.KeyEvent;
import android.widget.TextView;
import b9.C1992A;
import java.util.List;
import kotlin.KotlinVersion;

/* compiled from: DivInputBinder.kt */
/* renamed from: K6.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765x0 extends kotlin.jvm.internal.m implements p9.l<Object, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T5 f3708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ A7.d f3709h;
    public final /* synthetic */ O6.p i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0759u0 f3710j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0672i f3711k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0765x0(T5 t52, A7.d dVar, O6.p pVar, C0759u0 c0759u0, C0672i c0672i) {
        super(1);
        this.f3708g = t52;
        this.f3709h = dVar;
        this.i = pVar;
        this.f3710j = c0759u0;
        this.f3711k = c0672i;
    }

    @Override // p9.l
    public final C1992A invoke(Object obj) {
        int i;
        kotlin.jvm.internal.l.f(obj, "<anonymous parameter 0>");
        T5 t52 = this.f3708g;
        T5.b bVarA = t52.f6309l.a(this.f3709h);
        final O6.p pVar = this.i;
        int imeOptions = pVar.getImeOptions();
        final C0759u0 c0759u0 = this.f3710j;
        c0759u0.getClass();
        int i10 = C0759u0.a.f3649c[bVarA.ordinal()];
        if (i10 != 1) {
            i = 4;
            if (i10 != 2) {
                if (i10 == 3) {
                    i = 6;
                } else if (i10 == 4) {
                    i = 3;
                } else {
                    if (i10 != 5) {
                        throw new b9.j();
                    }
                    i = 2;
                }
            }
        } else {
            i = 0;
        }
        pVar.setImeOptions(imeOptions + i);
        final List<C1175g0> list = t52.f6308k;
        List<C1175g0> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            pVar.setOnEditorActionListener(null);
        } else {
            final C0672i c0672i = this.f3711k;
            pVar.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: K6.w0
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    C0759u0 this$0 = c0759u0;
                    kotlin.jvm.internal.l.f(this$0, "this$0");
                    C0672i bindingContext = c0672i;
                    kotlin.jvm.internal.l.f(bindingContext, "$bindingContext");
                    O6.p this_observeEnterTypeAndActions = pVar;
                    kotlin.jvm.internal.l.f(this_observeEnterTypeAndActions, "$this_observeEnterTypeAndActions");
                    if ((i11 & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                        return false;
                    }
                    this$0.f3644f.e(bindingContext, this_observeEnterTypeAndActions, list, "enter");
                    return false;
                }
            });
        }
        return C1992A.f18074a;
    }
}
