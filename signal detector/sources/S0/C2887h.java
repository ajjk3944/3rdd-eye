package s0;

import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0292n;
import androidx.lifecycle.InterfaceC0297t;
import androidx.lifecycle.InterfaceC0298u;
import c5.C0412i;
import java.util.Set;
import k0.AbstractComponentCallbacksC2617v;
import k0.S;
import p5.l;
import q0.C2794g;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2887h extends q5.j implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2885f f23419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC2617v f23420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2794g f23421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2887h(C2885f c2885f, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, C2794g c2794g) {
        super(1);
        this.f23419b = c2885f;
        this.f23420c = abstractComponentCallbacksC2617v;
        this.f23421d = c2794g;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        if (((InterfaceC0298u) obj) != null) {
            C2885f c2885f = this.f23419b;
            Set setM = c2885f.m();
            AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = this.f23420c;
            if (!setM.contains(abstractComponentCallbacksC2617v.M)) {
                S s5 = abstractComponentCallbacksC2617v.s();
                s5.b();
                C0300w c0300w = s5.f21572d;
                if (c0300w.f5259d.compareTo(EnumC0292n.f5245c) >= 0) {
                    c0300w.a((InterfaceC0297t) c2885f.f23416h.f(this.f23421d));
                }
            }
        }
        return C0412i.f5929a;
    }
}
