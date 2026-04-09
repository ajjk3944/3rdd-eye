.class public final Landroidx/compose/foundation/lazy/layout/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/b$a;
    }
.end annotation


# static fields
.field public static final s:Landroidx/compose/foundation/lazy/layout/b$a;

.field public static final t:I

.field private static final u:J


# instance fields
.field private final a:LIi/N;

.field private final b:Lm0/H0;

.field private final c:Lmh/a;

.field private d:Lr/H;

.field private e:Lr/H;

.field private f:Lr/H;

.field private g:Z

.field private final h:LT/q0;

.field private final i:LT/q0;

.field private final j:LT/q0;

.field private final k:LT/q0;

.field private l:J

.field private m:J

.field private n:Lp0/c;

.field private final o:Lr/a;

.field private final p:Lr/a;

.field private final q:LT/q0;

.field private r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/lazy/layout/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/foundation/lazy/layout/b;->s:Landroidx/compose/foundation/lazy/layout/b$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/lazy/layout/b;->t:I

    const v0, 0x7fffffff

    invoke-static {v0, v0}, LY0/o;->a(II)J

    move-result-wide v0

    sput-wide v0, Landroidx/compose/foundation/lazy/layout/b;->u:J

    return-void
.end method

.method public constructor <init>(LIi/N;Lm0/H0;Lmh/a;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p1

    iput-object v2, v0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->b:Lm0/H0;

    move-object/from16 v2, p3

    iput-object v2, v0, Landroidx/compose/foundation/lazy/layout/b;->c:Lmh/a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v2, v3, v4, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v5

    iput-object v5, v0, Landroidx/compose/foundation/lazy/layout/b;->h:LT/q0;

    invoke-static {v2, v3, v4, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v5

    iput-object v5, v0, Landroidx/compose/foundation/lazy/layout/b;->i:LT/q0;

    invoke-static {v2, v3, v4, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v5

    iput-object v5, v0, Landroidx/compose/foundation/lazy/layout/b;->j:LT/q0;

    invoke-static {v2, v3, v4, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, v0, Landroidx/compose/foundation/lazy/layout/b;->k:LT/q0;

    sget-wide v5, Landroidx/compose/foundation/lazy/layout/b;->u:J

    iput-wide v5, v0, Landroidx/compose/foundation/lazy/layout/b;->l:J

    sget-object v2, LY0/n;->b:LY0/n$a;

    invoke-virtual {v2}, LY0/n$a;->a()J

    move-result-wide v7

    iput-wide v7, v0, Landroidx/compose/foundation/lazy/layout/b;->m:J

    if-eqz v1, :cond_0

    invoke-interface/range {p2 .. p2}, Lm0/H0;->b()Lp0/c;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    new-instance v1, Lr/a;

    invoke-virtual {v2}, LY0/n$a;->a()J

    move-result-wide v7

    invoke-static {v7, v8}, LY0/n;->b(J)LY0/n;

    move-result-object v8

    invoke-static {v2}, Lr/u0;->d(LY0/n$a;)Lr/s0;

    move-result-object v9

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v13}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->o:Lr/a;

    new-instance v1, Lr/a;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    sget-object v7, Lkotlin/jvm/internal/l;->a:Lkotlin/jvm/internal/l;

    invoke-static {v7}, Lr/u0;->f(Lkotlin/jvm/internal/l;)Lr/s0;

    move-result-object v16

    const/16 v19, 0xc

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v14, v1

    invoke-direct/range {v14 .. v20}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->p:Lr/a;

    invoke-virtual {v2}, LY0/n$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/n;->b(J)LY0/n;

    move-result-object v1

    invoke-static {v1, v3, v4, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, v0, Landroidx/compose/foundation/lazy/layout/b;->q:LT/q0;

    iput-wide v5, v0, Landroidx/compose/foundation/lazy/layout/b;->r:J

    return-void
.end method

.method private final A(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->k:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final B(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->j:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final G(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->h:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final H(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->q:LT/q0;

    invoke-static {p1, p2}, LY0/n;->b(J)LY0/n;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic a()J
    .locals 2

    sget-wide v0, Landroidx/compose/foundation/lazy/layout/b;->u:J

    return-wide v0
.end method

.method public static final synthetic b(Landroidx/compose/foundation/lazy/layout/b;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/b;->c:Lmh/a;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/b;->o:Lr/a;

    return-object p0
.end method

.method public static final synthetic d(Landroidx/compose/foundation/lazy/layout/b;)Lr/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/b;->p:Lr/a;

    return-object p0
.end method

.method public static final synthetic e(Landroidx/compose/foundation/lazy/layout/b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/b;->z(Z)V

    return-void
.end method

.method public static final synthetic f(Landroidx/compose/foundation/lazy/layout/b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/b;->A(Z)V

    return-void
.end method

.method public static final synthetic g(Landroidx/compose/foundation/lazy/layout/b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/b;->B(Z)V

    return-void
.end method

.method public static final synthetic h(Landroidx/compose/foundation/lazy/layout/b;Z)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/b;->G(Z)V

    return-void
.end method

.method public static final synthetic i(Landroidx/compose/foundation/lazy/layout/b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/b;->H(J)V

    return-void
.end method

.method public static final synthetic j(Landroidx/compose/foundation/lazy/layout/b;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/foundation/lazy/layout/b;->g:Z

    return-void
.end method

.method private final z(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->i:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final C(Lr/H;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b;->d:Lr/H;

    return-void
.end method

.method public final D(Lr/H;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b;->f:Lr/H;

    return-void
.end method

.method public final E(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/b;->m:J

    return-void
.end method

.method public final F(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/b;->r:J

    return-void
.end method

.method public final I(Lr/H;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b;->e:Lr/H;

    return-void
.end method

.method public final J(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/foundation/lazy/layout/b;->l:J

    return-void
.end method

.method public final k()V
    .locals 11

    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b;->d:Lr/H;

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->t()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz v3, :cond_2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroidx/compose/foundation/lazy/layout/b;->z(Z)V

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v0

    xor-int/lit8 v1, v0, 0x1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lp0/c;->J(F)V

    :cond_1
    iget-object v6, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v8, Landroidx/compose/foundation/lazy/layout/b$c;

    const/4 v5, 0x0

    move-object v0, v8

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/b$c;-><init>(ZLandroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v0, 0x0

    const/4 v7, 0x0

    move-object v5, v6

    move-object v6, v0

    invoke-static/range {v5 .. v10}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v4, v0}, Lp0/c;->J(F)V

    :goto_1
    iget-object v5, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v8, Landroidx/compose/foundation/lazy/layout/b$b;

    const/4 v0, 0x0

    invoke-direct {v8, p0, v0}, Landroidx/compose/foundation/lazy/layout/b$b;-><init>(Landroidx/compose/foundation/lazy/layout/b;Ldh/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_4
    return-void
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b;->f:Lr/H;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    invoke-direct {p0, v2}, Landroidx/compose/foundation/lazy/layout/b;->B(Z)V

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v6, Landroidx/compose/foundation/lazy/layout/b$d;

    const/4 v2, 0x0

    invoke-direct {v6, p0, v1, v0, v2}, Landroidx/compose/foundation/lazy/layout/b$d;-><init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;Lp0/c;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    :goto_0
    return-void
.end method

.method public final m(JZ)V
    .locals 11

    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/b;->e:Lr/H;

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->r()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LY0/n;->k(JJ)J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Landroidx/compose/foundation/lazy/layout/b;->H(J)V

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/b;->G(Z)V

    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/layout/b;->g:Z

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v8, Landroidx/compose/foundation/lazy/layout/b$e;

    const/4 v5, 0x0

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/b$e;-><init>(Landroidx/compose/foundation/lazy/layout/b;Lr/H;JLdh/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method

.method public final n()V
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v4, Landroidx/compose/foundation/lazy/layout/b$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/lazy/layout/b$f;-><init>(Landroidx/compose/foundation/lazy/layout/b;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    return-void
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/b;->m:J

    return-wide v0
.end method

.method public final p()Lp0/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    return-object v0
.end method

.method public final q()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/b;->r:J

    return-wide v0
.end method

.method public final r()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->q:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/n;

    invoke-virtual {v0}, LY0/n;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public final s()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/foundation/lazy/layout/b;->l:J

    return-wide v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->j:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final w()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->h:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final x()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/b;->g:Z

    return v0
.end method

.method public final y()V
    .locals 9

    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->w()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Landroidx/compose/foundation/lazy/layout/b;->G(Z)V

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v6, Landroidx/compose/foundation/lazy/layout/b$g;

    invoke-direct {v6, p0, v2}, Landroidx/compose/foundation/lazy/layout/b$g;-><init>(Landroidx/compose/foundation/lazy/layout/b;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v1}, Landroidx/compose/foundation/lazy/layout/b;->z(Z)V

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v6, Landroidx/compose/foundation/lazy/layout/b$h;

    invoke-direct {v6, p0, v2}, Landroidx/compose/foundation/lazy/layout/b$h;-><init>(Landroidx/compose/foundation/lazy/layout/b;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/b;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v1}, Landroidx/compose/foundation/lazy/layout/b;->B(Z)V

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/b;->a:LIi/N;

    new-instance v6, Landroidx/compose/foundation/lazy/layout/b$i;

    invoke-direct {v6, p0, v2}, Landroidx/compose/foundation/lazy/layout/b$i;-><init>(Landroidx/compose/foundation/lazy/layout/b;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    iput-boolean v1, p0, Landroidx/compose/foundation/lazy/layout/b;->g:Z

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Landroidx/compose/foundation/lazy/layout/b;->H(J)V

    sget-wide v0, Landroidx/compose/foundation/lazy/layout/b;->u:J

    iput-wide v0, p0, Landroidx/compose/foundation/lazy/layout/b;->l:J

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/b;->b:Lm0/H0;

    if-eqz v1, :cond_3

    invoke-interface {v1, v0}, Lm0/H0;->a(Lp0/c;)V

    :cond_3
    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/b;->n:Lp0/c;

    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/b;->d:Lr/H;

    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/b;->f:Lr/H;

    iput-object v2, p0, Landroidx/compose/foundation/lazy/layout/b;->e:Lr/H;

    return-void
.end method
