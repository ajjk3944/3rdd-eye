.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;
.super Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "o"
.end annotation


# instance fields
.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Z

.field private final n:LCc/b$j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h:Ljava/lang/String;

    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->i:Ljava/lang/String;

    iput-object p3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->j:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    if-nez p2, :cond_0

    move-object p2, p3

    :cond_0
    iput-object p2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->l:Ljava/lang/String;

    sget-object p1, LCc/b$j;->b:LCc/b$j;

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->n:LCc/b$j;

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LCc/b;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h()LCc/b$j;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->m:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->l:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->i:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    return-object v0
.end method

.method public h()LCc/b$j;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->n:LCc/b$j;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->i:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->j:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->h:Ljava/lang/String;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->i:Ljava/lang/String;

    iget-object v2, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->j:Ljava/lang/String;

    iget-object v3, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$o;->k:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Printer(webInterfaceUrl="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", modelLong="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", modelShort="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
