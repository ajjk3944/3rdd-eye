.class public final Landroidx/compose/foundation/gestures/c;
.super Landroidx/compose/foundation/gestures/b;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Lmh/q;

.field private C:Lmh/q;

.field private D:Z

.field private y:Lw/m;

.field private z:Lw/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lw/m;Lmh/l;Lw/q;ZLy/m;ZLmh/q;Lmh/q;Z)V
    .locals 0

    invoke-direct {p0, p2, p4, p5, p3}, Landroidx/compose/foundation/gestures/b;-><init>(Lmh/l;ZLy/m;Lw/q;)V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/c;->y:Lw/m;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/c;->z:Lw/q;

    iput-boolean p6, p0, Landroidx/compose/foundation/gestures/c;->A:Z

    iput-object p7, p0, Landroidx/compose/foundation/gestures/c;->B:Lmh/q;

    iput-object p8, p0, Landroidx/compose/foundation/gestures/c;->C:Lmh/q;

    iput-boolean p9, p0, Landroidx/compose/foundation/gestures/c;->D:Z

    return-void
.end method

.method public static final synthetic e3(Landroidx/compose/foundation/gestures/c;)Lmh/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->B:Lmh/q;

    return-object p0
.end method

.method public static final synthetic f3(Landroidx/compose/foundation/gestures/c;)Lmh/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->C:Lmh/q;

    return-object p0
.end method

.method public static final synthetic g3(Landroidx/compose/foundation/gestures/c;)Lw/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/c;->z:Lw/q;

    return-object p0
.end method

.method public static final synthetic h3(Landroidx/compose/foundation/gestures/c;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/c;->j3(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic i3(Landroidx/compose/foundation/gestures/c;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/c;->k3(J)J

    move-result-wide p0

    return-wide p0
.end method

.method private final j3(J)J
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->D:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    invoke-static {p1, p2, v0}, LY0/y;->m(JF)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :goto_1
    return-wide p1
.end method

.method private final k3(J)J
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->D:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    invoke-static {p1, p2, v0}, Ll0/g;->s(JF)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :goto_1
    return-wide p1
.end method


# virtual methods
.method public S2(Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->y:Lw/m;

    sget-object v1, Ls/L;->UserInput:Ls/L;

    new-instance v2, Landroidx/compose/foundation/gestures/c$a;

    const/4 v3, 0x0

    invoke-direct {v2, p1, p0, v3}, Landroidx/compose/foundation/gestures/c$a;-><init>(Lmh/p;Landroidx/compose/foundation/gestures/c;Ldh/e;)V

    invoke-interface {v0, v1, v2, p2}, Lw/m;->a(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public W2(J)V
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->B:Lmh/q;

    invoke-static {}, Lw/l;->b()Lmh/q;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/c$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/c$b;-><init>(Landroidx/compose/foundation/gestures/c;JLdh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    :goto_0
    return-void
.end method

.method public X2(J)V
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c;->C:Lmh/q;

    invoke-static {}, Lw/l;->c()Lmh/q;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/c$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/c$c;-><init>(Landroidx/compose/foundation/gestures/c;JLdh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_1
    :goto_0
    return-void
.end method

.method public b3()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/c;->A:Z

    return v0
.end method

.method public final l3(Lw/m;Lmh/l;Lw/q;ZLy/m;ZLmh/q;Lmh/q;Z)V
    .locals 7

    move-object v6, p0

    move-object v0, p1

    move-object v4, p3

    move/from16 v1, p9

    iget-object v2, v6, Landroidx/compose/foundation/gestures/c;->y:Lw/m;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_0

    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->y:Lw/m;

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, v6, Landroidx/compose/foundation/gestures/c;->z:Lw/q;

    if-eq v2, v4, :cond_1

    iput-object v4, v6, Landroidx/compose/foundation/gestures/c;->z:Lw/q;

    move v0, v3

    :cond_1
    iget-boolean v2, v6, Landroidx/compose/foundation/gestures/c;->D:Z

    if-eq v2, v1, :cond_2

    iput-boolean v1, v6, Landroidx/compose/foundation/gestures/c;->D:Z

    move-object v0, p7

    move v5, v3

    goto :goto_1

    :cond_2
    move v5, v0

    move-object v0, p7

    :goto_1
    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->B:Lmh/q;

    move-object v0, p8

    iput-object v0, v6, Landroidx/compose/foundation/gestures/c;->C:Lmh/q;

    move v0, p6

    iput-boolean v0, v6, Landroidx/compose/foundation/gestures/c;->A:Z

    move-object v0, p0

    move-object v1, p2

    move v2, p4

    move-object v3, p5

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/gestures/b;->d3(Lmh/l;ZLy/m;Lw/q;Z)V

    return-void
.end method
