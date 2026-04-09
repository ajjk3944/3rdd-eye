.class public final Laf/e0$a$a$a;
.super Laf/e0$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/e0$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Boolean;

.field private final b:Z

.field private final c:Ls9/d;

.field private final d:Laf/e0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;ZLs9/d;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Laf/e0$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    iput-boolean p2, p0, Laf/e0$a$a$a;->b:Z

    iput-object p3, p0, Laf/e0$a$a$a;->c:Ls9/d;

    sget-object p1, Laf/e0$b;->NO_RESULT:Laf/e0$b;

    iput-object p1, p0, Laf/e0$a$a$a;->d:Laf/e0$b;

    return-void
.end method


# virtual methods
.method public a()Laf/e0$b;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$a;->d:Laf/e0$b;

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    return-object v0
.end method

.method public c()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$a;->c:Ls9/d;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Laf/e0$a$a$a;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laf/e0$a$a$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laf/e0$a$a$a;

    iget-object v1, p0, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    iget-object v3, p1, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Laf/e0$a$a$a;->b:Z

    iget-boolean v3, p1, Laf/e0$a$a$a;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Laf/e0$a$a$a;->c:Ls9/d;

    iget-object p1, p1, Laf/e0$a$a$a;->c:Ls9/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Laf/e0$a$a$a;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Laf/e0$a$a$a;->c:Ls9/d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Laf/e0$a$a$a;->a:Ljava/lang/Boolean;

    iget-boolean v1, p0, Laf/e0$a$a$a;->b:Z

    iget-object v2, p0, Laf/e0$a$a$a;->c:Ls9/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "NoResult(advancedTestEnabled="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startTestButtonEnabled="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectedTestServerName="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
