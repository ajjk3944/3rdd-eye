package Gh;

import Gh.E;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class w extends y implements Qh.n {

    /* renamed from: a, reason: collision with root package name */
    private final Field f7500a;

    public w(Field member) {
        AbstractC6492s.i(member, "member");
        this.f7500a = member;
    }

    @Override // Qh.n
    public boolean G() {
        return S().isEnumConstant();
    }

    @Override // Qh.n
    public boolean O() {
        return false;
    }

    @Override // Gh.y
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Field S() {
        return this.f7500a;
    }

    @Override // Qh.n
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public E getType() {
        E.a aVar = E.f7448a;
        Type genericType = S().getGenericType();
        AbstractC6492s.h(genericType, "getGenericType(...)");
        return aVar.a(genericType);
    }
}
