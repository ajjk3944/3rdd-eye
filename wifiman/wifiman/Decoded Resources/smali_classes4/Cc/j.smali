.class public final LCc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCc/a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/ui/wifiman/model/vendor/d;

.field private final d:LCc/b;

.field private final e:LCc/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;)V
    .locals 1

    const-string v0, "_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCc/j;->a:Ljava/lang/String;

    iput-object p2, p0, LCc/j;->b:Ljava/lang/String;

    iput-object p3, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    iput-object p4, p0, LCc/j;->d:LCc/b;

    iput-object p5, p0, LCc/j;->e:LCc/a;

    return-void
.end method

.method public static synthetic r(LCc/j;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;ILjava/lang/Object;)LCc/j;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LCc/j;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LCc/j;->b:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, LCc/j;->d:LCc/b;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, LCc/j;->e:LCc/a;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, LCc/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;)LCc/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;)LCc/j;
    .locals 7

    const-string v0, "_type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LCc/j;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LCc/j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;LCc/b;LCc/a;)V

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCc/j;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    if-nez v0, :cond_1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->c()Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public d()LCc/b;
    .locals 1

    iget-object v0, p0, LCc/j;->d:LCc/b;

    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->e()Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LCc/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LCc/j;

    iget-object v1, p0, LCc/j;->a:Ljava/lang/String;

    iget-object v3, p1, LCc/j;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LCc/j;->b:Ljava/lang/String;

    iget-object v3, p1, LCc/j;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p1, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LCc/j;->d:LCc/b;

    iget-object v3, p1, LCc/j;->d:LCc/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LCc/j;->e:LCc/a;

    iget-object p1, p1, LCc/j;->e:LCc/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public f()Lxa/a$d;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->f()Lxa/a$d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g()Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->g()Lcom/ui/wifiman/model/bluetooth/le/a$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getConfig()LCc/l;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->getConfig()LCc/l;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getId()La8/b;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/k;->getId()La8/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCc/j;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->h()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LCc/j;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LCc/j;->b:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LCc/j;->d:LCc/b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LCc/j;->e:LCc/a;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public i()Linet/ipaddr/ipv6/b;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->i()Linet/ipaddr/ipv6/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public j()LDc/j;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->j()LDc/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->k()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public l()Lh9/a;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->l()Lh9/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public m()Ljava/util/TreeSet;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->m()Ljava/util/TreeSet;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    :cond_1
    return-object v0
.end method

.method public n()Linet/ipaddr/ipv4/b;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->n()Linet/ipaddr/ipv4/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->o()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public p()Lwc/a;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->p()Lwc/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public q()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LCc/j;->e:LCc/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCc/a;->q()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LCc/j;->a:Ljava/lang/String;

    iget-object v1, p0, LCc/j;->b:Ljava/lang/String;

    iget-object v2, p0, LCc/j;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object v3, p0, LCc/j;->d:LCc/b;

    iget-object v4, p0, LCc/j;->e:LCc/a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "MyselfDevice(_name="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", _model="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", _vendor="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", _type="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", combined="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
