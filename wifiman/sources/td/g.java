package td;

import Li.InterfaceC3220g;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.wifiman.model.speedtest.Speedtest;
import gg.i;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class g {

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f62098a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.a.b apply(Ka.c status) {
            AbstractC6492s.i(status, "status");
            return h.a(status);
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f62099a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable err) {
            AbstractC6492s.i(err, "err");
            return err instanceof UiSpeedtestLib.Error ? i.k0(f.a((UiSpeedtestLib.Error) err)) : i.k0(err);
        }
    }

    public static final i a(InterfaceC3220g interfaceC3220g) {
        AbstractC6492s.i(interfaceC3220g, "<this>");
        i iVarF1 = Qi.i.c(interfaceC3220g, null, 1, null).N0(a.f62098a).f1(b.f62099a);
        AbstractC6492s.h(iVarF1, "onErrorResumeNext(...)");
        return iVarF1;
    }
}
