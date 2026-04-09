package I;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.platform.AbstractC3934l;
import i0.AbstractC6056f;
import i0.AbstractC6059i;
import i0.C6052b;
import i0.InterfaceC6054d;
import i0.InterfaceC6057g;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import t.C8014a;

/* loaded from: classes.dex */
public abstract class f1 {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f8308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6824a interfaceC6824a) {
            super(1);
            this.f8308a = interfaceC6824a;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C6052b c6052b) {
            ClipDescription clipDescription = AbstractC6059i.b(c6052b).getClipDescription();
            Iterable<C8014a> iterable = (Iterable) this.f8308a.invoke();
            boolean z10 = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C8014a c8014a : iterable) {
                    if (AbstractC6492s.d(c8014a, C8014a.f61650b.a()) || clipDescription.hasMimeType(c8014a.c())) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public static final class b implements InterfaceC6057g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8309a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f8310b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8311c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8312d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8313e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8314f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8315g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f8316h;

        b(InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, InterfaceC6835l interfaceC6835l6, InterfaceC6835l interfaceC6835l7) {
            this.f8309a = interfaceC6835l;
            this.f8310b = interfaceC6839p;
            this.f8311c = interfaceC6835l2;
            this.f8312d = interfaceC6835l3;
            this.f8313e = interfaceC6835l4;
            this.f8314f = interfaceC6835l5;
            this.f8315g = interfaceC6835l6;
            this.f8316h = interfaceC6835l7;
        }

        @Override // i0.InterfaceC6057g
        public void G0(C6052b c6052b) {
            DragEvent dragEventB = AbstractC6059i.b(c6052b);
            InterfaceC6835l interfaceC6835l = this.f8313e;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(C6531g.d(AbstractC6532h.a(dragEventB.getX(), dragEventB.getY())));
                Yg.J j10 = Yg.J.f24997a;
            }
        }

        @Override // i0.InterfaceC6057g
        public void R1(C6052b c6052b) {
            InterfaceC6835l interfaceC6835l = this.f8311c;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(c6052b);
                Yg.J j10 = Yg.J.f24997a;
            }
        }

        @Override // i0.InterfaceC6057g
        public void T(C6052b c6052b) {
            InterfaceC6835l interfaceC6835l = this.f8312d;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(c6052b);
                Yg.J j10 = Yg.J.f24997a;
            }
        }

        @Override // i0.InterfaceC6057g
        public boolean c1(C6052b c6052b) {
            this.f8309a.invoke(c6052b);
            return ((Boolean) this.f8310b.invoke(AbstractC3934l.c(AbstractC6059i.b(c6052b).getClipData()), AbstractC3934l.d(AbstractC6059i.b(c6052b).getClipDescription()))).booleanValue();
        }

        @Override // i0.InterfaceC6057g
        public void y0(C6052b c6052b) {
            InterfaceC6835l interfaceC6835l = this.f8316h;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(c6052b);
                Yg.J j10 = Yg.J.f24997a;
            }
        }

        @Override // i0.InterfaceC6057g
        public void z1(C6052b c6052b) {
            InterfaceC6835l interfaceC6835l = this.f8314f;
            if (interfaceC6835l != null) {
                interfaceC6835l.invoke(c6052b);
                Yg.J j10 = Yg.J.f24997a;
            }
        }
    }

    public static final InterfaceC6054d a(InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, InterfaceC6835l interfaceC6835l3, InterfaceC6835l interfaceC6835l4, InterfaceC6835l interfaceC6835l5, InterfaceC6835l interfaceC6835l6, InterfaceC6835l interfaceC6835l7) {
        return AbstractC6056f.a(new a(interfaceC6824a), new b(interfaceC6835l, interfaceC6839p, interfaceC6835l2, interfaceC6835l3, interfaceC6835l4, interfaceC6835l6, interfaceC6835l5, interfaceC6835l7));
    }
}
