package pb;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;
import nb.C6923f;
import ub.C8156c;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final a f57846a;

    /* renamed from: b, reason: collision with root package name */
    private int f57847b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f57848c;

    public interface a {
        void a(C6923f c6923f);
    }

    public m(a onMqttResponseListener) {
        AbstractC6492s.i(onMqttResponseListener, "onMqttResponseListener");
        this.f57846a = onMqttResponseListener;
        this.f57848c = new LinkedHashMap();
    }

    private final boolean a(C6923f c6923f) {
        if (c6923f.getSeq() == null) {
            return true;
        }
        Integer seq = c6923f.getSeq();
        return seq != null && seq.intValue() == this.f57847b + 1;
    }

    private final void b() {
        C6923f c6923f;
        do {
            c6923f = (C6923f) this.f57848c.remove(Integer.valueOf(this.f57847b + 1));
            if (c6923f != null) {
                c(c6923f);
            }
        } while (c6923f != null);
    }

    private final void c(C6923f c6923f) {
        Integer seq = c6923f.getSeq();
        if (seq != null) {
            this.f57847b = seq.intValue();
        }
        this.f57846a.a(c6923f);
    }

    private final void e(C6923f c6923f) {
        if (c6923f.getSeq() != null) {
            this.f57848c.put(c6923f.getSeq(), c6923f);
        }
    }

    public final void d(String topic, byte[] data) {
        AbstractC6492s.i(topic, "topic");
        AbstractC6492s.i(data, "data");
        String str = new String(data, C6510d.f52215b);
        Sj.a.f20830a.a("onMessageArrived topic: " + topic + " data: " + str, new Object[0]);
        try {
            C6923f c6923f = (C6923f) C8156c.f62925a.d().b(nb.g.f54534c, str);
            if (a(c6923f)) {
                c(c6923f);
                b();
            } else {
                e(c6923f);
            }
        } catch (Exception e10) {
            Sj.a.f20830a.p(e10, "Uh oh!", new Object[0]);
        }
    }
}
