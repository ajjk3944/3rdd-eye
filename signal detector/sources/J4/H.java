package j4;

import o4.C2762a;
import o4.C2764c;

/* loaded from: classes.dex */
public class H extends g4.z {
    @Override // g4.z
    public final Object b(C2762a c2762a) {
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    }

    @Override // g4.z
    public final void c(C2764c c2764c, Object obj) {
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
    }
}
