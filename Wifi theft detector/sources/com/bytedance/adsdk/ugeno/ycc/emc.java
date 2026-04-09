package com.bytedance.adsdk.ugeno.ycc;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.bytedance.adsdk.ugeno.msw.xq;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class emc<T> extends FrameLayout implements xq.dg {
    private static final Interpolator sb = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.ycc.emc.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };

    /* renamed from: aa, reason: collision with root package name */
    private boolean f9213aa;
    private int bw;
    private boolean cf;
    private Scroller db;
    private int dg;
    private final Runnable dr;
    private com.bytedance.adsdk.ugeno.ycc.xq ee;
    protected List<T> emc;
    private float gbl;
    private C0099emc hxp;
    private int msw;
    private boolean qh;
    private com.bytedance.adsdk.ugeno.ycc.emc.emc rie;
    private String ru;
    private int sba;
    private final Runnable sf;
    private FrameLayout sra;
    private boolean sup;
    private boolean sz;
    private int ul;
    private int uym;
    private boolean vk;
    protected Context xq;
    private int ycc;
    private int ylm;
    protected com.bytedance.adsdk.ugeno.msw.xq ypw;
    private int yzg;
    private int zz;

    /* renamed from: com.bytedance.adsdk.ugeno.ycc.emc$emc, reason: collision with other inner class name */
    public class C0099emc extends com.bytedance.adsdk.ugeno.msw.ypw {
        public C0099emc() {
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public int emc(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public boolean emc(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public int emc() {
            if (emc.this.qh) {
                return 1024;
            }
            return emc.this.emc.size();
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public Object emc(ViewGroup viewGroup, int i10) {
            View viewEmc = emc.this.emc(i10, dg.emc(emc.this.qh, i10, emc.this.emc.size()));
            viewGroup.addView(viewEmc);
            return viewEmc;
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public void emc(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.msw.ypw
        public float emc(int i10) {
            if (emc.this.gbl <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / emc.this.gbl;
        }
    }

    public class xq extends com.bytedance.adsdk.ugeno.msw.xq {
        public xq(Context context) {
            super(context);
        }

        private MotionEvent emc(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.msw.xq, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
            if (!emc.this.cf) {
                return false;
            }
            try {
                if (emc.this.ylm != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(emc(motionEvent));
                emc(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.msw.xq, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!emc.this.cf) {
                return false;
            }
            try {
                return emc.this.ylm == 1 ? super.onTouchEvent(emc(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public class ypw extends Scroller {
        public ypw(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, emc.this.ycc);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13) {
            super.startScroll(i10, i11, i12, i13, emc.this.ycc);
        }
    }

    public emc(Context context) {
        super(context);
        this.emc = new CopyOnWriteArrayList();
        this.dg = 2000;
        this.bw = 500;
        this.ycc = 500;
        this.uym = 0;
        this.msw = -1;
        this.zz = -1;
        this.ru = "normal";
        this.gbl = 1.0f;
        this.sup = true;
        this.sz = true;
        this.qh = true;
        this.cf = true;
        this.sba = 0;
        this.yzg = 0;
        this.ul = 0;
        this.ylm = 0;
        this.sf = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ycc.emc.2
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                int currentItem = emc.this.ypw.getCurrentItem() + 1;
                if (emc.this.qh) {
                    if (currentItem >= 1024) {
                        emc.this.ypw.emc(512, false);
                        return;
                    } else {
                        emc.this.ypw.emc(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.msw.ypw adapter = emc.this.ypw.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.emc()) {
                        emc.this.ypw.emc(0, false);
                    } else {
                        emc.this.ypw.emc(currentItem, true);
                    }
                }
            }
        };
        this.dr = new Runnable() { // from class: com.bytedance.adsdk.ugeno.ycc.emc.3
            @Override // java.lang.Runnable
            public void run() throws Resources.NotFoundException {
                if (emc.this.sz) {
                    int currentItem = emc.this.ypw.getCurrentItem() + 1;
                    if (emc.this.qh) {
                        if (currentItem >= 1024) {
                            emc.this.ypw.emc(512, false);
                        } else {
                            emc.this.ypw.emc(currentItem, true);
                        }
                        emc emcVar = emc.this;
                        emcVar.postDelayed(emcVar.dr, emc.this.dg);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.msw.ypw adapter = emc.this.ypw.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.emc()) {
                            emc.this.ypw.emc(0, false);
                            emc emcVar2 = emc.this;
                            emcVar2.postDelayed(emcVar2.dr, emc.this.dg);
                        } else {
                            emc.this.ypw.emc(currentItem, true);
                            emc emcVar3 = emc.this;
                            emcVar3.postDelayed(emcVar3.dr, emc.this.dg);
                        }
                    }
                }
            }
        };
        this.xq = context;
        this.sra = new FrameLayout(context);
        this.ypw = emc();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.sra.addView(this.ypw, layoutParams);
        addView(this.sra);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.sz) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.vk) {
                    bw();
                }
            } else if (action == 0) {
                ycc();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.adsdk.ugeno.msw.xq.dg
    public void gbl(int i10) {
        int i11;
        if (this.ee != null) {
            int iEmc = dg.emc(this.qh, i10, this.emc.size());
            i11 = i10;
            this.ee.emc(this.qh, iEmc, i11, iEmc == 0, iEmc == this.emc.size() - 1);
        } else {
            i11 = i10;
        }
        if (this.sup) {
            this.rie.emc(i11);
        }
    }

    public com.bytedance.adsdk.ugeno.msw.ypw getAdapter() {
        return this.ypw.getAdapter();
    }

    public int getCurrentItem() {
        return this.ypw.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.msw.xq getViewPager() {
        return this.ypw;
    }

    public abstract View ru(int i10);

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.ycc.xq xqVar) {
        this.ee = xqVar;
    }

    public void setTwoItems(boolean z10) {
        this.f9213aa = z10;
    }

    @Override // com.bytedance.adsdk.ugeno.msw.xq.dg
    public void sup(int i10) {
        if (i10 == 1 && this.vk) {
            ycc();
        }
        com.bytedance.adsdk.ugeno.ycc.xq xqVar = this.ee;
        if (xqVar != null) {
            xqVar.emc(this.qh, i10);
        }
    }

    public void sz(int i10) throws Resources.NotFoundException {
        emc(this.ru, this.uym, this.msw, this.zz, true);
        if (this.hxp == null) {
            this.hxp = new C0099emc();
            this.ypw.emc((xq.dg) this);
            this.ypw.setAdapter(this.hxp);
        }
        if (this.qh) {
            if (i10 >= 1024) {
                this.ypw.emc(512, false);
                return;
            } else {
                this.ypw.emc(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.emc.size()) {
            return;
        }
        this.ypw.emc(i10, true);
    }

    public emc zz(int i10) throws Resources.NotFoundException {
        this.zz = i10;
        emc(this.ru, this.uym, this.msw, i10, true);
        return this;
    }

    public emc bw(int i10) {
        this.rie.setSelectedColor(i10);
        return this;
    }

    public emc dg(float f10) {
        this.rie.setIndicatorY(f10);
        return this;
    }

    public com.bytedance.adsdk.ugeno.msw.xq emc() {
        return new xq(getContext());
    }

    public emc<T> msw(int i10) throws Resources.NotFoundException {
        this.msw = i10;
        emc(this.ru, this.uym, i10, this.zz, true);
        return this;
    }

    public emc uym(int i10) throws Resources.NotFoundException {
        this.uym = i10;
        emc(this.ru, i10, this.msw, this.zz, true);
        return this;
    }

    public emc xq(float f10) {
        this.rie.setIndicatorX(f10);
        return this;
    }

    public emc ycc(int i10) {
        this.rie.setUnSelectedColor(i10);
        return this;
    }

    public emc ypw(float f10) {
        this.rie.setIndicatorHeight((int) f10);
        return this;
    }

    public emc bw(float f10) {
        this.gbl = f10;
        return this;
    }

    public emc dg(int i10) {
        this.dg = i10;
        bw();
        return this;
    }

    public emc emc(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.rie = new com.bytedance.adsdk.ugeno.ycc.emc.xq(this.xq);
        } else {
            this.rie = new com.bytedance.adsdk.ugeno.ycc.emc.ypw(this.xq);
        }
        addView(this.rie, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public emc xq(int i10) {
        this.ycc = i10;
        if (this.db == null) {
            this.db = new ypw(this.xq, sb);
        }
        this.ypw.setScroller(this.db);
        return this;
    }

    public void ycc() {
        removeCallbacks(this.dr);
    }

    public emc ypw() {
        this.rie.emc();
        return this;
    }

    private boolean uym() {
        return this.emc.size() <= 2 && this.qh;
    }

    public emc bw(boolean z10) {
        this.vk = z10;
        return this;
    }

    public emc ypw(String str) {
        this.rie.setIndicatorDirection(str);
        return this;
    }

    public void bw() {
        removeCallbacks(this.dr);
        postDelayed(this.dr, this.dg);
    }

    public emc dg(boolean z10) throws Resources.NotFoundException {
        this.rie.setLoop(z10);
        if (this.qh != z10) {
            int iEmc = dg.emc(z10, this.ypw.getCurrentItem(), this.emc.size());
            this.qh = z10;
            C0099emc c0099emc = this.hxp;
            if (c0099emc != null) {
                c0099emc.xq();
                this.ypw.setCurrentItem(iEmc);
            }
        }
        return this;
    }

    public emc ypw(int i10) {
        this.bw = i10;
        return this;
    }

    public emc ypw(boolean z10) {
        this.cf = z10;
        return this;
    }

    public emc emc(float f10) {
        this.rie.setIndicatorWidth((int) f10);
        return this;
    }

    public emc xq(boolean z10) {
        this.sup = z10;
        return this;
    }

    public emc emc(int i10) {
        this.ylm = i10;
        return this;
    }

    public emc xq(String str) throws Resources.NotFoundException {
        this.ru = str;
        emc(str, this.uym, this.msw, this.zz, true);
        return this;
    }

    public emc emc(boolean z10) {
        this.sz = z10;
        bw();
        return this;
    }

    public void xq() throws Resources.NotFoundException {
        int i10;
        emc(this.ru, this.uym, this.msw, this.zz, true);
        if (this.hxp == null) {
            this.hxp = new C0099emc();
            this.ypw.emc((xq.dg) this);
            this.ypw.setAdapter(this.hxp);
        }
        int i11 = this.sba;
        if (i11 < 0 || i11 >= this.emc.size()) {
            this.sba = 0;
        }
        if (this.qh) {
            i10 = this.sba + 512;
        } else {
            i10 = this.sba;
        }
        this.ypw.emc(i10, true);
        if (!this.qh) {
            gbl(i10);
        }
        if (this.sz) {
            bw();
        }
    }

    public void emc(String str, int i10, int i11, int i12, boolean z10) throws Resources.NotFoundException {
        C0099emc c0099emc = this.hxp;
        if (c0099emc != null) {
            c0099emc.xq();
        }
        this.ypw.setPageMargin(i10);
        if (i11 > 0 || i12 > 0) {
            if (this.ylm == 1) {
                this.ypw.setPadding(0, i11 + i10, 0, i12 + i10);
            } else {
                this.ypw.setPadding(i11 + i10, 0, i12 + i10, 0);
            }
            this.sra.setClipChildren(false);
            this.ypw.setClipChildren(false);
            this.ypw.setClipToPadding(false);
        }
        if (this.ylm == 1) {
            com.bytedance.adsdk.ugeno.ycc.ypw.dg dgVar = new com.bytedance.adsdk.ugeno.ycc.ypw.dg();
            dgVar.emc(str);
            this.ypw.emc(true, (xq.bw) dgVar);
            this.ypw.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.ypw.emc(false, (xq.bw) new com.bytedance.adsdk.ugeno.ycc.ypw.xq());
        } else if (TextUtils.equals(str, "cube")) {
            this.ypw.emc(false, (xq.bw) new com.bytedance.adsdk.ugeno.ycc.ypw.emc());
        } else if (TextUtils.equals(str, "fade")) {
            this.ypw.emc(false, (xq.bw) new com.bytedance.adsdk.ugeno.ycc.ypw.ypw());
        } else {
            this.ypw.emc(false, (xq.bw) null);
        }
        this.ypw.setOffscreenPageLimit((int) this.gbl);
    }

    public void dg() throws Resources.NotFoundException {
        ycc();
        if (this.hxp != null) {
            this.ypw.ypw((xq.dg) this);
            this.ypw.setAdapter(null);
            this.hxp = null;
            this.ypw.removeAllViews();
            this.emc.clear();
            this.rie.xq();
        }
    }

    public View emc(int i10, int i11) {
        if (this.emc.size() == 0) {
            return new View(getContext());
        }
        View viewRu = ru(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewRu instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (uym()) {
            viewRu.setTag("two_items_tag");
        }
        if (viewRu.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewRu.getParent()).removeView(viewRu);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewRu, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (uym()) {
            frameLayout.setTag(Integer.valueOf(i10));
        }
        return frameLayout;
    }

    public emc<T> emc(T t10) {
        if (t10 != null) {
            this.emc.add(t10);
            if (this.sup) {
                this.rie.ypw();
            }
        }
        C0099emc c0099emc = this.hxp;
        if (c0099emc != null) {
            c0099emc.xq();
            this.rie.emc(this.sba, this.ypw.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.msw.xq.dg
    public void emc(int i10, float f10, int i11) {
        com.bytedance.adsdk.ugeno.ycc.xq xqVar = this.ee;
        if (xqVar != null) {
            boolean z10 = this.qh;
            xqVar.emc(z10, dg.emc(z10, i10, this.emc.size()), f10, i11);
        }
        if (uym()) {
            emc(i10, findViewWithTag(Integer.valueOf(i10)));
            if (f10 > 0.0f) {
                int i12 = i10 + 1;
                emc(i12, findViewWithTag(Integer.valueOf(i12)));
            }
        }
    }

    private void emc(int i10, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.emc.get(dg.emc(true, i10, this.emc.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.ypw.xq) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.ypw.xq) t10).gbl();
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (View) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
