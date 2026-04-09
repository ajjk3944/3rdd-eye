.class public final LU9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU9/h$a;


# instance fields
.field private final a:Lcom/ui/core/ui/sso/UiSSO$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/ui/core/ui/sso/UiSSO$a;)V
    .locals 1

    const-string/jumbo v0, "authResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    return-void
.end method


# virtual methods
.method public final a()Lcom/ui/core/ui/sso/UiSSO$a;
    .locals 1

    iget-object v0, p0, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LU9/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LU9/k;

    iget-object v1, p0, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    iget-object p1, p1, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LU9/k;->a:Lcom/ui/core/ui/sso/UiSSO$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "StartFlow(authResponse="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
