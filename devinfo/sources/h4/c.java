package h4;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24860a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final g f24861b;

    /* renamed from: c, reason: collision with root package name */
    public v3.b f24862c;

    /* renamed from: d, reason: collision with root package name */
    public v3.b f24863d;

    /* renamed from: e, reason: collision with root package name */
    public int f24864e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24865f;

    public c(g gVar, ArrayList arrayList) {
        v3.b bVar = v3.b.f35792e;
        this.f24862c = bVar;
        this.f24863d = bVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f24875b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            v3.b bVar2 = gVar.f24876c;
            v3.b bVar3 = gVar.f24877d;
            this.f24862c = bVar2;
            this.f24863d = bVar3;
            c();
            b(gVar.f24878e);
        }
        this.f24861b = gVar;
    }

    public final void a(List list, boolean z3) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) list.get(i4);
            aVar.getClass();
            if (true == z3) {
                c cVar = aVar.f24849e;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
                aVar.f24849e = this;
                this.f24860a.add(aVar);
            }
        }
    }

    public final void b(int i4) {
        ArrayList arrayList = this.f24860a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.g) {
                ColorDrawable colorDrawable = aVar.f24850f;
                if (aVar.f24851h != i4) {
                    aVar.f24851h = i4;
                    colorDrawable.setColor(i4);
                    b bVar = aVar.f24846b;
                    bVar.f24856e = colorDrawable;
                    y4.a aVar2 = bVar.f24859i;
                    if (aVar2 != null) {
                        ((View) aVar2.f37324b).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i4;
        v3.b bVarC;
        ArrayList arrayList = this.f24860a;
        v3.b bVar = v3.b.f35792e;
        v3.b bVarA = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            v3.b bVar2 = this.f24862c;
            v3.b bVar3 = this.f24863d;
            aVar.f24847c = bVar2;
            b bVar4 = aVar.f24846b;
            aVar.f24848d = bVar3;
            if (!bVar4.f24854c.equals(bVarA)) {
                bVar4.f24854c = bVarA;
                y4.a aVar2 = bVar4.f24859i;
                if (aVar2 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.f37323a;
                    layoutParams.leftMargin = bVarA.f35793a;
                    layoutParams.topMargin = bVarA.f35794b;
                    layoutParams.rightMargin = bVarA.f35795c;
                    layoutParams.bottomMargin = bVarA.f35796d;
                    ((View) aVar2.f37324b).setLayoutParams(layoutParams);
                }
            }
            int i10 = aVar.f24845a;
            if (i10 == 1) {
                i4 = aVar.f24847c.f35793a;
                int i11 = aVar.f24848d.f35793a;
                if (bVar4.f24852a != i11) {
                    bVar4.f24852a = i11;
                    y4.a aVar3 = bVar4.f24859i;
                    if (aVar3 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aVar3.f37323a;
                        layoutParams2.width = i11;
                        ((View) aVar3.f37324b).setLayoutParams(layoutParams2);
                    }
                }
                bVarC = v3.b.c(i4, 0, 0, 0);
            } else if (i10 == 2) {
                i4 = aVar.f24847c.f35794b;
                int i12 = aVar.f24848d.f35794b;
                if (bVar4.f24853b != i12) {
                    bVar4.f24853b = i12;
                    y4.a aVar4 = bVar4.f24859i;
                    if (aVar4 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) aVar4.f37323a;
                        layoutParams3.height = i12;
                        ((View) aVar4.f37324b).setLayoutParams(layoutParams3);
                    }
                }
                bVarC = v3.b.c(0, i4, 0, 0);
            } else if (i10 == 4) {
                i4 = aVar.f24847c.f35795c;
                int i13 = aVar.f24848d.f35795c;
                if (bVar4.f24852a != i13) {
                    bVar4.f24852a = i13;
                    y4.a aVar5 = bVar4.f24859i;
                    if (aVar5 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) aVar5.f37323a;
                        layoutParams4.width = i13;
                        ((View) aVar5.f37324b).setLayoutParams(layoutParams4);
                    }
                }
                bVarC = v3.b.c(0, 0, i4, 0);
            } else if (i10 != 8) {
                bVarC = bVar;
                i4 = 0;
            } else {
                i4 = aVar.f24847c.f35796d;
                int i14 = aVar.f24848d.f35796d;
                if (bVar4.f24853b != i14) {
                    bVar4.f24853b = i14;
                    y4.a aVar6 = bVar4.f24859i;
                    if (aVar6 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) aVar6.f37323a;
                        layoutParams5.height = i14;
                        ((View) aVar6.f37324b).setLayoutParams(layoutParams5);
                    }
                }
                bVarC = v3.b.c(0, 0, 0, i4);
            }
            boolean z3 = i4 > 0;
            if (bVar4.f24855d != z3) {
                bVar4.f24855d = z3;
                y4.a aVar7 = bVar4.f24859i;
                if (aVar7 != null) {
                    ((View) aVar7.f37324b).setVisibility(z3 ? 0 : 4);
                }
            }
            float f10 = 0.0f;
            aVar.a(i4 > 0 ? 1.0f : 0.0f);
            if (i4 > 0) {
                f10 = 1.0f;
            }
            aVar.b(f10);
            bVarA = v3.b.a(bVarA, bVarC);
        }
    }
}
