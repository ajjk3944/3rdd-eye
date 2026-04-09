.class public Linet/ipaddr/format/validate/d$f;
.super Linet/ipaddr/format/validate/d$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field e:LZf/f;

.field f:Linet/ipaddr/format/validate/i;


# direct methods
.method constructor <init>(Linet/ipaddr/format/validate/i;Linet/ipaddr/g$a;LZf/f;Linet/ipaddr/o;)V
    .locals 1

    invoke-virtual {p1}, Linet/ipaddr/format/validate/i;->h()Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0, p2, p4}, Linet/ipaddr/format/validate/d$e;-><init>(Ljava/lang/Integer;Linet/ipaddr/g$a;Linet/ipaddr/o;)V

    iput-object p3, p0, Linet/ipaddr/format/validate/d$f;->e:LZf/f;

    iput-object p1, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    return-void
.end method


# virtual methods
.method public U()Z
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method a()Linet/ipaddr/format/validate/r$d;
    .locals 6

    iget-object v0, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    sget-object v1, Linet/ipaddr/format/validate/h;->j:Linet/ipaddr/format/validate/i;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Linet/ipaddr/format/validate/r$d;

    iget-object v1, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    iget-object v2, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    iget-object v3, p0, Linet/ipaddr/format/validate/d$f;->e:LZf/f;

    iget-object v4, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-static {v1, v2, v3, v4}, Linet/ipaddr/format/validate/r;->L1(Linet/ipaddr/g$a;Linet/ipaddr/format/validate/i;LZf/f;Linet/ipaddr/o;)Linet/ipaddr/g;

    move-result-object v1

    invoke-direct {v0, v1}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;)V

    return-object v0

    :cond_0
    new-instance v0, Linet/ipaddr/format/validate/r$d;

    iget-object v2, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    iget-object v3, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    iget-object v4, p0, Linet/ipaddr/format/validate/d$f;->e:LZf/f;

    iget-object v5, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-static {v2, v3, v4, v5}, Linet/ipaddr/format/validate/r;->L1(Linet/ipaddr/g$a;Linet/ipaddr/format/validate/i;LZf/f;Linet/ipaddr/o;)Linet/ipaddr/g;

    move-result-object v2

    iget-object v3, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    iget-object v4, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    invoke-virtual {v4}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v1, Linet/ipaddr/format/validate/i;

    iget-object v4, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    invoke-virtual {v4}, Linet/ipaddr/format/validate/i;->o()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v1, v4}, Linet/ipaddr/format/validate/i;-><init>(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v4, p0, Linet/ipaddr/format/validate/d$f;->e:LZf/f;

    iget-object v5, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    invoke-static {v3, v1, v4, v5}, Linet/ipaddr/format/validate/r;->L1(Linet/ipaddr/g$a;Linet/ipaddr/format/validate/i;LZf/f;Linet/ipaddr/o;)Linet/ipaddr/g;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Linet/ipaddr/format/validate/r$d;-><init>(Linet/ipaddr/g;Linet/ipaddr/g;)V

    return-object v0
.end method

.method public g0()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$f;->f:Linet/ipaddr/format/validate/i;

    invoke-virtual {v0}, Linet/ipaddr/format/validate/i;->h()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getType()Linet/ipaddr/format/validate/d$h;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, Linet/ipaddr/format/validate/d$h;->from(Linet/ipaddr/g$a;)Linet/ipaddr/format/validate/d$h;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Linet/ipaddr/format/validate/d$h;->ALL:Linet/ipaddr/format/validate/d$h;

    return-object v0
.end method

.method public t0()I
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$e;->c:Linet/ipaddr/g$a;

    if-nez v0, :cond_0

    sget-object v0, Linet/ipaddr/a;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
