package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f30916d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30917a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f30918b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30919c;

    public /* synthetic */ z() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((y4.a) ((km.i) this.f30919c).f28426b).getClass();
        if (keyListener instanceof y4.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new y4.f(keyListener);
    }

    public void b(AttributeSet attributeSet, int i4) {
        switch (this.f30917a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f30918b;
                i0.f fVarJ = i0.f.J(absSeekBar.getContext(), attributeSet, f30916d, i4);
                Drawable drawableB = fVarJ.B(0);
                if (drawableB != null) {
                    if (drawableB instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableB;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i10 = 0; i10 < numberOfFrames; i10++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i10), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i10));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableB = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableB);
                }
                Drawable drawableB2 = fVarJ.B(1);
                if (drawableB2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableB2, false));
                }
                fVarJ.M();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f30918b).getContext().obtainStyledAttributes(attributeSet, h.a.f24783i, i4, 0);
                try {
                    boolean z3 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    d(z3);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public y4.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        km.i iVar = (km.i) this.f30919c;
        if (inputConnection == null) {
            iVar.getClass();
            inputConnection = null;
        } else {
            y4.a aVar = (y4.a) iVar.f28426b;
            aVar.getClass();
            if (!(inputConnection instanceof y4.c)) {
                inputConnection = new y4.c((EditText) aVar.f37323a, inputConnection, editorInfo);
            }
        }
        return (y4.c) inputConnection;
    }

    public void d(boolean z3) {
        y4.j jVar = (y4.j) ((y4.a) ((km.i) this.f30919c).f28426b).f37324b;
        if (jVar.f37343c != z3) {
            if (jVar.f37342b != null) {
                w4.i iVarA = w4.i.a();
                y4.i iVar = jVar.f37342b;
                iVarA.getClass();
                pk.a.e(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = iVarA.f36432a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    iVarA.f36433b.remove(iVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f37343c = z3;
            if (z3) {
                y4.j.a(jVar.f37341a, w4.i.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z3) {
        if (drawable instanceof w3.a) {
            ((w3.b) ((w3.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id2 = layerDrawable.getId(i4);
                    drawableArr[i4] = e(layerDrawable.getDrawable(i4), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    layerDrawable2.setId(i10, layerDrawable.getId(i10));
                    layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                    layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                    layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                    layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                    layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                    layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                    layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                    layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                    layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f30919c) == null) {
                    this.f30919c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public z(AbsSeekBar absSeekBar) {
        this.f30918b = absSeekBar;
    }

    public z(EditText editText) {
        this.f30918b = editText;
        this.f30919c = new km.i(editText);
    }
}
