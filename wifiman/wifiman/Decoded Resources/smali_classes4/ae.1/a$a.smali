.class public final Lae/a$a;
.super Lae/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lae/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Ljava/lang/String;

.field private final c:Lh9/a;

.field private final d:Lmh/l;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Ljava/lang/String;Lh9/a;Lmh/l;)V
    .locals 1

    const-string v0, "ssoAccountId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consoleId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceMac"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lae/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lae/a$a;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, Lae/a$a;->b:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lae/a$a;->c:Lh9/a;

    .line 6
    iput-object p4, p0, Lae/a$a;->d:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Ljava/lang/String;Lh9/a;Lmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lae/a$a;-><init>(Ljava/util/UUID;Ljava/lang/String;Lh9/a;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lae/a$a;->d:Lmh/l;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lae/a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lae/a$a;->a:Ljava/util/UUID;

    check-cast p1, Lae/a$a;

    iget-object v3, p1, Lae/a$a;->a:Ljava/util/UUID;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->d(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lae/a$a;->b:Ljava/lang/String;

    iget-object v3, p1, Lae/a$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lae/a$a;->c:Lh9/a;

    iget-object p1, p1, Lae/a$a;->c:Lh9/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lae/a$a;->a:Ljava/util/UUID;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/b$a;->e(Ljava/util/UUID;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lae/a$a;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->j(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lae/a$a;->c:Lh9/a;

    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
