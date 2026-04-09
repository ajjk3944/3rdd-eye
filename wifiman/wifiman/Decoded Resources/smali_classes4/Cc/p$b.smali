.class final LCc/p$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCc/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:La8/b;

.field private b:Ljava/util/TreeSet;

.field private c:LDc/j;

.field private d:Lwc/a;

.field private e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

.field private f:LCc/l;


# direct methods
.method public constructor <init>(La8/b;Ljava/util/TreeSet;LDc/j;Lwc/a;Lcom/ui/wifiman/model/bluetooth/le/a$a;LCc/l;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiSignals"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LCc/p$b;->a:La8/b;

    .line 3
    iput-object p2, p0, LCc/p$b;->b:Ljava/util/TreeSet;

    .line 4
    iput-object p3, p0, LCc/p$b;->c:LDc/j;

    .line 5
    iput-object p4, p0, LCc/p$b;->d:Lwc/a;

    .line 6
    iput-object p5, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    .line 7
    iput-object p6, p0, LCc/p$b;->f:LCc/l;

    return-void
.end method

.method public synthetic constructor <init>(La8/b;Ljava/util/TreeSet;LDc/j;Lwc/a;Lcom/ui/wifiman/model/bluetooth/le/a$a;LCc/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    new-instance p2, Ljava/util/TreeSet;

    new-instance p8, LCc/p$b$a;

    invoke-direct {p8}, LCc/p$b$a;-><init>()V

    invoke-direct {p2, p8}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    const/4 p8, 0x0

    if-eqz p2, :cond_1

    move-object v3, p8

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    move-object v4, p8

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    move-object v5, p8

    goto :goto_2

    :cond_3
    move-object v5, p5

    :goto_2
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    move-object v6, p8

    goto :goto_3

    :cond_4
    move-object v6, p6

    :goto_3
    move-object v0, p0

    move-object v1, p1

    .line 9
    invoke-direct/range {v0 .. v6}, LCc/p$b;-><init>(La8/b;Ljava/util/TreeSet;LDc/j;Lwc/a;Lcom/ui/wifiman/model/bluetooth/le/a$a;LCc/l;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/bluetooth/le/a$a;)V
    .locals 0

    iput-object p1, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->i(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->m(LCc/a$b;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v0

    return-object v0
.end method

.method public d()LCc/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->a(LCc/a$b;)LCc/b;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/Long;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->l(LCc/a$b;)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LCc/p$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LCc/p$b;

    iget-object v1, p0, LCc/p$b;->a:La8/b;

    iget-object v3, p1, LCc/p$b;->a:La8/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LCc/p$b;->b:Ljava/util/TreeSet;

    iget-object v3, p1, LCc/p$b;->b:Ljava/util/TreeSet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LCc/p$b;->c:LDc/j;

    iget-object v3, p1, LCc/p$b;->c:LDc/j;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LCc/p$b;->d:Lwc/a;

    iget-object v3, p1, LCc/p$b;->d:Lwc/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    iget-object v3, p1, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LCc/p$b;->f:LCc/l;

    iget-object p1, p1, LCc/p$b;->f:LCc/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public f()Lxa/a$d;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->k(LCc/a$b;)Lxa/a$d;

    move-result-object v0

    return-object v0
.end method

.method public g()Lcom/ui/wifiman/model/bluetooth/le/a$a;
    .locals 1

    iget-object v0, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    return-object v0
.end method

.method public getConfig()LCc/l;
    .locals 1

    iget-object v0, p0, LCc/p$b;->f:LCc/l;

    return-object v0
.end method

.method public getId()La8/b;
    .locals 1

    iget-object v0, p0, LCc/p$b;->a:La8/b;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->j(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->b(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LCc/p$b;->a:La8/b;

    invoke-virtual {v0}, La8/b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCc/p$b;->b:Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCc/p$b;->c:LDc/j;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LDc/j;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCc/p$b;->d:Lwc/a;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lwc/a;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/ui/wifiman/model/bluetooth/le/a$a;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LCc/p$b;->f:LCc/l;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, LCc/l;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public i()Linet/ipaddr/ipv6/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->f(LCc/a$b;)Linet/ipaddr/ipv6/b;

    move-result-object v0

    return-object v0
.end method

.method public j()LDc/j;
    .locals 1

    iget-object v0, p0, LCc/p$b;->c:LDc/j;

    return-object v0
.end method

.method public k()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->h(LCc/a$b;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public l()Lh9/a;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->g(LCc/a$b;)Lh9/a;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/util/TreeSet;
    .locals 1

    iget-object v0, p0, LCc/p$b;->b:Ljava/util/TreeSet;

    return-object v0
.end method

.method public n()Linet/ipaddr/ipv4/b;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->e(LCc/a$b;)Linet/ipaddr/ipv4/b;

    move-result-object v0

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->c(LCc/a$b;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()Lwc/a;
    .locals 1

    iget-object v0, p0, LCc/p$b;->d:Lwc/a;

    return-object v0
.end method

.method public q()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, LCc/a$b$a;->d(LCc/a$b;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public r(Lwc/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$b;->d:Lwc/a;

    return-void
.end method

.method public s(LCc/l;)V
    .locals 0

    iput-object p1, p0, LCc/p$b;->f:LCc/l;

    return-void
.end method

.method public t(LDc/j;)V
    .locals 0

    iput-object p1, p0, LCc/p$b;->c:LDc/j;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, LCc/p$b;->a:La8/b;

    iget-object v1, p0, LCc/p$b;->b:Ljava/util/TreeSet;

    iget-object v2, p0, LCc/p$b;->c:LDc/j;

    iget-object v3, p0, LCc/p$b;->d:Lwc/a;

    iget-object v4, p0, LCc/p$b;->e:Lcom/ui/wifiman/model/bluetooth/le/a$a;

    iget-object v5, p0, LCc/p$b;->f:LCc/l;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DefaultIdentifiedDevice(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", wifiSignals="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkDiscovery="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bluetooth="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bleCharacteristicsDevice="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", config="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
