package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;
import y9.C5819a;

/* renamed from: io.appmetrica.analytics.impl.aa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4480aa extends AbstractC4539ch {

    /* renamed from: b, reason: collision with root package name */
    public final C4506ba f40515b;

    public C4480aa(C4940s5 c4940s5, TimeProvider timeProvider) {
        super(c4940s5);
        this.f40515b = new C4506ba(c4940s5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4539ch
    public final boolean a(C4683i6 c4683i6) {
        long jOptLong;
        C4506ba c4506ba = this.f40515b;
        U9 u92 = c4506ba.f40583a.s().f40639C;
        Long lValueOf = u92 != null ? Long.valueOf(u92.f40231a) : null;
        if (lValueOf != null) {
            C4933ro c4933ro = c4506ba.f40583a.f41617t;
            synchronized (c4933ro) {
                jOptLong = c4933ro.f41594a.a().optLong("external_attribution_window_start", -1L);
            }
            if (jOptLong < 0) {
                jOptLong = c4506ba.f40584b.currentTimeMillis();
                c4506ba.f40583a.f41617t.a(jOptLong);
            }
            if (c4506ba.f40584b.currentTimeMillis() - jOptLong <= lValueOf.longValue()) {
                T9 t92 = (T9) MessageNano.mergeFrom(new T9(), c4683i6.getValueBytes());
                int i = t92.f40168a;
                String str = new String(t92.f40169b, C5819a.f48359b);
                String str2 = this.f40515b.f40583a.f41601c.j().get(Integer.valueOf(i));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f40632a.f41610m.info("Ignoring attribution of type `" + AbstractC4558da.a(i) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C4506ba c4506ba2 = this.f40515b;
                Map<Integer, String> mapJ = c4506ba2.f40583a.f41601c.j();
                mapJ.put(Integer.valueOf(i), str);
                c4506ba2.f40583a.f41601c.a(mapJ);
                this.f40632a.f41610m.info("Handling attribution of type `" + AbstractC4558da.a(i) + '`', new Object[0]);
                return false;
            }
        }
        this.f40632a.f41610m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
