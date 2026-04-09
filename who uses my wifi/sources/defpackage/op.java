package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class op extends cr {
    public final /* synthetic */ int g = 1;
    public Object h;

    public /* synthetic */ op(int i) {
        super(i);
    }

    @Override // defpackage.cr
    public final void a(cm cmVar) {
        switch (this.g) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                arrayList.clear();
                while (((ByteBuffer) cmVar.j).remaining() > 0) {
                    arrayList.add(Integer.valueOf(cmVar.i()));
                }
                break;
            default:
                this.h = cmVar.b();
                break;
        }
    }

    @Override // defpackage.cr
    public final String b() {
        mp mpVar;
        switch (this.g) {
            case 0:
                int i = this.f;
                if (i == 5) {
                    mpVar = new mp(0);
                } else if (i == 6) {
                    mpVar = new mp(1);
                } else {
                    if (i != 7) {
                        throw new IllegalStateException("Unknown option code");
                    }
                    mpVar = new mp(2);
                }
                return ex0.k(new StringBuilder("["), (String) ((ArrayList) this.h).stream().map(mpVar).collect(Collectors.joining(", ")), "]");
            default:
                return "<" + yb.s((byte[]) this.h) + ">";
        }
    }

    @Override // defpackage.cr
    public final void c(t3 t3Var) {
        switch (this.g) {
            case 0:
                ((ArrayList) this.h).forEach(new np(0, t3Var));
                break;
            default:
                t3Var.j((byte[]) this.h);
                break;
        }
    }

    public op(int[] iArr, int i) {
        super(i);
        if (i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException("Invalid option code, must be one of DAU, DHU, N3U");
        }
        this.h = new ArrayList();
        for (int i2 : iArr) {
            ((ArrayList) this.h).add(Integer.valueOf(i2));
        }
    }
}
