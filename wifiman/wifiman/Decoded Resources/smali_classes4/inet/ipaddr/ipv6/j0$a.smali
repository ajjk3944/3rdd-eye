.class public Linet/ipaddr/ipv6/j0$a;
.super Linet/ipaddr/o$b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/ipv6/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static o:Linet/ipaddr/o;


# instance fields
.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Linet/ipaddr/o$a;

.field private n:Linet/ipaddr/ipv6/e;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v12, Linet/ipaddr/o;

    new-instance v0, Linet/ipaddr/ipv4/Z$a;

    invoke-direct {v0}, Linet/ipaddr/ipv4/Z$a;-><init>()V

    invoke-virtual {v0}, Linet/ipaddr/ipv4/Z$a;->s()Linet/ipaddr/ipv4/Z;

    move-result-object v10

    new-instance v11, Linet/ipaddr/ipv6/j0;

    sget-object v22, Linet/ipaddr/d$a;->e:Linet/ipaddr/d$c;

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v13, v11

    invoke-direct/range {v13 .. v26}, Linet/ipaddr/ipv6/j0;-><init>(ZZZZLinet/ipaddr/o;ZZZLinet/ipaddr/d$c;ZZZLinet/ipaddr/ipv6/e;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, Linet/ipaddr/o;-><init>(ZZZZZZZZZLinet/ipaddr/ipv4/Z;Linet/ipaddr/ipv6/j0;)V

    sput-object v12, Linet/ipaddr/ipv6/j0$a;->o:Linet/ipaddr/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Linet/ipaddr/o$b$a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/ipv6/j0$a;->i:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv6/j0$a;->j:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv6/j0$a;->k:Z

    iput-boolean v0, p0, Linet/ipaddr/ipv6/j0$a;->l:Z

    return-void
.end method

.method static synthetic j(Linet/ipaddr/ipv6/j0$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->i:Z

    return p1
.end method

.method static synthetic k(Linet/ipaddr/ipv6/j0$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->j:Z

    return p1
.end method

.method static synthetic l(Linet/ipaddr/ipv6/j0$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->k:Z

    return p1
.end method

.method static synthetic m(Linet/ipaddr/ipv6/j0$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->l:Z

    return p1
.end method

.method static synthetic n(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/ipv6/e;)Linet/ipaddr/ipv6/e;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/j0$a;->n:Linet/ipaddr/ipv6/e;

    return-object p1
.end method

.method static synthetic o(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/o$a;)Linet/ipaddr/o$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    return-object p1
.end method


# virtual methods
.method public bridge synthetic f()Linet/ipaddr/o$a;
    .locals 1

    invoke-super {p0}, Linet/ipaddr/o$b$a;->f()Linet/ipaddr/o$a;

    move-result-object v0

    return-object v0
.end method

.method public p(Z)Linet/ipaddr/ipv6/j0$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->i:Z

    return-object p0
.end method

.method public q(Z)Linet/ipaddr/ipv6/j0$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/Z$a;->o(Z)Linet/ipaddr/ipv4/Z$a;

    invoke-super {p0, p1}, Linet/ipaddr/o$b$a;->e(Z)Linet/ipaddr/o$b$a;

    return-object p0
.end method

.method public r(Z)Linet/ipaddr/ipv6/j0$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0$a;->u()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    iput-boolean p1, v0, Linet/ipaddr/ipv6/j0$a;->j:Z

    iput-boolean p1, p0, Linet/ipaddr/ipv6/j0$a;->j:Z

    return-object p0
.end method

.method public s(Z)Linet/ipaddr/ipv6/j0$a;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Linet/ipaddr/ipv6/j0$a;->p(Z)Linet/ipaddr/ipv6/j0$a;

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0$a;->u()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/Z$a;->p(Z)Linet/ipaddr/ipv4/Z$a;

    return-object p0
.end method

.method public t()Linet/ipaddr/ipv4/Z$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0$a;->u()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    return-object v0
.end method

.method u()Linet/ipaddr/o$a;
    .locals 2

    iget-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    if-nez v0, :cond_0

    new-instance v0, Linet/ipaddr/o$a;

    invoke-direct {v0}, Linet/ipaddr/o$a;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->k(Z)Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->o(Z)Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->n(Z)Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->p(Z)Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->j(Z)Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Linet/ipaddr/o$a;->m(Z)Linet/ipaddr/o$a;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0$a;->j:Z

    iput-boolean v1, v0, Linet/ipaddr/ipv6/j0$a;->j:Z

    iget-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    invoke-virtual {v0}, Linet/ipaddr/o$a;->u()Linet/ipaddr/ipv6/j0$a;

    move-result-object v0

    iget-boolean v1, p0, Linet/ipaddr/ipv6/j0$a;->k:Z

    iput-boolean v1, v0, Linet/ipaddr/ipv6/j0$a;->k:Z

    :cond_0
    iget-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-static {p0, v0}, Linet/ipaddr/o$b$a;->h(Linet/ipaddr/ipv6/j0$a;Linet/ipaddr/ipv4/Z$a;)V

    iget-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    return-object v0
.end method

.method public v(Linet/ipaddr/ipv6/e;)Linet/ipaddr/ipv6/j0$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/ipv6/j0$a;->n:Linet/ipaddr/ipv6/e;

    return-object p0
.end method

.method public w(Linet/ipaddr/d$c;)Linet/ipaddr/ipv6/j0$a;
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/ipv6/j0$a;->u()Linet/ipaddr/o$a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/o$a;->t()Linet/ipaddr/ipv4/Z$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Linet/ipaddr/ipv4/Z$a;->r(Linet/ipaddr/d$c;)Linet/ipaddr/ipv4/Z$a;

    invoke-super {p0, p1}, Linet/ipaddr/o$b$a;->i(Linet/ipaddr/d$c;)Linet/ipaddr/o$b$a;

    return-object p0
.end method

.method public x()Linet/ipaddr/ipv6/j0;
    .locals 15

    iget-object v0, p0, Linet/ipaddr/ipv6/j0$a;->m:Linet/ipaddr/o$a;

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/ipv6/j0$a;->o:Linet/ipaddr/o;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v0

    goto :goto_0

    :goto_1
    new-instance v0, Linet/ipaddr/ipv6/j0;

    iget-boolean v2, p0, Linet/ipaddr/d$a$a;->c:Z

    iget-boolean v3, p0, Linet/ipaddr/o$b$a;->f:Z

    iget-boolean v4, p0, Linet/ipaddr/d$a$a;->d:Z

    iget-boolean v5, p0, Linet/ipaddr/ipv6/j0$a;->i:Z

    iget-boolean v7, p0, Linet/ipaddr/ipv6/j0$a;->j:Z

    iget-boolean v8, p0, Linet/ipaddr/ipv6/j0$a;->k:Z

    iget-boolean v9, p0, Linet/ipaddr/ipv6/j0$a;->l:Z

    iget-object v10, p0, Linet/ipaddr/d$a$a;->a:Linet/ipaddr/d$c;

    iget-boolean v11, p0, Linet/ipaddr/d$a$a;->b:Z

    iget-boolean v12, p0, Linet/ipaddr/o$b$a;->e:Z

    iget-boolean v13, p0, Linet/ipaddr/o$b$a;->g:Z

    iget-object v14, p0, Linet/ipaddr/ipv6/j0$a;->n:Linet/ipaddr/ipv6/e;

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Linet/ipaddr/ipv6/j0;-><init>(ZZZZLinet/ipaddr/o;ZZZLinet/ipaddr/d$c;ZZZLinet/ipaddr/ipv6/e;)V

    return-object v0
.end method
