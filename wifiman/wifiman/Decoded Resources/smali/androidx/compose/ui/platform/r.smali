.class public final Landroidx/compose/ui/platform/r;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements LE0/m0;
.implements Landroidx/compose/ui/platform/C1;
.implements Ly0/M;
.implements Landroidx/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/r$a;,
        Landroidx/compose/ui/platform/r$b;
    }
.end annotation


# static fields
.field public static final V1:Landroidx/compose/ui/platform/r$a;

.field public static final W1:I

.field private static X1:Ljava/lang/Class;

.field private static Y1:Ljava/lang/reflect/Method;


# instance fields
.field private final A:Ly0/g;

.field private final A1:Landroidx/compose/ui/platform/n1;

.field private final B:Ly0/C;

.field private final B1:LQ0/j$a;

.field private C:Lmh/l;

.field private final C1:LT/q0;

.field private final D:Lg0/a;

.field private D1:I

.field private E:Z

.field private final E1:LT/q0;

.field private final F:Landroidx/compose/ui/platform/k;

.field private final F1:Lu0/a;

.field private final G:LE0/o0;

.field private final G1:Lv0/c;

.field private H:Z

.field private final H1:LD0/f;

.field private I:Landroidx/compose/ui/platform/Z;

.field private final I1:Landroidx/compose/ui/platform/q1;

.field private J:Landroidx/compose/ui/platform/r0;

.field private J1:Landroid/view/MotionEvent;

.field private K1:J

.field private final L1:Landroidx/compose/ui/platform/D1;

.field private final M1:LV/b;

.field private N:LY0/b;

.field private final N1:Landroidx/compose/ui/platform/r$u;

.field private final O1:Ljava/lang/Runnable;

.field private P1:Z

.field private final Q1:Lmh/a;

.field private final R1:Landroidx/compose/ui/platform/a0;

.field private S1:Z

.field private final T1:LI0/l;

.field private final U1:Ly0/v;

.field private a:J

.field private b:Z

.field private final c:LE0/I;

.field private final d:LT/q0;

.field private final e:LJ0/d;

.field private final f:Landroidx/compose/ui/semantics/EmptySemanticsElement;

.field private f1:Z

.field private final g:Lk0/g;

.field private final g1:LE0/S;

.field private final h:Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

.field private final h1:Landroidx/compose/ui/platform/w1;

.field private i:Ldh/i;

.field private i1:J

.field private final j:Li0/c;

.field private final j1:[I

.field private final k:Landroidx/compose/ui/platform/F1;

.field private final k1:[F

.field private final l:Landroidx/compose/ui/e;

.field private final l1:[F

.field private final m:Landroidx/compose/ui/e;

.field private final m1:[F

.field private final n:Lm0/o0;

.field private n1:J

.field private final o:LE0/G;

.field private o1:Z

.field private final p:LE0/u0;

.field private p1:J

.field private final q:LJ0/p;

.field private q1:Z

.field private final r:Landroidx/compose/ui/platform/x;

.field private final r1:LT/q0;

.field private s:Lh0/b;

.field private final s1:LT/z1;

.field private final t:Landroidx/compose/ui/platform/j;

.field private t1:Lmh/l;

.field private final u:Lm0/H0;

.field private final u1:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private final v:Lg0/i;

.field private final v1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final w:Ljava/util/List;

.field private final w1:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

.field private x:Ljava/util/List;

.field private final x1:LR0/V;

.field private y:Z

.field private final y1:LR0/T;

.field private z:Z

.field private final z1:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/platform/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/r$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/r;->V1:Landroidx/compose/ui/platform/r$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/r;->W1:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldh/i;)V
    .locals 13

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/r;->a:J

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->b:Z

    new-instance v2, LE0/I;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1, v3}, LE0/I;-><init>(Lo0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->c:LE0/I;

    invoke-static {p1}, LY0/a;->a(Landroid/content/Context;)LY0/d;

    move-result-object v2

    invoke-static {}, LT/o1;->m()LT/n1;

    move-result-object v4

    invoke-static {v2, v4}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->d:LT/q0;

    new-instance v2, LJ0/d;

    invoke-direct {v2}, LJ0/d;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->e:LJ0/d;

    new-instance v4, Landroidx/compose/ui/semantics/EmptySemanticsElement;

    invoke-direct {v4, v2}, Landroidx/compose/ui/semantics/EmptySemanticsElement;-><init>(LJ0/d;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->f:Landroidx/compose/ui/semantics/EmptySemanticsElement;

    new-instance v12, Landroidx/compose/ui/focus/FocusOwnerImpl;

    new-instance v6, Landroidx/compose/ui/platform/r$i;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$i;-><init>(Ljava/lang/Object;)V

    new-instance v7, Landroidx/compose/ui/platform/r$j;

    invoke-direct {v7, p0}, Landroidx/compose/ui/platform/r$j;-><init>(Ljava/lang/Object;)V

    new-instance v8, Landroidx/compose/ui/platform/r$k;

    invoke-direct {v8, p0}, Landroidx/compose/ui/platform/r$k;-><init>(Ljava/lang/Object;)V

    new-instance v9, Landroidx/compose/ui/platform/r$l;

    invoke-direct {v9, p0}, Landroidx/compose/ui/platform/r$l;-><init>(Ljava/lang/Object;)V

    new-instance v10, Landroidx/compose/ui/platform/r$m;

    invoke-direct {v10, p0}, Landroidx/compose/ui/platform/r$m;-><init>(Ljava/lang/Object;)V

    new-instance v11, Landroidx/compose/ui/platform/r$n;

    invoke-direct {v11, p0}, Landroidx/compose/ui/platform/r$n;-><init>(Ljava/lang/Object;)V

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, Landroidx/compose/ui/focus/FocusOwnerImpl;-><init>(Lmh/l;Lmh/p;Lmh/l;Lmh/a;Lmh/a;Lmh/a;)V

    iput-object v12, p0, Landroidx/compose/ui/platform/r;->g:Lk0/g;

    new-instance v5, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

    new-instance v6, Landroidx/compose/ui/platform/r$h;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$h;-><init>(Ljava/lang/Object;)V

    invoke-direct {v5, v6}, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;-><init>(Lmh/q;)V

    iput-object v5, p0, Landroidx/compose/ui/platform/r;->h:Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->i:Ldh/i;

    iput-object v5, p0, Landroidx/compose/ui/platform/r;->j:Li0/c;

    new-instance p2, Landroidx/compose/ui/platform/F1;

    invoke-direct {p2}, Landroidx/compose/ui/platform/F1;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v6, Landroidx/compose/ui/platform/r$p;

    invoke-direct {v6, p0}, Landroidx/compose/ui/platform/r$p;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-static {p2, v6}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v6

    iput-object v6, p0, Landroidx/compose/ui/platform/r;->l:Landroidx/compose/ui/e;

    sget-object v7, Landroidx/compose/ui/platform/r$v;->a:Landroidx/compose/ui/platform/r$v;

    invoke-static {p2, v7}, Landroidx/compose/ui/input/rotary/a;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v7

    iput-object v7, p0, Landroidx/compose/ui/platform/r;->m:Landroidx/compose/ui/e;

    new-instance v8, Lm0/o0;

    invoke-direct {v8}, Lm0/o0;-><init>()V

    iput-object v8, p0, Landroidx/compose/ui/platform/r;->n:Lm0/o0;

    new-instance v8, LE0/G;

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-direct {v8, v10, v10, v9, v3}, LE0/G;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v9, Landroidx/compose/ui/layout/v;->b:Landroidx/compose/ui/layout/v;

    invoke-virtual {v8, v9}, LE0/G;->i(LC0/C;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getDensity()LY0/d;

    move-result-object v9

    invoke-virtual {v8, v9}, LE0/G;->a(LY0/d;)V

    invoke-virtual {p2, v4}, Landroidx/compose/ui/e$a;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-interface {p2, v7}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-interface {p2, v6}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v4

    invoke-interface {v4}, Lk0/g;->b()Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {p2, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {v5}, Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;->d()Landroidx/compose/ui/e;

    move-result-object v4

    invoke-interface {p2, v4}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {v8, p2}, LE0/G;->g(Landroidx/compose/ui/e;)V

    iput-object v8, p0, Landroidx/compose/ui/platform/r;->o:LE0/G;

    iput-object p0, p0, Landroidx/compose/ui/platform/r;->p:LE0/u0;

    new-instance p2, LJ0/p;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v4

    invoke-direct {p2, v4, v2}, LJ0/p;-><init>(LE0/G;LJ0/d;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->q:LJ0/p;

    new-instance p2, Landroidx/compose/ui/platform/x;

    invoke-direct {p2, p0}, Landroidx/compose/ui/platform/x;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    new-instance v2, Lh0/b;

    new-instance v4, Landroidx/compose/ui/platform/r$f;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$f;-><init>(Ljava/lang/Object;)V

    invoke-direct {v2, p0, v4}, Lh0/b;-><init>(Landroidx/compose/ui/platform/r;Lmh/a;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    new-instance v2, Landroidx/compose/ui/platform/j;

    invoke-direct {v2, p1}, Landroidx/compose/ui/platform/j;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->t:Landroidx/compose/ui/platform/j;

    invoke-static {p0}, Lm0/M;->a(Landroid/view/ViewGroup;)Lm0/H0;

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->u:Lm0/H0;

    new-instance v2, Lg0/i;

    invoke-direct {v2}, Lg0/i;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->v:Lg0/i;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    new-instance v2, Ly0/g;

    invoke-direct {v2}, Ly0/g;-><init>()V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    new-instance v2, Ly0/C;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v4

    invoke-direct {v2, v4}, Ly0/C;-><init>(LE0/G;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    sget-object v2, Landroidx/compose/ui/platform/r$e;->a:Landroidx/compose/ui/platform/r$e;

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->C:Lmh/l;

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->d0()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lg0/a;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAutofillTree()Lg0/i;

    move-result-object v4

    invoke-direct {v2, p0, v4}, Lg0/a;-><init>(Landroid/view/View;Lg0/i;)V

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iput-object v2, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    new-instance v2, Landroidx/compose/ui/platform/k;

    invoke-direct {v2, p1}, Landroidx/compose/ui/platform/k;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->F:Landroidx/compose/ui/platform/k;

    new-instance v2, LE0/o0;

    new-instance v4, Landroidx/compose/ui/platform/r$w;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$w;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-direct {v2, v4}, LE0/o0;-><init>(Lmh/l;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->G:LE0/o0;

    new-instance v2, LE0/S;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v4

    invoke-direct {v2, v4}, LE0/S;-><init>(LE0/G;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    new-instance v2, Landroidx/compose/ui/platform/V;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/compose/ui/platform/V;-><init>(Landroid/view/ViewConfiguration;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->h1:Landroidx/compose/ui/platform/w1;

    const v2, 0x7fffffff

    invoke-static {v2, v2}, LY0/o;->a(II)J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->i1:J

    filled-new-array {v10, v10}, [I

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->j1:[I

    invoke-static {v3, v1, v3}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v2

    iput-object v2, p0, Landroidx/compose/ui/platform/r;->k1:[F

    invoke-static {v3, v1, v3}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-static {v3, v1, v3}, Lm0/O0;->c([FILkotlin/jvm/internal/DefaultConstructorMarker;)[F

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->m1:[F

    const-wide/16 v6, -0x1

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->n1:J

    invoke-virtual {v0}, Ll0/g$a;->a()J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->p1:J

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->q1:Z

    const/4 v0, 0x2

    invoke-static {v3, v3, v0, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->r1:LT/q0;

    new-instance v4, Landroidx/compose/ui/platform/r$z;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$z;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-static {v4}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->s1:LT/z1;

    new-instance v4, Landroidx/compose/ui/platform/n;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/n;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->u1:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    new-instance v4, Landroidx/compose/ui/platform/o;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/o;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->v1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    new-instance v4, Landroidx/compose/ui/platform/p;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/p;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->w1:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    new-instance v4, LR0/V;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v6

    invoke-direct {v4, v6, p0}, LR0/V;-><init>(Landroid/view/View;Ly0/M;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->x1:LR0/V;

    new-instance v6, LR0/T;

    invoke-static {}, Landroidx/compose/ui/platform/M;->h()Lmh/l;

    move-result-object v7

    invoke-interface {v7, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LR0/L;

    invoke-direct {v6, v4}, LR0/T;-><init>(LR0/L;)V

    iput-object v6, p0, Landroidx/compose/ui/platform/r;->y1:LR0/T;

    invoke-static {}, Lf0/k;->a()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->z1:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v4, Landroidx/compose/ui/platform/m0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getTextInputService()LR0/T;

    move-result-object v6

    invoke-direct {v4, v6}, Landroidx/compose/ui/platform/m0;-><init>(LR0/T;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->A1:Landroidx/compose/ui/platform/n1;

    new-instance v4, Landroidx/compose/ui/platform/N;

    invoke-direct {v4, p1}, Landroidx/compose/ui/platform/N;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->B1:LQ0/j$a;

    invoke-static {p1}, LQ0/o;->a(Landroid/content/Context;)LQ0/k$b;

    move-result-object v4

    invoke-static {}, LT/o1;->m()LT/n1;

    move-result-object v6

    invoke-static {v4, v6}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object v4

    iput-object v4, p0, Landroidx/compose/ui/platform/r;->C1:LT/q0;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/compose/ui/platform/r;->o0(Landroid/content/res/Configuration;)I

    move-result v4

    iput v4, p0, Landroidx/compose/ui/platform/r;->D1:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/h;->e(I)LY0/t;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, LY0/t;->Ltr:LY0/t;

    :cond_1
    invoke-static {p1, v3, v0, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->E1:LT/q0;

    new-instance p1, Lu0/c;

    invoke-direct {p1, p0}, Lu0/c;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->F1:Lu0/a;

    new-instance p1, Lv0/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v0}, Lv0/a$a;->b()I

    move-result v0

    goto :goto_1

    :cond_2
    sget-object v0, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v0}, Lv0/a$a;->a()I

    move-result v0

    :goto_1
    new-instance v4, Landroidx/compose/ui/platform/r$c;

    invoke-direct {v4, p0}, Landroidx/compose/ui/platform/r$c;-><init>(Landroidx/compose/ui/platform/r;)V

    invoke-direct {p1, v0, v4, v3}, Lv0/c;-><init>(ILmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->G1:Lv0/c;

    new-instance p1, LD0/f;

    invoke-direct {p1, p0}, LD0/f;-><init>(LE0/m0;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->H1:LD0/f;

    new-instance p1, Landroidx/compose/ui/platform/P;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/P;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->I1:Landroidx/compose/ui/platform/q1;

    new-instance p1, Landroidx/compose/ui/platform/D1;

    invoke-direct {p1}, Landroidx/compose/ui/platform/D1;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->L1:Landroidx/compose/ui/platform/D1;

    new-instance p1, LV/b;

    const/16 v0, 0x10

    new-array v0, v0, [Lmh/a;

    invoke-direct {p1, v0, v10}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    new-instance p1, Landroidx/compose/ui/platform/r$u;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$u;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->N1:Landroidx/compose/ui/platform/r$u;

    new-instance p1, Landroidx/compose/ui/platform/q;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/q;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    new-instance p1, Landroidx/compose/ui/platform/r$t;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$t;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->Q1:Lmh/a;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-ge p1, v0, :cond_3

    new-instance v4, Landroidx/compose/ui/platform/b0;

    invoke-direct {v4, v2, v3}, Landroidx/compose/ui/platform/b0;-><init>([FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_3
    new-instance v4, Landroidx/compose/ui/platform/d0;

    invoke-direct {v4}, Landroidx/compose/ui/platform/d0;-><init>()V

    :goto_2
    iput-object v4, p0, Landroidx/compose/ui/platform/r;->R1:Landroidx/compose/ui/platform/a0;

    iget-object v2, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {p0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    sget-object v2, Landroidx/compose/ui/platform/L;->a:Landroidx/compose/ui/platform/L;

    invoke-virtual {v2, p0, v1, v10}, Landroidx/compose/ui/platform/L;->a(Landroid/view/View;IZ)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {p0, p2}, LF1/W;->m0(Landroid/view/View;LF1/a;)V

    sget-object p2, Landroidx/compose/ui/platform/C1;->d0:Landroidx/compose/ui/platform/C1$a;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/C1$a;->a()Lmh/l;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p2, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p0, v5}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object p2

    invoke-virtual {p2, p0}, LE0/G;->u(LE0/m0;)V

    if-lt p1, v0, :cond_5

    sget-object p2, Landroidx/compose/ui/platform/D;->a:Landroidx/compose/ui/platform/D;

    invoke-virtual {p2, p0}, Landroidx/compose/ui/platform/D;->a(Landroid/view/View;)V

    :cond_5
    const/16 p2, 0x1f

    if-lt p1, p2, :cond_6

    new-instance v3, LI0/l;

    invoke-direct {v3}, LI0/l;-><init>()V

    :cond_6
    iput-object v3, p0, Landroidx/compose/ui/platform/r;->T1:LI0/l;

    new-instance p1, Landroidx/compose/ui/platform/r$q;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/r$q;-><init>(Landroidx/compose/ui/platform/r;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->U1:Ly0/v;

    return-void
.end method

.method private final B0()V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    :cond_1
    return-void
.end method

.method private final C0()Ll0/i;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-interface {v0}, Lk0/g;->i()Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroidx/compose/ui/focus/h;->a(Landroid/view/View;)Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static synthetic D(Landroidx/compose/ui/platform/r;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/r;->U0(Landroidx/compose/ui/platform/r;Z)V

    return-void
.end method

.method private final D0(I)Z
    .locals 4

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Landroidx/compose/ui/focus/d;->l(II)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/d;->l(II)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/focus/h;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->C0()Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm0/b1;->b(Ll0/i;)Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, p0, v3, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1, p1, v0}, Landroidx/compose/ui/focus/h;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    move-result v2

    :cond_3
    return v2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid focus direction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    return v2
.end method

.method public static synthetic E(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->P0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final E0(Landroidx/compose/ui/focus/d;Ll0/i;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/h;->c(I)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_1
    const/16 p1, 0x82

    :goto_0
    if-eqz p2, :cond_2

    invoke-static {p2}, Lm0/b1;->b(Ll0/i;)Landroid/graphics/Rect;

    move-result-object p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_3
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic F(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->O0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final F0(II)J
    .locals 2

    int-to-long v0, p1

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    int-to-long p1, p2

    invoke-static {p1, p2}, LYg/E;->b(J)J

    move-result-wide p1

    or-long/2addr p1, v0

    invoke-static {p1, p2}, LYg/E;->b(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public static synthetic G(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/r;->p0(Landroidx/compose/ui/platform/r;)V

    return-void
.end method

.method private final G0()V
    .locals 6

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->o1:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->n1:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->n1:J

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->I0()V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v1, p0

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->j1:[I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->j1:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    int-to-float v5, v5

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->j1:[I

    aget v1, v0, v2

    int-to-float v1, v1

    aget v0, v0, v4

    int-to-float v0, v0

    sub-float/2addr v3, v1

    sub-float/2addr v5, v0

    invoke-static {v3, v5}, Ll0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->p1:J

    :cond_1
    return-void
.end method

.method public static final synthetic H(Landroidx/compose/ui/platform/r;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/r;->c0(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    return-void
.end method

.method private final H0(Landroid/view/MotionEvent;)V
    .locals 4

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->n1:J

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->I0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lm0/O0;->f([FJ)J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {v2, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/r;->p1:J

    return-void
.end method

.method public static final synthetic I(Landroidx/compose/ui/platform/r;Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method private final I0()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->R1:Landroidx/compose/ui/platform/a0;

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-interface {v0, p0, v1}, Landroidx/compose/ui/platform/a0;->a(Landroid/view/View;[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l1:[F

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->m1:[F

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/D0;->a([F[F)Z

    return-void
.end method

.method public static final synthetic J(Landroidx/compose/ui/platform/r;I)Landroid/view/View;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->l0(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/x;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    return-object p0
.end method

.method public static final synthetic L()Ljava/lang/reflect/Method;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/r;->Y1:Ljava/lang/reflect/Method;

    return-object v0
.end method

.method public static final synthetic M(Landroidx/compose/ui/platform/r;)Landroid/view/MotionEvent;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    return-object p0
.end method

.method private final M0(LE0/G;)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_1

    :goto_0
    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/G;->f0()LE0/G$g;

    move-result-object v0

    sget-object v1, LE0/G$g;->InMeasureBlock:LE0/G$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->g0(LE0/G;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_4
    :goto_2
    return-void
.end method

.method public static final synthetic N(Landroidx/compose/ui/platform/r;)J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->K1:J

    return-wide v0
.end method

.method static synthetic N0(Landroidx/compose/ui/platform/r;LE0/G;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->M0(LE0/G;)V

    return-void
.end method

.method public static final synthetic O(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/r$u;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->N1:Landroidx/compose/ui/platform/r$u;

    return-object p0
.end method

.method private static final O0(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->V0()V

    return-void
.end method

.method public static final synthetic P()Ljava/lang/Class;
    .locals 1

    sget-object v0, Landroidx/compose/ui/platform/r;->X1:Ljava/lang/Class;

    return-object v0
.end method

.method private static final P0(Landroidx/compose/ui/platform/r;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->P1:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->Q0(Landroid/view/MotionEvent;)I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "The ACTION_HOVER_EXIT event was not cleared."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic Q(Landroidx/compose/ui/platform/r;)Landroidx/compose/ui/platform/r$b;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->get_viewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object p0

    return-object p0
.end method

.method private final Q0(Landroid/view/MotionEvent;)I
    .locals 5

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->S1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->S1:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v2

    invoke-static {v2}, Ly0/K;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/F1;->b(I)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    invoke-virtual {v0, p1, p0}, Ly0/g;->c(Landroid/view/MotionEvent;Ly0/M;)Ly0/A;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ly0/A;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_3

    :goto_0
    add-int/lit8 v3, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ly0/B;

    invoke-virtual {v4}, Ly0/B;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v2, 0x0

    :goto_2
    check-cast v2, Ly0/B;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ly0/B;->f()J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/r;->a:J

    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->y0(Landroid/view/MotionEvent;)Z

    move-result v2

    invoke-virtual {v1, v0, p0, v2}, Ly0/C;->b(Ly0/A;Ly0/M;Z)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v2, 0x5

    if-ne v1, v2, :cond_7

    :cond_5
    invoke-static {v0}, Ly0/N;->c(I)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    invoke-virtual {v1, p1}, Ly0/g;->e(I)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    invoke-virtual {p1}, Ly0/C;->c()V

    invoke-static {v1, v1}, Ly0/D;->a(ZZ)I

    move-result v0

    :cond_7
    :goto_3
    return v0
.end method

.method public static final synthetic R(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->B0()V

    return-void
.end method

.method private final R0(Landroid/view/MotionEvent;IJZ)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v15, 0x1

    if-eq v2, v15, :cond_1

    const/4 v6, 0x6

    if-eq v2, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x9

    if-eq v5, v2, :cond_2

    const/16 v2, 0xa

    if-eq v5, v2, :cond_2

    move v3, v4

    :cond_2
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ltz v3, :cond_3

    move v6, v15

    goto :goto_1

    :cond_3
    move v6, v4

    :goto_1
    sub-int v6, v2, v6

    if-nez v6, :cond_4

    return-void

    :cond_4
    new-array v7, v6, [Landroid/view/MotionEvent$PointerProperties;

    move v2, v4

    :goto_2
    if-ge v2, v6, :cond_5

    new-instance v8, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v8}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    aput-object v8, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v6, [Landroid/view/MotionEvent$PointerCoords;

    move v2, v4

    :goto_3
    if-ge v2, v6, :cond_6

    new-instance v9, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v9}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v9, v8, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_4
    if-ge v2, v6, :cond_9

    if-ltz v3, :cond_8

    if-ge v2, v3, :cond_7

    goto :goto_5

    :cond_7
    move v9, v15

    goto :goto_6

    :cond_8
    :goto_5
    move v9, v4

    :goto_6
    add-int/2addr v9, v2

    aget-object v10, v7, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    aget-object v10, v8, v2

    invoke-virtual {v1, v9, v10}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    iget v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    iget v11, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-static {v9, v11}, Ll0/h;->a(FF)J

    move-result-wide v11

    invoke-virtual {v0, v11, v12}, Landroidx/compose/ui/platform/r;->q(J)J

    move-result-wide v11

    invoke-static {v11, v12}, Ll0/g;->m(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->x:F

    invoke-static {v11, v12}, Ll0/g;->n(J)F

    move-result v9

    iput v9, v10, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_9
    if-eqz p5, :cond_a

    move v10, v4

    goto :goto_7

    :cond_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    move v10, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    cmp-long v2, v2, v11

    if-nez v2, :cond_b

    move-wide/from16 v2, p3

    goto :goto_8

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v16

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v17

    move-wide v1, v2

    move-wide/from16 v3, p3

    move/from16 v5, p2

    move/from16 v15, v16

    move/from16 v16, v17

    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    invoke-virtual {v2, v1, v0}, Ly0/g;->c(Landroid/view/MotionEvent;Ly0/M;)Ly0/A;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Ly0/C;->b(Ly0/A;Ly0/M;Z)I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public static final synthetic S(Landroidx/compose/ui/platform/r;)Ll0/i;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->C0()Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method static synthetic S0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x1

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/r;->R0(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method public static final synthetic T(Landroidx/compose/ui/platform/r;I)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->D0(I)Z

    move-result p0

    return p0
.end method

.method private final T0(Li0/h;JLmh/l;)Z
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    invoke-static {v1, v0}, LY0/f;->a(FF)LY0/d;

    move-result-object v3

    new-instance v0, Li0/a;

    const/4 v7, 0x0

    move-object v2, v0

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v2 .. v7}, Li0/a;-><init>(LY0/d;JLmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Landroidx/compose/ui/platform/E;->a:Landroidx/compose/ui/platform/E;

    invoke-virtual {p2, p0, p1, v0}, Landroidx/compose/ui/platform/E;->a(Landroid/view/View;Li0/h;Li0/a;)Z

    move-result p1

    return p1
.end method

.method public static final synthetic U(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/focus/d;Ll0/i;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/r;->E0(Landroidx/compose/ui/focus/d;Ll0/i;)Z

    move-result p0

    return p0
.end method

.method private static final U0(Landroidx/compose/ui/platform/r;Z)V
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/r;->G1:Lv0/c;

    if-eqz p1, :cond_0

    sget-object p1, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {p1}, Lv0/a$a;->b()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {p1}, Lv0/a$a;->a()I

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Lv0/c;->b(I)V

    return-void
.end method

.method public static final synthetic V(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/compose/ui/platform/r;->R0(Landroid/view/MotionEvent;IJZ)V

    return-void
.end method

.method private final V0()V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->j1:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->i1:J

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->j1:[I

    const/4 v3, 0x0

    aget v4, v1, v3

    const/4 v5, 0x1

    if-ne v2, v4, :cond_0

    aget v6, v1, v5

    if-eq v0, v6, :cond_1

    :cond_0
    aget v1, v1, v5

    invoke-static {v4, v1}, LY0/o;->a(II)J

    move-result-wide v6

    iput-wide v6, p0, Landroidx/compose/ui/platform/r;->i1:J

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->U()LE0/L;

    move-result-object v0

    invoke-virtual {v0}, LE0/L;->I()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->S1()V

    move v3, v5

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, v3}, LE0/S;->c(Z)V

    return-void
.end method

.method public static final synthetic W(Ljava/lang/reflect/Method;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/r;->Y1:Ljava/lang/reflect/Method;

    return-void
.end method

.method public static final synthetic X(Landroidx/compose/ui/platform/r;LY0/t;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->setLayoutDirection(LY0/t;)V

    return-void
.end method

.method public static final synthetic Y(Landroidx/compose/ui/platform/r;J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/r;->K1:J

    return-void
.end method

.method public static final synthetic Z(Ljava/lang/Class;)V
    .locals 0

    sput-object p0, Landroidx/compose/ui/platform/r;->X1:Ljava/lang/Class;

    return-void
.end method

.method public static final synthetic a0(Landroidx/compose/ui/platform/r;Li0/h;JLmh/l;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/r;->T0(Li0/h;JLmh/l;)Z

    move-result p0

    return p0
.end method

.method private final c0(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->e0()Lo/x;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lo/i;->e(II)I

    move-result p1

    if-eq p1, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->d0()Lo/x;

    move-result-object v0

    invoke-virtual {v0, p1, v1}, Lo/i;->e(II)I

    move-result p1

    if-eq p1, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final d0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private final g0(LE0/G;)Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->f1:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/G;->N()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime LYg/e;
    .end annotation

    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    return-void
.end method

.method private final get_viewTreeOwners()Landroidx/compose/ui/platform/r$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r1:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/r$b;

    return-object v0
.end method

.method private final h0(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroidx/compose/ui/platform/r;

    if-eqz v3, :cond_0

    check-cast v2, Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->x()V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->h0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final i0(I)J
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p1}, Landroidx/compose/ui/platform/r;->F0(II)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const p1, 0x7fffffff

    invoke-direct {p0, v2, p1}, Landroidx/compose/ui/platform/r;->F0(II)J

    move-result-wide v0

    goto :goto_0

    :cond_2
    invoke-direct {p0, v2, p1}, Landroidx/compose/ui/platform/r;->F0(II)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final j0()V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->z:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->z:Z

    :cond_0
    return-void
.end method

.method private final l0(I)Landroid/view/View;
    .locals 4

    move-object v0, p0

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Landroidx/compose/ui/platform/M;->a(Landroid/view/View;Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final m0(ILandroid/view/View;)Landroid/view/View;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    const-class v0, Landroid/view/View;

    const-string v1, "getAccessibilityViewId"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Landroidx/compose/ui/platform/r;->m0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final o0(Landroid/content/res/Configuration;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Landroidx/compose/ui/platform/m;->a(Landroid/content/res/Configuration;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static final p0(Landroidx/compose/ui/platform/r;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->V0()V

    return-void
.end method

.method private final q0(Landroid/view/MotionEvent;)I
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->N1:Landroidx/compose/ui/platform/r$u;

    invoke-virtual {v9, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v10, 0x0

    :try_start_0
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->H0(Landroid/view/MotionEvent;)V

    const/4 v11, 0x1

    iput-boolean v11, v9, Landroidx/compose/ui/platform/r;->o1:Z

    invoke-virtual {v9, v10}, Landroidx/compose/ui/platform/r;->a(Z)V

    const-string v1, "AndroidOwner:onTouch"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v12

    iget-object v13, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    const/4 v14, 0x3

    if-eqz v13, :cond_0

    invoke-virtual {v13, v10}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v1

    if-ne v1, v14, :cond_0

    move v15, v11

    goto :goto_0

    :cond_0
    move v15, v10

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :goto_0
    const/16 v8, 0xa

    if-eqz v13, :cond_1

    invoke-direct {v9, v0, v13}, Landroidx/compose/ui/platform/r;->s0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {v9, v13}, Landroidx/compose/ui/platform/r;->x0(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    invoke-virtual {v1}, Ly0/C;->c()V

    :cond_1
    move v11, v8

    goto :goto_1

    :cond_2
    invoke-virtual {v13}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    if-eq v1, v8, :cond_1

    if-eqz v15, :cond_1

    invoke-virtual {v13}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/16 v7, 0x8

    const/16 v16, 0x0

    const/16 v3, 0xa

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v13

    move v11, v8

    move-object/from16 v8, v16

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/platform/r;->S0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v10}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v1

    if-ne v1, v14, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    move v1, v10

    :goto_2
    const/16 v8, 0x9

    if-nez v15, :cond_4

    if-eqz v1, :cond_4

    if-eq v12, v14, :cond_4

    if-eq v12, v8, :cond_4

    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->y0(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/16 v7, 0x8

    const/4 v12, 0x0

    const/16 v3, 0x9

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v14, v8

    move-object v8, v12

    invoke-static/range {v1 .. v8}, Landroidx/compose/ui/platform/r;->S0(Landroidx/compose/ui/platform/r;Landroid/view/MotionEvent;IJZILjava/lang/Object;)V

    goto :goto_3

    :cond_4
    move v14, v8

    :goto_3
    if-eqz v13, :cond_5

    invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V

    :cond_5
    iget-object v1, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-ne v1, v11, :cond_f

    iget-object v1, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v10}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    goto :goto_4

    :cond_6
    const/4 v1, -0x1

    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v14, :cond_7

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_7

    if-ltz v1, :cond_f

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    invoke-virtual {v2, v1}, Ly0/g;->e(I)V

    goto :goto_9

    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_f

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_f

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    const/high16 v3, 0x7fc00000    # Float.NaN

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    goto :goto_5

    :cond_8
    move v2, v3

    :goto_5
    iget-object v4, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    :cond_9
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    cmpg-float v2, v2, v4

    if-nez v2, :cond_a

    cmpg-float v2, v3, v5

    if-nez v2, :cond_a

    move v2, v10

    goto :goto_6

    :cond_a
    const/4 v2, 0x1

    :goto_6
    iget-object v3, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    goto :goto_7

    :cond_b
    const-wide/16 v3, -0x1

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-eqz v3, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    move v11, v10

    :goto_8
    if-nez v2, :cond_d

    if-eqz v11, :cond_f

    :cond_d
    if-ltz v1, :cond_e

    iget-object v2, v9, Landroidx/compose/ui/platform/r;->A:Ly0/g;

    invoke-virtual {v2, v1}, Ly0/g;->e(I)V

    :cond_e
    iget-object v1, v9, Landroidx/compose/ui/platform/r;->B:Ly0/C;

    invoke-virtual {v1}, Ly0/C;->a()V

    :cond_f
    :goto_9
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, v9, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/r;->Q0(Landroid/view/MotionEvent;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iput-boolean v10, v9, Landroidx/compose/ui/platform/r;->o1:Z

    return v0

    :catchall_1
    move-exception v0

    goto :goto_b

    :goto_a
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_b
    iput-boolean v10, v9, Landroidx/compose/ui/platform/r;->o1:Z

    throw v0
.end method

.method private final r0(Landroid/view/MotionEvent;)Z
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    neg-float v1, v1

    new-instance v8, LA0/b;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, LF1/Z;->h(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v2

    mul-float v3, v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, LF1/Z;->e(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v0

    mul-float v4, v1, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v7

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LA0/b;-><init>(FFJI)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object p1

    invoke-interface {p1, v8}, Lk0/g;->l(LA0/b;)Z

    move-result p1

    return p1
.end method

.method private final s0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p1

    if-eq p2, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private setDensity(LY0/d;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setFontFamilyResolver(LQ0/k$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C1:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setLayoutDirection(LY0/t;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->E1:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_viewTreeOwners(Landroidx/compose/ui/platform/r$b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r1:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final u0(LE0/G;)V
    .locals 3

    invoke-virtual {p1}, LE0/G;->E0()V

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    aget-object v2, p1, v1

    check-cast v2, LE0/G;

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->u0(LE0/G;)V

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v0, :cond_0

    :cond_1
    return-void
.end method

.method private final v0(LE0/G;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LE0/S;->G(LE0/S;LE0/G;ZILjava/lang/Object;)Z

    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v1, p1, v3

    check-cast v1, LE0/G;

    invoke-direct {p0, v1}, Landroidx/compose/ui/platform/r;->v0(LE0/G;)V

    add-int/lit8 v3, v3, 0x1

    if-lt v3, v0, :cond_0

    :cond_1
    return-void
.end method

.method private final w0(Landroid/view/MotionEvent;)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    move v4, v3

    :goto_1
    if-ge v4, v1, :cond_3

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    if-lt v0, v5, :cond_1

    sget-object v0, Landroidx/compose/ui/platform/H0;->a:Landroidx/compose/ui/platform/H0;

    invoke-virtual {v0, p1, v4}, Landroidx/compose/ui/platform/H0;->a(Landroid/view/MotionEvent;I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_3

    :cond_2
    :goto_2
    move v0, v3

    :goto_3
    if-nez v0, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    return v0
.end method

.method private final x0(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method

.method private final y0(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v2, v1, v0

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v1, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final z0(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    const/4 v1, 0x0

    :cond_1
    return v1
.end method


# virtual methods
.method public A(LE0/G;J)V
    .locals 1

    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, p1, p2, p3}, LE0/S;->s(LE0/G;J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p1}, LE0/S;->m()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, p3}, LE0/S;->d(LE0/S;ZILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->j0()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final A0(LE0/l0;Z)V
    .locals 0

    if-nez p2, :cond_0

    iget-boolean p2, p0, Landroidx/compose/ui/platform/r;->y:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->x:Ljava/util/List;

    if-eqz p2, :cond_3

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-boolean p2, p0, Landroidx/compose/ui/platform/r;->y:Z

    if-nez p2, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->x:Ljava/util/List;

    if-nez p2, :cond_2

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/r;->x:Ljava/util/List;

    :cond_2
    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public C(LE0/G;ZZ)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p2, p1, p3}, LE0/S;->B(LE0/G;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, v1, v0, v1}, Landroidx/compose/ui/platform/r;->N0(Landroidx/compose/ui/platform/r;LE0/G;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p2, p1, p3}, LE0/S;->E(LE0/G;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0, v1, v0, v1}, Landroidx/compose/ui/platform/r;->N0(Landroidx/compose/ui/platform/r;LE0/G;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final J0(LE0/l0;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J:Landroidx/compose/ui/platform/r0;

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/x1;->p:Landroidx/compose/ui/platform/x1$c;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x1$c;->b()Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->L1:Landroidx/compose/ui/platform/D1;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/D1;->c(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final K0(Landroidx/compose/ui/viewinterop/c;)V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/r$r;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/r$r;-><init>(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/r;->k(Lmh/a;)V

    return-void
.end method

.method public final L0()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->E:Z

    return-void
.end method

.method public a(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0}, LE0/S;->m()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0}, LE0/S;->n()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    const-string v0, "AndroidOwner:measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->Q1:Lmh/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v1, p1}, LE0/S;->r(Lmh/a;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v2, v0}, LE0/S;->d(LE0/S;ZILjava/lang/Object;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->j0()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_3
    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    :cond_0
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    sget-object p2, LYg/J;->a:LYg/J;

    const/4 p2, -0x1

    .line 4
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, -0x1

    .line 5
    invoke-virtual {p0, p1, v0, p2}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public autofill(Landroid/util/SparseArray;)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lg0/c;->a(Lg0/a;Landroid/util/SparseArray;)V

    :cond_0
    return-void
.end method

.method public b(LE0/G;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->t0(LE0/G;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0, p1}, Lh0/b;->u(LE0/G;)V

    return-void
.end method

.method public final b0(Landroidx/compose/ui/viewinterop/c;LE0/G;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Z;->getHolderToLayoutNode()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    new-instance v0, Landroidx/compose/ui/platform/r$d;

    invoke-direct {v0, p0, p2, p0}, Landroidx/compose/ui/platform/r$d;-><init>(Landroidx/compose/ui/platform/r;LE0/G;Landroidx/compose/ui/platform/r;)V

    invoke-static {p1, v0}, LF1/W;->m0(Landroid/view/View;LF1/a;)V

    return-void
.end method

.method public c(LE0/G;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, p1}, LE0/S;->D(LE0/G;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0, p1}, Landroidx/compose/ui/platform/r;->N0(Landroidx/compose/ui/platform/r;LE0/G;ILjava/lang/Object;)V

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    const/4 v1, 0x0

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->a:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/x;->N(ZIJ)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    const/4 v1, 0x1

    iget-wide v2, p0, Landroidx/compose/ui/platform/r;->a:J

    invoke-virtual {v0, v1, p1, v2, v3}, Landroidx/compose/ui/platform/x;->N(ZIJ)Z

    move-result p1

    return p1
.end method

.method public d(J)J
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->G0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-static {v0, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->u0(LE0/G;)V

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, LE0/m0;->f(LE0/m0;ZILjava/lang/Object;)V

    sget-object v3, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g$a;->n()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->y:Z

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->n:Lm0/o0;

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    invoke-virtual {v3}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v4

    invoke-virtual {v4, p1}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v5

    invoke-virtual {v5, v4, v2}, LE0/G;->B(Lm0/n0;Lp0/c;)V

    invoke-virtual {v1}, Lm0/o0;->a()Lm0/G;

    move-result-object v1

    invoke-virtual {v1, v3}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v3, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LE0/l0;

    invoke-interface {v3}, LE0/l0;->j()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object v1, Landroidx/compose/ui/platform/x1;->p:Landroidx/compose/ui/platform/x1$c;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/x1$c;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_2
    iget-object p1, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->y:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->x:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->w:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/List;->clear()V

    :cond_3
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->P1:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->P1:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_5

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->w0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v0, 0x400000

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->r0(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->q0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Ly0/N;->c(I)Z

    move-result p1

    goto :goto_2

    :cond_4
    :goto_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    goto :goto_2

    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    :goto_2
    return p1
.end method

.method public dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->P1:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->w0(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->V(Landroid/view/MotionEvent;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x7

    if-eq v0, v2, :cond_5

    const/16 v2, 0xa

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->y0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    :cond_4
    invoke-static {p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->P1:Z

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    const-wide/16 v2, 0x8

    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v1

    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->z0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    return v1

    :cond_6
    :goto_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->q0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Ly0/N;->c(I)Z

    move-result p1

    return p1

    :cond_7
    :goto_1
    return v1
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-static {v1}, Ly0/K;->b(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/F1;->b(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-static {p1}, Lw0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lk0/g;->d(Lk0/g;Landroid/view/KeyEvent;Lmh/a;ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-static {p1}, Lw0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    new-instance v2, Landroidx/compose/ui/platform/r$g;

    invoke-direct {v2, p0, p1}, Landroidx/compose/ui/platform/r$g;-><init>(Landroidx/compose/ui/platform/r;Landroid/view/KeyEvent;)V

    invoke-interface {v0, v1, v2}, Lk0/g;->h(Landroid/view/KeyEvent;Lmh/a;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-static {p1}, Lw0/b;->b(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;

    move-result-object v1

    invoke-interface {v0, v1}, Lk0/g;->m(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public dispatchProvideStructure(Landroid/view/ViewStructure;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_0

    sget-object v0, Landroidx/compose/ui/platform/B;->a:Landroidx/compose/ui/platform/B;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroidx/compose/ui/platform/B;->a(Landroid/view/ViewStructure;Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchProvideStructure(Landroid/view/ViewStructure;)V

    :goto_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->P1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J1:Landroid/view/MotionEvent;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/r;->s0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->P1:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->O1:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->w0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->z0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->q0(Landroid/view/MotionEvent;)I

    move-result p1

    invoke-static {p1}, Ly0/N;->b(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    invoke-static {p1}, Ly0/N;->c(I)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    return v1
.end method

.method public e(J)J
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->G0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->m1:[F

    invoke-static {v0, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final e0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/x;->M(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final f0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0, p1}, Lh0/b;->b(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    const-class v1, Landroid/view/View;

    const-string v2, "findViewByAccessibilityIdTraversal"

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Landroid/view/View;

    if-eqz v1, :cond_1

    check-cast p1, Landroid/view/View;

    move-object v0, p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p0}, Landroidx/compose/ui/platform/r;->m0(ILandroid/view/View;)Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-object v0
.end method

.method public focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    if-eqz p1, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/focus/h;->a(Landroid/view/View;)Ll0/i;

    move-result-object v0

    invoke-static {p2}, Landroidx/compose/ui/focus/h;->d(I)Landroidx/compose/ui/focus/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/focus/d;->o()I

    move-result v1

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/platform/r$o;->a:Landroidx/compose/ui/platform/r$o;

    invoke-interface {v2, v1, v0, v3}, Lk0/g;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/lifecycle/o;)V
    .locals 0

    sget-object p1, Landroidx/compose/ui/platform/r;->V1:Landroidx/compose/ui/platform/r$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/r$a;->a(Landroidx/compose/ui/platform/r$a;)Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r;->setShowLayoutBounds(Z)V

    return-void
.end method

.method public bridge synthetic getAccessibilityManager()Landroidx/compose/ui/platform/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAccessibilityManager()Landroidx/compose/ui/platform/j;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()Landroidx/compose/ui/platform/j;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->t:Landroidx/compose/ui/platform/j;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/compose/ui/platform/Z;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/Z;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getAutofill()Lg0/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    return-object v0
.end method

.method public getAutofillTree()Lg0/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->v:Lg0/i;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Landroidx/compose/ui/platform/h0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getClipboardManager()Landroidx/compose/ui/platform/k;

    move-result-object v0

    return-object v0
.end method

.method public getClipboardManager()Landroidx/compose/ui/platform/k;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->F:Landroidx/compose/ui/platform/k;

    return-object v0
.end method

.method public final getConfigurationChangeObserver()Lmh/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmh/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C:Lmh/l;

    return-object v0
.end method

.method public final getContentCaptureManager$ui_release()Lh0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    return-object v0
.end method

.method public getCoroutineContext()Ldh/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->i:Ldh/i;

    return-object v0
.end method

.method public getDensity()LY0/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    return-object v0
.end method

.method public getDragAndDropManager()Li0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->j:Li0/c;

    return-object v0
.end method

.method public getFocusOwner()Lk0/g;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g:Lk0/g;

    return-object v0
.end method

.method public getFocusedRect(Landroid/graphics/Rect;)V
    .locals 2

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->C0()Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Ll0/i;->l()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public getFontFamilyResolver()LQ0/k$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C1:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ0/k$b;

    return-object v0
.end method

.method public getFontLoader()LQ0/j$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->B1:LQ0/j$a;

    return-object v0
.end method

.method public getGraphicsContext()Lm0/H0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->u:Lm0/H0;

    return-object v0
.end method

.method public getHapticFeedBack()Lu0/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->F1:Lu0/a;

    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0}, LE0/S;->m()Z

    move-result v0

    return v0
.end method

.method public getInputModeManager()Lv0/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->G1:Lv0/c;

    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->n1:J

    return-wide v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->E1:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0}, LE0/S;->q()J

    move-result-wide v0

    return-wide v0
.end method

.method public getModifierLocalManager()LD0/f;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->H1:LD0/f;

    return-object v0
.end method

.method public getPlacementScope()Landroidx/compose/ui/layout/t$a;
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/layout/u;->b(LE0/m0;)Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    return-object v0
.end method

.method public getPointerIconService()Ly0/v;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->U1:Ly0/v;

    return-object v0
.end method

.method public getRoot()LE0/G;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->o:LE0/G;

    return-object v0
.end method

.method public getRootForTest()LE0/u0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->p:LE0/u0;

    return-object v0
.end method

.method public final getScrollCaptureInProgress$ui_release()Z
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->T1:LI0/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LI0/l;->c()Z

    move-result v2

    :cond_0
    return v2
.end method

.method public getSemanticsOwner()LJ0/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->q:LJ0/p;

    return-object v0
.end method

.method public getSharedDrawScope()LE0/I;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->c:LE0/I;

    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->H:Z

    return v0
.end method

.method public getSnapshotObserver()LE0/o0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->G:LE0/o0;

    return-object v0
.end method

.method public getSoftwareKeyboardController()Landroidx/compose/ui/platform/n1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->A1:Landroidx/compose/ui/platform/n1;

    return-object v0
.end method

.method public getTextInputService()LR0/T;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->y1:LR0/T;

    return-object v0
.end method

.method public getTextToolbar()Landroidx/compose/ui/platform/q1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I1:Landroidx/compose/ui/platform/q1;

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getViewConfiguration()Landroidx/compose/ui/platform/w1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->h1:Landroidx/compose/ui/platform/w1;

    return-object v0
.end method

.method public final getViewTreeOwners()Landroidx/compose/ui/platform/r$b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s1:LT/z1;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/r$b;

    return-object v0
.end method

.method public getWindowInfo()Landroidx/compose/ui/platform/E1;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    return-object v0
.end method

.method public i(LE0/G;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, p1}, LE0/S;->v(LE0/G;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->L0()V

    return-void
.end method

.method public k(Lmh/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v0, p1}, LV/b;->i(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final k0(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/Z;->a(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V

    return-void
.end method

.method public l(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->z:Z

    return-void
.end method

.method public n0(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;
    .locals 6

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    sget-object v2, Lw0/a;->b:Lw0/a$a;

    invoke-virtual {v2}, Lw0/a$a;->l()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {p1}, Lw0/d;->f(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->f()I

    move-result p1

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->e()I

    move-result p1

    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v2}, Lw0/a$a;->e()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->g()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto/16 :goto_6

    :cond_2
    invoke-virtual {v2}, Lw0/a$a;->d()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->d()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto/16 :goto_6

    :cond_3
    invoke-virtual {v2}, Lw0/a$a;->f()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Lw0/a;->p(JJ)Z

    move-result p1

    const/4 v3, 0x1

    if-eqz p1, :cond_4

    move p1, v3

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lw0/a$a;->k()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    :goto_1
    if-eqz p1, :cond_5

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->h()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v2}, Lw0/a$a;->c()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_6

    move p1, v3

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lw0/a$a;->j()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    :goto_2
    if-eqz p1, :cond_7

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->a()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto :goto_6

    :cond_7
    invoke-virtual {v2}, Lw0/a$a;->b()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_8

    move p1, v3

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lw0/a$a;->g()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    :goto_3
    if-eqz p1, :cond_9

    move p1, v3

    goto :goto_4

    :cond_9
    invoke-virtual {v2}, Lw0/a$a;->i()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    :goto_4
    if-eqz p1, :cond_a

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Lw0/a$a;->a()J

    move-result-wide v4

    invoke-static {v0, v1, v4, v5}, Lw0/a;->p(JJ)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v2}, Lw0/a$a;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lw0/a;->p(JJ)Z

    move-result v3

    :goto_5
    if-eqz v3, :cond_c

    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    goto :goto_6

    :cond_c
    const/4 p1, 0x0

    :goto_6
    return-object p1
.end method

.method public o(LE0/G;ZZZ)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p2, p1, p3}, LE0/S;->C(LE0/G;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->M0(LE0/G;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p2, p1, p3}, LE0/S;->F(LE0/G;Z)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->M0(LE0/G;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/F1;->c(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->v0(LE0/G;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->u0(LE0/G;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    invoke-virtual {v0}, LE0/o0;->k()V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    if-eqz v0, :cond_0

    sget-object v1, Lg0/g;->a:Lg0/g;

    invoke-virtual {v1, v0}, Lg0/g;->a(Lg0/a;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/T;->a(Landroid/view/View;)Landroidx/lifecycle/o;

    move-result-object v0

    invoke-static {p0}, Lq2/g;->a(Landroid/view/View;)Lq2/f;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v4

    if-ne v0, v4, :cond_1

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v4

    if-eq v1, v4, :cond_4

    :cond_1
    if-eqz v0, :cond_a

    if-eqz v1, :cond_9

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    :cond_2
    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    new-instance v2, Landroidx/compose/ui/platform/r$b;

    invoke-direct {v2, v0, v1}, Landroidx/compose/ui/platform/r$b;-><init>(Landroidx/lifecycle/o;Lq2/f;)V

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/r;->set_viewTreeOwners(Landroidx/compose/ui/platform/r$b;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->t1:Lmh/l;

    if-eqz v0, :cond_3

    invoke-interface {v0, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iput-object v3, p0, Landroidx/compose/ui/platform/r;->t1:Lmh/l;

    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->G1:Lv0/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v1}, Lv0/a$a;->b()I

    move-result v1

    goto :goto_0

    :cond_5
    sget-object v1, Lv0/a;->b:Lv0/a$a;

    invoke-virtual {v1}, Lv0/a$a;->a()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lv0/c;->b(I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v3

    :cond_6
    if-eqz v3, :cond_8

    invoke-virtual {v3, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->u1:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->v1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->w1:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_7

    sget-object v0, Landroidx/compose/ui/platform/J;->a:Landroidx/compose/ui/platform/J;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/J;->b(Landroid/view/View;)V

    :cond_7
    return-void

    :cond_8
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public onCheckIsTextEditor()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->z1:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lf0/k;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/O;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->x1:LR0/V;

    invoke-virtual {v0}, LR0/V;->r()Z

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroidx/compose/ui/platform/O;->f()Z

    move-result v0

    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LY0/a;->a(Landroid/content/Context;)LY0/d;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->setDensity(LY0/d;)V

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->o0(Landroid/content/res/Configuration;)I

    move-result v0

    iget v1, p0, Landroidx/compose/ui/platform/r;->D1:I

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->o0(Landroid/content/res/Configuration;)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/platform/r;->D1:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LQ0/o;->a(Landroid/content/Context;)LQ0/k$b;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->setFontFamilyResolver(LQ0/k$b;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->C:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->z1:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Lf0/k;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/O;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->x1:LR0/V;

    invoke-virtual {v0, p1}, LR0/V;->o(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/O;->e(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0, p1, p2, p3}, Lh0/b;->s([J[ILjava/util/function/Consumer;)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    invoke-virtual {v0}, LE0/o0;->l()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    invoke-virtual {v0, p0}, Landroidx/lifecycle/k;->c(Landroidx/lifecycle/n;)V

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->d0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    if-eqz v0, :cond_1

    sget-object v1, Lg0/g;->a:Lg0/g;

    invoke-virtual {v1, v0}, Lg0/g;->b(Lg0/a;)V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->u1:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->v1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/r;->w1:Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_2

    sget-object v0, Landroidx/compose/ui/platform/J;->a:Landroidx/compose/ui/platform/J;

    invoke-virtual {v0, p0}, Landroidx/compose/ui/platform/J;->a(Landroid/view/View;)V

    :cond_2
    return-void

    :cond_3
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method protected onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object p1

    invoke-interface {p1}, Lk0/g;->n()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->Q1:Lmh/a;

    invoke-virtual {p1, v0}, LE0/S;->r(Lmh/a;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->N:LY0/b;

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->V0()V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 7

    const-string v0, "AndroidOwner:onMeasure"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->v0(LE0/G;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    :goto_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->i0(I)J

    move-result-wide v0

    const/16 p1, 0x20

    ushr-long v2, v0, p1

    invoke-static {v2, v3}, LYg/E;->b(J)J

    move-result-wide v2

    long-to-int v2, v2

    const-wide v3, 0xffffffffL

    and-long/2addr v0, v3

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/r;->i0(I)J

    move-result-wide v5

    ushr-long p1, v5, p1

    invoke-static {p1, p2}, LYg/E;->b(J)J

    move-result-wide p1

    long-to-int p1, p1

    and-long/2addr v3, v5

    invoke-static {v3, v4}, LYg/E;->b(J)J

    move-result-wide v3

    long-to-int p2, v3

    sget-object v1, LY0/b;->b:LY0/b$a;

    invoke-virtual {v1, v2, v0, p1, p2}, LY0/b$a;->a(IIII)J

    move-result-wide p1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->N:LY0/b;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/r;->N:LY0/b;

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->f1:Z

    goto :goto_2

    :cond_1
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/b;->f(JJ)Z

    move-result v1

    :goto_1
    if-nez v1, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->f1:Z

    :cond_3
    :goto_2
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, p1, p2}, LE0/S;->H(J)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {p1}, LE0/S;->t()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->t0()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object p2

    invoke-virtual {p2}, LE0/G;->O()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object p2

    invoke-virtual {p2}, LE0/G;->t0()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->O()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->d0()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->D:Lg0/a;

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Lg0/c;->b(Lg0/a;Landroid/view/ViewStructure;)V

    :cond_0
    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->b:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/focus/h;->e(I)LY0/t;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LY0/t;->Ltr:LY0/t;

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/r;->setLayoutDirection(LY0/t;)V

    :cond_1
    return-void
.end method

.method public onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/r;->T1:LI0/l;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getCoroutineContext()Ldh/i;

    move-result-object v0

    invoke-virtual {p1, p0, p2, v0, p3}, LI0/l;->d(Landroid/view/View;LJ0/p;Ldh/i;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0, v0, p1}, Lh0/b;->x(Lh0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->k:Landroidx/compose/ui/platform/F1;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/F1;->c(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/r;->S1:Z

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    sget-object p1, Landroidx/compose/ui/platform/r;->V1:Landroidx/compose/ui/platform/r$a;

    invoke-static {p1}, Landroidx/compose/ui/platform/r$a;->a(Landroidx/compose/ui/platform/r$a;)Z

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getShowLayoutBounds()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/r;->setShowLayoutBounds(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->t0()V

    :cond_0
    return-void
.end method

.method public q(J)J
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->G0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-static {v0, p1, p2}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    add-float/2addr v0, v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result p2

    add-float/2addr p1, p2

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide p1

    return-wide p1
.end method

.method public r(J)J
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->G0()V

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result p2

    sub-float/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->m1:[F

    invoke-static {v0, p1}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lm0/O0;->f([FJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    invoke-interface {v0}, Lk0/g;->f()Lk0/l;

    move-result-object v0

    invoke-interface {v0}, Lk0/l;->getHasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/focus/h;->d(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d;->o()I

    move-result p1

    goto :goto_0

    :cond_2
    sget-object p1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/focus/d$a;->b()I

    move-result p1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lm0/b1;->e(Landroid/graphics/Rect;)Ll0/i;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    new-instance v1, Landroidx/compose/ui/platform/r$s;

    invoke-direct {v1, p1}, Landroidx/compose/ui/platform/r$s;-><init>(I)V

    invoke-interface {v0, p1, p2, v1}, Lk0/g;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    return p1
.end method

.method public s(LE0/G;Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->g1:LE0/S;

    invoke-virtual {v0, p1, p2}, LE0/S;->i(LE0/G;Z)V

    return-void
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/x;->S0(J)V

    return-void
.end method

.method public final setConfigurationChangeObserver(Lmh/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->C:Lmh/l;

    return-void
.end method

.method public final setContentCaptureManager$ui_release(Lh0/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    return-void
.end method

.method public setCoroutineContext(Ldh/i;)V
    .locals 12

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->i:Ldh/i;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object p1

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object p1

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    instance-of v0, p1, Ly0/S;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ly0/S;

    invoke-interface {v0}, Ly0/S;->Z1()V

    :cond_0
    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "visitSubtree called on an unattached node"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-static {p1}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p1

    new-instance v3, LE0/Z;

    invoke-direct {v3}, LE0/Z;-><init>()V

    :goto_0
    if-eqz p1, :cond_d

    if-nez v2, :cond_2

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object v2

    invoke-virtual {v2}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v2

    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->a2()I

    move-result v4

    and-int/2addr v4, v1

    const/4 v5, 0x0

    if-eqz v4, :cond_b

    :goto_1
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v1

    if-eqz v4, :cond_a

    move-object v4, v2

    move-object v6, v5

    :goto_2
    if-eqz v4, :cond_a

    instance-of v7, v4, LE0/s0;

    if-eqz v7, :cond_3

    check-cast v4, LE0/s0;

    instance-of v7, v4, Ly0/S;

    if-eqz v7, :cond_9

    check-cast v4, Ly0/S;

    invoke-interface {v4}, Ly0/S;->Z1()V

    goto :goto_5

    :cond_3
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v7

    and-int/2addr v7, v1

    if-eqz v7, :cond_9

    instance-of v7, v4, LE0/m;

    if-eqz v7, :cond_9

    move-object v7, v4

    check-cast v7, LE0/m;

    invoke-virtual {v7}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v7

    const/4 v8, 0x0

    move v9, v8

    :goto_3
    const/4 v10, 0x1

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v1

    if-eqz v11, :cond_7

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v10, :cond_4

    move-object v4, v7

    goto :goto_4

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, LV/b;

    new-array v10, v0, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v10, v8}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v6, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v5

    :cond_6
    invoke-virtual {v6, v7}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_4
    invoke-virtual {v7}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v7

    goto :goto_3

    :cond_8
    if-ne v9, v10, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_a
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_1

    :cond_b
    invoke-virtual {p1}, LE0/G;->w0()LV/b;

    move-result-object p1

    invoke-virtual {v3, p1}, LE0/Z;->c(LV/b;)V

    invoke-virtual {v3}, LE0/Z;->a()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {v3}, LE0/Z;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LE0/G;

    goto :goto_6

    :cond_c
    move-object p1, v5

    :goto_6
    move-object v2, v5

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/r;->n1:J

    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lmh/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmh/l;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Landroidx/compose/ui/platform/r;->t1:Lmh/l;

    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/r;->H:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public t([F)V
    .locals 3

    invoke-direct {p0}, Landroidx/compose/ui/platform/r;->G0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->l1:[F

    invoke-static {p1, v0}, Lm0/O0;->n([F[F)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/r;->p1:J

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/r;->k1:[F

    invoke-static {p1, v0, v1, v2}, Landroidx/compose/ui/platform/M;->d([FFF[F)V

    return-void
.end method

.method public t0()V
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->u0(LE0/G;)V

    return-void
.end method

.method public u(LE0/G;)V
    .locals 0

    return-void
.end method

.method public w(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Landroidx/compose/ui/platform/r$x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/ui/platform/r$x;

    iget v1, v0, Landroidx/compose/ui/platform/r$x;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/r$x;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/r$x;

    invoke-direct {v0, p0, p2}, Landroidx/compose/ui/platform/r$x;-><init>(Landroidx/compose/ui/platform/r;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/ui/platform/r$x;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/r$x;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/ui/platform/r;->z1:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Landroidx/compose/ui/platform/r$y;

    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/r$y;-><init>(Landroidx/compose/ui/platform/r;)V

    iput v3, v0, Landroidx/compose/ui/platform/r$x;->c:I

    invoke-static {p2, v2, p1, v0}, Lf0/k;->d(Ljava/util/concurrent/atomic/AtomicReference;Lmh/l;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public x()V
    .locals 6

    iget-boolean v0, p0, Landroidx/compose/ui/platform/r;->E:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    invoke-virtual {v0}, LE0/o0;->b()V

    iput-boolean v1, p0, Landroidx/compose/ui/platform/r;->E:Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->I:Landroidx/compose/ui/platform/Z;

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/r;->h0(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v0}, LV/b;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v0

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_3

    iget-object v3, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    check-cast v3, Lmh/a;

    iget-object v4, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    const/4 v5, 0x0

    invoke-virtual {v4, v2, v5}, LV/b;->C(ILjava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/platform/r;->M1:LV/b;

    invoke-virtual {v2, v1, v0}, LV/b;->A(II)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public y(Lmh/p;Lmh/a;Lp0/c;)LE0/l0;
    .locals 7

    if-eqz p3, :cond_0

    new-instance v6, Landroidx/compose/ui/platform/u0;

    const/4 v2, 0x0

    move-object v0, v6

    move-object v1, p3

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/u0;-><init>(Lp0/c;Lm0/H0;Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V

    return-object v6

    :cond_0
    iget-object p3, p0, Landroidx/compose/ui/platform/r;->L1:Landroidx/compose/ui/platform/D1;

    invoke-virtual {p3}, Landroidx/compose/ui/platform/D1;->b()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LE0/l0;

    if-eqz p3, :cond_1

    invoke-interface {p3, p1, p2}, LE0/l0;->g(Lmh/p;Lmh/a;)V

    return-object p3

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p3

    if-eqz p3, :cond_2

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-eq p3, v0, :cond_2

    new-instance p3, Landroidx/compose/ui/platform/u0;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getGraphicsContext()Lm0/H0;

    move-result-object v0

    invoke-interface {v0}, Lm0/H0;->b()Lp0/c;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/r;->getGraphicsContext()Lm0/H0;

    move-result-object v3

    move-object v1, p3

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/platform/u0;-><init>(Lp0/c;Lm0/H0;Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V

    return-object p3

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->isHardwareAccelerated()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-boolean p3, p0, Landroidx/compose/ui/platform/r;->q1:Z

    if-eqz p3, :cond_3

    :try_start_0
    new-instance p3, Landroidx/compose/ui/platform/f1;

    invoke-direct {p3, p0, p1, p2}, Landroidx/compose/ui/platform/f1;-><init>(Landroidx/compose/ui/platform/r;Lmh/p;Lmh/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p3

    :catchall_0
    const/4 p3, 0x0

    iput-boolean p3, p0, Landroidx/compose/ui/platform/r;->q1:Z

    :cond_3
    iget-object p3, p0, Landroidx/compose/ui/platform/r;->J:Landroidx/compose/ui/platform/r0;

    if-nez p3, :cond_6

    sget-object p3, Landroidx/compose/ui/platform/x1;->p:Landroidx/compose/ui/platform/x1$c;

    invoke-virtual {p3}, Landroidx/compose/ui/platform/x1$c;->a()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Landroidx/compose/ui/platform/x1$c;->d(Landroid/view/View;)V

    :cond_4
    invoke-virtual {p3}, Landroidx/compose/ui/platform/x1$c;->b()Z

    move-result p3

    if-eqz p3, :cond_5

    new-instance p3, Landroidx/compose/ui/platform/r0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/compose/ui/platform/r0;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_5
    new-instance p3, Landroidx/compose/ui/platform/y1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p3, v0}, Landroidx/compose/ui/platform/y1;-><init>(Landroid/content/Context;)V

    :goto_0
    iput-object p3, p0, Landroidx/compose/ui/platform/r;->J:Landroidx/compose/ui/platform/r0;

    invoke-virtual {p0, p3}, Landroidx/compose/ui/platform/r;->addView(Landroid/view/View;)V

    :cond_6
    new-instance p3, Landroidx/compose/ui/platform/x1;

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->J:Landroidx/compose/ui/platform/r0;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p3, p0, v0, p1, p2}, Landroidx/compose/ui/platform/x1;-><init>(Landroidx/compose/ui/platform/r;Landroidx/compose/ui/platform/r0;Lmh/p;Lmh/a;)V

    return-object p3
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->r:Landroidx/compose/ui/platform/x;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x;->u0()V

    iget-object v0, p0, Landroidx/compose/ui/platform/r;->s:Lh0/b;

    invoke-virtual {v0}, Lh0/b;->v()V

    return-void
.end method
