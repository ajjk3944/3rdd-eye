.class public final Lab/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFa/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lab/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lab/d$d$a;,
        Lab/d$d$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lab/d$d$a;

.field private final c:Lab/d$d$b;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lab/d$d$a;Lab/d$d$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lab/d$d;->a:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Lab/d$d;->b:Lab/d$d$a;

    .line 4
    iput-object p3, p0, Lab/d$d;->c:Lab/d$d$b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Lab/d$d$a;Lab/d$d$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lab/d$d;-><init>(Ljava/util/Map;Lab/d$d$a;Lab/d$d$b;)V

    return-void
.end method


# virtual methods
.method public D()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lab/d$d;->a:Ljava/util/Map;

    return-object v0
.end method

.method public a()Lab/d$d$a;
    .locals 1

    iget-object v0, p0, Lab/d$d;->b:Lab/d$d$a;

    return-object v0
.end method

.method public c()Lab/d$d$b;
    .locals 1

    iget-object v0, p0, Lab/d$d;->c:Lab/d$d$b;

    return-object v0
.end method

.method public bridge synthetic e()LFa/b$a;
    .locals 1

    invoke-virtual {p0}, Lab/d$d;->a()Lab/d$d$a;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lab/d$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lab/d$d;

    iget-object v1, p0, Lab/d$d;->a:Ljava/util/Map;

    iget-object v3, p1, Lab/d$d;->a:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lab/d$d;->b:Lab/d$d$a;

    iget-object v3, p1, Lab/d$d;->b:Lab/d$d$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lab/d$d;->c:Lab/d$d$b;

    iget-object p1, p1, Lab/d$d;->c:Lab/d$d$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lab/d$d;->a:Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lab/d$d;->b:Lab/d$d$a;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lab/d$d$a;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lab/d$d;->c:Lab/d$d$b;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lab/d$d$b;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lab/d$d;->a:Ljava/util/Map;

    iget-object v1, p0, Lab/d$d;->b:Lab/d$d$a;

    iget-object v2, p0, Lab/d$d;->c:Lab/d$d$b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Unifi(btleService="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", network="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", protect="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
