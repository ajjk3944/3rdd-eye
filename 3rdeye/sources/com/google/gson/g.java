package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* loaded from: classes2.dex */
public abstract class g {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            E5.c cVar = new E5.c(stringWriter);
            cVar.f1443f = true;
            TypeAdapters.f23431A.c(cVar, this);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
