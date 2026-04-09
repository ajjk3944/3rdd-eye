package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ov extends lv {

    public interface a {
        ov a();
    }

    long a(sv svVar) throws IOException;

    void a(q62 q62Var);

    void close() throws IOException;

    Map<String, List<String>> getResponseHeaders();

    Uri getUri();
}
