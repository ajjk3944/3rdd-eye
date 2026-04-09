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

/* loaded from: classes.dex */
public class w {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20206d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20207a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f20208b;

    /* renamed from: c, reason: collision with root package name */
    public Object f20209c;

    public /* synthetic */ w() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((io.sentry.t) ((h7.h0) this.f20209c).f10078a).getClass();
        if (keyListener instanceof l4.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new l4.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i10) {
        switch (this.f20207a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f20208b;
                io.sentry.k kVarH0 = io.sentry.k.h0(absSeekBar.getContext(), attributeSet, f20206d, i10);
                Drawable drawableV = kVarH0.V(0);
                if (drawableV != null) {
                    if (drawableV instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableV;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i11), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableV = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableV);
                }
                Drawable drawableV2 = kVarH0.V(1);
                if (drawableV2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableV2, false));
                }
                kVarH0.l0();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f20208b).getContext().obtainStyledAttributes(attributeSet, h.j.AppCompatTextView, i10, 0);
                try {
                    boolean z10 = typedArrayObtainStyledAttributes.hasValue(h.j.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(h.j.AppCompatTextView_emojiCompatEnabled, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    d(z10);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public l4.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        h7.h0 h0Var = (h7.h0) this.f20209c;
        if (inputConnection == null) {
            h0Var.getClass();
            inputConnection = null;
        } else {
            io.sentry.t tVar = (io.sentry.t) h0Var.f10078a;
            tVar.getClass();
            if (!(inputConnection instanceof l4.b)) {
                inputConnection = new l4.b((EditText) tVar.f12736a, inputConnection, editorInfo);
            }
        }
        return (l4.b) inputConnection;
    }

    public void d(boolean z10) {
        l4.i iVar = (l4.i) ((io.sentry.t) ((h7.h0) this.f20209c).f10078a).f12737d;
        if (iVar.f14674g != z10) {
            if (iVar.f14673d != null) {
                j4.h hVarA = j4.h.a();
                l4.h hVar = iVar.f14673d;
                hVarA.getClass();
                se.b.m(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = hVarA.f13208a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    hVarA.f13209b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f14674g = z10;
            if (z10) {
                l4.i.a(iVar.f14672a, j4.h.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z10) {
        if (drawable instanceof l3.a) {
            ((l3.b) ((l3.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = e(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
                    layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
                    layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
                    layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
                    layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
                    layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
                    layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
                    layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
                    layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f20209c) == null) {
                    this.f20209c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public w(AbsSeekBar absSeekBar) {
        this.f20208b = absSeekBar;
    }

    public w(EditText editText) {
        this.f20208b = editText;
        h7.h0 h0Var = new h7.h0();
        io.sentry.t tVar = new io.sentry.t();
        tVar.f12736a = editText;
        l4.i iVar = new l4.i(editText);
        tVar.f12737d = iVar;
        editText.addTextChangedListener(iVar);
        if (l4.a.f14657b == null) {
            synchronized (l4.a.f14656a) {
                try {
                    if (l4.a.f14657b == null) {
                        l4.a aVar = new l4.a();
                        try {
                            l4.a.f14658c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, l4.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        l4.a.f14657b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(l4.a.f14657b);
        h0Var.f10078a = tVar;
        this.f20209c = h0Var;
    }
}
