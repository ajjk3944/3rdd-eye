.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;
.super Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field private final h:Ljava/lang/String;

.field private final i:Z

.field private final j:LCc/b;

.field private final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->d()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;->g:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;

    invoke-static {v1, p1}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;->a(Lcom/ui/wifiman/model/discovery/engine/bonjour/c$h;Ljava/lang/String;)LCc/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->j:LCc/b;

    invoke-virtual {p0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->a()LCc/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LCc/b;->a()Lcom/ui/wifiman/model/vendor/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/vendor/d;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LCc/b;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->j:LCc/b;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->i:Z

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;

    iget-object v1, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->k:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$e;->h:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppleRaop(model="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
