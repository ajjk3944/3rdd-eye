package com.mbridge.msdk.video.dynview.shape;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes3.dex */
public class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f18796a;

    /* renamed from: b, reason: collision with root package name */
    private float f18797b;

    /* renamed from: c, reason: collision with root package name */
    private float f18798c;

    /* renamed from: d, reason: collision with root package name */
    private int f18799d;

    /* renamed from: e, reason: collision with root package name */
    private int f18800e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f18801f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f18802g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f18803h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f18804i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f18805j;

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f18806a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f18807b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f18808c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f18809d;

        /* renamed from: e, reason: collision with root package name */
        private int f18810e;

        /* renamed from: f, reason: collision with root package name */
        private int f18811f;

        /* renamed from: g, reason: collision with root package name */
        private int f18812g;

        /* renamed from: h, reason: collision with root package name */
        private float f18813h;

        /* renamed from: i, reason: collision with root package name */
        private float f18814i;

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public a build() {
            return new a(this);
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c orientation(int i10) {
            this.f18810e = i10;
            return this;
        }

        private b() {
            this.f18811f = 100;
            this.f18812g = 10;
            this.f18806a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(Bitmap bitmap) {
            this.f18808c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c b(Bitmap bitmap) {
            this.f18807b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(boolean z10) {
            this.f18809d = z10;
            return this;
        }

        public c b(float f10) {
            this.f18813h = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(float f10) {
            this.f18814i = f10;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.shape.a.c
        public c a(int i10) {
            this.f18812g = i10;
            return this;
        }
    }

    public interface c {
        c a(float f10);

        c a(int i10);

        c a(Bitmap bitmap);

        c a(boolean z10);

        c b(Bitmap bitmap);

        a build();

        c orientation(int i10);
    }

    private void a(Canvas canvas) {
        float f10 = this.f18797b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f18798c);
        path.lineTo((f10 - this.f18799d) - this.f18800e, this.f18798c);
        path.lineTo((this.f18799d + f10) - this.f18800e, 0.0f);
        if (this.f18803h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f18801f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f18801f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f18799d + f10 + this.f18800e, 0.0f);
        path2.lineTo(this.f18797b, 0.0f);
        path2.lineTo(this.f18797b, this.f18798c);
        path2.lineTo((f10 - this.f18799d) + this.f18800e, this.f18798c);
        if (this.f18803h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f18802g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f18802g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f10 = this.f18798c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f18799d + f10) - this.f18800e);
        path.lineTo(this.f18797b, (f10 - this.f18799d) - this.f18800e);
        path.lineTo(this.f18797b, 0.0f);
        if (this.f18803h) {
            try {
                a(canvas, path);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f18801f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f18801f);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f18799d + f10 + this.f18800e);
        path2.lineTo(0.0f, this.f18798c);
        path2.lineTo(this.f18797b, this.f18798c);
        path2.lineTo(this.f18797b, (f10 - this.f18799d) + this.f18800e);
        if (this.f18803h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f18802g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f18802g);
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18796a == 1) {
            b(canvas);
        } else {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private a(b bVar) {
        super(bVar.f18806a);
        this.f18803h = false;
        this.f18801f = bVar.f18807b;
        this.f18802g = bVar.f18808c;
        this.f18803h = bVar.f18809d;
        this.f18796a = bVar.f18810e;
        this.f18799d = bVar.f18811f;
        this.f18800e = bVar.f18812g;
        this.f18797b = bVar.f18813h;
        this.f18798c = bVar.f18814i;
        Paint paint = new Paint();
        this.f18804i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f18804i.setAntiAlias(true);
        this.f18805j = new Matrix();
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float fMax = Math.max(this.f18797b / bitmap.getWidth(), this.f18798c / bitmap.getHeight());
            if (this.f18805j == null) {
                this.f18805j = new Matrix();
            }
            this.f18805j.reset();
            this.f18805j.preScale(fMax, fMax);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f18805j);
        this.f18804i.setShader(bitmapShader);
        canvas.drawPath(path, this.f18804i);
    }

    private void a(Canvas canvas, Path path) {
        this.f18804i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f18804i);
    }

    public static b a() {
        return new b();
    }
}
