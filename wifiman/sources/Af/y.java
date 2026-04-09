package Af;

import S8.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import android.content.Context;
import ch.AbstractC4260a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public abstract class y {

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(Integer.valueOf(y.b((j.b) obj)), Integer.valueOf(y.b((j.b) obj2)));
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f745a;

        b(List list) {
            this.f745a = list;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(431653452);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(431653452, i10, -1, "com.ui.wifiman.ui.wifi.component.stringNullable.<anonymous>.<anonymous> (WifiSecurityExtensions.kt:66)");
            }
            String string = context.getString(AbstractC6780c.f53565q5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(((Number) this.f745a.get(0)).intValue()), context.getString(((Number) this.f745a.get(1)).intValue())}, 2));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f746a;

        c(List list) {
            this.f746a = list;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1670800051);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1670800051, i10, -1, "com.ui.wifiman.ui.wifi.component.stringNullable.<anonymous>.<anonymous> (WifiSecurityExtensions.kt:72)");
            }
            String string = context.getString(AbstractC6780c.f53572r5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(((Number) this.f746a.get(0)).intValue()), context.getString(((Number) this.f746a.get(1)).intValue()), context.getString(((Number) this.f746a.get(2)).intValue())}, 3));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f747a;

        d(List list) {
            this.f747a = list;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(521713742);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(521713742, i10, -1, "com.ui.wifiman.ui.wifi.component.stringNullable.<anonymous>.<anonymous> (WifiSecurityExtensions.kt:79)");
            }
            String string = context.getString(AbstractC6780c.f53551o5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(((Number) this.f747a.get(0)).intValue()), context.getString(((Number) this.f747a.get(1)).intValue()), context.getString(((Number) this.f747a.get(2)).intValue()), context.getString(((Number) this.f747a.get(3)).intValue())}, 4));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class e implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f748a;

        e(List list) {
            this.f748a = list;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(2133257259);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2133257259, i10, -1, "com.ui.wifiman.ui.wifi.component.stringNullable.<anonymous>.<anonymous> (WifiSecurityExtensions.kt:87)");
            }
            String string = context.getString(AbstractC6780c.f53558p5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{context.getString(((Number) this.f748a.get(0)).intValue()), context.getString(((Number) this.f748a.get(1)).intValue()), context.getString(((Number) this.f748a.get(2)).intValue()), context.getString(((Number) this.f748a.get(3)).intValue())}, 4));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(j.b bVar) {
        if (bVar instanceof j.b.e) {
            return 1;
        }
        if (bVar instanceof j.b.f.C0731b) {
            return 10;
        }
        if (bVar instanceof j.b.f.a) {
            return 11;
        }
        if (bVar instanceof j.b.g.C0732b) {
            return 20;
        }
        if (bVar instanceof j.b.g.a) {
            return 21;
        }
        if (bVar instanceof j.b.h.d) {
            return 30;
        }
        if (bVar instanceof j.b.h.C0733b) {
            return 31;
        }
        if (bVar instanceof j.b.h.c) {
            return 32;
        }
        if (bVar instanceof j.b.h.a) {
            return 33;
        }
        if (bVar instanceof j.b.d) {
            return 1000;
        }
        if (bVar instanceof j.b.i) {
            return 1001;
        }
        if (bVar instanceof j.b.a) {
            return 1002;
        }
        if (bVar instanceof j.b.c) {
            return 1003;
        }
        if (bVar instanceof j.b.C0730b) {
            return 9999;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final s9.d c(S8.j jVar) {
        AbstractC6492s.i(jVar, "<this>");
        List listX0 = AbstractC3689v.X0(jVar.a(), new a());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listX0, 10));
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(d((j.b) it.next())));
        }
        return arrayList.isEmpty() ? new d.b(AbstractC6780c.f53627z4) : arrayList.size() == 1 ? new d.b(((Number) AbstractC3689v.q0(arrayList)).intValue()) : arrayList.size() == 2 ? new d.a(String.valueOf(arrayList.hashCode()), new b(arrayList)) : arrayList.size() == 3 ? new d.a(String.valueOf(arrayList.hashCode()), new c(arrayList)) : arrayList.size() == 4 ? new d.a(String.valueOf(arrayList.hashCode()), new d(arrayList)) : new d.a(String.valueOf(arrayList.hashCode()), new e(arrayList));
    }

    public static final int d(j.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        if (bVar instanceof j.b.C0730b) {
            return AbstractC6780c.f53586t5;
        }
        if (bVar instanceof j.b.e) {
            return AbstractC6780c.f53607w5;
        }
        if (bVar instanceof j.b.i) {
            return AbstractC6780c.f53310F5;
        }
        if (bVar instanceof j.b.a) {
            return AbstractC6780c.f53579s5;
        }
        if (bVar instanceof j.b.f.C0731b) {
            return AbstractC6780c.f53303E5;
        }
        if (bVar instanceof j.b.f.a) {
            return AbstractC6780c.f53296D5;
        }
        if (bVar instanceof j.b.g.C0732b) {
            return AbstractC6780c.f53621y5;
        }
        if (bVar instanceof j.b.g.a) {
            return AbstractC6780c.f53614x5;
        }
        if (bVar instanceof j.b.h.d) {
            return AbstractC6780c.f53289C5;
        }
        if (bVar instanceof j.b.h.C0733b) {
            return AbstractC6780c.f53275A5;
        }
        if (bVar instanceof j.b.h.c) {
            return AbstractC6780c.f53282B5;
        }
        if (bVar instanceof j.b.h.a) {
            return AbstractC6780c.f53628z5;
        }
        if (bVar instanceof j.b.d) {
            return AbstractC6780c.f53600v5;
        }
        if (bVar instanceof j.b.c) {
            return AbstractC6780c.f53593u5;
        }
        throw new NoWhenBranchMatchedException();
    }
}
