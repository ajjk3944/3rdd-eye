package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n63 implements ca4 {
    public final /* synthetic */ int a;
    public final t3 b;

    public /* synthetic */ n63(t3 t3Var, int i) {
        this.a = i;
        this.b = t3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Integer a() {
        Bundle bundle = ((fa2) this.b.h).f.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        i = 0;
                        break;
                    }
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        i = 1;
                        break;
                    }
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        i = 2;
                        break;
                    }
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        i = 3;
                        break;
                    }
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        i = 4;
                        break;
                    }
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        i = 5;
                        break;
                    }
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        i = 6;
                        break;
                    }
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        i = 7;
                        break;
                    }
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        i = 8;
                        break;
                    }
                    break;
            }
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                String str = ((fa2) this.b.h).i;
                i41.M(str);
                return str;
            case 1:
                return Integer.valueOf(this.b.g);
            case 2:
                return Boolean.valueOf(((fa2) this.b.h).q);
            case 3:
                return Boolean.valueOf(((fa2) this.b.h).p);
            case 4:
                String str2 = ((fa2) this.b.h).m;
                i41.M(str2);
                return str2;
            case 5:
                return a();
            default:
                return Integer.valueOf(((fa2) this.b.h).t);
        }
    }
}
