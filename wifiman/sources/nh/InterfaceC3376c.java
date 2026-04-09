package Nh;

import Zg.AbstractC3689v;
import Zg.d0;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Nh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3376c {

    /* renamed from: Nh.c$a */
    public static final class a implements InterfaceC3376c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16504a = new a();

        private a() {
        }

        @Override // Nh.InterfaceC3376c
        public Set a() {
            return d0.e();
        }

        @Override // Nh.InterfaceC3376c
        public Qh.n c(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return null;
        }

        @Override // Nh.InterfaceC3376c
        public Set d() {
            return d0.e();
        }

        @Override // Nh.InterfaceC3376c
        public Set e() {
            return d0.e();
        }

        @Override // Nh.InterfaceC3376c
        public Qh.w f(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return null;
        }

        @Override // Nh.InterfaceC3376c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List b(Zh.f name) {
            AbstractC6492s.i(name, "name");
            return AbstractC3689v.l();
        }
    }

    Set a();

    Collection b(Zh.f fVar);

    Qh.n c(Zh.f fVar);

    Set d();

    Set e();

    Qh.w f(Zh.f fVar);
}
