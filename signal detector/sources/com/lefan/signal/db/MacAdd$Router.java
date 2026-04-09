package com.lefan.signal.db;

import androidx.annotation.Keep;
import java.io.Serializable;
import q5.i;

@Keep
/* loaded from: classes.dex */
public final class MacAdd$Router implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    public String f18837m;

    /* renamed from: n, reason: collision with root package name */
    public String f18838n;

    public final String getM() {
        String str = this.f18837m;
        if (str != null) {
            return str;
        }
        i.g("m");
        throw null;
    }

    public final String getN() {
        String str = this.f18838n;
        if (str != null) {
            return str;
        }
        i.g("n");
        throw null;
    }

    public final void setM(String str) {
        i.e(str, "<set-?>");
        this.f18837m = str;
    }

    public final void setN(String str) {
        i.e(str, "<set-?>");
        this.f18838n = str;
    }
}
