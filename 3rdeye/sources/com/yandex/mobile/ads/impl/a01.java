package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface a01 {

    /* renamed from: a, reason: collision with root package name */
    public static final a01 f24355a = new a();

    public class a implements a01 {
        @Override // com.yandex.mobile.ads.impl.a01
        public final boolean a(dc0 dc0Var) {
            String str = dc0Var.f26083m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.yandex.mobile.ads.impl.a01
        public final hy1 b(dc0 dc0Var) {
            String str = dc0Var.f26083m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new je();
                    case "application/x-icy":
                        return new ai0();
                    case "application/id3":
                        return new di0(null);
                    case "application/x-emsg":
                        return new u50();
                    case "application/x-scte35":
                        return new g12();
                }
            }
            throw new IllegalArgumentException(androidx.work.s.d("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }

    boolean a(dc0 dc0Var);

    hy1 b(dc0 dc0Var);
}
