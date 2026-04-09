.class public final Lde/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lic/e;

.field private final b:Lic/d;

.field private final c:Lic/c;

.field private final d:Lic/b;


# direct methods
.method public constructor <init>(Lic/e;Lic/d;Lic/c;Lic/b;)V
    .locals 1

    const-string v0, "chartSpectrum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortTypeNetworks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortTypeChannelHealth"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanFeature"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lde/E;->a:Lic/e;

    .line 3
    iput-object p2, p0, Lde/E;->b:Lic/d;

    .line 4
    iput-object p3, p0, Lde/E;->c:Lic/c;

    .line 5
    iput-object p4, p0, Lde/E;->d:Lic/b;

    return-void
.end method

.method public synthetic constructor <init>(Lic/e;Lic/d;Lic/c;Lic/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lic/e;->ALL:Lic/e;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    sget-object p2, Lic/d;->SSID:Lic/d;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 8
    sget-object p3, Lic/c;->NUMBER:Lic/c;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 9
    sget-object p4, Lic/b;->NETWORKS:Lic/b;

    .line 10
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lde/E;-><init>(Lic/e;Lic/d;Lic/c;Lic/b;)V

    return-void
.end method

.method public static synthetic b(Lde/E;Lic/e;Lic/d;Lic/c;Lic/b;ILjava/lang/Object;)Lde/E;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lde/E;->a:Lic/e;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lde/E;->b:Lic/d;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lde/E;->c:Lic/c;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lde/E;->d:Lic/b;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lde/E;->a(Lic/e;Lic/d;Lic/c;Lic/b;)Lde/E;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lic/e;Lic/d;Lic/c;Lic/b;)Lde/E;
    .locals 1

    const-string v0, "chartSpectrum"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortTypeNetworks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sortTypeChannelHealth"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanFeature"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/E;

    invoke-direct {v0, p1, p2, p3, p4}, Lde/E;-><init>(Lic/e;Lic/d;Lic/c;Lic/b;)V

    return-object v0
.end method

.method public final c()Lic/e;
    .locals 1

    iget-object v0, p0, Lde/E;->a:Lic/e;

    return-object v0
.end method

.method public final d()Lic/b;
    .locals 1

    iget-object v0, p0, Lde/E;->d:Lic/b;

    return-object v0
.end method

.method public final e()Lic/c;
    .locals 1

    iget-object v0, p0, Lde/E;->c:Lic/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lde/E;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lde/E;

    iget-object v1, p0, Lde/E;->a:Lic/e;

    iget-object v3, p1, Lde/E;->a:Lic/e;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lde/E;->b:Lic/d;

    iget-object v3, p1, Lde/E;->b:Lic/d;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lde/E;->c:Lic/c;

    iget-object v3, p1, Lde/E;->c:Lic/c;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lde/E;->d:Lic/b;

    iget-object p1, p1, Lde/E;->d:Lic/b;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lic/d;
    .locals 1

    iget-object v0, p0, Lde/E;->b:Lic/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lde/E;->a:Lic/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lde/E;->b:Lic/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lde/E;->c:Lic/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lde/E;->d:Lic/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lde/E;->a:Lic/e;

    iget-object v1, p0, Lde/E;->b:Lic/d;

    iget-object v2, p0, Lde/E;->c:Lic/c;

    iget-object v3, p0, Lde/E;->d:Lic/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WifiScanHomeConfig(chartSpectrum="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sortTypeNetworks="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sortTypeChannelHealth="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scanFeature="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
