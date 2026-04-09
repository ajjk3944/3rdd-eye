package tc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import gg.EnumC5911a;
import gg.i;
import gg.j;
import gg.k;
import kg.InterfaceC6468e;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d implements InterfaceC8077a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f62077a;

    public static final class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f62078a;

        a(j jVar) {
            this.f62078a = jVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC6492s.i(context, "context");
            AbstractC6492s.i(intent, "intent");
            this.f62078a.h(intent);
        }
    }

    public d(Context applicationContext) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        this.f62077a = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final d dVar, IntentFilter intentFilter, j emitter) {
        AbstractC6492s.i(emitter, "emitter");
        final a aVar = new a(emitter);
        dVar.f62077a.registerReceiver(aVar, intentFilter);
        emitter.d(new InterfaceC6468e() { // from class: tc.c
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                d.e(this.f62075a, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(d dVar, a aVar) {
        try {
            dVar.f62077a.unregisterReceiver(aVar);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // tc.InterfaceC8077a
    public i a(final IntentFilter filter) {
        AbstractC6492s.i(filter, "filter");
        i iVarY0 = i.N(new k() { // from class: tc.b
            @Override // gg.k
            public final void a(j jVar) {
                d.d(this.f62073a, filter, jVar);
            }
        }, EnumC5911a.LATEST).Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        return iVarY0;
    }
}
