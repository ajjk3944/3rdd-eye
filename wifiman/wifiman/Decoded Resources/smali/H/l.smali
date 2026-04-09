.class public final LH/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH/l$a;,
        LH/l$b;,
        LH/l$c;
    }
.end annotation


# instance fields
.field private final a:LH/p;

.field private b:LI/I;

.field private final c:LT/q0;

.field private final d:LT/q0;

.field private final e:LH/r;

.field private final f:LV/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;J)V
    .locals 6

    .line 17
    new-instance v4, LH/p;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {v4, v0, v0, v1, v0}, LH/p;-><init>(LK/d;LK/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, LH/l;-><init>(Ljava/lang/String;JLH/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 14
    const-string p1, ""

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    invoke-static {p2}, LL0/T;->a(I)J

    move-result-wide p2

    :cond_1
    const/4 p4, 0x0

    .line 16
    invoke-direct {p0, p1, p2, p3, p4}, LH/l;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;JLH/p;)V
    .locals 11

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p4, p0, LH/l;->a:LH/p;

    .line 5
    new-instance p4, LI/I;

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p2, p3, v1, v0}, LL0/T;->c(JII)J

    move-result-wide v2

    const/4 v0, 0x0

    .line 7
    invoke-direct {p4, p1, v2, v3, v0}, LI/I;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p4, p0, LH/l;->b:LI/I;

    .line 8
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-static {p4, v0, v2, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p4

    iput-object p4, p0, LH/l;->c:LT/q0;

    .line 9
    new-instance p4, LH/h;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p4

    move-object v4, p1

    move-wide v5, p2

    invoke-direct/range {v3 .. v10}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    invoke-static {p4, v0, v2, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LH/l;->d:LT/q0;

    .line 11
    new-instance p1, LH/r;

    invoke-direct {p1, p0}, LH/r;-><init>(LH/l;)V

    iput-object p1, p0, LH/l;->e:LH/r;

    .line 12
    new-instance p1, LV/b;

    const/16 p2, 0x10

    new-array p2, p2, [LH/l$a;

    invoke-direct {p1, p2, v1}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 13
    iput-object p1, p0, LH/l;->f:LV/b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLH/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LH/l;-><init>(Ljava/lang/String;JLH/p;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LH/l;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic a(LH/l;LH/b;ZLK/c;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LH/l;->e(LH/b;ZLK/c;)V

    return-void
.end method

.method public static final synthetic b(LH/l;LH/h;LH/h;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LH/l;->t(LH/h;LH/h;Z)V

    return-void
.end method

.method private final e(LH/b;ZLK/c;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual/range {p0 .. p0}, LH/l;->l()LH/h;

    move-result-object v11

    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->f()LI/m;

    move-result-object v4

    invoke-virtual {v4}, LI/m;->a()I

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v11}, LH/h;->f()J

    move-result-wide v4

    iget-object v6, v0, LH/l;->b:LI/I;

    invoke-virtual {v6}, LI/I;->m()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, LL0/S;->g(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v11}, LH/h;->c()LL0/S;

    move-result-object v1

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->g()LL0/S;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v11}, LH/h;->d()LYg/s;

    move-result-object v1

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->k()LYg/s;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, LH/l;->l()LH/h;

    move-result-object v1

    new-instance v10, LH/h;

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->m()J

    move-result-wide v5

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->g()LL0/S;

    move-result-object v7

    iget-object v3, v0, LH/l;->b:LI/I;

    invoke-virtual {v3}, LI/I;->k()LYg/s;

    move-result-object v8

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v10, v2}, LH/l;->t(LH/h;LH/h;Z)V

    :cond_1
    return-void

    :cond_2
    new-instance v10, LH/h;

    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->toString()Ljava/lang/String;

    move-result-object v13

    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->m()J

    move-result-wide v14

    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->g()LL0/S;

    move-result-object v16

    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->k()LYg/s;

    move-result-object v17

    const/16 v18, 0x0

    move-object v12, v10

    invoke-direct/range {v12 .. v18}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez v1, :cond_3

    invoke-direct {v0, v11, v10, v2}, LH/l;->t(LH/h;LH/h;Z)V

    iget-object v1, v0, LH/l;->b:LI/I;

    invoke-virtual {v1}, LI/I;->f()LI/m;

    move-result-object v1

    invoke-direct {v0, v11, v10, v1, v3}, LH/l;->n(LH/h;LH/h;LH/f$a;LK/c;)V

    return-void

    :cond_3
    iget-object v4, v0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->f()LI/m;

    move-result-object v6

    new-instance v15, LH/f;

    const/16 v9, 0x8

    const/4 v12, 0x0

    const/4 v8, 0x0

    move-object v4, v15

    move-object v5, v10

    move-object v7, v11

    move-object v13, v10

    move-object v10, v12

    invoke-direct/range {v4 .. v10}, LH/f;-><init>(LH/h;LI/m;LH/h;LI/S0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v15}, LH/b;->a(LH/f;)V

    invoke-virtual {v15}, LH/f;->a()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1, v13}, Lkotlin/text/t;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/lit8 v4, v1, 0x1

    invoke-virtual {v15}, LH/f;->e()J

    move-result-wide v5

    invoke-virtual {v13}, LH/h;->f()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, LL0/S;->g(JJ)Z

    move-result v5

    xor-int/lit8 v6, v5, 0x1

    if-eqz v1, :cond_4

    if-nez v5, :cond_5

    :cond_4
    move-object v5, v15

    goto :goto_0

    :cond_5
    invoke-virtual {v13}, LH/h;->c()LL0/S;

    move-result-object v1

    const/16 v16, 0x1

    const/16 v17, 0x0

    const-wide/16 v13, 0x0

    move-object v12, v15

    move-object v5, v15

    move-object v15, v1

    invoke-static/range {v12 .. v17}, LH/f;->m(LH/f;JLL0/S;ILjava/lang/Object;)LH/h;

    move-result-object v1

    invoke-direct {v0, v11, v1, v2}, LH/l;->t(LH/h;LH/h;Z)V

    goto :goto_1

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1, v4, v6}, LH/l;->s(LH/f;LL0/S;ZZ)V

    :goto_1
    invoke-virtual/range {p0 .. p0}, LH/l;->l()LH/h;

    move-result-object v1

    invoke-virtual {v5}, LH/f;->c()LH/f$a;

    move-result-object v2

    invoke-direct {v0, v11, v1, v2, v3}, LH/l;->n(LH/h;LH/h;LH/f$a;LK/c;)V

    return-void
.end method

.method private final m()Z
    .locals 1

    iget-object v0, p0, LH/l;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final n(LH/h;LH/h;LH/f$a;LK/c;)V
    .locals 2

    sget-object v0, LH/l$c;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v0, p4

    const/4 v0, 0x1

    if-eq p4, v0, :cond_2

    const/4 v1, 0x2

    if-eq p4, v1, :cond_1

    const/4 v0, 0x3

    if-eq p4, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p4, p0, LH/l;->a:LH/p;

    const/4 v0, 0x0

    invoke-static {p4, p1, p2, p3, v0}, LH/q;->c(LH/p;LH/h;LH/h;LH/f$a;Z)V

    goto :goto_0

    :cond_1
    iget-object p4, p0, LH/l;->a:LH/p;

    invoke-static {p4, p1, p2, p3, v0}, LH/q;->c(LH/p;LH/h;LH/h;LH/f$a;Z)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LH/l;->a:LH/p;

    invoke-virtual {p1}, LH/p;->c()V

    :goto_0
    return-void
.end method

.method private final p(Z)V
    .locals 1

    iget-object v0, p0, LH/l;->c:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final q(LH/h;)V
    .locals 1

    iget-object v0, p0, LH/l;->d:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final t(LH/h;LH/h;Z)V
    .locals 4

    invoke-direct {p0, p2}, LH/l;->q(LH/h;)V

    invoke-virtual {p0}, LH/l;->f()V

    iget-object v0, p0, LH/l;->f:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LH/l$a;

    invoke-interface {v3, p1, p2, p3}, LH/l$a;->a(LH/h;LH/h;Z)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final c(LH/l$a;)V
    .locals 1

    iget-object v0, p0, LH/l;->f:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d(LH/f;)V
    .locals 6

    invoke-virtual {p1}, LH/f;->c()LH/f$a;

    move-result-object v0

    invoke-interface {v0}, LH/f$a;->a()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, LH/f;->e()J

    move-result-wide v2

    iget-object v4, p0, LH/l;->b:LI/I;

    invoke-virtual {v4}, LI/I;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LL0/S;->g(JJ)Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v0, :cond_1

    iget-object v2, p0, LH/l;->a:LH/p;

    invoke-virtual {v2}, LH/p;->c()V

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2, v0, v1}, LH/l;->s(LH/f;LL0/S;ZZ)V

    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LH/l;->p(Z)V

    return-void
.end method

.method public final g()LI/I;
    .locals 1

    iget-object v0, p0, LH/l;->b:LI/I;

    return-object v0
.end method

.method public final h()J
    .locals 2

    invoke-virtual {p0}, LH/l;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final i()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, LH/l;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->g()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final j()LH/p;
    .locals 1

    iget-object v0, p0, LH/l;->a:LH/p;

    return-object v0
.end method

.method public final k()LH/r;
    .locals 1

    iget-object v0, p0, LH/l;->e:LH/r;

    return-object v0
.end method

.method public final l()LH/h;
    .locals 1

    iget-object v0, p0, LH/l;->d:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH/h;

    return-object v0
.end method

.method public final o(LH/l$a;)V
    .locals 1

    iget-object v0, p0, LH/l;->f:LV/b;

    invoke-virtual {v0, p1}, LV/b;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public final r()LH/f;
    .locals 8

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
    invoke-direct {p0}, LH/l;->m()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    if-nez v4, :cond_1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LH/l;->p(Z)V

    new-instance v0, LH/f;

    invoke-virtual {p0}, LH/l;->l()LH/h;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, LH/f;-><init>(LH/h;LI/m;LH/h;LI/S0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "TextFieldState does not support concurrent or nested editing."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v4

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v4
.end method

.method public final s(LH/f;LL0/S;ZZ)V
    .locals 10

    iget-object v0, p0, LH/l;->b:LI/I;

    invoke-virtual {v0}, LI/I;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v9, LH/h;

    iget-object v1, p0, LH/l;->b:LI/I;

    invoke-virtual {v1}, LI/I;->m()J

    move-result-wide v3

    iget-object v1, p0, LH/l;->b:LI/I;

    invoke-virtual {v1}, LI/I;->g()LL0/S;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, p0, LH/l;->b:LI/I;

    invoke-virtual {v1}, LI/I;->g()LL0/S;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz p3, :cond_0

    new-instance v2, LI/I;

    invoke-virtual {p1}, LH/f;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LH/f;->e()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, LI/I;-><init>(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, LH/l;->b:LI/I;

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    iget-object v2, p0, LH/l;->b:LI/I;

    invoke-virtual {p1}, LH/f;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->n(J)I

    move-result v3

    invoke-virtual {p1}, LH/f;->e()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->i(J)I

    move-result v4

    invoke-virtual {v2, v3, v4}, LI/I;->u(II)V

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, LL0/S;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->h(J)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, LH/l;->b:LI/I;

    invoke-virtual {p2}, LL0/S;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v3

    invoke-virtual {p2}, LL0/S;->r()J

    move-result-wide v4

    invoke-static {v4, v5}, LL0/S;->k(J)I

    move-result p2

    invoke-virtual {v2, v3, p2}, LI/I;->r(II)V

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p2, p0, LH/l;->b:LI/I;

    invoke-virtual {p2}, LI/I;->c()V

    :goto_2
    if-nez p3, :cond_4

    if-nez p4, :cond_5

    if-nez v1, :cond_5

    :cond_4
    iget-object p2, p0, LH/l;->b:LI/I;

    invoke-virtual {p2}, LI/I;->c()V

    :cond_5
    new-instance p2, LH/h;

    if-eqz p3, :cond_6

    invoke-virtual {p1}, LH/f;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_6
    move-object v2, v0

    iget-object p1, p0, LH/l;->b:LI/I;

    invoke-virtual {p1}, LI/I;->m()J

    move-result-wide v3

    iget-object p1, p0, LH/l;->b:LI/I;

    invoke-virtual {p1}, LI/I;->g()LL0/S;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v8}, LH/h;-><init>(Ljava/lang/CharSequence;JLL0/S;LYg/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x1

    invoke-direct {p0, v9, p2, p1}, LH/l;->t(LH/h;LH/h;Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

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
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "TextFieldState(selection="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LH/l;->h()J

    move-result-wide v5

    invoke-static {v5, v6}, LL0/S;->q(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", text=\""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LH/l;->i()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    return-object v4

    :catchall_0
    move-exception v4

    invoke-virtual {v0, v1, v3, v2}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    throw v4
.end method
