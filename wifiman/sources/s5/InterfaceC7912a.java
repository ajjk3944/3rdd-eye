package s5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public @interface InterfaceC7912a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
