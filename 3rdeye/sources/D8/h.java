package D8;

import A9.E;
import D8.i;
import D9.A;
import D9.C0640b;
import D9.InterfaceC0645g;
import N7.C1094a9;
import android.graphics.Color;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1775h;
import androidx.work.s;
import b9.C1992A;
import c9.C2099t;
import com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity;
import f9.C4351i;
import f9.InterfaceC4347e;
import q8.C5498a;

/* compiled from: PhSecretSettingsActivity.kt */
@h9.e(c = "com.zipoapps.premiumhelper.ui.settings.secret.PhSecretSettingsActivity$setupTotoBlock$3", f = "PhSecretSettingsActivity.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class h extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1102l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PhSecretSettingsActivity f1103m;

    /* compiled from: PhSecretSettingsActivity.kt */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PhSecretSettingsActivity f1104b;

        public a(PhSecretSettingsActivity phSecretSettingsActivity) {
            this.f1104b = phSecretSettingsActivity;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            i.b bVar = (i.b) obj;
            boolean zB = kotlin.jvm.internal.l.b(bVar, i.b.C0012b.f1108a);
            PhSecretSettingsActivity phSecretSettingsActivity = this.f1104b;
            C2099t c2099t = C2099t.f18581b;
            p pVar = phSecretSettingsActivity.f37164e;
            if (zB) {
                C5498a c5498a = phSecretSettingsActivity.f37163d;
                if (c5498a == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a.f45466j.setText("Getting ToTo config...");
                C5498a c5498a2 = phSecretSettingsActivity.f37163d;
                if (c5498a2 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a2.f45462e.setBackgroundColor(Color.parseColor("#80FFA500"));
                C5498a c5498a3 = phSecretSettingsActivity.f37163d;
                if (c5498a3 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a3.f45461d.setVisibility(4);
                C5498a c5498a4 = phSecretSettingsActivity.f37163d;
                if (c5498a4 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a4.f45458a.setVisibility(4);
                pVar.submitList(c2099t);
            } else if (bVar instanceof i.b.c) {
                C5498a c5498a5 = phSecretSettingsActivity.f37163d;
                if (c5498a5 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                i.b.c cVar = (i.b.c) bVar;
                i.a aVar = cVar.f1110b;
                StringBuilder sb = new StringBuilder("ToTo ");
                sb.append(aVar);
                sb.append(" config received in ");
                c5498a5.f45466j.setText(C1094a9.f(sb, cVar.f1111c, " millis"));
                C5498a c5498a6 = phSecretSettingsActivity.f37163d;
                if (c5498a6 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                boolean z10 = cVar.f1112d;
                c5498a6.f45461d.setText(z10 ? "Hide Config" : "View Config");
                C5498a c5498a7 = phSecretSettingsActivity.f37163d;
                if (c5498a7 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a7.f45462e.setBackgroundColor(Color.parseColor("#8000FF00"));
                C5498a c5498a8 = phSecretSettingsActivity.f37163d;
                if (c5498a8 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a8.f45461d.setVisibility(0);
                C5498a c5498a9 = phSecretSettingsActivity.f37163d;
                if (c5498a9 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a9.f45458a.setVisibility(0);
                if (z10) {
                    pVar.submitList(cVar.f1109a);
                } else {
                    pVar.submitList(c2099t);
                }
            } else {
                if (!(bVar instanceof i.b.a)) {
                    throw new b9.j();
                }
                C5498a c5498a10 = phSecretSettingsActivity.f37163d;
                if (c5498a10 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a10.f45466j.setText(s.d("Failed to get ToTo config. Error: ", ((i.b.a) bVar).f1107a.getMessage()));
                C5498a c5498a11 = phSecretSettingsActivity.f37163d;
                if (c5498a11 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a11.f45462e.setBackgroundColor(Color.parseColor("#80FF0000"));
                C5498a c5498a12 = phSecretSettingsActivity.f37163d;
                if (c5498a12 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a12.f45461d.setVisibility(8);
                C5498a c5498a13 = phSecretSettingsActivity.f37163d;
                if (c5498a13 == null) {
                    kotlin.jvm.internal.l.l("binding");
                    throw null;
                }
                c5498a13.f45458a.setVisibility(0);
                pVar.submitList(c2099t);
            }
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PhSecretSettingsActivity phSecretSettingsActivity, InterfaceC4347e<? super h> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1103m = phSecretSettingsActivity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new h(this.f1103m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((h) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f1102l;
        if (i == 0) {
            b9.n.b(obj);
            int i10 = PhSecretSettingsActivity.f37161f;
            PhSecretSettingsActivity phSecretSettingsActivity = this.f1103m;
            i iVar = (i) phSecretSettingsActivity.f37162c.getValue();
            AbstractC1781n lifecycle = phSecretSettingsActivity.getLifecycle();
            AbstractC1781n.b minActiveState = AbstractC1781n.b.STARTED;
            A a10 = iVar.f1106c;
            kotlin.jvm.internal.l.f(a10, "<this>");
            kotlin.jvm.internal.l.f(lifecycle, "lifecycle");
            kotlin.jvm.internal.l.f(minActiveState, "minActiveState");
            C0640b c0640b = new C0640b(new C1775h(lifecycle, minActiveState, a10, null), C4351i.f37871b, -2, C9.a.SUSPEND);
            a aVar2 = new a(phSecretSettingsActivity);
            this.f1102l = 1;
            if (c0640b.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
