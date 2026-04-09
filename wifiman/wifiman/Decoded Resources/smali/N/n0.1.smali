.class public final LN/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/n0$a;,
        LN/n0$b;
    }
.end annotation


# static fields
.field public static final d:LN/n0$a;

.field public static final e:I


# instance fields
.field private final a:Lr/i;

.field private final b:Z

.field private final c:LN/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/n0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/n0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/n0;->d:LN/n0$a;

    const/16 v0, 0x8

    sput v0, LN/n0;->e:I

    return-void
.end method

.method public constructor <init>(LN/o0;LY0/d;Lmh/l;Lr/i;Z)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, LN/n0;->a:Lr/i;

    iput-boolean p5, p0, LN/n0;->b:Z

    new-instance v6, LN/b;

    new-instance v2, LN/n0$c;

    invoke-direct {v2, p2}, LN/n0$c;-><init>(LY0/d;)V

    new-instance v3, LN/n0$d;

    invoke-direct {v3, p2}, LN/n0$d;-><init>(LY0/d;)V

    move-object v0, v6

    move-object v1, p1

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V

    iput-object v6, p0, LN/n0;->c:LN/b;

    if-eqz p5, :cond_1

    sget-object p2, LN/o0;->HalfExpanded:LN/o0;

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic b(LN/n0;LN/o0;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    iget-object p2, p0, LN/n0;->c:LN/b;

    invoke-virtual {p2}, LN/b;->v()F

    move-result p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LN/n0;->a(LN/o0;FLdh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LN/o0;FLdh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-static {v0, p1, p2, p3}, Landroidx/compose/material/a;->f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final c(Ldh/e;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    sget-object v2, LN/o0;->Expanded:LN/o0;

    invoke-interface {v0, v2}, LN/D;->f(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, LN/n0;->b(LN/n0;LN/o0;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final d()LN/b;
    .locals 1

    iget-object v0, p0, LN/n0;->c:LN/b;

    return-object v0
.end method

.method public final e()LN/o0;
    .locals 1

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/o0;

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    sget-object v1, LN/o0;->HalfExpanded:LN/o0;

    invoke-interface {v0, v1}, LN/D;->f(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g()LN/o0;
    .locals 1

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->x()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/o0;

    return-object v0
.end method

.method public final h(Ldh/e;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p0}, LN/n0;->f()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    sget-object v1, LN/o0;->HalfExpanded:LN/o0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LN/n0;->b(LN/n0;LN/o0;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final i(Ldh/e;)Ljava/lang/Object;
    .locals 6

    sget-object v1, LN/o0;->Hidden:LN/o0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LN/n0;->b(LN/n0;LN/o0;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, LN/n0;->b:Z

    return v0
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LN/o0;->Hidden:LN/o0;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final l(Ldh/e;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LN/n0;->c:LN/b;

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    sget-object v1, LN/o0;->Expanded:LN/o0;

    invoke-interface {v0, v1}, LN/D;->f(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, LN/n0;->e()LN/o0;

    move-result-object v2

    sget-object v3, LN/n0$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    invoke-virtual {p0}, LN/n0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v1, LN/o0;->HalfExpanded:LN/o0;

    :cond_0
    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, LN/o0;->Hidden:LN/o0;

    goto :goto_0

    :goto_1
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    move-object v5, p1

    invoke-static/range {v2 .. v7}, LN/n0;->b(LN/n0;LN/o0;FLdh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
