.class abstract Linet/ipaddr/format/validate/r$l;
.super Linet/ipaddr/format/validate/r$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "l"
.end annotation


# instance fields
.field private c:Linet/ipaddr/j;

.field private d:Linet/ipaddr/j;

.field private e:Linet/ipaddr/j;

.field private f:Linet/ipaddr/j;

.field private g:Linet/ipaddr/IncompatibleAddressException;

.field private h:Linet/ipaddr/IncompatibleAddressException;

.field private i:Linet/ipaddr/IncompatibleAddressException;

.field private j:Linet/ipaddr/IncompatibleAddressException;

.field private k:Linet/ipaddr/m;

.field private l:Linet/ipaddr/g;

.field private m:Linet/ipaddr/g;

.field private n:Lag/k;

.field final synthetic o:Linet/ipaddr/format/validate/r;


# direct methods
.method constructor <init>(Linet/ipaddr/format/validate/r;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->o:Linet/ipaddr/format/validate/r;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$d;-><init>()V

    return-void
.end method

.method private E()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->o:Linet/ipaddr/format/validate/r;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/c;->V0()Linet/ipaddr/format/validate/i;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/m;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/format/validate/r$l;->k:Linet/ipaddr/m;

    return-object p0
.end method

.method static synthetic d(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->e:Linet/ipaddr/j;

    return-object p1
.end method

.method static synthetic g(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/m;)Linet/ipaddr/m;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->k:Linet/ipaddr/m;

    return-object p1
.end method

.method static synthetic h(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->f:Linet/ipaddr/j;

    return-object p1
.end method

.method static synthetic j(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/format/validate/r$l;->i:Linet/ipaddr/IncompatibleAddressException;

    return-object p0
.end method

.method static synthetic l(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->i:Linet/ipaddr/IncompatibleAddressException;

    return-object p1
.end method

.method static synthetic m(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->g:Linet/ipaddr/IncompatibleAddressException;

    return-object p1
.end method

.method static synthetic n(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/format/validate/r$l;->j:Linet/ipaddr/IncompatibleAddressException;

    return-object p0
.end method

.method static synthetic o(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->j:Linet/ipaddr/IncompatibleAddressException;

    return-object p1
.end method

.method static synthetic p(Linet/ipaddr/format/validate/r$l;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iget-object p0, p0, Linet/ipaddr/format/validate/r$l;->h:Linet/ipaddr/IncompatibleAddressException;

    return-object p0
.end method

.method static synthetic r(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/IncompatibleAddressException;)Linet/ipaddr/IncompatibleAddressException;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->h:Linet/ipaddr/IncompatibleAddressException;

    return-object p1
.end method

.method static synthetic s(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->c:Linet/ipaddr/j;

    return-object p1
.end method

.method static synthetic t(Linet/ipaddr/format/validate/r$l;Linet/ipaddr/j;)Linet/ipaddr/j;
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/r$l;->d:Linet/ipaddr/j;

    return-object p1
.end method


# virtual methods
.method public B()Linet/ipaddr/g;
    .locals 4

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->d:Linet/ipaddr/j;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->a()Linet/ipaddr/g;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->b:Linet/ipaddr/g;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->d:Linet/ipaddr/j;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$l;->E()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    iput-object v0, p0, Linet/ipaddr/format/validate/r$d;->b:Linet/ipaddr/g;

    :cond_1
    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->b:Linet/ipaddr/g;

    return-object v0
.end method

.method C()Linet/ipaddr/g;
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->e:Linet/ipaddr/j;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    return-object v0
.end method

.method F()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method J()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->b:Linet/ipaddr/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method K()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->e:Linet/ipaddr/j;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method P()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->h:Linet/ipaddr/IncompatibleAddressException;

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->i:Linet/ipaddr/IncompatibleAddressException;

    if-nez v0, :cond_0

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->j:Linet/ipaddr/IncompatibleAddressException;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method S()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->n:Lag/k;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method T()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->k:Linet/ipaddr/m;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a()Linet/ipaddr/g;
    .locals 7

    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    if-nez v0, :cond_1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->k:Linet/ipaddr/m;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->c:Linet/ipaddr/j;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$l;->E()Ljava/lang/CharSequence;

    move-result-object v2

    iget-object v3, p0, Linet/ipaddr/format/validate/r$l;->o:Linet/ipaddr/format/validate/r;

    invoke-static {v3}, Linet/ipaddr/format/validate/r;->E1(Linet/ipaddr/format/validate/r;)LZf/f;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    iput-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v1

    iget-object v2, p0, Linet/ipaddr/format/validate/r$l;->c:Linet/ipaddr/j;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$l;->E()Ljava/lang/CharSequence;

    move-result-object v3

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->o:Linet/ipaddr/format/validate/r;

    invoke-static {v0}, Linet/ipaddr/format/validate/r;->E1(Linet/ipaddr/format/validate/r;)LZf/f;

    move-result-object v4

    iget-object v5, p0, Linet/ipaddr/format/validate/r$l;->l:Linet/ipaddr/g;

    iget-object v6, p0, Linet/ipaddr/format/validate/r$l;->m:Linet/ipaddr/g;

    invoke-virtual/range {v1 .. v6}, Linet/ipaddr/format/validate/f;->l(LZf/c;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/a;Linet/ipaddr/a;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    iput-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    :cond_1
    :goto_0
    iget-object v0, p0, Linet/ipaddr/format/validate/r$d;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method b0()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/r$l;->c:Linet/ipaddr/j;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method v()Linet/ipaddr/m;
    .locals 4

    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->e:Linet/ipaddr/j;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$l;->E()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    iput-object v0, p0, Linet/ipaddr/format/validate/r$l;->l:Linet/ipaddr/g;

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->f:Linet/ipaddr/j;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/r$l;->y()Linet/ipaddr/format/validate/f;

    move-result-object v0

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->f:Linet/ipaddr/j;

    invoke-direct {p0}, Linet/ipaddr/format/validate/r$l;->E()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v3}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object v0

    check-cast v0, Linet/ipaddr/g;

    :goto_0
    iput-object v0, p0, Linet/ipaddr/format/validate/r$l;->m:Linet/ipaddr/g;

    iget-object v1, p0, Linet/ipaddr/format/validate/r$l;->l:Linet/ipaddr/g;

    invoke-virtual {v1, v0}, Linet/ipaddr/g;->j1(Linet/ipaddr/g;)Linet/ipaddr/m;

    move-result-object v0

    iput-object v0, p0, Linet/ipaddr/format/validate/r$l;->k:Linet/ipaddr/m;

    return-object v0
.end method

.method abstract y()Linet/ipaddr/format/validate/f;
.end method
