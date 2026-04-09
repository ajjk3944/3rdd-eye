.class final LGc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/wifiman/model/vendor/d;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;Lh9/a;Lcom/ui/wifiman/model/vendor/d;)V
    .locals 1

    const-string v0, "ip"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGc/b$a;->a:Linet/ipaddr/g;

    iput-object p2, p0, LGc/b$a;->b:Lh9/a;

    iput-object p3, p0, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    return-void
.end method


# virtual methods
.method public final a()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LGc/b$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public final b()Lh9/a;
    .locals 1

    iget-object v0, p0, LGc/b$a;->b:Lh9/a;

    return-object v0
.end method

.method public final c()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LGc/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LGc/b$a;

    iget-object v1, p0, LGc/b$a;->a:Linet/ipaddr/g;

    iget-object v3, p1, LGc/b$a;->a:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LGc/b$a;->b:Lh9/a;

    iget-object v3, p1, LGc/b$a;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    iget-object p1, p1, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LGc/b$a;->a:Linet/ipaddr/g;

    invoke-virtual {v0}, Linet/ipaddr/a;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGc/b$a;->b:Lh9/a;

    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LGc/b$a;->a:Linet/ipaddr/g;

    iget-object v1, p0, LGc/b$a;->b:Lh9/a;

    iget-object v2, p0, LGc/b$a;->c:Lcom/ui/wifiman/model/vendor/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CacheItem(ip="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vendor="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
