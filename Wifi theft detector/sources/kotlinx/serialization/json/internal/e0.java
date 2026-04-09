package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class e0 {
    public static final void b(kotlinx.serialization.descriptors.h kind) {
        kotlin.jvm.internal.p.e(kind, "kind");
        if (kind instanceof h.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof kotlinx.serialization.descriptors.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof kotlinx.serialization.descriptors.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(kotlinx.serialization.descriptors.f fVar, z9.a json) {
        kotlin.jvm.internal.p.e(fVar, "<this>");
        kotlin.jvm.internal.p.e(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).get_discriminator();
            }
        }
        return json.e().c();
    }

    public static final Object d(z9.e eVar, kotlinx.serialization.a deserializer) {
        kotlinx.serialization.json.c cVarL;
        kotlin.jvm.internal.p.e(eVar, "<this>");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        if (!(deserializer instanceof kotlinx.serialization.internal.b) || eVar.d().e().k()) {
            return deserializer.deserialize(eVar);
        }
        String strC = c(deserializer.getDescriptor(), eVar.d());
        kotlinx.serialization.json.b bVarG = eVar.g();
        kotlinx.serialization.descriptors.f descriptor = deserializer.getDescriptor();
        if (bVarG instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) bVarG;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) jsonObject.get(strC);
            String strC2 = (bVar == null || (cVarL = z9.g.l(bVar)) == null) ? null : cVarL.c();
            kotlinx.serialization.a aVarC = ((kotlinx.serialization.internal.b) deserializer).c(eVar, strC2);
            if (aVarC != null) {
                return l0.b(eVar.d(), strC, jsonObject, aVarC);
            }
            e(strC2, jsonObject);
            throw new KotlinNothingValueException();
        }
        throw s.e(-1, "Expected " + kotlin.jvm.internal.t.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + kotlin.jvm.internal.t.b(bVarG.getClass()));
    }

    public static final Void e(String str, JsonObject jsonTree) {
        String str2;
        kotlin.jvm.internal.p.e(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw s.f(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    public static final void f(kotlinx.serialization.e eVar, kotlinx.serialization.e eVar2, String str) {
    }
}
