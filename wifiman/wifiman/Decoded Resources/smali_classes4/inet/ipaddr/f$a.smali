.class public Linet/ipaddr/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Linet/ipaddr/o$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Linet/ipaddr/f$a;->a:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->b:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->c:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->d:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->e:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->f:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->g:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Linet/ipaddr/f$a;->h:Z

    iput-boolean v0, p0, Linet/ipaddr/f$a;->i:Z

    return-void
.end method

.method static synthetic a(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->a:Z

    return p1
.end method

.method static synthetic b(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->b:Z

    return p1
.end method

.method static synthetic c(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->d:Z

    return p1
.end method

.method static synthetic d(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->c:Z

    return p1
.end method

.method static synthetic e(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->e:Z

    return p1
.end method

.method static synthetic f(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->f:Z

    return p1
.end method

.method static synthetic g(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->g:Z

    return p1
.end method

.method static synthetic h(Linet/ipaddr/f$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->i:Z

    return p1
.end method

.method static synthetic i(Linet/ipaddr/f$a;Linet/ipaddr/o$a;)Linet/ipaddr/o$a;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/f$a;->j:Linet/ipaddr/o$a;

    return-object p1
.end method


# virtual methods
.method public j(Z)Linet/ipaddr/f$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->a:Z

    return-object p0
.end method

.method public k(Z)Linet/ipaddr/f$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->f:Z

    return-object p0
.end method

.method public l(Z)Linet/ipaddr/f$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->i:Z

    return-object p0
.end method

.method public m(Z)Linet/ipaddr/f$a;
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/f$a;->h:Z

    return-object p0
.end method

.method public n()Linet/ipaddr/f;
    .locals 13

    iget-object v0, p0, Linet/ipaddr/f$a;->j:Linet/ipaddr/o$a;

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/n;->e:Linet/ipaddr/o;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Linet/ipaddr/o$a;->v()Linet/ipaddr/o;

    move-result-object v0

    goto :goto_0

    :goto_1
    new-instance v0, Linet/ipaddr/f;

    iget-boolean v3, p0, Linet/ipaddr/f$a;->a:Z

    iget-boolean v4, p0, Linet/ipaddr/f$a;->b:Z

    iget-boolean v8, p0, Linet/ipaddr/f$a;->f:Z

    const/4 v1, 0x0

    const/4 v5, 0x1

    if-eqz v8, :cond_1

    iget-boolean v6, p0, Linet/ipaddr/f$a;->c:Z

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_2

    :cond_1
    move v6, v1

    :goto_2
    if-eqz v8, :cond_2

    iget-boolean v7, p0, Linet/ipaddr/f$a;->d:Z

    if-eqz v7, :cond_2

    move v7, v5

    goto :goto_3

    :cond_2
    move v7, v1

    :goto_3
    iget-boolean v9, p0, Linet/ipaddr/f$a;->e:Z

    iget-boolean v10, p0, Linet/ipaddr/f$a;->g:Z

    iget-boolean v11, p0, Linet/ipaddr/f$a;->h:Z

    iget-boolean v12, p0, Linet/ipaddr/f$a;->i:Z

    move-object v1, v0

    move v5, v6

    move v6, v7

    move v7, v9

    move v9, v10

    move v10, v11

    move v11, v12

    invoke-direct/range {v1 .. v11}, Linet/ipaddr/f;-><init>(Linet/ipaddr/o;ZZZZZZZZZ)V

    return-object v0
.end method
