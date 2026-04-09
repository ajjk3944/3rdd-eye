package androidx.compose.ui.platform;

import a1.k;
import a8.f;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import androidx.lifecycle.v;
import b1.e;
import br.w;
import c1.a;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.y3;
import e2.m;
import g1.d;
import g1.q;
import h2.b0;
import h2.i0;
import i4.b;
import io.sentry.u4;
import j4.o;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import l2.c;
import lf.t1;
import n0.b2;
import n0.d0;
import n0.d2;
import n0.t0;
import n0.x0;
import oh.p;
import org.xmlpull.v1.XmlPullParserException;
import p.l2;
import pb.l0;
import pq.h;
import u.t;
import u.z;
import u3.j0;
import v1.l;
import v1.u;
import v1.y;
import x1.f0;
import x1.h0;
import x1.k1;
import x1.l1;
import x1.n1;
import x1.q1;
import x1.s;
import x1.s1;
import x1.z0;
import y1.a0;
import y1.a2;
import y1.c0;
import y1.e0;
import y1.g;
import y1.h1;
import y1.i;
import y1.j;
import y1.n;
import y1.q0;
import y1.r;
import y1.r0;
import y1.r1;
import y1.s0;
import y1.u0;
import y1.v0;
import y1.v1;
import y1.w0;
import y1.x;
import y1.x1;
import y1.y1;
import y1.z1;

@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u0005:\u0003£\u0002\u0016J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R+\u0010,\u001a\u00020$2\u0006\u0010%\u001a\u00020$8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u0010;\u001a\u0002032\u0006\u00104\u001a\u0002038\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010U\u001a\u00020N8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010T\u001a\u0004\bQ\u0010RR \u0010[\u001a\b\u0012\u0004\u0012\u00020N0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010a\u001a\u00020\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010g\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010m\u001a\u00020h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\"\u0010u\u001a\u00020n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u001a\u0010{\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001c\u0010\u0081\u0001\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R5\u0010\u008e\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u000e0\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0005\b\u008d\u0001\u0010\u0019R\"\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u009a\u0001\u001a\u00030\u0095\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R \u0010 \u0001\u001a\u00030\u009b\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¦\u0001\u001a\u00030¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R1\u0010¯\u0001\u001a\u00030§\u00018V@\u0016X\u0096\u000e¢\u0006\u001f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\b®\u0001\u0010T\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R.\u0010µ\u0001\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b°\u0001\u0010O\u0012\u0005\b´\u0001\u0010T\u001a\u0006\b±\u0001\u0010²\u0001\"\u0005\b³\u0001\u0010\u0010R5\u0010»\u0001\u001a\u0004\u0018\u00010\u00162\b\u0010%\u001a\u0004\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b¶\u0001\u0010'\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\"\u0010¿\u0001\u001a\u0004\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¸\u0001R'\u0010Æ\u0001\u001a\u00030À\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÁ\u0001\u0010Â\u0001\u0012\u0005\bÅ\u0001\u0010T\u001a\u0006\bÃ\u0001\u0010Ä\u0001R \u0010Ì\u0001\u001a\u00030Ç\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010Ó\u0001\u001a\u00030Í\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bÎ\u0001\u0010Ï\u0001\u0012\u0005\bÒ\u0001\u0010T\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R3\u0010Ú\u0001\u001a\u00030Ô\u00012\u0007\u0010%\u001a\u00030Ô\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÕ\u0001\u0010'\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R3\u0010á\u0001\u001a\u00030Û\u00012\u0007\u0010%\u001a\u00030Û\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bÜ\u0001\u0010'\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R \u0010ç\u0001\u001a\u00030â\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R \u0010í\u0001\u001a\u00030è\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001R \u0010ó\u0001\u001a\u00030î\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001R \u0010ù\u0001\u001a\u00030ô\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bõ\u0001\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001R\u0017\u0010ü\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0018\u0010\u0080\u0002\u001a\u00030ý\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0005\b\u0085\u0002\u0010\u0014R\u001a\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u0086\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R\u001a\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008a\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\u0091\u0002\u001a\u00030\u008e\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0017\u0010\u0093\u0002\u001a\u00020\f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010²\u0001R\u0018\u0010\u0095\u0002\u001a\u00030§\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010«\u0001R\u0018\u0010\u0099\u0002\u001a\u00030\u0096\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009a\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0018\u0010\u009f\u0002\u001a\u00030§\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010«\u0001R\u0019\u0010¢\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002¨\u0006¤\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lx1/k1;", "", "getImportantForAutofill", "()I", "Lf1/c;", "getEmbeddedViewFocusRect", "()Lf1/c;", "", "intervalMillis", "Llq/b0;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lx1/r1;", "handler", "setUncaughtExceptionHandler", "(Lx1/r1;)V", "Lkotlin/Function1;", "Ly1/m;", "callback", "setOnViewTreeOwnersAvailable", "(Lar/k;)V", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Lx1/h0;", "g", "Lx1/h0;", "getSharedDrawScope", "()Lx1/h0;", "sharedDrawScope", "Lt2/c;", "<set-?>", "r", "Ln0/x0;", "getDensity", "()Lt2/c;", "setDensity", "(Lt2/c;)V", "density", "Le1/g;", "B", "Le1/g;", "getFocusOwner", "()Le1/g;", "focusOwner", "Lpq/h;", "value", "D", "Lpq/h;", "getCoroutineContext", "()Lpq/h;", "setCoroutineContext", "(Lpq/h;)V", "coroutineContext", "Lc1/a;", "E", "Lc1/a;", "getDragAndDropManager", "()Lc1/a;", "dragAndDropManager", "Ly1/x1;", "H", "Ly1/x1;", "getViewConfiguration", "()Ly1/x1;", "viewConfiguration", "Lv1/l;", "I", "Lv1/l;", "getInsetsListener", "()Lv1/l;", "insetsListener", "Lx1/f0;", "J", "Lx1/f0;", "getRoot", "()Lx1/f0;", "getRoot$annotations", "()V", "root", "Lu/t;", "K", "Lu/t;", "getLayoutNodes", "()Lu/t;", "layoutNodes", "Lf2/a;", "L", "Lf2/a;", "getRectManager", "()Lf2/a;", "rectManager", "Lx1/s1;", "M", "Lx1/s1;", "getRootForTest", "()Lx1/s1;", "rootForTest", "Le2/m;", "N", "Le2/m;", "getSemanticsOwner", "()Le2/m;", "semanticsOwner", "Lb1/e;", "P", "Lb1/e;", "getContentCaptureManager$ui_release", "()Lb1/e;", "setContentCaptureManager$ui_release", "(Lb1/e;)V", "contentCaptureManager", "Ly1/g;", "Q", "Ly1/g;", "getAccessibilityManager", "()Ly1/g;", "accessibilityManager", "Lg1/w;", "R", "Lg1/w;", "getGraphicsContext", "()Lg1/w;", "graphicsContext", "La1/k;", "S", "La1/k;", "getAutofillTree", "()La1/k;", "autofillTree", "Landroid/content/res/Configuration;", "b0", "Lar/k;", "getConfigurationChangeObserver", "()Lar/k;", "setConfigurationChangeObserver", "configurationChangeObserver", "La1/c;", "d0", "La1/c;", "get_autofillManager$ui_release", "()La1/c;", "_autofillManager", "Ly1/i;", "f0", "Ly1/i;", "getClipboardManager", "()Ly1/i;", "clipboardManager", "Ly1/h;", "g0", "Ly1/h;", "getClipboard", "()Ly1/h;", "clipboard", "Lx1/n1;", "h0", "Lx1/n1;", "getSnapshotObserver", "()Lx1/n1;", "snapshotObserver", "", "i0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "r0", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "u0", "get_viewTreeOwners", "()Ly1/m;", "set_viewTreeOwners", "(Ly1/m;)V", "_viewTreeOwners", "v0", "Ln0/g2;", "getViewTreeOwners", "viewTreeOwners", "Ll2/c;", "B0", "Ll2/c;", "getTextInputService", "()Ll2/c;", "getTextInputService$annotations", "textInputService", "Ly1/r1;", "D0", "Ly1/r1;", "getSoftwareKeyboardController", "()Ly1/r1;", "softwareKeyboardController", "Lk2/f;", "E0", "Lk2/f;", "getFontLoader", "()Lk2/f;", "getFontLoader$annotations", "fontLoader", "Lk2/g;", "F0", "getFontFamilyResolver", "()Lk2/g;", "setFontFamilyResolver", "(Lk2/g;)V", "fontFamilyResolver", "Lt2/i;", "H0", "getLayoutDirection", "()Lt2/i;", "setLayoutDirection", "(Lt2/i;)V", "layoutDirection", "Lo1/a;", "I0", "Lo1/a;", "getHapticFeedBack", "()Lo1/a;", "hapticFeedBack", "Lw1/b;", "K0", "Lw1/b;", "getModifierLocalManager", "()Lw1/b;", "modifierLocalManager", "Ly1/s1;", "L0", "Ly1/s1;", "getTextToolbar", "()Ly1/s1;", "textToolbar", "Lr1/i;", "a1", "Lr1/i;", "getPointerIconService", "()Lr1/i;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Ly1/z1;", "getWindowInfo", "()Ly1/z1;", "windowInfo", "uncaughtExceptionHandler", "Lx1/r1;", "getUncaughtExceptionHandler$ui_release", "()Lx1/r1;", "setUncaughtExceptionHandler$ui_release", "La1/f;", "getAutofill", "()La1/f;", "autofill", "La1/j;", "getAutofillManager", "()La1/j;", "autofillManager", "Ly1/r0;", "getAndroidViewsHandler$ui_release", "()Ly1/r0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lv1/u;", "getPlacementScope", "()Lv1/u;", "placementScope", "Lp1/b;", "getInputModeManager", "()Lp1/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "getOutOfFrameExecutor", "()Landroidx/compose/ui/platform/AndroidComposeView;", "outOfFrameExecutor", "y1/e0", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, s1, DefaultLifecycleObserver, k1 {

    /* renamed from: b1, reason: collision with root package name */
    public static Class f1151b1;

    /* renamed from: c1, reason: collision with root package name */
    public static Method f1152c1;

    /* renamed from: d1, reason: collision with root package name */
    public static Method f1153d1;

    /* renamed from: e1, reason: collision with root package name */
    public static final z f1154e1 = new z();

    /* renamed from: f1, reason: collision with root package name */
    public static u4 f1155f1;
    public final b A0;
    public final f B;

    /* renamed from: B0, reason: from kotlin metadata */
    public final c textInputService;
    public final AtomicReference C0;

    /* renamed from: D, reason: from kotlin metadata */
    public h coroutineContext;
    public final v1 D0;

    /* renamed from: E, reason: from kotlin metadata */
    public final a dragAndDropManager;
    public final v1 E0;
    public final p F;

    /* renamed from: F0, reason: from kotlin metadata */
    public final x0 fontFamilyResolver;
    public final q G;
    public int G0;
    public final q0 H;

    /* renamed from: H0, reason: from kotlin metadata */
    public final x0 layoutDirection;

    /* renamed from: I, reason: from kotlin metadata */
    public final l insetsListener;
    public final o1.b I0;

    /* renamed from: J, reason: from kotlin metadata */
    public final f0 root;
    public final p1.c J0;

    /* renamed from: K, reason: from kotlin metadata */
    public final t layoutNodes;

    /* renamed from: K0, reason: from kotlin metadata */
    public final w1.b modifierLocalManager;

    /* renamed from: L, reason: from kotlin metadata */
    public final f2.a rectManager;
    public final v1 L0;
    public final AndroidComposeView M;
    public MotionEvent M0;

    /* renamed from: N, reason: from kotlin metadata */
    public final m semanticsOwner;
    public long N0;
    public final x O;
    public final xr.a O0;

    /* renamed from: P, reason: from kotlin metadata */
    public e contentCaptureManager;
    public final z P0;

    /* renamed from: Q, reason: from kotlin metadata */
    public final g accessibilityManager;
    public float Q0;
    public final g1.f R;
    public float R0;

    /* renamed from: S, reason: from kotlin metadata */
    public final k autofillTree;
    public final l0 S0;
    public final ArrayList T;
    public final o T0;
    public ArrayList U;
    public boolean U0;
    public boolean V;
    public final r V0;
    public final r1.c W;
    public final v0 W0;
    public boolean X0;
    public final a2.g Y0;
    public View Z0;

    /* renamed from: a, reason: collision with root package name */
    public long f1156a;

    /* renamed from: a0, reason: collision with root package name */
    public final g1.f f1157a0;

    /* renamed from: a1, reason: collision with root package name */
    public final v1 f1158a1;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public ar.k configurationChangeObserver;

    /* renamed from: c0, reason: collision with root package name */
    public final kg.r f1160c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1161d;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public final a1.c _autofillManager;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1163e0;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public final i clipboardManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final h0 sharedDrawScope;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public final y1.h clipboard;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public final n1 snapshotObserver;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* renamed from: j0, reason: collision with root package name */
    public r0 f1169j0;

    /* renamed from: k0, reason: collision with root package name */
    public t2.a f1170k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f1171l0;

    /* renamed from: m0, reason: collision with root package name */
    public final x1.v0 f1172m0;

    /* renamed from: n0, reason: collision with root package name */
    public long f1173n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f1174o0;

    /* renamed from: p0, reason: collision with root package name */
    public final float[] f1175p0;

    /* renamed from: q0, reason: collision with root package name */
    public final float[] f1176q0;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final x0 density;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1179s0;

    /* renamed from: t0, reason: collision with root package name */
    public long f1180t0;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final x0 _viewTreeOwners;

    /* renamed from: v0, reason: collision with root package name */
    public final d0 f1182v0;

    /* renamed from: w0, reason: collision with root package name */
    public ar.k f1183w0;

    /* renamed from: x, reason: collision with root package name */
    public final View f1184x;

    /* renamed from: x0, reason: collision with root package name */
    public final j f1185x0;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1186y;

    /* renamed from: y0, reason: collision with root package name */
    public final y1.k f1187y0;

    /* renamed from: z0, reason: collision with root package name */
    public final y1.l f1188z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v33, types: [y1.j] */
    /* JADX WARN: Type inference failed for: r1v34, types: [y1.k] */
    /* JADX WARN: Type inference failed for: r1v35, types: [y1.l] */
    public AndroidComposeView(Context context, h hVar) {
        kg.r rVar;
        a1.c cVar;
        super(context);
        final AndroidComposeView androidComposeView = this;
        androidComposeView.f1156a = 9205357640488583168L;
        int i10 = 1;
        androidComposeView.f1161d = true;
        androidComposeView.sharedDrawScope = new h0();
        t2.e eVarB = e5.b(context);
        t0 t0Var = t0.f17319r;
        androidComposeView.density = androidx.compose.runtime.c.e(eVarB, t0Var);
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        boolean z10 = i11 >= 35;
        androidComposeView.f1186y = z10;
        e2.b bVar = new e2.b();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(bVar);
        z0 z0Var = new z0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // x1.z0
            public final z0.l d() {
                u0 u0Var = new u0();
                u0Var.f25781p = this.f1189a;
                return u0Var;
            }

            @Override // x1.z0
            public final void e(z0.l lVar) {
                ((u0) lVar).f25781p = this.f1189a;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f1189a.hashCode();
            }
        };
        androidComposeView.B = new f(androidComposeView, androidComposeView);
        androidComposeView.coroutineContext = hVar;
        androidComposeView.dragAndDropManager = new a();
        androidComposeView.F = new p(27);
        z0.m mVarA = androidx.compose.ui.input.key.a.a(new y1.p(androidComposeView, i12));
        z0.m mVarA2 = androidx.compose.ui.input.rotary.a.a();
        androidComposeView.G = new q();
        ViewConfiguration.get(context);
        androidComposeView.H = new q0();
        l lVar = new l();
        androidComposeView.insetsListener = lVar;
        f0 f0Var = new f0(3);
        v1.r rVar2 = f0Var.f24816v;
        y yVar = y.f23819a;
        if (!br.l.a(rVar2, yVar)) {
            f0Var.f24816v = yVar;
            f0Var.N();
        }
        f0Var.r0(androidComposeView.getDensity());
        f0Var.v0(androidComposeView.getViewConfiguration());
        f0Var.u0(androidx.compose.ui.layout.a.b(lVar).c(emptySemanticsElement).c(mVarA2).c(mVarA).c((FocusOwnerImpl$modifier$1) ((f) androidComposeView.getFocusOwner()).f199e).c(androidComposeView.getDragAndDropManager().f3121c).c(z0Var));
        androidComposeView.root = f0Var;
        t tVar = u.k.f23086a;
        androidComposeView.layoutNodes = new t();
        androidComposeView.getLayoutNodes();
        androidComposeView.rectManager = new f2.a();
        androidComposeView.M = androidComposeView;
        androidComposeView.semanticsOwner = new m(androidComposeView.getRoot(), bVar, androidComposeView.getLayoutNodes());
        x xVar = new x(androidComposeView);
        androidComposeView.O = xVar;
        androidComposeView.contentCaptureManager = new e(androidComposeView, new xp.c(0, androidComposeView, e0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 4));
        g gVar = new g();
        Object systemService = context.getSystemService("accessibility");
        br.l.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        androidComposeView.accessibilityManager = gVar;
        g1.f fVar = new g1.f();
        fVar.f9209d = androidComposeView;
        fVar.f9210g = new Object();
        d dVar = new d(fVar);
        fVar.f9212x = dVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context2 = androidComposeView.getContext();
            if (!fVar.f9208a) {
                context2.getApplicationContext().registerComponentCallbacks(dVar);
                fVar.f9208a = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new g1.e(i12, fVar));
        androidComposeView.R = fVar;
        androidComposeView.autofillTree = new k();
        androidComposeView.T = new ArrayList();
        androidComposeView.W = new r1.c();
        f0 root = androidComposeView.getRoot();
        g1.f fVar2 = new g1.f();
        fVar2.f9209d = root;
        fVar2.f9210g = new r1.b((x1.r) root.D.f822d);
        fVar2.f9211r = new l2(7);
        fVar2.f9212x = new x1.p();
        androidComposeView.f1157a0 = fVar2;
        androidComposeView.configurationChangeObserver = n.f25745g;
        if (d()) {
            k autofillTree = androidComposeView.getAutofillTree();
            rVar = new kg.r();
            rVar.f14395a = androidComposeView;
            rVar.f14396d = autofillTree;
            AutofillManager autofillManagerF = a1.a.f(androidComposeView.getContext().getSystemService(a1.a.j()));
            if (autofillManagerF == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            rVar.f14397g = autofillManagerF;
            androidComposeView.setImportantForAutofill(1);
            a2.a aVarT = y3.t(androidComposeView);
            AutofillId autofillIdD = aVarT != null ? a1.a.d(aVarT.f28a) : null;
            if (autofillIdD == null) {
                throw c7.a.h("Required value was null.");
            }
            rVar.f14398r = autofillIdD;
        } else {
            rVar = null;
        }
        androidComposeView.f1160c0 = rVar;
        if (d()) {
            AutofillManager autofillManagerF2 = a1.a.f(context.getSystemService(a1.a.j()));
            if (autofillManagerF2 == null) {
                throw c7.a.h("Autofill service could not be located.");
            }
            androidComposeView = this;
            cVar = new a1.c(new b9.c(i10, autofillManagerF2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            cVar = null;
        }
        androidComposeView._autofillManager = cVar;
        androidComposeView.clipboardManager = new i(context);
        androidComposeView.getClipboardManager();
        androidComposeView.clipboard = new y1.h();
        androidComposeView.snapshotObserver = new n1(new y1.p(androidComposeView, i10));
        androidComposeView.f1172m0 = new x1.v0(androidComposeView.getRoot());
        long j = Integer.MAX_VALUE;
        androidComposeView.f1173n0 = (j & 4294967295L) | (j << 32);
        androidComposeView.f1174o0 = new int[]{0, 0};
        float[] fArrG = g1.f0.g();
        androidComposeView.f1175p0 = g1.f0.g();
        androidComposeView.f1176q0 = g1.f0.g();
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.f1180t0 = 9187343241974906880L;
        androidComposeView._viewTreeOwners = androidx.compose.runtime.c.f(null);
        r rVar3 = new r(androidComposeView, i10);
        qm.c cVar2 = d2.f17151a;
        androidComposeView.f1182v0 = new d0(rVar3);
        androidComposeView.f1185x0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: y1.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class cls = AndroidComposeView.f1151b1;
                this.f25719a.F();
            }
        };
        androidComposeView.f1187y0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: y1.k
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class cls = AndroidComposeView.f1151b1;
                this.f25725a.F();
            }
        };
        androidComposeView.f1188z0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: y1.l
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z11) {
                ((n0.b2) this.f25733a.J0.f20239a).setValue(new p1.a(z11 ? 1 : 2));
            }
        };
        View view = androidComposeView.getView();
        new a2.d(view);
        Choreographer.getInstance();
        b bVar2 = new b();
        bVar2.f11196a = view;
        long j7 = i0.f9834b;
        int length = new h2.f("").f9811d.length();
        int i13 = i0.f9835c;
        boolean z11 = z10;
        int i14 = (int) (j7 >> 32);
        int i15 = i14 < 0 ? 0 : i14;
        i15 = i15 > length ? length : i15;
        int i16 = (int) (j7 & 4294967295L);
        int i17 = i16 < 0 ? 0 : i16;
        length = i17 <= length ? i17 : length;
        if (i15 != i14 || length != i16) {
            b0.b(i15, length);
        }
        int i18 = l2.b.f14648e;
        new ArrayList();
        bVar2.f11197d = kc.f.E(lq.j.NONE, new ht.g(18, bVar2));
        new CursorAnchorInfo.Builder();
        new Matrix();
        androidComposeView.A0 = bVar2;
        c cVar3 = new c();
        new AtomicReference(null);
        androidComposeView.textInputService = cVar3;
        androidComposeView.C0 = new AtomicReference(null);
        androidComposeView.getTextInputService();
        androidComposeView.D0 = new v1();
        androidComposeView.E0 = new v1();
        androidComposeView.fontFamilyResolver = androidx.compose.runtime.c.e(t1.m(context), t0Var);
        androidComposeView.G0 = i11 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        t2.i iVar = layoutDirection != 0 ? layoutDirection != 1 ? null : t2.i.Rtl : t2.i.Ltr;
        androidComposeView.layoutDirection = androidx.compose.runtime.c.f(iVar == null ? t2.i.Ltr : iVar);
        androidComposeView.I0 = new o1.b();
        androidComposeView.J0 = new p1.c(androidComposeView.isInTouchMode() ? 1 : 2);
        w1.b bVar3 = new w1.b();
        new p0.e(new x1.c[16]);
        new p0.e(new p[16]);
        new p0.e(new f0[16]);
        new p0.e(new p[16]);
        androidComposeView.modifierLocalManager = bVar3;
        v1 v1Var = new v1();
        y1.t1 t1Var = y1.t1.Shown;
        androidComposeView.L0 = v1Var;
        androidComposeView.O0 = new xr.a();
        androidComposeView.P0 = new z();
        androidComposeView.S0 = new l0(8, androidComposeView);
        androidComposeView.T0 = new o(22, androidComposeView);
        androidComposeView.V0 = new r(androidComposeView, 0);
        androidComposeView.W0 = i11 < 29 ? new q3.a(fArrG) : new w0();
        androidComposeView.addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        androidComposeView.setWillNotDraw(false);
        androidComposeView.setFocusable(true);
        if (i11 >= 26) {
            y1.d0.f25665a.a(androidComposeView, 1, false);
        }
        androidComposeView.setFocusableInTouchMode(true);
        androidComposeView.setClipChildren(false);
        u3.i0.n(androidComposeView, xVar);
        androidComposeView.setOnDragListener(androidComposeView.getDragAndDropManager());
        androidComposeView.getRoot().d(androidComposeView);
        if (i11 >= 29) {
            a0.f25626a.a(androidComposeView);
        }
        if (z11) {
            View view2 = new View(context);
            view2.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view2.setTag(z0.n.hide_in_inspector_tag, Boolean.TRUE);
            androidComposeView.f1184x = view2;
            androidComposeView.addView(view2, -1);
        }
        androidComposeView.Y0 = i11 >= 31 ? new a2.g(10) : null;
        v1 v1Var2 = new v1();
        r1.h.f21165a.getClass();
        androidComposeView.f1158a1 = v1Var2;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt);
            }
        }
    }

    public static long g(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    @lq.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @lq.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y1.m get_viewTreeOwners() {
        return (y1.m) ((b2) this._viewTreeOwners).getValue();
    }

    public static View i(View view, int i10) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (br.l.a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewI = i(viewGroup.getChildAt(i11), i10);
                    if (viewI != null) {
                        return viewI;
                    }
                }
            }
        }
        return null;
    }

    public static void l(f0 f0Var) {
        f0Var.M();
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            l((f0) objArr[i11]);
        }
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !y1.n1.f25754a.a(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private void setDensity(t2.c cVar) {
        ((b2) this.density).setValue(cVar);
    }

    private void setFontFamilyResolver(k2.g gVar) {
        ((b2) this.fontFamilyResolver).setValue(gVar);
    }

    private void setLayoutDirection(t2.i iVar) {
        ((b2) this.layoutDirection).setValue(iVar);
    }

    private final void set_viewTreeOwners(y1.m mVar) {
        ((b2) this._viewTreeOwners).setValue(mVar);
    }

    public final boolean A() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void B(f0 f0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f0Var != null) {
            while (f0Var != null && f0Var.z() == x1.d0.InMeasureBlock) {
                if (!this.f1171l0) {
                    f0 f0VarC = f0Var.C();
                    if (f0VarC == null) {
                        break;
                    }
                    long j = ((x1.r) f0VarC.D.f822d).f23812e;
                    if (t2.a.f(j) && t2.a.e(j)) {
                        break;
                    }
                }
                f0Var = f0Var.C();
            }
            if (f0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long C(long j) {
        y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f1180t0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f1180t0 & 4294967295L));
        return g1.f0.k((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f1176q0);
    }

    public final int D(MotionEvent motionEvent) {
        Object obj;
        if (this.X0) {
            this.X0 = false;
            int metaState = motionEvent.getMetaState();
            this.F.getClass();
            ((b2) a2.f25628a).setValue(new r1.m(metaState));
        }
        r1.c cVar = this.W;
        om.f fVarA = cVar.a(motionEvent, this);
        g1.f fVar = this.f1157a0;
        if (fVarA == null) {
            if (!fVar.f9208a) {
                ((u.o) ((l2) fVar.f9211r).f20100d).a();
                ((r1.b) fVar.f9210g).c();
            }
            return 0;
        }
        List list = (List) fVarA.f19554d;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                obj = list.get(size);
                if (((r1.l) obj).f21186e) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            obj = null;
        } else {
            obj = null;
        }
        r1.l lVar = (r1.l) obj;
        if (lVar != null) {
            this.f1156a = lVar.f21185d;
        }
        int iY = fVar.y(fVarA, this, o(motionEvent));
        fVarA.f19555g = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iY & 1) != 0) {
            return iY;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        cVar.f21151c.delete(pointerId);
        cVar.f21150b.delete(pointerId);
        return iY;
    }

    public final void E(MotionEvent motionEvent, int i10, long j, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jQ = q((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jQ >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jQ & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        om.f fVarA = this.W.a(motionEventObtain, this);
        br.l.b(fVarA);
        this.f1157a0.y(fVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            r18 = this;
            r0 = r18
            int[] r1 = r0.f1174o0
            r0.getLocationOnScreen(r1)
            long r2 = r0.f1173n0
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.lastMatrixRecalculationAnimationTime
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L46
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.f1173n0 = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L46
            if (r2 == r1) goto L46
            x1.f0 r1 = r0.getRoot()
            x1.i0 r1 = r1.r()
            x1.y0 r1 = r1.f24859p
            r1.T()
            r1 = r9
            goto L47
        L46:
            r1 = r3
        L47:
            r0.y()
            android.view.View r2 = r0.Z0
            if (r2 != 0) goto L54
            android.view.View r2 = r0.getRootView()
            r0.Z0 = r2
        L54:
            f2.a r5 = r0.getRectManager()
            long r10 = r0.f1173n0
            long r12 = r0.f1180t0
            long r12 = ic.a.I(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.f1175p0
            int r15 = se.b.b(r14)
            f2.b r3 = r5.f8418b
            r15 = r15 & 2
            if (r15 != 0) goto L7a
        L77:
            r16 = r6
            goto L7c
        L7a:
            r14 = 0
            goto L77
        L7c:
            long r6 = r3.f8428c
            boolean r6 = i3.g.l(r12, r6)
            if (r6 != 0) goto L88
            r3.f8428c = r12
            r6 = r9
            goto L89
        L88:
            r6 = 0
        L89:
            long r12 = r3.f8429d
            boolean r7 = i3.g.l(r10, r12)
            if (r7 != 0) goto L94
            r3.f8429d = r10
            r6 = r9
        L94:
            if (r14 == 0) goto L97
            r6 = r9
        L97:
            long r7 = (long) r8
            long r7 = r7 << r4
            long r10 = (long) r2
            long r10 = r10 & r16
            long r7 = r7 | r10
            long r10 = r3.f8430e
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 == 0) goto La6
            r3.f8430e = r7
            r6 = r9
        La6:
            if (r6 != 0) goto Laf
            boolean r2 = r5.f8421e
            if (r2 == 0) goto Lad
            goto Laf
        Lad:
            r3 = 0
            goto Lb0
        Laf:
            r3 = r9
        Lb0:
            r5.f8421e = r3
            x1.v0 r2 = r0.f1172m0
            r2.a(r1)
            f2.a r1 = r0.getRectManager()
            r1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.F():void");
    }

    public final void G(float f10) {
        if (this.f1186y) {
            if (f10 > 0.0f) {
                if (Float.isNaN(this.Q0) || f10 > this.Q0) {
                    this.Q0 = f10;
                    return;
                }
                return;
            }
            if (f10 < 0.0f) {
                if (Float.isNaN(this.R0) || f10 < this.R0) {
                    this.R0 = f10;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        SemanticsConfiguration semanticsConfigurationE;
        ar.k kVar;
        if (d()) {
            a1.c cVar = this._autofillManager;
            if (cVar != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int iKeyAt = sparseArray.keyAt(i10);
                    AutofillValue autofillValueG = a1.a.g(sparseArray.get(iKeyAt));
                    if (autofillValueG.isText()) {
                        f0 f0Var = (f0) cVar.f12b.f7725c.b(iKeyAt);
                        if (f0Var != null && (semanticsConfigurationE = f0Var.E()) != null) {
                            Object objG = semanticsConfigurationE.f1191a.g(e2.g.f7691f);
                            if (objG == null) {
                                objG = null;
                            }
                            e2.a aVar = (e2.a) objG;
                            if (aVar != null && (kVar = (ar.k) aVar.f7678b) != null) {
                            }
                        }
                    } else if (autofillValueG.isDate()) {
                        io.sentry.android.core.e0.p("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueG.isList()) {
                        io.sentry.android.core.e0.p("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueG.isToggle()) {
                        io.sentry.android.core.e0.p("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            kg.r rVar = this.f1160c0;
            if (rVar != null) {
                k kVar2 = (k) rVar.f14396d;
                if (kVar2.f21a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iKeyAt2 = sparseArray.keyAt(i11);
                    AutofillValue autofillValueG2 = a1.a.g(sparseArray.get(iKeyAt2));
                    if (autofillValueG2.isText()) {
                        autofillValueG2.getTextValue().toString();
                        if (kVar2.f21a.get(Integer.valueOf(iKeyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (autofillValueG2.isDate()) {
                            throw new lq.k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueG2.isList()) {
                            throw new lq.k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueG2.isToggle()) {
                            throw new lq.k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        this.O.l(this.f1156a, false);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        this.O.l(this.f1156a, true);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            l(getRoot());
        }
        r(true);
        x0.l.k().m();
        this.V = true;
        q qVar = this.G;
        g1.b bVar = qVar.f9263a;
        Canvas canvas2 = bVar.f9198a;
        bVar.f9198a = canvas;
        getRoot().k(bVar, null);
        qVar.f9263a.f9198a = canvas2;
        ArrayList arrayList = this.T;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((y1.k1) ((l1) arrayList.get(i10))).f();
            }
        }
        int i11 = y1.f25814a;
        arrayList.clear();
        this.V = false;
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f1186y) {
            y1.t0.a(this, this.Q0);
            View view = this.f1184x;
            if (view == null) {
                br.l.l("frameRateCategoryView");
                throw null;
            }
            y1.t0.a(view, this.R0);
            if (!Float.isNaN(this.R0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.Q0 = Float.NaN;
            this.R0 = Float.NaN;
        }
        getRectManager().b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        al.c cVar;
        t1.a aVar;
        int size;
        al.c cVar2;
        z0.l lVarE;
        al.c cVar3;
        if (this.U0) {
            o oVar = this.T0;
            removeCallbacks(oVar);
            if (motionEvent.getActionMasked() == 8) {
                this.U0 = false;
            } else {
                oVar.run();
            }
        }
        if (n(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Float.floatToRawIntBits(x10);
                Float.floatToRawIntBits(y10);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                f fVar = (f) getFocusOwner();
                if (((e1.e) fVar.f198d).f7645e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    e1.p pVarG = e1.d.g((e1.p) fVar.f197c);
                    if (pVarG != null) {
                        if (!pVarG.f26495b.f26506o) {
                            u1.a.b("visitAncestors called on an unattached node");
                        }
                        z0.l lVar = pVarG.f26495b;
                        f0 f0VarR = x1.k.r(pVarG);
                        while (f0VarR != null) {
                            if ((((z0.l) f0VarR.D.f825g).f26498e & 2097152) != 0) {
                                while (lVar != null) {
                                    if ((lVar.f26497d & 2097152) != 0) {
                                        z0.l lVarE2 = lVar;
                                        p0.e eVar = null;
                                        while (lVarE2 != null) {
                                            if ((lVarE2.f26497d & 2097152) != 0 && (lVarE2 instanceof x1.j)) {
                                                int i10 = 0;
                                                for (z0.l lVar2 = ((x1.j) lVarE2).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                                                    if ((lVar2.f26497d & 2097152) != 0) {
                                                        i10++;
                                                        if (i10 == 1) {
                                                            lVarE2 = lVar2;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new p0.e(new z0.l[16]);
                                                            }
                                                            if (lVarE2 != null) {
                                                                eVar.b(lVarE2);
                                                                lVarE2 = null;
                                                            }
                                                            eVar.b(lVar2);
                                                        }
                                                    }
                                                }
                                                if (i10 == 1) {
                                                }
                                            }
                                            lVarE2 = x1.k.e(eVar);
                                        }
                                    }
                                    lVar = lVar.f26499f;
                                }
                            }
                            f0VarR = f0VarR.C();
                            lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (x1.v1) cVar.f824f;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (k(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = j0.f23184a;
            a2.e.e(viewConfiguration);
        } else {
            j0.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i11 >= 26) {
            a2.e.d(viewConfiguration);
        } else {
            j0.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        f fVar2 = (f) getFocusOwner();
        if (((e1.e) fVar2.f198d).f7645e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        e1.p pVarG2 = e1.d.g((e1.p) fVar2.f197c);
        if (pVarG2 != null) {
            if (!pVarG2.f26495b.f26506o) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            z0.l lVar3 = pVarG2.f26495b;
            f0 f0VarR2 = x1.k.r(pVarG2);
            loop0: while (true) {
                if (f0VarR2 == null) {
                    lVarE = null;
                    break;
                }
                if ((((z0.l) f0VarR2.D.f825g).f26498e & 16384) != 0) {
                    while (lVar3 != null) {
                        if ((lVar3.f26497d & 16384) != 0) {
                            lVarE = lVar3;
                            p0.e eVar2 = null;
                            while (lVarE != null) {
                                if (lVarE instanceof t1.a) {
                                    break loop0;
                                }
                                if ((lVarE.f26497d & 16384) != 0 && (lVarE instanceof x1.j)) {
                                    int i12 = 0;
                                    for (z0.l lVar4 = ((x1.j) lVarE).f24863q; lVar4 != null; lVar4 = lVar4.f26500g) {
                                        if ((lVar4.f26497d & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                lVarE = lVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar2.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar2.b(lVar4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                lVarE = x1.k.e(eVar2);
                            }
                        }
                        lVar3 = lVar3.f26499f;
                    }
                }
                f0VarR2 = f0VarR2.C();
                lVar3 = (f0VarR2 == null || (cVar3 = f0VarR2.D) == null) ? null : (x1.v1) cVar3.f824f;
            }
            aVar = (t1.a) lVarE;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            t1.a aVar2 = aVar;
            if (!aVar2.f26495b.f26506o) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            z0.l lVar5 = aVar2.f26495b.f26499f;
            f0 f0VarR3 = x1.k.r(aVar);
            ArrayList arrayList = null;
            while (f0VarR3 != null) {
                if ((((z0.l) f0VarR3.D.f825g).f26498e & 16384) != 0) {
                    while (lVar5 != null) {
                        if ((lVar5.f26497d & 16384) != 0) {
                            z0.l lVarE3 = lVar5;
                            p0.e eVar3 = null;
                            while (lVarE3 != null) {
                                if (lVarE3 instanceof t1.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(lVarE3);
                                } else if ((lVarE3.f26497d & 16384) != 0 && (lVarE3 instanceof x1.j)) {
                                    int i13 = 0;
                                    for (z0.l lVar6 = ((x1.j) lVarE3).f24863q; lVar6 != null; lVar6 = lVar6.f26500g) {
                                        if ((lVar6.f26497d & 16384) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                lVarE3 = lVar6;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE3 != null) {
                                                    eVar3.b(lVarE3);
                                                    lVarE3 = null;
                                                }
                                                eVar3.b(lVar6);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                lVarE3 = x1.k.e(eVar3);
                            }
                        }
                        lVar5 = lVar5.f26499f;
                    }
                }
                f0VarR3 = f0VarR3.C();
                lVar5 = (f0VarR3 == null || (cVar2 = f0VarR3.D) == null) ? null : (x1.v1) cVar2.f824f;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i14 = size - 1;
                    ((t1.a) arrayList.get(size)).getClass();
                    if (i14 < 0) {
                        break;
                    }
                    size = i14;
                }
            }
            z0.l lVarE4 = aVar2.f26495b;
            p0.e eVar4 = null;
            while (lVarE4 != null) {
                if (lVarE4 instanceof t1.a) {
                } else if ((lVarE4.f26497d & 16384) != 0 && (lVarE4 instanceof x1.j)) {
                    int i15 = 0;
                    for (z0.l lVar7 = ((x1.j) lVarE4).f24863q; lVar7 != null; lVar7 = lVar7.f26500g) {
                        if ((lVar7.f26497d & 16384) != 0) {
                            i15++;
                            if (i15 == 1) {
                                lVarE4 = lVar7;
                            } else {
                                if (eVar4 == null) {
                                    eVar4 = new p0.e(new z0.l[16]);
                                }
                                if (lVarE4 != null) {
                                    eVar4.b(lVarE4);
                                    lVarE4 = null;
                                }
                                eVar4.b(lVar7);
                            }
                        }
                    }
                    if (i15 == 1) {
                    }
                }
                lVarE4 = x1.k.e(eVar4);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                z0.l lVarE5 = aVar2.f26495b;
                p0.e eVar5 = null;
                while (lVarE5 != null) {
                    if (lVarE5 instanceof t1.a) {
                    } else if ((lVarE5.f26497d & 16384) != 0 && (lVarE5 instanceof x1.j)) {
                        int i16 = 0;
                        for (z0.l lVar8 = ((x1.j) lVarE5).f24863q; lVar8 != null; lVar8 = lVar8.f26500g) {
                            if ((lVar8.f26497d & 16384) != 0) {
                                i16++;
                                if (i16 == 1) {
                                    lVarE5 = lVar8;
                                } else {
                                    if (eVar5 == null) {
                                        eVar5 = new p0.e(new z0.l[16]);
                                    }
                                    if (lVarE5 != null) {
                                        eVar5.b(lVarE5);
                                        lVarE5 = null;
                                    }
                                    eVar5.b(lVar8);
                                }
                            }
                        }
                        if (i16 == 1) {
                        }
                    }
                    lVarE5 = x1.k.e(eVar5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        n nVar = ((t1.a) arrayList.get(i17)).f22380p;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        r5.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(r24);
        r5 = r2.f25793e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        if (r5 != r14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011a, code lost:
    
        r2.f25793e = r14;
        y1.x.A(r2, r14, 128, null, 12);
        y1.x.A(r2, r5, 256, null, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) throws org.xmlpull.v1.XmlPullParserException, java.lang.InterruptedException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((f) getFocusOwner()).m(keyEvent, new qr.g(this, 8, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.F.getClass();
        ((b2) a2.f25628a).setValue(new r1.m(metaState));
        return ((f) getFocusOwner()).m(keyEvent, e1.f.f7646d) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        al.c cVar;
        if (isFocused()) {
            f fVar = (f) getFocusOwner();
            if (((e1.e) fVar.f198d).f7645e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                e1.p pVarG = e1.d.g((e1.p) fVar.f197c);
                if (pVarG != null) {
                    if (!pVarG.f26495b.f26506o) {
                        u1.a.b("visitAncestors called on an unattached node");
                    }
                    z0.l lVar = pVarG.f26495b;
                    f0 f0VarR = x1.k.r(pVarG);
                    while (f0VarR != null) {
                        if ((((z0.l) f0VarR.D.f825g).f26498e & 131072) != 0) {
                            while (lVar != null) {
                                if ((lVar.f26497d & 131072) != 0) {
                                    z0.l lVarE = lVar;
                                    p0.e eVar = null;
                                    while (lVarE != null) {
                                        if ((lVarE.f26497d & 131072) != 0 && (lVarE instanceof x1.j)) {
                                            int i10 = 0;
                                            for (z0.l lVar2 = ((x1.j) lVarE).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                                                if ((lVar2.f26497d & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        lVarE = lVar2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new p0.e(new z0.l[16]);
                                                        }
                                                        if (lVarE != null) {
                                                            eVar.b(lVarE);
                                                            lVarE = null;
                                                        }
                                                        eVar.b(lVar2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        lVarE = x1.k.e(eVar);
                                    }
                                }
                                lVar = lVar.f26499f;
                            }
                        }
                        f0VarR = f0VarR.C();
                        lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (x1.v1) cVar.f824f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            y1.z.f25815a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws XmlPullParserException, InterruptedException, Resources.NotFoundException, IOException {
        if (this.U0) {
            o oVar = this.T0;
            removeCallbacks(oVar);
            MotionEvent motionEvent2 = this.M0;
            br.l.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.U0 = false;
            } else {
                oVar.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int iK = k(motionEvent);
            if ((iK & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iK & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return i(this, accessibilityId);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        f1.c cVarD;
        if (view == null || this.f1172m0.f24944c) {
            return super.focusSearch(view, i10);
        }
        Object obj = h1.f25695f.get();
        br.l.b(obj);
        View viewB = ((h1) obj).b(i10, view, this);
        if (view == this) {
            e1.p pVarG = e1.d.g((e1.p) ((f) getFocusOwner()).f197c);
            cVarD = pVarG != null ? e1.d.j(pVarG) : null;
            if (cVarD == null) {
                cVarD = e1.d.d(view, this);
            }
        } else {
            cVarD = e1.d.d(view, this);
        }
        e1.b bVarA = e1.d.A(i10);
        int i11 = bVarA != null ? bVarA.f7639a : 6;
        w wVar = new w();
        if (((f) getFocusOwner()).q(i11, cVarD, new j1.a(23, wVar)) != null) {
            Object obj2 = wVar.f2917a;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    if (e1.d.o(e1.d.j((e1.p) obj2), e1.d.d(viewB, this), cVarD, i11)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    public final r0 getAndroidViewsHandler$ui_release() {
        if (this.f1169j0 == null) {
            r0 r0Var = new r0(getContext());
            this.f1169j0 = r0Var;
            addView(r0Var, -1);
            requestLayout();
        }
        r0 r0Var2 = this.f1169j0;
        br.l.b(r0Var2);
        return r0Var2;
    }

    @Override // androidx.compose.ui.node.Owner
    public a1.f getAutofill() {
        return this.f1160c0;
    }

    @Override // androidx.compose.ui.node.Owner
    public a1.j getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public k getAutofillTree() {
        return this.autofillTree;
    }

    public final ar.k getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final e getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public t2.c getDensity() {
        return (t2.c) ((b2) this.density).getValue();
    }

    public f1.c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            e1.p pVarG = e1.d.g((e1.p) ((f) getFocusOwner()).f197c);
            if (pVarG != null) {
                return e1.d.j(pVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return e1.d.d(viewFindFocus, this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public e1.g getFocusOwner() {
        return this.B;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        f1.c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f8404a);
            rect.top = Math.round(embeddedViewFocusRect.f8405b);
            rect.right = Math.round(embeddedViewFocusRect.f8406c);
            rect.bottom = Math.round(embeddedViewFocusRect.f8407d);
            return;
        }
        if (br.l.a(((f) getFocusOwner()).q(6, null, n.f25746r), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public k2.g getFontFamilyResolver() {
        return (k2.g) ((b2) this.fontFamilyResolver).getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public k2.f getFontLoader() {
        return this.E0;
    }

    @Override // androidx.compose.ui.node.Owner
    public g1.w getGraphicsContext() {
        return this.R;
    }

    @Override // androidx.compose.ui.node.Owner
    public o1.a getHapticFeedBack() {
        return this.I0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f1172m0.f24943b.B();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public p1.b getInputModeManager() {
        return this.J0;
    }

    public final l getInsetsListener() {
        return this.insetsListener;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public t2.i getLayoutDirection() {
        return (t2.i) ((b2) this.layoutDirection).getValue();
    }

    public long getMeasureIteration() {
        x1.v0 v0Var = this.f1172m0;
        if (!v0Var.f24944c) {
            u1.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return v0Var.f24948g;
    }

    public w1.b getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public u getPlacementScope() {
        int i10 = v1.x.f23818b;
        return new v1.o(1, this);
    }

    @Override // androidx.compose.ui.node.Owner
    public r1.i getPointerIconService() {
        return this.f1158a1;
    }

    @Override // androidx.compose.ui.node.Owner
    public f2.a getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public f0 getRoot() {
        return this.root;
    }

    public s1 getRootForTest() {
        return this.M;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        a2.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.Y0) == null) {
            return false;
        }
        return ((Boolean) ((b2) ((x0) gVar.f31a)).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public m getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public h0 getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? s0.f25773a.a(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public n1 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public r1 getSoftwareKeyboardController() {
        return this.D0;
    }

    @Override // androidx.compose.ui.node.Owner
    public c getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public y1.s1 getTextToolbar() {
        return this.L0;
    }

    public final x1.r1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public x1 getViewConfiguration() {
        return this.H;
    }

    public final y1.m getViewTreeOwners() {
        return (y1.m) this.f1182v0.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public z1 getWindowInfo() {
        return this.F;
    }

    /* renamed from: get_autofillManager$ui_release, reason: from getter */
    public final a1.c get_autofillManager() {
        return this._autofillManager;
    }

    public final void j(f0 f0Var, boolean z10) {
        this.f1172m0.d(f0Var, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.k(android.view.MotionEvent):int");
    }

    public final void m(f0 f0Var) {
        this.f1172m0.m(f0Var, false);
        p0.e eVarI = f0Var.I();
        Object[] objArr = eVarI.f20230a;
        int i10 = eVarI.f20232g;
        for (int i11 = 0; i11 < i10; i11++) {
            m((f0) objArr[i11]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.o oVarH;
        v vVar;
        kg.r rVar;
        super.onAttachedToWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            setShowLayoutBounds(e0.m());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        if (i10 > 28) {
            if (f1155f1 == null) {
                u4 u4Var = new u4(4);
                f1155f1 = u4Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f1151b1 == null) {
                        f1151b1 = Class.forName("android.os.SystemProperties");
                    }
                    if (f1153d1 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f1151b1;
                        f1153d1 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f1153d1;
                    if (method != null) {
                        method.invoke(null, u4Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            z zVar = f1154e1;
            synchronized (zVar) {
                zVar.a(this);
            }
        }
        ((b2) ((x0) this.F.f19481d)).setValue(Boolean.valueOf(hasWindowFocus()));
        this.F.getClass();
        this.F.getClass();
        m(getRoot());
        l(getRoot());
        x0.r rVar2 = getSnapshotObserver().f24895a;
        au.v vVar2 = rVar2.f24741d;
        x0.l.f(x0.l.f24715a);
        synchronized (x0.l.f24717c) {
            x0.l.f24722h = mq.o.F0(x0.l.f24722h, vVar2);
        }
        rVar2.f24745h = new s9.g(6, vVar2);
        if (d() && (rVar = this.f1160c0) != null) {
            a1.i iVar = a1.i.f20a;
            iVar.getClass();
            ((AutofillManager) rVar.f14397g).registerCallback(a1.a.e(iVar));
        }
        v vVarC = o0.c(this);
        l7.e eVarQ = i4.q(this);
        y1.m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (vVarC != null && eVarQ != null && (vVarC != (vVar = viewTreeOwners.f25741a) || eVarQ != vVar))) {
            if (vVarC == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarQ == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (oVarH = viewTreeOwners.f25741a.h()) != null) {
                oVarH.m1(this);
            }
            vVarC.h().V0(this);
            y1.m mVar = new y1.m(vVarC, eVarQ);
            set_viewTreeOwners(mVar);
            ar.k kVar = this.f1183w0;
            if (kVar != null) {
                kVar.a(mVar);
            }
            this.f1183w0 = null;
        }
        ((b2) this.J0.f20239a).setValue(new p1.a(isInTouchMode() ? 1 : 2));
        y1.m viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.o oVarH2 = viewTreeOwners2 != null ? viewTreeOwners2.f25741a.h() : null;
        if (oVarH2 == null) {
            throw c7.a.h("No lifecycle owner exists");
        }
        oVarH2.V0(this);
        oVarH2.V0(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1185x0);
        getViewTreeObserver().addOnScrollChangedListener(this.f1187y0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f1188z0);
        if (Build.VERSION.SDK_INT >= 31) {
            c0.f25638a.b(this);
        }
        a1.c cVar = this._autofillManager;
        if (cVar != null) {
            ((z) ((f) getFocusOwner()).f201g).a(cVar);
            getSemanticsOwner().f7726d.a(cVar);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.C0.get() != null) {
            throw new ClassCastException();
        }
        this.A0.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(e5.b(getContext()));
        this.F.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.G0) {
            this.G0 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(t1.m(getContext()));
        }
        this.configurationChangeObserver.a(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.C0.get() != null) {
            throw new ClassCastException();
        }
        this.A0.getClass();
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        e2.k kVar;
        String strA;
        e eVar = this.contentCaptureManager;
        eVar.getClass();
        for (long j : jArr) {
            e2.l lVar = (e2.l) eVar.d().b((int) j);
            if (lVar != null && (kVar = lVar.f7721a) != null) {
                a5.p.o();
                ViewTranslationRequest.Builder builderI = a5.p.i(eVar.f2369a.getAutofillId(), kVar.f7720g);
                Object objG = kVar.f7717d.f1191a.g(e2.p.f7754x);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = v2.a.a(list, "\n", null, 62)) != null) {
                    builderI.setValue("android:text", TranslationRequestValue.forText(new h2.f(strA)));
                    consumer.accept(builderI.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        kg.r rVar;
        super.onDetachedFromWindow();
        this.insetsListener.onViewDetachedFromWindow(this);
        if (this.f1186y) {
            View view = this.f1184x;
            if (view == null) {
                br.l.l("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        if (Build.VERSION.SDK_INT > 28) {
            z zVar = f1154e1;
            synchronized (zVar) {
                zVar.i(this);
            }
        }
        n1 snapshotObserver = getSnapshotObserver();
        s9.g gVar = snapshotObserver.f24895a.f24745h;
        if (gVar != null) {
            gVar.a();
        }
        x0.r rVar2 = snapshotObserver.f24895a;
        synchronized (rVar2.f24744g) {
            p0.e eVar = rVar2.f24743f;
            Object[] objArr = eVar.f20230a;
            int i10 = eVar.f20232g;
            for (int i11 = 0; i11 < i10; i11++) {
                x0.q qVar = (x0.q) objArr[i11];
                qVar.f24732e.a();
                qVar.f24733f.a();
                qVar.k.a();
                qVar.f24737l.clear();
            }
        }
        this.F.getClass();
        y1.m viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.o oVarH = viewTreeOwners != null ? viewTreeOwners.f25741a.h() : null;
        if (oVarH == null) {
            throw c7.a.h("No lifecycle owner exists");
        }
        oVarH.m1(this.contentCaptureManager);
        oVarH.m1(this);
        if (d() && (rVar = this.f1160c0) != null) {
            a1.i iVar = a1.i.f20a;
            iVar.getClass();
            ((AutofillManager) rVar.f14397g).unregisterCallback(a1.a.e(iVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f1185x0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f1187y0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f1188z0);
        if (Build.VERSION.SDK_INT >= 31) {
            c0.f25638a.a(this);
        }
        a1.c cVar = this._autofillManager;
        if (cVar != null) {
            getSemanticsOwner().f7726d.i(cVar);
            ((z) ((f) getFocusOwner()).f201g).i(cVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        e1.d.e((e1.p) ((f) getFocusOwner()).f197c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.f1172m0.h(this.V0);
        this.f1170k0 = null;
        F();
        if (this.f1169j0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        x1.v0 v0Var = this.f1172m0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m(getRoot());
            }
            long jG = g(i10);
            long jG2 = g(i11);
            long jM = dr.a.m((int) (jG >>> 32), (int) (jG & 4294967295L), (int) (jG2 >>> 32), (int) (4294967295L & jG2));
            t2.a aVar = this.f1170k0;
            if (aVar == null) {
                this.f1170k0 = new t2.a(jM);
                this.f1171l0 = false;
            } else if (!t2.a.b(aVar.f22381a, jM)) {
                this.f1171l0 = true;
            }
            v0Var.n(jM);
            v0Var.i();
            setMeasuredDimension(getRoot().F(), getRoot().q());
            if (this.f1169j0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().F(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().q(), 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        int toolType = motionEvent.getToolType(i10);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(v vVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(e0.m());
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f1161d) {
            t2.i iVar = i10 != 0 ? i10 != 1 ? null : t2.i.Rtl : t2.i.Ltr;
            if (iVar == null) {
                iVar = t2.i.Ltr;
            }
            setLayoutDirection(iVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        r1 = r2.g(e2.g.f7690e);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r1 = (ar.n) r1;
        r1 = r2.g(e2.p.f7750t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r3 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        throw new java.lang.ClassCastException();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onScrollCaptureSearch(android.graphics.Rect r6, android.graphics.Point r7, java.util.function.Consumer r8) {
        /*
            r5 = this;
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r6 < r7) goto La3
            a2.g r6 = r5.Y0
            if (r6 == 0) goto La3
            e2.m r6 = r5.getSemanticsOwner()
            r5.getCoroutineContext()
            r7 = 16
            d2.b[] r8 = new d2.b[r7]
            e2.k r6 = r6.a()
            p0.e r0 = new p0.e
            e2.k[] r7 = new e2.k[r7]
            r0.<init>(r7)
            r7 = 0
            java.util.List r6 = r6.i(r7, r7)
        L25:
            int r1 = r0.f20232g
            r0.c(r1, r6)
        L2a:
            int r6 = r0.f20232g
            if (r6 == 0) goto L8e
            int r6 = r6 + (-1)
            java.lang.Object r6 = r0.k(r6)
            e2.k r6 = (e2.k) r6
            boolean r1 = e2.n.e(r6)
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r6.f7717d
            u.a0 r2 = r2.f1191a
            if (r1 != 0) goto L2a
            e2.s r1 = e2.p.f7741i
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L49
            goto L2a
        L49:
            x1.f1 r1 = r6.d()
            if (r1 == 0) goto L87
            f1.c r1 = com.google.android.gms.internal.measurement.e5.k(r1)
            t2.h r1 = io.sentry.config.a.g0(r1)
            int r3 = r1.f22388a
            int r4 = r1.f22390c
            if (r3 >= r4) goto L2a
            int r3 = r1.f22389b
            int r1 = r1.f22391d
            if (r3 < r1) goto L64
            goto L2a
        L64:
            e2.s r1 = e2.g.f7690e
            java.lang.Object r1 = r2.g(r1)
            r3 = 0
            if (r1 != 0) goto L6e
            r1 = r3
        L6e:
            ar.n r1 = (ar.n) r1
            e2.s r1 = e2.p.f7750t
            java.lang.Object r1 = r2.g(r1)
            if (r1 != 0) goto L79
            goto L7a
        L79:
            r3 = r1
        L7a:
            if (r3 != 0) goto L81
            java.util.List r6 = r6.i(r7, r7)
            goto L25
        L81:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L87:
            java.lang.String r6 = "Expected semantics node to have a coordinator."
            bf.n r6 = c7.a.h(r6)
            throw r6
        L8e:
            r6 = 2
            ar.k[] r6 = new ar.k[r6]
            d2.a r0 = d2.a.f6759g
            r6[r7] = r0
            d2.a r0 = d2.a.f6760r
            r1 = 1
            r6[r1] = r0
            e2.t r0 = new e2.t
            r1 = 4
            r0.<init>(r1, r6)
            mq.l.z0(r8, r0, r7, r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onScrollCaptureSearch(android.graphics.Rect, android.graphics.Point, java.util.function.Consumer):void");
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        e eVar = this.contentCaptureManager;
        eVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (br.l.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            io.sentry.config.a.L(eVar, longSparseArray);
        } else {
            eVar.f2369a.post(new a5.o(eVar, 2, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        boolean zM;
        ((b2) ((x0) this.F.f19481d)).setValue(Boolean.valueOf(z10));
        this.X0 = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM = e0.m())) {
            return;
        }
        setShowLayoutBounds(zM);
        l(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.M0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long q(long j) {
        y();
        long jK = g1.f0.k(j, this.f1175p0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f1180t0 >> 32)) + Float.intBitsToFloat((int) (jK >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f1180t0 & 4294967295L)) + Float.intBitsToFloat((int) (jK & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void r(boolean z10) {
        r rVar;
        x1.v0 v0Var = this.f1172m0;
        if (v0Var.f24943b.B() || ((p0.e) v0Var.f24946e.f19554d).f20232g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    rVar = this.V0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                rVar = null;
            }
            if (v0Var.h(rVar)) {
                requestLayout();
            }
            v0Var.a(false);
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((e1.p) ((f) getFocusOwner()).f197c).e0().getHasFocus()) {
            return super.requestFocus(i10, rect);
        }
        e1.b bVarA = e1.d.A(i10);
        int i11 = bVarA != null ? bVarA.f7639a : 7;
        return br.l.a(((f) getFocusOwner()).q(i11, rect != null ? g1.f0.s(rect) : null, new y1.q(i11, 0)), Boolean.TRUE);
    }

    public final void s(l1 l1Var, boolean z10) {
        ArrayList arrayList = this.T;
        if (!z10) {
            if (this.V) {
                return;
            }
            arrayList.remove(l1Var);
            ArrayList arrayList2 = this.U;
            if (arrayList2 != null) {
                arrayList2.remove(l1Var);
                return;
            }
            return;
        }
        if (!this.V) {
            arrayList.add(l1Var);
            return;
        }
        ArrayList arrayList3 = this.U;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.U = arrayList3;
        }
        arrayList3.add(l1Var);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.O.f25796h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(ar.k kVar) {
        this.configurationChangeObserver = kVar;
    }

    public final void setContentCaptureManager$ui_release(e eVar) {
        this.contentCaptureManager = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(h hVar) {
        this.coroutineContext = hVar;
        z0.l lVar = (z0.l) getRoot().D.f825g;
        if (lVar instanceof r1.n) {
            ((r1.n) lVar).c0();
        }
        if (!lVar.f26495b.f26506o) {
            u1.a.b("visitSubtreeIf called on an unattached node");
        }
        p0.e eVar = new p0.e(new z0.l[16]);
        z0.l lVar2 = lVar.f26495b;
        z0.l lVar3 = lVar2.f26500g;
        if (lVar3 == null) {
            x1.k.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i10 = eVar.f20232g;
            if (i10 == 0) {
                return;
            }
            z0.l lVar4 = (z0.l) eVar.k(i10 - 1);
            if ((lVar4.f26498e & 16) != 0) {
                for (z0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.f26500g) {
                    if ((lVar5.f26497d & 16) != 0) {
                        x1.j jVarE = lVar5;
                        ?? eVar2 = 0;
                        while (jVarE != 0) {
                            if (jVarE instanceof q1) {
                                q1 q1Var = (q1) jVarE;
                                if (q1Var instanceof r1.n) {
                                    ((r1.n) q1Var).c0();
                                }
                            } else if ((jVarE.f26497d & 16) != 0 && (jVarE instanceof x1.j)) {
                                z0.l lVar6 = jVarE.f24863q;
                                int i11 = 0;
                                jVarE = jVarE;
                                eVar2 = eVar2;
                                while (lVar6 != null) {
                                    if ((lVar6.f26497d & 16) != 0) {
                                        i11++;
                                        eVar2 = eVar2;
                                        if (i11 == 1) {
                                            jVarE = lVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new p0.e(new z0.l[16]);
                                            }
                                            if (jVarE != 0) {
                                                eVar2.b(jVarE);
                                                jVarE = 0;
                                            }
                                            eVar2.b(lVar6);
                                        }
                                    }
                                    lVar6 = lVar6.f26500g;
                                    jVarE = jVarE;
                                    eVar2 = eVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            jVarE = x1.k.e(eVar2);
                        }
                    }
                }
            }
            x1.k.b(eVar, lVar4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(ar.k callback) {
        y1.m viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.a(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f1183w0 = callback;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    public void setUncaughtExceptionHandler(x1.r1 handler) {
        this.f1172m0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        a1.c cVar;
        if (this.f1163e0) {
            x0.r rVar = getSnapshotObserver().f24895a;
            synchronized (rVar.f24744g) {
                try {
                    p0.e eVar = rVar.f24743f;
                    int i10 = eVar.f20232g;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        x0.q qVar = (x0.q) eVar.f20230a[i12];
                        qVar.d();
                        if (!(qVar.f24733f.f23041e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = eVar.f20230a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    mq.l.i0(eVar.f20230a, i13, i10);
                    eVar.f20232g = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f1163e0 = false;
        }
        r0 r0Var = this.f1169j0;
        if (r0Var != null) {
            e(r0Var);
        }
        if (d() && (cVar = this._autofillManager) != null) {
            u.u uVar = cVar.f17g;
            if (uVar.f23113d == 0 && cVar.f18h) {
                ((AutofillManager) cVar.f11a.f2478d).commit();
                cVar.f18h = false;
            }
            if (uVar.f23113d != 0) {
                cVar.f18h = true;
            }
        }
        while (this.P0.h() && this.P0.e(0) != null) {
            int i14 = this.P0.f23135b;
            for (int i15 = 0; i15 < i14; i15++) {
                ar.a aVar = (ar.a) this.P0.e(i15);
                z zVar = this.P0;
                if (i15 < 0 || i15 >= zVar.f23135b) {
                    zVar.m(i15);
                    throw null;
                }
                Object[] objArr2 = zVar.f23134a;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                if (aVar != null) {
                    aVar.c();
                }
            }
            this.P0.k(0, i14);
        }
    }

    public final void u(f0 f0Var) {
        x xVar = this.O;
        xVar.f25810x = true;
        if (xVar.u()) {
            xVar.v(f0Var);
        }
        e eVar = this.contentCaptureManager;
        eVar.B = true;
        if (eVar.e()) {
            eVar.D.c(lq.b0.f15562a);
        }
    }

    public final void v(f0 f0Var, boolean z10, boolean z11) {
        f0 f0VarC;
        f0 f0VarC2;
        x1.v0 v0Var = this.f1172m0;
        if (!z10) {
            if (v0Var.m(f0Var, z11)) {
                B(f0Var);
                return;
            }
            return;
        }
        qm.c cVar = v0Var.f24943b;
        if (f0Var.f24804h == null) {
            u1.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = x1.u0.f24941a[f0Var.t().ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                v0Var.f24949h.b(new x1.t0(f0Var, true, z11));
                return;
            }
            if (i10 != 5) {
                throw new bf.n();
            }
            if (!f0Var.v() || z11) {
                f0Var.b0();
                f0Var.c0();
                if (f0Var.K) {
                    return;
                }
                if ((br.l.a(f0Var.V(), Boolean.TRUE) || x1.v0.f(f0Var)) && ((f0VarC = f0Var.C()) == null || !f0VarC.v())) {
                    cVar.t(f0Var, s.LookaheadMeasurement);
                } else if ((f0Var.T() || x1.v0.g(f0Var)) && ((f0VarC2 = f0Var.C()) == null || !f0VarC2.y())) {
                    cVar.t(f0Var, s.Measurement);
                }
                if (v0Var.f24945d) {
                    return;
                }
                B(f0Var);
            }
        }
    }

    public final void w(f0 f0Var, boolean z10, boolean z11) {
        x1.v0 v0Var = this.f1172m0;
        if (!z10) {
            v0Var.getClass();
            int i10 = x1.u0.f24941a[f0Var.t().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                return;
            }
            if (i10 != 5) {
                throw new bf.n();
            }
            f0 f0VarC = f0Var.C();
            boolean z12 = f0VarC == null || f0VarC.T();
            if (!z11) {
                if (f0Var.y()) {
                    return;
                }
                if (f0Var.s() && f0Var.T() == z12 && f0Var.T() == f0Var.U()) {
                    return;
                }
            }
            f0Var.Z();
            if (!f0Var.K && f0Var.U() && z12) {
                if ((f0VarC == null || !f0VarC.s()) && (f0VarC == null || !f0VarC.y())) {
                    v0Var.f24943b.t(f0Var, s.Placement);
                }
                if (v0Var.f24945d) {
                    return;
                }
                B(null);
                return;
            }
            return;
        }
        qm.c cVar = v0Var.f24943b;
        int i11 = x1.u0.f24941a[f0Var.t().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return;
                }
                if (i11 != 4 && i11 != 5) {
                    throw new bf.n();
                }
            }
            if ((f0Var.v() || f0Var.u()) && !z11) {
                return;
            }
            f0Var.a0();
            f0Var.Z();
            if (f0Var.K) {
                return;
            }
            f0 f0VarC2 = f0Var.C();
            if (br.l.a(f0Var.V(), Boolean.TRUE) && ((f0VarC2 == null || !f0VarC2.v()) && (f0VarC2 == null || !f0VarC2.u()))) {
                cVar.t(f0Var, s.LookaheadPlacement);
            } else if (f0Var.T() && ((f0VarC2 == null || !f0VarC2.s()) && (f0VarC2 == null || !f0VarC2.y()))) {
                cVar.t(f0Var, s.Placement);
            }
            if (v0Var.f24945d) {
                return;
            }
            B(null);
        }
    }

    public final void x() {
        x xVar = this.O;
        xVar.f25810x = true;
        if (xVar.u() && !xVar.I) {
            xVar.I = true;
            xVar.f25798l.post(xVar.K);
        }
        e eVar = this.contentCaptureManager;
        eVar.B = true;
        if (!eVar.e() || eVar.J) {
            return;
        }
        eVar.J = true;
        eVar.E.post(eVar.K);
    }

    public final void y() {
        if (this.f1179s0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            v0 v0Var = this.W0;
            float[] fArr = this.f1175p0;
            v0Var.U(this, fArr);
            e0.o(fArr, this.f1176q0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f1174o0;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = iArr[0];
            float f13 = f11 - iArr[1];
            this.f1180t0 = (Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
        }
    }

    public final void z(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        v0 v0Var = this.W0;
        float[] fArr = this.f1175p0;
        v0Var.U(this, fArr);
        e0.o(fArr, this.f1176q0);
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jK = g1.f0.k((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jK >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jK & 4294967295L));
        this.f1180t0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        br.l.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public g getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public y1.h getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.ui.node.Owner
    public i getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public a getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    public t getLayoutNodes() {
        return this.layoutNodes;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public AndroidComposeView m1getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public final void setUncaughtExceptionHandler$ui_release(x1.r1 r1Var) {
    }
}
