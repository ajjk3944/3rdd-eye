.class public final Lde/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lgc/a;

.field private final b:Lgc/b;

.field private final c:Lgc/c;


# direct methods
.method public constructor <init>(Lgc/a;Lgc/b;Lgc/c;)V
    .locals 1

    const-string v0, "section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurementType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lde/y;->a:Lgc/a;

    .line 3
    iput-object p2, p0, Lde/y;->b:Lgc/b;

    .line 4
    iput-object p3, p0, Lde/y;->c:Lgc/c;

    return-void
.end method

.method public synthetic constructor <init>(Lgc/a;Lgc/b;Lgc/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    sget-object p1, Lgc/a;->SIGNAL:Lgc/a;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    sget-object p2, Lgc/b;->SIGNAL:Lgc/b;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    sget-object p3, Lgc/c;->WIFI:Lgc/c;

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lde/y;-><init>(Lgc/a;Lgc/b;Lgc/c;)V

    return-void
.end method

.method public static synthetic b(Lde/y;Lgc/a;Lgc/b;Lgc/c;ILjava/lang/Object;)Lde/y;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lde/y;->a:Lgc/a;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lde/y;->b:Lgc/b;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lde/y;->c:Lgc/c;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lde/y;->a(Lgc/a;Lgc/b;Lgc/c;)Lde/y;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lgc/a;Lgc/b;Lgc/c;)Lde/y;
    .locals 1

    const-string v0, "section"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurementType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signalType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/y;

    invoke-direct {v0, p1, p2, p3}, Lde/y;-><init>(Lgc/a;Lgc/b;Lgc/c;)V

    return-object v0
.end method

.method public final c()Lgc/b;
    .locals 1

    iget-object v0, p0, Lde/y;->b:Lgc/b;

    return-object v0
.end method

.method public final d()Lgc/a;
    .locals 1

    iget-object v0, p0, Lde/y;->a:Lgc/a;

    return-object v0
.end method

.method public final e()Lgc/c;
    .locals 1

    iget-object v0, p0, Lde/y;->c:Lgc/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lde/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lde/y;

    iget-object v1, p0, Lde/y;->a:Lgc/a;

    iget-object v3, p1, Lde/y;->a:Lgc/a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lde/y;->b:Lgc/b;

    iget-object v3, p1, Lde/y;->b:Lgc/b;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lde/y;->c:Lgc/c;

    iget-object p1, p1, Lde/y;->c:Lgc/c;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lde/y;->a:Lgc/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lde/y;->b:Lgc/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lde/y;->c:Lgc/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lde/y;->a:Lgc/a;

    iget-object v1, p0, Lde/y;->b:Lgc/b;

    iget-object v2, p0, Lde/y;->c:Lgc/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SignalTabConfig(section="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", measurementType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", signalType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
