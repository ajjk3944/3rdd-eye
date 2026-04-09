package o;

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
import g.AbstractC2327a;
import h0.C2351a;
import h0.C2352b;
import h0.C2354d;
import h0.C2357g;
import h0.C2360j;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2748y {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22654d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22655a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f22656b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22657c;

    public /* synthetic */ C2748y() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C2351a) ((C2352b) this.f22657c).f20444b).getClass();
        if (keyListener instanceof C2357g) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C2357g(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f22655a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f22656b;
                a1 a1VarI = a1.i(absSeekBar.getContext(), attributeSet, f22654d, i);
                Drawable drawableE = a1VarI.e(0);
                if (drawableE != null) {
                    if (drawableE instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableE;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable drawableE2 = e(animationDrawable.getFrame(i3), true);
                            drawableE2.setLevel(10000);
                            animationDrawable2.addFrame(drawableE2, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableE = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableE);
                }
                Drawable drawableE3 = a1VarI.e(1);
                if (drawableE3 != null) {
                    absSeekBar.setProgressDrawable(e(drawableE3, false));
                }
                a1VarI.j();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f22656b).getContext().obtainStyledAttributes(attributeSet, AbstractC2327a.i, i, 0);
                try {
                    boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C2354d c(InputConnection inputConnection, EditorInfo editorInfo) {
        C2352b c2352b = (C2352b) this.f22657c;
        if (inputConnection == null) {
            c2352b.getClass();
            inputConnection = null;
        } else {
            C2351a c2351a = (C2351a) c2352b.f20444b;
            c2351a.getClass();
            if (!(inputConnection instanceof C2354d)) {
                inputConnection = new C2354d((EditText) c2351a.f20441b, inputConnection, editorInfo);
            }
        }
        return (C2354d) inputConnection;
    }

    public void d(boolean z6) {
        h0.k kVar = (h0.k) ((C2351a) ((C2352b) this.f22657c).f20444b).f20442c;
        if (kVar.f20464c != z6) {
            if (kVar.f20463b != null) {
                f0.j jVarA = f0.j.a();
                C2360j c2360j = kVar.f20463b;
                jVarA.getClass();
                a4.t.e(c2360j, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f19989a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f19990b.remove(c2360j);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kVar.f20464c = z6;
            if (z6) {
                h0.k.a(kVar.f20462a, f0.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z6) {
        if (drawable instanceof K.c) {
            ((K.d) ((K.c) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i3 = 0; i3 < numberOfLayers; i3++) {
                    layerDrawable2.setId(i3, layerDrawable.getId(i3));
                    layerDrawable2.setLayerGravity(i3, layerDrawable.getLayerGravity(i3));
                    layerDrawable2.setLayerWidth(i3, layerDrawable.getLayerWidth(i3));
                    layerDrawable2.setLayerHeight(i3, layerDrawable.getLayerHeight(i3));
                    layerDrawable2.setLayerInsetLeft(i3, layerDrawable.getLayerInsetLeft(i3));
                    layerDrawable2.setLayerInsetRight(i3, layerDrawable.getLayerInsetRight(i3));
                    layerDrawable2.setLayerInsetTop(i3, layerDrawable.getLayerInsetTop(i3));
                    layerDrawable2.setLayerInsetBottom(i3, layerDrawable.getLayerInsetBottom(i3));
                    layerDrawable2.setLayerInsetStart(i3, layerDrawable.getLayerInsetStart(i3));
                    layerDrawable2.setLayerInsetEnd(i3, layerDrawable.getLayerInsetEnd(i3));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f22657c) == null) {
                    this.f22657c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C2748y(AbsSeekBar absSeekBar) {
        this.f22656b = absSeekBar;
    }

    public C2748y(EditText editText) {
        this.f22656b = editText;
        this.f22657c = new C2352b(editText);
    }
}
