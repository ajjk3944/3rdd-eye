.class public final Lhf/t$a$b;
.super Lhf/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhf/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lhf/t$b;

.field private final b:Lhf/t$c;

.field private final c:Lhf/t$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;)V
    .locals 1

    const-string v0, "internetNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetStats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "myself"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lhf/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lhf/t$a$b;->a:Lhf/t$b;

    iput-object p2, p0, Lhf/t$a$b;->b:Lhf/t$c;

    iput-object p3, p0, Lhf/t$a$b;->c:Lhf/t$b;

    return-void
.end method


# virtual methods
.method public a()Lhf/t$b;
    .locals 1

    iget-object v0, p0, Lhf/t$a$b;->a:Lhf/t$b;

    return-object v0
.end method

.method public final b()Lhf/t$b;
    .locals 1

    iget-object v0, p0, Lhf/t$a$b;->c:Lhf/t$b;

    return-object v0
.end method

.method public final c()Lhf/t$c;
    .locals 1

    iget-object v0, p0, Lhf/t$a$b;->b:Lhf/t$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lhf/t$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lhf/t$a$b;

    iget-object v1, p0, Lhf/t$a$b;->a:Lhf/t$b;

    iget-object v3, p1, Lhf/t$a$b;->a:Lhf/t$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lhf/t$a$b;->b:Lhf/t$c;

    iget-object v3, p1, Lhf/t$a$b;->b:Lhf/t$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lhf/t$a$b;->c:Lhf/t$b;

    iget-object p1, p1, Lhf/t$a$b;->c:Lhf/t$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lhf/t$a$b;->a:Lhf/t$b;

    invoke-virtual {v0}, Lhf/t$b;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhf/t$a$b;->b:Lhf/t$c;

    invoke-virtual {v1}, Lhf/t$c;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lhf/t$a$b;->c:Lhf/t$b;

    invoke-virtual {v1}, Lhf/t$b;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lhf/t$a$b;->a:Lhf/t$b;

    iget-object v1, p0, Lhf/t$a$b;->b:Lhf/t$c;

    iget-object v2, p0, Lhf/t$a$b;->c:Lhf/t$b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Direct(internetNode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetStats="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", myself="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
