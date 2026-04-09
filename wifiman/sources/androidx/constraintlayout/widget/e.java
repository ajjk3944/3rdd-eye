package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.ImageFormat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l1.C6539a;
import m1.AbstractC6742a;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.snmp4j.smi.SMIConstants;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f30176d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f30177e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap f30178a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f30179b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f30180c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f30181a;

        /* renamed from: b, reason: collision with root package name */
        public final d f30182b = new d();

        /* renamed from: c, reason: collision with root package name */
        public final c f30183c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f30184d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final C1093e f30185e = new C1093e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap f30186f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f30181a = i10;
            b bVar2 = this.f30184d;
            bVar2.f30228h = bVar.f30098d;
            bVar2.f30230i = bVar.f30100e;
            bVar2.f30232j = bVar.f30102f;
            bVar2.f30234k = bVar.f30104g;
            bVar2.f30235l = bVar.f30106h;
            bVar2.f30236m = bVar.f30108i;
            bVar2.f30237n = bVar.f30110j;
            bVar2.f30238o = bVar.f30112k;
            bVar2.f30239p = bVar.f30114l;
            bVar2.f30240q = bVar.f30122p;
            bVar2.f30241r = bVar.f30123q;
            bVar2.f30242s = bVar.f30124r;
            bVar2.f30243t = bVar.f30125s;
            bVar2.f30244u = bVar.f30132z;
            bVar2.f30245v = bVar.f30066A;
            bVar2.f30246w = bVar.f30067B;
            bVar2.f30247x = bVar.f30116m;
            bVar2.f30248y = bVar.f30118n;
            bVar2.f30249z = bVar.f30120o;
            bVar2.f30188A = bVar.f30082Q;
            bVar2.f30189B = bVar.f30083R;
            bVar2.f30190C = bVar.f30084S;
            bVar2.f30226g = bVar.f30096c;
            bVar2.f30222e = bVar.f30092a;
            bVar2.f30224f = bVar.f30094b;
            bVar2.f30218c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f30220d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f30191D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f30192E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f30193F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f30194G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f30203P = bVar.f30071F;
            bVar2.f30204Q = bVar.f30070E;
            bVar2.f30206S = bVar.f30073H;
            bVar2.f30205R = bVar.f30072G;
            bVar2.f30229h0 = bVar.f30085T;
            bVar2.f30231i0 = bVar.f30086U;
            bVar2.f30207T = bVar.f30074I;
            bVar2.f30208U = bVar.f30075J;
            bVar2.f30209V = bVar.f30078M;
            bVar2.f30210W = bVar.f30079N;
            bVar2.f30211X = bVar.f30076K;
            bVar2.f30212Y = bVar.f30077L;
            bVar2.f30213Z = bVar.f30080O;
            bVar2.f30215a0 = bVar.f30081P;
            bVar2.f30227g0 = bVar.f30087V;
            bVar2.f30198K = bVar.f30127u;
            bVar2.f30200M = bVar.f30129w;
            bVar2.f30197J = bVar.f30126t;
            bVar2.f30199L = bVar.f30128v;
            bVar2.f30202O = bVar.f30130x;
            bVar2.f30201N = bVar.f30131y;
            bVar2.f30195H = bVar.getMarginEnd();
            this.f30184d.f30196I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f30184d;
            bVar.f30098d = bVar2.f30228h;
            bVar.f30100e = bVar2.f30230i;
            bVar.f30102f = bVar2.f30232j;
            bVar.f30104g = bVar2.f30234k;
            bVar.f30106h = bVar2.f30235l;
            bVar.f30108i = bVar2.f30236m;
            bVar.f30110j = bVar2.f30237n;
            bVar.f30112k = bVar2.f30238o;
            bVar.f30114l = bVar2.f30239p;
            bVar.f30122p = bVar2.f30240q;
            bVar.f30123q = bVar2.f30241r;
            bVar.f30124r = bVar2.f30242s;
            bVar.f30125s = bVar2.f30243t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f30191D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f30192E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f30193F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f30194G;
            bVar.f30130x = bVar2.f30202O;
            bVar.f30131y = bVar2.f30201N;
            bVar.f30127u = bVar2.f30198K;
            bVar.f30129w = bVar2.f30200M;
            bVar.f30132z = bVar2.f30244u;
            bVar.f30066A = bVar2.f30245v;
            bVar.f30116m = bVar2.f30247x;
            bVar.f30118n = bVar2.f30248y;
            bVar.f30120o = bVar2.f30249z;
            bVar.f30067B = bVar2.f30246w;
            bVar.f30082Q = bVar2.f30188A;
            bVar.f30083R = bVar2.f30189B;
            bVar.f30071F = bVar2.f30203P;
            bVar.f30070E = bVar2.f30204Q;
            bVar.f30073H = bVar2.f30206S;
            bVar.f30072G = bVar2.f30205R;
            bVar.f30085T = bVar2.f30229h0;
            bVar.f30086U = bVar2.f30231i0;
            bVar.f30074I = bVar2.f30207T;
            bVar.f30075J = bVar2.f30208U;
            bVar.f30078M = bVar2.f30209V;
            bVar.f30079N = bVar2.f30210W;
            bVar.f30076K = bVar2.f30211X;
            bVar.f30077L = bVar2.f30212Y;
            bVar.f30080O = bVar2.f30213Z;
            bVar.f30081P = bVar2.f30215a0;
            bVar.f30084S = bVar2.f30190C;
            bVar.f30096c = bVar2.f30226g;
            bVar.f30092a = bVar2.f30222e;
            bVar.f30094b = bVar2.f30224f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f30218c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f30220d;
            String str = bVar2.f30227g0;
            if (str != null) {
                bVar.f30087V = str;
            }
            bVar.setMarginStart(bVar2.f30196I);
            bVar.setMarginEnd(this.f30184d.f30195H);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f30184d.a(this.f30184d);
            aVar.f30183c.a(this.f30183c);
            aVar.f30182b.a(this.f30182b);
            aVar.f30185e.a(this.f30185e);
            aVar.f30181a = this.f30181a;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f30187k0;

        /* renamed from: c, reason: collision with root package name */
        public int f30218c;

        /* renamed from: d, reason: collision with root package name */
        public int f30220d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f30223e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f30225f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f30227g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f30214a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f30216b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f30222e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f30224f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f30226g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f30228h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f30230i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f30232j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f30234k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f30235l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f30236m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f30237n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f30238o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f30239p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f30240q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f30241r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f30242s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f30243t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f30244u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f30245v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f30246w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f30247x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f30248y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f30249z = 0.0f;

        /* renamed from: A, reason: collision with root package name */
        public int f30188A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f30189B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f30190C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f30191D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f30192E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f30193F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f30194G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f30195H = -1;

        /* renamed from: I, reason: collision with root package name */
        public int f30196I = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f30197J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f30198K = -1;

        /* renamed from: L, reason: collision with root package name */
        public int f30199L = -1;

        /* renamed from: M, reason: collision with root package name */
        public int f30200M = -1;

        /* renamed from: N, reason: collision with root package name */
        public int f30201N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f30202O = -1;

        /* renamed from: P, reason: collision with root package name */
        public float f30203P = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public float f30204Q = -1.0f;

        /* renamed from: R, reason: collision with root package name */
        public int f30205R = 0;

        /* renamed from: S, reason: collision with root package name */
        public int f30206S = 0;

        /* renamed from: T, reason: collision with root package name */
        public int f30207T = 0;

        /* renamed from: U, reason: collision with root package name */
        public int f30208U = 0;

        /* renamed from: V, reason: collision with root package name */
        public int f30209V = -1;

        /* renamed from: W, reason: collision with root package name */
        public int f30210W = -1;

        /* renamed from: X, reason: collision with root package name */
        public int f30211X = -1;

        /* renamed from: Y, reason: collision with root package name */
        public int f30212Y = -1;

        /* renamed from: Z, reason: collision with root package name */
        public float f30213Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f30215a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f30217b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f30219c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f30221d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f30229h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f30231i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f30233j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f30187k0 = sparseIntArray;
            sparseIntArray.append(i.f30383R3, 24);
            f30187k0.append(i.f30389S3, 25);
            f30187k0.append(i.f30401U3, 28);
            f30187k0.append(i.f30407V3, 29);
            f30187k0.append(i.f30438a4, 35);
            f30187k0.append(i.f30431Z3, 34);
            f30187k0.append(i.f30293C3, 4);
            f30187k0.append(i.f30287B3, 3);
            f30187k0.append(i.f30609z3, 1);
            f30187k0.append(i.f30473f4, 6);
            f30187k0.append(i.f30480g4, 7);
            f30187k0.append(i.f30335J3, 17);
            f30187k0.append(i.f30341K3, 18);
            f30187k0.append(i.f30347L3, 19);
            f30187k0.append(i.f30507k3, 26);
            f30187k0.append(i.f30413W3, 31);
            f30187k0.append(i.f30419X3, 32);
            f30187k0.append(i.f30329I3, 10);
            f30187k0.append(i.f30323H3, 9);
            f30187k0.append(i.f30501j4, 13);
            f30187k0.append(i.f30522m4, 16);
            f30187k0.append(i.f30508k4, 14);
            f30187k0.append(i.f30487h4, 11);
            f30187k0.append(i.f30515l4, 15);
            f30187k0.append(i.f30494i4, 12);
            f30187k0.append(i.f30459d4, 38);
            f30187k0.append(i.f30371P3, 37);
            f30187k0.append(i.f30365O3, 39);
            f30187k0.append(i.f30452c4, 40);
            f30187k0.append(i.f30359N3, 20);
            f30187k0.append(i.f30445b4, 36);
            f30187k0.append(i.f30317G3, 5);
            f30187k0.append(i.f30377Q3, 76);
            f30187k0.append(i.f30425Y3, 76);
            f30187k0.append(i.f30395T3, 76);
            f30187k0.append(i.f30281A3, 76);
            f30187k0.append(i.f30603y3, 76);
            f30187k0.append(i.f30528n3, 23);
            f30187k0.append(i.f30542p3, 27);
            f30187k0.append(i.f30556r3, 30);
            f30187k0.append(i.f30563s3, 8);
            f30187k0.append(i.f30535o3, 33);
            f30187k0.append(i.f30549q3, 2);
            f30187k0.append(i.f30514l3, 22);
            f30187k0.append(i.f30521m3, 21);
            f30187k0.append(i.f30299D3, 61);
            f30187k0.append(i.f30311F3, 62);
            f30187k0.append(i.f30305E3, 63);
            f30187k0.append(i.f30466e4, 69);
            f30187k0.append(i.f30353M3, 70);
            f30187k0.append(i.f30591w3, 71);
            f30187k0.append(i.f30577u3, 72);
            f30187k0.append(i.f30584v3, 73);
            f30187k0.append(i.f30597x3, 74);
            f30187k0.append(i.f30570t3, 75);
        }

        public void a(b bVar) {
            this.f30214a = bVar.f30214a;
            this.f30218c = bVar.f30218c;
            this.f30216b = bVar.f30216b;
            this.f30220d = bVar.f30220d;
            this.f30222e = bVar.f30222e;
            this.f30224f = bVar.f30224f;
            this.f30226g = bVar.f30226g;
            this.f30228h = bVar.f30228h;
            this.f30230i = bVar.f30230i;
            this.f30232j = bVar.f30232j;
            this.f30234k = bVar.f30234k;
            this.f30235l = bVar.f30235l;
            this.f30236m = bVar.f30236m;
            this.f30237n = bVar.f30237n;
            this.f30238o = bVar.f30238o;
            this.f30239p = bVar.f30239p;
            this.f30240q = bVar.f30240q;
            this.f30241r = bVar.f30241r;
            this.f30242s = bVar.f30242s;
            this.f30243t = bVar.f30243t;
            this.f30244u = bVar.f30244u;
            this.f30245v = bVar.f30245v;
            this.f30246w = bVar.f30246w;
            this.f30247x = bVar.f30247x;
            this.f30248y = bVar.f30248y;
            this.f30249z = bVar.f30249z;
            this.f30188A = bVar.f30188A;
            this.f30189B = bVar.f30189B;
            this.f30190C = bVar.f30190C;
            this.f30191D = bVar.f30191D;
            this.f30192E = bVar.f30192E;
            this.f30193F = bVar.f30193F;
            this.f30194G = bVar.f30194G;
            this.f30195H = bVar.f30195H;
            this.f30196I = bVar.f30196I;
            this.f30197J = bVar.f30197J;
            this.f30198K = bVar.f30198K;
            this.f30199L = bVar.f30199L;
            this.f30200M = bVar.f30200M;
            this.f30201N = bVar.f30201N;
            this.f30202O = bVar.f30202O;
            this.f30203P = bVar.f30203P;
            this.f30204Q = bVar.f30204Q;
            this.f30205R = bVar.f30205R;
            this.f30206S = bVar.f30206S;
            this.f30207T = bVar.f30207T;
            this.f30208U = bVar.f30208U;
            this.f30209V = bVar.f30209V;
            this.f30210W = bVar.f30210W;
            this.f30211X = bVar.f30211X;
            this.f30212Y = bVar.f30212Y;
            this.f30213Z = bVar.f30213Z;
            this.f30215a0 = bVar.f30215a0;
            this.f30217b0 = bVar.f30217b0;
            this.f30219c0 = bVar.f30219c0;
            this.f30221d0 = bVar.f30221d0;
            this.f30227g0 = bVar.f30227g0;
            int[] iArr = bVar.f30223e0;
            if (iArr != null) {
                this.f30223e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f30223e0 = null;
            }
            this.f30225f0 = bVar.f30225f0;
            this.f30229h0 = bVar.f30229h0;
            this.f30231i0 = bVar.f30231i0;
            this.f30233j0 = bVar.f30233j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30500j3);
            this.f30216b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f30187k0.get(index);
                if (i11 == 80) {
                    this.f30229h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f30229h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f30239p = e.m(typedArrayObtainStyledAttributes, index, this.f30239p);
                            break;
                        case 2:
                            this.f30194G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30194G);
                            break;
                        case 3:
                            this.f30238o = e.m(typedArrayObtainStyledAttributes, index, this.f30238o);
                            break;
                        case 4:
                            this.f30237n = e.m(typedArrayObtainStyledAttributes, index, this.f30237n);
                            break;
                        case 5:
                            this.f30246w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f30188A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30188A);
                            break;
                        case 7:
                            this.f30189B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30189B);
                            break;
                        case 8:
                            this.f30195H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30195H);
                            break;
                        case 9:
                            this.f30243t = e.m(typedArrayObtainStyledAttributes, index, this.f30243t);
                            break;
                        case 10:
                            this.f30242s = e.m(typedArrayObtainStyledAttributes, index, this.f30242s);
                            break;
                        case 11:
                            this.f30200M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30200M);
                            break;
                        case 12:
                            this.f30201N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30201N);
                            break;
                        case 13:
                            this.f30197J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30197J);
                            break;
                        case 14:
                            this.f30199L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30199L);
                            break;
                        case 15:
                            this.f30202O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30202O);
                            break;
                        case 16:
                            this.f30198K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30198K);
                            break;
                        case 17:
                            this.f30222e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30222e);
                            break;
                        case 18:
                            this.f30224f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f30224f);
                            break;
                        case 19:
                            this.f30226g = typedArrayObtainStyledAttributes.getFloat(index, this.f30226g);
                            break;
                        case 20:
                            this.f30244u = typedArrayObtainStyledAttributes.getFloat(index, this.f30244u);
                            break;
                        case 21:
                            this.f30220d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f30220d);
                            break;
                        case ImageFormat.RGBA_FP16 /* 22 */:
                            this.f30218c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f30218c);
                            break;
                        case 23:
                            this.f30191D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30191D);
                            break;
                        case 24:
                            this.f30228h = e.m(typedArrayObtainStyledAttributes, index, this.f30228h);
                            break;
                        case 25:
                            this.f30230i = e.m(typedArrayObtainStyledAttributes, index, this.f30230i);
                            break;
                        case 26:
                            this.f30190C = typedArrayObtainStyledAttributes.getInt(index, this.f30190C);
                            break;
                        case 27:
                            this.f30192E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30192E);
                            break;
                        case 28:
                            this.f30232j = e.m(typedArrayObtainStyledAttributes, index, this.f30232j);
                            break;
                        case 29:
                            this.f30234k = e.m(typedArrayObtainStyledAttributes, index, this.f30234k);
                            break;
                        case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                            this.f30196I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30196I);
                            break;
                        case 31:
                            this.f30240q = e.m(typedArrayObtainStyledAttributes, index, this.f30240q);
                            break;
                        case 32:
                            this.f30241r = e.m(typedArrayObtainStyledAttributes, index, this.f30241r);
                            break;
                        case 33:
                            this.f30193F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30193F);
                            break;
                        case 34:
                            this.f30236m = e.m(typedArrayObtainStyledAttributes, index, this.f30236m);
                            break;
                        case ImageFormat.YUV_420_888 /* 35 */:
                            this.f30235l = e.m(typedArrayObtainStyledAttributes, index, this.f30235l);
                            break;
                        case 36:
                            this.f30245v = typedArrayObtainStyledAttributes.getFloat(index, this.f30245v);
                            break;
                        case 37:
                            this.f30204Q = typedArrayObtainStyledAttributes.getFloat(index, this.f30204Q);
                            break;
                        case 38:
                            this.f30203P = typedArrayObtainStyledAttributes.getFloat(index, this.f30203P);
                            break;
                        case 39:
                            this.f30205R = typedArrayObtainStyledAttributes.getInt(index, this.f30205R);
                            break;
                        case 40:
                            this.f30206S = typedArrayObtainStyledAttributes.getInt(index, this.f30206S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f30207T = typedArrayObtainStyledAttributes.getInt(index, this.f30207T);
                                    break;
                                case 55:
                                    this.f30208U = typedArrayObtainStyledAttributes.getInt(index, this.f30208U);
                                    break;
                                case 56:
                                    this.f30209V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30209V);
                                    break;
                                case 57:
                                    this.f30210W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30210W);
                                    break;
                                case 58:
                                    this.f30211X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30211X);
                                    break;
                                case 59:
                                    this.f30212Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30212Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f30247x = e.m(typedArrayObtainStyledAttributes, index, this.f30247x);
                                            break;
                                        case 62:
                                            this.f30248y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30248y);
                                            break;
                                        case 63:
                                            this.f30249z = typedArrayObtainStyledAttributes.getFloat(index, this.f30249z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f30213Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
                                                    this.f30215a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f30217b0 = typedArrayObtainStyledAttributes.getInt(index, this.f30217b0);
                                                    break;
                                                case 73:
                                                    this.f30219c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f30219c0);
                                                    break;
                                                case 74:
                                                    this.f30225f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f30233j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f30233j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f30187k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f30227g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f30187k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f30231i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f30231i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f30250h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f30251a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f30252b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f30253c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f30254d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f30255e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f30256f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f30257g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f30250h = sparseIntArray;
            sparseIntArray.append(i.f30598x4, 1);
            f30250h.append(i.f30610z4, 2);
            f30250h.append(i.f30282A4, 3);
            f30250h.append(i.f30592w4, 4);
            f30250h.append(i.f30585v4, 5);
            f30250h.append(i.f30604y4, 6);
        }

        public void a(c cVar) {
            this.f30251a = cVar.f30251a;
            this.f30252b = cVar.f30252b;
            this.f30253c = cVar.f30253c;
            this.f30254d = cVar.f30254d;
            this.f30255e = cVar.f30255e;
            this.f30257g = cVar.f30257g;
            this.f30256f = cVar.f30256f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30578u4);
            this.f30251a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f30250h.get(index)) {
                    case 1:
                        this.f30257g = typedArrayObtainStyledAttributes.getFloat(index, this.f30257g);
                        break;
                    case 2:
                        this.f30254d = typedArrayObtainStyledAttributes.getInt(index, this.f30254d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f30253c = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f30253c = C6539a.f52361c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f30255e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f30252b = e.m(typedArrayObtainStyledAttributes, index, this.f30252b);
                        break;
                    case 6:
                        this.f30256f = typedArrayObtainStyledAttributes.getFloat(index, this.f30256f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f30258a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f30259b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f30260c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f30261d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f30262e = Float.NaN;

        public void a(d dVar) {
            this.f30258a = dVar.f30258a;
            this.f30259b = dVar.f30259b;
            this.f30261d = dVar.f30261d;
            this.f30262e = dVar.f30262e;
            this.f30260c = dVar.f30260c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30336J4);
            this.f30258a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f30348L4) {
                    this.f30261d = typedArrayObtainStyledAttributes.getFloat(index, this.f30261d);
                } else if (index == i.f30342K4) {
                    this.f30259b = typedArrayObtainStyledAttributes.getInt(index, this.f30259b);
                    this.f30259b = e.f30176d[this.f30259b];
                } else if (index == i.f30360N4) {
                    this.f30260c = typedArrayObtainStyledAttributes.getInt(index, this.f30260c);
                } else if (index == i.f30354M4) {
                    this.f30262e = typedArrayObtainStyledAttributes.getFloat(index, this.f30262e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C1093e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f30263n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f30264a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f30265b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f30266c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f30267d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f30268e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f30269f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f30270g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f30271h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f30272i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f30273j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f30274k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f30275l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f30276m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f30263n = sparseIntArray;
            sparseIntArray.append(i.f30488h5, 1);
            f30263n.append(i.f30495i5, 2);
            f30263n.append(i.f30502j5, 3);
            f30263n.append(i.f30474f5, 4);
            f30263n.append(i.f30481g5, 5);
            f30263n.append(i.f30446b5, 6);
            f30263n.append(i.f30453c5, 7);
            f30263n.append(i.f30460d5, 8);
            f30263n.append(i.f30467e5, 9);
            f30263n.append(i.f30509k5, 10);
            f30263n.append(i.f30516l5, 11);
        }

        public void a(C1093e c1093e) {
            this.f30264a = c1093e.f30264a;
            this.f30265b = c1093e.f30265b;
            this.f30266c = c1093e.f30266c;
            this.f30267d = c1093e.f30267d;
            this.f30268e = c1093e.f30268e;
            this.f30269f = c1093e.f30269f;
            this.f30270g = c1093e.f30270g;
            this.f30271h = c1093e.f30271h;
            this.f30272i = c1093e.f30272i;
            this.f30273j = c1093e.f30273j;
            this.f30274k = c1093e.f30274k;
            this.f30275l = c1093e.f30275l;
            this.f30276m = c1093e.f30276m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30439a5);
            this.f30264a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f30263n.get(index)) {
                    case 1:
                        this.f30265b = typedArrayObtainStyledAttributes.getFloat(index, this.f30265b);
                        break;
                    case 2:
                        this.f30266c = typedArrayObtainStyledAttributes.getFloat(index, this.f30266c);
                        break;
                    case 3:
                        this.f30267d = typedArrayObtainStyledAttributes.getFloat(index, this.f30267d);
                        break;
                    case 4:
                        this.f30268e = typedArrayObtainStyledAttributes.getFloat(index, this.f30268e);
                        break;
                    case 5:
                        this.f30269f = typedArrayObtainStyledAttributes.getFloat(index, this.f30269f);
                        break;
                    case 6:
                        this.f30270g = typedArrayObtainStyledAttributes.getDimension(index, this.f30270g);
                        break;
                    case 7:
                        this.f30271h = typedArrayObtainStyledAttributes.getDimension(index, this.f30271h);
                        break;
                    case 8:
                        this.f30272i = typedArrayObtainStyledAttributes.getDimension(index, this.f30272i);
                        break;
                    case 9:
                        this.f30273j = typedArrayObtainStyledAttributes.getDimension(index, this.f30273j);
                        break;
                    case 10:
                        this.f30274k = typedArrayObtainStyledAttributes.getDimension(index, this.f30274k);
                        break;
                    case 11:
                        this.f30275l = true;
                        this.f30276m = typedArrayObtainStyledAttributes.getDimension(index, this.f30276m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30177e = sparseIntArray;
        sparseIntArray.append(i.f30574u0, 25);
        f30177e.append(i.f30581v0, 26);
        f30177e.append(i.f30594x0, 29);
        f30177e.append(i.f30600y0, 30);
        f30177e.append(i.f30302E0, 36);
        f30177e.append(i.f30296D0, 35);
        f30177e.append(i.f30448c0, 4);
        f30177e.append(i.f30441b0, 3);
        f30177e.append(i.f30427Z, 1);
        f30177e.append(i.f30350M0, 6);
        f30177e.append(i.f30356N0, 7);
        f30177e.append(i.f30497j0, 17);
        f30177e.append(i.f30504k0, 18);
        f30177e.append(i.f30511l0, 19);
        f30177e.append(i.f30559s, 27);
        f30177e.append(i.f30606z0, 32);
        f30177e.append(i.f30278A0, 33);
        f30177e.append(i.f30490i0, 10);
        f30177e.append(i.f30483h0, 9);
        f30177e.append(i.f30374Q0, 13);
        f30177e.append(i.f30392T0, 16);
        f30177e.append(i.f30380R0, 14);
        f30177e.append(i.f30362O0, 11);
        f30177e.append(i.f30386S0, 15);
        f30177e.append(i.f30368P0, 12);
        f30177e.append(i.f30320H0, 40);
        f30177e.append(i.f30560s0, 39);
        f30177e.append(i.f30553r0, 41);
        f30177e.append(i.f30314G0, 42);
        f30177e.append(i.f30546q0, 20);
        f30177e.append(i.f30308F0, 37);
        f30177e.append(i.f30476g0, 5);
        f30177e.append(i.f30567t0, 82);
        f30177e.append(i.f30290C0, 82);
        f30177e.append(i.f30588w0, 82);
        f30177e.append(i.f30434a0, 82);
        f30177e.append(i.f30421Y, 82);
        f30177e.append(i.f30593x, 24);
        f30177e.append(i.f30605z, 28);
        f30177e.append(i.f30343L, 31);
        f30177e.append(i.f30349M, 8);
        f30177e.append(i.f30599y, 34);
        f30177e.append(i.f30277A, 2);
        f30177e.append(i.f30580v, 23);
        f30177e.append(i.f30587w, 21);
        f30177e.append(i.f30573u, 22);
        f30177e.append(i.f30283B, 43);
        f30177e.append(i.f30361O, 44);
        f30177e.append(i.f30331J, 45);
        f30177e.append(i.f30337K, 46);
        f30177e.append(i.f30325I, 60);
        f30177e.append(i.f30313G, 47);
        f30177e.append(i.f30319H, 48);
        f30177e.append(i.f30289C, 49);
        f30177e.append(i.f30295D, 50);
        f30177e.append(i.f30301E, 51);
        f30177e.append(i.f30307F, 52);
        f30177e.append(i.f30355N, 53);
        f30177e.append(i.f30326I0, 54);
        f30177e.append(i.f30518m0, 55);
        f30177e.append(i.f30332J0, 56);
        f30177e.append(i.f30525n0, 57);
        f30177e.append(i.f30338K0, 58);
        f30177e.append(i.f30532o0, 59);
        f30177e.append(i.f30455d0, 61);
        f30177e.append(i.f30469f0, 62);
        f30177e.append(i.f30462e0, 63);
        f30177e.append(i.f30367P, 64);
        f30177e.append(i.f30416X0, 65);
        f30177e.append(i.f30403V, 66);
        f30177e.append(i.f30422Y0, 67);
        f30177e.append(i.f30404V0, 79);
        f30177e.append(i.f30566t, 38);
        f30177e.append(i.f30398U0, 68);
        f30177e.append(i.f30344L0, 69);
        f30177e.append(i.f30539p0, 70);
        f30177e.append(i.f30391T, 71);
        f30177e.append(i.f30379R, 72);
        f30177e.append(i.f30385S, 73);
        f30177e.append(i.f30397U, 74);
        f30177e.append(i.f30373Q, 75);
        f30177e.append(i.f30410W0, 76);
        f30177e.append(i.f30284B0, 77);
        f30177e.append(i.f30428Z0, 78);
        f30177e.append(i.f30415X, 80);
        f30177e.append(i.f30409W, 81);
    }

    private int[] h(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f30552r);
        n(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f30180c.containsKey(Integer.valueOf(i10))) {
            this.f30180c.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f30180c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    private void n(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f30566t && i.f30343L != index && i.f30349M != index) {
                aVar.f30183c.f30251a = true;
                aVar.f30184d.f30216b = true;
                aVar.f30182b.f30258a = true;
                aVar.f30185e.f30264a = true;
            }
            switch (f30177e.get(index)) {
                case 1:
                    b bVar = aVar.f30184d;
                    bVar.f30239p = m(typedArray, index, bVar.f30239p);
                    break;
                case 2:
                    b bVar2 = aVar.f30184d;
                    bVar2.f30194G = typedArray.getDimensionPixelSize(index, bVar2.f30194G);
                    break;
                case 3:
                    b bVar3 = aVar.f30184d;
                    bVar3.f30238o = m(typedArray, index, bVar3.f30238o);
                    break;
                case 4:
                    b bVar4 = aVar.f30184d;
                    bVar4.f30237n = m(typedArray, index, bVar4.f30237n);
                    break;
                case 5:
                    aVar.f30184d.f30246w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f30184d;
                    bVar5.f30188A = typedArray.getDimensionPixelOffset(index, bVar5.f30188A);
                    break;
                case 7:
                    b bVar6 = aVar.f30184d;
                    bVar6.f30189B = typedArray.getDimensionPixelOffset(index, bVar6.f30189B);
                    break;
                case 8:
                    b bVar7 = aVar.f30184d;
                    bVar7.f30195H = typedArray.getDimensionPixelSize(index, bVar7.f30195H);
                    break;
                case 9:
                    b bVar8 = aVar.f30184d;
                    bVar8.f30243t = m(typedArray, index, bVar8.f30243t);
                    break;
                case 10:
                    b bVar9 = aVar.f30184d;
                    bVar9.f30242s = m(typedArray, index, bVar9.f30242s);
                    break;
                case 11:
                    b bVar10 = aVar.f30184d;
                    bVar10.f30200M = typedArray.getDimensionPixelSize(index, bVar10.f30200M);
                    break;
                case 12:
                    b bVar11 = aVar.f30184d;
                    bVar11.f30201N = typedArray.getDimensionPixelSize(index, bVar11.f30201N);
                    break;
                case 13:
                    b bVar12 = aVar.f30184d;
                    bVar12.f30197J = typedArray.getDimensionPixelSize(index, bVar12.f30197J);
                    break;
                case 14:
                    b bVar13 = aVar.f30184d;
                    bVar13.f30199L = typedArray.getDimensionPixelSize(index, bVar13.f30199L);
                    break;
                case 15:
                    b bVar14 = aVar.f30184d;
                    bVar14.f30202O = typedArray.getDimensionPixelSize(index, bVar14.f30202O);
                    break;
                case 16:
                    b bVar15 = aVar.f30184d;
                    bVar15.f30198K = typedArray.getDimensionPixelSize(index, bVar15.f30198K);
                    break;
                case 17:
                    b bVar16 = aVar.f30184d;
                    bVar16.f30222e = typedArray.getDimensionPixelOffset(index, bVar16.f30222e);
                    break;
                case 18:
                    b bVar17 = aVar.f30184d;
                    bVar17.f30224f = typedArray.getDimensionPixelOffset(index, bVar17.f30224f);
                    break;
                case 19:
                    b bVar18 = aVar.f30184d;
                    bVar18.f30226g = typedArray.getFloat(index, bVar18.f30226g);
                    break;
                case 20:
                    b bVar19 = aVar.f30184d;
                    bVar19.f30244u = typedArray.getFloat(index, bVar19.f30244u);
                    break;
                case 21:
                    b bVar20 = aVar.f30184d;
                    bVar20.f30220d = typedArray.getLayoutDimension(index, bVar20.f30220d);
                    break;
                case ImageFormat.RGBA_FP16 /* 22 */:
                    d dVar = aVar.f30182b;
                    dVar.f30259b = typedArray.getInt(index, dVar.f30259b);
                    d dVar2 = aVar.f30182b;
                    dVar2.f30259b = f30176d[dVar2.f30259b];
                    break;
                case 23:
                    b bVar21 = aVar.f30184d;
                    bVar21.f30218c = typedArray.getLayoutDimension(index, bVar21.f30218c);
                    break;
                case 24:
                    b bVar22 = aVar.f30184d;
                    bVar22.f30191D = typedArray.getDimensionPixelSize(index, bVar22.f30191D);
                    break;
                case 25:
                    b bVar23 = aVar.f30184d;
                    bVar23.f30228h = m(typedArray, index, bVar23.f30228h);
                    break;
                case 26:
                    b bVar24 = aVar.f30184d;
                    bVar24.f30230i = m(typedArray, index, bVar24.f30230i);
                    break;
                case 27:
                    b bVar25 = aVar.f30184d;
                    bVar25.f30190C = typedArray.getInt(index, bVar25.f30190C);
                    break;
                case 28:
                    b bVar26 = aVar.f30184d;
                    bVar26.f30192E = typedArray.getDimensionPixelSize(index, bVar26.f30192E);
                    break;
                case 29:
                    b bVar27 = aVar.f30184d;
                    bVar27.f30232j = m(typedArray, index, bVar27.f30232j);
                    break;
                case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                    b bVar28 = aVar.f30184d;
                    bVar28.f30234k = m(typedArray, index, bVar28.f30234k);
                    break;
                case 31:
                    b bVar29 = aVar.f30184d;
                    bVar29.f30196I = typedArray.getDimensionPixelSize(index, bVar29.f30196I);
                    break;
                case 32:
                    b bVar30 = aVar.f30184d;
                    bVar30.f30240q = m(typedArray, index, bVar30.f30240q);
                    break;
                case 33:
                    b bVar31 = aVar.f30184d;
                    bVar31.f30241r = m(typedArray, index, bVar31.f30241r);
                    break;
                case 34:
                    b bVar32 = aVar.f30184d;
                    bVar32.f30193F = typedArray.getDimensionPixelSize(index, bVar32.f30193F);
                    break;
                case ImageFormat.YUV_420_888 /* 35 */:
                    b bVar33 = aVar.f30184d;
                    bVar33.f30236m = m(typedArray, index, bVar33.f30236m);
                    break;
                case 36:
                    b bVar34 = aVar.f30184d;
                    bVar34.f30235l = m(typedArray, index, bVar34.f30235l);
                    break;
                case 37:
                    b bVar35 = aVar.f30184d;
                    bVar35.f30245v = typedArray.getFloat(index, bVar35.f30245v);
                    break;
                case 38:
                    aVar.f30181a = typedArray.getResourceId(index, aVar.f30181a);
                    break;
                case 39:
                    b bVar36 = aVar.f30184d;
                    bVar36.f30204Q = typedArray.getFloat(index, bVar36.f30204Q);
                    break;
                case 40:
                    b bVar37 = aVar.f30184d;
                    bVar37.f30203P = typedArray.getFloat(index, bVar37.f30203P);
                    break;
                case 41:
                    b bVar38 = aVar.f30184d;
                    bVar38.f30205R = typedArray.getInt(index, bVar38.f30205R);
                    break;
                case 42:
                    b bVar39 = aVar.f30184d;
                    bVar39.f30206S = typedArray.getInt(index, bVar39.f30206S);
                    break;
                case 43:
                    d dVar3 = aVar.f30182b;
                    dVar3.f30261d = typedArray.getFloat(index, dVar3.f30261d);
                    break;
                case 44:
                    C1093e c1093e = aVar.f30185e;
                    c1093e.f30275l = true;
                    c1093e.f30276m = typedArray.getDimension(index, c1093e.f30276m);
                    break;
                case 45:
                    C1093e c1093e2 = aVar.f30185e;
                    c1093e2.f30266c = typedArray.getFloat(index, c1093e2.f30266c);
                    break;
                case 46:
                    C1093e c1093e3 = aVar.f30185e;
                    c1093e3.f30267d = typedArray.getFloat(index, c1093e3.f30267d);
                    break;
                case 47:
                    C1093e c1093e4 = aVar.f30185e;
                    c1093e4.f30268e = typedArray.getFloat(index, c1093e4.f30268e);
                    break;
                case 48:
                    C1093e c1093e5 = aVar.f30185e;
                    c1093e5.f30269f = typedArray.getFloat(index, c1093e5.f30269f);
                    break;
                case 49:
                    C1093e c1093e6 = aVar.f30185e;
                    c1093e6.f30270g = typedArray.getDimension(index, c1093e6.f30270g);
                    break;
                case 50:
                    C1093e c1093e7 = aVar.f30185e;
                    c1093e7.f30271h = typedArray.getDimension(index, c1093e7.f30271h);
                    break;
                case 51:
                    C1093e c1093e8 = aVar.f30185e;
                    c1093e8.f30272i = typedArray.getDimension(index, c1093e8.f30272i);
                    break;
                case 52:
                    C1093e c1093e9 = aVar.f30185e;
                    c1093e9.f30273j = typedArray.getDimension(index, c1093e9.f30273j);
                    break;
                case 53:
                    C1093e c1093e10 = aVar.f30185e;
                    c1093e10.f30274k = typedArray.getDimension(index, c1093e10.f30274k);
                    break;
                case 54:
                    b bVar40 = aVar.f30184d;
                    bVar40.f30207T = typedArray.getInt(index, bVar40.f30207T);
                    break;
                case 55:
                    b bVar41 = aVar.f30184d;
                    bVar41.f30208U = typedArray.getInt(index, bVar41.f30208U);
                    break;
                case 56:
                    b bVar42 = aVar.f30184d;
                    bVar42.f30209V = typedArray.getDimensionPixelSize(index, bVar42.f30209V);
                    break;
                case 57:
                    b bVar43 = aVar.f30184d;
                    bVar43.f30210W = typedArray.getDimensionPixelSize(index, bVar43.f30210W);
                    break;
                case 58:
                    b bVar44 = aVar.f30184d;
                    bVar44.f30211X = typedArray.getDimensionPixelSize(index, bVar44.f30211X);
                    break;
                case 59:
                    b bVar45 = aVar.f30184d;
                    bVar45.f30212Y = typedArray.getDimensionPixelSize(index, bVar45.f30212Y);
                    break;
                case MqttConnectOptions.KEEP_ALIVE_INTERVAL_DEFAULT /* 60 */:
                    C1093e c1093e11 = aVar.f30185e;
                    c1093e11.f30265b = typedArray.getFloat(index, c1093e11.f30265b);
                    break;
                case 61:
                    b bVar46 = aVar.f30184d;
                    bVar46.f30247x = m(typedArray, index, bVar46.f30247x);
                    break;
                case 62:
                    b bVar47 = aVar.f30184d;
                    bVar47.f30248y = typedArray.getDimensionPixelSize(index, bVar47.f30248y);
                    break;
                case 63:
                    b bVar48 = aVar.f30184d;
                    bVar48.f30249z = typedArray.getFloat(index, bVar48.f30249z);
                    break;
                case 64:
                    c cVar = aVar.f30183c;
                    cVar.f30252b = m(typedArray, index, cVar.f30252b);
                    break;
                case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f30183c.f30253c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f30183c.f30253c = C6539a.f52361c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f30183c.f30255e = typedArray.getInt(index, 0);
                    break;
                case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                    c cVar2 = aVar.f30183c;
                    cVar2.f30257g = typedArray.getFloat(index, cVar2.f30257g);
                    break;
                case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                    d dVar4 = aVar.f30182b;
                    dVar4.f30262e = typedArray.getFloat(index, dVar4.f30262e);
                    break;
                case 69:
                    aVar.f30184d.f30213Z = typedArray.getFloat(index, 1.0f);
                    break;
                case SMIConstants.SYNTAX_COUNTER64 /* 70 */:
                    aVar.f30184d.f30215a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f30184d;
                    bVar49.f30217b0 = typedArray.getInt(index, bVar49.f30217b0);
                    break;
                case 73:
                    b bVar50 = aVar.f30184d;
                    bVar50.f30219c0 = typedArray.getDimensionPixelSize(index, bVar50.f30219c0);
                    break;
                case 74:
                    aVar.f30184d.f30225f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f30184d;
                    bVar51.f30233j0 = typedArray.getBoolean(index, bVar51.f30233j0);
                    break;
                case 76:
                    c cVar3 = aVar.f30183c;
                    cVar3.f30254d = typedArray.getInt(index, cVar3.f30254d);
                    break;
                case 77:
                    aVar.f30184d.f30227g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f30182b;
                    dVar5.f30260c = typedArray.getInt(index, dVar5.f30260c);
                    break;
                case 79:
                    c cVar4 = aVar.f30183c;
                    cVar4.f30256f = typedArray.getFloat(index, cVar4.f30256f);
                    break;
                case 80:
                    b bVar52 = aVar.f30184d;
                    bVar52.f30229h0 = typedArray.getBoolean(index, bVar52.f30229h0);
                    break;
                case 81:
                    b bVar53 = aVar.f30184d;
                    bVar53.f30231i0 = typedArray.getBoolean(index, bVar53.f30231i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f30177e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f30177e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f30180c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f30180c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC6742a.a(childAt));
            } else {
                if (this.f30179b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f30180c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f30180c.get(Integer.valueOf(id2));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f30184d.f30221d0 = 1;
                        }
                        int i11 = aVar.f30184d.f30221d0;
                        if (i11 != -1 && i11 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id2);
                            aVar2.setType(aVar.f30184d.f30217b0);
                            aVar2.setMargin(aVar.f30184d.f30219c0);
                            aVar2.setAllowsGoneWidget(aVar.f30184d.f30233j0);
                            b bVar = aVar.f30184d;
                            int[] iArr = bVar.f30223e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f30225f0;
                                if (str != null) {
                                    bVar.f30223e0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f30184d.f30223e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f30186f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f30182b;
                        if (dVar.f30260c == 0) {
                            childAt.setVisibility(dVar.f30259b);
                        }
                        childAt.setAlpha(aVar.f30182b.f30261d);
                        childAt.setRotation(aVar.f30185e.f30265b);
                        childAt.setRotationX(aVar.f30185e.f30266c);
                        childAt.setRotationY(aVar.f30185e.f30267d);
                        childAt.setScaleX(aVar.f30185e.f30268e);
                        childAt.setScaleY(aVar.f30185e.f30269f);
                        if (!Float.isNaN(aVar.f30185e.f30270g)) {
                            childAt.setPivotX(aVar.f30185e.f30270g);
                        }
                        if (!Float.isNaN(aVar.f30185e.f30271h)) {
                            childAt.setPivotY(aVar.f30185e.f30271h);
                        }
                        childAt.setTranslationX(aVar.f30185e.f30272i);
                        childAt.setTranslationY(aVar.f30185e.f30273j);
                        childAt.setTranslationZ(aVar.f30185e.f30274k);
                        C1093e c1093e = aVar.f30185e;
                        if (c1093e.f30275l) {
                            childAt.setElevation(c1093e.f30276m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f30180c.get(num);
            int i12 = aVar3.f30184d.f30221d0;
            if (i12 != -1 && i12 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f30184d;
                int[] iArr2 = bVar3.f30223e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f30225f0;
                    if (str2 != null) {
                        bVar3.f30223e0 = h(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f30184d.f30223e0);
                    }
                }
                aVar4.setType(aVar3.f30184d.f30217b0);
                aVar4.setMargin(aVar3.f30184d.f30219c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                aVar4.m();
                aVar3.b(bVarD);
                constraintLayout.addView(aVar4, bVarD);
            }
            if (aVar3.f30184d.f30214a) {
                View gVar = new g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.b(bVarD2);
                constraintLayout.addView(gVar, bVarD2);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f30180c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f30179b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f30180c.containsKey(Integer.valueOf(id2))) {
                this.f30180c.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f30180c.get(Integer.valueOf(id2));
            aVar.f30186f = androidx.constraintlayout.widget.b.a(this.f30178a, childAt);
            aVar.d(id2, bVar);
            aVar.f30182b.f30259b = childAt.getVisibility();
            aVar.f30182b.f30261d = childAt.getAlpha();
            aVar.f30185e.f30265b = childAt.getRotation();
            aVar.f30185e.f30266c = childAt.getRotationX();
            aVar.f30185e.f30267d = childAt.getRotationY();
            aVar.f30185e.f30268e = childAt.getScaleX();
            aVar.f30185e.f30269f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C1093e c1093e = aVar.f30185e;
                c1093e.f30270g = pivotX;
                c1093e.f30271h = pivotY;
            }
            aVar.f30185e.f30272i = childAt.getTranslationX();
            aVar.f30185e.f30273j = childAt.getTranslationY();
            aVar.f30185e.f30274k = childAt.getTranslationZ();
            C1093e c1093e2 = aVar.f30185e;
            if (c1093e2.f30275l) {
                c1093e2.f30276m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f30184d.f30233j0 = aVar2.n();
                aVar.f30184d.f30223e0 = aVar2.getReferencedIds();
                aVar.f30184d.f30217b0 = aVar2.getType();
                aVar.f30184d.f30219c0 = aVar2.getMargin();
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f30184d;
        bVar.f30247x = i11;
        bVar.f30248y = i12;
        bVar.f30249z = f10;
    }

    public void k(Context context, int i10) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f30184d.f30214a = true;
                    }
                    this.f30180c.put(Integer.valueOf(aVarI.f30181a), aVarI);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
