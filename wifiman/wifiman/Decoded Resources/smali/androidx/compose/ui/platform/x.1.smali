.class public final Landroidx/compose/ui/platform/x;
.super LF1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/platform/x$b;,
        Landroidx/compose/ui/platform/x$c;,
        Landroidx/compose/ui/platform/x$d;,
        Landroidx/compose/ui/platform/x$e;,
        Landroidx/compose/ui/platform/x$f;,
        Landroidx/compose/ui/platform/x$g;,
        Landroidx/compose/ui/platform/x$h;,
        Landroidx/compose/ui/platform/x$i;,
        Landroidx/compose/ui/platform/x$j;
    }
.end annotation


# static fields
.field public static final O:Landroidx/compose/ui/platform/x$d;

.field public static final P:I

.field private static final Q:Lo/k;


# instance fields
.field private A:Landroidx/compose/ui/platform/x$g;

.field private B:Lo/m;

.field private C:Lo/A;

.field private D:Lo/x;

.field private E:Lo/x;

.field private final F:Ljava/lang/String;

.field private final G:Ljava/lang/String;

.field private final H:LT0/t;

.field private I:Lo/z;

.field private J:Landroidx/compose/ui/platform/j1;

.field private K:Z

.field private final L:Ljava/lang/Runnable;

.field private final M:Ljava/util/List;

.field private final N:Lmh/l;

.field private final d:Landroidx/compose/ui/platform/r;

.field private e:I

.field private f:Lmh/l;

.field private final g:Landroid/view/accessibility/AccessibilityManager;

.field private h:Z

.field private i:J

.field private final j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

.field private final k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

.field private l:Ljava/util/List;

.field private final m:Landroid/os/Handler;

.field private n:Landroidx/compose/ui/platform/x$e;

.field private o:I

.field private p:LG1/t;

.field private q:Z

.field private final r:Lo/z;

.field private final s:Lo/z;

.field private t:Lo/W;

.field private u:Lo/W;

.field private v:I

.field private w:Ljava/lang/Integer;

.field private final x:Lo/b;

.field private final y:LKi/g;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 33

    new-instance v0, Landroidx/compose/ui/platform/x$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/x$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/platform/x;->O:Landroidx/compose/ui/platform/x$d;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/platform/x;->P:I

    sget v1, Lf0/h;->a:I

    sget v2, Lf0/h;->b:I

    sget v3, Lf0/h;->m:I

    sget v4, Lf0/h;->x:I

    sget v5, Lf0/h;->A:I

    sget v6, Lf0/h;->B:I

    sget v7, Lf0/h;->C:I

    sget v8, Lf0/h;->D:I

    sget v9, Lf0/h;->E:I

    sget v10, Lf0/h;->F:I

    sget v11, Lf0/h;->c:I

    sget v12, Lf0/h;->d:I

    sget v13, Lf0/h;->e:I

    sget v14, Lf0/h;->f:I

    sget v15, Lf0/h;->g:I

    sget v16, Lf0/h;->h:I

    sget v17, Lf0/h;->i:I

    sget v18, Lf0/h;->j:I

    sget v19, Lf0/h;->k:I

    sget v20, Lf0/h;->l:I

    sget v21, Lf0/h;->n:I

    sget v22, Lf0/h;->o:I

    sget v23, Lf0/h;->p:I

    sget v24, Lf0/h;->q:I

    sget v25, Lf0/h;->r:I

    sget v26, Lf0/h;->s:I

    sget v27, Lf0/h;->t:I

    sget v28, Lf0/h;->u:I

    sget v29, Lf0/h;->v:I

    sget v30, Lf0/h;->w:I

    sget v31, Lf0/h;->y:I

    sget v32, Lf0/h;->z:I

    filled-new-array/range {v1 .. v32}, [I

    move-result-object v0

    invoke-static {v0}, Lo/l;->a([I)Lo/k;

    move-result-object v0

    sput-object v0, Landroidx/compose/ui/platform/x;->Q:Lo/k;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 5

    invoke-direct {p0}, LF1/a;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/compose/ui/platform/x;->e:I

    new-instance v1, Landroidx/compose/ui/platform/x$m;

    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/x$m;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object v1, p0, Landroidx/compose/ui/platform/x;->f:Lmh/l;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "accessibility"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    const-wide/16 v2, 0x64

    iput-wide v2, p0, Landroidx/compose/ui/platform/x;->i:J

    new-instance v2, Landroidx/compose/ui/platform/u;

    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/u;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/x;->j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    new-instance v2, Landroidx/compose/ui/platform/v;

    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/v;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object v2, p0, Landroidx/compose/ui/platform/x;->k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/ui/platform/x;->l:Ljava/util/List;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Landroidx/compose/ui/platform/x;->m:Landroid/os/Handler;

    new-instance v1, Landroidx/compose/ui/platform/x$e;

    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/x$e;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object v1, p0, Landroidx/compose/ui/platform/x;->n:Landroidx/compose/ui/platform/x$e;

    iput v0, p0, Landroidx/compose/ui/platform/x;->o:I

    new-instance v0, Lo/z;

    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->r:Lo/z;

    new-instance v0, Lo/z;

    invoke-direct {v0, v1, v3, v4}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->s:Lo/z;

    new-instance v0, Lo/W;

    invoke-direct {v0, v1, v3, v4}, Lo/W;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->t:Lo/W;

    new-instance v0, Lo/W;

    invoke-direct {v0, v1, v3, v4}, Lo/W;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->u:Lo/W;

    iput v2, p0, Landroidx/compose/ui/platform/x;->v:I

    new-instance v0, Lo/b;

    invoke-direct {v0, v1, v3, v4}, Lo/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->x:Lo/b;

    const/4 v0, 0x6

    invoke-static {v3, v4, v4, v0, v4}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->y:LKi/g;

    iput-boolean v3, p0, Landroidx/compose/ui/platform/x;->z:Z

    invoke-static {}, Lo/n;->a()Lo/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->B:Lo/m;

    new-instance v0, Lo/A;

    invoke-direct {v0, v1, v3, v4}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->C:Lo/A;

    new-instance v0, Lo/x;

    invoke-direct {v0, v1, v3, v4}, Lo/x;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    new-instance v0, Lo/x;

    invoke-direct {v0, v1, v3, v4}, Lo/x;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    const-string v0, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->F:Ljava/lang/String;

    const-string v0, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->G:Ljava/lang/String;

    new-instance v0, LT0/t;

    invoke-direct {v0}, LT0/t;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->H:LT0/t;

    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->I:Lo/z;

    new-instance v0, Landroidx/compose/ui/platform/j1;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v1

    invoke-virtual {v1}, LJ0/p;->a()LJ0/n;

    move-result-object v1

    invoke-static {}, Lo/n;->a()Lo/m;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->J:Landroidx/compose/ui/platform/j1;

    new-instance v0, Landroidx/compose/ui/platform/x$a;

    invoke-direct {v0, p0}, Landroidx/compose/ui/platform/x$a;-><init>(Landroidx/compose/ui/platform/x;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    new-instance p1, Landroidx/compose/ui/platform/w;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/w;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->L:Ljava/lang/Runnable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    new-instance p1, Landroidx/compose/ui/platform/x$o;

    invoke-direct {p1, p0}, Landroidx/compose/ui/platform/x$o;-><init>(Landroidx/compose/ui/platform/x;)V

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->N:Lmh/l;

    return-void
.end method

.method public static final synthetic A(Landroidx/compose/ui/platform/x;)Lo/z;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->r:Lo/z;

    return-object p0
.end method

.method private static final A0(LJ0/h;)Z
    .locals 2

    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0}, LJ0/h;->a()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p0}, LJ0/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {p0}, LJ0/h;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic B(Landroidx/compose/ui/platform/x;)Lo/z;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->s:Lo/z;

    return-object p0
.end method

.method private final B0(ILjava/util/List;)Z
    .locals 7

    invoke-static {p2, p1}, Landroidx/compose/ui/platform/l1;->a(Ljava/util/List;I)Landroidx/compose/ui/platform/i1;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Landroidx/compose/ui/platform/i1;

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    move v1, p1

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/i1;-><init>(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;LJ0/h;LJ0/h;)V

    const/4 p1, 0x1

    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return p1
.end method

.method public static final synthetic C(Landroidx/compose/ui/platform/x;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->L:Ljava/lang/Runnable;

    return-object p0
.end method

.method private final C0(I)Z
    .locals 9

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->n0(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget v3, p0, Landroidx/compose/ui/platform/x;->o:I

    const/high16 v0, -0x80000000

    if-eq v3, v0, :cond_1

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/high16 v4, 0x10000

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :cond_1
    iput p1, p0, Landroidx/compose/ui/platform/x;->o:I

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const v3, 0x8000

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public static final synthetic D(Landroidx/compose/ui/platform/x;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/platform/x;->q:Z

    return p0
.end method

.method private final D0(Landroidx/compose/ui/platform/i1;)V
    .locals 3

    invoke-virtual {p1}, Landroidx/compose/ui/platform/i1;->h0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSnapshotObserver()LE0/o0;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->N:Lmh/l;

    new-instance v2, Landroidx/compose/ui/platform/x$n;

    invoke-direct {v2, p1, p0}, Landroidx/compose/ui/platform/x$n;-><init>(Landroidx/compose/ui/platform/i1;Landroidx/compose/ui/platform/x;)V

    invoke-virtual {v0, p1, v1, v2}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/platform/x;)Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->k:Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;

    return-object p0
.end method

.method private static final E0(Landroidx/compose/ui/platform/x;)V
    .locals 4

    const-string v0, "measureAndLayout"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/m0;->f(LE0/m0;ZILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "checkForSemanticsChanges"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->P()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    iput-boolean v3, p0, Landroidx/compose/ui/platform/x;->K:Z

    return-void

    :catchall_0
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0

    :catchall_1
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0
.end method

.method public static final synthetic F(Landroidx/compose/ui/platform/x;LE0/G;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->s0(LE0/G;)V

    return-void
.end method

.method private final F0(I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-virtual {v0}, LJ0/p;->a()LJ0/n;

    move-result-object v0

    invoke-virtual {v0}, LJ0/n;->o()I

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    :cond_0
    return p1
.end method

.method public static final synthetic G(Landroidx/compose/ui/platform/x;IILandroid/os/Bundle;)Z
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/platform/x;->v0(IILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method private final G0(LJ0/n;Landroidx/compose/ui/platform/j1;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-static {}, Lo/p;->b()Lo/A;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/n;

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v7

    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lo/m;->a(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/j1;->a()Lo/A;

    move-result-object v7

    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lo/o;->a(I)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p1 .. p1}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/x;->s0(LE0/G;)V

    return-void

    :cond_0
    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v1, v6}, Lo/A;->f(I)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/j1;->a()Lo/A;

    move-result-object v2

    iget-object v3, v2, Lo/o;->b:[I

    iget-object v2, v2, Lo/o;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_6

    move v6, v4

    :goto_1
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_5

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v4

    :goto_2
    if-ge v11, v9, :cond_4

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_3

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v12, v3, v12

    invoke-virtual {v1, v12}, Lo/o;->a(I)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual/range {p1 .. p1}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/x;->s0(LE0/G;)V

    return-void

    :cond_3
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    if-ne v9, v10, :cond_6

    :cond_5
    if-eq v6, v5, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual/range {p1 .. p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_3
    if-ge v4, v2, :cond_8

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/n;

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v5

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/m;->a(I)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v0, Landroidx/compose/ui/platform/x;->I:Lo/z;

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v5, Landroidx/compose/ui/platform/j1;

    invoke-direct {v0, v3, v5}, Landroidx/compose/ui/platform/x;->G0(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method public static final synthetic H(Landroidx/compose/ui/platform/x;Landroidx/compose/ui/platform/i1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->D0(Landroidx/compose/ui/platform/i1;)V

    return-void
.end method

.method private final H0(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v2, 0x800

    if-eq v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const v2, 0x8000

    if-ne v0, v2, :cond_2

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/x;->q:Z

    :cond_2
    :try_start_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->f:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/x;->q:Z

    return p1

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/x;->q:Z

    throw p1
.end method

.method public static final synthetic I(Landroidx/compose/ui/platform/x;I)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result p0

    return p0
.end method

.method private final I0(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 9

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    :cond_1
    if-eqz p4, :cond_2

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v8}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    const-string p2, "sendEvent"

    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return p1

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public static final synthetic J(Landroidx/compose/ui/platform/x;LG1/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->p:LG1/t;

    return-void
.end method

.method static synthetic J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/x;->I0(IILjava/lang/Integer;Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method private final K(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 7

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/k1;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->F:Ljava/lang/String;

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    iget-object p4, p0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    invoke-virtual {p4, p1, v3}, Lo/i;->e(II)I

    move-result p1

    if-eq p1, v3, :cond_b

    invoke-virtual {p2}, LG1/t;->t()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_4

    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/platform/x;->G:Ljava/lang/String;

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p4, p0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    invoke-virtual {p4, p1, v3}, Lo/i;->e(II)I

    move-result p1

    if-eq p1, v3, :cond_b

    invoke-virtual {p2}, LG1/t;->t()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v2, LJ0/i;->a:LJ0/i;

    invoke-virtual {v2}, LJ0/i;->i()LJ0/v;

    move-result-object v2

    invoke-virtual {p1, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result p1

    if-eqz p1, :cond_9

    if-eqz p4, :cond_9

    const-string p1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    invoke-virtual {p4, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const-string v2, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    invoke-virtual {p4, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p4

    if-lez p4, :cond_8

    if-ltz p1, :cond_8

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    goto :goto_0

    :cond_3
    const v1, 0x7fffffff

    :goto_0
    if-lt p1, v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/l1;->e(LJ0/j;)LL0/M;

    move-result-object v1

    if-nez v1, :cond_5

    return-void

    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, p4, :cond_7

    add-int v5, p1, v4

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v6

    invoke-virtual {v6}, LL0/L;->j()LL0/d;

    move-result-object v6

    invoke-virtual {v6}, LL0/d;->length()I

    move-result v6

    if-lt v5, v6, :cond_6

    const/4 v5, 0x0

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v1, v5}, LL0/M;->d(I)Ll0/i;

    move-result-object v5

    invoke-direct {p0, v0, v5}, Landroidx/compose/ui/platform/x;->a1(LJ0/n;Ll0/i;)Landroid/graphics/RectF;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {p2}, LG1/t;->t()Landroid/os/Bundle;

    move-result-object p1

    new-array p2, v3, [Landroid/graphics/RectF;

    invoke-interface {v2, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Landroid/os/Parcelable;

    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_4

    :cond_8
    :goto_3
    const-string p1, "AccessibilityDelegate"

    const-string p2, "Invalid arguments for accessibility character locations"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_9
    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->C()LJ0/v;

    move-result-object v2

    invoke-virtual {p1, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result p1

    if-eqz p1, :cond_a

    if-eqz p4, :cond_a

    const-string p1, "androidx.compose.ui.semantics.testTag"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->C()LJ0/v;

    move-result-object p4

    invoke-static {p1, p4}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_b

    invoke-virtual {p2}, LG1/t;->t()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p2, p3, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_a
    const-string p1, "androidx.compose.ui.semantics.id"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p2}, LG1/t;->t()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0}, LJ0/n;->o()I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_b
    :goto_4
    return-void
.end method

.method private final K0(IILjava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result p1

    const/16 v0, 0x20

    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method private final L(Landroidx/compose/ui/platform/k1;)Landroid/graphics/Rect;
    .locals 7

    invoke-virtual {p1}, Landroidx/compose/ui/platform/k1;->a()Landroid/graphics/Rect;

    move-result-object p1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    iget v1, p1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/r;->q(J)J

    move-result-wide v0

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    iget v3, p1, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-static {v3, p1}, Ll0/h;->a(FF)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/platform/r;->q(J)J

    move-result-wide v2

    new-instance p1, Landroid/graphics/Rect;

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    float-to-int v4, v4

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-int v0, v0

    invoke-static {v2, v3}, Ll0/g;->m(J)F

    move-result v1

    float-to-double v5, v1

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v1, v5

    float-to-int v1, v1

    invoke-static {v2, v3}, Ll0/g;->n(J)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v2, v2

    invoke-direct {p1, v4, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object p1
.end method

.method private final L0(I)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->A:Landroidx/compose/ui/platform/x$g;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->d()LJ0/n;

    move-result-object v1

    invoke-virtual {v1}, LJ0/n;->o()I

    move-result v1

    if-eq p1, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->f()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->d()LJ0/n;

    move-result-object p1

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result p1

    const/high16 v1, 0x20000

    invoke-direct {p0, p1, v1}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->b()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->e()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->a()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->c()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/x$g;->d()LJ0/n;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->A:Landroidx/compose/ui/platform/x$g;

    return-void
.end method

.method private final M0(Lo/m;)V
    .locals 36

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    new-instance v10, Ljava/util/ArrayList;

    iget-object v0, v7, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v10, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, v7, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v11, v8, Lo/m;->b:[I

    iget-object v12, v8, Lo/m;->a:[J

    array-length v0, v12

    const/4 v13, 0x2

    add-int/lit8 v14, v0, -0x2

    if-ltz v14, :cond_36

    const/4 v6, 0x0

    :goto_0
    aget-wide v0, v12, v6

    not-long v2, v0

    const/4 v4, 0x7

    shl-long/2addr v2, v4

    and-long/2addr v2, v0

    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v2, v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_35

    sub-int v2, v6, v14

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v2, 0x8

    move-wide/from16 v16, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v4, :cond_34

    const-wide/16 v0, 0xff

    and-long v0, v16, v0

    const-wide/16 v18, 0x80

    cmp-long v0, v0, v18

    if-gez v0, :cond_33

    shl-int/lit8 v0, v6, 0x3

    add-int/2addr v0, v3

    aget v2, v11, v0

    iget-object v0, v7, Landroidx/compose/ui/platform/x;->I:Lo/z;

    invoke-virtual {v0, v2}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroidx/compose/ui/platform/j1;

    if-nez v18, :cond_0

    goto/16 :goto_1e

    :cond_0
    invoke-virtual {v8, v2}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/k1;

    const/16 v19, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v0

    move-object v1, v0

    goto :goto_2

    :cond_1
    move-object/from16 v1, v19

    :goto_2
    if-eqz v1, :cond_32

    invoke-virtual {v1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v0}, LJ0/j;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/16 v21, 0x0

    :goto_3
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    sget-object v22, LJ0/q;->a:LJ0/q;

    invoke-virtual/range {v22 .. v22}, LJ0/q;->k()LJ0/v;

    move-result-object v9

    invoke-static {v13, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual/range {v22 .. v22}, LJ0/q;->I()LJ0/v;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_4

    :cond_2
    const/4 v9, 0x0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-direct {v7, v2, v10}, Landroidx/compose/ui/platform/x;->B0(ILjava/util/List;)Z

    move-result v9

    :goto_5
    if-nez v9, :cond_5

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v13

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v15, v23

    check-cast v15, LJ0/v;

    invoke-static {v13, v15}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    :cond_4
    :goto_6
    move-object/from16 v25, v1

    move v8, v2

    move/from16 v23, v3

    move v13, v4

    move v15, v6

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    const/4 v10, 0x2

    move v11, v5

    goto/16 :goto_1c

    :cond_5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJ0/v;

    invoke-virtual/range {v22 .. v22}, LJ0/q;->v()LJ0/v;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v9, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v9

    invoke-virtual/range {v22 .. v22}, LJ0/q;->v()LJ0/v;

    move-result-object v13

    invoke-virtual {v9, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-direct {v7, v2, v5, v0}, Landroidx/compose/ui/platform/x;->K0(IILjava/lang/String;)V

    goto :goto_6

    :cond_6
    invoke-virtual/range {v22 .. v22}, LJ0/q;->B()LJ0/v;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/4 v13, 0x1

    goto :goto_7

    :cond_7
    invoke-virtual/range {v22 .. v22}, LJ0/q;->G()LJ0/v;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    :goto_7
    const/16 v15, 0x40

    if-eqz v13, :cond_9

    invoke-direct {v7, v2}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v9

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v15, 0x8

    const/16 v22, 0x0

    const/16 v23, 0x800

    const/16 v24, 0x0

    move-object/from16 v0, p0

    move-object/from16 v25, v1

    move v1, v9

    move v9, v2

    move/from16 v2, v23

    move/from16 v23, v3

    move-object v3, v13

    move v13, v4

    move-object/from16 v4, v24

    move v5, v15

    move v15, v6

    move-object/from16 v6, v22

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    invoke-direct {v7, v9}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move v8, v9

    :goto_8
    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    :cond_8
    :goto_9
    const/4 v10, 0x2

    :goto_a
    const/16 v11, 0x8

    goto/16 :goto_1c

    :cond_9
    move-object/from16 v25, v1

    move v5, v2

    move/from16 v23, v3

    move v13, v4

    invoke-virtual/range {v22 .. v22}, LJ0/q;->x()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-direct {v7, v5}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v9, 0x8

    const/4 v15, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move/from16 v26, v5

    move v5, v9

    move v9, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move/from16 v15, v26

    invoke-direct {v7, v15}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move v8, v15

    const/4 v10, 0x2

    const/16 v11, 0x8

    move v15, v9

    goto/16 :goto_1c

    :cond_a
    invoke-virtual/range {v22 .. v22}, LJ0/q;->A()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_12

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LJ0/q;->y()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/g;

    sget-object v1, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v1}, LJ0/g$a;->g()I

    move-result v1

    if-nez v0, :cond_b

    const/4 v0, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {v0}, LJ0/g;->n()I

    move-result v0

    invoke-static {v0, v1}, LJ0/g;->k(II)Z

    move-result v0

    :goto_b
    if-eqz v0, :cond_11

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LJ0/q;->A()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-direct {v7, v5}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v0

    invoke-direct {v7, v0, v2}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    invoke-virtual/range {v25 .. v25}, LJ0/n;->a()LJ0/n;

    move-result-object v1

    invoke-virtual {v1}, LJ0/n;->n()LJ0/j;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, LJ0/q;->d()LJ0/v;

    move-result-object v3

    invoke-static {v2, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Ljava/util/List;

    if-eqz v26, :cond_c

    const/16 v33, 0x3e

    const/16 v34, 0x0

    const-string v27, ","

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v26 .. v34}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    :cond_c
    move-object/from16 v2, v19

    :goto_c
    invoke-virtual {v1}, LJ0/n;->n()LJ0/j;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, LJ0/q;->D()LJ0/v;

    move-result-object v3

    invoke-static {v1, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v26, v1

    check-cast v26, Ljava/util/List;

    if-eqz v26, :cond_d

    const/16 v33, 0x3e

    const/16 v34, 0x0

    const-string v27, ","

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v26 .. v34}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_d
    move-object/from16 v1, v19

    :goto_d
    if-eqz v2, :cond_e

    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    sget-object v2, LYg/J;->a:LYg/J;

    :cond_e
    if-eqz v1, :cond_f

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    move v8, v5

    move v15, v6

    goto/16 :goto_8

    :cond_10
    invoke-direct {v7, v5}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v9, 0x8

    const/4 v15, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move/from16 v35, v5

    move v5, v9

    move v9, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move v15, v9

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move/from16 v8, v35

    goto/16 :goto_9

    :cond_11
    move v9, v6

    move v6, v5

    invoke-direct {v7, v6}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v15, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move v8, v6

    move-object v6, v15

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    move v15, v9

    goto/16 :goto_8

    :cond_12
    move v8, v5

    move v15, v6

    invoke-virtual/range {v22 .. v22}, LJ0/q;->d()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    const/16 v3, 0x800

    invoke-direct {v7, v1, v3, v2, v0}, Landroidx/compose/ui/platform/x;->I0(IILjava/lang/Integer;Ljava/util/List;)Z

    goto/16 :goto_8

    :cond_13
    invoke-virtual/range {v22 .. v22}, LJ0/q;->g()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const v2, 0x186a0

    const-string v3, ""

    if-eqz v1, :cond_20

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->y()LJ0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->k0(LJ0/j;)LL0/d;

    move-result-object v0

    if-eqz v0, :cond_14

    goto :goto_e

    :cond_14
    move-object v0, v3

    :goto_e
    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-direct {v7, v1}, Landroidx/compose/ui/platform/x;->k0(LJ0/j;)LL0/d;

    move-result-object v1

    if-eqz v1, :cond_15

    move-object v3, v1

    :cond_15
    invoke-direct {v7, v3, v2}, Landroidx/compose/ui/platform/x;->e1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-static {v1, v2}, Lsh/m;->g(II)I

    move-result v4

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v4, :cond_17

    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    move-object/from16 v24, v10

    invoke-interface {v3, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_16

    :goto_10
    const/4 v9, 0x1

    goto :goto_11

    :cond_16
    const/4 v9, 0x1

    add-int/2addr v6, v9

    move-object/from16 v10, v24

    goto :goto_f

    :cond_17
    move-object/from16 v24, v10

    goto :goto_10

    :goto_11
    move-object/from16 v26, v11

    const/4 v10, 0x0

    :goto_12
    sub-int v11, v4, v6

    if-ge v10, v11, :cond_19

    add-int/lit8 v11, v1, -0x1

    sub-int/2addr v11, v10

    invoke-interface {v0, v11}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    add-int/lit8 v22, v2, -0x1

    sub-int v9, v22, v10

    invoke-interface {v3, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-eq v11, v9, :cond_18

    goto :goto_13

    :cond_18
    const/4 v9, 0x1

    add-int/2addr v10, v9

    goto :goto_12

    :cond_19
    :goto_13
    sub-int/2addr v1, v10

    sub-int/2addr v1, v6

    sub-int v3, v2, v10

    sub-int/2addr v3, v6

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v4

    sget-object v9, LJ0/q;->a:LJ0/q;

    invoke-virtual {v9}, LJ0/q;->w()LJ0/v;

    move-result-object v10

    invoke-virtual {v4, v10}, LJ0/j;->f(LJ0/v;)Z

    move-result v4

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v10

    invoke-virtual {v9}, LJ0/q;->w()LJ0/v;

    move-result-object v11

    invoke-virtual {v10, v11}, LJ0/j;->f(LJ0/v;)Z

    move-result v10

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v11

    move-object/from16 v27, v12

    invoke-virtual {v9}, LJ0/q;->g()LJ0/v;

    move-result-object v12

    invoke-virtual {v11, v12}, LJ0/j;->f(LJ0/v;)Z

    move-result v11

    if-eqz v11, :cond_1a

    if-nez v4, :cond_1a

    if-eqz v10, :cond_1a

    const/4 v12, 0x1

    goto :goto_14

    :cond_1a
    const/4 v12, 0x0

    :goto_14
    if-eqz v11, :cond_1b

    if-eqz v4, :cond_1b

    if-nez v10, :cond_1b

    const/4 v10, 0x1

    goto :goto_15

    :cond_1b
    const/4 v10, 0x0

    :goto_15
    if-nez v12, :cond_1d

    if-eqz v10, :cond_1c

    goto :goto_16

    :cond_1c
    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v2

    const/16 v4, 0x10

    invoke-direct {v7, v2, v4}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_1d
    :goto_16
    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v0, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/x;->U(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v2

    :goto_17
    const-string v0, "android.widget.EditText"

    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    invoke-direct {v7, v2}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    if-nez v12, :cond_1e

    if-eqz v10, :cond_8

    :cond_1e
    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v9}, LJ0/q;->E()LJ0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/S;

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    invoke-direct {v7, v2}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto/16 :goto_9

    :cond_1f
    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v10, 0x2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto/16 :goto_a

    :cond_20
    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    const/4 v10, 0x2

    invoke-virtual/range {v22 .. v22}, LJ0/q;->E()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->k0(LJ0/j;)LL0/d;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_21

    goto :goto_18

    :cond_21
    move-object v3, v0

    :cond_22
    :goto_18
    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual/range {v22 .. v22}, LJ0/q;->E()LJ0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/S;

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v4

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct {v7, v3, v2}, Landroidx/compose/ui/platform/x;->e1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object v11

    move-object/from16 v0, p0

    move v1, v4

    move-object v2, v5

    move-object v3, v6

    move-object v4, v9

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/x;->U(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual/range {v25 .. v25}, LJ0/n;->o()I

    move-result v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->L0(I)V

    goto/16 :goto_a

    :cond_23
    invoke-virtual/range {v22 .. v22}, LJ0/q;->k()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    const/4 v1, 0x1

    goto :goto_19

    :cond_24
    invoke-virtual/range {v22 .. v22}, LJ0/q;->I()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :goto_19
    if-eqz v1, :cond_25

    invoke-virtual/range {v25 .. v25}, LJ0/n;->q()LE0/G;

    move-result-object v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->s0(LE0/G;)V

    iget-object v0, v7, Landroidx/compose/ui/platform/x;->M:Ljava/util/List;

    invoke-static {v0, v8}, Landroidx/compose/ui/platform/l1;->a(Ljava/util/List;I)Landroidx/compose/ui/platform/i1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, LJ0/q;->k()LJ0/v;

    move-result-object v2

    invoke-static {v1, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/h;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/i1;->f(LJ0/h;)V

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-virtual/range {v22 .. v22}, LJ0/q;->I()LJ0/v;

    move-result-object v2

    invoke-static {v1, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/h;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/i1;->i(LJ0/h;)V

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->D0(Landroidx/compose/ui/platform/i1;)V

    goto/16 :goto_a

    :cond_25
    invoke-virtual/range {v22 .. v22}, LJ0/q;->i()LJ0/v;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-virtual/range {v25 .. v25}, LJ0/n;->o()I

    move-result v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v0

    const/16 v11, 0x8

    invoke-direct {v7, v0, v11}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    goto :goto_1a

    :cond_26
    const/16 v11, 0x8

    :goto_1a
    invoke-virtual/range {v25 .. v25}, LJ0/n;->o()I

    move-result v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto :goto_1c

    :cond_27
    const/16 v11, 0x8

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->d()LJ0/v;

    move-result-object v2

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-virtual/range {v25 .. v25}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/i;->d()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/i;->d()LJ0/v;

    move-result-object v1

    invoke-static {v2, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_2d

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_2c

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-gtz v3, :cond_2b

    invoke-interface {v2, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-interface {v0, v2}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_1b

    :cond_28
    const/16 v21, 0x0

    goto :goto_1c

    :cond_29
    :goto_1b
    const/16 v21, 0x1

    :cond_2a
    :goto_1c
    move v2, v8

    move v5, v11

    move v4, v13

    move v6, v15

    move/from16 v3, v23

    move-object/from16 v1, v25

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    :goto_1d
    move-object/from16 v8, p1

    move v13, v10

    move-object/from16 v10, v24

    goto/16 :goto_3

    :cond_2b
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    throw v19

    :cond_2c
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    throw v19

    :cond_2d
    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2a

    move v2, v8

    move v5, v11

    move v4, v13

    move v6, v15

    move/from16 v3, v23

    move-object/from16 v1, v25

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    const/16 v21, 0x1

    goto :goto_1d

    :cond_2e
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, LJ0/a;

    if-eqz v1, :cond_29

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LJ0/a;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/v;

    invoke-static {v2, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/compose/ui/platform/A;->a(LJ0/a;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    goto :goto_1b

    :cond_2f
    move-object/from16 v25, v1

    move v8, v2

    move/from16 v23, v3

    move v15, v6

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move v10, v13

    move v13, v4

    move v11, v5

    if-nez v21, :cond_30

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v0

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Landroidx/compose/ui/platform/A;->f(LJ0/n;LJ0/j;)Z

    move-result v21

    :cond_30
    if-eqz v21, :cond_31

    invoke-direct {v7, v8}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    goto :goto_1f

    :cond_31
    const/4 v8, 0x0

    goto :goto_1f

    :cond_32
    const-string v0, "no value for specified key"

    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_33
    :goto_1e
    move/from16 v23, v3

    move v15, v6

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move v10, v13

    const/4 v8, 0x0

    move v13, v4

    move v11, v5

    :goto_1f
    shr-long v16, v16, v11

    const/4 v0, 0x1

    add-int/lit8 v3, v23, 0x1

    move-object/from16 v8, p1

    move v5, v11

    move v4, v13

    move v6, v15

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    move v13, v10

    move-object/from16 v10, v24

    goto/16 :goto_1

    :cond_34
    move v15, v6

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move v10, v13

    const/4 v0, 0x1

    const/4 v8, 0x0

    move v13, v4

    move v11, v5

    if-ne v13, v11, :cond_36

    goto :goto_20

    :cond_35
    move v15, v6

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object/from16 v27, v12

    move v10, v13

    const/4 v0, 0x1

    const/4 v8, 0x0

    :goto_20
    if-eq v15, v14, :cond_36

    add-int/lit8 v6, v15, 0x1

    move-object/from16 v8, p1

    move v13, v10

    move-object/from16 v10, v24

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    goto/16 :goto_0

    :cond_36
    return-void
.end method

.method private final N0(LE0/G;Lo/A;)V
    .locals 7

    invoke-virtual {p1}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, LE0/a0;->q(I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Landroidx/compose/ui/platform/x$q;->a:Landroidx/compose/ui/platform/x$q;

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/A;->d(LE0/G;Lmh/l;)LE0/G;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_6

    invoke-virtual {p1}, LE0/G;->I()LJ0/j;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, LJ0/j;->u()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Landroidx/compose/ui/platform/x$p;->a:Landroidx/compose/ui/platform/x$p;

    invoke-static {p1, v0}, Landroidx/compose/ui/platform/A;->d(LE0/G;Lmh/l;)LE0/G;

    move-result-object v0

    if-eqz v0, :cond_4

    move-object p1, v0

    :cond_4
    invoke-virtual {p1}, LE0/G;->q0()I

    move-result p1

    invoke-virtual {p2, p1}, Lo/A;->f(I)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/16 v2, 0x800

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :cond_6
    :goto_1
    return-void
.end method

.method private final O(Lo/m;ZIJ)Z
    .locals 20

    move-object/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move-wide/from16 v3, p4

    sget-object v5, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v5}, Ll0/g$a;->b()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6}, Ll0/g;->j(JJ)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static/range {p4 .. p5}, Ll0/g;->p(J)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto/16 :goto_7

    :cond_1
    const/4 v5, 0x1

    if-ne v1, v5, :cond_2

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->I()LJ0/v;

    move-result-object v1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_e

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->k()LJ0/v;

    move-result-object v1

    :goto_0
    iget-object v7, v0, Lo/m;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lo/m;->a:[J

    array-length v8, v0

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_c

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    aget-wide v11, v0, v9

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_a

    sub-int v13, v9, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v13, :cond_9

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_8

    shl-int/lit8 v16, v9, 0x3

    add-int v16, v16, v15

    aget-object v16, v7, v16

    check-cast v16, Landroidx/compose/ui/platform/k1;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/platform/k1;->a()Landroid/graphics/Rect;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lm0/b1;->e(Landroid/graphics/Rect;)Ll0/i;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Ll0/i;->b(J)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v5

    invoke-virtual {v5}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-static {v5, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/h;

    if-nez v5, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v5}, LJ0/h;->b()Z

    move-result v16

    if-eqz v16, :cond_5

    neg-int v6, v2

    goto :goto_3

    :cond_5
    move v6, v2

    :goto_3
    if-nez v2, :cond_6

    invoke-virtual {v5}, LJ0/h;->b()Z

    move-result v17

    if-eqz v17, :cond_6

    const/4 v6, -0x1

    :cond_6
    if-gez v6, :cond_7

    invoke-virtual {v5}, LJ0/h;->c()Lmh/a;

    move-result-object v5

    invoke-interface {v5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-lez v5, :cond_8

    :goto_4
    const/4 v10, 0x1

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, LJ0/h;->c()Lmh/a;

    move-result-object v6

    invoke-interface {v6}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-virtual {v5}, LJ0/h;->a()Lmh/a;

    move-result-object v5

    invoke-interface {v5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    cmpg-float v5, v6, v5

    if-gez v5, :cond_8

    goto :goto_4

    :cond_8
    :goto_5
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    const/4 v5, 0x1

    goto/16 :goto_2

    :cond_9
    if-ne v13, v14, :cond_d

    :cond_a
    if-eq v9, v8, :cond_b

    add-int/lit8 v9, v9, 0x1

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_b
    move v6, v10

    goto :goto_6

    :cond_c
    const/4 v6, 0x0

    :goto_6
    move v10, v6

    :cond_d
    return v10

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_7
    return v0
.end method

.method private final O0(LE0/G;)V
    .locals 3

    invoke-virtual {p1}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, LE0/G;->q0()I

    move-result p1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->r:Lo/z;

    invoke-virtual {v0, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/h;

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->s:Lo/z;

    invoke-virtual {v1, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/h;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    return-void

    :cond_2
    const/16 v2, 0x1000

    invoke-direct {p0, p1, v2}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LJ0/h;->c()Lmh/a;

    move-result-object v2

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    invoke-virtual {v0}, LJ0/h;->a()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    invoke-virtual {v1}, LJ0/h;->a()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    :cond_4
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    return-void
.end method

.method private final P()V
    .locals 2

    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-virtual {v0}, LJ0/p;->a()LJ0/n;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->J:Landroidx/compose/ui/platform/j1;

    invoke-direct {p0, v0, v1}, Landroidx/compose/ui/platform/x;->G0(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "sendSemanticsPropertyChangeEvents"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->M0(Lo/m;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v0, "updateSemanticsNodesCopyAndPanes"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_2
    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->g1()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_2
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method private final P0(LJ0/n;IIZ)Z
    .locals 9

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->x()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/i;->x()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/a;

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object p1

    check-cast p1, Lmh/q;

    if-eqz p1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-interface {p1, p2, p3, p4}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_0
    return v2

    :cond_1
    if-ne p2, p3, :cond_2

    iget p4, p0, Landroidx/compose/ui/platform/x;->v:I

    if-ne p3, p4, :cond_2

    return v2

    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    return v2

    :cond_3
    if-ltz p2, :cond_4

    if-ne p2, p3, :cond_4

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result p4

    if-gt p3, p4, :cond_4

    goto :goto_0

    :cond_4
    const/4 p2, -0x1

    :goto_0
    iput p2, p0, Landroidx/compose/ui/platform/x;->v:I

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 p3, 0x1

    if-lez p2, :cond_5

    move v2, p3

    :cond_5
    invoke-virtual {p1}, LJ0/n;->o()I

    move-result p2

    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v4

    const/4 p2, 0x0

    if-eqz v2, :cond_6

    iget p4, p0, Landroidx/compose/ui/platform/x;->v:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    move-object v5, p4

    goto :goto_1

    :cond_6
    move-object v5, p2

    :goto_1
    if-eqz v2, :cond_7

    iget p4, p0, Landroidx/compose/ui/platform/x;->v:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    move-object v6, p4

    goto :goto_2

    :cond_7
    move-object v6, p2

    :goto_2
    if-eqz v2, :cond_8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_8
    move-object v7, p2

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/platform/x;->U(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/x;->H0(Landroid/view/accessibility/AccessibilityEvent;)Z

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->L0(I)V

    return p3
.end method

.method private final Q(I)Z
    .locals 8

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->n0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/compose/ui/platform/x;->o:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->p:LG1/t;

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/high16 v3, 0x10000

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final Q0(LJ0/n;LG1/t;)V
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->h()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, LG1/t;->l0(Z)V

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->h()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p1}, LG1/t;->o0(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private final R(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    const-string v0, "android.view.View"

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/k1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object p1

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->w()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->f(LJ0/v;)Z

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    :cond_0
    return-object p2
.end method

.method private final R0(LJ0/n;LG1/t;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->f0(LJ0/n;)Z

    move-result p1

    invoke-virtual {p2, p1}, LG1/t;->e0(Z)V

    return-void
.end method

.method private final S(I)LG1/t;
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getViewTreeOwners()Landroidx/compose/ui/platform/r$b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r$b;->a()Landroidx/lifecycle/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/lifecycle/o;->O()Landroidx/lifecycle/k;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Landroidx/lifecycle/k$b;->DESTROYED:Landroidx/lifecycle/k$b;

    if-ne v0, v2, :cond_1

    return-object v1

    :cond_1
    invoke-static {}, LG1/t;->U()LG1/t;

    move-result-object v0

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v2

    invoke-virtual {v2, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/k1;

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v2}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v3

    const/4 v4, -0x1

    if-ne p1, v4, :cond_4

    iget-object v4, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v4}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v5, v4, Landroid/view/View;

    if-eqz v5, :cond_3

    move-object v1, v4

    check-cast v1, Landroid/view/View;

    :cond_3
    invoke-virtual {v0, v1}, LG1/t;->B0(Landroid/view/View;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, LJ0/n;->r()LJ0/n;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, LJ0/n;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v5, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v5}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v5

    invoke-virtual {v5}, LJ0/p;->a()LJ0/n;

    move-result-object v5

    invoke-virtual {v5}, LJ0/n;->o()I

    move-result v5

    if-ne v1, v5, :cond_6

    goto :goto_1

    :cond_6
    move v4, v1

    :goto_1
    iget-object v1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1, v4}, LG1/t;->C0(Landroid/view/View;I)V

    :goto_2
    iget-object v1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1, p1}, LG1/t;->K0(Landroid/view/View;I)V

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/x;->L(Landroidx/compose/ui/platform/k1;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, LG1/t;->d0(Landroid/graphics/Rect;)V

    invoke-direct {p0, p1, v0, v3}, Landroidx/compose/ui/platform/x;->y0(ILG1/t;LJ0/n;)V

    return-object v0

    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "semanticsNode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " has null parent"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method private final T(LJ0/n;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, LJ0/n;->a()LJ0/n;

    move-result-object p1

    invoke-virtual {p1}, LJ0/n;->n()LJ0/j;

    move-result-object p1

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->d()LJ0/v;

    move-result-object v1

    invoke-static {p1, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    invoke-virtual {v0}, LJ0/q;->D()LJ0/v;

    move-result-object v1

    invoke-static {p1, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    invoke-virtual {v0}, LJ0/q;->g()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lf0/i;->m:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method private final T0(LJ0/n;LG1/t;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->g0(LJ0/n;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, LG1/t;->L0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final U(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    const/16 v0, 0x2000

    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/x;->R(II)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_2
    if-eqz p5, :cond_3

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-object p1
.end method

.method private final U0(LJ0/n;LG1/t;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->h0(LJ0/n;)LL0/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->b1(LL0/d;)Landroid/text/SpannableString;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, LG1/t;->M0(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final V0()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    invoke-virtual {v0}, Lo/x;->i()V

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    invoke-virtual {v0}, Lo/x;->i()V

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/platform/k1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v1

    filled-new-array {v0}, [LJ0/n;

    move-result-object v0

    invoke-static {v0}, LZg/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Landroidx/compose/ui/platform/x;->Z0(ZLjava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZg/v;->n(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v2, v1, :cond_1

    :goto_1
    add-int/lit8 v3, v2, -0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/n;

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ0/n;

    invoke-virtual {v4}, LJ0/n;->o()I

    move-result v4

    iget-object v5, p0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    invoke-virtual {v5, v3, v4}, Lo/x;->q(II)V

    iget-object v5, p0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    invoke-virtual {v5, v4, v3}, Lo/x;->q(II)V

    if-eq v2, v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private static final W(Landroidx/compose/ui/platform/x;Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/platform/x;->l:Ljava/util/List;

    return-void
.end method

.method private final W0(ZLjava/util/ArrayList;Lo/z;)Ljava/util/List;
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p2}, LZg/v;->n(Ljava/util/List;)I

    move-result v1

    const/4 v2, 0x0

    if-ltz v1, :cond_2

    move v3, v2

    :goto_0
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ0/n;

    if-eqz v3, :cond_0

    invoke-static {v0, v4}, Landroidx/compose/ui/platform/x;->Y0(Ljava/util/ArrayList;LJ0/n;)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-virtual {v4}, LJ0/n;->j()Ll0/i;

    move-result-object v5

    new-instance v6, LYg/s;

    filled-new-array {v4}, [LJ0/n;

    move-result-object v4

    invoke-static {v4}, LZg/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v6, v5, v4}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eq v3, v1, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    sget-object p2, Landroidx/compose/ui/platform/x$i;->a:Landroidx/compose/ui/platform/x$i;

    invoke-static {v0, p2}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LYg/s;

    invoke-virtual {v4}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz p1, :cond_3

    sget-object v6, Landroidx/compose/ui/platform/x$h;->a:Landroidx/compose/ui/platform/x$h;

    goto :goto_2

    :cond_3
    sget-object v6, Landroidx/compose/ui/platform/x$f;->a:Landroidx/compose/ui/platform/x$f;

    :goto_2
    sget-object v7, LE0/G;->X:LE0/G$d;

    invoke-virtual {v7}, LE0/G$d;->b()Ljava/util/Comparator;

    move-result-object v7

    new-instance v8, Landroidx/compose/ui/platform/y;

    invoke-direct {v8, v6, v7}, Landroidx/compose/ui/platform/y;-><init>(Ljava/util/Comparator;Ljava/util/Comparator;)V

    new-instance v6, Landroidx/compose/ui/platform/z;

    invoke-direct {v6, v8}, Landroidx/compose/ui/platform/z;-><init>(Ljava/util/Comparator;)V

    invoke-static {v5, v6}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {v4}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    sget-object p1, Landroidx/compose/ui/platform/x$r;->a:Landroidx/compose/ui/platform/x$r;

    new-instance v0, Landroidx/compose/ui/platform/t;

    invoke-direct {v0, p1}, Landroidx/compose/ui/platform/t;-><init>(Lmh/p;)V

    invoke-static {p2, v0}, LZg/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    :goto_3
    invoke-static {p2}, LZg/v;->n(Ljava/util/List;)I

    move-result p1

    if-gt v2, p1, :cond_7

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/n;

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result p1

    invoke-virtual {p3, p1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/n;

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->q0(LJ0/n;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    add-int/lit8 v2, v2, 0x1

    :goto_4
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p2, v2, v0}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/2addr v2, p1

    goto :goto_3

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    return-object p2
.end method

.method private final X(LJ0/n;Ljava/util/ArrayList;Lo/z;)V
    .locals 4

    invoke-static {p1}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v2, LJ0/q;->a:LJ0/q;

    invoke-virtual {v2}, LJ0/q;->s()LJ0/v;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/platform/x$l;->a:Landroidx/compose/ui/platform/x$l;

    invoke-virtual {v1, v2, v3}, LJ0/j;->k(LJ0/v;Lmh/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->q0(LJ0/n;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v2

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v3

    invoke-virtual {v2, v3}, Lo/m;->b(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result p2

    invoke-virtual {p1}, LJ0/n;->k()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/platform/x;->Z0(ZLjava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lo/z;->t(ILjava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LJ0/n;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/n;

    invoke-direct {p0, v2, p2, p3}, Landroidx/compose/ui/platform/x;->X(LJ0/n;Ljava/util/ArrayList;Lo/z;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private static final X0(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final Y(LJ0/n;)I
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/q;->E()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->E()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/S;

    invoke-virtual {p1}, LL0/S;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->i(J)I

    move-result p1

    return p1

    :cond_0
    iget p1, p0, Landroidx/compose/ui/platform/x;->v:I

    return p1
.end method

.method private static final Y0(Ljava/util/ArrayList;LJ0/n;)Z
    .locals 10

    invoke-virtual {p1}, LJ0/n;->j()Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v0

    invoke-virtual {p1}, LJ0/n;->j()Ll0/i;

    move-result-object v1

    invoke-virtual {v1}, Ll0/i;->e()F

    move-result v1

    cmpl-float v2, v0, v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {p0}, LZg/v;->n(Ljava/util/List;)I

    move-result v5

    if-ltz v5, :cond_3

    move v6, v3

    :goto_1
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LYg/s;

    invoke-virtual {v7}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll0/i;

    invoke-virtual {v7}, Ll0/i;->n()F

    move-result v8

    invoke-virtual {v7}, Ll0/i;->e()F

    move-result v9

    cmpl-float v8, v8, v9

    if-ltz v8, :cond_1

    move v8, v4

    goto :goto_2

    :cond_1
    move v8, v3

    :goto_2
    if-nez v2, :cond_2

    if-nez v8, :cond_2

    invoke-virtual {v7}, Ll0/i;->n()F

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-virtual {v7}, Ll0/i;->e()F

    move-result v9

    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v9

    cmpg-float v8, v8, v9

    if-gez v8, :cond_2

    const/4 v2, 0x0

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-virtual {v7, v2, v0, v3, v1}, Ll0/i;->s(FFFF)Ll0/i;

    move-result-object v0

    new-instance v1, LYg/s;

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYg/s;

    invoke-virtual {v2}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v6, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LYg/s;

    invoke-virtual {p0}, LYg/s;->j()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v4

    :cond_2
    if-eq v6, v5, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    return v3
.end method

.method private final Z(LJ0/n;)I
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v1}, LJ0/q;->E()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->E()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/S;

    invoke-virtual {p1}, LL0/S;->r()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result p1

    return p1

    :cond_0
    iget p1, p0, Landroidx/compose/ui/platform/x;->v:I

    return p1
.end method

.method private final Z0(ZLjava/util/List;)Ljava/util/List;
    .locals 5

    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ0/n;

    invoke-direct {p0, v4, v1, v0}, Landroidx/compose/ui/platform/x;->X(LJ0/n;Ljava/util/ArrayList;Lo/z;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v1, v0}, Landroidx/compose/ui/platform/x;->W0(ZLjava/util/ArrayList;Lo/z;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final a0()Lo/m;
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/x;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/x;->z:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/l1;->b(LJ0/p;)Lo/m;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->B:Lo/m;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->V0()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->B:Lo/m;

    return-object v0
.end method

.method private final a1(LJ0/n;Ll0/i;)Landroid/graphics/RectF;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LJ0/n;->s()J

    move-result-wide v1

    invoke-virtual {p2, v1, v2}, Ll0/i;->x(J)Ll0/i;

    move-result-object p2

    invoke-virtual {p1}, LJ0/n;->i()Ll0/i;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll0/i;->v(Ll0/i;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, p1}, Ll0/i;->t(Ll0/i;)Ll0/i;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object p2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Landroidx/compose/ui/platform/r;->q(J)J

    move-result-wide v0

    iget-object p2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v2

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-static {v2, p1}, Ll0/h;->a(FF)J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Landroidx/compose/ui/platform/r;->q(J)J

    move-result-wide p1

    new-instance v2, Landroid/graphics/RectF;

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v3

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-direct {v2, v3, v0, v1, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v0, v2

    :cond_2
    return-object v0
.end method

.method private final b1(LL0/d;)Landroid/text/SpannableString;
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getFontFamilyResolver()LQ0/k$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getDensity()LY0/d;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->H:LT0/t;

    invoke-static {p1, v1, v0, v2}, LT0/a;->b(LL0/d;LY0/d;LQ0/k$b;LT0/t;)Landroid/text/SpannableString;

    move-result-object p1

    const v0, 0x186a0

    invoke-direct {p0, p1, v0}, Landroidx/compose/ui/platform/x;->e1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object p1

    check-cast p1, Landroid/text/SpannableString;

    return-object p1
.end method

.method private static final c1(Landroidx/compose/ui/platform/x;Z)V
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/x;->l:Ljava/util/List;

    return-void
.end method

.method private final d1(LJ0/n;IZZ)Z
    .locals 11

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->w:Ljava/lang/Integer;

    const/4 v2, -0x1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v0, v1, :cond_1

    :goto_0
    iput v2, p0, Landroidx/compose/ui/platform/x;->v:I

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/x;->w:Ljava/lang/Integer;

    :cond_1
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_8

    :cond_2
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/platform/x;->j0(LJ0/n;I)Landroidx/compose/ui/platform/g;

    move-result-object v3

    if-nez v3, :cond_3

    return v1

    :cond_3
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->Y(LJ0/n;)I

    move-result v4

    if-ne v4, v2, :cond_5

    if-eqz p3, :cond_4

    move v4, v1

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    move v4, v0

    :cond_5
    :goto_1
    if-eqz p3, :cond_6

    invoke-interface {v3, v4}, Landroidx/compose/ui/platform/g;->a(I)[I

    move-result-object v0

    goto :goto_2

    :cond_6
    invoke-interface {v3, v4}, Landroidx/compose/ui/platform/g;->b(I)[I

    move-result-object v0

    :goto_2
    if-nez v0, :cond_7

    return v1

    :cond_7
    aget v7, v0, v1

    const/4 v1, 0x1

    aget v8, v0, v1

    if-eqz p4, :cond_b

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->o0(LJ0/n;)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->Z(LJ0/n;)I

    move-result p4

    if-ne p4, v2, :cond_9

    if-eqz p3, :cond_8

    move p4, v7

    goto :goto_3

    :cond_8
    move p4, v8

    :cond_9
    :goto_3
    if-eqz p3, :cond_a

    move v0, v8

    goto :goto_5

    :cond_a
    move v0, v7

    goto :goto_5

    :cond_b
    if-eqz p3, :cond_c

    move p4, v8

    goto :goto_4

    :cond_c
    move p4, v7

    :goto_4
    move v0, p4

    :goto_5
    if-eqz p3, :cond_d

    const/16 p3, 0x100

    :goto_6
    move v5, p3

    goto :goto_7

    :cond_d
    const/16 p3, 0x200

    goto :goto_6

    :goto_7
    new-instance p3, Landroidx/compose/ui/platform/x$g;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    move-object v3, p3

    move-object v4, p1

    move v6, p2

    invoke-direct/range {v3 .. v10}, Landroidx/compose/ui/platform/x$g;-><init>(LJ0/n;IIIIJ)V

    iput-object p3, p0, Landroidx/compose/ui/platform/x;->A:Landroidx/compose/ui/platform/x$g;

    invoke-direct {p0, p1, p4, v0, v1}, Landroidx/compose/ui/platform/x;->P0(LJ0/n;IIZ)Z

    :cond_e
    :goto_8
    return v1
.end method

.method private final e1(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;
    .locals 2

    if-lez p2, :cond_4

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt v0, p2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, p2, -0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_2

    move p2, v0

    :cond_2
    const/4 v0, 0x0

    invoke-interface {p1, v0, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "size should be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f0(LJ0/n;)Z
    .locals 5

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->G()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK0/a;

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/q;->y()LJ0/v;

    move-result-object v3

    invoke-static {v2, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/g;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->A()LJ0/v;

    move-result-object v1

    invoke-static {p1, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_3

    sget-object p1, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {p1}, LJ0/g$a;->g()I

    move-result p1

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LJ0/g;->n()I

    move-result v1

    invoke-static {v1, p1}, LJ0/g;->k(II)Z

    move-result v4

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    move v0, v3

    :cond_3
    return v0
.end method

.method private final f1(I)V
    .locals 9

    iget v1, p0, Landroidx/compose/ui/platform/x;->e:I

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/compose/ui/platform/x;->e:I

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/16 v4, 0x80

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move v3, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    const/16 v5, 0xc

    const/16 v2, 0x100

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    return-void
.end method

.method private final g0(LJ0/n;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->B()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/q;->G()LJ0/v;

    move-result-object v3

    invoke-static {v2, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LK0/a;

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    invoke-virtual {v1}, LJ0/q;->y()LJ0/v;

    move-result-object v4

    invoke-static {v3, v4}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/g;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    sget-object v6, Landroidx/compose/ui/platform/x$j;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v6, v2

    if-eq v2, v4, :cond_3

    const/4 v6, 0x2

    if-eq v2, v6, :cond_1

    const/4 v6, 0x3

    if-eq v2, v6, :cond_0

    goto :goto_2

    :cond_0
    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->g:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_1
    sget-object v2, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v2}, LJ0/g$a;->f()I

    move-result v2

    if-nez v3, :cond_2

    move v2, v5

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, LJ0/g;->n()I

    move-result v6

    invoke-static {v6, v2}, LJ0/g;->k(II)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_5

    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->n:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    sget-object v2, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v2}, LJ0/g$a;->f()I

    move-result v2

    if-nez v3, :cond_4

    move v2, v5

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, LJ0/g;->n()I

    move-result v6

    invoke-static {v6, v2}, LJ0/g;->k(II)Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_5

    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->o:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_5
    :goto_2
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/q;->A()LJ0/v;

    move-result-object v6

    invoke-static {v2, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    sget-object v6, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v6}, LJ0/g$a;->g()I

    move-result v6

    if-nez v3, :cond_6

    move v3, v5

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, LJ0/g;->n()I

    move-result v3

    invoke-static {v3, v6}, LJ0/g;->k(II)Z

    move-result v3

    :goto_3
    if-nez v3, :cond_8

    if-nez v0, :cond_8

    if-eqz v2, :cond_7

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->l:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_7
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->i:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_8
    :goto_4
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/q;->x()LJ0/v;

    move-result-object v3

    invoke-static {v2, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/f;

    if-eqz v2, :cond_12

    sget-object v3, LJ0/f;->d:LJ0/f$a;

    invoke-virtual {v3}, LJ0/f$a;->a()LJ0/f;

    move-result-object v3

    if-eq v2, v3, :cond_11

    if-nez v0, :cond_12

    invoke-virtual {v2}, LJ0/f;->c()Lsh/e;

    move-result-object v0

    invoke-interface {v0}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v0}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    sub-float/2addr v3, v6

    const/4 v6, 0x0

    cmpg-float v3, v3, v6

    if-nez v3, :cond_9

    move v3, v4

    goto :goto_5

    :cond_9
    move v3, v5

    :goto_5
    if-eqz v3, :cond_a

    move v2, v6

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, LJ0/f;->b()F

    move-result v2

    invoke-interface {v0}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-interface {v0}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v0}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    sub-float/2addr v3, v0

    div-float/2addr v2, v3

    :goto_6
    cmpg-float v0, v2, v6

    if-gez v0, :cond_b

    move v2, v6

    :cond_b
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v3, v2, v0

    if-lez v3, :cond_c

    move v2, v0

    :cond_c
    cmpg-float v3, v2, v6

    if-nez v3, :cond_d

    move v3, v4

    goto :goto_7

    :cond_d
    move v3, v5

    :goto_7
    if-eqz v3, :cond_e

    goto :goto_8

    :cond_e
    cmpg-float v0, v2, v0

    if-nez v0, :cond_f

    move v5, v4

    :cond_f
    const/16 v0, 0x64

    if-eqz v5, :cond_10

    move v5, v0

    goto :goto_8

    :cond_10
    int-to-float v0, v0

    mul-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v2, 0x63

    invoke-static {v0, v4, v2}, Lsh/m;->k(III)I

    move-result v5

    :goto_8
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->r:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_11
    if-nez v0, :cond_12

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lf0/i;->f:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_12
    :goto_9
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    invoke-virtual {v1}, LJ0/q;->g()LJ0/v;

    move-result-object v1

    invoke-virtual {v2, v1}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->T(LJ0/n;)Ljava/lang/String;

    move-result-object v0

    :cond_13
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final g1()V
    .locals 22

    move-object/from16 v0, p0

    new-instance v1, Lo/A;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/x;->C:Lo/A;

    iget-object v5, v3, Lo/o;->b:[I

    iget-object v3, v3, Lo/o;->a:[J

    array-length v6, v3

    add-int/lit8 v6, v6, -0x2

    const-wide/16 v7, 0x80

    const-wide/16 v9, 0xff

    const/4 v11, 0x7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v14, 0x8

    if-ltz v6, :cond_6

    move v15, v2

    move-object/from16 v17, v5

    :goto_0
    aget-wide v4, v3, v15

    move-object/from16 v18, v3

    not-long v2, v4

    shl-long/2addr v2, v11

    and-long/2addr v2, v4

    and-long/2addr v2, v12

    cmp-long v2, v2, v12

    if-eqz v2, :cond_5

    sub-int v2, v15, v6

    not-int v2, v2

    ushr-int/lit8 v2, v2, 0x1f

    rsub-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_4

    and-long v19, v4, v9

    cmp-long v19, v19, v7

    if-gez v19, :cond_3

    shl-int/lit8 v19, v15, 0x3

    add-int v19, v19, v3

    aget v7, v17, v19

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v8

    invoke-virtual {v8, v7}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/platform/k1;

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v8

    goto :goto_2

    :cond_0
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_1

    invoke-virtual {v8}, LJ0/n;->w()LJ0/j;

    move-result-object v8

    sget-object v19, LJ0/q;->a:LJ0/q;

    invoke-virtual/range {v19 .. v19}, LJ0/q;->v()LJ0/v;

    move-result-object v9

    invoke-virtual {v8, v9}, LJ0/j;->f(LJ0/v;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_1
    invoke-virtual {v1, v7}, Lo/A;->f(I)Z

    iget-object v8, v0, Landroidx/compose/ui/platform/x;->I:Lo/z;

    invoke-virtual {v8, v7}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/platform/j1;

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v8

    if-eqz v8, :cond_2

    sget-object v9, LJ0/q;->a:LJ0/q;

    invoke-virtual {v9}, LJ0/q;->v()LJ0/v;

    move-result-object v9

    invoke-static {v8, v9}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_3

    :cond_2
    const/4 v8, 0x0

    :goto_3
    const/16 v9, 0x20

    invoke-direct {v0, v7, v9, v8}, Landroidx/compose/ui/platform/x;->K0(IILjava/lang/String;)V

    :cond_3
    shr-long/2addr v4, v14

    add-int/lit8 v3, v3, 0x1

    const-wide/16 v7, 0x80

    const-wide/16 v9, 0xff

    goto :goto_1

    :cond_4
    if-ne v2, v14, :cond_6

    :cond_5
    if-eq v15, v6, :cond_6

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, v18

    const/4 v2, 0x0

    const-wide/16 v7, 0x80

    const-wide/16 v9, 0xff

    goto/16 :goto_0

    :cond_6
    iget-object v2, v0, Landroidx/compose/ui/platform/x;->C:Lo/A;

    invoke-virtual {v2, v1}, Lo/A;->r(Lo/o;)Z

    iget-object v1, v0, Landroidx/compose/ui/platform/x;->I:Lo/z;

    invoke-virtual {v1}, Lo/z;->i()V

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v1

    iget-object v2, v1, Lo/m;->b:[I

    iget-object v3, v1, Lo/m;->c:[Ljava/lang/Object;

    iget-object v1, v1, Lo/m;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_b

    const/4 v5, 0x0

    :goto_4
    aget-wide v6, v1, v5

    not-long v8, v6

    shl-long/2addr v8, v11

    and-long/2addr v8, v6

    and-long/2addr v8, v12

    cmp-long v8, v8, v12

    if-eqz v8, :cond_a

    sub-int v8, v5, v4

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    rsub-int/lit8 v8, v8, 0x8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_9

    const-wide/16 v15, 0xff

    and-long v18, v6, v15

    const-wide/16 v20, 0x80

    cmp-long v10, v18, v20

    if-gez v10, :cond_8

    shl-int/lit8 v10, v5, 0x3

    add-int/2addr v10, v9

    aget v11, v2, v10

    aget-object v10, v3, v10

    check-cast v10, Landroidx/compose/ui/platform/k1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    sget-object v13, LJ0/q;->a:LJ0/q;

    invoke-virtual {v13}, LJ0/q;->v()LJ0/v;

    move-result-object v15

    invoke-virtual {v12, v15}, LJ0/j;->f(LJ0/v;)Z

    move-result v12

    if-eqz v12, :cond_7

    iget-object v12, v0, Landroidx/compose/ui/platform/x;->C:Lo/A;

    invoke-virtual {v12, v11}, Lo/A;->f(I)Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v12

    invoke-virtual {v12}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v13}, LJ0/q;->v()LJ0/v;

    move-result-object v13

    invoke-virtual {v12, v13}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    const/16 v13, 0x10

    invoke-direct {v0, v11, v13, v12}, Landroidx/compose/ui/platform/x;->K0(IILjava/lang/String;)V

    :cond_7
    iget-object v12, v0, Landroidx/compose/ui/platform/x;->I:Lo/z;

    new-instance v13, Landroidx/compose/ui/platform/j1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v10

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v15

    invoke-direct {v13, v10, v15}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    invoke-virtual {v12, v11, v13}, Lo/z;->t(ILjava/lang/Object;)V

    :cond_8
    shr-long/2addr v6, v14

    add-int/lit8 v9, v9, 0x1

    const/4 v11, 0x7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto :goto_5

    :cond_9
    const-wide/16 v20, 0x80

    if-ne v8, v14, :cond_b

    goto :goto_6

    :cond_a
    const-wide/16 v20, 0x80

    :goto_6
    if-eq v5, v4, :cond_b

    add-int/lit8 v5, v5, 0x1

    const/4 v11, 0x7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    goto/16 :goto_4

    :cond_b
    new-instance v1, Landroidx/compose/ui/platform/j1;

    iget-object v2, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v2

    invoke-virtual {v2}, LJ0/p;->a()LJ0/n;

    move-result-object v2

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    iput-object v1, v0, Landroidx/compose/ui/platform/x;->J:Landroidx/compose/ui/platform/j1;

    return-void
.end method

.method private final h0(LJ0/n;)LL0/d;
    .locals 2

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->k0(LJ0/j;)LL0/d;

    move-result-object v0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->D()LJ0/v;

    move-result-object v1

    invoke-static {p1, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/d;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez v0, :cond_1

    move-object v0, p1

    :cond_1
    return-object v0
.end method

.method private final i0(LJ0/n;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v2, LJ0/q;->a:LJ0/q;

    invoke-virtual {v2}, LJ0/q;->d()LJ0/v;

    move-result-object v3

    invoke-virtual {v1, v3}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v2}, LJ0/q;->d()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-virtual {v2}, LJ0/q;->g()LJ0/v;

    move-result-object v3

    invoke-virtual {v1, v3}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->k0(LJ0/j;)LL0/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v2}, LJ0/q;->D()LJ0/v;

    move-result-object v1

    invoke-static {p1, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    invoke-static {p1}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/d;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LL0/d;->k()Ljava/lang/String;

    move-result-object v0

    :cond_4
    return-object v0
.end method

.method private final j0(LJ0/n;I)Landroidx/compose/ui/platform/g;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v2, 0x1

    if-eq p2, v2, :cond_8

    const/4 v2, 0x2

    if-eq p2, v2, :cond_7

    const/4 v2, 0x4

    if-eq p2, v2, :cond_3

    const/16 v3, 0x8

    if-eq p2, v3, :cond_2

    const/16 v3, 0x10

    if-eq p2, v3, :cond_3

    return-object v0

    :cond_2
    sget-object p1, Landroidx/compose/ui/platform/f;->c:Landroidx/compose/ui/platform/f$a;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/f$a;->a()Landroidx/compose/ui/platform/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/b;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    sget-object v4, LJ0/i;->a:LJ0/i;

    invoke-virtual {v4}, LJ0/i;->i()LJ0/v;

    move-result-object v4

    invoke-virtual {v3, v4}, LJ0/j;->f(LJ0/v;)Z

    move-result v3

    if-nez v3, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/ui/platform/l1;->e(LJ0/j;)LL0/M;

    move-result-object v3

    if-nez v3, :cond_5

    return-object v0

    :cond_5
    if-ne p2, v2, :cond_6

    sget-object p1, Landroidx/compose/ui/platform/d;->d:Landroidx/compose/ui/platform/d$a;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/d$a;->a()Landroidx/compose/ui/platform/d;

    move-result-object p1

    invoke-virtual {p1, v1, v3}, Landroidx/compose/ui/platform/d;->j(Ljava/lang/String;LL0/M;)V

    goto :goto_0

    :cond_6
    sget-object p2, Landroidx/compose/ui/platform/e;->f:Landroidx/compose/ui/platform/e$a;

    invoke-virtual {p2}, Landroidx/compose/ui/platform/e$a;->a()Landroidx/compose/ui/platform/e;

    move-result-object p2

    invoke-virtual {p2, v1, v3, p1}, Landroidx/compose/ui/platform/e;->j(Ljava/lang/String;LL0/M;LJ0/n;)V

    move-object p1, p2

    goto :goto_0

    :cond_7
    sget-object p1, Landroidx/compose/ui/platform/h;->d:Landroidx/compose/ui/platform/h$a;

    iget-object p2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/h$a;->a(Ljava/util/Locale;)Landroidx/compose/ui/platform/h;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/b;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    sget-object p1, Landroidx/compose/ui/platform/c;->d:Landroidx/compose/ui/platform/c$a;

    iget-object p2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    iget-object p2, p2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/platform/c$a;->a(Ljava/util/Locale;)Landroidx/compose/ui/platform/c;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/compose/ui/platform/b;->e(Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_9
    :goto_1
    return-object v0
.end method

.method private final k0(LJ0/j;)LL0/d;
    .locals 1

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->g()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LL0/d;

    return-object p1
.end method

.method public static synthetic n(Landroidx/compose/ui/platform/x;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/x;->c1(Landroidx/compose/ui/platform/x;Z)V

    return-void
.end method

.method private final n0(I)Z
    .locals 1

    iget v0, p0, Landroidx/compose/ui/platform/x;->o:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic o(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/ui/platform/x;->X0(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private final o0(LJ0/n;)Z
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v2

    invoke-virtual {v0, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    invoke-virtual {v1}, LJ0/q;->g()LJ0/v;

    move-result-object v0

    invoke-virtual {p1, v0}, LJ0/j;->f(LJ0/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic p(Landroidx/compose/ui/platform/x;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/platform/x;->E0(Landroidx/compose/ui/platform/x;)V

    return-void
.end method

.method public static synthetic q(Landroidx/compose/ui/platform/x;Z)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/platform/x;->W(Landroidx/compose/ui/platform/x;Z)V

    return-void
.end method

.method private final q0(LJ0/n;)Z
    .locals 4

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->d()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-static {v0}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->h0(LJ0/n;)LL0/d;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->g0(LJ0/n;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->f0(LJ0/n;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v1

    :goto_2
    invoke-static {p1}, Landroidx/compose/ui/platform/l1;->g(LJ0/n;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v3

    invoke-virtual {v3}, LJ0/j;->u()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {p1}, LJ0/n;->A()Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v2

    :cond_4
    :goto_3
    return v1
.end method

.method public static final synthetic r(Landroidx/compose/ui/platform/x;ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/platform/x;->K(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final r0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/x;->h:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public static final synthetic s(Landroidx/compose/ui/platform/x;Landroidx/compose/ui/platform/k1;)Landroid/graphics/Rect;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->L(Landroidx/compose/ui/platform/k1;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method

.method private final s0(LE0/G;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {v0, p1}, Lo/b;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/x;->y:LKi/g;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p1, v0}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final synthetic t(Landroidx/compose/ui/platform/x;I)LG1/t;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->S(I)LG1/t;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(Landroidx/compose/ui/platform/x;)Landroid/view/accessibility/AccessibilityManager;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    return-object p0
.end method

.method public static final synthetic v(Landroidx/compose/ui/platform/x;)Lo/m;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object p0

    return-object p0
.end method

.method private final v0(IILandroid/os/Bundle;)Z
    .locals 17

    move-object/from16 v7, p0

    move/from16 v1, p1

    move/from16 v0, p2

    move-object/from16 v2, p3

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v3

    invoke-virtual {v3, v1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/k1;

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    move v0, v8

    goto/16 :goto_20

    :cond_1
    const/16 v4, 0x40

    if-eq v0, v4, :cond_54

    const/16 v4, 0x80

    if-eq v0, v4, :cond_53

    const/16 v4, 0x100

    const/4 v5, 0x1

    if-eq v0, v4, :cond_50

    const/16 v6, 0x200

    if-eq v0, v6, :cond_50

    const/16 v4, 0x4000

    if-eq v0, v4, :cond_4e

    const/high16 v4, 0x20000

    if-eq v0, v4, :cond_4a

    invoke-static {v3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v4

    if-nez v4, :cond_2

    return v8

    :cond_2
    if-eq v0, v5, :cond_48

    const/4 v4, 0x2

    if-eq v0, v4, :cond_46

    const/4 v4, 0x0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    iget-object v2, v7, Landroidx/compose/ui/platform/x;->t:Lo/W;

    invoke-virtual {v2, v1}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/W;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v0}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->d()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_4

    return v8

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_5

    return v8

    :cond_5
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    throw v4

    :cond_6
    :goto_0
    return v8

    :pswitch_0
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->p()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_7
    return v8

    :pswitch_1
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->o()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_8

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_8
    return v8

    :pswitch_2
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->n()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_9
    return v8

    :pswitch_3
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->q()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_a
    return v8

    :sswitch_0
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->l()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_b

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_b
    return v8

    :sswitch_1
    if-eqz v2, :cond_d

    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_1

    :cond_c
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v3, LJ0/i;->a:LJ0/i;

    invoke-virtual {v3}, LJ0/i;->w()LJ0/v;

    move-result-object v3

    invoke-static {v1, v3}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/a;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, LJ0/a;->a()LYg/i;

    move-result-object v1

    check-cast v1, Lmh/l;

    if-eqz v1, :cond_d

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_d
    :goto_1
    return v8

    :sswitch_2
    invoke-virtual {v3}, LJ0/n;->r()LJ0/n;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    if-eqz v1, :cond_e

    sget-object v2, LJ0/i;->a:LJ0/i;

    invoke-virtual {v2}, LJ0/i;->t()LJ0/v;

    move-result-object v2

    invoke-static {v1, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/a;

    goto :goto_2

    :cond_e
    move-object v1, v4

    :goto_2
    if-eqz v0, :cond_10

    if-eqz v1, :cond_f

    goto :goto_3

    :cond_f
    invoke-virtual {v0}, LJ0/n;->r()LJ0/n;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    if-eqz v1, :cond_e

    sget-object v2, LJ0/i;->a:LJ0/i;

    invoke-virtual {v2}, LJ0/i;->t()LJ0/v;

    move-result-object v2

    invoke-static {v1, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/a;

    goto :goto_2

    :cond_10
    :goto_3
    if-nez v0, :cond_11

    return v8

    :cond_11
    invoke-virtual {v0}, LJ0/n;->p()LC0/v;

    move-result-object v2

    invoke-interface {v2}, LC0/v;->c()LC0/r;

    move-result-object v2

    invoke-static {v2}, LC0/s;->a(LC0/r;)Ll0/i;

    move-result-object v2

    invoke-virtual {v0}, LJ0/n;->p()LC0/v;

    move-result-object v4

    invoke-interface {v4}, LC0/v;->c()LC0/r;

    move-result-object v4

    invoke-interface {v4}, LC0/r;->a0()LC0/r;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-static {v4}, LC0/s;->e(LC0/r;)J

    move-result-wide v9

    goto :goto_4

    :cond_12
    sget-object v4, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v4}, Ll0/g$a;->c()J

    move-result-wide v9

    :goto_4
    invoke-virtual {v2, v9, v10}, Ll0/i;->x(J)Ll0/i;

    move-result-object v2

    invoke-virtual {v3}, LJ0/n;->s()J

    move-result-wide v9

    invoke-virtual {v3}, LJ0/n;->u()J

    move-result-wide v11

    invoke-static {v11, v12}, LY0/s;->d(J)J

    move-result-wide v11

    invoke-static {v9, v10, v11, v12}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v4

    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    sget-object v9, LJ0/q;->a:LJ0/q;

    invoke-virtual {v9}, LJ0/q;->k()LJ0/v;

    move-result-object v10

    invoke-static {v6, v10}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/h;

    invoke-virtual {v0}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v9}, LJ0/q;->I()LJ0/v;

    move-result-object v9

    invoke-static {v0, v9}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/h;

    invoke-virtual {v4}, Ll0/i;->k()F

    move-result v9

    invoke-virtual {v2}, Ll0/i;->k()F

    move-result v10

    sub-float/2addr v9, v10

    invoke-virtual {v4}, Ll0/i;->l()F

    move-result v10

    invoke-virtual {v2}, Ll0/i;->l()F

    move-result v11

    sub-float/2addr v10, v11

    invoke-static {v9, v10}, Landroidx/compose/ui/platform/x;->x0(FF)F

    move-result v9

    if-eqz v6, :cond_13

    invoke-virtual {v6}, LJ0/h;->b()Z

    move-result v6

    if-ne v6, v5, :cond_13

    neg-float v9, v9

    :cond_13
    invoke-static {v3}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v3

    if-eqz v3, :cond_14

    neg-float v9, v9

    :cond_14
    invoke-virtual {v4}, Ll0/i;->n()F

    move-result v3

    invoke-virtual {v2}, Ll0/i;->n()F

    move-result v6

    sub-float/2addr v3, v6

    invoke-virtual {v4}, Ll0/i;->e()F

    move-result v4

    invoke-virtual {v2}, Ll0/i;->e()F

    move-result v2

    sub-float/2addr v4, v2

    invoke-static {v3, v4}, Landroidx/compose/ui/platform/x;->x0(FF)F

    move-result v2

    if-eqz v0, :cond_15

    invoke-virtual {v0}, LJ0/h;->b()Z

    move-result v0

    if-ne v0, v5, :cond_15

    neg-float v2, v2

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/p;

    if-eqz v0, :cond_16

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_16
    return v8

    :sswitch_3
    if-eqz v2, :cond_17

    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_17
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->y()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/l;

    if-eqz v0, :cond_19

    new-instance v1, LL0/d;

    if-nez v4, :cond_18

    const-string v4, ""

    :cond_18
    move-object v10, v4

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_19
    return v8

    :sswitch_4
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->f()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_1a
    return v8

    :sswitch_5
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->b()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_1b
    return v8

    :sswitch_6
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->g()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_1c

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_1c
    return v8

    :sswitch_7
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->e()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_1d

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_1d
    return v8

    :sswitch_8
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->r()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_1e

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_1e
    return v8

    :pswitch_4
    :sswitch_9
    const/16 v1, 0x1000

    if-ne v0, v1, :cond_1f

    move v1, v5

    goto :goto_5

    :cond_1f
    move v1, v8

    :goto_5
    const/16 v2, 0x2000

    if-ne v0, v2, :cond_20

    move v2, v5

    goto :goto_6

    :cond_20
    move v2, v8

    :goto_6
    const v4, 0x1020039

    if-ne v0, v4, :cond_21

    move v4, v5

    goto :goto_7

    :cond_21
    move v4, v8

    :goto_7
    const v6, 0x102003b

    if-ne v0, v6, :cond_22

    move v6, v5

    goto :goto_8

    :cond_22
    move v6, v8

    :goto_8
    const v9, 0x1020038

    if-ne v0, v9, :cond_23

    move v9, v5

    goto :goto_9

    :cond_23
    move v9, v8

    :goto_9
    const v10, 0x102003a

    if-ne v0, v10, :cond_24

    move v0, v5

    goto :goto_a

    :cond_24
    move v0, v8

    :goto_a
    if-nez v4, :cond_26

    if-nez v6, :cond_26

    if-nez v1, :cond_26

    if-eqz v2, :cond_25

    goto :goto_b

    :cond_25
    move v10, v8

    goto :goto_c

    :cond_26
    :goto_b
    move v10, v5

    :goto_c
    if-nez v9, :cond_28

    if-nez v0, :cond_28

    if-nez v1, :cond_28

    if-eqz v2, :cond_27

    goto :goto_d

    :cond_27
    move v0, v8

    goto :goto_e

    :cond_28
    :goto_d
    move v0, v5

    :goto_e
    if-nez v1, :cond_29

    if-eqz v2, :cond_2d

    :cond_29
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    sget-object v11, LJ0/q;->a:LJ0/q;

    invoke-virtual {v11}, LJ0/q;->x()LJ0/v;

    move-result-object v11

    invoke-static {v1, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/f;

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v11

    sget-object v12, LJ0/i;->a:LJ0/i;

    invoke-virtual {v12}, LJ0/i;->w()LJ0/v;

    move-result-object v12

    invoke-static {v11, v12}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJ0/a;

    if-eqz v1, :cond_2d

    if-eqz v11, :cond_2d

    invoke-virtual {v1}, LJ0/f;->c()Lsh/e;

    move-result-object v0

    invoke-interface {v0}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {v1}, LJ0/f;->c()Lsh/e;

    move-result-object v3

    invoke-interface {v3}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v0, v3}, Lsh/m;->c(FF)F

    move-result v0

    invoke-virtual {v1}, LJ0/f;->c()Lsh/e;

    move-result-object v3

    invoke-interface {v3}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {v1}, LJ0/f;->c()Lsh/e;

    move-result-object v4

    invoke-interface {v4}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v3, v4}, Lsh/m;->f(FF)F

    move-result v3

    invoke-virtual {v1}, LJ0/f;->d()I

    move-result v4

    if-lez v4, :cond_2a

    sub-float/2addr v0, v3

    invoke-virtual {v1}, LJ0/f;->d()I

    move-result v3

    add-int/2addr v3, v5

    :goto_f
    int-to-float v3, v3

    div-float/2addr v0, v3

    goto :goto_10

    :cond_2a
    sub-float/2addr v0, v3

    const/16 v3, 0x14

    goto :goto_f

    :goto_10
    if-eqz v2, :cond_2b

    neg-float v0, v0

    :cond_2b
    invoke-virtual {v11}, LJ0/a;->a()LYg/i;

    move-result-object v2

    check-cast v2, Lmh/l;

    if-eqz v2, :cond_2c

    invoke-virtual {v1}, LJ0/f;->b()F

    move-result v1

    add-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v2, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :cond_2c
    return v8

    :cond_2d
    invoke-virtual {v3}, LJ0/n;->p()LC0/v;

    move-result-object v1

    invoke-interface {v1}, LC0/v;->c()LC0/r;

    move-result-object v1

    invoke-static {v1}, LC0/s;->a(LC0/r;)Ll0/i;

    move-result-object v1

    invoke-virtual {v1}, Ll0/i;->m()J

    move-result-wide v11

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/l1;->d(LJ0/j;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    sget-object v13, LJ0/i;->a:LJ0/i;

    invoke-virtual {v13}, LJ0/i;->t()LJ0/v;

    move-result-object v14

    invoke-static {v5, v14}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-nez v5, :cond_2e

    return v8

    :cond_2e
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v14

    sget-object v15, LJ0/q;->a:LJ0/q;

    invoke-virtual {v15}, LJ0/q;->k()LJ0/v;

    move-result-object v8

    invoke-static {v14, v8}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJ0/h;

    const/4 v14, 0x0

    if-eqz v8, :cond_39

    if-eqz v10, :cond_39

    if-eqz v1, :cond_2f

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v10

    goto :goto_11

    :cond_2f
    invoke-static {v11, v12}, Ll0/m;->i(J)F

    move-result v10

    :goto_11
    if-nez v4, :cond_30

    if-eqz v2, :cond_31

    :cond_30
    neg-float v10, v10

    :cond_31
    invoke-virtual {v8}, LJ0/h;->b()Z

    move-result v16

    if-eqz v16, :cond_32

    neg-float v10, v10

    :cond_32
    invoke-static {v3}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v16

    if-eqz v16, :cond_34

    if-nez v4, :cond_33

    if-eqz v6, :cond_34

    :cond_33
    neg-float v10, v10

    :cond_34
    invoke-static {v8, v10}, Landroidx/compose/ui/platform/x;->w0(LJ0/h;F)Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->o()LJ0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-nez v0, :cond_37

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->p()LJ0/v;

    move-result-object v1

    invoke-virtual {v0, v1}, LJ0/j;->f(LJ0/v;)Z

    move-result v0

    if-eqz v0, :cond_35

    goto :goto_12

    :cond_35
    invoke-virtual {v5}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/p;

    if-eqz v0, :cond_36

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_14

    :cond_36
    const/4 v8, 0x0

    goto :goto_14

    :cond_37
    :goto_12
    cmpl-float v0, v10, v14

    if-lez v0, :cond_38

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->p()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    goto :goto_13

    :cond_38
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->o()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    :goto_13
    if-eqz v0, :cond_36

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_36

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :goto_14
    return v8

    :cond_39
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v4

    invoke-virtual {v15}, LJ0/q;->I()LJ0/v;

    move-result-object v6

    invoke-static {v4, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ0/h;

    if-eqz v4, :cond_42

    if-eqz v0, :cond_42

    if-eqz v1, :cond_3a

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_15

    :cond_3a
    invoke-static {v11, v12}, Ll0/m;->g(J)F

    move-result v0

    :goto_15
    if-nez v9, :cond_3b

    if-eqz v2, :cond_3c

    :cond_3b
    neg-float v0, v0

    :cond_3c
    invoke-virtual {v4}, LJ0/h;->b()Z

    move-result v1

    if-eqz v1, :cond_3d

    neg-float v0, v0

    :cond_3d
    invoke-static {v4, v0}, Landroidx/compose/ui/platform/x;->w0(LJ0/h;F)Z

    move-result v1

    if-eqz v1, :cond_42

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-virtual {v13}, LJ0/i;->q()LJ0/v;

    move-result-object v2

    invoke-virtual {v1, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-nez v1, :cond_40

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v1

    invoke-virtual {v13}, LJ0/i;->n()LJ0/v;

    move-result-object v2

    invoke-virtual {v1, v2}, LJ0/j;->f(LJ0/v;)Z

    move-result v1

    if-eqz v1, :cond_3e

    goto :goto_16

    :cond_3e
    invoke-virtual {v5}, LJ0/a;->a()LYg/i;

    move-result-object v1

    check-cast v1, Lmh/p;

    if-eqz v1, :cond_3f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_18

    :cond_3f
    const/4 v8, 0x0

    goto :goto_18

    :cond_40
    :goto_16
    cmpl-float v0, v0, v14

    if-lez v0, :cond_41

    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->n()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    goto :goto_17

    :cond_41
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v13}, LJ0/i;->q()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    :goto_17
    if-eqz v0, :cond_3f

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_3f

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    :goto_18
    return v8

    :cond_42
    const/4 v0, 0x0

    return v0

    :sswitch_a
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->m()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_43

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_43

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_19

    :cond_43
    const/4 v8, 0x0

    :goto_19
    return v8

    :sswitch_b
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v2, LJ0/i;->a:LJ0/i;

    invoke-virtual {v2}, LJ0/i;->k()LJ0/v;

    move-result-object v2

    invoke-static {v0, v2}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_44

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_44

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Boolean;

    :cond_44
    move-object v8, v4

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    if-eqz v8, :cond_45

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_1a

    :cond_45
    const/4 v8, 0x0

    :goto_1a
    return v8

    :cond_46
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/q;->a:LJ0/q;

    invoke-virtual {v1}, LJ0/q;->i()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_47

    iget-object v0, v7, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getFocusOwner()Lk0/g;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v5, v5, v1}, Lk0/g;->e(ZZZI)Z

    move v8, v5

    goto :goto_1b

    :cond_47
    const/4 v8, 0x0

    :goto_1b
    return v8

    :cond_48
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->s()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_49

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_49

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_1c

    :cond_49
    const/4 v8, 0x0

    :goto_1c
    return v8

    :cond_4a
    const/4 v0, -0x1

    if-eqz v2, :cond_4b

    const-string v1, "ACTION_ARGUMENT_SELECTION_START_INT"

    invoke-virtual {v2, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    goto :goto_1d

    :cond_4b
    move v1, v0

    :goto_1d
    if-eqz v2, :cond_4c

    const-string v4, "ACTION_ARGUMENT_SELECTION_END_INT"

    invoke-virtual {v2, v4, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    :cond_4c
    const/4 v2, 0x0

    invoke-direct {v7, v3, v1, v0, v2}, Landroidx/compose/ui/platform/x;->P0(LJ0/n;IIZ)Z

    move-result v8

    if-eqz v8, :cond_4d

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v0

    invoke-direct {v7, v0}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result v1

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/platform/x;->J0(Landroidx/compose/ui/platform/x;IILjava/lang/Integer;Ljava/util/List;ILjava/lang/Object;)Z

    :cond_4d
    return v8

    :cond_4e
    invoke-virtual {v3}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->c()LJ0/v;

    move-result-object v1

    invoke-static {v0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/a;

    if-eqz v0, :cond_4f

    invoke-virtual {v0}, LJ0/a;->a()LYg/i;

    move-result-object v0

    check-cast v0, Lmh/a;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    goto :goto_1e

    :cond_4f
    const/4 v8, 0x0

    :goto_1e
    return v8

    :cond_50
    if-eqz v2, :cond_52

    const-string v1, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v6, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    if-ne v0, v4, :cond_51

    move v8, v5

    goto :goto_1f

    :cond_51
    const/4 v8, 0x0

    :goto_1f
    invoke-direct {v7, v3, v1, v8, v2}, Landroidx/compose/ui/platform/x;->d1(LJ0/n;IZZ)Z

    move-result v0

    return v0

    :cond_52
    const/4 v0, 0x0

    return v0

    :cond_53
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/x;->Q(I)Z

    move-result v0

    return v0

    :cond_54
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/platform/x;->C0(I)Z

    move-result v0

    :goto_20
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_9
        0x2000 -> :sswitch_9
        0x8000 -> :sswitch_8
        0x10000 -> :sswitch_7
        0x40000 -> :sswitch_6
        0x80000 -> :sswitch_5
        0x100000 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x1020036 -> :sswitch_2
        0x102003d -> :sswitch_1
        0x1020054 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final synthetic w(Landroidx/compose/ui/platform/x;)LG1/t;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->p:LG1/t;

    return-object p0
.end method

.method private static final w0(LJ0/h;F)Z
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v0

    if-gtz v1, :cond_1

    :cond_0
    cmpl-float p1, p1, v0

    if-lez p1, :cond_2

    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0}, LJ0/h;->a()Lmh/a;

    move-result-object p0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic x(Landroidx/compose/ui/platform/x;)Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->j:Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;

    return-object p0
.end method

.method private static final x0(FF)F
    .locals 2

    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic y(Landroidx/compose/ui/platform/x;)I
    .locals 0

    iget p0, p0, Landroidx/compose/ui/platform/x;->o:I

    return p0
.end method

.method private final y0(ILG1/t;LJ0/n;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const/4 v4, 0x1

    const-string v5, "android.view.View"

    invoke-virtual {v2, v5}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    sget-object v6, LJ0/q;->a:LJ0/q;

    invoke-virtual {v6}, LJ0/q;->g()LJ0/v;

    move-result-object v7

    invoke-virtual {v5, v7}, LJ0/j;->f(LJ0/v;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "android.widget.EditText"

    invoke-virtual {v2, v5}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v6}, LJ0/q;->D()LJ0/v;

    move-result-object v7

    invoke-virtual {v5, v7}, LJ0/j;->f(LJ0/v;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "android.widget.TextView"

    invoke-virtual {v2, v5}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v6}, LJ0/q;->y()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/g;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LJ0/g;->n()I

    invoke-virtual/range {p3 .. p3}, LJ0/n;->x()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual/range {p3 .. p3}, LJ0/n;->t()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_2
    sget-object v6, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v6}, LJ0/g$a;->g()I

    move-result v7

    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v8

    invoke-static {v8, v7}, LJ0/g;->k(II)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v6, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lf0/i;->q:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LG1/t;->F0(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v6}, LJ0/g$a;->f()I

    move-result v7

    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v8

    invoke-static {v8, v7}, LJ0/g;->k(II)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-object v6, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lf0/i;->p:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LG1/t;->F0(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v7

    invoke-static {v7}, Landroidx/compose/ui/platform/l1;->i(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, LJ0/g$a;->d()I

    move-result v6

    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v8

    invoke-static {v8, v6}, LJ0/g;->k(II)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual/range {p3 .. p3}, LJ0/n;->A()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v6}, LJ0/j;->u()Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_5
    invoke-virtual {v2, v7}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_0
    sget-object v6, LYg/J;->a:LYg/J;

    :cond_7
    iget-object v6, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, LG1/t;->z0(Ljava/lang/CharSequence;)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/l1;->f(LJ0/n;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->t0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->t()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    move v9, v8

    :goto_1
    const/4 v10, -0x1

    if-ge v9, v7, :cond_b

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LJ0/n;

    invoke-direct/range {p0 .. p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v12

    invoke-virtual {v11}, LJ0/n;->o()I

    move-result v13

    invoke-virtual {v12, v13}, Lo/m;->a(I)Z

    move-result v12

    if-eqz v12, :cond_a

    iget-object v12, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v12}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v12

    invoke-virtual {v11}, LJ0/n;->q()LE0/G;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/viewinterop/c;

    invoke-virtual {v11}, LJ0/n;->o()I

    move-result v13

    if-ne v13, v10, :cond_8

    goto :goto_2

    :cond_8
    if-eqz v12, :cond_9

    invoke-virtual {v2, v12}, LG1/t;->c(Landroid/view/View;)V

    goto :goto_2

    :cond_9
    iget-object v10, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v11}, LJ0/n;->o()I

    move-result v11

    invoke-virtual {v2, v10, v11}, LG1/t;->d(Landroid/view/View;I)V

    :cond_a
    :goto_2
    add-int/2addr v9, v4

    goto :goto_1

    :cond_b
    iget v6, v0, Landroidx/compose/ui/platform/x;->o:I

    if-ne v1, v6, :cond_c

    invoke-virtual {v2, v4}, LG1/t;->Z(Z)V

    sget-object v6, LG1/t$a;->l:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    goto :goto_3

    :cond_c
    invoke-virtual {v2, v8}, LG1/t;->Z(Z)V

    sget-object v6, LG1/t$a;->k:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :goto_3
    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/x;->U0(LJ0/n;LG1/t;)V

    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/x;->Q0(LJ0/n;LG1/t;)V

    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/x;->T0(LJ0/n;LG1/t;)V

    invoke-direct {v0, v3, v2}, Landroidx/compose/ui/platform/x;->R0(LJ0/n;LG1/t;)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    sget-object v7, LJ0/q;->a:LJ0/q;

    invoke-virtual {v7}, LJ0/q;->G()LJ0/v;

    move-result-object v9

    invoke-static {v6, v9}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LK0/a;

    if-eqz v6, :cond_f

    sget-object v9, LK0/a;->On:LK0/a;

    if-ne v6, v9, :cond_d

    invoke-virtual {v2, v4}, LG1/t;->f0(Z)V

    goto :goto_4

    :cond_d
    sget-object v9, LK0/a;->Off:LK0/a;

    if-ne v6, v9, :cond_e

    invoke-virtual {v2, v8}, LG1/t;->f0(Z)V

    :cond_e
    :goto_4
    sget-object v6, LYg/J;->a:LYg/J;

    :cond_f
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->A()LJ0/v;

    move-result-object v9

    invoke-static {v6, v9}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    if-eqz v6, :cond_12

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    sget-object v9, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v9}, LJ0/g$a;->g()I

    move-result v9

    if-nez v5, :cond_10

    move v9, v8

    goto :goto_5

    :cond_10
    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v11

    invoke-static {v11, v9}, LJ0/g;->k(II)Z

    move-result v9

    :goto_5
    if-eqz v9, :cond_11

    invoke-virtual {v2, v6}, LG1/t;->I0(Z)V

    goto :goto_6

    :cond_11
    invoke-virtual {v2, v6}, LG1/t;->f0(Z)V

    :goto_6
    sget-object v6, LYg/J;->a:LYg/J;

    :cond_12
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v6}, LJ0/j;->u()Z

    move-result v6

    const/4 v9, 0x0

    if-eqz v6, :cond_13

    invoke-virtual/range {p3 .. p3}, LJ0/n;->t()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_15

    :cond_13
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->d()LJ0/v;

    move-result-object v11

    invoke-static {v6, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    if-eqz v6, :cond_14

    invoke-static {v6}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    goto :goto_7

    :cond_14
    move-object v6, v9

    :goto_7
    invoke-virtual {v2, v6}, LG1/t;->k0(Ljava/lang/CharSequence;)V

    :cond_15
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->C()LJ0/v;

    move-result-object v7

    invoke-static {v6, v7}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_18

    move-object v7, v3

    :goto_8
    if-eqz v7, :cond_17

    invoke-virtual {v7}, LJ0/n;->w()LJ0/j;

    move-result-object v11

    sget-object v12, LJ0/r;->a:LJ0/r;

    invoke-virtual {v12}, LJ0/r;->a()LJ0/v;

    move-result-object v13

    invoke-virtual {v11, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-virtual {v7}, LJ0/n;->w()LJ0/j;

    move-result-object v7

    invoke-virtual {v12}, LJ0/r;->a()LJ0/v;

    move-result-object v11

    invoke-virtual {v7, v11}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_9

    :cond_16
    invoke-virtual {v7}, LJ0/n;->r()LJ0/n;

    move-result-object v7

    goto :goto_8

    :cond_17
    move v7, v8

    :goto_9
    if-eqz v7, :cond_18

    invoke-virtual {v2, v6}, LG1/t;->S0(Ljava/lang/String;)V

    :cond_18
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    sget-object v7, LJ0/q;->a:LJ0/q;

    invoke-virtual {v7}, LJ0/q;->j()LJ0/v;

    move-result-object v11

    invoke-static {v6, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LYg/J;

    if-eqz v6, :cond_19

    invoke-virtual {v2, v4}, LG1/t;->r0(Z)V

    sget-object v6, LYg/J;->a:LYg/J;

    :cond_19
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->w()LJ0/v;

    move-result-object v11

    invoke-virtual {v6, v11}, LJ0/j;->f(LJ0/v;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->D0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->p()LJ0/v;

    move-result-object v11

    invoke-virtual {v6, v11}, LJ0/j;->f(LJ0/v;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->m0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->u()LJ0/v;

    move-result-object v11

    invoke-static {v6, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_1a

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_a

    :cond_1a
    move v6, v10

    :goto_a
    invoke-virtual {v2, v6}, LG1/t;->x0(I)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->n0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->i()LJ0/v;

    move-result-object v11

    invoke-virtual {v6, v11}, LJ0/j;->f(LJ0/v;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->p0(Z)V

    invoke-virtual/range {p2 .. p2}, LG1/t;->J()Z

    move-result v6

    const/4 v11, 0x2

    if-eqz v6, :cond_1c

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->i()LJ0/v;

    move-result-object v12

    invoke-virtual {v6, v12}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->q0(Z)V

    invoke-virtual/range {p2 .. p2}, LG1/t;->K()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-virtual {v2, v11}, LG1/t;->a(I)V

    goto :goto_b

    :cond_1b
    invoke-virtual {v2, v4}, LG1/t;->a(I)V

    :cond_1c
    :goto_b
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/l1;->g(LJ0/n;)Z

    move-result v6

    invoke-virtual {v2, v6}, LG1/t;->T0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->t()LJ0/v;

    move-result-object v12

    invoke-static {v6, v12}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/e;

    if-eqz v6, :cond_1f

    invoke-virtual {v6}, LJ0/e;->i()I

    move-result v6

    sget-object v12, LJ0/e;->b:LJ0/e$a;

    invoke-virtual {v12}, LJ0/e$a;->b()I

    move-result v13

    invoke-static {v6, v13}, LJ0/e;->f(II)Z

    move-result v13

    if-eqz v13, :cond_1e

    :cond_1d
    move v11, v4

    goto :goto_c

    :cond_1e
    invoke-virtual {v12}, LJ0/e$a;->a()I

    move-result v12

    invoke-static {v6, v12}, LJ0/e;->f(II)Z

    move-result v6

    if-eqz v6, :cond_1d

    :goto_c
    invoke-virtual {v2, v11}, LG1/t;->v0(I)V

    sget-object v6, LYg/J;->a:LYg/J;

    :cond_1f
    invoke-virtual {v2, v8}, LG1/t;->h0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    sget-object v11, LJ0/i;->a:LJ0/i;

    invoke-virtual {v11}, LJ0/i;->k()LJ0/v;

    move-result-object v12

    invoke-static {v6, v12}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/a;

    if-eqz v6, :cond_27

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v7}, LJ0/q;->A()LJ0/v;

    move-result-object v13

    invoke-static {v12, v13}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    sget-object v13, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v13}, LJ0/g$a;->g()I

    move-result v14

    if-nez v5, :cond_20

    move v14, v8

    goto :goto_d

    :cond_20
    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v15

    invoke-static {v15, v14}, LJ0/g;->k(II)Z

    move-result v14

    :goto_d
    if-nez v14, :cond_23

    invoke-virtual {v13}, LJ0/g$a;->e()I

    move-result v13

    if-nez v5, :cond_21

    move v5, v8

    goto :goto_e

    :cond_21
    invoke-virtual {v5}, LJ0/g;->n()I

    move-result v5

    invoke-static {v5, v13}, LJ0/g;->k(II)Z

    move-result v5

    :goto_e
    if-eqz v5, :cond_22

    goto :goto_f

    :cond_22
    move v5, v8

    goto :goto_10

    :cond_23
    :goto_f
    move v5, v4

    :goto_10
    if-eqz v5, :cond_25

    if-eqz v5, :cond_24

    if-nez v12, :cond_24

    goto :goto_11

    :cond_24
    move v5, v8

    goto :goto_12

    :cond_25
    :goto_11
    move v5, v4

    :goto_12
    invoke-virtual {v2, v5}, LG1/t;->h0(Z)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-virtual/range {p2 .. p2}, LG1/t;->G()Z

    move-result v5

    if-eqz v5, :cond_26

    new-instance v5, LG1/t$a;

    const/16 v12, 0x10

    invoke-virtual {v6}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v12, v6}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v5}, LG1/t;->b(LG1/t$a;)V

    :cond_26
    sget-object v5, LYg/J;->a:LYg/J;

    :cond_27
    invoke-virtual {v2, v8}, LG1/t;->w0(Z)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->m()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_29

    invoke-virtual {v2, v4}, LG1/t;->w0(Z)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v6

    if-eqz v6, :cond_28

    new-instance v6, LG1/t$a;

    const/16 v12, 0x20

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :cond_28
    sget-object v5, LYg/J;->a:LYg/J;

    :cond_29
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->c()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_2a

    new-instance v6, LG1/t$a;

    const/16 v12, 0x4000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2a
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v5

    if-eqz v5, :cond_2f

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->y()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_2b

    new-instance v6, LG1/t$a;

    const/high16 v12, 0x200000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2b
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->l()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_2c

    new-instance v6, LG1/t$a;

    const v12, 0x1020054

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2c
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->e()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_2d

    new-instance v6, LG1/t$a;

    const/high16 v12, 0x10000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2d
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->r()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_2f

    invoke-virtual/range {p2 .. p2}, LG1/t;->K()Z

    move-result v6

    if-eqz v6, :cond_2e

    iget-object v6, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/r;->getClipboardManager()Landroidx/compose/ui/platform/k;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/platform/k;->c()Z

    move-result v6

    if-eqz v6, :cond_2e

    new-instance v6, LG1/t$a;

    const v12, 0x8000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :cond_2e
    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2f
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/x;->i0(LJ0/n;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_31

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_30

    goto :goto_13

    :cond_30
    move v5, v8

    goto :goto_14

    :cond_31
    :goto_13
    move v5, v4

    :goto_14
    if-nez v5, :cond_35

    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/x;->Z(LJ0/n;)I

    move-result v5

    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/x;->Y(LJ0/n;)I

    move-result v6

    invoke-virtual {v2, v5, v6}, LG1/t;->N0(II)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->x()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    new-instance v6, LG1/t$a;

    if-eqz v5, :cond_32

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    goto :goto_15

    :cond_32
    move-object v5, v9

    :goto_15
    const/high16 v12, 0x20000

    invoke-direct {v6, v12, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    const/16 v5, 0x100

    invoke-virtual {v2, v5}, LG1/t;->a(I)V

    const/16 v5, 0x200

    invoke-virtual {v2, v5}, LG1/t;->a(I)V

    const/16 v5, 0xb

    invoke-virtual {v2, v5}, LG1/t;->y0(I)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v7}, LJ0/q;->d()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    if-eqz v5, :cond_34

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_33

    goto :goto_16

    :cond_33
    move v5, v8

    goto :goto_17

    :cond_34
    :goto_16
    move v5, v4

    :goto_17
    if-eqz v5, :cond_35

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->i()LJ0/v;

    move-result-object v6

    invoke-virtual {v5, v6}, LJ0/j;->f(LJ0/v;)Z

    move-result v5

    if-eqz v5, :cond_35

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->c(LJ0/n;)Z

    move-result v5

    if-nez v5, :cond_35

    invoke-virtual/range {p2 .. p2}, LG1/t;->v()I

    move-result v5

    or-int/lit8 v5, v5, 0x14

    invoke-virtual {v2, v5}, LG1/t;->y0(I)V

    :cond_35
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const-string v12, "androidx.compose.ui.semantics.id"

    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p2 .. p2}, LG1/t;->y()Ljava/lang/CharSequence;

    move-result-object v12

    if-eqz v12, :cond_37

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_36

    goto :goto_18

    :cond_36
    move v12, v8

    goto :goto_19

    :cond_37
    :goto_18
    move v12, v4

    :goto_19
    if-nez v12, :cond_38

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v11}, LJ0/i;->i()LJ0/v;

    move-result-object v13

    invoke-virtual {v12, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v12

    if-eqz v12, :cond_38

    const-string v12, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_38
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v7}, LJ0/q;->C()LJ0/v;

    move-result-object v13

    invoke-virtual {v12, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v12

    if-eqz v12, :cond_39

    const-string v12, "androidx.compose.ui.semantics.testTag"

    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_39
    invoke-virtual {v2, v6}, LG1/t;->a0(Ljava/util/List;)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->x()LJ0/v;

    move-result-object v12

    invoke-static {v6, v12}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/f;

    if-eqz v6, :cond_3d

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v11}, LJ0/i;->w()LJ0/v;

    move-result-object v13

    invoke-virtual {v12, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v12

    if-eqz v12, :cond_3a

    const-string v12, "android.widget.SeekBar"

    invoke-virtual {v2, v12}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    goto :goto_1a

    :cond_3a
    const-string v12, "android.widget.ProgressBar"

    invoke-virtual {v2, v12}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :goto_1a
    sget-object v12, LJ0/f;->d:LJ0/f$a;

    invoke-virtual {v12}, LJ0/f$a;->a()LJ0/f;

    move-result-object v12

    if-eq v6, v12, :cond_3b

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v12

    invoke-interface {v12}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v13

    invoke-interface {v13}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    invoke-virtual {v6}, LJ0/f;->b()F

    move-result v14

    invoke-static {v4, v12, v13, v14}, LG1/t$g;->a(IFFF)LG1/t$g;

    move-result-object v12

    invoke-virtual {v2, v12}, LG1/t;->E0(LG1/t$g;)V

    :cond_3b
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v11}, LJ0/i;->w()LJ0/v;

    move-result-object v13

    invoke-virtual {v12, v13}, LJ0/j;->f(LJ0/v;)Z

    move-result v12

    if-eqz v12, :cond_3d

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v12

    if-eqz v12, :cond_3d

    invoke-virtual {v6}, LJ0/f;->b()F

    move-result v12

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v13

    invoke-interface {v13}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v14

    invoke-interface {v14}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    invoke-static {v13, v14}, Lsh/m;->c(FF)F

    move-result v13

    cmpg-float v12, v12, v13

    if-gez v12, :cond_3c

    sget-object v12, LG1/t$a;->q:LG1/t$a;

    invoke-virtual {v2, v12}, LG1/t;->b(LG1/t$a;)V

    :cond_3c
    invoke-virtual {v6}, LJ0/f;->b()F

    move-result v12

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v13

    invoke-interface {v13}, Lsh/f;->e()Ljava/lang/Comparable;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    invoke-virtual {v6}, LJ0/f;->c()Lsh/e;

    move-result-object v6

    invoke-interface {v6}, Lsh/f;->g()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    invoke-static {v13, v6}, Lsh/m;->f(FF)F

    move-result v6

    cmpl-float v6, v12, v6

    if-lez v6, :cond_3d

    sget-object v6, LG1/t$a;->r:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :cond_3d
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/platform/x$b;->a(LG1/t;LJ0/n;)V

    invoke-static {v3, v2}, LF0/a;->d(LJ0/n;LG1/t;)V

    invoke-static {v3, v2}, LF0/a;->e(LJ0/n;LG1/t;)V

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->k()LJ0/v;

    move-result-object v12

    invoke-static {v6, v12}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/h;

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v12

    invoke-virtual {v11}, LJ0/i;->t()LJ0/v;

    move-result-object v13

    invoke-static {v12, v13}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LJ0/a;

    const/4 v13, 0x0

    if-eqz v6, :cond_43

    if-eqz v12, :cond_43

    invoke-static/range {p3 .. p3}, LF0/a;->b(LJ0/n;)Z

    move-result v14

    if-nez v14, :cond_3e

    const-string v14, "android.widget.HorizontalScrollView"

    invoke-virtual {v2, v14}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :cond_3e
    invoke-virtual {v6}, LJ0/h;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v14}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    cmpl-float v14, v14, v13

    if-lez v14, :cond_3f

    invoke-virtual {v2, v4}, LG1/t;->H0(Z)V

    :cond_3f
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v14

    if-eqz v14, :cond_43

    invoke-static {v6}, Landroidx/compose/ui/platform/x;->A0(LJ0/h;)Z

    move-result v14

    if-eqz v14, :cond_41

    sget-object v14, LG1/t$a;->q:LG1/t$a;

    invoke-virtual {v2, v14}, LG1/t;->b(LG1/t$a;)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v14

    if-nez v14, :cond_40

    sget-object v14, LG1/t$a;->F:LG1/t$a;

    goto :goto_1b

    :cond_40
    sget-object v14, LG1/t$a;->D:LG1/t$a;

    :goto_1b
    invoke-virtual {v2, v14}, LG1/t;->b(LG1/t$a;)V

    :cond_41
    invoke-static {v6}, Landroidx/compose/ui/platform/x;->z0(LJ0/h;)Z

    move-result v6

    if-eqz v6, :cond_43

    sget-object v6, LG1/t$a;->r:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->e(LJ0/n;)Z

    move-result v6

    if-nez v6, :cond_42

    sget-object v6, LG1/t$a;->D:LG1/t$a;

    goto :goto_1c

    :cond_42
    sget-object v6, LG1/t$a;->F:LG1/t$a;

    :goto_1c
    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :cond_43
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v6

    invoke-virtual {v7}, LJ0/q;->I()LJ0/v;

    move-result-object v14

    invoke-static {v6, v14}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/h;

    if-eqz v6, :cond_47

    if-eqz v12, :cond_47

    invoke-static/range {p3 .. p3}, LF0/a;->b(LJ0/n;)Z

    move-result v12

    if-nez v12, :cond_44

    const-string v12, "android.widget.ScrollView"

    invoke-virtual {v2, v12}, LG1/t;->g0(Ljava/lang/CharSequence;)V

    :cond_44
    invoke-virtual {v6}, LJ0/h;->a()Lmh/a;

    move-result-object v12

    invoke-interface {v12}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    cmpl-float v12, v12, v13

    if-lez v12, :cond_45

    invoke-virtual {v2, v4}, LG1/t;->H0(Z)V

    :cond_45
    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v12

    if-eqz v12, :cond_47

    invoke-static {v6}, Landroidx/compose/ui/platform/x;->A0(LJ0/h;)Z

    move-result v12

    if-eqz v12, :cond_46

    sget-object v12, LG1/t$a;->q:LG1/t$a;

    invoke-virtual {v2, v12}, LG1/t;->b(LG1/t$a;)V

    sget-object v12, LG1/t$a;->E:LG1/t$a;

    invoke-virtual {v2, v12}, LG1/t;->b(LG1/t$a;)V

    :cond_46
    invoke-static {v6}, Landroidx/compose/ui/platform/x;->z0(LJ0/h;)Z

    move-result v6

    if-eqz v6, :cond_47

    sget-object v6, LG1/t$a;->r:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v6, LG1/t$a;->C:LG1/t$a;

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    :cond_47
    const/16 v6, 0x1d

    if-lt v5, v6, :cond_48

    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/platform/x$c;->a(LG1/t;LJ0/n;)V

    :cond_48
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v7}, LJ0/q;->v()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v2, v5}, LG1/t;->A0(Ljava/lang/CharSequence;)V

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/platform/A;->b(LJ0/n;)Z

    move-result v5

    if-eqz v5, :cond_52

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->g()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_49

    new-instance v6, LG1/t$a;

    const/high16 v7, 0x40000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_49
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->b()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_4a

    new-instance v6, LG1/t$a;

    const/high16 v7, 0x80000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_4a
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->f()LJ0/v;

    move-result-object v6

    invoke-static {v5, v6}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJ0/a;

    if-eqz v5, :cond_4b

    new-instance v6, LG1/t$a;

    const/high16 v7, 0x100000

    invoke-virtual {v5}, LJ0/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v7, v5}, LG1/t$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v2, v6}, LG1/t;->b(LG1/t$a;)V

    sget-object v5, LYg/J;->a:LYg/J;

    :cond_4b
    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->d()LJ0/v;

    move-result-object v6

    invoke-virtual {v5, v6}, LJ0/j;->f(LJ0/v;)Z

    move-result v5

    if-eqz v5, :cond_52

    invoke-virtual/range {p3 .. p3}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v11}, LJ0/i;->d()LJ0/v;

    move-result-object v6

    invoke-virtual {v5, v6}, LJ0/j;->j(LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    sget-object v7, Landroidx/compose/ui/platform/x;->Q:Lo/k;

    invoke-virtual {v7}, Lo/k;->b()I

    move-result v11

    if-ge v6, v11, :cond_51

    new-instance v6, Lo/W;

    invoke-direct {v6, v8, v4, v9}, Lo/W;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lo/L;->b()Lo/E;

    move-result-object v11

    iget-object v12, v0, Landroidx/compose/ui/platform/x;->u:Lo/W;

    invoke-virtual {v12, v1}, Lo/W;->e(I)Z

    move-result v12

    if-eqz v12, :cond_4f

    iget-object v12, v0, Landroidx/compose/ui/platform/x;->u:Lo/W;

    invoke-virtual {v12, v1}, Lo/W;->f(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/E;

    new-instance v13, Lo/y;

    invoke-direct {v13, v8, v4, v9}, Lo/y;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v14, v7, Lo/k;->a:[I

    iget v7, v7, Lo/k;->b:I

    move v15, v8

    :goto_1d
    if-ge v15, v7, :cond_4c

    aget v10, v14, v15

    invoke-virtual {v13, v10}, Lo/y;->h(I)Z

    add-int/2addr v15, v4

    const/4 v10, -0x1

    goto :goto_1d

    :cond_4c
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-gtz v7, :cond_4e

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_4d

    goto :goto_1e

    :cond_4d
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-virtual {v13, v8}, Lo/k;->a(I)I

    throw v9

    :cond_4e
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    throw v9

    :cond_4f
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    if-gtz v4, :cond_50

    :goto_1e
    iget-object v4, v0, Landroidx/compose/ui/platform/x;->t:Lo/W;

    invoke-virtual {v4, v1, v6}, Lo/W;->l(ILjava/lang/Object;)V

    iget-object v4, v0, Landroidx/compose/ui/platform/x;->u:Lo/W;

    invoke-virtual {v4, v1, v11}, Lo/W;->l(ILjava/lang/Object;)V

    goto :goto_1f

    :cond_50
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Lo/k;->a(I)I

    throw v9

    :cond_51
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Can\'t have more than "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lo/k;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " custom actions for one widget"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_52
    :goto_1f
    invoke-direct {v0, v3}, Landroidx/compose/ui/platform/x;->q0(LJ0/n;)Z

    move-result v3

    invoke-virtual {v2, v3}, LG1/t;->G0(Z)V

    iget-object v3, v0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    const/4 v4, -0x1

    invoke-virtual {v3, v1, v4}, Lo/i;->e(II)I

    move-result v3

    if-eq v3, v4, :cond_54

    iget-object v4, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/l1;->h(Landroidx/compose/ui/platform/Z;I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_53

    invoke-virtual {v2, v4}, LG1/t;->Q0(Landroid/view/View;)V

    goto :goto_20

    :cond_53
    iget-object v4, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2, v4, v3}, LG1/t;->R0(Landroid/view/View;I)V

    :goto_20
    iget-object v3, v0, Landroidx/compose/ui/platform/x;->F:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v9}, Landroidx/compose/ui/platform/x;->K(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_54
    iget-object v3, v0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    const/4 v4, -0x1

    invoke-virtual {v3, v1, v4}, Lo/i;->e(II)I

    move-result v3

    if-eq v3, v4, :cond_55

    iget-object v4, v0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v4

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/l1;->h(Landroidx/compose/ui/platform/Z;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_55

    invoke-virtual {v2, v3}, LG1/t;->O0(Landroid/view/View;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/x;->G:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v9}, Landroidx/compose/ui/platform/x;->K(ILG1/t;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_55
    return-void
.end method

.method public static final synthetic z(Landroidx/compose/ui/platform/x;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/platform/x;->m:Landroid/os/Handler;

    return-object p0
.end method

.method private static final z0(LJ0/h;)Z
    .locals 2

    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, LJ0/h;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {p0}, LJ0/h;->a()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    invoke-virtual {p0}, LJ0/h;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final M(Ldh/e;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Landroidx/compose/ui/platform/x$k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/ui/platform/x$k;

    iget v1, v0, Landroidx/compose/ui/platform/x$k;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/ui/platform/x$k;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/platform/x$k;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/x$k;-><init>(Landroidx/compose/ui/platform/x;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Landroidx/compose/ui/platform/x$k;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/ui/platform/x$k;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v2, v0, Landroidx/compose/ui/platform/x$k;->c:Ljava/lang/Object;

    check-cast v2, LKi/i;

    iget-object v6, v0, Landroidx/compose/ui/platform/x$k;->b:Ljava/lang/Object;

    check-cast v6, Lo/A;

    iget-object v7, v0, Landroidx/compose/ui/platform/x$k;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/platform/x;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Landroidx/compose/ui/platform/x$k;->c:Ljava/lang/Object;

    check-cast v2, LKi/i;

    iget-object v6, v0, Landroidx/compose/ui/platform/x$k;->b:Ljava/lang/Object;

    check-cast v6, Lo/A;

    iget-object v7, v0, Landroidx/compose/ui/platform/x$k;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/compose/ui/platform/x;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    new-instance p1, Lo/A;

    const/4 v2, 0x0

    invoke-direct {p1, v3, v5, v2}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->y:LKi/g;

    invoke-interface {v2}, LKi/v;->iterator()LKi/i;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v7, p0

    :goto_1
    :try_start_3
    iput-object v7, v0, Landroidx/compose/ui/platform/x$k;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/ui/platform/x$k;->b:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/compose/ui/platform/x$k;->c:Ljava/lang/Object;

    iput v5, v0, Landroidx/compose/ui/platform/x$k;->f:I

    invoke-interface {v2, v0}, LKi/i;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_4

    return-object v1

    :cond_4
    move-object v10, v6

    move-object v6, p1

    move-object p1, v10

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {v2}, LKi/i;->next()Ljava/lang/Object;

    invoke-virtual {v7}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, v7, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {p1}, Lo/b;->size()I

    move-result p1

    move v8, v3

    :goto_3
    if-ge v8, p1, :cond_5

    iget-object v9, v7, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {v9, v8}, Lo/b;->u(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LE0/G;

    invoke-direct {v7, v9, v6}, Landroidx/compose/ui/platform/x;->N0(LE0/G;Lo/A;)V

    invoke-direct {v7, v9}, Landroidx/compose/ui/platform/x;->O0(LE0/G;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Lo/A;->h()V

    iget-boolean p1, v7, Landroidx/compose/ui/platform/x;->K:Z

    if-nez p1, :cond_6

    iput-boolean v5, v7, Landroidx/compose/ui/platform/x;->K:Z

    iget-object p1, v7, Landroidx/compose/ui/platform/x;->m:Landroid/os/Handler;

    iget-object v8, v7, Landroidx/compose/ui/platform/x;->L:Ljava/lang/Runnable;

    invoke-virtual {p1, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_6
    iget-object p1, v7, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {p1}, Lo/b;->clear()V

    iget-object p1, v7, Landroidx/compose/ui/platform/x;->r:Lo/z;

    invoke-virtual {p1}, Lo/z;->i()V

    iget-object p1, v7, Landroidx/compose/ui/platform/x;->s:Lo/z;

    invoke-virtual {p1}, Lo/z;->i()V

    iget-wide v8, v7, Landroidx/compose/ui/platform/x;->i:J

    iput-object v7, v0, Landroidx/compose/ui/platform/x$k;->a:Ljava/lang/Object;

    iput-object v6, v0, Landroidx/compose/ui/platform/x$k;->b:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/compose/ui/platform/x$k;->c:Ljava/lang/Object;

    iput v4, v0, Landroidx/compose/ui/platform/x$k;->f:I

    invoke-static {v8, v9, v0}, LIi/Y;->a(JLdh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_4
    move-object p1, v6

    goto :goto_1

    :cond_8
    iget-object p1, v7, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {p1}, Lo/b;->clear()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v7, p0

    :goto_5
    iget-object v0, v7, Landroidx/compose/ui/platform/x;->x:Lo/b;

    invoke-virtual {v0}, Lo/b;->clear()V

    throw p1
.end method

.method public final N(ZIJ)Z
    .locals 6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->a0()Lo/m;

    move-result-object v1

    move-object v0, p0

    move v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/x;->O(Lo/m;ZIJ)Z

    move-result p1

    return p1
.end method

.method public final S0(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/x;->i:J

    return-void
.end method

.method public final V(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-direct {p0}, Landroidx/compose/ui/platform/x;->r0()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/high16 v4, -0x80000000

    if-eq v0, v2, :cond_3

    const/16 v2, 0x9

    if-eq v0, v2, :cond_3

    const/16 v2, 0xa

    if-eq v0, v2, :cond_1

    return v1

    :cond_1
    iget v0, p0, Landroidx/compose/ui/platform/x;->e:I

    if-eq v0, v4, :cond_2

    invoke-direct {p0, v4}, Landroidx/compose/ui/platform/x;->f1(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    :goto_0
    return v3

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/x;->m0(FF)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/x;->f1(I)V

    if-ne v0, v4, :cond_4

    move v3, p1

    :cond_4
    return v3
.end method

.method public b(Landroid/view/View;)LG1/u;
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/x;->n:Landroidx/compose/ui/platform/x$e;

    return-object p1
.end method

.method public final b0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->G:Ljava/lang/String;

    return-object v0
.end method

.method public final c0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->F:Ljava/lang/String;

    return-object v0
.end method

.method public final d0()Lo/x;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->E:Lo/x;

    return-object v0
.end method

.method public final e0()Lo/x;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->D:Lo/x;

    return-object v0
.end method

.method public final l0()Landroidx/compose/ui/platform/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    return-object v0
.end method

.method public final m0(FF)I
    .locals 12

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/m0;->f(LE0/m0;ZILjava/lang/Object;)V

    new-instance v0, LE0/u;

    invoke-direct {v0}, LE0/u;-><init>()V

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/r;->getRoot()LE0/G;

    move-result-object v4

    invoke-static {p1, p2}, Ll0/h;->a(FF)J

    move-result-wide v5

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v0

    invoke-static/range {v4 .. v11}, LE0/G;->A0(LE0/G;JLE0/u;ZZILjava/lang/Object;)V

    invoke-static {v0}, LZg/v;->n(Ljava/util/List;)I

    move-result p1

    :goto_0
    const/high16 p2, -0x80000000

    const/4 v1, -0x1

    if-ge v1, p1, :cond_2

    invoke-virtual {v0, p1}, LE0/u;->q(I)Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {v1}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/x;->d:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->getAndroidViewsHandler$ui_release()Landroidx/compose/ui/platform/Z;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/viewinterop/c;

    if-eqz v2, :cond_0

    return p2

    :cond_0
    invoke-virtual {v1}, LE0/G;->k0()LE0/a0;

    move-result-object p2

    const/16 v2, 0x8

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    invoke-virtual {p2, v2}, LE0/a0;->q(I)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LE0/G;->q0()I

    move-result p2

    invoke-direct {p0, p2}, Landroidx/compose/ui/platform/x;->F0(I)I

    move-result p2

    invoke-static {v1, v3}, LJ0/o;->a(LE0/G;Z)LJ0/n;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/platform/l1;->f(LJ0/n;)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    return p2
.end method

.method public final p0()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/x;->h:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->g:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->l:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final t0(LE0/G;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/x;->z:Z

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/x;->s0(LE0/G;)V

    return-void
.end method

.method public final u0()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/x;->z:Z

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x;->p0()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/compose/ui/platform/x;->K:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/x;->K:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/x;->m:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/compose/ui/platform/x;->L:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
