.class public final LZc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZc/e$a;,
        LZc/e$b;
    }
.end annotation


# instance fields
.field private final a:LZc/e$b;

.field private final b:Lb8/c;

.field private final c:Ljava/lang/String;

.field private final d:Lh9/a;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/List;

.field private final g:Z

.field private final h:Z


# direct methods
.method public constructor <init>(LZc/e$b;Lb8/c;Ljava/lang/String;Lh9/a;Ljava/util/Map;Ljava/util/List;ZZ)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addresses"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dns"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZc/e;->a:LZc/e$b;

    iput-object p2, p0, LZc/e;->b:Lb8/c;

    iput-object p3, p0, LZc/e;->c:Ljava/lang/String;

    iput-object p4, p0, LZc/e;->d:Lh9/a;

    iput-object p5, p0, LZc/e;->e:Ljava/util/Map;

    iput-object p6, p0, LZc/e;->f:Ljava/util/List;

    iput-boolean p7, p0, LZc/e;->g:Z

    iput-boolean p8, p0, LZc/e;->h:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LZc/e;->f:Ljava/util/List;

    return-object v0
.end method

.method public final b()LZc/e$a;
    .locals 2

    iget-object v0, p0, LZc/e;->e:Ljava/util/Map;

    sget-object v1, Linet/ipaddr/g$a;->IPV4:Linet/ipaddr/g$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/e$a;

    return-object v0
.end method

.method public final c()LZc/e$a;
    .locals 2

    iget-object v0, p0, LZc/e;->e:Ljava/util/Map;

    sget-object v1, Linet/ipaddr/g$a;->IPV6:Linet/ipaddr/g$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZc/e$a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LZc/e;->h:Z

    return v0
.end method

.method public final e()Lh9/a;
    .locals 1

    iget-object v0, p0, LZc/e;->d:Lh9/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LZc/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LZc/e;

    iget-object v1, p0, LZc/e;->a:LZc/e$b;

    iget-object v3, p1, LZc/e;->a:LZc/e$b;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LZc/e;->b:Lb8/c;

    iget-object v3, p1, LZc/e;->b:Lb8/c;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LZc/e;->c:Ljava/lang/String;

    iget-object v3, p1, LZc/e;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LZc/e;->d:Lh9/a;

    iget-object v3, p1, LZc/e;->d:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LZc/e;->e:Ljava/util/Map;

    iget-object v3, p1, LZc/e;->e:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LZc/e;->f:Ljava/util/List;

    iget-object v3, p1, LZc/e;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, LZc/e;->g:Z

    iget-boolean v3, p1, LZc/e;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, LZc/e;->h:Z

    iget-boolean p1, p1, LZc/e;->h:Z

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final f()LZc/e$b;
    .locals 1

    iget-object v0, p0, LZc/e;->a:LZc/e$b;

    return-object v0
.end method

.method public final g()Lb8/c;
    .locals 1

    iget-object v0, p0, LZc/e;->b:Lb8/c;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, LZc/e;->g:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LZc/e;->a:LZc/e$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZc/e;->b:Lb8/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZc/e;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZc/e;->d:Lh9/a;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZc/e;->e:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LZc/e;->f:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LZc/e;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LZc/e;->h:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, LZc/e;->a:LZc/e$b;

    iget-object v1, p0, LZc/e;->b:Lb8/c;

    iget-object v2, p0, LZc/e;->c:Ljava/lang/String;

    iget-object v3, p0, LZc/e;->d:Lh9/a;

    iget-object v4, p0, LZc/e;->e:Ljava/util/Map;

    iget-object v5, p0, LZc/e;->f:Ljava/util/List;

    iget-boolean v6, p0, LZc/e;->g:Z

    iget-boolean v7, p0, LZc/e;->h:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "NetworkConnection(state="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", networkInterfaceName="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", networkInterfaceMac="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", addresses="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dns="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vpnConnected="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", metered="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
