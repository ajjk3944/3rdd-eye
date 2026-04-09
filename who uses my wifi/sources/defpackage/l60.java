package defpackage;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l60 implements q10 {
    public boolean A;
    public int B;
    public ArrayList C;
    public int D;
    public float E;
    public final float F;
    public float G;
    public DashPathEffect H;
    public final pz I;
    public boolean J;
    public final boolean K;
    public ArrayList a;
    public ArrayList b;
    public String c;
    public transient n41 f;
    public ArrayList o;
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public boolean u;
    public boolean v;
    public float w;
    public int x;
    public int y;
    public float z;
    public int d = 1;
    public boolean e = true;
    public int g = 3;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public boolean j = true;
    public boolean k = true;
    public aa0 l = new aa0();
    public float m = 17.0f;
    public boolean n = true;

    public l60() {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.c = "";
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.o = null;
        ArrayList arrayList2 = new ArrayList();
        this.o = arrayList2;
        if (!arrayList2.isEmpty()) {
            this.p = -3.4028235E38f;
            this.q = Float.MAX_VALUE;
            this.r = -3.4028235E38f;
            this.s = Float.MAX_VALUE;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                xs xsVar = (xs) obj;
                if (xsVar != null) {
                    float f = xsVar.h;
                    if (f < this.s) {
                        this.s = f;
                    }
                    if (f > this.r) {
                        this.r = f;
                    }
                    float f2 = xsVar.f;
                    if (f2 < this.q) {
                        this.q = f2;
                    }
                    if (f2 > this.p) {
                        this.p = f2;
                    }
                }
            }
        }
        this.t = Color.rgb(255, 187, 115);
        this.u = true;
        this.v = true;
        this.w = 0.5f;
        this.w = k41.c(0.5f);
        this.x = Color.rgb(140, 234, 255);
        this.y = 85;
        this.z = 2.5f;
        this.A = false;
        this.B = 1;
        this.C = null;
        this.D = -1;
        this.E = 8.0f;
        this.F = 4.0f;
        this.G = 0.2f;
        this.H = null;
        this.I = new pz(17);
        this.J = true;
        this.K = true;
        ArrayList arrayList3 = new ArrayList();
        this.C = arrayList3;
        arrayList3.clear();
        this.C.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public final ArrayList a(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            float f2 = ((xs) arrayList2.get(i2)).h;
            if (f == f2) {
                while (i2 > 0 && ((xs) arrayList2.get(i2 - 1)).h == f) {
                    i2--;
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    xs xsVar = (xs) arrayList2.get(i2);
                    if (xsVar.h != f) {
                        break;
                    }
                    arrayList.add(xsVar);
                    i2++;
                }
            } else if (f > f2) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public final xs b(int i) {
        return (xs) this.o.get(i);
    }

    public final xs c(float f, float f2, int i) {
        int iD = d(f, f2, i);
        if (iD > -1) {
            return (xs) this.o.get(iD);
        }
        return null;
    }

    public final int d(float f, float f2, int i) {
        int i2;
        xs xsVar;
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float f3 = ((xs) arrayList.get(i4)).h - f;
            int i5 = i4 + 1;
            float f4 = ((xs) arrayList.get(i5)).h - f;
            float fAbs = Math.abs(f3);
            float fAbs2 = Math.abs(f4);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = f3;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size != -1) {
            float f5 = ((xs) arrayList.get(size)).h;
            if (i == 1) {
                if (f5 < f && size < arrayList.size() - 1) {
                    size++;
                }
            } else if (i == 2 && f5 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((xs) arrayList.get(size - 1)).h == f5) {
                    size--;
                }
                float f6 = ((xs) arrayList.get(size)).f;
                loop2: while (true) {
                    i2 = size;
                    do {
                        size++;
                        if (size >= arrayList.size()) {
                            break loop2;
                        }
                        xsVar = (xs) arrayList.get(size);
                        if (xsVar.h != f5) {
                            break loop2;
                        }
                    } while (Math.abs(xsVar.f - f2) >= Math.abs(f6 - f2));
                    f6 = f2;
                }
                return i2;
            }
        }
        return size;
    }

    public final void e(int i) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        this.a.add(Integer.valueOf(i));
    }

    public final String toString() {
        ArrayList arrayList = this.o;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(arrayList.size());
        sb.append("\n");
        stringBuffer2.append(sb.toString());
        stringBuffer.append(stringBuffer2.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuffer.append(((xs) arrayList.get(i)).toString() + " ");
        }
        return stringBuffer.toString();
    }
}
