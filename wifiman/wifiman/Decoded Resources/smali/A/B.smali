.class public final LA/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA/B$c;
    }
.end annotation


# static fields
.field public static final y:LA/B$c;

.field private static final z:Lc0/k;


# instance fields
.field private final a:LA/w;

.field private b:Z

.field private c:LA/s;

.field private final d:LA/z;

.field private final e:LA/f;

.field private final f:LT/q0;

.field private final g:Ly/m;

.field private h:F

.field private final i:Lw/y;

.field private j:I

.field private k:Z

.field private l:LC0/N;

.field private final m:LC0/O;

.field private final n:LB/b;

.field private final o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

.field private final p:LB/j;

.field private final q:Landroidx/compose/foundation/lazy/layout/d;

.field private final r:LA/v;

.field private final s:LB/E;

.field private final t:LT/q0;

.field private final u:LT/q0;

.field private final v:LT/q0;

.field private final w:LT/q0;

.field private x:Lr/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA/B$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA/B$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA/B;->y:LA/B$c;

    sget-object v0, LA/B$a;->a:LA/B$a;

    sget-object v1, LA/B$b;->a:LA/B$b;

    invoke-static {v0, v1}, Lc0/a;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LA/B;->z:Lc0/k;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 24
    invoke-static {v2, v0, v1}, LA/x;->b(IILjava/lang/Object;)LA/w;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, LA/B;-><init>(IILA/w;)V

    return-void
.end method

.method public constructor <init>(IILA/w;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, LA/B;->a:LA/w;

    .line 3
    new-instance v0, LA/z;

    invoke-direct {v0, p1, p2}, LA/z;-><init>(II)V

    iput-object v0, p0, LA/B;->d:LA/z;

    .line 4
    new-instance p2, LA/f;

    invoke-direct {p2, p0}, LA/f;-><init>(LA/B;)V

    iput-object p2, p0, LA/B;->e:LA/f;

    .line 5
    invoke-static {}, LA/C;->b()LA/s;

    move-result-object p2

    .line 6
    invoke-static {}, LT/o1;->j()LT/n1;

    move-result-object v1

    .line 7
    invoke-static {p2, v1}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p2

    iput-object p2, p0, LA/B;->f:LT/q0;

    .line 8
    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object p2

    iput-object p2, p0, LA/B;->g:Ly/m;

    .line 9
    new-instance p2, LA/B$i;

    invoke-direct {p2, p0}, LA/B$i;-><init>(LA/B;)V

    invoke-static {p2}, Lw/z;->a(Lmh/l;)Lw/y;

    move-result-object p2

    iput-object p2, p0, LA/B;->i:Lw/y;

    const/4 p2, 0x1

    .line 10
    iput-boolean p2, p0, LA/B;->k:Z

    .line 11
    new-instance v1, LA/B$f;

    invoke-direct {v1, p0}, LA/B$f;-><init>(LA/B;)V

    iput-object v1, p0, LA/B;->m:LC0/O;

    .line 12
    new-instance v1, LB/b;

    invoke-direct {v1}, LB/b;-><init>()V

    iput-object v1, p0, LA/B;->n:LB/b;

    .line 13
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-direct {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;-><init>()V

    iput-object v1, p0, LA/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    .line 14
    new-instance v1, LB/j;

    invoke-direct {v1}, LB/j;-><init>()V

    iput-object v1, p0, LA/B;->p:LB/j;

    .line 15
    new-instance v1, Landroidx/compose/foundation/lazy/layout/d;

    invoke-interface {p3}, LA/w;->b()LB/Q;

    move-result-object p3

    new-instance v2, LA/B$e;

    invoke-direct {v2, p0, p1}, LA/B$e;-><init>(LA/B;I)V

    invoke-direct {v1, p3, v2}, Landroidx/compose/foundation/lazy/layout/d;-><init>(LB/Q;Lmh/l;)V

    iput-object v1, p0, LA/B;->q:Landroidx/compose/foundation/lazy/layout/d;

    .line 16
    new-instance p1, LA/B$d;

    invoke-direct {p1, p0}, LA/B$d;-><init>(LA/B;)V

    iput-object p1, p0, LA/B;->r:LA/v;

    .line 17
    new-instance p1, LB/E;

    invoke-direct {p1}, LB/E;-><init>()V

    iput-object p1, p0, LA/B;->s:LB/E;

    .line 18
    invoke-virtual {v0}, LA/z;->b()LB/B;

    const/4 p1, 0x0

    .line 19
    invoke-static {p1, p2, p1}, LB/M;->c(LT/q0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LT/q0;

    move-result-object p3

    iput-object p3, p0, LA/B;->t:LT/q0;

    .line 20
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x2

    invoke-static {p3, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LA/B;->u:LT/q0;

    .line 21
    invoke-static {p3, p1, v0, p1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, LA/B;->v:LT/q0;

    .line 22
    invoke-static {p1, p2, p1}, LB/M;->c(LT/q0;ILkotlin/jvm/internal/DefaultConstructorMarker;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LA/B;->w:LT/q0;

    .line 23
    sget-object p1, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {p1}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v8, 0x38

    const/4 v9, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, v2

    invoke-static/range {v0 .. v9}, Lr/l;->d(Lr/s0;Ljava/lang/Object;Ljava/lang/Object;JJZILjava/lang/Object;)Lr/k;

    move-result-object p1

    iput-object p1, p0, LA/B;->x:Lr/k;

    return-void
.end method

.method private final H(FLA/q;)V
    .locals 2

    iget-boolean v0, p0, LA/B;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LA/B;->a:LA/w;

    iget-object v1, p0, LA/B;->r:LA/v;

    invoke-interface {v0, v1, p1, p2}, LA/w;->c(LA/v;FLA/q;)V

    :cond_0
    return-void
.end method

.method public static synthetic K(LA/B;IILdh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LA/B;->J(IILdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private L(Z)V
    .locals 1

    iget-object v0, p0, LA/B;->v:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private M(Z)V
    .locals 1

    iget-object v0, p0, LA/B;->u:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final O(FLY0/d;LIi/N;)V
    .locals 24

    move-object/from16 v1, p0

    move/from16 v0, p1

    invoke-static {}, LA/C;->a()F

    move-result v2

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LY0/d;->d1(F)F

    move-result v2

    cmpg-float v2, v0, v2

    if-gtz v2, :cond_0

    return-void

    :cond_0
    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v5

    goto :goto_0

    :cond_1
    move-object v5, v4

    :goto_0
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v6

    :try_start_0
    iget-object v7, v1, LA/B;->x:Lr/k;

    invoke-virtual {v7}, Lr/k;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    iget-object v8, v1, LA/B;->x:Lr/k;

    invoke-virtual {v8}, Lr/k;->r()Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v9, v1, LA/B;->x:Lr/k;

    sub-float v10, v7, v0

    const/16 v17, 0x1e

    const/16 v18, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lr/l;->g(Lr/k;FFJJZILjava/lang/Object;)Lr/k;

    move-result-object v0

    iput-object v0, v1, LA/B;->x:Lr/k;

    new-instance v10, LA/B$j;

    invoke-direct {v10, v1, v4}, LA/B$j;-><init>(LA/B;Ldh/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v7 .. v12}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    new-instance v7, Lr/k;

    sget-object v8, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v8}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v14

    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const/16 v22, 0x3c

    const/16 v23, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    move-object v13, v7

    invoke-direct/range {v13 .. v23}, Lr/k;-><init>(Lr/s0;Ljava/lang/Object;Lr/q;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v7, v1, LA/B;->x:Lr/k;

    new-instance v11, LA/B$k;

    invoke-direct {v11, v1, v4}, LA/B$k;-><init>(LA/B;Ldh/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v8, p3

    invoke-static/range {v8 .. v13}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-void

    :goto_2
    invoke-virtual {v2, v3, v6, v5}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v0
.end method

.method public static final synthetic g(LA/B;)LT/q0;
    .locals 0

    iget-object p0, p0, LA/B;->f:LT/q0;

    return-object p0
.end method

.method public static final synthetic h(LA/B;)LA/w;
    .locals 0

    iget-object p0, p0, LA/B;->a:LA/w;

    return-object p0
.end method

.method public static final synthetic i()Lc0/k;
    .locals 1

    sget-object v0, LA/B;->z:Lc0/k;

    return-object v0
.end method

.method public static final synthetic j(LA/B;)Lr/k;
    .locals 0

    iget-object p0, p0, LA/B;->x:Lr/k;

    return-object p0
.end method

.method public static final synthetic k(LA/B;LC0/N;)V
    .locals 0

    iput-object p1, p0, LA/B;->l:LC0/N;

    return-void
.end method

.method public static synthetic n(LA/B;LA/s;ZZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LA/B;->m(LA/s;ZZ)V

    return-void
.end method


# virtual methods
.method public final A()LT/q0;
    .locals 1

    iget-object v0, p0, LA/B;->w:LT/q0;

    return-object v0
.end method

.method public final B()LA/s;
    .locals 1

    iget-object v0, p0, LA/B;->c:LA/s;

    return-object v0
.end method

.method public final C()Landroidx/compose/foundation/lazy/layout/d;
    .locals 1

    iget-object v0, p0, LA/B;->q:Landroidx/compose/foundation/lazy/layout/d;

    return-object v0
.end method

.method public final D()LC0/N;
    .locals 1

    iget-object v0, p0, LA/B;->l:LC0/N;

    return-object v0
.end method

.method public final E()LC0/O;
    .locals 1

    iget-object v0, p0, LA/B;->m:LC0/O;

    return-object v0
.end method

.method public final F()F
    .locals 1

    iget-object v0, p0, LA/B;->x:Lr/k;

    invoke-virtual {v0}, Lr/k;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final G()F
    .locals 1

    iget v0, p0, LA/B;->h:F

    return v0
.end method

.method public final I(F)F
    .locals 8

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    invoke-virtual {p0}, LA/B;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    cmpl-float v1, p1, v0

    if-lez v1, :cond_2

    invoke-virtual {p0}, LA/B;->d()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    return v0

    :cond_2
    iget v1, p0, LA/B;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_8

    iget v1, p0, LA/B;->h:F

    add-float/2addr v1, p1

    iput v1, p0, LA/B;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v1, v1, v2

    if-lez v1, :cond_6

    iget-object v1, p0, LA/B;->f:LT/q0;

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA/s;

    iget v3, p0, LA/B;->h:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget-object v5, p0, LA/B;->c:LA/s;

    iget-boolean v6, p0, LA/B;->b:Z

    const/4 v7, 0x1

    xor-int/2addr v6, v7

    invoke-virtual {v1, v4, v6}, LA/s;->w(IZ)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v5, :cond_3

    invoke-virtual {v5, v4, v7}, LA/s;->w(IZ)Z

    move-result v6

    :cond_3
    if-eqz v6, :cond_4

    iget-boolean v4, p0, LA/B;->b:Z

    invoke-virtual {p0, v1, v4, v7}, LA/B;->m(LA/s;ZZ)V

    iget-object v4, p0, LA/B;->w:LT/q0;

    invoke-static {v4}, LB/M;->d(LT/q0;)V

    iget v4, p0, LA/B;->h:F

    sub-float/2addr v3, v4

    invoke-direct {p0, v3, v1}, LA/B;->H(FLA/q;)V

    goto :goto_0

    :cond_4
    iget-object v1, p0, LA/B;->l:LC0/N;

    if-eqz v1, :cond_5

    invoke-interface {v1}, LC0/N;->j()V

    :cond_5
    iget v1, p0, LA/B;->h:F

    sub-float/2addr v3, v1

    invoke-virtual {p0}, LA/B;->w()LA/q;

    move-result-object v1

    invoke-direct {p0, v3, v1}, LA/B;->H(FLA/q;)V

    :cond_6
    :goto_0
    iget v1, p0, LA/B;->h:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_7

    return p1

    :cond_7
    iget v1, p0, LA/B;->h:F

    sub-float/2addr p1, v1

    iput v0, p0, LA/B;->h:F

    return p1

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "entered drag with non-zero pending scroll: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LA/B;->h:F

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(IILdh/e;)Ljava/lang/Object;
    .locals 6

    new-instance v2, LA/B$h;

    const/4 v0, 0x0

    invoke-direct {v2, p0, p1, p2, v0}, LA/B$h;-><init>(LA/B;IILdh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Lw/y;->b(Lw/y;Ls/L;Lmh/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final N(IIZ)V
    .locals 1

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0}, LA/z;->a()I

    move-result v0

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0}, LA/z;->c()I

    move-result v0

    if-eq v0, p2, :cond_1

    :cond_0
    iget-object v0, p0, LA/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->o()V

    :cond_1
    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0, p1, p2}, LA/z;->d(II)V

    if-eqz p3, :cond_2

    iget-object p1, p0, LA/B;->l:LC0/N;

    if-eqz p1, :cond_3

    invoke-interface {p1}, LC0/N;->j()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LA/B;->t:LT/q0;

    invoke-static {p1}, LB/M;->d(LT/q0;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final P(LA/m;I)I
    .locals 1

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0, p1, p2}, LA/z;->j(LA/m;I)I

    move-result p1

    return p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, LA/B;->i:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p3, LA/B$g;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, LA/B$g;

    iget v1, v0, LA/B$g;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LA/B$g;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LA/B$g;

    invoke-direct {v0, p0, p3}, LA/B$g;-><init>(LA/B;Ldh/e;)V

    :goto_0
    iget-object p3, v0, LA/B$g;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LA/B$g;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LA/B$g;->c:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lmh/p;

    iget-object p1, v0, LA/B$g;->b:Ljava/lang/Object;

    check-cast p1, Ls/L;

    iget-object v2, v0, LA/B$g;->a:Ljava/lang/Object;

    check-cast v2, LA/B;

    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p3, p0, LA/B;->n:LB/b;

    iput-object p0, v0, LA/B$g;->a:Ljava/lang/Object;

    iput-object p1, v0, LA/B$g;->b:Ljava/lang/Object;

    iput-object p2, v0, LA/B$g;->c:Ljava/lang/Object;

    iput v4, v0, LA/B$g;->f:I

    invoke-virtual {p3, v0}, LB/b;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p3, v2, LA/B;->i:Lw/y;

    const/4 v2, 0x0

    iput-object v2, v0, LA/B$g;->a:Ljava/lang/Object;

    iput-object v2, v0, LA/B$g;->b:Ljava/lang/Object;

    iput-object v2, v0, LA/B$g;->c:Ljava/lang/Object;

    iput v3, v0, LA/B$g;->f:I

    invoke-interface {p3, p1, p2, v0}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, LA/B;->v:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, LA/B;->u:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public f(F)F
    .locals 1

    iget-object v0, p0, LA/B;->i:Lw/y;

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    return p1
.end method

.method public final l(IILdh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LA/B;->e:LA/f;

    const/16 v3, 0x64

    invoke-virtual {p0}, LA/B;->q()LY0/d;

    move-result-object v4

    move v1, p1

    move v2, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LB/g;->d(LB/h;IIILY0/d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final m(LA/s;ZZ)V
    .locals 3

    if-nez p2, :cond_0

    iget-boolean v0, p0, LA/B;->b:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, LA/B;->c:LA/s;

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    if-eqz p2, :cond_1

    iput-boolean v0, p0, LA/B;->b:Z

    :cond_1
    invoke-virtual {p1}, LA/s;->k()Z

    move-result v1

    invoke-direct {p0, v1}, LA/B;->L(Z)V

    invoke-virtual {p1}, LA/s;->l()Z

    move-result v1

    invoke-direct {p0, v1}, LA/B;->M(Z)V

    iget v1, p0, LA/B;->h:F

    invoke-virtual {p1}, LA/s;->n()F

    move-result v2

    sub-float/2addr v1, v2

    iput v1, p0, LA/B;->h:F

    iget-object v1, p0, LA/B;->f:LT/q0;

    invoke-interface {v1, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    if-eqz p3, :cond_2

    iget-object p3, p0, LA/B;->d:LA/z;

    invoke-virtual {p1}, LA/s;->u()I

    move-result v1

    invoke-virtual {p3, v1}, LA/z;->i(I)V

    goto :goto_0

    :cond_2
    iget-object p3, p0, LA/B;->d:LA/z;

    invoke-virtual {p3, p1}, LA/z;->h(LA/s;)V

    iget-boolean p3, p0, LA/B;->k:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, LA/B;->a:LA/w;

    iget-object v1, p0, LA/B;->r:LA/v;

    invoke-interface {p3, v1, p1}, LA/w;->d(LA/v;LA/q;)V

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p1}, LA/s;->v()F

    move-result p2

    invoke-virtual {p1}, LA/s;->s()LY0/d;

    move-result-object p3

    invoke-virtual {p1}, LA/s;->o()LIi/N;

    move-result-object p1

    invoke-direct {p0, p2, p3, p1}, LA/B;->O(FLY0/d;LIi/N;)V

    :cond_4
    iget p1, p0, LA/B;->j:I

    add-int/2addr p1, v0

    iput p1, p0, LA/B;->j:I

    :goto_1
    return-void
.end method

.method public final o()LB/b;
    .locals 1

    iget-object v0, p0, LA/B;->n:LB/b;

    return-object v0
.end method

.method public final p()LB/j;
    .locals 1

    iget-object v0, p0, LA/B;->p:LB/j;

    return-object v0
.end method

.method public final q()LY0/d;
    .locals 1

    iget-object v0, p0, LA/B;->f:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/s;

    invoke-virtual {v0}, LA/s;->s()LY0/d;

    move-result-object v0

    return-object v0
.end method

.method public final r()I
    .locals 1

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0}, LA/z;->a()I

    move-result v0

    return v0
.end method

.method public final s()I
    .locals 1

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0}, LA/z;->c()I

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, LA/B;->b:Z

    return v0
.end method

.method public final u()Ly/m;
    .locals 1

    iget-object v0, p0, LA/B;->g:Ly/m;

    return-object v0
.end method

.method public final v()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
    .locals 1

    iget-object v0, p0, LA/B;->o:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;

    return-object v0
.end method

.method public final w()LA/q;
    .locals 1

    iget-object v0, p0, LA/B;->f:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA/q;

    return-object v0
.end method

.method public final x()LT/q0;
    .locals 1

    iget-object v0, p0, LA/B;->t:LT/q0;

    return-object v0
.end method

.method public final y()Lsh/i;
    .locals 1

    iget-object v0, p0, LA/B;->d:LA/z;

    invoke-virtual {v0}, LA/z;->b()LB/B;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    return-object v0
.end method

.method public final z()LB/E;
    .locals 1

    iget-object v0, p0, LA/B;->s:LB/E;

    return-object v0
.end method
