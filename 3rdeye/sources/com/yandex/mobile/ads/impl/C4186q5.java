package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bi1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4186q5 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f32070a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static volatile d70 f32071b;

    public static final void a(d70 player) {
        kotlin.jvm.internal.l.f(player, "player");
        f32071b = player;
        Iterator it = f32070a.iterator();
        while (it.hasNext()) {
            bi1.b listener = (bi1.b) it.next();
            kotlin.jvm.internal.l.f(listener, "listener");
            if (f32071b != null) {
                d70 d70Var = f32071b;
                if (d70Var != null) {
                    d70Var.a(listener);
                }
            } else {
                f32070a.add(listener);
            }
        }
    }
}
