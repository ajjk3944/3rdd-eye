.class public final LF/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LF/S;

.field private final b:LT/J0;

.field private final c:Landroidx/compose/ui/platform/n1;

.field private final d:LR0/k;

.field private e:LR0/Z;

.field private final f:LT/q0;

.field private final g:LT/q0;

.field private h:LC0/r;

.field private final i:LT/q0;

.field private j:LL0/d;

.field private final k:LT/q0;

.field private final l:LT/q0;

.field private final m:LT/q0;

.field private final n:LT/q0;

.field private final o:LT/q0;

.field private p:Z

.field private final q:LT/q0;

.field private final r:LF/A;

.field private s:Lmh/l;

.field private final t:Lmh/l;

.field private final u:Lmh/l;

.field private final v:Lm0/S0;

.field private w:J

.field private final x:LT/q0;

.field private final y:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF/S;LT/J0;Landroidx/compose/ui/platform/n1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/E;->a:LF/S;

    iput-object p2, p0, LF/E;->b:LT/J0;

    iput-object p3, p0, LF/E;->c:Landroidx/compose/ui/platform/n1;

    new-instance p1, LR0/k;

    invoke-direct {p1}, LR0/k;-><init>()V

    iput-object p1, p0, LF/E;->d:LR0/k;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->f:LT/q0;

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v1}, LY0/h;->d(F)LY0/h;

    move-result-object v1

    invoke-static {v1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->g:LT/q0;

    invoke-static {p2, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->i:LT/q0;

    sget-object v1, LF/q;->None:LF/q;

    invoke-static {v1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->k:LT/q0;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->l:LT/q0;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->m:LT/q0;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, LF/E;->n:LT/q0;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LF/E;->o:LT/q0;

    const/4 p1, 0x1

    iput-boolean p1, p0, LF/E;->p:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LF/E;->q:LT/q0;

    new-instance p1, LF/A;

    invoke-direct {p1, p3}, LF/A;-><init>(Landroidx/compose/ui/platform/n1;)V

    iput-object p1, p0, LF/E;->r:LF/A;

    sget-object p1, LF/E$c;->a:LF/E$c;

    iput-object p1, p0, LF/E;->s:Lmh/l;

    new-instance p1, LF/E$b;

    invoke-direct {p1, p0}, LF/E$b;-><init>(LF/E;)V

    iput-object p1, p0, LF/E;->t:Lmh/l;

    new-instance p1, LF/E$a;

    invoke-direct {p1, p0}, LF/E$a;-><init>(LF/E;)V

    iput-object p1, p0, LF/E;->u:Lmh/l;

    invoke-static {}, Lm0/S;->a()Lm0/S0;

    move-result-object p1

    iput-object p1, p0, LF/E;->v:Lm0/S0;

    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->e()J

    move-result-wide v1

    iput-wide v1, p0, LF/E;->w:J

    sget-object p1, LL0/S;->b:LL0/S$a;

    invoke-virtual {p1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->b(J)LL0/S;

    move-result-object p3

    invoke-static {p3, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p3

    iput-object p3, p0, LF/E;->x:LT/q0;

    invoke-virtual {p1}, LL0/S$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    invoke-static {p1, p2, v0, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LF/E;->y:LT/q0;

    return-void
.end method

.method public static final synthetic a(LF/E;)LF/A;
    .locals 0

    iget-object p0, p0, LF/E;->r:LF/A;

    return-object p0
.end method

.method public static final synthetic b(LF/E;)Lmh/l;
    .locals 0

    iget-object p0, p0, LF/E;->s:Lmh/l;

    return-object p0
.end method


# virtual methods
.method public final A(J)V
    .locals 1

    iget-object v0, p0, LF/E;->y:LT/q0;

    invoke-static {p1, p2}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final B(LF/q;)V
    .locals 1

    iget-object v0, p0, LF/E;->k:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final C(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->f:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final D(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->q:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final E(LR0/Z;)V
    .locals 0

    iput-object p1, p0, LF/E;->e:LR0/Z;

    return-void
.end method

.method public final F(LC0/r;)V
    .locals 0

    iput-object p1, p0, LF/E;->h:LC0/r;

    return-void
.end method

.method public final G(LF/j0;)V
    .locals 1

    iget-object v0, p0, LF/E;->i:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LF/E;->p:Z

    return-void
.end method

.method public final H(F)V
    .locals 1

    iget-object v0, p0, LF/E;->g:LT/q0;

    invoke-static {p1}, LY0/h;->d(F)LY0/h;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final I(J)V
    .locals 1

    iget-object v0, p0, LF/E;->x:LT/q0;

    invoke-static {p1, p2}, LL0/S;->b(J)LL0/S;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final J(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->o:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final K(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->l:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final L(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->n:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final M(Z)V
    .locals 1

    iget-object v0, p0, LF/E;->m:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final N(LL0/d;LL0/d;LL0/U;ZLY0/d;LQ0/k$b;Lmh/l;LF/C;Lk0/e;J)V
    .locals 13

    move-object v0, p0

    move-object/from16 v1, p7

    iput-object v1, v0, LF/E;->s:Lmh/l;

    move-wide/from16 v1, p10

    iput-wide v1, v0, LF/E;->w:J

    iget-object v1, v0, LF/E;->r:LF/A;

    move-object/from16 v2, p8

    invoke-virtual {v1, v2}, LF/A;->f(LF/C;)V

    move-object/from16 v2, p9

    invoke-virtual {v1, v2}, LF/A;->e(Lk0/e;)V

    move-object v1, p1

    iput-object v1, v0, LF/E;->j:LL0/d;

    iget-object v1, v0, LF/E;->a:LF/S;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v10

    const/16 v11, 0x1c0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p4

    invoke-static/range {v1 .. v12}, LF/T;->c(LF/S;LL0/d;LL0/U;LY0/d;LQ0/k$b;ZIIILjava/util/List;ILjava/lang/Object;)LF/S;

    move-result-object v1

    iget-object v2, v0, LF/E;->a:LF/S;

    if-eq v2, v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v0, LF/E;->p:Z

    :cond_0
    iput-object v1, v0, LF/E;->a:LF/S;

    return-void
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, LF/E;->y:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/S;

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()LF/q;
    .locals 1

    iget-object v0, p0, LF/E;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF/q;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LF/E;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final f()Lm0/S0;
    .locals 1

    iget-object v0, p0, LF/E;->v:Lm0/S0;

    return-object v0
.end method

.method public final g()LR0/Z;
    .locals 1

    iget-object v0, p0, LF/E;->e:LR0/Z;

    return-object v0
.end method

.method public final h()Landroidx/compose/ui/platform/n1;
    .locals 1

    iget-object v0, p0, LF/E;->c:Landroidx/compose/ui/platform/n1;

    return-object v0
.end method

.method public final i()LC0/r;
    .locals 3

    iget-object v0, p0, LF/E;->h:LC0/r;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final j()LF/j0;
    .locals 1

    iget-object v0, p0, LF/E;->i:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF/j0;

    return-object v0
.end method

.method public final k()F
    .locals 1

    iget-object v0, p0, LF/E;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/h;

    invoke-virtual {v0}, LY0/h;->s()F

    move-result v0

    return v0
.end method

.method public final l()Lmh/l;
    .locals 1

    iget-object v0, p0, LF/E;->u:Lmh/l;

    return-object v0
.end method

.method public final m()Lmh/l;
    .locals 1

    iget-object v0, p0, LF/E;->t:Lmh/l;

    return-object v0
.end method

.method public final n()LR0/k;
    .locals 1

    iget-object v0, p0, LF/E;->d:LR0/k;

    return-object v0
.end method

.method public final o()LT/J0;
    .locals 1

    iget-object v0, p0, LF/E;->b:LT/J0;

    return-object v0
.end method

.method public final p()J
    .locals 2

    iget-wide v0, p0, LF/E;->w:J

    return-wide v0
.end method

.method public final q()J
    .locals 2

    iget-object v0, p0, LF/E;->x:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL0/S;

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v0

    return-wide v0
.end method

.method public final r()Z
    .locals 1

    iget-object v0, p0, LF/E;->o:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, LF/E;->l:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, LF/E;->n:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final u()Z
    .locals 1

    iget-object v0, p0, LF/E;->m:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final v()LF/S;
    .locals 1

    iget-object v0, p0, LF/E;->a:LF/S;

    return-object v0
.end method

.method public final w()LL0/d;
    .locals 1

    iget-object v0, p0, LF/E;->j:LL0/d;

    return-object v0
.end method

.method public final x()Z
    .locals 2

    invoke-virtual {p0}, LF/E;->q()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LF/E;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

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

.method public final y()Z
    .locals 1

    iget-object v0, p0, LF/E;->q:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, LF/E;->p:Z

    return v0
.end method
