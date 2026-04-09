package C3;

import android.app.Activity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.common.api.internal.InterfaceC4283l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import s3.AbstractC7901p;

/* renamed from: C3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2554n extends com.google.android.gms.common.api.d implements I3.k {
    public C2554n(Activity activity) {
        super(activity, C2547g.f2213l, (a.d) a.d.f34730a, d.a.f34741c);
    }

    @Override // I3.k
    public final Task b(final I3.f fVar) {
        return g(AbstractC4285n.a().b(new InterfaceC4283l() { // from class: C3.o
            @Override // com.google.android.gms.common.api.internal.InterfaceC4283l
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                s sVar = (s) obj;
                I3.f fVar2 = fVar;
                AbstractC7901p.b(fVar2 != null, "locationSettingsRequest can't be null");
                ((L) sVar.B()).S(fVar2, new BinderC2556p(taskCompletionSource), null);
            }
        }).e(2426).a());
    }
}
