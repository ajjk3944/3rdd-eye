.class public final LQ/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LE/a;

.field private final b:LE/a;

.field private final c:LE/a;

.field private final d:LE/a;

.field private final e:LE/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LE/a;LE/a;LE/a;LE/a;LE/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LQ/u;->a:LE/a;

    .line 3
    iput-object p2, p0, LQ/u;->b:LE/a;

    .line 4
    iput-object p3, p0, LQ/u;->c:LE/a;

    .line 5
    iput-object p4, p0, LQ/u;->d:LE/a;

    .line 6
    iput-object p5, p0, LQ/u;->e:LE/a;

    return-void
.end method

.method public synthetic constructor <init>(LE/a;LE/a;LE/a;LE/a;LE/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    sget-object p1, LQ/t;->a:LQ/t;

    invoke-virtual {p1}, LQ/t;->b()LE/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    .line 8
    sget-object p2, LQ/t;->a:LQ/t;

    invoke-virtual {p2}, LQ/t;->e()LE/a;

    move-result-object p2

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    .line 9
    sget-object p2, LQ/t;->a:LQ/t;

    invoke-virtual {p2}, LQ/t;->d()LE/a;

    move-result-object p3

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    .line 10
    sget-object p2, LQ/t;->a:LQ/t;

    invoke-virtual {p2}, LQ/t;->c()LE/a;

    move-result-object p4

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    .line 11
    sget-object p2, LQ/t;->a:LQ/t;

    invoke-virtual {p2}, LQ/t;->a()LE/a;

    move-result-object p5

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    .line 12
    invoke-direct/range {p2 .. p7}, LQ/u;-><init>(LE/a;LE/a;LE/a;LE/a;LE/a;)V

    return-void
.end method


# virtual methods
.method public final a()LE/a;
    .locals 1

    iget-object v0, p0, LQ/u;->e:LE/a;

    return-object v0
.end method

.method public final b()LE/a;
    .locals 1

    iget-object v0, p0, LQ/u;->a:LE/a;

    return-object v0
.end method

.method public final c()LE/a;
    .locals 1

    iget-object v0, p0, LQ/u;->d:LE/a;

    return-object v0
.end method

.method public final d()LE/a;
    .locals 1

    iget-object v0, p0, LQ/u;->c:LE/a;

    return-object v0
.end method

.method public final e()LE/a;
    .locals 1

    iget-object v0, p0, LQ/u;->b:LE/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQ/u;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, LQ/u;->a:LE/a;

    check-cast p1, LQ/u;

    iget-object v3, p1, LQ/u;->a:LE/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LQ/u;->b:LE/a;

    iget-object v3, p1, LQ/u;->b:LE/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LQ/u;->c:LE/a;

    iget-object v3, p1, LQ/u;->c:LE/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LQ/u;->d:LE/a;

    iget-object v3, p1, LQ/u;->d:LE/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LQ/u;->e:LE/a;

    iget-object p1, p1, LQ/u;->e:LE/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LQ/u;->a:LE/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ/u;->b:LE/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ/u;->c:LE/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ/u;->d:LE/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ/u;->e:LE/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Shapes(extraSmall="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ/u;->a:LE/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", small="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ/u;->b:LE/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", medium="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ/u;->c:LE/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", large="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ/u;->d:LE/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", extraLarge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LQ/u;->e:LE/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
