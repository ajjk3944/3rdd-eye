package F4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f5976a = new i() { // from class: F4.h
        @Override // F4.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
