.class public final Lcom/ubnt/usurvey/wifi/WifiMcs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/wifi/WifiMcs$a;,
        Lcom/ubnt/usurvey/wifi/WifiMcs$b;,
        Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;,
        Lcom/ubnt/usurvey/wifi/WifiMcs$c;
    }
.end annotation


# static fields
.field public static final d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;


# instance fields
.field private final a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

.field private final b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ubnt/usurvey/wifi/WifiMcs$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ubnt/usurvey/wifi/WifiMcs;->d:Lcom/ubnt/usurvey/wifi/WifiMcs$b;

    return-void
.end method

.method public constructor <init>(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;I)V
    .locals 1

    const-string/jumbo v0, "modulation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "coding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    iput-object p2, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    iput p3, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/ubnt/usurvey/wifi/WifiMcs$a;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    return-object v0
.end method

.method public final b()Lcom/ubnt/usurvey/wifi/WifiMcs$c;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ubnt/usurvey/wifi/WifiMcs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ubnt/usurvey/wifi/WifiMcs;

    iget-object v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    iget-object v3, p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    iget-object v3, p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    iget p1, p1, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->a:Lcom/ubnt/usurvey/wifi/WifiMcs$c;

    iget-object v1, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->b:Lcom/ubnt/usurvey/wifi/WifiMcs$a;

    iget v2, p0, Lcom/ubnt/usurvey/wifi/WifiMcs;->c:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "WifiMcs(modulation="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", coding="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", spatialStreams="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
