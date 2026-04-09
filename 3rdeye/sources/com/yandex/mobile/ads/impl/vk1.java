package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.m;
import java.util.Arrays;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class vk1 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC2000g<byte[]> f34611a = C2001h.b(a.f34612b);

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<byte[]> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f34612b = new a();

        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final byte[] invoke() {
            return Base64.decode("/9j/2wBDAAUDBAQEAwUEBAQFBQUGBwwIBwcHBw8LCwkMEQ8SEhEPERETFhwXExQaFRERGCEYGh0dHx8fExciJCIeJBweHx7/2wBDAQUFBQcGBw4ICA4eFBEUHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh7/xAAfAAABBQEBAQEBAQAAAAAAAAAAAQIDBAUGBwgJCgv/xAC1EAACAQMDAgQDBQUEBAAAAX0BAgMABBEFEiExQQYTUWEHInEUMoGRoQgjQrHBFVLR8CQzYnKCCQoWFxgZGiUmJygpKjQ1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4eLj5OXm5+jp6vHy8/T19vf4+fr/xAAfAQADAQEBAQEBAQEBAAAAAAAAAQIDBAUGBwgJCgv/xAC1EQACAQIEBAMEBwUEBAABAncAAQIDEQQFITEGEkFRB2FxEyIygQgUQpGhscEJIzNS8BVictEKFiQ04SXxFxgZGiYnKCkqNTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqCg4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2dri4+Tl5ufo6ery8/T19vf4+fo=", 0);
        }
    }

    public static Bitmap a(String previewBase64) {
        Object objA;
        kotlin.jvm.internal.l.f(previewBase64, "previewBase64");
        try {
            byte[] bArrB = b(previewBase64);
            objA = bArrB.length == 0 ? null : BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        return (Bitmap) (objA instanceof m.a ? null : objA);
    }

    private static byte[] b(String str) {
        byte[] bArrDecode = Base64.decode(y9.q.n0(str, "data:image/png;base64,"), 0);
        if (!y9.n.a0(str, "data:image/png;base64,", false)) {
            kotlin.jvm.internal.l.c(bArrDecode);
            if (bArrDecode.length == 0) {
                bArrDecode = new byte[0];
            } else {
                byte[] value = f34611a.getValue();
                kotlin.jvm.internal.l.e(value, "access$getPreviewHeader(...)");
                int length = value.length;
                int length2 = bArrDecode.length;
                byte[] bArrCopyOf = Arrays.copyOf(value, length + length2);
                System.arraycopy(bArrDecode, 0, bArrCopyOf, length, length2);
                kotlin.jvm.internal.l.c(bArrCopyOf);
                bArrDecode = bArrCopyOf;
            }
        }
        kotlin.jvm.internal.l.c(bArrDecode);
        return bArrDecode;
    }
}
