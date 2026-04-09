package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes3.dex */
public interface tj0 {

    public static final class a implements tj0 {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, Bitmap> f33644a;

        public a(Map<String, Bitmap> images) {
            kotlin.jvm.internal.l.f(images, "images");
            this.f33644a = images;
        }

        public final Map<String, Bitmap> a() {
            return this.f33644a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f33644a, ((a) obj).f33644a);
        }

        public final int hashCode() {
            return this.f33644a.hashCode();
        }

        public final String toString() {
            return "Success(images=" + this.f33644a + ")";
        }
    }
}
