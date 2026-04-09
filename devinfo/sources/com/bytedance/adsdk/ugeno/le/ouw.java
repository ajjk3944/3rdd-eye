package com.bytedance.adsdk.ugeno.le;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.applovin.shadow.okio.Segment;
import com.bytedance.adsdk.ugeno.pno.lh;
import com.facebook.ads.AdError;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw<T> extends FrameLayout implements lh.yu {
    private static final Interpolator jae = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.le.ouw.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    public com.bytedance.adsdk.ugeno.le.ouw.ouw bly;

    /* renamed from: cd, reason: collision with root package name */
    private final Runnable f6894cd;

    /* renamed from: cf, reason: collision with root package name */
    private int f6895cf;
    private C0031ouw ex;
    public boolean fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f6896jg;
    private FrameLayout jqy;
    private int ko;
    private Scroller ksc;

    /* renamed from: le, reason: collision with root package name */
    public boolean f6897le;

    /* renamed from: lh, reason: collision with root package name */
    public float f6898lh;
    private int mwh;

    /* renamed from: od, reason: collision with root package name */
    private final Runnable f6899od;
    protected List<T> ouw;
    public int pno;
    private int qbp;
    protected com.bytedance.adsdk.ugeno.pno.lh ra;
    private String rn;
    private int ryl;
    private com.bytedance.adsdk.ugeno.le.lh tc;

    /* renamed from: th, reason: collision with root package name */
    private boolean f6900th;
    protected Context tlj;
    private boolean vm;
    private int vpp;
    public int vt;
    public boolean yu;
    private boolean zih;
    private int zin;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class lh extends com.bytedance.adsdk.ugeno.pno.lh {
        public lh(Context context) {
            super(context);
        }

        private MotionEvent ouw(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.lh, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
            if (!ouw.this.fkw) {
                return false;
            }
            try {
                if (ouw.this.pno != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(ouw(motionEvent));
                ouw(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.pno.lh, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ouw.this.fkw) {
                return false;
            }
            try {
                return ouw.this.pno == 1 ? super.onTouchEvent(ouw(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.le.ouw$ouw, reason: collision with other inner class name */
    public class C0031ouw extends com.bytedance.adsdk.ugeno.pno.vt {
        public C0031ouw() {
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final int lh() {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final boolean ouw(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final float vt() {
            if (ouw.this.f6898lh <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / ouw.this.f6898lh;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final int ouw() {
            return ouw.this.vm ? Segment.SHARE_MINIMUM : ouw.this.ouw.size();
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final Object ouw(ViewGroup viewGroup, int i4) {
            View viewOuw = ouw.this.ouw(i4, yu.ouw(ouw.this.vm, i4, ouw.this.ouw.size()));
            viewGroup.addView(viewOuw);
            return viewOuw;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.vt
        public final void ouw(ViewGroup viewGroup, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class vt extends Scroller {
        public vt(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public final void startScroll(int i4, int i10, int i11, int i12, int i13) {
            super.startScroll(i4, i10, i11, i12, ouw.this.ryl);
        }

        @Override // android.widget.Scroller
        public final void startScroll(int i4, int i10, int i11, int i12) {
            super.startScroll(i4, i10, i11, i12, ouw.this.ryl);
        }
    }

    public ouw(Context context) {
        super(context);
        this.ouw = new CopyOnWriteArrayList();
        this.f6895cf = AdError.SERVER_ERROR_CODE;
        this.vt = 500;
        this.ryl = 500;
        this.mwh = 0;
        this.f6896jg = -1;
        this.ko = -1;
        this.rn = "normal";
        this.f6898lh = 1.0f;
        this.yu = true;
        this.zih = true;
        this.vm = true;
        this.fkw = true;
        this.qbp = 0;
        this.zin = 0;
        this.vpp = 0;
        this.pno = 0;
        this.f6899od = new Runnable() { // from class: com.bytedance.adsdk.ugeno.le.ouw.2
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                int currentItem = ouw.this.ra.getCurrentItem() + 1;
                if (ouw.this.vm) {
                    if (currentItem >= 1024) {
                        ouw.this.ra.ouw(512, false);
                        return;
                    } else {
                        ouw.this.ra.ouw(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.pno.vt adapter = ouw.this.ra.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.ouw()) {
                        ouw.this.ra.ouw(0, false);
                    } else {
                        ouw.this.ra.ouw(currentItem, true);
                    }
                }
            }
        };
        this.f6894cd = new Runnable() { // from class: com.bytedance.adsdk.ugeno.le.ouw.3
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                if (ouw.this.zih) {
                    int currentItem = ouw.this.ra.getCurrentItem() + 1;
                    if (ouw.this.vm) {
                        if (currentItem >= 1024) {
                            ouw.this.ra.ouw(512, false);
                        } else {
                            ouw.this.ra.ouw(currentItem, true);
                        }
                        ouw ouwVar = ouw.this;
                        ouwVar.postDelayed(ouwVar.f6894cd, ouw.this.f6895cf);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.pno.vt adapter = ouw.this.ra.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.ouw()) {
                            ouw.this.ra.ouw(0, false);
                            ouw ouwVar2 = ouw.this;
                            ouwVar2.postDelayed(ouwVar2.f6894cd, ouw.this.f6895cf);
                        } else {
                            ouw.this.ra.ouw(currentItem, true);
                            ouw ouwVar3 = ouw.this;
                            ouwVar3.postDelayed(ouwVar3.f6894cd, ouw.this.f6895cf);
                        }
                    }
                }
            }
        };
        this.tlj = context;
        this.jqy = new FrameLayout(context);
        this.ra = new lh(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.jqy.addView(this.ra, layoutParams);
        addView(this.jqy);
    }

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void bly(int i4) {
        int i10;
        if (this.tc != null) {
            int iOuw = yu.ouw(this.vm, i4, this.ouw.size());
            i10 = i4;
            this.tc.ouw(this.vm, iOuw, i10, iOuw == 0, iOuw == this.ouw.size() - 1);
        } else {
            i10 = i4;
        }
        if (this.yu) {
            this.bly.ouw(i10);
        }
    }

    public final void cf(int i4) throws Resources.NotFoundException {
        ouw(this.rn, this.mwh, this.f6896jg, this.ko);
        if (this.ex == null) {
            this.ex = new C0031ouw();
            this.ra.ouw((lh.yu) this);
            this.ra.setAdapter(this.ex);
        }
        if (this.vm) {
            if (i4 >= 1024) {
                this.ra.ouw(512, false);
                return;
            } else {
                this.ra.ouw(i4, true);
                return;
            }
        }
        if (i4 < 0 || i4 >= this.ouw.size()) {
            return;
        }
        this.ra.ouw(i4, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.zih) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.f6897le) {
                    lh();
                }
            } else if (action == 0) {
                yu();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.pno.vt getAdapter() {
        return this.ra.getAdapter();
    }

    public int getCurrentItem() {
        return this.ra.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.pno.lh getViewPager() {
        return this.ra;
    }

    public abstract View pno(int i4);

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.le.lh lhVar) {
        this.tc = lhVar;
    }

    public void setTwoItems(boolean z3) {
        this.f6900th = z3;
    }

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void tlj(int i4) {
        if (i4 == 1 && this.f6897le) {
            yu();
        }
        com.bytedance.adsdk.ugeno.le.lh lhVar = this.tc;
        if (lhVar != null) {
            lhVar.ouw(this.vm, i4);
        }
    }

    public final ouw fkw(int i4) throws Resources.NotFoundException {
        this.mwh = i4;
        ouw(this.rn, i4, this.f6896jg, this.ko);
        return this;
    }

    public final ouw<T> le(int i4) throws Resources.NotFoundException {
        this.f6896jg = i4;
        ouw(this.rn, this.mwh, i4, this.ko);
        return this;
    }

    public final ouw lh(int i4) {
        this.bly.setSelectedColor(i4);
        return this;
    }

    public final ouw ouw(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.bly = new com.bytedance.adsdk.ugeno.le.ouw.lh(this.tlj);
        } else {
            this.bly = new com.bytedance.adsdk.ugeno.le.ouw.vt(this.tlj);
        }
        addView(this.bly, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public final ouw ra(int i4) throws Resources.NotFoundException {
        this.ko = i4;
        ouw(this.rn, this.mwh, this.f6896jg, i4);
        return this;
    }

    public final ouw vt(int i4) {
        this.f6895cf = i4;
        lh();
        return this;
    }

    public final ouw yu(int i4) {
        this.bly.setUnSelectedColor(i4);
        return this;
    }

    public final void lh() {
        removeCallbacks(this.f6894cd);
        postDelayed(this.f6894cd, this.f6895cf);
    }

    public final void yu() {
        removeCallbacks(this.f6894cd);
    }

    private boolean fkw() {
        return this.ouw.size() <= 2 && this.vm;
    }

    public final ouw vt(boolean z3) throws Resources.NotFoundException {
        this.bly.setLoop(z3);
        if (this.vm != z3) {
            int iOuw = yu.ouw(z3, this.ra.getCurrentItem(), this.ouw.size());
            this.vm = z3;
            C0031ouw c0031ouw = this.ex;
            if (c0031ouw != null) {
                c0031ouw.fkw();
                this.ra.setCurrentItem(iOuw);
            }
        }
        return this;
    }

    public final ouw ouw(boolean z3) {
        this.zih = z3;
        lh();
        return this;
    }

    public final ouw ouw(int i4) {
        this.ryl = i4;
        if (this.ksc == null) {
            this.ksc = new vt(this.tlj, jae);
        }
        this.ra.setScroller(this.ksc);
        return this;
    }

    public final ouw vt(String str) throws Resources.NotFoundException {
        this.rn = str;
        ouw(str, this.mwh, this.f6896jg, this.ko);
        return this;
    }

    private void ouw(String str, int i4, int i10, int i11) throws Resources.NotFoundException {
        C0031ouw c0031ouw = this.ex;
        if (c0031ouw != null) {
            c0031ouw.fkw();
        }
        this.ra.setPageMargin(i4);
        if (i10 > 0 || i11 > 0) {
            if (this.pno == 1) {
                this.ra.setPadding(0, i10 + i4, 0, i11 + i4);
            } else {
                this.ra.setPadding(i10 + i4, 0, i11 + i4, 0);
            }
            this.jqy.setClipChildren(false);
            this.ra.setClipChildren(false);
            this.ra.setClipToPadding(false);
        }
        if (this.pno == 1) {
            com.bytedance.adsdk.ugeno.le.vt.yu yuVar = new com.bytedance.adsdk.ugeno.le.vt.yu();
            yuVar.ouw = str;
            this.ra.ouw(true, (lh.fkw) yuVar);
            this.ra.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.ra.ouw(false, (lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.lh());
        } else if (TextUtils.equals(str, "cube")) {
            this.ra.ouw(false, (lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.ouw());
        } else if (TextUtils.equals(str, "fade")) {
            this.ra.ouw(false, (lh.fkw) new com.bytedance.adsdk.ugeno.le.vt.vt());
        } else {
            this.ra.ouw(false, (lh.fkw) null);
        }
        this.ra.setOffscreenPageLimit((int) this.f6898lh);
    }

    public final void vt() throws Resources.NotFoundException {
        yu();
        if (this.ex != null) {
            List<lh.yu> list = this.ra.fkw;
            if (list != null) {
                list.remove(this);
            }
            this.ra.setAdapter(null);
            this.ex = null;
            this.ra.removeAllViews();
            this.ouw.clear();
            com.bytedance.adsdk.ugeno.le.ouw.ouw ouwVar = this.bly;
            ouwVar.ouw.clear();
            ouwVar.removeAllViews();
        }
    }

    public final void ouw() throws Resources.NotFoundException {
        int i4;
        ouw(this.rn, this.mwh, this.f6896jg, this.ko);
        if (this.ex == null) {
            this.ex = new C0031ouw();
            this.ra.ouw((lh.yu) this);
            this.ra.setAdapter(this.ex);
        }
        int i10 = this.qbp;
        if (i10 < 0 || i10 >= this.ouw.size()) {
            this.qbp = 0;
        }
        if (this.vm) {
            i4 = this.qbp + 512;
        } else {
            i4 = this.qbp;
        }
        this.ra.ouw(i4, true);
        if (!this.vm) {
            bly(i4);
        }
        if (this.zih) {
            lh();
        }
    }

    public final View ouw(int i4, int i10) {
        if (this.ouw.size() == 0) {
            return new View(getContext());
        }
        View viewPno = pno(i10);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewPno instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (fkw()) {
            viewPno.setTag("two_items_tag");
        }
        if (viewPno.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewPno.getParent()).removeView(viewPno);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewPno, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (fkw()) {
            frameLayout.setTag(Integer.valueOf(i4));
        }
        return frameLayout;
    }

    public final ouw<T> ouw(T t10) {
        if (t10 != null) {
            this.ouw.add(t10);
            if (this.yu) {
                this.bly.ouw();
            }
        }
        C0031ouw c0031ouw = this.ex;
        if (c0031ouw != null) {
            c0031ouw.fkw();
            com.bytedance.adsdk.ugeno.le.ouw.ouw ouwVar = this.bly;
            int i4 = this.qbp;
            int currentItem = this.ra.getCurrentItem();
            Iterator<View> it = ouwVar.ouw.iterator();
            while (it.hasNext()) {
                it.next().setBackground(ouwVar.vt(ouwVar.f6903lh));
            }
            if (i4 < 0 || i4 >= ouwVar.ouw.size()) {
                i4 = 0;
            }
            if (ouwVar.ouw.size() > 0) {
                ouwVar.ouw.get(i4).setBackground(ouwVar.vt(ouwVar.vt));
                ouwVar.ra = currentItem;
            }
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.pno.lh.yu
    public final void ouw(int i4, float f10, int i10) {
        com.bytedance.adsdk.ugeno.le.lh lhVar = this.tc;
        if (lhVar != null) {
            boolean z3 = this.vm;
            lhVar.ouw(z3, yu.ouw(z3, i4, this.ouw.size()), f10, i10);
        }
        if (fkw()) {
            ouw(i4, findViewWithTag(Integer.valueOf(i4)));
            if (f10 > 0.0f) {
                int i11 = i4 + 1;
                ouw(i11, findViewWithTag(Integer.valueOf(i11)));
            }
        }
    }

    private void ouw(int i4, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.ouw.get(yu.ouw(true, i4, this.ouw.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.vt.lh) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.vt.lh) t10).fkw;
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (T) t10;
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
