.class final Landroidx/compose/foundation/f;
.super Landroidx/compose/foundation/a;
.source "SourceFile"

# interfaces
.implements LE0/s0;


# instance fields
.field private J:Ljava/lang/String;

.field private N:Lmh/a;

.field private X:Lmh/a;


# direct methods
.method private constructor <init>(Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;)V
    .locals 9

    move-object v8, p0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p5

    move-object v2, p6

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object v6, p1

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p2

    .line 3
    iput-object v0, v8, Landroidx/compose/foundation/f;->J:Ljava/lang/String;

    move-object v0, p3

    .line 4
    iput-object v0, v8, Landroidx/compose/foundation/f;->N:Lmh/a;

    move-object v0, p4

    .line 5
    iput-object v0, v8, Landroidx/compose/foundation/f;->X:Lmh/a;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Landroidx/compose/foundation/f;-><init>(Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;)V

    return-void
.end method

.method public static final synthetic c3(Landroidx/compose/foundation/f;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/f;->X:Lmh/a;

    return-object p0
.end method

.method public static final synthetic d3(Landroidx/compose/foundation/f;)Lmh/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/f;->N:Lmh/a;

    return-object p0
.end method


# virtual methods
.method public P2(LJ0/w;)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/f;->N:Lmh/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/f;->J:Ljava/lang/String;

    new-instance v1, Landroidx/compose/foundation/f$a;

    invoke-direct {v1, p0}, Landroidx/compose/foundation/f$a;-><init>(Landroidx/compose/foundation/f;)V

    invoke-static {p1, v0, v1}, LJ0/t;->D(LJ0/w;Ljava/lang/String;Lmh/a;)V

    :cond_0
    return-void
.end method

.method public Q2(Ly0/G;Ldh/e;)Ljava/lang/Object;
    .locals 8

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->V2()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/f;->X:Lmh/a;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/f$b;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$b;-><init>(Landroidx/compose/foundation/f;)V

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->V2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/f;->N:Lmh/a;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/compose/foundation/f$c;

    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$c;-><init>(Landroidx/compose/foundation/f;)V

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    new-instance v5, Landroidx/compose/foundation/f$d;

    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/f$d;-><init>(Landroidx/compose/foundation/f;Ldh/e;)V

    new-instance v6, Landroidx/compose/foundation/f$e;

    invoke-direct {v6, p0}, Landroidx/compose/foundation/f$e;-><init>(Landroidx/compose/foundation/f;)V

    move-object v2, p1

    move-object v7, p2

    invoke-static/range {v2 .. v7}, Lw/B;->j(Ly0/G;Lmh/l;Lmh/l;Lmh/q;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public e3(Lmh/a;Ljava/lang/String;Lmh/a;Lmh/a;Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;)V
    .locals 9

    move-object v7, p0

    move-object v0, p2

    move-object v1, p3

    move-object v2, p4

    iget-object v3, v7, Landroidx/compose/foundation/f;->J:Ljava/lang/String;

    invoke-static {v3, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v0, v7, Landroidx/compose/foundation/f;->J:Ljava/lang/String;

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    :cond_0
    iget-object v0, v7, Landroidx/compose/foundation/f;->N:Lmh/a;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v4

    :goto_0
    if-nez v1, :cond_2

    move v5, v3

    goto :goto_1

    :cond_2
    move v5, v4

    :goto_1
    if-eq v0, v5, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->S2()V

    invoke-static {p0}, LE0/w0;->b(LE0/v0;)V

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v4

    :goto_2
    iput-object v1, v7, Landroidx/compose/foundation/f;->N:Lmh/a;

    iget-object v1, v7, Landroidx/compose/foundation/f;->X:Lmh/a;

    if-nez v1, :cond_4

    move v1, v3

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    if-nez v2, :cond_5

    move v4, v3

    :cond_5
    if-eq v1, v4, :cond_6

    move v0, v3

    :cond_6
    iput-object v2, v7, Landroidx/compose/foundation/f;->X:Lmh/a;

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->V2()Z

    move-result v1

    move/from16 v4, p7

    if-eq v1, v4, :cond_7

    move v8, v3

    goto :goto_4

    :cond_7
    move v8, v0

    :goto_4
    move-object v0, p0

    move-object v1, p5

    move-object v2, p6

    move/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/compose/foundation/a;->b3(Ly/m;Ls/I;ZLjava/lang/String;LJ0/g;Lmh/a;)V

    if-eqz v8, :cond_8

    invoke-virtual {p0}, Landroidx/compose/foundation/a;->Z2()LYg/J;

    :cond_8
    return-void
.end method
