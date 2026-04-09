.class public Linet/ipaddr/ipv4/Z$a;
.super Linet/ipaddr/o$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv4/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Linet/ipaddr/ipv4/e;

.field o:Linet/ipaddr/ipv6/j0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/o$b$a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/ipv4/Z$a;->i:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv4/Z$a;->j:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv4/Z$a;->k:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv4/Z$a;->l:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Linet/ipaddr/ipv4/Z$a;->m:Z

    return-void
.end method

.method static synthetic j(Linet/ipaddr/ipv4/Z$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->i:Z

    return p1
.end method

.method static synthetic k(Linet/ipaddr/ipv4/Z$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->j:Z

    return p1
.end method

.method static synthetic l(Linet/ipaddr/ipv4/Z$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->l:Z

    return p1
.end method

.method static synthetic m(Linet/ipaddr/ipv4/Z$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->m:Z

    return p1
.end method

.method static synthetic n(Linet/ipaddr/ipv4/Z$a;Linet/ipaddr/ipv4/e;)Linet/ipaddr/ipv4/e;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv4/Z$a;->n:Linet/ipaddr/ipv4/e;

    return-object p1
.end method


# virtual methods
.method public bridge synthetic f()Linet/ipaddr/o$a;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/o$b$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    return-object v0
.end method

.method protected g(Linet/ipaddr/ipv6/j0$a;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv4/Z$a;->o:Linet/ipaddr/ipv6/j0$a;

    return-void
.end method

.method public o(Z)Linet/ipaddr/ipv4/Z$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/o$b$a;->e(Z)Linet/ipaddr/o$b$a;

    return-object p0
.end method

.method public p(Z)Linet/ipaddr/ipv4/Z$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->i:Z

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->j:Z

    iput-boolean p1, p0, Linet/ipaddr/ipv4/Z$a;->l:Z

    invoke-super {p0, p1}, Linet/ipaddr/o$b$a;->d(Z)Linet/ipaddr/o$b$a;

    return-object p0
.end method

.method public q(Linet/ipaddr/ipv4/e;)Linet/ipaddr/ipv4/Z$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv4/Z$a;->n:Linet/ipaddr/ipv4/e;

    return-object p0
.end method

.method public r(Linet/ipaddr/d$c;)Linet/ipaddr/ipv4/Z$a;
    .locals 0

    invoke-super {p0, p1}, Linet/ipaddr/o$b$a;->i(Linet/ipaddr/d$c;)Linet/ipaddr/o$b$a;

    return-object p0
.end method

.method public s()Linet/ipaddr/ipv4/Z;
    .locals 15

    new-instance v14, Linet/ipaddr/ipv4/Z;

    iget-boolean v1, p0, Linet/ipaddr/d$a$a;->c:Z

    iget-boolean v2, p0, Linet/ipaddr/o$b$a;->f:Z

    iget-boolean v3, p0, Linet/ipaddr/d$a$a;->d:Z

    iget-object v4, p0, Linet/ipaddr/d$a$a;->a:Linet/ipaddr/d$c;

    iget-boolean v5, p0, Linet/ipaddr/d$a$a;->b:Z

    iget-boolean v6, p0, Linet/ipaddr/o$b$a;->e:Z

    iget-boolean v7, p0, Linet/ipaddr/o$b$a;->g:Z

    iget-boolean v8, p0, Linet/ipaddr/ipv4/Z$a;->i:Z

    iget-boolean v9, p0, Linet/ipaddr/ipv4/Z$a;->j:Z

    iget-boolean v10, p0, Linet/ipaddr/ipv4/Z$a;->k:Z

    iget-boolean v11, p0, Linet/ipaddr/ipv4/Z$a;->l:Z

    iget-boolean v12, p0, Linet/ipaddr/ipv4/Z$a;->m:Z

    iget-object v13, p0, Linet/ipaddr/ipv4/Z$a;->n:Linet/ipaddr/ipv4/e;

    move-object v0, v14

    invoke-direct/range {v0 .. v13}, Linet/ipaddr/ipv4/Z;-><init>(ZZZLinet/ipaddr/d$c;ZZZZZZZZLinet/ipaddr/ipv4/e;)V

    return-object v14
.end method
