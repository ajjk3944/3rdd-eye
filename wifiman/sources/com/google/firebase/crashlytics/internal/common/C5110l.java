package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.firebase.crashlytics.internal.common.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C5110l {

    /* renamed from: d, reason: collision with root package name */
    private static final FilenameFilter f38792d = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return C5110l.d(file, str);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f38793e = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C5110l.e((File) obj, (File) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Q4.g f38794a;

    /* renamed from: b, reason: collision with root package name */
    private String f38795b = null;

    /* renamed from: c, reason: collision with root package name */
    private String f38796c = null;

    C5110l(Q4.g gVar) {
        this.f38794a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(Q4.g gVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e10) {
            I4.g.f().l("Failed to persist App Quality Sessions session id.", e10);
        }
    }

    static String g(Q4.g gVar, String str) {
        List listR = gVar.r(str, f38792d);
        if (!listR.isEmpty()) {
            return ((File) Collections.min(listR, f38793e)).getName().substring(4);
        }
        I4.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f38795b, str)) {
            return this.f38796c;
        }
        return g(this.f38794a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f38796c, str)) {
            f(this.f38794a, this.f38795b, str);
            this.f38796c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f38795b, str)) {
            f(this.f38794a, str, this.f38796c);
            this.f38795b = str;
        }
    }
}
