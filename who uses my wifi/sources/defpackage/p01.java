package defpackage;

import java.nio.ByteBuffer;
import java.time.Duration;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p01 extends cr {
    public Integer g;

    static {
        Duration.ofMillis(6553600L);
    }

    @Override // defpackage.cr
    public final void a(cm cmVar) throws t91 {
        int iRemaining = ((ByteBuffer) cmVar.j).remaining();
        if (iRemaining == 0) {
            this.g = null;
        } else {
            if (iRemaining == 2) {
                this.g = Integer.valueOf(cmVar.f());
                return;
            }
            throw new t91("invalid length (" + iRemaining + ") of the data in the edns_tcp_keepalive option");
        }
    }

    @Override // defpackage.cr
    public final String b() {
        Integer num = this.g;
        return num != null ? String.valueOf(num) : "-";
    }

    @Override // defpackage.cr
    public final void c(t3 t3Var) {
        Integer num = this.g;
        if (num != null) {
            t3Var.m(num.intValue());
        }
    }
}
