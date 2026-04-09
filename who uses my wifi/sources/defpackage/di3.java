package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class di3 extends IOException {
    public final int f;

    public di3() {
        this.f = 2008;
    }

    public di3(String str, int i) {
        super(str);
        this.f = i;
    }

    public di3(String str, Exception exc, int i) {
        super(str, exc);
        this.f = i;
    }

    public di3(int i, Exception exc) {
        super(exc);
        this.f = i;
    }
}
