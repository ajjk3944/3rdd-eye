.class public final Lrf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/ui/component/network/q$c;


# instance fields
.field private final a:Lrf/e;

.field private final b:Lrf/e;

.field private final c:Lcom/ui/wifiman/ui/teleport/y;

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)V
    .locals 1

    const-string v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myself"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/f;->a:Lrf/e;

    iput-object p2, p0, Lrf/f;->b:Lrf/e;

    iput-object p3, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    sget-object p1, Lcom/ui/wifiman/ui/component/network/q$a;->WIRELESS:Lcom/ui/wifiman/ui/component/network/q$a;

    invoke-static {p2, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lrf/f;->d:Ljava/util/List;

    return-void
.end method

.method public static synthetic e(Lrf/f;Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;ILjava/lang/Object;)Lrf/f;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lrf/f;->a:Lrf/e;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lrf/f;->b:Lrf/e;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lrf/f;->d(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)Lrf/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lrf/f;->d:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic b()Lcom/ui/wifiman/ui/component/network/q$b;
    .locals 1

    invoke-virtual {p0}, Lrf/f;->f()Lrf/e;

    move-result-object v0

    return-object v0
.end method

.method public c()Lmh/p;
    .locals 1

    new-instance v0, Lrf/f$a;

    invoke-direct {v0, p0}, Lrf/f$a;-><init>(Lrf/f;)V

    return-object v0
.end method

.method public final d(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)Lrf/f;
    .locals 1

    const-string v0, "console"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myself"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tunnelState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrf/f;

    invoke-direct {v0, p1, p2, p3}, Lrf/f;-><init>(Lrf/e;Lrf/e;Lcom/ui/wifiman/ui/teleport/y;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrf/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrf/f;

    iget-object v1, p0, Lrf/f;->a:Lrf/e;

    iget-object v3, p1, Lrf/f;->a:Lrf/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lrf/f;->b:Lrf/e;

    iget-object v3, p1, Lrf/f;->b:Lrf/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    iget-object p1, p1, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public f()Lrf/e;
    .locals 1

    iget-object v0, p0, Lrf/f;->a:Lrf/e;

    return-object v0
.end method

.method public final g()Lcom/ui/wifiman/ui/teleport/y;
    .locals 1

    iget-object v0, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lrf/f;->a:Lrf/e;

    invoke-virtual {v0}, Lrf/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrf/f;->b:Lrf/e;

    invoke-virtual {v1}, Lrf/e;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lrf/f;->a:Lrf/e;

    iget-object v1, p0, Lrf/f;->b:Lrf/e;

    iget-object v2, p0, Lrf/f;->c:Lcom/ui/wifiman/ui/teleport/y;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "State(console="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", myself="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", tunnelState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
