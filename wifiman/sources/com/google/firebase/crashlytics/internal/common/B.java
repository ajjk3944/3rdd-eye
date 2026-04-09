package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private final String f38704a;

    /* renamed from: b, reason: collision with root package name */
    private final Q4.g f38705b;

    public B(String str, Q4.g gVar) {
        this.f38704a = str;
        this.f38705b = gVar;
    }

    private File b() {
        return this.f38705b.g(this.f38704a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            I4.g.f().e("Error creating marker: " + this.f38704a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
