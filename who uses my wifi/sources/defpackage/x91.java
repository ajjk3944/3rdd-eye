package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x91 implements jz0 {
    public final Context f;

    public /* synthetic */ x91(Context context) {
        this.f = context;
    }

    @Override // defpackage.jz0
    public kz0 a(rl rlVar) {
        String str = (String) rlVar.h;
        l92 l92Var = (l92) rlVar.i;
        if (l92Var == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        rl rlVar2 = new rl(context, str, l92Var, true);
        return new ox((Context) rlVar2.g, (String) rlVar2.h, (l92) rlVar2.i, rlVar2.f);
    }

    public n70 b(boolean z) {
        try {
            zy zyVar = new zy(z);
            l21 l21VarA = l21.a(this.f);
            return l21VarA != null ? l21VarA.b(zyVar) : pu1.B(new IllegalStateException());
        } catch (Exception e) {
            return pu1.B(e);
        }
    }
}
