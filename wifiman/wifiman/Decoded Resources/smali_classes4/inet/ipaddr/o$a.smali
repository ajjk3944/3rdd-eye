.class public Linet/ipaddr/o$a;
.super Linet/ipaddr/d$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static l:Linet/ipaddr/ipv4/Z;

.field private static m:Linet/ipaddr/ipv6/j0;


# instance fields
.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field j:Linet/ipaddr/ipv4/Z$a;

.field k:Linet/ipaddr/ipv6/j0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Linet/ipaddr/ipv4/Z$a;

    invoke-direct {v0}, Linet/ipaddr/ipv4/Z$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z$a;->s()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    sput-object v0, Linet/ipaddr/o$a;->l:Linet/ipaddr/ipv4/Z;

    new-instance v0, Linet/ipaddr/ipv6/j0$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/j0$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0$a;->x()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    sput-object v0, Linet/ipaddr/o$a;->m:Linet/ipaddr/ipv6/j0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/d$b;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/o$a;->d:Z

    iput-boolean v0, p0, Linet/ipaddr/o$a;->e:Z

    iput-boolean v0, p0, Linet/ipaddr/o$a;->f:Z

    iput-boolean v0, p0, Linet/ipaddr/o$a;->g:Z

    iput-boolean v0, p0, Linet/ipaddr/o$a;->h:Z

    iput-boolean v0, p0, Linet/ipaddr/o$a;->i:Z

    return-void
.end method

.method static synthetic d(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->g:Z

    return p1
.end method

.method static synthetic e(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->d:Z

    return p1
.end method

.method static synthetic f(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->e:Z

    return p1
.end method

.method static synthetic g(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->f:Z

    return p1
.end method

.method static synthetic h(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->i:Z

    return p1
.end method

.method static synthetic i(Linet/ipaddr/o$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->h:Z

    return p1
.end method


# virtual methods
.method public j(Z)Linet/ipaddr/o$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$b;->a(Z)Linet/ipaddr/d$b;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$a;

    return-object p1
.end method

.method public k(Z)Linet/ipaddr/o$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$b;->b(Z)Linet/ipaddr/d$b;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$a;

    return-object p1
.end method

.method public l(Z)Linet/ipaddr/o$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->h:Z

    return-object p0
.end method

.method public m(Z)Linet/ipaddr/o$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->i:Z

    return-object p0
.end method

.method public n(Z)Linet/ipaddr/o$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->f:Z

    return-object p0
.end method

.method public o(Z)Linet/ipaddr/o$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->e:Z

    return-object p0
.end method

.method public p(Z)Linet/ipaddr/o$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/o$a;->g:Z

    return-object p0
.end method

.method public q(Z)Linet/ipaddr/o$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/d$b;->c(Z)Linet/ipaddr/d$b;

    move-result-object p1

    check-cast p1, Linet/ipaddr/o$a;

    return-object p1
.end method

.method public r(Z)Linet/ipaddr/o$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/Z$a;->o(Z)Linet/ipaddr/ipv4/Z$a;

    invoke-virtual {p0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/j0$a;->q(Z)Linet/ipaddr/ipv6/j0$a;

    return-object p0
.end method

.method public s(Z)Linet/ipaddr/o$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/Z$a;->p(Z)Linet/ipaddr/ipv4/Z$a;

    invoke-virtual {p0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv6/j0$a;->s(Z)Linet/ipaddr/ipv6/j0$a;

    return-object p0
.end method

.method public t()Linet/ipaddr/ipv4/Z$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/o$a;->j:Linet/ipaddr/ipv4/Z$a;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv4/Z$a;

    invoke-direct {v0}, Linet/ipaddr/ipv4/Z$a;-><init>()V

    iput-object v0, p0, Linet/ipaddr/o$a;->j:Linet/ipaddr/ipv4/Z$a;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/o$a;->j:Linet/ipaddr/ipv4/Z$a;

    iput-object p0, v0, Linet/ipaddr/o$b$a;->h:Linet/ipaddr/o$a;

    return-object v0
.end method

.method public u()Linet/ipaddr/ipv6/j0$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/o$a;->k:Linet/ipaddr/ipv6/j0$a;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/ipv6/j0$a;

    invoke-direct {v0}, Linet/ipaddr/ipv6/j0$a;-><init>()V

    iput-object v0, p0, Linet/ipaddr/o$a;->k:Linet/ipaddr/ipv6/j0$a;

    :cond_0
    iget-object v0, p0, Linet/ipaddr/o$a;->k:Linet/ipaddr/ipv6/j0$a;

    iput-object p0, v0, Linet/ipaddr/o$b$a;->h:Linet/ipaddr/o$a;

    return-object v0
.end method

.method public v()Linet/ipaddr/o;
    .locals 13

    iget-object v0, p0, Linet/ipaddr/o$a;->j:Linet/ipaddr/ipv4/Z$a;

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/o$a;->l:Linet/ipaddr/ipv4/Z;

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z$a;->s()Linet/ipaddr/ipv4/Z;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Linet/ipaddr/o$a;->k:Linet/ipaddr/ipv6/j0$a;

    if-nez v0, :cond_1

    sget-object v0, Linet/ipaddr/o$a;->m:Linet/ipaddr/ipv6/j0;

    :goto_2
    move-object v12, v0

    goto :goto_3

    :cond_1
    invoke-virtual {v0}, Linet/ipaddr/ipv6/j0$a;->x()Linet/ipaddr/ipv6/j0;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v0, Linet/ipaddr/o;

    iget-boolean v2, p0, Linet/ipaddr/d$b;->a:Z

    iget-boolean v3, p0, Linet/ipaddr/d$b;->b:Z

    iget-boolean v4, p0, Linet/ipaddr/d$b;->c:Z

    iget-boolean v5, p0, Linet/ipaddr/o$a;->d:Z

    iget-boolean v6, p0, Linet/ipaddr/o$a;->e:Z

    iget-boolean v7, p0, Linet/ipaddr/o$a;->f:Z

    iget-boolean v8, p0, Linet/ipaddr/o$a;->g:Z

    iget-boolean v9, p0, Linet/ipaddr/o$a;->h:Z

    iget-boolean v10, p0, Linet/ipaddr/o$a;->i:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Linet/ipaddr/o;-><init>(ZZZZZZZZZLinet/ipaddr/ipv4/Z;Linet/ipaddr/ipv6/j0;)V

    return-object v0
.end method
