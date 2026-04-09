package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public interface e32 {

    /* renamed from: a, reason: collision with root package name */
    public static final e32 f26657a = new a();

    public class a implements e32 {
        public final c32 a(dc0 dc0Var) {
            String str = dc0Var.f26083m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new p40(dc0Var.f26085o);
                    case "application/pgs":
                        return new qg1();
                    case "application/x-mp4-vtt":
                        return new s11();
                    case "text/vtt":
                        return new qj2();
                    case "application/x-quicktime-tx3g":
                        return new k72(dc0Var.f26085o);
                    case "text/x-ssa":
                        return new t12(dc0Var.f26085o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new tn(str, dc0Var.f26070E);
                    case "text/x-exoplayer-cues":
                        return new e70();
                    case "application/cea-708":
                        return new un(dc0Var.f26070E, dc0Var.f26085o);
                    case "application/x-subrip":
                        return new z22();
                    case "application/ttml+xml":
                        return new e72();
                }
            }
            throw new IllegalArgumentException(androidx.work.s.d("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(dc0 dc0Var) {
            String str = dc0Var.f26083m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }
}
