.class public final Lbj/F;
.super LYi/b;
.source "SourceFile"

# interfaces
.implements Laj/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/F$a;
    }
.end annotation


# instance fields
.field private final a:Lbj/h;

.field private final b:Laj/b;

.field private final c:Lbj/M;

.field private final d:[Laj/t;

.field private final e:Lcj/e;

.field private final f:Laj/g;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbj/h;Laj/b;Lbj/M;[Laj/t;)V
    .locals 1

    const-string v0, "composer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LYi/b;-><init>()V

    .line 2
    iput-object p1, p0, Lbj/F;->a:Lbj/h;

    .line 3
    iput-object p2, p0, Lbj/F;->b:Laj/b;

    .line 4
    iput-object p3, p0, Lbj/F;->c:Lbj/M;

    .line 5
    iput-object p4, p0, Lbj/F;->d:[Laj/t;

    .line 6
    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object p1

    invoke-virtual {p1}, Laj/b;->a()Lcj/e;

    move-result-object p1

    iput-object p1, p0, Lbj/F;->e:Lcj/e;

    .line 7
    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object p1

    invoke-virtual {p1}, Laj/b;->e()Laj/g;

    move-result-object p1

    iput-object p1, p0, Lbj/F;->f:Laj/g;

    .line 8
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p4, :cond_1

    .line 9
    aget-object p2, p4, p1

    if-nez p2, :cond_0

    if-eq p2, p0, :cond_1

    .line 10
    :cond_0
    aput-object p0, p4, p1

    :cond_1
    return-void
.end method

.method public constructor <init>(Lbj/o;Laj/b;Lbj/M;[Laj/t;)V
    .locals 1

    const-string v0, "output"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modeReuseCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-static {p1, p2}, Lbj/l;->a(Lbj/o;Laj/b;)Lbj/h;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3, p4}, Lbj/F;-><init>(Lbj/h;Laj/b;Lbj/M;[Laj/t;)V

    return-void
.end method

.method private final J(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0}, Lbj/h;->c()V

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    const/16 v0, 0x3a

    invoke-virtual {p1, v0}, Lbj/h;->f(C)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->p()V

    invoke-virtual {p0, p2}, Lbj/F;->G(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A(I)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->i(I)V

    :goto_0
    return-void
.end method

.method public B(LXi/f;)LYi/f;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbj/G;->b(LXi/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    instance-of v0, p1, Lbj/j;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lbj/h;->a:Lbj/o;

    iget-boolean v0, p0, Lbj/F;->g:Z

    new-instance v2, Lbj/j;

    invoke-direct {v2, p1, v0}, Lbj/j;-><init>(Lbj/o;Z)V

    move-object p1, v2

    :goto_0
    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object v0

    iget-object v2, p0, Lbj/F;->c:Lbj/M;

    new-instance v3, Lbj/F;

    invoke-direct {v3, p1, v0, v2, v1}, Lbj/F;-><init>(Lbj/h;Laj/b;Lbj/M;[Laj/t;)V

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lbj/G;->a(LXi/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    instance-of v0, p1, Lbj/i;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lbj/h;->a:Lbj/o;

    iget-boolean v0, p0, Lbj/F;->g:Z

    new-instance v2, Lbj/i;

    invoke-direct {v2, p1, v0}, Lbj/i;-><init>(Lbj/o;Z)V

    move-object p1, v2

    :goto_1
    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object v0

    iget-object v2, p0, Lbj/F;->c:Lbj/M;

    new-instance v3, Lbj/F;

    invoke-direct {v3, p1, v0, v2, v1}, Lbj/F;-><init>(Lbj/h;Laj/b;Lbj/M;[Laj/t;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lbj/F;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-interface {p1}, LXi/f;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbj/F;->i:Ljava/lang/String;

    move-object v3, p0

    goto :goto_2

    :cond_4
    invoke-super {p0, p1}, LYi/b;->B(LXi/f;)LYi/f;

    move-result-object v3

    :goto_2
    return-object v3
.end method

.method public D(LXi/f;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LXi/f;->f(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    return-void
.end method

.method public E(J)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1, p2}, Lbj/h;->j(J)V

    :goto_0
    return-void
.end method

.method public G(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->n(Ljava/lang/String;)V

    return-void
.end method

.method public H(LXi/f;I)Z
    .locals 6

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbj/F;->c:Lbj/M;

    sget-object v1, Lbj/F$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/16 v1, 0x2c

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    const/16 v3, 0x3a

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v0, v5, :cond_3

    const/4 v5, 0x3

    if-eq v0, v5, :cond_1

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0}, Lbj/h;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, v1}, Lbj/h;->f(C)V

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0}, Lbj/h;->c()V

    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lbj/t;->h(LXi/f;Laj/b;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1, v3}, Lbj/h;->f(C)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->p()V

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    iput-boolean v2, p0, Lbj/F;->g:Z

    :cond_2
    if-ne p2, v2, :cond_8

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1, v1}, Lbj/h;->f(C)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->p()V

    iput-boolean v4, p0, Lbj/F;->g:Z

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->a()Z

    move-result p1

    if-nez p1, :cond_5

    rem-int/2addr p2, v5

    if-nez p2, :cond_4

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1, v1}, Lbj/h;->f(C)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->c()V

    move v4, v2

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1, v3}, Lbj/h;->f(C)V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->p()V

    :goto_0
    iput-boolean v4, p0, Lbj/F;->g:Z

    goto :goto_1

    :cond_5
    iput-boolean v2, p0, Lbj/F;->g:Z

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->c()V

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->a()Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1, v1}, Lbj/h;->f(C)V

    :cond_7
    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->c()V

    :cond_8
    :goto_1
    return v2
.end method

.method public a()Lcj/e;
    .locals 1

    iget-object v0, p0, Lbj/F;->e:Lcj/e;

    return-object v0
.end method

.method public b(LXi/f;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbj/F;->c:Lbj/M;

    iget-char p1, p1, Lbj/M;->end:C

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->q()V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p1}, Lbj/h;->d()V

    iget-object p1, p0, Lbj/F;->a:Lbj/h;

    iget-object v0, p0, Lbj/F;->c:Lbj/M;

    iget-char v0, v0, Lbj/M;->end:C

    invoke-virtual {p1, v0}, Lbj/h;->f(C)V

    :cond_0
    return-void
.end method

.method public c(LXi/f;)LYi/d;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object v0

    invoke-static {v0, p1}, Lbj/N;->b(Laj/b;LXi/f;)Lbj/M;

    move-result-object v0

    iget-char v1, v0, Lbj/M;->begin:C

    if-eqz v1, :cond_0

    iget-object v2, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v2, v1}, Lbj/h;->f(C)V

    iget-object v1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v1}, Lbj/h;->b()V

    :cond_0
    iget-object v1, p0, Lbj/F;->h:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lbj/F;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    invoke-interface {p1}, LXi/f;->a()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-direct {p0, v1, v2}, Lbj/F;->J(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lbj/F;->h:Ljava/lang/String;

    iput-object p1, p0, Lbj/F;->i:Ljava/lang/String;

    :cond_2
    iget-object p1, p0, Lbj/F;->c:Lbj/M;

    if-ne p1, v0, :cond_3

    return-object p0

    :cond_3
    iget-object p1, p0, Lbj/F;->d:[Laj/t;

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget-object p1, p1, v1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Lbj/F;

    iget-object v1, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {p0}, Lbj/F;->d()Laj/b;

    move-result-object v2

    iget-object v3, p0, Lbj/F;->d:[Laj/t;

    invoke-direct {p1, v1, v2, v0, v3}, Lbj/F;-><init>(Lbj/h;Laj/b;Lbj/M;[Laj/t;)V

    :goto_0
    return-object p1
.end method

.method public d()Laj/b;
    .locals 1

    iget-object v0, p0, Lbj/F;->b:Laj/b;

    return-object v0
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Lbj/h;->k(Ljava/lang/String;)V

    return-void
.end method

.method public j(D)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1, p2}, Lbj/h;->g(D)V

    :goto_0
    iget-object v0, p0, Lbj/F;->f:Laj/g;

    invoke-virtual {v0}, Laj/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iget-object p2, p0, Lbj/F;->a:Lbj/h;

    iget-object p2, p2, Lbj/h;->a:Lbj/o;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lbj/r;->b(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public k(S)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->l(S)V

    :goto_0
    return-void
.end method

.method public l(B)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->e(B)V

    :goto_0
    return-void
.end method

.method public m(Z)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->m(Z)V

    :goto_0
    return-void
.end method

.method public o(LXi/f;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbj/F;->f:Laj/g;

    invoke-virtual {p1}, Laj/g;->i()Z

    move-result p1

    return p1
.end method

.method public r(F)V
    .locals 1

    iget-boolean v0, p0, Lbj/F;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbj/F;->G(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    invoke-virtual {v0, p1}, Lbj/h;->h(F)V

    :goto_0
    iget-object v0, p0, Lbj/F;->f:Laj/g;

    invoke-virtual {v0}, Laj/g;->b()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, p0, Lbj/F;->a:Lbj/h;

    iget-object v0, v0, Lbj/h;->a:Lbj/o;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lbj/r;->b(Ljava/lang/Number;Ljava/lang/String;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public t(LXi/f;ILVi/o;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    iget-object v0, p0, Lbj/F;->f:Laj/g;

    invoke-virtual {v0}, Laj/g;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, LYi/b;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public u(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbj/F;->G(Ljava/lang/String;)V

    return-void
.end method

.method public z(LVi/o;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Laj/t;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0}, Laj/b;->e()Laj/g;

    move-result-object v0

    invoke-virtual {v0}, Laj/g;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    instance-of v0, p1, LZi/b;

    if-eqz v0, :cond_1

    invoke-interface {p0}, Laj/t;->d()Laj/b;

    move-result-object v1

    invoke-virtual {v1}, Laj/b;->e()Laj/g;

    move-result-object v1

    invoke-virtual {v1}, Laj/g;->f()Laj/a;

    move-result-object v1

    sget-object v2, Laj/a;->NONE:Laj/a;

    if-eq v1, v2, :cond_4

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Laj/t;->d()Laj/b;

    move-result-object v1

    invoke-virtual {v1}, Laj/b;->e()Laj/g;

    move-result-object v1

    invoke-virtual {v1}, Laj/g;->f()Laj/a;

    move-result-object v1

    sget-object v2, Lbj/D$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LVi/o;->a()LXi/f;

    move-result-object v1

    invoke-interface {v1}, LXi/f;->h()LXi/m;

    move-result-object v1

    sget-object v2, LXi/n$a;->a:LXi/n$a;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, LXi/n$d;->a:LXi/n$d;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_2
    :goto_0
    invoke-interface {p1}, LVi/o;->a()LXi/f;

    move-result-object v1

    invoke-interface {p0}, Laj/t;->d()Laj/b;

    move-result-object v2

    invoke-static {v1, v2}, Lbj/D;->c(LXi/f;Laj/b;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, LZi/b;

    if-eqz p2, :cond_6

    invoke-static {v0, p0, p2}, LVi/g;->b(LZi/b;LYi/f;Ljava/lang/Object;)LVi/o;

    move-result-object v0

    if-eqz v1, :cond_5

    invoke-static {p1, v0, v1}, Lbj/D;->a(LVi/o;LVi/o;Ljava/lang/String;)V

    invoke-interface {v0}, LVi/o;->a()LXi/f;

    move-result-object p1

    invoke-interface {p1}, LXi/f;->h()LXi/m;

    move-result-object p1

    invoke-static {p1}, Lbj/D;->b(LXi/m;)V

    :cond_5
    const-string p1, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, v0

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Value for serializer "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, LVi/b;->a()LXi/f;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " should always be non-null. Please report issue to the kotlinx.serialization tracker."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_2
    if-eqz v1, :cond_8

    invoke-interface {p1}, LVi/o;->a()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v1, p0, Lbj/F;->h:Ljava/lang/String;

    iput-object v0, p0, Lbj/F;->i:Ljava/lang/String;

    :cond_8
    invoke-interface {p1, p0, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    :goto_3
    return-void
.end method
