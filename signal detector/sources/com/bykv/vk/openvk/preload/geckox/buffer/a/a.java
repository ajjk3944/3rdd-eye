package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f6697a;

    /* renamed from: b, reason: collision with root package name */
    public String f6698b;

    /* renamed from: c, reason: collision with root package name */
    public String f6699c;

    /* renamed from: d, reason: collision with root package name */
    public String f6700d;

    /* renamed from: e, reason: collision with root package name */
    public String f6701e;

    /* renamed from: f, reason: collision with root package name */
    public String f6702f;

    /* renamed from: g, reason: collision with root package name */
    public int f6703g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j6) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j6);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j6) throws IOException {
        if (j6 <= 0) {
            try {
                return new b(file);
            } catch (Exception e6) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e6.getMessage(), e6);
            }
        }
        try {
            return new c(j6, file);
        } catch (Exception e7) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e7.getMessage(), e7);
        }
    }
}
