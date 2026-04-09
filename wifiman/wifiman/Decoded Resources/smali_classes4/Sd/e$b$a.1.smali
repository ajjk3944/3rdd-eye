.class public final LSd/e$b$a;
.super LSd/e$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSd/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lh9/a;

.field private final c:Linet/ipaddr/g;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/Set;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;)V
    .locals 1

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trustedCerts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LSd/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, LSd/e$b$a;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, LSd/e$b$a;->b:Lh9/a;

    .line 5
    iput-object p3, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    .line 6
    iput-object p4, p0, LSd/e$b$a;->d:Ljava/lang/String;

    .line 7
    iput-object p5, p0, LSd/e$b$a;->e:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LSd/e$b$a;-><init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic b(LSd/e$b$a;Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)LSd/e$b$a;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LSd/e$b$a;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LSd/e$b$a;->b:Lh9/a;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, LSd/e$b$a;->d:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, LSd/e$b$a;->e:Ljava/util/Set;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, LSd/e$b$a;->a(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;)LSd/e$b$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;)LSd/e$b$a;
    .locals 8

    const-string v0, "consoleId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trustedCerts"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSd/e$b$a;

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v7}, LSd/e$b$a;-><init>(Ljava/lang/String;Lh9/a;Linet/ipaddr/g;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSd/e$b$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    return-object v0
.end method

.method public final e()Lh9/a;
    .locals 1

    iget-object v0, p0, LSd/e$b$a;->b:Lh9/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LSd/e$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LSd/e$b$a;

    iget-object v1, p0, LSd/e$b$a;->a:Ljava/lang/String;

    iget-object v3, p1, LSd/e$b$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LSd/e$b$a;->b:Lh9/a;

    iget-object v3, p1, LSd/e$b$a;->b:Lh9/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    iget-object v3, p1, LSd/e$b$a;->c:Linet/ipaddr/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LSd/e$b$a;->d:Ljava/lang/String;

    iget-object v3, p1, LSd/e$b$a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LSd/e$b$a;->e:Ljava/util/Set;

    iget-object p1, p1, LSd/e$b$a;->e:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSd/e$b$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LSd/e$b$a;->e:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LSd/e$b$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->j(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LSd/e$b$a;->b:Lh9/a;

    invoke-virtual {v1}, Lh9/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    invoke-virtual {v1}, Linet/ipaddr/a;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LSd/e$b$a;->d:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LSd/e$b$a;->e:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LSd/e$b$a;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/console/e$b;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LSd/e$b$a;->b:Lh9/a;

    iget-object v2, p0, LSd/e$b$a;->c:Linet/ipaddr/g;

    iget-object v3, p0, LSd/e$b$a;->d:Ljava/lang/String;

    iget-object v4, p0, LSd/e$b$a;->e:Ljava/util/Set;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Direct(consoleId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mac="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ip="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", ncaToken="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", trustedCerts="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
