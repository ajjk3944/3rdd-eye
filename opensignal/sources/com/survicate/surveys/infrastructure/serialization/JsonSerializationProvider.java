package com.survicate.surveys.infrastructure.serialization;

import br.l;
import cg.e;
import kotlin.Metadata;
import lu.a;
import lu.b;
import lu.c;
import lu.i;
import lu.o;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/JsonSerializationProvider;", "", "<init>", "()V", "Llu/c;", "provide", "()Llu/c;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonSerializationProvider {
    public static final JsonSerializationProvider INSTANCE = new JsonSerializationProvider();

    private JsonSerializationProvider() {
    }

    public static final c provide() {
        b bVar = c.f15933d;
        l.e(bVar, "from");
        i iVar = bVar.f15934a;
        String str = iVar.f15946d;
        String str2 = iVar.f15947e;
        a aVar = iVar.f15949g;
        boolean z10 = iVar.f15948f;
        e eVar = bVar.f15935b;
        if (!l.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        i iVar2 = new i(true, true, false, str, str2, z10, aVar);
        l.e(eVar, "module");
        return new o(iVar2, eVar);
    }
}
