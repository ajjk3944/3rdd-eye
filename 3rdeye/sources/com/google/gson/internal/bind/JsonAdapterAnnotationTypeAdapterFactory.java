package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements o {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.b f23400b;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.b bVar) {
        this.f23400b = bVar;
    }

    public static TypeAdapter b(com.google.gson.internal.b bVar, Gson gson, D5.a aVar, A5.a aVar2) {
        TypeAdapter treeTypeAdapter;
        Object objN = bVar.a(new D5.a(aVar2.value())).n();
        if (objN instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objN;
        } else if (objN instanceof o) {
            treeTypeAdapter = ((o) objN).a(gson, aVar);
        } else {
            boolean z10 = objN instanceof l;
            if (!z10 && !(objN instanceof f)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objN.getClass().getName() + " as a @JsonAdapter for " + com.google.gson.internal.a.g(aVar.f1062b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(z10 ? (l) objN : null, objN instanceof f ? (f) objN : null, gson, aVar);
        }
        return (treeTypeAdapter == null || !aVar2.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }

    @Override // com.google.gson.o
    public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
        A5.a aVar2 = (A5.a) aVar.f1061a.getAnnotation(A5.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f23400b, gson, aVar, aVar2);
    }
}
