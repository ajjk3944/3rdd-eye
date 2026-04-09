package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Field;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class b extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Field f23478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f23480f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Gson f23481g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ D5.a f23482h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, D5.a aVar, boolean z13) {
        super(str, z10, z11);
        this.f23478d = field;
        this.f23479e = z12;
        this.f23480f = typeAdapter;
        this.f23481g = gson;
        this.f23482h = aVar;
        this.i = z13;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void a(E5.a aVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
        Object objB = this.f23480f.b(aVar);
        if (objB == null && this.i) {
            return;
        }
        this.f23478d.set(obj, objB);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void b(c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
        Object obj2 = this.f23478d.get(obj);
        boolean z10 = this.f23479e;
        TypeAdapter typeAdapterRuntimeTypeWrapper = this.f23480f;
        if (!z10) {
            typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.f23481g, typeAdapterRuntimeTypeWrapper, this.f23482h.f1062b);
        }
        typeAdapterRuntimeTypeWrapper.c(cVar, obj2);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final boolean c(Object obj) throws IllegalAccessException, IOException {
        return this.f23417b && this.f23478d.get(obj) != obj;
    }
}
