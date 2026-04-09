package bc;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.common.Feature;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements n6.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2609a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2610b;

    /* renamed from: c, reason: collision with root package name */
    public int f2611c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2612d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2613e;

    public j(a5.t tVar, zb.g gVar, int i10) {
        this.f2609a = 1;
        this.f2613e = tVar;
        this.f2612d = gVar;
        this.f2610b = true;
        this.f2611c = i10;
    }

    @Override // c5.d
    public n6.a b() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f2613e;
        n6.e eVar = (n6.e) this.f2612d;
        a5.a.i(!this.f2610b);
        if (this.f2611c != 2 || arrayDeque.isEmpty()) {
            return null;
        }
        n6.a aVar = (n6.a) arrayDeque.removeFirst();
        if (eVar.g(4)) {
            aVar.b(4);
        } else {
            long j = eVar.f3308y;
            ByteBuffer byteBuffer = eVar.f3306r;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            aVar.q(eVar.f3308y, new dj.i(4, j, a5.a.p(z4.b.f26645f0, parcelableArrayList)), 0L);
        }
        eVar.p();
        this.f2611c = 0;
        return aVar;
    }

    @Override // c5.d
    public Object c() {
        a5.a.i(!this.f2610b);
        if (this.f2611c != 0) {
            return null;
        }
        this.f2611c = 1;
        return (n6.e) this.f2612d;
    }

    public j d() {
        cc.s.a("execute parameter required", ((i) this.f2612d) != null);
        return new j(this, (Feature[]) this.f2613e, this.f2610b, this.f2611c);
    }

    @Override // c5.d
    public void e(n6.e eVar) {
        a5.a.i(!this.f2610b);
        a5.a.i(this.f2611c == 1);
        a5.a.e(((n6.e) this.f2612d) == eVar);
        this.f2611c = 2;
    }

    public void f(int i10) {
        switch (this.f2609a) {
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2613e;
                WeakReference weakReference = sideSheetBehavior.f5696p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2611c = i10;
                    if (!this.f2610b) {
                        ((View) sideSheetBehavior.f5696p.get()).postOnAnimation((androidx.lifecycle.f0) this.f2612d);
                        this.f2610b = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2613e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2611c = i10;
                    if (!this.f2610b) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((b4.e) this.f2612d);
                        this.f2610b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // c5.d
    public void flush() {
        a5.a.i(!this.f2610b);
        ((n6.e) this.f2612d).p();
        this.f2611c = 0;
    }

    @Override // c5.d
    public void release() {
        this.f2610b = true;
    }

    public j(j jVar, Feature[] featureArr, boolean z10, int i10) {
        this.f2609a = 2;
        this.f2612d = jVar;
        this.f2613e = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f2610b = z11;
        this.f2611c = i10;
    }

    public j(int i10) {
        this.f2609a = i10;
        switch (i10) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f2612d = new n6.e(1);
                this.f2613e = new ArrayDeque();
                for (int i11 = 0; i11 < 2; i11++) {
                    ((ArrayDeque) this.f2613e).addFirst(new n6.a(this, 2));
                }
                this.f2611c = 0;
                break;
        }
    }

    public j(SideSheetBehavior sideSheetBehavior) {
        this.f2609a = 3;
        this.f2613e = sideSheetBehavior;
        this.f2612d = new androidx.lifecycle.f0(12, this);
    }

    public j(BottomSheetBehavior bottomSheetBehavior) {
        this.f2609a = 4;
        this.f2613e = bottomSheetBehavior;
        this.f2612d = new b4.e(22, this);
    }

    @Override // n6.c
    public void a(long j) {
    }
}
