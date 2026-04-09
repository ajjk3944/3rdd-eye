package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Field f38938a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f38938a = field;
    }

    public String toString() {
        return this.f38938a.toString();
    }
}
