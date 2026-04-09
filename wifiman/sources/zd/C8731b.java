package zd;

import com.ui.wifiman.model.speedtest.Speedtest;
import gg.i;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import zd.InterfaceC8730a;

/* renamed from: zd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8731b implements InterfaceC8730a {

    /* renamed from: zd.b$a */
    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f67250a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Speedtest.f apply(Long it) {
            AbstractC6492s.i(it, "it");
            return new Speedtest.f.a.c(Boolean.TRUE);
        }
    }

    @Override // zd.InterfaceC8730a
    public i a(InterfaceC8730a.b params) {
        AbstractC6492s.i(params, "params");
        i iVarZ1 = i.d2(params.a(), TimeUnit.MILLISECONDS).N0(a.f67250a).z1(new Speedtest.f.c(null));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }
}
