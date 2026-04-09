package com.yandex.mobile.ads.impl;

import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface mm {

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public interface b {
        void a(mm mmVar, zm zmVar);

        void a(mm mmVar, zm zmVar, zm zmVar2);

        void a(zm zmVar);
    }

    File a(String str, long j4, long j10) throws a;

    void a(zm zmVar);

    void a(File file, long j4) throws a;

    void a(String str);

    void a(String str, yr yrVar) throws a;

    long b(String str, long j4, long j10);

    iz b(String str);

    void b(zm zmVar);

    zm c(String str, long j4, long j10) throws a;

    long d(String str, long j4, long j10);

    zm e(String str, long j4, long j10) throws InterruptedException, a;
}
