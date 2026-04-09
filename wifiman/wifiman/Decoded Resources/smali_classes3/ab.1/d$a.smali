.class public final Lab/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lua/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lab/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lab/d$a$a;,
        Lab/d$a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lab/d$a$b;

.field private final d:Lcom/ui/uidb/UiDB$b;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lab/d$a$b;Lcom/ui/uidb/UiDB$b;)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "productId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "variant"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lab/d$a;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lab/d$a;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lab/d$a;->c:Lab/d$a$b;

    .line 6
    iput-object p4, p0, Lab/d$a;->d:Lcom/ui/uidb/UiDB$b;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lab/d$a$b;Lcom/ui/uidb/UiDB$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lab/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lab/d$a$b;Lcom/ui/uidb/UiDB$b;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lab/d$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c(I)Ljava/net/URI;
    .locals 2

    sget-object v0, LZa/a;->a:LZa/a$a;

    invoke-virtual {v0}, LZa/a$a;->a()LZa/a;

    move-result-object v0

    invoke-virtual {p0}, Lab/d$a;->d()Ljava/net/URI;

    move-result-object v1

    invoke-interface {v0, v1, p1}, LZa/a;->a(Ljava/net/URI;I)Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/net/URI;
    .locals 10

    const-string/jumbo v0, "]"

    const-string/jumbo v1, "Image URL should never get into invalid format! ["

    const-string/jumbo v2, "utf-8"

    :try_start_0
    new-instance v3, Ljava/net/URI;

    const-string/jumbo v4, "https"

    iget-object v5, p0, Lab/d$a;->d:Lcom/ui/uidb/UiDB$b;

    invoke-virtual {v5}, Lcom/ui/uidb/UiDB$b;->getHost()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/fingerprint/ui/images/%s/%s/%s.png"

    iget-object v7, p0, Lab/d$a;->b:Ljava/lang/String;

    invoke-static {v7, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lab/d$a;->c:Lab/d$a$b;

    invoke-virtual {v8}, Lab/d$a$b;->a()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lab/d$a;->a:Ljava/lang/String;

    invoke-static {v9, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v7, v8, v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v7, 0x3

    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v6, "format(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v2, v6}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :goto_0
    new-instance v3, Ljava/lang/IllegalStateException;

    iget-object v4, p0, Lab/d$a;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_1
    new-instance v3, Ljava/lang/IllegalStateException;

    iget-object v4, p0, Lab/d$a;->a:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lab/d$a;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lab/d$a;->a:Ljava/lang/String;

    check-cast p1, Lab/d$a;

    iget-object v2, p1, Lab/d$a;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lab/d$a$a;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lab/d$a;->b:Ljava/lang/String;

    iget-object v2, p1, Lab/d$a;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lua/a$a;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    iget-object v0, p0, Lab/d$a;->d:Lcom/ui/uidb/UiDB$b;

    iget-object v2, p1, Lab/d$a;->d:Lcom/ui/uidb/UiDB$b;

    if-eq v0, v2, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lab/d$a;->c:Lab/d$a$b;

    iget-object p1, p1, Lab/d$a;->c:Lab/d$a$b;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final g()Lab/d$a$b;
    .locals 1

    iget-object v0, p0, Lab/d$a;->c:Lab/d$a$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lab/d$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lab/d$a$a;->d(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$a;->b:Ljava/lang/String;

    invoke-static {v1}, Lua/a$a;->h(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$a;->d:Lcom/ui/uidb/UiDB$b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lab/d$a;->c:Lab/d$a$b;

    invoke-virtual {v1}, Lab/d$a$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
