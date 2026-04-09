package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.l;
import com.google.gson.o;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final l<T> f23423a;

    /* renamed from: b, reason: collision with root package name */
    public final f<T> f23424b;

    /* renamed from: c, reason: collision with root package name */
    public final Gson f23425c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.a<T> f23426d;

    /* renamed from: e, reason: collision with root package name */
    public TypeAdapter<T> f23427e;

    public static final class SingleTypeFactory implements o {
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            Class<? super T> cls = aVar.f1061a;
            throw null;
        }
    }

    public final class a {
    }

    public TreeTypeAdapter(l lVar, f fVar, Gson gson, D5.a aVar) {
        this.f23423a = lVar;
        this.f23424b = fVar;
        this.f23425c = gson;
        this.f23426d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final T b(E5.a r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            D5.a<T> r1 = r5.f23426d
            com.google.gson.f<T> r2 = r5.f23424b
            if (r2 != 0) goto L19
            com.google.gson.TypeAdapter<T> r2 = r5.f23427e
            if (r2 == 0) goto Lc
            goto L14
        Lc:
            com.google.gson.Gson r2 = r5.f23425c
            com.google.gson.TypeAdapter r2 = r2.e(r0, r1)
            r5.f23427e = r2
        L14:
            java.lang.Object r6 = r2.b(r6)
            return r6
        L19:
            r6.C0()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L2b E5.d -> L2d java.io.EOFException -> L43
            r3 = 0
            com.google.gson.TypeAdapter<com.google.gson.g> r4 = com.google.gson.internal.bind.TypeAdapters.f23431A     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L2b E5.d -> L2d java.io.EOFException -> L2f
            com.google.gson.internal.bind.TypeAdapters$29 r4 = (com.google.gson.internal.bind.TypeAdapters.AnonymousClass29) r4     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L2b E5.d -> L2d java.io.EOFException -> L2f
            r4.getClass()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L2b E5.d -> L2d java.io.EOFException -> L2f
            com.google.gson.g r6 = com.google.gson.internal.bind.TypeAdapters.AnonymousClass29.d(r6)     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L2b E5.d -> L2d java.io.EOFException -> L2f
            goto L49
        L29:
            r6 = move-exception
            goto L31
        L2b:
            r6 = move-exception
            goto L37
        L2d:
            r6 = move-exception
            goto L3d
        L2f:
            r6 = move-exception
            goto L45
        L31:
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r6)
            throw r0
        L37:
            com.google.gson.h r0 = new com.google.gson.h
            r0.<init>(r6)
            throw r0
        L3d:
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r6)
            throw r0
        L43:
            r6 = move-exception
            r3 = 1
        L45:
            if (r3 == 0) goto L58
            com.google.gson.i r6 = com.google.gson.i.f23371b
        L49:
            r6.getClass()
            boolean r6 = r6 instanceof com.google.gson.i
            if (r6 == 0) goto L51
            return r0
        L51:
            java.lang.reflect.Type r6 = r1.f1062b
            java.lang.Object r6 = r2.a()
            return r6
        L58:
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.b(E5.a):java.lang.Object");
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, T t10) throws IOException {
        D5.a<T> aVar = this.f23426d;
        l<T> lVar = this.f23423a;
        if (lVar == null) {
            TypeAdapter<T> typeAdapterE = this.f23427e;
            if (typeAdapterE == null) {
                typeAdapterE = this.f23425c.e(null, aVar);
                this.f23427e = typeAdapterE;
            }
            typeAdapterE.c(cVar, t10);
            return;
        }
        if (t10 == null) {
            cVar.B();
            return;
        }
        Type type = aVar.f1062b;
        TypeAdapters.f23431A.c(cVar, lVar.a());
    }
}
