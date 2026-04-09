package org.kodein.type;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
final class n extends p {

    /* renamed from: a, reason: collision with root package name */
    public static final n f56964a = new n();

    private n() {
    }

    @Override // org.kodein.type.p
    public String a(Class cls, boolean z10) {
        AbstractC6492s.i(cls, "cls");
        if (!cls.isArray()) {
            String strD = b.d(cls);
            if (strD != null) {
                return strD;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.i(cls));
            sb2.append(!z10 ? b.e(cls) : "");
            return sb2.toString();
        }
        if (!cls.getComponentType().isPrimitive()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Array<");
            Class<?> componentType = cls.getComponentType();
            AbstractC6492s.h(componentType, "cls.componentType");
            sb3.append(p.c(this, componentType, false, 2, null));
            sb3.append('>');
            return sb3.toString();
        }
        Class<?> componentType2 = cls.getComponentType();
        if (AbstractC6492s.d(componentType2, Boolean.TYPE)) {
            return "BooleanArray";
        }
        if (AbstractC6492s.d(componentType2, Byte.TYPE)) {
            return "ByteArray";
        }
        if (AbstractC6492s.d(componentType2, Character.TYPE)) {
            return "CharArray";
        }
        if (AbstractC6492s.d(componentType2, Short.TYPE)) {
            return "ShortArray";
        }
        if (AbstractC6492s.d(componentType2, Integer.TYPE)) {
            return "IntArray";
        }
        if (AbstractC6492s.d(componentType2, Long.TYPE)) {
            return "LongArray";
        }
        if (AbstractC6492s.d(componentType2, Float.TYPE)) {
            return "FloatArray";
        }
        if (AbstractC6492s.d(componentType2, Double.TYPE)) {
            return "DoubleArray";
        }
        throw new IllegalStateException(("Unknown primitive type " + this).toString());
    }

    @Override // org.kodein.type.p
    public String d() {
        return "Array";
    }
}
