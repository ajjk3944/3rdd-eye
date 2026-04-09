package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import w5.C8270c;

/* loaded from: classes3.dex */
public abstract class g {
    public f b() {
        if (g()) {
            return (f) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i e() {
        if (j()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public j f() {
        if (k()) {
            return (j) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean g() {
        return this instanceof f;
    }

    public boolean i() {
        return this instanceof h;
    }

    public boolean j() {
        return this instanceof i;
    }

    public boolean k() {
        return this instanceof j;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8270c c8270c = new C8270c(stringWriter);
            c8270c.r0(m.LENIENT);
            t5.n.a(this, c8270c);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
