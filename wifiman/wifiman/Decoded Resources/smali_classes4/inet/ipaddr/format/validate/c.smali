.class abstract Linet/ipaddr/format/validate/c;
.super Linet/ipaddr/format/validate/a;
.source "SourceFile"


# instance fields
.field private k:Linet/ipaddr/format/validate/i;

.field private l:I

.field private m:Z

.field private n:Z

.field private o:Linet/ipaddr/g$a;

.field private p:Z

.field protected q:Z

.field protected r:Z

.field protected s:Z

.field t:Linet/ipaddr/format/validate/r;

.field private u:Z

.field private v:Z


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0, p1}, Linet/ipaddr/format/validate/a;-><init>(Ljava/lang/CharSequence;)V

    sget-object p1, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    iput-object p1, p0, Linet/ipaddr/format/validate/c;->k:Linet/ipaddr/format/validate/i;

    const/4 p1, -0x1

    iput p1, p0, Linet/ipaddr/format/validate/c;->l:I

    return-void
.end method

.method private j1(Ljava/lang/StringBuilder;)V
    .locals 3

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->W0()I

    move-result v1

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->n()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "unknown"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-void
.end method


# virtual methods
.method T0()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Linet/ipaddr/format/validate/c;->l:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Linet/ipaddr/format/validate/c;->n:Z

    iput-boolean v0, p0, Linet/ipaddr/format/validate/c;->m:Z

    iput-boolean v0, p0, Linet/ipaddr/format/validate/c;->v:Z

    sget-object v0, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    iput-object v0, p0, Linet/ipaddr/format/validate/c;->k:Linet/ipaddr/format/validate/i;

    return-void
.end method

.method U0()Linet/ipaddr/format/validate/a;
    .locals 0

    return-object p0
.end method

.method V0()Linet/ipaddr/format/validate/i;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/c;->k:Linet/ipaddr/format/validate/i;

    return-object v0
.end method

.method W0()I
    .locals 1

    iget v0, p0, Linet/ipaddr/format/validate/c;->l:I

    return v0
.end method

.method public X0()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->m:Z

    return v0
.end method

.method Y0()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->q:Z

    return v0
.end method

.method Z0()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->v:Z

    return v0
.end method

.method a1()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->c()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method b1(I)Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->U0()Linet/ipaddr/format/validate/a;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/format/validate/a;->m()[I

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Linet/ipaddr/format/validate/c;->c1(I[I)Z

    move-result p1

    return p1
.end method

.method c1(I[I)Z
    .locals 2

    const/16 v0, 0xf

    invoke-static {p1, v0, p2}, Linet/ipaddr/format/validate/a;->j(II[I)I

    move-result v0

    const/4 v1, 0x6

    invoke-static {p1, v1, p2}, Linet/ipaddr/format/validate/a;->j(II[I)I

    move-result p1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d1()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->u:Z

    return v0
.end method

.method public e1()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv4()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f1()Z
    .locals 1

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Linet/ipaddr/g$a;->isIPv6()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g1()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/c;->t:Linet/ipaddr/format/validate/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method h1()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->n:Z

    return v0
.end method

.method i1()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/c;->p:Z

    return v0
.end method

.method k1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->u:Z

    return-void
.end method

.method l1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->v:Z

    return-void
.end method

.method m1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->s:Z

    return-void
.end method

.method n1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->r:Z

    return-void
.end method

.method public o0()Linet/ipaddr/g$a;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/c;->o:Linet/ipaddr/g$a;

    return-object v0
.end method

.method o1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->m:Z

    return-void
.end method

.method p1(Linet/ipaddr/format/validate/r;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/c;->t:Linet/ipaddr/format/validate/r;

    return-void
.end method

.method q1(Linet/ipaddr/format/validate/i;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/c;->k:Linet/ipaddr/format/validate/i;

    return-void
.end method

.method r1(I)V
    .locals 0

    iput p1, p0, Linet/ipaddr/format/validate/c;->l:I

    return-void
.end method

.method s1(Linet/ipaddr/g$a;)V
    .locals 0

    iput-object p1, p0, Linet/ipaddr/format/validate/c;->o:Linet/ipaddr/g$a;

    return-void
.end method

.method t1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->n:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Linet/ipaddr/format/validate/a;->P0(Ljava/lang/StringBuilder;)V

    const-string v1, "ip version: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->o0()Linet/ipaddr/g$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->f1()Z

    move-result v1

    const/16 v2, 0xa

    if-eqz v1, :cond_6

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->g1()Z

    move-result v1

    const-string v3, ", with prefix length "

    const-string v4, ", with zone "

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    :cond_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    :cond_1
    const-string v1, ", with IPv4 embedded address: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Linet/ipaddr/format/validate/c;->t:Linet/ipaddr/format/validate/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->d1()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, " base 85"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->Z0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->h1()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    :cond_4
    :goto_0
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    :cond_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->X0()Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, ", with prefix length  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Linet/ipaddr/format/validate/c;->j1(Ljava/lang/StringBuilder;)V

    :cond_7
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->i1()Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, ", with joined segments"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    invoke-virtual {p0}, Linet/ipaddr/format/validate/c;->Y0()Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, ", with at least one hex or octal value"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_a
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method u1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->q:Z

    return-void
.end method

.method v1(Z)V
    .locals 0

    iput-boolean p1, p0, Linet/ipaddr/format/validate/c;->p:Z

    return-void
.end method
