package w4;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.lv1;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import u0.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public Object f36442a;

    /* renamed from: b, reason: collision with root package name */
    public Object f36443b;

    /* renamed from: c, reason: collision with root package name */
    public Object f36444c;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3) {
        this.f36442a = obj;
        this.f36443b = obj2;
        this.f36444c = obj3;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z3) {
        t[] tVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (tVarArr = (t[]) editable.getSpans(selectionStart, selectionEnd, t.class)) != null && tVarArr.length > 0) {
                for (t tVar : tVarArr) {
                    int spanStart = editable.getSpanStart(tVar);
                    int spanEnd = editable.getSpanEnd(tVar);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void b(ha.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f36442a;
        ze.e eVar = new ze.e(byteArrayOutputStream, map, (HashMap) this.f36443b, (we.d) this.f36444c);
        we.d dVar = (we.d) map.get(ha.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new we.b("No encoder for " + ha.a.class);
        }
    }

    public boolean c(CharSequence charSequence, int i4, int i10, s sVar) {
        if ((sVar.f36462c & 3) == 0) {
            f fVar = (f) this.f36444c;
            x4.a aVarB = sVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f446d).getShort(iA + aVarB.f443a);
            }
            d dVar = (d) fVar;
            dVar.getClass();
            ThreadLocal threadLocal = d.f36428b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i4 < i10) {
                sb2.append(charSequence.charAt(i4));
                i4++;
            }
            TextPaint textPaint = dVar.f36429a;
            String string = sb2.toString();
            int i11 = v3.c.f35797a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i12 = sVar.f36462c & 4;
            sVar.f36462c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (sVar.f36462c & 3) == 2;
    }

    public boolean d() {
        if (((n2) this.f36442a).getValue() != this.f36444c) {
            return true;
        }
        m mVar = (m) this.f36443b;
        return mVar != null && mVar.d();
    }

    public Object e(CharSequence charSequence, int i4, int i10, int i11, boolean z3, l lVar) {
        int i12;
        char c9;
        lv1 lv1Var = new lv1((p) ((se.b) this.f36443b).f33558c);
        int iCodePointAt = Character.codePointAt(charSequence, i4);
        int i13 = 0;
        boolean zD = true;
        int iCharCount = i4;
        loop0: while (true) {
            i12 = iCharCount;
            while (iCharCount < i10 && i13 < i11 && zD) {
                SparseArray sparseArray = ((p) lv1Var.f13644b).f36453a;
                p pVar = sparseArray == null ? null : (p) sparseArray.get(iCodePointAt);
                if (lv1Var.f13646d == 2) {
                    if (pVar != null) {
                        lv1Var.f13644b = pVar;
                        lv1Var.f13648f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            lv1Var.a();
                        } else if (iCodePointAt != 65039) {
                            p pVar2 = (p) lv1Var.f13644b;
                            if (pVar2.f36454b != null) {
                                if (lv1Var.f13648f != 1) {
                                    lv1Var.f13645c = pVar2;
                                    lv1Var.a();
                                } else if (lv1Var.b()) {
                                    lv1Var.f13645c = (p) lv1Var.f13644b;
                                    lv1Var.a();
                                } else {
                                    lv1Var.a();
                                }
                                c9 = 3;
                            } else {
                                lv1Var.a();
                            }
                        }
                        c9 = 1;
                    }
                    c9 = 2;
                } else if (pVar == null) {
                    lv1Var.a();
                    c9 = 1;
                } else {
                    lv1Var.f13646d = 2;
                    lv1Var.f13644b = pVar;
                    lv1Var.f13648f = 1;
                    c9 = 2;
                }
                lv1Var.f13647e = iCodePointAt;
                if (c9 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (iCharCount < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c9 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c9 == 3) {
                    if (z3 || !c(charSequence, i12, iCharCount, ((p) lv1Var.f13645c).f36454b)) {
                        zD = lVar.d(charSequence, i12, iCharCount, ((p) lv1Var.f13645c).f36454b);
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (lv1Var.f13646d == 2 && ((p) lv1Var.f13644b).f36454b != null && ((lv1Var.f13648f > 1 || lv1Var.b()) && i13 < i11 && zD && (z3 || !c(charSequence, i12, iCharCount, ((p) lv1Var.f13644b).f36454b)))) {
            lVar.d(charSequence, i12, iCharCount, ((p) lv1Var.f13644b).f36454b);
        }
        return lVar.c();
    }

    public void f(String str, double d10, double d11) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) this.f36443b;
        ArrayList arrayList3 = (ArrayList) this.f36444c;
        int i4 = 0;
        while (true) {
            arrayList = (ArrayList) this.f36442a;
            if (i4 >= arrayList.size()) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i4)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i4)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            } else {
                i4++;
            }
        }
        arrayList.add(i4, str);
        arrayList3.add(i4, Double.valueOf(d10));
        arrayList2.add(i4, Double.valueOf(d11));
    }

    public m(int i4) {
        switch (i4) {
            case 4:
                this.f36442a = new WeakHashMap();
                this.f36443b = new WeakHashMap();
                this.f36444c = new WeakHashMap();
                break;
            default:
                this.f36442a = new ArrayList();
                this.f36443b = new ArrayList();
                this.f36444c = new ArrayList();
                break;
        }
    }

    public m(v2.r rVar, m mVar) {
        this.f36442a = rVar;
        this.f36443b = mVar;
        this.f36444c = rVar.f35789a;
    }

    public m(Signature signature) {
        this.f36442a = signature;
        this.f36443b = null;
        this.f36444c = null;
    }

    public m(Cipher cipher) {
        this.f36443b = cipher;
        this.f36442a = null;
        this.f36444c = null;
    }

    public m(Mac mac) {
        this.f36444c = mac;
        this.f36443b = null;
        this.f36442a = null;
    }

    public m(z7.k kVar, p8.g gVar, z7.o oVar) {
        this.f36444c = kVar;
        this.f36443b = gVar;
        this.f36442a = oVar;
    }
}
