.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$a;
    }
.end annotation


# instance fields
.field private final a:Lmh/p;

.field private final b:Lmh/l;

.field private final c:Lmh/a;

.field private final d:Lmh/a;

.field private final e:Lmh/a;

.field private f:Landroidx/compose/ui/focus/FocusTargetNode;

.field private final g:Lk0/d;

.field private final h:Lk0/q;

.field private final i:Landroidx/compose/ui/e;

.field private j:Lo/C;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;Lmh/p;Lmh/l;Lmh/a;Lmh/a;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lmh/p;

    iput-object p3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:Lmh/l;

    iput-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Lmh/a;

    iput-object p5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lmh/a;

    iput-object p6, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->e:Lmh/a;

    new-instance p2, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-direct {p2}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    new-instance p2, Lk0/d;

    new-instance p3, Landroidx/compose/ui/focus/FocusOwnerImpl$c;

    invoke-direct {p3, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p1, p3}, Lk0/d;-><init>(Lmh/l;Lmh/a;)V

    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    new-instance p1, Lk0/q;

    invoke-direct {p1}, Lk0/q;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->h:Lk0/q;

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object p2, Landroidx/compose/ui/focus/FocusOwnerImpl$e;->a:Landroidx/compose/ui/focus/FocusOwnerImpl$e;

    invoke-static {p1, p2}, Landroidx/compose/ui/focus/m;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;

    invoke-direct {p2, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    invoke-interface {p1, p2}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->i:Landroidx/compose/ui/e;

    return-void
.end method

.method public static final synthetic s(Landroidx/compose/ui/focus/FocusOwnerImpl;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->u()V

    return-void
.end method

.method private final u()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->K2()Lk0/m;

    move-result-object v0

    sget-object v1, Lk0/m;->Inactive:Lk0/m;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final v(LE0/j;)Landroidx/compose/ui/e$c;
    .locals 5

    const/16 v0, 0x400

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    const/16 v2, 0x2000

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v2

    or-int/2addr v1, v2

    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "visitLocalDescendants called on an unattached node"

    invoke-static {v2}, LB0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_2

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v2

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v2, v4

    if-eqz v2, :cond_1

    return-object v3

    :cond_1
    move-object v3, p1

    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_3
    return-object v3
.end method

.method private final x(Landroid/view/KeyEvent;)Z
    .locals 5

    invoke-static {p1}, Lw0/d;->a(Landroid/view/KeyEvent;)J

    move-result-wide v0

    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result p1

    sget-object v2, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v2}, Lw0/c$a;->a()I

    move-result v3

    invoke-static {p1, v3}, Lw0/c;->e(II)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->j:Lo/C;

    if-nez p1, :cond_0

    new-instance p1, Lo/C;

    const/4 v2, 0x3

    invoke-direct {p1, v2}, Lo/C;-><init>(I)V

    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->j:Lo/C;

    :cond_0
    invoke-virtual {p1, v0, v1}, Lo/C;->l(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lw0/c$a;->b()I

    move-result v2

    invoke-static {p1, v2}, Lw0/c;->e(II)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->j:Lo/C;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0, v1}, Lo/r;->a(J)Z

    move-result p1

    if-ne p1, v4, :cond_2

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->j:Lo/C;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0, v1}, Lo/C;->m(J)Z

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    return v4
.end method


# virtual methods
.method public a(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {v0, p1}, Lk0/d;->d(Landroidx/compose/ui/focus/FocusTargetNode;)V

    return-void
.end method

.method public b()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->i:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public e(ZZZI)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->g()Lk0/q;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusOwnerImpl$b;->a:Landroidx/compose/ui/focus/FocusOwnerImpl$b;

    :try_start_0
    invoke-static {v0}, Lk0/q;->e(Lk0/q;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lk0/q;->b(Lk0/q;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    :goto_0
    invoke-static {v0}, Lk0/q;->a(Lk0/q;)V

    if-eqz v1, :cond_1

    invoke-static {v0}, Lk0/q;->d(Lk0/q;)LV/b;

    move-result-object v2

    invoke-virtual {v2, v1}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_1
    if-nez p1, :cond_3

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v1, p4}, Landroidx/compose/ui/focus/s;->e(Landroidx/compose/ui/focus/FocusTargetNode;I)Lk0/a;

    move-result-object p4

    sget-object v1, Landroidx/compose/ui/focus/FocusOwnerImpl$a;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v1, p4

    const/4 v1, 0x1

    if-eq p4, v1, :cond_2

    const/4 v1, 0x2

    if-eq p4, v1, :cond_2

    const/4 v1, 0x3

    if-eq p4, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {p4, p1, p2}, Landroidx/compose/ui/focus/s;->c(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-static {v0}, Lk0/q;->c(Lk0/q;)V

    if-eqz p1, :cond_4

    if-eqz p3, :cond_4

    iget-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->c:Lmh/a;

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_4
    return p1

    :goto_3
    invoke-static {v0}, Lk0/q;->c(Lk0/q;)V

    throw p1
.end method

.method public f()Lk0/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->K2()Lk0/m;

    move-result-object v0

    return-object v0
.end method

.method public g()Lk0/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->h:Lk0/q;

    return-object v0
.end method

.method public h(Landroid/view/KeyEvent;Lmh/a;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    iget-object v3, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {v3}, Lk0/d;->b()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const-string v1, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v4

    :cond_0
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->x(Landroid/view/KeyEvent;)Z

    move-result v3

    if-nez v3, :cond_1

    return v4

    :cond_1
    iget-object v3, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v3}, Landroidx/compose/ui/focus/t;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v3

    const-string v5, "visitAncestors called on an unattached node"

    const/16 v6, 0x2000

    const/16 v7, 0x10

    const/4 v8, 0x0

    if-eqz v3, :cond_2

    invoke-direct {v0, v3}, Landroidx/compose/ui/focus/FocusOwnerImpl;->v(LE0/j;)Landroidx/compose/ui/e$c;

    move-result-object v9

    if-nez v9, :cond_1c

    :cond_2
    if-eqz v3, :cond_f

    invoke-static {v6}, LE0/e0;->a(I)I

    move-result v9

    invoke-interface {v3}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-interface {v3}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v10

    invoke-static {v3}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_d

    invoke-virtual {v3}, LE0/G;->k0()LE0/a0;

    move-result-object v11

    invoke-virtual {v11}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->a2()I

    move-result v11

    and-int/2addr v11, v9

    if-eqz v11, :cond_b

    :goto_1
    if-eqz v10, :cond_b

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v9

    if-eqz v11, :cond_a

    move-object v12, v8

    move-object v11, v10

    :goto_2
    if-eqz v11, :cond_a

    instance-of v13, v11, Lw0/e;

    if-eqz v13, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v9

    if-eqz v13, :cond_9

    instance-of v13, v11, LE0/m;

    if-eqz v13, :cond_9

    move-object v13, v11

    check-cast v13, LE0/m;

    invoke-virtual {v13}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v13

    move v14, v4

    :goto_3
    if-eqz v13, :cond_8

    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->f2()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_7

    add-int/2addr v14, v2

    if-ne v14, v2, :cond_4

    move-object v11, v13

    goto :goto_4

    :cond_4
    if-nez v12, :cond_5

    new-instance v12, LV/b;

    new-array v15, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v12, v15, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz v11, :cond_6

    invoke-virtual {v12, v11}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v11, v8

    :cond_6
    invoke-virtual {v12, v13}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_7
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v13

    goto :goto_3

    :cond_8
    if-ne v14, v2, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v12}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_2

    :cond_a
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v10

    goto :goto_1

    :cond_b
    invoke-virtual {v3}, LE0/G;->o0()LE0/G;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, LE0/G;->k0()LE0/a0;

    move-result-object v10

    if-eqz v10, :cond_c

    invoke-virtual {v10}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v10

    goto :goto_0

    :cond_c
    move-object v10, v8

    goto :goto_0

    :cond_d
    move-object v11, v8

    :goto_5
    check-cast v11, Lw0/e;

    if-eqz v11, :cond_f

    invoke-interface {v11}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v9

    goto/16 :goto_c

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    iget-object v3, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v6}, LE0/e0;->a(I)I

    move-result v9

    invoke-interface {v3}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v10

    if-eqz v10, :cond_43

    invoke-interface {v3}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v10

    invoke-static {v3}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v3

    :goto_6
    if-eqz v3, :cond_1a

    invoke-virtual {v3}, LE0/G;->k0()LE0/a0;

    move-result-object v11

    invoke-virtual {v11}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->a2()I

    move-result v11

    and-int/2addr v11, v9

    if-eqz v11, :cond_18

    :goto_7
    if-eqz v10, :cond_18

    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v9

    if-eqz v11, :cond_17

    move-object v12, v8

    move-object v11, v10

    :goto_8
    if-eqz v11, :cond_17

    instance-of v13, v11, Lw0/e;

    if-eqz v13, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v9

    if-eqz v13, :cond_16

    instance-of v13, v11, LE0/m;

    if-eqz v13, :cond_16

    move-object v13, v11

    check-cast v13, LE0/m;

    invoke-virtual {v13}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v13

    move v14, v4

    :goto_9
    if-eqz v13, :cond_15

    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->f2()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_14

    add-int/2addr v14, v2

    if-ne v14, v2, :cond_11

    move-object v11, v13

    goto :goto_a

    :cond_11
    if-nez v12, :cond_12

    new-instance v12, LV/b;

    new-array v15, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v12, v15, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_12
    if-eqz v11, :cond_13

    invoke-virtual {v12, v11}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v11, v8

    :cond_13
    invoke-virtual {v12, v13}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_14
    :goto_a
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v13

    goto :goto_9

    :cond_15
    if-ne v14, v2, :cond_16

    goto :goto_8

    :cond_16
    invoke-static {v12}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_8

    :cond_17
    invoke-virtual {v10}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v10

    goto :goto_7

    :cond_18
    invoke-virtual {v3}, LE0/G;->o0()LE0/G;

    move-result-object v3

    if-eqz v3, :cond_19

    invoke-virtual {v3}, LE0/G;->k0()LE0/a0;

    move-result-object v10

    if-eqz v10, :cond_19

    invoke-virtual {v10}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v10

    goto :goto_6

    :cond_19
    move-object v10, v8

    goto :goto_6

    :cond_1a
    move-object v11, v8

    :goto_b
    check-cast v11, Lw0/e;

    if-eqz v11, :cond_1b

    invoke-interface {v11}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v9

    goto :goto_c

    :cond_1b
    move-object v9, v8

    :cond_1c
    :goto_c
    if-eqz v9, :cond_42

    invoke-static {v6}, LE0/e0;->a(I)I

    move-result v3

    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v6

    if-eqz v6, :cond_41

    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v5

    invoke-static {v9}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v6

    move-object v10, v8

    :goto_d
    if-eqz v6, :cond_28

    invoke-virtual {v6}, LE0/G;->k0()LE0/a0;

    move-result-object v11

    invoke-virtual {v11}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->a2()I

    move-result v11

    and-int/2addr v11, v3

    if-eqz v11, :cond_26

    :goto_e
    if-eqz v5, :cond_26

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v3

    if-eqz v11, :cond_25

    move-object v11, v5

    move-object v12, v8

    :goto_f
    if-eqz v11, :cond_25

    instance-of v13, v11, Lw0/e;

    if-eqz v13, :cond_1e

    if-nez v10, :cond_1d

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_1d
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1e
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v3

    if-eqz v13, :cond_24

    instance-of v13, v11, LE0/m;

    if-eqz v13, :cond_24

    move-object v13, v11

    check-cast v13, LE0/m;

    invoke-virtual {v13}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v13

    move v14, v4

    :goto_10
    if-eqz v13, :cond_23

    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->f2()I

    move-result v15

    and-int/2addr v15, v3

    if-eqz v15, :cond_22

    add-int/2addr v14, v2

    if-ne v14, v2, :cond_1f

    move-object v11, v13

    goto :goto_11

    :cond_1f
    if-nez v12, :cond_20

    new-instance v12, LV/b;

    new-array v15, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v12, v15, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_20
    if-eqz v11, :cond_21

    invoke-virtual {v12, v11}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v11, v8

    :cond_21
    invoke-virtual {v12, v13}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_22
    :goto_11
    invoke-virtual {v13}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v13

    goto :goto_10

    :cond_23
    if-ne v14, v2, :cond_24

    goto :goto_f

    :cond_24
    :goto_12
    invoke-static {v12}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_f

    :cond_25
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_e

    :cond_26
    invoke-virtual {v6}, LE0/G;->o0()LE0/G;

    move-result-object v6

    if-eqz v6, :cond_27

    invoke-virtual {v6}, LE0/G;->k0()LE0/a0;

    move-result-object v5

    if-eqz v5, :cond_27

    invoke-virtual {v5}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto/16 :goto_d

    :cond_27
    move-object v5, v8

    goto/16 :goto_d

    :cond_28
    if-eqz v10, :cond_2c

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_2b

    :goto_13
    add-int/lit8 v6, v5, -0x1

    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw0/e;

    invoke-interface {v5, v1}, Lw0/e;->Q(Landroid/view/KeyEvent;)Z

    move-result v5

    if-eqz v5, :cond_29

    return v2

    :cond_29
    if-gez v6, :cond_2a

    goto :goto_14

    :cond_2a
    move v5, v6

    goto :goto_13

    :cond_2b
    :goto_14
    sget-object v5, LYg/J;->a:LYg/J;

    :cond_2c
    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v5

    move-object v6, v8

    :goto_15
    if-eqz v5, :cond_34

    instance-of v11, v5, Lw0/e;

    if-eqz v11, :cond_2d

    check-cast v5, Lw0/e;

    invoke-interface {v5, v1}, Lw0/e;->Q(Landroid/view/KeyEvent;)Z

    move-result v5

    if-eqz v5, :cond_33

    return v2

    :cond_2d
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v3

    if-eqz v11, :cond_33

    instance-of v11, v5, LE0/m;

    if-eqz v11, :cond_33

    move-object v11, v5

    check-cast v11, LE0/m;

    invoke-virtual {v11}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v11

    move v12, v4

    :goto_16
    if-eqz v11, :cond_32

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v3

    if-eqz v13, :cond_31

    add-int/2addr v12, v2

    if-ne v12, v2, :cond_2e

    move-object v5, v11

    goto :goto_17

    :cond_2e
    if-nez v6, :cond_2f

    new-instance v6, LV/b;

    new-array v13, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v13, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2f
    if-eqz v5, :cond_30

    invoke-virtual {v6, v5}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v5, v8

    :cond_30
    invoke-virtual {v6, v11}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_31
    :goto_17
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_16

    :cond_32
    if-ne v12, v2, :cond_33

    goto :goto_15

    :cond_33
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_15

    :cond_34
    invoke-interface/range {p2 .. p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_35

    return v2

    :cond_35
    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v5

    move-object v6, v8

    :goto_18
    if-eqz v5, :cond_3d

    instance-of v9, v5, Lw0/e;

    if-eqz v9, :cond_36

    check-cast v5, Lw0/e;

    invoke-interface {v5, v1}, Lw0/e;->r0(Landroid/view/KeyEvent;)Z

    move-result v5

    if-eqz v5, :cond_3c

    return v2

    :cond_36
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v3

    if-eqz v9, :cond_3c

    instance-of v9, v5, LE0/m;

    if-eqz v9, :cond_3c

    move-object v9, v5

    check-cast v9, LE0/m;

    invoke-virtual {v9}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v9

    move v11, v4

    :goto_19
    if-eqz v9, :cond_3b

    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->f2()I

    move-result v12

    and-int/2addr v12, v3

    if-eqz v12, :cond_3a

    add-int/2addr v11, v2

    if-ne v11, v2, :cond_37

    move-object v5, v9

    goto :goto_1a

    :cond_37
    if-nez v6, :cond_38

    new-instance v6, LV/b;

    new-array v12, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v6, v12, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_38
    if-eqz v5, :cond_39

    invoke-virtual {v6, v5}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v5, v8

    :cond_39
    invoke-virtual {v6, v9}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_3a
    :goto_1a
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v9

    goto :goto_19

    :cond_3b
    if-ne v11, v2, :cond_3c

    goto :goto_18

    :cond_3c
    invoke-static {v6}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_18

    :cond_3d
    if-eqz v10, :cond_40

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v3

    move v5, v4

    :goto_1b
    if-ge v5, v3, :cond_3f

    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw0/e;

    invoke-interface {v6, v1}, Lw0/e;->r0(Landroid/view/KeyEvent;)Z

    move-result v6

    if-eqz v6, :cond_3e

    return v2

    :cond_3e
    add-int/2addr v5, v2

    goto :goto_1b

    :cond_3f
    sget-object v1, LYg/J;->a:LYg/J;

    :cond_40
    sget-object v1, LYg/J;->a:LYg/J;

    goto :goto_1c

    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_42
    :goto_1c
    return v4

    :cond_43
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public i()Ll0/i;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/t;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/t;->d(Landroidx/compose/ui/focus/FocusTargetNode;)Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public j(Lk0/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {v0, p1}, Lk0/d;->e(Lk0/b;)V

    return-void
.end method

.method public k(I)Z
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->d:Lmh/a;

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll0/i;

    new-instance v2, Landroidx/compose/ui/focus/FocusOwnerImpl$f;

    invoke-direct {v2, v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$f;-><init>(Lkotlin/jvm/internal/N;I)V

    invoke-virtual {p0, p1, v1, v2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    iget-object v3, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v4

    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/focus/j;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v2, v4, v2, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->e(ZZZI)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->w(ILl0/i;)Z

    move-result p1

    if-eqz p1, :cond_2

    move v2, v4

    :cond_2
    return v2

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->b:Lmh/l;

    invoke-static {p1}, Landroidx/compose/ui/focus/d;->i(I)Landroidx/compose/ui/focus/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    return v2
.end method

.method public l(LA0/b;)Z
    .locals 14

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {v0}, Lk0/d;->b()Z

    move-result v0

    if-nez v0, :cond_2f

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/t;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const-string v1, "visitAncestors called on an unattached node"

    const/16 v2, 0x4000

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_c

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v7

    invoke-interface {v0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v0}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v8

    invoke-static {v0}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, LE0/G;->k0()LE0/a0;

    move-result-object v9

    invoke-virtual {v9}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->a2()I

    move-result v9

    and-int/2addr v9, v7

    if-eqz v9, :cond_8

    :goto_1
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v7

    if-eqz v9, :cond_7

    move-object v10, v5

    move-object v9, v8

    :goto_2
    if-eqz v9, :cond_7

    instance-of v11, v9, LA0/a;

    if-eqz v11, :cond_0

    goto :goto_5

    :cond_0
    invoke-virtual {v9}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v7

    if-eqz v11, :cond_6

    instance-of v11, v9, LE0/m;

    if-eqz v11, :cond_6

    move-object v11, v9

    check-cast v11, LE0/m;

    invoke-virtual {v11}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v11

    move v12, v4

    :goto_3
    if-eqz v11, :cond_5

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v7

    if-eqz v13, :cond_4

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v6, :cond_1

    move-object v9, v11

    goto :goto_4

    :cond_1
    if-nez v10, :cond_2

    new-instance v10, LV/b;

    new-array v13, v3, [Landroidx/compose/ui/e$c;

    invoke-direct {v10, v13, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v9, :cond_3

    invoke-virtual {v10, v9}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v9, v5

    :cond_3
    invoke-virtual {v10, v11}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_3

    :cond_5
    if-ne v12, v6, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v10}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v9

    goto :goto_2

    :cond_7
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LE0/G;->k0()LE0/a0;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_0

    :cond_9
    move-object v8, v5

    goto :goto_0

    :cond_a
    move-object v9, v5

    :goto_5
    check-cast v9, LA0/a;

    goto :goto_6

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    move-object v9, v5

    :goto_6
    if-eqz v9, :cond_2e

    invoke-static {v2}, LE0/e0;->a(I)I

    move-result v0

    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v2

    if-eqz v2, :cond_2d

    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    invoke-static {v9}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object v2

    move-object v7, v5

    :goto_7
    if-eqz v2, :cond_18

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v8

    invoke-virtual {v8}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->a2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_16

    :goto_8
    if-eqz v1, :cond_16

    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_15

    move-object v8, v1

    move-object v10, v5

    :goto_9
    if-eqz v8, :cond_15

    instance-of v11, v8, LA0/a;

    if-eqz v11, :cond_e

    if-nez v7, :cond_d

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_e
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v0

    if-eqz v11, :cond_14

    instance-of v11, v8, LE0/m;

    if-eqz v11, :cond_14

    move-object v11, v8

    check-cast v11, LE0/m;

    invoke-virtual {v11}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v11

    move v12, v4

    :goto_a
    if-eqz v11, :cond_13

    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->f2()I

    move-result v13

    and-int/2addr v13, v0

    if-eqz v13, :cond_12

    add-int/lit8 v12, v12, 0x1

    if-ne v12, v6, :cond_f

    move-object v8, v11

    goto :goto_b

    :cond_f
    if-nez v10, :cond_10

    new-instance v10, LV/b;

    new-array v13, v3, [Landroidx/compose/ui/e$c;

    invoke-direct {v10, v13, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_10
    if-eqz v8, :cond_11

    invoke-virtual {v10, v8}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v8, v5

    :cond_11
    invoke-virtual {v10, v11}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_12
    :goto_b
    invoke-virtual {v11}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v11

    goto :goto_a

    :cond_13
    if-ne v12, v6, :cond_14

    goto :goto_9

    :cond_14
    :goto_c
    invoke-static {v10}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_9

    :cond_15
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_8

    :cond_16
    invoke-virtual {v2}, LE0/G;->o0()LE0/G;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, LE0/G;->k0()LE0/a0;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v1}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v1

    goto/16 :goto_7

    :cond_17
    move-object v1, v5

    goto/16 :goto_7

    :cond_18
    if-eqz v7, :cond_1b

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_1b

    :goto_d
    add-int/lit8 v2, v1, -0x1

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA0/a;

    invoke-interface {v1, p1}, LA0/a;->J0(LA0/b;)Z

    move-result v1

    if-eqz v1, :cond_19

    return v6

    :cond_19
    if-gez v2, :cond_1a

    goto :goto_e

    :cond_1a
    move v1, v2

    goto :goto_d

    :cond_1b
    :goto_e
    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    move-object v2, v5

    :goto_f
    if-eqz v1, :cond_23

    instance-of v8, v1, LA0/a;

    if-eqz v8, :cond_1c

    check-cast v1, LA0/a;

    invoke-interface {v1, p1}, LA0/a;->J0(LA0/b;)Z

    move-result v1

    if-eqz v1, :cond_22

    return v6

    :cond_1c
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_22

    instance-of v8, v1, LE0/m;

    if-eqz v8, :cond_22

    move-object v8, v1

    check-cast v8, LE0/m;

    invoke-virtual {v8}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v8

    move v10, v4

    :goto_10
    if-eqz v8, :cond_21

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->f2()I

    move-result v11

    and-int/2addr v11, v0

    if-eqz v11, :cond_20

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v6, :cond_1d

    move-object v1, v8

    goto :goto_11

    :cond_1d
    if-nez v2, :cond_1e

    new-instance v2, LV/b;

    new-array v11, v3, [Landroidx/compose/ui/e$c;

    invoke-direct {v2, v11, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_1e
    if-eqz v1, :cond_1f

    invoke-virtual {v2, v1}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v1, v5

    :cond_1f
    invoke-virtual {v2, v8}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_20
    :goto_11
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_10

    :cond_21
    if-ne v10, v6, :cond_22

    goto :goto_f

    :cond_22
    invoke-static {v2}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_f

    :cond_23
    invoke-interface {v9}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v1

    move-object v2, v5

    :goto_12
    if-eqz v1, :cond_2b

    instance-of v8, v1, LA0/a;

    if-eqz v8, :cond_24

    check-cast v1, LA0/a;

    invoke-interface {v1, p1}, LA0/a;->Y0(LA0/b;)Z

    move-result v1

    if-eqz v1, :cond_2a

    return v6

    :cond_24
    invoke-virtual {v1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_2a

    instance-of v8, v1, LE0/m;

    if-eqz v8, :cond_2a

    move-object v8, v1

    check-cast v8, LE0/m;

    invoke-virtual {v8}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v8

    move v9, v4

    :goto_13
    if-eqz v8, :cond_29

    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v0

    if-eqz v10, :cond_28

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v6, :cond_25

    move-object v1, v8

    goto :goto_14

    :cond_25
    if-nez v2, :cond_26

    new-instance v2, LV/b;

    new-array v10, v3, [Landroidx/compose/ui/e$c;

    invoke-direct {v2, v10, v4}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_26
    if-eqz v1, :cond_27

    invoke-virtual {v2, v1}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v1, v5

    :cond_27
    invoke-virtual {v2, v8}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_28
    :goto_14
    invoke-virtual {v8}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v8

    goto :goto_13

    :cond_29
    if-ne v9, v6, :cond_2a

    goto :goto_12

    :cond_2a
    invoke-static {v2}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v1

    goto :goto_12

    :cond_2b
    if-eqz v7, :cond_2e

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    move v1, v4

    :goto_15
    if-ge v1, v0, :cond_2e

    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA0/a;

    invoke-interface {v2, p1}, LA0/a;->Y0(LA0/b;)Z

    move-result v2

    if-eqz v2, :cond_2c

    return v6

    :cond_2c
    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    return v4

    :cond_2f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Dispatching rotary event while focus system is invalidated."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public m(Landroid/view/KeyEvent;)Z
    .locals 10

    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {p1}, Lk0/d;->b()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string p1, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v0

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {p1}, Landroidx/compose/ui/focus/t;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object p1

    if-eqz p1, :cond_c

    const/high16 v1, 0x20000

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p1}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-static {p1}, LE0/k;->m(LE0/j;)LE0/G;

    move-result-object p1

    :goto_0
    const/4 v3, 0x0

    if-eqz p1, :cond_a

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object v4

    invoke-virtual {v4}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->a2()I

    move-result v4

    and-int/2addr v4, v1

    if-eqz v4, :cond_8

    :goto_1
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v1

    if-eqz v4, :cond_7

    move-object v4, v2

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_6

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_6

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    move v7, v0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v4, v6

    goto :goto_4

    :cond_1
    if-nez v5, :cond_2

    new-instance v5, LV/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v8, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_3
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_7
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, LE0/G;->o0()LE0/G;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LE0/G;->k0()LE0/a0;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_0

    :cond_9
    move-object v2, v3

    goto :goto_0

    :cond_a
    invoke-static {v3}, Lf/d;->a(Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "visitAncestors called on an unattached node"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_5
    return v0
.end method

.method public n()V
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->g()Lk0/q;

    move-result-object v0

    invoke-static {v0}, Lk0/q;->e(Lk0/q;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0, v2, v2}, Landroidx/compose/ui/focus/s;->c(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v0}, Lk0/q;->a(Lk0/q;)V

    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v1, v2, v2}, Landroidx/compose/ui/focus/s;->c(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lk0/q;->c(Lk0/q;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    invoke-static {v0}, Lk0/q;->c(Lk0/q;)V

    throw v1
.end method

.method public o(Lk0/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->g:Lk0/d;

    invoke-virtual {v0, p1}, Lk0/d;->f(Lk0/h;)V

    return-void
.end method

.method public p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/t;->b(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->e:Lmh/a;

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/t;

    invoke-static {v0, p1, v2}, Landroidx/compose/ui/focus/t;->a(Landroidx/compose/ui/focus/FocusTargetNode;ILY0/t;)Landroidx/compose/ui/focus/o;

    move-result-object v2

    sget-object v3, Landroidx/compose/ui/focus/o;->b:Landroidx/compose/ui/focus/o$a;

    invoke-virtual {v3}, Landroidx/compose/ui/focus/o$a;->a()Landroidx/compose/ui/focus/o;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/focus/o$a;->b()Landroidx/compose/ui/focus/o;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v2, p3}, Landroidx/compose/ui/focus/o;->c(Lmh/l;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    move-object v0, v1

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->e:Lmh/a;

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/t;

    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$d;

    invoke-direct {v3, v0, p0, p3}, Landroidx/compose/ui/focus/FocusOwnerImpl$d;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;Lmh/l;)V

    invoke-static {v1, p1, v2, p2, v3}, Landroidx/compose/ui/focus/t;->e(Landroidx/compose/ui/focus/FocusTargetNode;ILY0/t;Ll0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public q(Landroidx/compose/ui/focus/d;Ll0/i;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->a:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public r(Z)V
    .locals 2

    sget-object v0, Landroidx/compose/ui/focus/d;->b:Landroidx/compose/ui/focus/d$a;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/d$a;->c()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->e(ZZZI)Z

    return-void
.end method

.method public final t()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->f:Landroidx/compose/ui/focus/FocusTargetNode;

    return-object v0
.end method

.method public w(ILl0/i;)Z
    .locals 1

    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$g;

    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$g;-><init>(I)V

    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->p(ILl0/i;Lmh/l;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
