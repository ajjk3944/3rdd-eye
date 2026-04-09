package ti;

import android.util.SparseArray;
import androidx.viewpager.widget.ViewPager;
import b5.c1;
import b5.u0;
import b5.z;
import com.liuzh.deviceinfo.MainActivity;
import com.liuzho.lib.appinfo.AppInfoActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import sh.c0;
import sh.e0;
import sh.m0;
import ui.b0;
import ui.f0;
import ui.h0;
import ui.j0;
import ui.n0;
import ui.o;
import ui.q;
import ui.s;
import ui.u;
import ui.w;
import ui.x;
import ui.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends n6.a {

    /* renamed from: c, reason: collision with root package name */
    public final u0 f34654c;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f34658h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i.g f34659i;

    /* renamed from: e, reason: collision with root package name */
    public b5.a f34656e = null;

    /* renamed from: f, reason: collision with root package name */
    public z f34657f = null;

    /* renamed from: d, reason: collision with root package name */
    public final int f34655d = 1;

    public a(i.g gVar, u0 u0Var, int i4) {
        this.f34658h = i4;
        this.f34659i = gVar;
        this.f34654c = u0Var;
    }

    @Override // n6.a
    public final void a(Object obj) {
        z zVar = (z) obj;
        if (this.f34656e == null) {
            u0 u0Var = this.f34654c;
            u0Var.getClass();
            this.f34656e = new b5.a(u0Var);
        }
        b5.a aVar = this.f34656e;
        aVar.getClass();
        u0 u0Var2 = zVar.f1947u;
        if (u0Var2 != null && u0Var2 != aVar.f1724s) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + zVar.toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new c1(6, zVar));
        if (zVar.equals(this.f34657f)) {
            this.f34657f = null;
        }
    }

    @Override // n6.a
    public final void b() {
        b5.a aVar = this.f34656e;
        if (aVar != null) {
            if (!this.g) {
                try {
                    this.g = true;
                    if (aVar.f1715i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    aVar.f1724s.A(aVar, true);
                } finally {
                    this.g = false;
                }
            }
            this.f34656e = null;
        }
    }

    @Override // n6.a
    public final int c() {
        switch (this.f34658h) {
            case 0:
                o.e eVar = ((AppInfoActivity) this.f34659i).A;
                if (eVar == null) {
                    return 0;
                }
                return ((SparseArray) eVar.f30195b).size();
            default:
                return ((MainActivity) this.f34659i).E.size();
        }
    }

    @Override // n6.a
    public int d(Object obj) {
        switch (this.f34658h) {
            case 1:
                nk.k.e(obj, "item");
                ArrayList arrayList = ((MainActivity) this.f34659i).E;
                Object obj2 = e0.f33673b.get(obj.getClass());
                nk.k.b(obj2);
                int iIndexOf = arrayList.indexOf(obj2);
                if (iIndexOf == -1) {
                    return -2;
                }
                return iIndexOf;
            default:
                return super.d(obj);
        }
    }

    @Override // n6.a
    public final String e(int i4) {
        switch (this.f34658h) {
            case 0:
                return ((b0) ((SparseArray) ((AppInfoActivity) this.f34659i).A.f30195b).valueAt(i4)).getName();
            default:
                MainActivity mainActivity = (MainActivity) this.f34659i;
                String string = mainActivity.getString(((c0) mainActivity.E.get(i4)).f33653b);
                nk.k.d(string, "getString(...)");
                return string;
        }
    }

    @Override // n6.a
    public z f(ViewPager viewPager, int i4) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        f0 f0Var;
        ig.e eVar;
        ig.e eVar2;
        ig.e eVar3;
        ig.e eVar4;
        ig.e eVar5;
        ig.e eVar6;
        m0 m0Var;
        switch (this.f34658h) {
            case 0:
                z zVarJ = j(viewPager, i4);
                o.e eVar7 = ((AppInfoActivity) this.f34659i).A;
                if (eVar7 != null) {
                    if (zVarJ instanceof x) {
                        y yVar = (y) eVar7.o(0);
                        if (yVar != null) {
                            x xVar = (x) zVarJ;
                            xVar.Z = yVar;
                            xVar.c0();
                        }
                    } else if (zVarJ instanceof ui.j) {
                        ui.k kVar = (ui.k) eVar7.o(1);
                        if (kVar != null) {
                            ui.j jVar = (ui.j) zVarJ;
                            jVar.Z = kVar;
                            jVar.c0();
                        }
                    } else if (zVarJ instanceof ui.b) {
                        ui.d dVar = (ui.d) eVar7.o(2);
                        if (dVar != null) {
                            ui.b bVar = (ui.b) zVarJ;
                            bVar.Z = dVar;
                            if (bVar.f35347a0 != null && (m0Var = bVar.f35349c0) != null) {
                                m0Var.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof ui.m0) {
                        n0 n0Var = (n0) eVar7.o(3);
                        if (n0Var != null) {
                            ui.m0 m0Var2 = (ui.m0) zVarJ;
                            m0Var2.Z = n0Var;
                            if (m0Var2.f35436a0 != null && (eVar6 = m0Var2.f35438c0) != null) {
                                eVar6.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof ui.m) {
                        o oVar = (o) eVar7.o(4);
                        if (oVar != null) {
                            ui.m mVar = (ui.m) zVarJ;
                            mVar.Z = oVar;
                            if (mVar.f35433a0 != null && (eVar5 = mVar.f35435c0) != null) {
                                eVar5.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof ui.g) {
                        ui.i iVar = (ui.i) eVar7.o(5);
                        if (iVar != null) {
                            ui.g gVar = (ui.g) zVarJ;
                            gVar.Z = iVar;
                            if (gVar.f35372a0 != null && (eVar4 = gVar.f35374c0) != null) {
                                eVar4.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof u) {
                        w wVar = (w) eVar7.o(7);
                        if (wVar != null) {
                            u uVar = (u) zVarJ;
                            uVar.Z = wVar;
                            if (uVar.f35471a0 != null && (eVar3 = uVar.f35473c0) != null) {
                                eVar3.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof q) {
                        s sVar = (s) eVar7.o(8);
                        if (sVar != null) {
                            q qVar = (q) zVarJ;
                            qVar.Z = sVar;
                            if (qVar.f35456a0 != null && (eVar2 = qVar.f35458c0) != null) {
                                eVar2.notifyDataSetChanged();
                            }
                        }
                    } else if (zVarJ instanceof h0) {
                        j0 j0Var = (j0) eVar7.o(9);
                        if (j0Var != null) {
                            h0 h0Var = (h0) zVarJ;
                            h0Var.Z = j0Var;
                            if (h0Var.f35385a0 != null && (eVar = h0Var.f35387c0) != null) {
                                eVar.notifyDataSetChanged();
                            }
                        }
                    } else if ((zVarJ instanceof ui.e) && (f0Var = (f0) eVar7.o(6)) != null) {
                        ((ui.e) zVarJ).d0(f0Var);
                    }
                }
                return zVarJ;
            default:
                return j(viewPager, i4);
        }
    }

    @Override // n6.a
    public void g(ViewPager viewPager, int i4, Object obj) {
        switch (this.f34658h) {
            case 1:
                nk.k.e(obj, "item");
                k(viewPager, i4, obj);
                ((MainActivity) this.f34659i).F = obj instanceof sh.a ? (sh.a) obj : null;
                break;
            default:
                k(viewPager, i4, obj);
                break;
        }
    }

    @Override // n6.a
    public final void i(ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public final z j(ViewPager viewPager, int i4) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        long jHashCode;
        z zVarA;
        b5.a aVar = this.f34656e;
        u0 u0Var = this.f34654c;
        if (aVar == null) {
            u0Var.getClass();
            this.f34656e = new b5.a(u0Var);
        }
        switch (this.f34658h) {
            case 1:
                jHashCode = ((c0) ((MainActivity) this.f34659i).E.get(i4)).hashCode();
                break;
            default:
                jHashCode = i4;
                break;
        }
        z zVarD = u0Var.D("android:switcher:" + viewPager.getId() + ":" + jHashCode);
        if (zVarD != null) {
            b5.a aVar2 = this.f34656e;
            aVar2.getClass();
            aVar2.b(new c1(7, zVarD));
        } else {
            switch (this.f34658h) {
                case 0:
                    zVarA = ((b0) ((SparseArray) ((AppInfoActivity) this.f34659i).A.f30195b).valueAt(i4)).a();
                    break;
                default:
                    Object objNewInstance = ((c0) ((MainActivity) this.f34659i).E.get(i4)).f33652a.getDeclaredConstructor(null).newInstance(null);
                    nk.k.d(objNewInstance, "newInstance(...)");
                    zVarA = (z) objNewInstance;
                    break;
            }
            zVarD = zVarA;
            this.f34656e.h(viewPager.getId(), zVarD, "android:switcher:" + viewPager.getId() + ":" + jHashCode, 1);
        }
        if (zVarD != this.f34657f) {
            if (zVarD.E) {
                zVarD.E = false;
            }
            if (this.f34655d == 1) {
                this.f34656e.l(zVarD, androidx.lifecycle.s.f1183d);
                return zVarD;
            }
            zVarD.a0(false);
        }
        return zVarD;
    }

    public final void k(ViewPager viewPager, int i4, Object obj) {
        z zVar = (z) obj;
        z zVar2 = this.f34657f;
        if (zVar != zVar2) {
            u0 u0Var = this.f34654c;
            int i10 = this.f34655d;
            if (zVar2 != null) {
                if (zVar2.E) {
                    zVar2.E = false;
                }
                if (i10 == 1) {
                    if (this.f34656e == null) {
                        u0Var.getClass();
                        this.f34656e = new b5.a(u0Var);
                    }
                    this.f34656e.l(this.f34657f, androidx.lifecycle.s.f1183d);
                } else {
                    zVar2.a0(false);
                }
            }
            if (!zVar.E) {
                zVar.E = true;
            }
            if (i10 == 1) {
                if (this.f34656e == null) {
                    u0Var.getClass();
                    this.f34656e = new b5.a(u0Var);
                }
                this.f34656e.l(zVar, androidx.lifecycle.s.f1184e);
            } else {
                zVar.a0(true);
            }
            this.f34657f = zVar;
        }
    }
}
