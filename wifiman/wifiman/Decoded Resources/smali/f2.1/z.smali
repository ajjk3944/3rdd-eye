.class public final Lf2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf2/y$a;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Z

.field private h:Lth/d;

.field private i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf2/y$a;

    invoke-direct {v0}, Lf2/y$a;-><init>()V

    iput-object v0, p0, Lf2/z;->a:Lf2/y$a;

    const/4 v0, -0x1

    iput v0, p0, Lf2/z;->d:I

    return-void
.end method

.method public static synthetic e(Lf2/z;ILmh/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lf2/z$a;->a:Lf2/z$a;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lf2/z;->c(ILmh/l;)V

    return-void
.end method

.method public static synthetic f(Lf2/z;Ljava/lang/String;Lmh/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lf2/z$b;->a:Lf2/z$b;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lf2/z;->d(Ljava/lang/String;Lmh/l;)V

    return-void
.end method

.method private final i(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lf2/z;->e:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf2/z;->f:Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot pop up to an empty route"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lmh/l;)V
    .locals 2

    const-string v0, "animBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf2/b;

    invoke-direct {v0}, Lf2/b;-><init>()V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lf2/z;->a:Lf2/y$a;

    invoke-virtual {v0}, Lf2/b;->a()I

    move-result v1

    invoke-virtual {p1, v1}, Lf2/y$a;->b(I)Lf2/y$a;

    move-result-object p1

    invoke-virtual {v0}, Lf2/b;->b()I

    move-result v1

    invoke-virtual {p1, v1}, Lf2/y$a;->c(I)Lf2/y$a;

    move-result-object p1

    invoke-virtual {v0}, Lf2/b;->c()I

    move-result v1

    invoke-virtual {p1, v1}, Lf2/y$a;->e(I)Lf2/y$a;

    move-result-object p1

    invoke-virtual {v0}, Lf2/b;->d()I

    move-result v0

    invoke-virtual {p1, v0}, Lf2/y$a;->f(I)Lf2/y$a;

    return-void
.end method

.method public final b()Lf2/y;
    .locals 4

    iget-object v0, p0, Lf2/z;->a:Lf2/y$a;

    iget-boolean v1, p0, Lf2/z;->b:Z

    invoke-virtual {v0, v1}, Lf2/y$a;->d(Z)Lf2/y$a;

    iget-boolean v1, p0, Lf2/z;->c:Z

    invoke-virtual {v0, v1}, Lf2/y$a;->l(Z)Lf2/y$a;

    iget-object v1, p0, Lf2/z;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-boolean v2, p0, Lf2/z;->f:Z

    iget-boolean v3, p0, Lf2/z;->g:Z

    invoke-virtual {v0, v1, v2, v3}, Lf2/y$a;->i(Ljava/lang/String;ZZ)Lf2/y$a;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf2/z;->h:Lth/d;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v2, p0, Lf2/z;->f:Z

    iget-boolean v3, p0, Lf2/z;->g:Z

    invoke-virtual {v0, v1, v2, v3}, Lf2/y$a;->j(Lth/d;ZZ)Lf2/y$a;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lf2/z;->i:Ljava/lang/Object;

    if-eqz v1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-boolean v2, p0, Lf2/z;->f:Z

    iget-boolean v3, p0, Lf2/z;->g:Z

    invoke-virtual {v0, v1, v2, v3}, Lf2/y$a;->h(Ljava/lang/Object;ZZ)Lf2/y$a;

    goto :goto_0

    :cond_2
    iget v1, p0, Lf2/z;->d:I

    iget-boolean v2, p0, Lf2/z;->f:Z

    iget-boolean v3, p0, Lf2/z;->g:Z

    invoke-virtual {v0, v1, v2, v3}, Lf2/y$a;->g(IZZ)Lf2/y$a;

    :goto_0
    invoke-virtual {v0}, Lf2/y$a;->a()Lf2/y;

    move-result-object v0

    return-object v0
.end method

.method public final c(ILmh/l;)V
    .locals 1

    const-string v0, "popUpToBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf2/z;->h(I)V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lf2/z;->i(Ljava/lang/String;)V

    new-instance p1, Lf2/G;

    invoke-direct {p1}, Lf2/G;-><init>()V

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lf2/G;->a()Z

    move-result p2

    iput-boolean p2, p0, Lf2/z;->f:Z

    invoke-virtual {p1}, Lf2/G;->b()Z

    move-result p1

    iput-boolean p1, p0, Lf2/z;->g:Z

    return-void
.end method

.method public final d(Ljava/lang/String;Lmh/l;)V
    .locals 1

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popUpToBuilder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lf2/z;->i(Ljava/lang/String;)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Lf2/z;->h(I)V

    new-instance p1, Lf2/G;

    invoke-direct {p1}, Lf2/G;-><init>()V

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lf2/G;->a()Z

    move-result p2

    iput-boolean p2, p0, Lf2/z;->f:Z

    invoke-virtual {p1}, Lf2/G;->b()Z

    move-result p1

    iput-boolean p1, p0, Lf2/z;->g:Z

    return-void
.end method

.method public final g(Z)V
    .locals 0

    iput-boolean p1, p0, Lf2/z;->b:Z

    return-void
.end method

.method public final h(I)V
    .locals 0

    iput p1, p0, Lf2/z;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lf2/z;->f:Z

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lf2/z;->c:Z

    return-void
.end method
