.class public final LRa/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRa/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/ui/sso/account/UIAccountManager;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/ui/sso/api/UiAccountApi$d;


# direct methods
.method public constructor <init>(Lcom/ui/sso/account/UIAccountManager;Ljava/lang/String;Lcom/ui/sso/api/UiAccountApi$d;)V
    .locals 1

    const-string/jumbo v0, "accountManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "accountType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "supportFile"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    iput-object p2, p0, LRa/b$a;->b:Ljava/lang/String;

    iput-object p3, p0, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/sso/account/UIAccountManager;
    .locals 1

    iget-object v0, p0, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRa/b$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/ui/sso/api/UiAccountApi$d;
    .locals 1

    iget-object v0, p0, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LRa/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LRa/b$a;

    iget-object v1, p0, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    iget-object v3, p1, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LRa/b$a;->b:Ljava/lang/String;

    iget-object v3, p1, LRa/b$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    iget-object p1, p1, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LRa/b$a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LRa/b$a;->a:Lcom/ui/sso/account/UIAccountManager;

    iget-object v1, p0, LRa/b$a;->b:Ljava/lang/String;

    iget-object v2, p0, LRa/b$a;->c:Lcom/ui/sso/api/UiAccountApi$d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Params(accountManager="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", accountType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", supportFile="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
