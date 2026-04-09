.class public final LJ/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ/j$a;,
        LJ/j$b;,
        LJ/j$c;,
        LJ/j$d;
    }
.end annotation


# instance fields
.field private final a:LI/o1;

.field private final b:LI/l1;

.field private c:LY0/d;

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Lu0/a;

.field private i:Landroidx/compose/ui/platform/q1;

.field private j:Landroidx/compose/ui/platform/h0;

.field private final k:LT/q0;

.field private l:Lmh/a;

.field private final m:LT/q0;

.field private final n:LT/q0;

.field private final o:LT/q0;

.field private final p:LT/q0;

.field private final q:LT/q0;

.field private final r:LT/q0;

.field private s:LM/x;

.field private t:I

.field private u:Ly/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/o1;LI/l1;LY0/d;ZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ/j;->a:LI/o1;

    iput-object p2, p0, LJ/j;->b:LI/l1;

    iput-object p3, p0, LJ/j;->c:LY0/d;

    iput-boolean p4, p0, LJ/j;->d:Z

    iput-boolean p5, p0, LJ/j;->e:Z

    iput-boolean p6, p0, LJ/j;->f:Z

    iput-boolean p7, p0, LJ/j;->g:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x0

    const/4 p3, 0x2

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->k:LT/q0;

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide p4

    invoke-static {p4, p5}, Ll0/g;->d(J)Ll0/g;

    move-result-object p4

    invoke-static {p4, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p4

    iput-object p4, p0, LJ/j;->m:LT/q0;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide p4

    invoke-static {p4, p5}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->n:LT/q0;

    invoke-static {p2, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->o:LT/q0;

    sget-object p1, LJ/j$a;->None:LJ/j$a;

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->p:LT/q0;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->q:LT/q0;

    sget-object p1, LJ/n;->None:LJ/n;

    invoke-static {p1, p2, p3, p2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LJ/j;->r:LT/q0;

    const/4 p1, -0x1

    iput p1, p0, LJ/j;->t:I

    return-void
.end method

.method private final A0(J)V
    .locals 1

    iget-object v0, p0, LJ/j;->m:LT/q0;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final B0(LJ/n;)V
    .locals 1

    iget-object v0, p0, LJ/j;->r:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final C0(Ll0/i;)V
    .locals 8

    iget-object v0, p0, LJ/j;->i:Landroidx/compose/ui/platform/q1;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LJ/j;->z()Z

    move-result v1

    sget-object v2, LJ/n;->None:LJ/n;

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    new-instance v1, LJ/j$B;

    invoke-direct {v1, p0, v2, p0}, LJ/j$B;-><init>(LJ/j;LJ/n;LJ/j;)V

    move-object v4, v1

    :goto_0
    invoke-virtual {p0}, LJ/j;->B()Z

    move-result v1

    if-nez v1, :cond_1

    move-object v5, v3

    goto :goto_1

    :cond_1
    new-instance v1, LJ/j$C;

    invoke-direct {v1, p0, v2, p0}, LJ/j$C;-><init>(LJ/j;LJ/n;LJ/j;)V

    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, LJ/j;->A()Z

    move-result v1

    if-nez v1, :cond_2

    move-object v6, v3

    goto :goto_2

    :cond_2
    new-instance v1, LJ/j$D;

    invoke-direct {v1, p0, v2, p0}, LJ/j$D;-><init>(LJ/j;LJ/n;LJ/j;)V

    move-object v6, v1

    :goto_2
    invoke-virtual {p0}, LJ/j;->C()Z

    move-result v1

    sget-object v2, LJ/n;->Selection:LJ/n;

    if-nez v1, :cond_3

    move-object v7, v3

    goto :goto_3

    :cond_3
    new-instance v1, LJ/j$E;

    invoke-direct {v1, p0, v2, p0}, LJ/j$E;-><init>(LJ/j;LJ/n;LJ/j;)V

    move-object v7, v1

    :goto_3
    move-object v1, p1

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    invoke-interface/range {v0 .. v5}, Landroidx/compose/ui/platform/q1;->b(Ll0/i;Lmh/a;Lmh/a;Lmh/a;Lmh/a;)V

    :cond_4
    return-void
.end method

.method public static synthetic F(LJ/j;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, LJ/j;->E(Z)V

    return-void
.end method

.method private final G0(LH/h;IIZLM/r;ZZ)J
    .locals 7

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->b(J)LL0/S;

    move-result-object v0

    invoke-virtual {v0}, LL0/S;->r()J

    move-result-wide v1

    if-nez p7, :cond_1

    if-nez p6, :cond_0

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result p6

    if-nez p6, :cond_1

    :cond_0
    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    move-object v1, p0

    move v2, p2

    move v3, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LJ/j;->d0(IILL0/S;ZLM/r;)J

    move-result-wide p2

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p4

    invoke-static {p2, p3, p4, p5}, LL0/S;->g(JJ)Z

    move-result p4

    if-eqz p4, :cond_2

    return-wide p2

    :cond_2
    invoke-static {p2, p3}, LL0/S;->m(J)Z

    move-result p4

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p5

    invoke-static {p5, p6}, LL0/S;->m(J)Z

    move-result p5

    if-eq p4, p5, :cond_3

    invoke-static {p2, p3}, LL0/S;->i(J)I

    move-result p4

    invoke-static {p2, p3}, LL0/S;->n(J)I

    move-result p5

    invoke-static {p4, p5}, LL0/T;->b(II)J

    move-result-wide p4

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p6

    invoke-static {p4, p5, p6, p7}, LL0/S;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {p0}, LJ/j;->j0()Z

    move-result p4

    if-eqz p4, :cond_4

    if-nez p1, :cond_4

    iget-object p1, p0, LJ/j;->h:Lu0/a;

    if-eqz p1, :cond_4

    sget-object p4, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {p4}, Lu0/b$a;->b()I

    move-result p4

    invoke-interface {p1, p4}, Lu0/a;->a(I)V

    :cond_4
    return-wide p2
.end method

.method static synthetic H0(LJ/j;LH/h;IIZLM/r;ZZILjava/lang/Object;)J
    .locals 10

    and-int/lit8 v0, p8, 0x20

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v8, v1

    goto :goto_0

    :cond_0
    move/from16 v8, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    move v9, v1

    goto :goto_1

    :cond_1
    move/from16 v9, p7

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v2 .. v9}, LJ/j;->G0(LH/h;IIZLM/r;ZZ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final J(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, LJ/j$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LJ/j$f;

    iget v1, v0, LJ/j$f;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LJ/j$f;->f:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, LJ/j$f;

    invoke-direct {v0, p0, p2}, LJ/j$f;-><init>(LJ/j;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, LJ/j$f;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, v6, LJ/j$f;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, LJ/j$f;->c:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/M;

    iget-object v0, v6, LJ/j$f;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/M;

    iget-object v1, v6, LJ/j$f;->a:Ljava/lang/Object;

    check-cast v1, LJ/j;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/M;

    invoke-direct {p2}, Lkotlin/jvm/internal/M;-><init>()V

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->b()J

    move-result-wide v3

    iput-wide v3, p2, Lkotlin/jvm/internal/M;->a:J

    new-instance v7, Lkotlin/jvm/internal/M;

    invoke-direct {v7}, Lkotlin/jvm/internal/M;-><init>()V

    invoke-virtual {v1}, Ll0/g$a;->b()J

    move-result-wide v3

    iput-wide v3, v7, Lkotlin/jvm/internal/M;->a:J

    :try_start_1
    new-instance v3, LJ/j$g;

    invoke-direct {v3, p2, p0, v7}, LJ/j$g;-><init>(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    new-instance v4, LJ/j$h;

    invoke-direct {v4, p2, v7, p0}, LJ/j$h;-><init>(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    new-instance v5, LJ/j$i;

    invoke-direct {v5, p2, v7, p0}, LJ/j$i;-><init>(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    new-instance v8, LJ/j$j;

    invoke-direct {v8, v7, p0, p2}, LJ/j$j;-><init>(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    iput-object p0, v6, LJ/j$f;->a:Ljava/lang/Object;

    iput-object p2, v6, LJ/j$f;->b:Ljava/lang/Object;

    iput-object v7, v6, LJ/j$f;->c:Ljava/lang/Object;

    iput v2, v6, LJ/j$f;->f:I

    move-object v1, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v8

    invoke-static/range {v1 .. v6}, Lw/j;->e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object v1, p0

    move-object v0, p2

    move-object p1, v7

    :goto_2
    invoke-static {v0, p1, v1}, LJ/j;->K(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v1, p0

    move-object v0, p2

    move-object p2, p1

    move-object p1, v7

    :goto_3
    invoke-static {v0, p1, v1}, LJ/j;->K(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    throw p2
.end method

.method private static final K(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V
    .locals 3

    iget-wide v0, p0, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v0, v1}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Lkotlin/jvm/internal/M;->a:J

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    iput-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    invoke-virtual {p2}, LJ/j;->D()V

    :cond_0
    return-void
.end method

.method private final L(Ly0/G;ZLdh/e;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    instance-of v1, v0, LJ/j$k;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LJ/j$k;

    iget v2, v1, LJ/j$k;->g:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LJ/j$k;->g:I

    :goto_0
    move-object v13, v1

    goto :goto_1

    :cond_0
    new-instance v1, LJ/j$k;

    invoke-direct {v1, v7, v0}, LJ/j$k;-><init>(LJ/j;Ldh/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v13, LJ/j$k;->e:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v14

    iget v1, v13, LJ/j$k;->g:I

    const/4 v8, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v8, :cond_1

    iget-object v1, v13, LJ/j$k;->d:Ljava/lang/Object;

    check-cast v1, LF/p;

    iget-object v2, v13, LJ/j$k;->c:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/M;

    iget-object v3, v13, LJ/j$k;->b:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/M;

    iget-object v4, v13, LJ/j$k;->a:Ljava/lang/Object;

    check-cast v4, LJ/j;

    :try_start_0
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance v15, Lkotlin/jvm/internal/M;

    invoke-direct {v15}, Lkotlin/jvm/internal/M;-><init>()V

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v1

    iput-wide v1, v15, Lkotlin/jvm/internal/M;->a:J

    new-instance v12, Lkotlin/jvm/internal/M;

    invoke-direct {v12}, Lkotlin/jvm/internal/M;-><init>()V

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, v12, Lkotlin/jvm/internal/M;->a:J

    if-eqz p2, :cond_3

    sget-object v0, LF/p;->SelectionStart:LF/p;

    :goto_2
    move-object v11, v0

    goto :goto_3

    :cond_3
    sget-object v0, LF/p;->SelectionEnd:LF/p;

    goto :goto_2

    :goto_3
    :try_start_1
    new-instance v9, LJ/j$l;

    move-object v1, v9

    move-object v2, v15

    move-object/from16 v3, p0

    move/from16 v4, p2

    move-object v5, v11

    move-object v6, v12

    invoke-direct/range {v1 .. v6}, LJ/j$l;-><init>(Lkotlin/jvm/internal/M;LJ/j;ZLF/p;Lkotlin/jvm/internal/M;)V

    new-instance v10, LJ/j$m;

    invoke-direct {v10, v15, v7, v12}, LJ/j$m;-><init>(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    new-instance v0, LJ/j$n;

    invoke-direct {v0, v15, v7, v12}, LJ/j$n;-><init>(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    new-instance v16, LJ/j$o;

    move-object/from16 v1, v16

    move-object v2, v12

    move-object/from16 v3, p0

    move-object v4, v11

    move-object v5, v15

    move/from16 v6, p2

    invoke-direct/range {v1 .. v6}, LJ/j$o;-><init>(Lkotlin/jvm/internal/M;LJ/j;LF/p;Lkotlin/jvm/internal/M;Z)V

    iput-object v7, v13, LJ/j$k;->a:Ljava/lang/Object;

    iput-object v15, v13, LJ/j$k;->b:Ljava/lang/Object;

    iput-object v12, v13, LJ/j$k;->c:Ljava/lang/Object;

    iput-object v11, v13, LJ/j$k;->d:Ljava/lang/Object;

    iput v8, v13, LJ/j$k;->g:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v8, p1

    move-object v1, v11

    move-object v11, v0

    move-object v2, v12

    move-object/from16 v12, v16

    :try_start_2
    invoke-static/range {v8 .. v13}, Lw/j;->e(Ly0/G;Lmh/l;Lmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v14, :cond_4

    return-object v14

    :cond_4
    move-object v4, v7

    move-object v3, v15

    :goto_4
    new-instance v0, LJ/j$p;

    invoke-direct {v0, v4, v1}, LJ/j$p;-><init>(LJ/j;LF/p;)V

    invoke-static {v0}, LJ/k;->a(Lmh/a;)V

    invoke-virtual {v4}, LJ/j;->V()LF/p;

    move-result-object v0

    if-ne v0, v1, :cond_5

    invoke-static {v3, v4, v2}, LJ/j;->M(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    :cond_5
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :catchall_1
    move-exception v0

    :goto_5
    move-object v4, v7

    move-object v3, v15

    goto :goto_6

    :catchall_2
    move-exception v0

    move-object v1, v11

    move-object v2, v12

    goto :goto_5

    :goto_6
    new-instance v5, LJ/j$p;

    invoke-direct {v5, v4, v1}, LJ/j$p;-><init>(LJ/j;LF/p;)V

    invoke-static {v5}, LJ/k;->a(Lmh/a;)V

    invoke-virtual {v4}, LJ/j;->V()LF/p;

    move-result-object v5

    if-ne v5, v1, :cond_6

    invoke-static {v3, v4, v2}, LJ/j;->M(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    :cond_6
    throw v0
.end method

.method private static final M(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V
    .locals 3

    iget-wide v0, p0, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v0, v1}, Ll0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LJ/j;->D()V

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v1

    iput-wide v1, p0, Lkotlin/jvm/internal/M;->a:J

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p2, Lkotlin/jvm/internal/M;->a:J

    const/4 p0, -0x1

    iput p0, p1, LJ/j;->t:I

    :cond_0
    return-void
.end method

.method private final Q()Ll0/i;
    .locals 11

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LJ/j;->T()Ll0/i;

    move-result-object v0

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll0/i;->p()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, LC0/r;->o0(J)J

    move-result-wide v1

    goto :goto_0

    :cond_0
    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v1

    :goto_0
    invoke-virtual {v0}, Ll0/i;->m()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    invoke-direct {p0, v2}, LJ/j;->Y(Z)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, LC0/r;->o0(J)J

    move-result-wide v1

    goto :goto_1

    :cond_2
    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v1

    :goto_1
    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v3

    if-eqz v3, :cond_3

    const/4 v4, 0x0

    invoke-direct {p0, v4}, LJ/j;->Y(Z)J

    move-result-wide v4

    invoke-interface {v3, v4, v5}, LC0/r;->o0(J)J

    move-result-wide v3

    goto :goto_2

    :cond_3
    sget-object v3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v3}, Ll0/g$a;->c()J

    move-result-wide v3

    :goto_2
    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    iget-object v7, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v7}, LI/l1;->f()LL0/M;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v8

    invoke-static {v8, v9}, LL0/S;->n(J)I

    move-result v8

    invoke-virtual {v7, v8}, LL0/M;->e(I)Ll0/i;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ll0/i;->n()F

    move-result v7

    goto :goto_3

    :cond_4
    move v7, v6

    :goto_3
    invoke-static {v6, v7}, Ll0/h;->a(FF)J

    move-result-wide v7

    invoke-interface {v5, v7, v8}, LC0/r;->o0(J)J

    move-result-wide v7

    invoke-static {v7, v8}, Ll0/g;->n(J)F

    move-result v5

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v7

    if-eqz v7, :cond_7

    iget-object v8, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v8}, LI/l1;->f()LL0/M;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v9

    invoke-static {v9, v10}, LL0/S;->i(J)I

    move-result v0

    invoke-virtual {v8, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v0

    goto :goto_5

    :cond_6
    move v0, v6

    :goto_5
    invoke-static {v6, v0}, Ll0/h;->a(FF)J

    move-result-wide v8

    invoke-interface {v7, v8, v9}, LC0/r;->o0(J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ll0/g;->n(J)F

    move-result v6

    :cond_7
    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v1, v2}, Ll0/g;->m(J)F

    move-result v7

    invoke-static {v3, v4}, Ll0/g;->m(J)F

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v1, v2}, Ll0/g;->n(J)F

    move-result v1

    invoke-static {v3, v4}, Ll0/g;->n(J)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    new-instance v2, Ll0/i;

    invoke-direct {v2, v0, v5, v7, v1}, Ll0/i;-><init>(FFFF)V

    return-object v2
.end method

.method private final R()J
    .locals 2

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LC0/s;->f(LC0/r;)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method private final W()Z
    .locals 1

    iget-boolean v0, p0, LJ/j;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LJ/j;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final Y(Z)J
    .locals 4

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v0}, LI/l1;->f()LL0/M;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->c()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v1, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-virtual {v1}, LH/h;->f()J

    move-result-wide v1

    if-eqz p1, :cond_1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v3

    goto :goto_0

    :cond_1
    invoke-static {v1, v2}, LL0/S;->i(J)I

    move-result v3

    :goto_0
    invoke-static {v1, v2}, LL0/S;->m(J)Z

    move-result v1

    invoke-static {v0, v3, p1, v1}, LM/M;->b(LL0/M;IZZ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final Z()J
    .locals 2

    iget-object v0, p0, LJ/j;->n:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic a(LJ/j;Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LJ/j;->J(Ly0/G;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, LJ/j;->K(Lkotlin/jvm/internal/M;Lkotlin/jvm/internal/M;LJ/j;)V

    return-void
.end method

.method private final b0()Z
    .locals 1

    iget-object v0, p0, LJ/j;->q:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static final synthetic c(LJ/j;Ly0/G;ZLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LJ/j;->L(Ly0/G;ZLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c0()J
    .locals 2

    iget-object v0, p0, LJ/j;->m:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/g;

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic d(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V
    .locals 0

    invoke-static {p0, p1, p2}, LJ/j;->M(Lkotlin/jvm/internal/M;LJ/j;Lkotlin/jvm/internal/M;)V

    return-void
.end method

.method private final d0(IILL0/S;ZLM/r;)J
    .locals 9

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v0}, LI/l1;->f()LL0/M;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object p1, LL0/S;->b:LL0/S$a;

    invoke-virtual {p1}, LL0/S$a;->a()J

    move-result-wide p1

    return-wide p1

    :cond_0
    if-nez p3, :cond_1

    sget-object v0, LM/r;->a:LM/r$a;

    invoke-virtual {v0}, LM/r$a;->k()LM/r;

    move-result-object v0

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LL0/T;->b(II)J

    move-result-wide p1

    return-wide p1

    :cond_1
    iget v4, p0, LJ/j;->t:I

    if-eqz p3, :cond_2

    invoke-virtual {p3}, LL0/S;->r()J

    move-result-wide v2

    :goto_0
    move-wide v5, v2

    goto :goto_1

    :cond_2
    sget-object v0, LL0/S;->b:LL0/S$a;

    invoke-virtual {v0}, LL0/S$a;->a()J

    move-result-wide v2

    goto :goto_0

    :goto_1
    if-nez p3, :cond_3

    const/4 v0, 0x1

    :goto_2
    move v7, v0

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    move v2, p1

    move v3, p2

    move v8, p4

    invoke-static/range {v1 .. v8}, LM/y;->c(LL0/M;IIIJZZ)LM/x;

    move-result-object v0

    if-eqz p3, :cond_4

    iget-object v1, p0, LJ/j;->s:LM/x;

    invoke-interface {v0, v1}, LM/x;->j(LM/x;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p3}, LL0/S;->r()J

    move-result-wide p1

    return-wide p1

    :cond_4
    invoke-interface {p5, v0}, LM/r;->a(LM/x;)LM/l;

    move-result-object p3

    invoke-virtual {p3}, LM/l;->f()J

    move-result-wide v1

    iput-object v0, p0, LJ/j;->s:LM/x;

    if-eqz p4, :cond_5

    goto :goto_4

    :cond_5
    move p1, p2

    :goto_4
    iput p1, p0, LJ/j;->t:I

    return-wide v1
.end method

.method public static final synthetic e(LJ/j;)Ll0/i;
    .locals 0

    invoke-direct {p0}, LJ/j;->Q()Ll0/i;

    move-result-object p0

    return-object p0
.end method

.method private final e0()LC0/r;
    .locals 3

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v0}, LI/l1;->j()LC0/r;

    move-result-object v0

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

.method public static final synthetic f(LJ/j;)Z
    .locals 0

    iget-boolean p0, p0, LJ/j;->d:Z

    return p0
.end method

.method private final f0()LJ/n;
    .locals 1

    iget-object v0, p0, LJ/j;->r:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/n;

    return-object v0
.end method

.method public static final synthetic g(LJ/j;Z)J
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->Y(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method private final g0()V
    .locals 2

    iget-object v0, p0, LJ/j;->i:Landroidx/compose/ui/platform/q1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->a()Landroidx/compose/ui/platform/s1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Landroidx/compose/ui/platform/s1;->Shown:Landroidx/compose/ui/platform/s1;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LJ/j;->i:Landroidx/compose/ui/platform/q1;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/q1;->c()V

    :cond_1
    return-void
.end method

.method public static final synthetic h(LJ/j;)Lu0/a;
    .locals 0

    iget-object p0, p0, LJ/j;->h:Lu0/a;

    return-object p0
.end method

.method private final h0()Z
    .locals 6

    sget-object v0, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, LJ/j;->T()Ll0/i;

    move-result-object v4

    invoke-virtual {v4}, Ll0/i;->f()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, v4, v5}, LM/A;->a(Ll0/i;J)Z

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :catchall_0
    move-exception v4

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v4
.end method

.method public static final synthetic i(LJ/j;)Ly/o$b;
    .locals 0

    iget-object p0, p0, LJ/j;->u:Ly/o$b;

    return-object p0
.end method

.method public static final synthetic j(LJ/j;)Z
    .locals 0

    iget-boolean p0, p0, LJ/j;->e:Z

    return p0
.end method

.method public static final synthetic k(LJ/j;)LI/o1;
    .locals 0

    iget-object p0, p0, LJ/j;->a:LI/o1;

    return-object p0
.end method

.method private final k0()V
    .locals 2

    invoke-direct {p0}, LJ/j;->R()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LJ/j;->A0(J)V

    return-void
.end method

.method public static final synthetic l(LJ/j;)LC0/r;
    .locals 0

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LJ/j;)LI/l1;
    .locals 0

    iget-object p0, p0, LJ/j;->b:LI/l1;

    return-object p0
.end method

.method private final m0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$v;

    invoke-direct {v0, p0}, LJ/j$v;-><init>(LJ/j;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v0

    sget-object v1, LJ/j$w;->a:LJ/j$w;

    invoke-static {v0, v1}, LLi/i;->o(LLi/g;Lmh/p;)LLi/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, LLi/i;->q(LLi/g;I)LLi/g;

    move-result-object v0

    new-instance v1, LJ/j$x;

    invoke-direct {v1, p0}, LJ/j$x;-><init>(LJ/j;)V

    invoke-interface {v0, v1, p1}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static final synthetic n(LJ/j;)LJ/n;
    .locals 0

    invoke-direct {p0}, LJ/j;->f0()LJ/n;

    move-result-object p0

    return-object p0
.end method

.method private final n0(Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$y;

    invoke-direct {v0, p0}, LJ/j$y;-><init>(LJ/j;)V

    invoke-static {v0}, LT/o1;->o(Lmh/a;)LLi/g;

    move-result-object v0

    new-instance v1, LJ/j$z;

    invoke-direct {v1, p0}, LJ/j$z;-><init>(LJ/j;)V

    invoke-interface {v0, v1, p1}, LLi/g;->b(LLi/h;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public static final synthetic o(LJ/j;)V
    .locals 0

    invoke-direct {p0}, LJ/j;->g0()V

    return-void
.end method

.method public static final synthetic p(LJ/j;)V
    .locals 0

    invoke-direct {p0}, LJ/j;->k0()V

    return-void
.end method

.method private final p0()V
    .locals 7

    iget-object v0, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/h0;->a()LL0/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LL0/d;->k()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LJ/j;->a:LI/o1;

    sget-object v4, LK/c;->NeverMerge:LK/c;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LI/o1;->u(LI/o1;Ljava/lang/CharSequence;ZLK/c;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic q(LJ/j;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->m0(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final q0(J)Z
    .locals 10

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v0}, LI/l1;->f()LL0/M;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0, p1, p2}, LL0/M;->x(J)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    return v1

    :cond_1
    iget-object v3, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v3, v2}, LI/o1;->n(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LI/o1;->p(J)J

    move-result-wide v2

    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, LI/G0;->Untransformed:LI/G0;

    goto :goto_0

    :cond_2
    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result v6

    if-nez v6, :cond_3

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v6

    if-nez v6, :cond_3

    sget-object v6, LI/G0;->Replacement:LI/G0;

    goto :goto_0

    :cond_3
    invoke-static {v4, v5}, LL0/S;->h(J)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v6

    if-nez v6, :cond_4

    sget-object v6, LI/G0;->Insertion:LI/G0;

    goto :goto_0

    :cond_4
    sget-object v6, LI/G0;->Deletion:LI/G0;

    :goto_0
    sget-object v7, LJ/j$d;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v7, :cond_a

    const/4 v9, 0x2

    if-eq v6, v9, :cond_9

    const/4 v9, 0x3

    if-eq v6, v9, :cond_7

    const/4 v9, 0x4

    if-ne v6, v9, :cond_6

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v6

    invoke-virtual {v0, v6}, LL0/M;->e(I)Ll0/i;

    move-result-object v6

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    invoke-virtual {v0, v2}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    invoke-static {p1, p2, v6, v0}, LI/R0;->b(JLl0/i;Ll0/i;)I

    move-result p1

    if-gez p1, :cond_5

    invoke-static {v4, v5}, LL0/S;->n(J)I

    move-result p1

    goto :goto_3

    :cond_5
    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result p1

    goto :goto_3

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result v6

    invoke-virtual {v0, v6}, LL0/M;->e(I)Ll0/i;

    move-result-object v6

    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result v2

    invoke-virtual {v0, v2}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    invoke-static {p1, p2, v6, v0}, LI/R0;->b(JLl0/i;Ll0/i;)I

    move-result p1

    if-gez p1, :cond_8

    new-instance p1, LI/X0;

    sget-object p2, LI/p1;->Start:LI/p1;

    invoke-direct {p1, p2}, LI/X0;-><init>(LI/p1;)V

    :goto_1
    move-object v8, p1

    goto :goto_2

    :cond_8
    new-instance p1, LI/X0;

    sget-object p2, LI/p1;->End:LI/p1;

    invoke-direct {p1, p2}, LI/X0;-><init>(LI/p1;)V

    goto :goto_1

    :goto_2
    invoke-static {v4, v5}, LL0/S;->n(J)I

    move-result p1

    goto :goto_3

    :cond_9
    invoke-static {v4, v5}, LL0/S;->n(J)I

    move-result p1

    goto :goto_3

    :cond_a
    invoke-static {v4, v5}, LL0/S;->n(J)I

    move-result p1

    :goto_3
    invoke-static {p1}, LL0/T;->a(I)J

    move-result-wide p1

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->k()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v2

    invoke-static {p1, p2, v2, v3}, LL0/S;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v8, :cond_b

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->j()LI/X0;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    return v1

    :cond_c
    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0, p1, p2}, LI/o1;->z(J)V

    if-eqz v8, :cond_d

    iget-object p1, p0, LJ/j;->a:LI/o1;

    invoke-virtual {p1, v8}, LI/o1;->A(LI/X0;)V

    :cond_d
    return v7
.end method

.method public static final synthetic r(LJ/j;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->n0(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(LJ/j;J)Z
    .locals 0

    invoke-direct {p0, p1, p2}, LJ/j;->q0(J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic t(LJ/j;Ly/o$b;)V
    .locals 0

    iput-object p1, p0, LJ/j;->u:Ly/o$b;

    return-void
.end method

.method public static final synthetic u(LJ/j;I)V
    .locals 0

    iput p1, p0, LJ/j;->t:I

    return-void
.end method

.method public static final synthetic v(LJ/j;Z)V
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->z0(Z)V

    return-void
.end method

.method public static final synthetic w(LJ/j;LJ/n;)V
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->B0(LJ/n;)V

    return-void
.end method

.method public static final synthetic x(LJ/j;Ll0/i;)V
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->C0(Ll0/i;)V

    return-void
.end method

.method private final x0(J)V
    .locals 1

    iget-object v0, p0, LJ/j;->n:LT/q0;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic y(LJ/j;LH/h;IIZLM/r;ZZ)J
    .locals 0

    invoke-direct/range {p0 .. p7}, LJ/j;->G0(LH/h;IIZLM/r;ZZ)J

    move-result-wide p0

    return-wide p0
.end method

.method private final z0(Z)V
    .locals 1

    iget-object v0, p0, LJ/j;->q:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 2

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, LJ/j;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LJ/j;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final B()Z
    .locals 3

    invoke-direct {p0}, LJ/j;->W()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/compose/ui/platform/h0;->c()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, LJ/j;->l:Lmh/a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    :cond_2
    return v1
.end method

.method public final C()Z
    .locals 2

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->j(J)I

    move-result v0

    iget-object v1, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-virtual {v1}, LH/h;->length()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LJ/j;->u0(LF/p;)V

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, LJ/j;->x0(J)V

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LJ/j;->A0(J)V

    return-void
.end method

.method public final D0(Ly0/G;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$b;

    invoke-direct {v0, p0, p2}, LJ/j$b;-><init>(LJ/j;Lmh/a;)V

    new-instance v1, LJ/j$c;

    invoke-direct {v1, p0, p2}, LJ/j$c;-><init>(LJ/j;Lmh/a;)V

    invoke-static {p1, v0, v1, p3}, LM/t;->n(Ly0/G;LM/i;LF/U;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final E(Z)V
    .locals 9

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    if-eqz v1, :cond_1

    new-instance v8, LL0/d;

    invoke-static {v0}, LH/i;->a(LH/h;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    :cond_1
    if-nez p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, LJ/j;->a:LI/o1;

    invoke-virtual {p1}, LI/o1;->f()V

    return-void
.end method

.method public final E0(Lu0/a;Landroidx/compose/ui/platform/h0;Landroidx/compose/ui/platform/q1;LY0/d;ZZZ)V
    .locals 0

    if-nez p5, :cond_0

    invoke-direct {p0}, LJ/j;->g0()V

    :cond_0
    iput-object p1, p0, LJ/j;->h:Lu0/a;

    iput-object p2, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    iput-object p3, p0, LJ/j;->i:Landroidx/compose/ui/platform/q1;

    iput-object p4, p0, LJ/j;->c:LY0/d;

    iput-boolean p5, p0, LJ/j;->d:Z

    iput-boolean p6, p0, LJ/j;->e:Z

    iput-boolean p7, p0, LJ/j;->g:Z

    return-void
.end method

.method public final F0(LF/p;J)V
    .locals 0

    invoke-virtual {p0, p1}, LJ/j;->u0(LF/p;)V

    invoke-direct {p0, p2, p3}, LJ/j;->x0(J)V

    return-void
.end method

.method public final G(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LJ/j$e;-><init>(LJ/j;Ly0/G;Ldh/e;)V

    invoke-static {v0, p2}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final H()V
    .locals 9

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    if-eqz v1, :cond_1

    new-instance v8, LL0/d;

    invoke-static {v0}, LH/i;->a(LH/h;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LL0/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, Landroidx/compose/ui/platform/h0;->b(LL0/d;)V

    :cond_1
    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->h()V

    return-void
.end method

.method public final I()V
    .locals 2

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->e()V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LJ/j;->z0(Z)V

    sget-object v0, LJ/n;->None:LJ/n;

    invoke-virtual {p0, v0}, LJ/j;->I0(LJ/n;)V

    return-void
.end method

.method public final I0(LJ/n;)V
    .locals 0

    invoke-direct {p0, p1}, LJ/j;->B0(LJ/n;)V

    return-void
.end method

.method public final N(Ly0/G;Ly/m;Lmh/a;Lmh/a;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$q;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, v1}, LJ/j$q;-><init>(Ly/m;LJ/j;Ldh/e;)V

    new-instance p2, LJ/j$r;

    invoke-direct {p2, p3, p0, p4}, LJ/j$r;-><init>(Lmh/a;LJ/j;Lmh/a;)V

    invoke-static {p1, v0, p2, p5}, Lw/B;->i(Ly0/G;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final O(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJ/j$s;-><init>(LJ/j;Ldh/e;)V

    invoke-interface {p1, v0, p2}, Ly0/G;->P(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final P()V
    .locals 1

    invoke-direct {p0}, LJ/j;->g0()V

    const/4 v0, 0x0

    iput-object v0, p0, LJ/j;->i:Landroidx/compose/ui/platform/q1;

    iput-object v0, p0, LJ/j;->j:Landroidx/compose/ui/platform/h0;

    iput-object v0, p0, LJ/j;->h:Lu0/a;

    return-void
.end method

.method public final S(Z)LJ/d;
    .locals 8

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-direct {p0}, LJ/j;->b0()Z

    move-result v1

    invoke-virtual {p0}, LJ/j;->U()LJ/j$a;

    move-result-object v2

    sget-object v3, LJ/j$a;->None:LJ/j$a;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, LJ/j;->V()LF/p;

    move-result-object v3

    if-eqz v1, :cond_3

    if-eqz v2, :cond_3

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, LH/h;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, LF/p;->Cursor:LF/p;

    if-eq v3, v0, :cond_1

    invoke-direct {p0}, LJ/j;->h0()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    new-instance v0, LJ/d;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LJ/j;->T()Ll0/i;

    move-result-object p1

    invoke-virtual {p1}, Ll0/i;->f()J

    move-result-wide v1

    :goto_1
    move-wide v3, v1

    goto :goto_2

    :cond_2
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v1

    goto :goto_1

    :goto_2
    sget-object v5, LW0/i;->Ltr:LW0/i;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LJ/d;-><init>(ZJLW0/i;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    sget-object p1, LJ/d;->e:LJ/d$a;

    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    move-result-object p1

    return-object p1
.end method

.method public final T()Ll0/i;
    .locals 8

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v0}, LI/l1;->f()LL0/M;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v1}, LI/o1;->l()LH/h;

    move-result-object v1

    invoke-virtual {v1}, LH/h;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {v1}, LH/h;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->n(J)I

    move-result v1

    invoke-virtual {v0, v1}, LL0/M;->e(I)Ll0/i;

    move-result-object v1

    iget-object v2, p0, LJ/j;->c:LY0/d;

    invoke-static {}, LF/V;->b()F

    move-result v3

    invoke-interface {v2, v3}, LY0/d;->d1(F)F

    move-result v2

    invoke-virtual {v0}, LL0/M;->l()LL0/L;

    move-result-object v3

    invoke-virtual {v3}, LL0/L;->d()LY0/t;

    move-result-object v3

    sget-object v4, LY0/t;->Ltr:LY0/t;

    const/4 v5, 0x2

    if-ne v3, v4, :cond_2

    invoke-virtual {v1}, Ll0/i;->k()F

    move-result v3

    int-to-float v4, v5

    div-float v4, v2, v4

    add-float/2addr v3, v4

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ll0/i;->l()F

    move-result v3

    int-to-float v4, v5

    div-float v4, v2, v4

    sub-float/2addr v3, v4

    :goto_0
    invoke-virtual {v0}, LL0/M;->B()J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/r;->g(J)I

    move-result v0

    int-to-float v0, v0

    int-to-float v4, v5

    div-float/2addr v2, v4

    sub-float/2addr v0, v2

    invoke-static {v3, v0}, Lsh/m;->f(FF)F

    move-result v0

    invoke-static {v0, v2}, Lsh/m;->c(FF)F

    move-result v0

    sub-float v3, v0, v2

    add-float/2addr v0, v2

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v2

    invoke-virtual {v1}, Ll0/i;->e()F

    move-result v1

    new-instance v4, Ll0/i;

    invoke-direct {v4, v3, v2, v0, v1}, Ll0/i;-><init>(FFFF)V

    return-object v4
.end method

.method public final U()LJ/j$a;
    .locals 1

    iget-object v0, p0, LJ/j;->p:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ/j$a;

    return-object v0
.end method

.method public final V()LF/p;
    .locals 1

    iget-object v0, p0, LJ/j;->o:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF/p;

    return-object v0
.end method

.method public final X()J
    .locals 6

    invoke-direct {p0}, LJ/j;->Z()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->b()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LJ/j;->c0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LJ/j;->b:LI/l1;

    invoke-direct {p0}, LJ/j;->Z()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LI/m1;->b(LI/l1;J)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-direct {p0}, LJ/j;->Z()J

    move-result-wide v0

    invoke-direct {p0}, LJ/j;->c0()J

    move-result-wide v2

    invoke-direct {p0}, LJ/j;->R()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ll0/g;->q(JJ)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final a0(ZZ)LJ/d;
    .locals 13

    if-eqz p1, :cond_0

    sget-object v0, LF/p;->SelectionStart:LF/p;

    goto :goto_0

    :cond_0
    sget-object v0, LF/p;->SelectionEnd:LF/p;

    :goto_0
    iget-object v1, p0, LJ/j;->b:LI/l1;

    invoke-virtual {v1}, LI/l1;->f()LL0/M;

    move-result-object v1

    if-nez v1, :cond_1

    sget-object p1, LJ/d;->e:LJ/d$a;

    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v2, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v2}, LI/o1;->l()LH/h;

    move-result-object v2

    invoke-virtual {v2}, LH/h;->f()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object p1, LJ/d;->e:LJ/d$a;

    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, LJ/j;->Y(Z)J

    move-result-wide v4

    invoke-virtual {p0}, LJ/j;->U()LJ/j$a;

    move-result-object v6

    sget-object v7, LJ/j$a;->None:LJ/j$a;

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v6, v7, :cond_5

    invoke-virtual {p0}, LJ/j;->V()LF/p;

    move-result-object v6

    if-eq v6, v0, :cond_4

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0, v4, v5}, LM/A;->a(Ll0/i;J)Z

    move-result v0

    goto :goto_1

    :cond_3
    move v0, v9

    :goto_1
    if-eqz v0, :cond_5

    :cond_4
    move v0, v8

    goto :goto_2

    :cond_5
    move v0, v9

    :goto_2
    if-nez v0, :cond_6

    sget-object p1, LJ/d;->e:LJ/d$a;

    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->h()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object p1, LJ/d;->e:LJ/d$a;

    invoke-virtual {p1}, LJ/d$a;->a()LJ/d;

    move-result-object p1

    return-object p1

    :cond_7
    if-eqz p1, :cond_8

    invoke-static {v2, v3}, LL0/S;->n(J)I

    move-result p1

    goto :goto_3

    :cond_8
    invoke-static {v2, v3}, LL0/S;->i(J)I

    move-result p1

    sub-int/2addr p1, v8

    invoke-static {p1, v9}, Ljava/lang/Math;->max(II)I

    move-result p1

    :goto_3
    invoke-virtual {v1, p1}, LL0/M;->c(I)LW0/i;

    move-result-object v10

    invoke-static {v2, v3}, LL0/S;->m(J)Z

    move-result v11

    if-eqz p2, :cond_a

    invoke-direct {p0}, LJ/j;->e0()LC0/r;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {v4, v5, p1}, LI/m1;->a(JLl0/i;)J

    move-result-wide v4

    :cond_9
    :goto_4
    move-wide v8, v4

    goto :goto_5

    :cond_a
    sget-object p1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p1}, Ll0/g$a;->b()J

    move-result-wide v4

    goto :goto_4

    :goto_5
    new-instance p1, LJ/d;

    const/4 v7, 0x1

    const/4 v12, 0x0

    move-object v6, p1

    invoke-direct/range {v6 .. v12}, LJ/d;-><init>(ZJLW0/i;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final i0()Z
    .locals 1

    iget-boolean v0, p0, LJ/j;->f:Z

    return v0
.end method

.method public final j0()Z
    .locals 1

    iget-object v0, p0, LJ/j;->k:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final l0(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, LJ/j$t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LJ/j$t;

    iget v1, v0, LJ/j$t;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LJ/j$t;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, LJ/j$t;

    invoke-direct {v0, p0, p1}, LJ/j$t;-><init>(LJ/j;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LJ/j$t;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ/j$t;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, LJ/j$t;->a:Ljava/lang/Object;

    check-cast v0, LJ/j;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, LJ/j$u;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, LJ/j$u;-><init>(LJ/j;Ldh/e;)V

    iput-object p0, v0, LJ/j$t;->a:Ljava/lang/Object;

    iput v4, v0, LJ/j$t;->d:I

    invoke-static {p1, v0}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    invoke-direct {v0, v3}, LJ/j;->z0(Z)V

    invoke-direct {v0}, LJ/j;->f0()LJ/n;

    move-result-object p1

    sget-object v1, LJ/n;->None:LJ/n;

    if-eq p1, v1, :cond_4

    invoke-direct {v0}, LJ/j;->g0()V

    :cond_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    :goto_2
    invoke-direct {v0, v3}, LJ/j;->z0(Z)V

    invoke-direct {v0}, LJ/j;->f0()LJ/n;

    move-result-object v1

    sget-object v2, LJ/n;->None:LJ/n;

    if-eq v1, v2, :cond_5

    invoke-direct {v0}, LJ/j;->g0()V

    :cond_5
    throw p1
.end method

.method public final o0()V
    .locals 1

    iget-object v0, p0, LJ/j;->l:Lmh/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/d;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, LJ/j;->p0()V

    return-void
.end method

.method public final r0()V
    .locals 1

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->x()V

    return-void
.end method

.method public final s0(Ly0/G;ZLdh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LJ/j$A;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LJ/j$A;-><init>(LJ/j;Ly0/G;ZLdh/e;)V

    invoke-static {v0, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final t0(LJ/j$a;)V
    .locals 1

    iget-object v0, p0, LJ/j;->p:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final u0(LF/p;)V
    .locals 1

    iget-object v0, p0, LJ/j;->o:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final v0(Z)V
    .locals 0

    iput-boolean p1, p0, LJ/j;->f:Z

    return-void
.end method

.method public final w0(Z)V
    .locals 1

    iget-object v0, p0, LJ/j;->k:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final y0(Lmh/a;)V
    .locals 0

    iput-object p1, p0, LJ/j;->l:Lmh/a;

    return-void
.end method

.method public final z()Z
    .locals 2

    iget-object v0, p0, LJ/j;->a:LI/o1;

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, LJ/j;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
