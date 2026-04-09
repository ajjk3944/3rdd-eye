.class LF1/w0$k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# static fields
.field static final b:LF1/w0;


# instance fields
.field final a:LF1/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF1/w0$a;

    invoke-direct {v0}, LF1/w0$a;-><init>()V

    invoke-virtual {v0}, LF1/w0$a;->a()LF1/w0;

    move-result-object v0

    invoke-virtual {v0}, LF1/w0;->a()LF1/w0;

    move-result-object v0

    invoke-virtual {v0}, LF1/w0;->b()LF1/w0;

    move-result-object v0

    invoke-virtual {v0}, LF1/w0;->c()LF1/w0;

    move-result-object v0

    sput-object v0, LF1/w0$k;->b:LF1/w0;

    return-void
.end method

.method constructor <init>(LF1/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF1/w0$k;->a:LF1/w0;

    return-void
.end method


# virtual methods
.method a()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$k;->a:LF1/w0;

    return-object v0
.end method

.method b()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$k;->a:LF1/w0;

    return-object v0
.end method

.method c()LF1/w0;
    .locals 1

    iget-object v0, p0, LF1/w0$k;->a:LF1/w0;

    return-object v0
.end method

.method d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method e(LF1/w0;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF1/w0$k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LF1/w0$k;

    invoke-virtual {p0}, LF1/w0$k;->p()Z

    move-result v1

    invoke-virtual {p1}, LF1/w0$k;->p()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LF1/w0$k;->o()Z

    move-result v1

    invoke-virtual {p1}, LF1/w0$k;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v1

    invoke-virtual {p1}, LF1/w0$k;->l()Lw1/f;

    move-result-object v3

    invoke-static {v1, v3}, LE1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LF1/w0$k;->j()Lw1/f;

    move-result-object v1

    invoke-virtual {p1}, LF1/w0$k;->j()Lw1/f;

    move-result-object v3

    invoke-static {v1, v3}, LE1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LF1/w0$k;->f()LF1/r;

    move-result-object v1

    invoke-virtual {p1}, LF1/w0$k;->f()LF1/r;

    move-result-object p1

    invoke-static {v1, p1}, LE1/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method f()LF1/r;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method g(I)Lw1/f;
    .locals 0

    sget-object p1, Lw1/f;->e:Lw1/f;

    return-object p1
.end method

.method h(I)Lw1/f;
    .locals 1

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_0

    sget-object p1, Lw1/f;->e:Lw1/f;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unable to query the maximum insets for IME"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, LF1/w0$k;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, LF1/w0$k;->o()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v2

    invoke-virtual {p0}, LF1/w0$k;->j()Lw1/f;

    move-result-object v3

    invoke-virtual {p0}, LF1/w0$k;->f()LF1/r;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LE1/d;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method i()Lw1/f;
    .locals 1

    invoke-virtual {p0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    return-object v0
.end method

.method j()Lw1/f;
    .locals 1

    sget-object v0, Lw1/f;->e:Lw1/f;

    return-object v0
.end method

.method k()Lw1/f;
    .locals 1

    invoke-virtual {p0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    return-object v0
.end method

.method l()Lw1/f;
    .locals 1

    sget-object v0, Lw1/f;->e:Lw1/f;

    return-object v0
.end method

.method m()Lw1/f;
    .locals 1

    invoke-virtual {p0}, LF1/w0$k;->l()Lw1/f;

    move-result-object v0

    return-object v0
.end method

.method n(IIII)LF1/w0;
    .locals 0

    sget-object p1, LF1/w0$k;->b:LF1/w0;

    return-object p1
.end method

.method o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method p()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method q(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public r([Lw1/f;)V
    .locals 0

    return-void
.end method

.method s(Lw1/f;)V
    .locals 0

    return-void
.end method

.method t(LF1/w0;)V
    .locals 0

    return-void
.end method

.method public u(Lw1/f;)V
    .locals 0

    return-void
.end method
