.class public final Lcom/ui/wifiman/ui/component/network/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/ui/component/network/q$c;


# instance fields
.field private final a:Lcom/ui/wifiman/ui/component/network/M;

.field private final b:Lcom/ui/wifiman/ui/component/network/L;

.field private final c:Z

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;)V
    .locals 1

    const-string v0, "initialItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    iput-boolean p3, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    return-void
.end method

.method public static synthetic e(Lcom/ui/wifiman/ui/component/network/N;Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;ILjava/lang/Object;)Lcom/ui/wifiman/ui/component/network/N;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/N;->d(Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;)Lcom/ui/wifiman/ui/component/network/N;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic b()Lcom/ui/wifiman/ui/component/network/q$b;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/component/network/N;->g()Lcom/ui/wifiman/ui/component/network/M;

    move-result-object v0

    return-object v0
.end method

.method public c()Lmh/p;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/N$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/ui/component/network/N$a;-><init>(Lcom/ui/wifiman/ui/component/network/N;)V

    return-object v0
.end method

.method public final d(Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;)Lcom/ui/wifiman/ui/component/network/N;
    .locals 1

    const-string v0, "initialItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/component/network/N;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/N;-><init>(Lcom/ui/wifiman/ui/component/network/M;Lcom/ui/wifiman/ui/component/network/L;ZLjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/ui/component/network/N;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/wifiman/ui/component/network/N;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    iget-object v3, p1, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    iget-object v3, p1, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    iget-boolean v3, p1, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    iget-object p1, p1, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lcom/ui/wifiman/ui/component/network/L;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    return-object v0
.end method

.method public g()Lcom/ui/wifiman/ui/component/network/M;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/M;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/ui/wifiman/ui/component/network/N;->a:Lcom/ui/wifiman/ui/component/network/M;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/N;->b:Lcom/ui/wifiman/ui/component/network/L;

    iget-boolean v2, p0, Lcom/ui/wifiman/ui/component/network/N;->c:Z

    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/N;->d:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Model(initialItem="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", connectionState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isVpnActive="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
