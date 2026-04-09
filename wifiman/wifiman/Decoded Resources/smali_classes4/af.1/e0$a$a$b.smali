.class public final Laf/e0$a$a$b;
.super Laf/e0$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laf/e0$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/Boolean;

.field private final b:Z

.field private final c:Ls9/d;

.field private final d:Ls9/d;

.field private final e:Ls9/d;

.field private final f:Ls9/d;

.field private final g:Ls9/d;

.field private final h:Lhf/h;

.field private final i:Lhf/h;

.field private final j:Laf/e0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;ZLs9/d;Ls9/d;Ls9/d;Ls9/d;Ls9/d;Lhf/h;Lhf/h;)V
    .locals 1

    const-string v0, "timestamp"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speed"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latency"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chartDown"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chartUp"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Laf/e0$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    iput-boolean p2, p0, Laf/e0$a$a$b;->b:Z

    iput-object p3, p0, Laf/e0$a$a$b;->c:Ls9/d;

    iput-object p4, p0, Laf/e0$a$a$b;->d:Ls9/d;

    iput-object p5, p0, Laf/e0$a$a$b;->e:Ls9/d;

    iput-object p6, p0, Laf/e0$a$a$b;->f:Ls9/d;

    iput-object p7, p0, Laf/e0$a$a$b;->g:Ls9/d;

    iput-object p8, p0, Laf/e0$a$a$b;->h:Lhf/h;

    iput-object p9, p0, Laf/e0$a$a$b;->i:Lhf/h;

    sget-object p1, Laf/e0$b;->RESULT:Laf/e0$b;

    iput-object p1, p0, Laf/e0$a$a$b;->j:Laf/e0$b;

    return-void
.end method


# virtual methods
.method public a()Laf/e0$b;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->j:Laf/e0$b;

    return-object v0
.end method

.method public b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    return-object v0
.end method

.method public c()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->c:Ls9/d;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Laf/e0$a$a$b;->b:Z

    return v0
.end method

.method public final e()Lhf/h;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->h:Lhf/h;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laf/e0$a$a$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laf/e0$a$a$b;

    iget-object v1, p0, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    iget-object v3, p1, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Laf/e0$a$a$b;->b:Z

    iget-boolean v3, p1, Laf/e0$a$a$b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Laf/e0$a$a$b;->c:Ls9/d;

    iget-object v3, p1, Laf/e0$a$a$b;->c:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Laf/e0$a$a$b;->d:Ls9/d;

    iget-object v3, p1, Laf/e0$a$a$b;->d:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Laf/e0$a$a$b;->e:Ls9/d;

    iget-object v3, p1, Laf/e0$a$a$b;->e:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Laf/e0$a$a$b;->f:Ls9/d;

    iget-object v3, p1, Laf/e0$a$a$b;->f:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Laf/e0$a$a$b;->g:Ls9/d;

    iget-object v3, p1, Laf/e0$a$a$b;->g:Ls9/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Laf/e0$a$a$b;->h:Lhf/h;

    iget-object v3, p1, Laf/e0$a$a$b;->h:Lhf/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Laf/e0$a$a$b;->i:Lhf/h;

    iget-object p1, p1, Laf/e0$a$a$b;->i:Lhf/h;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()Lhf/h;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->i:Lhf/h;

    return-object v0
.end method

.method public final g()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->e:Ls9/d;

    return-object v0
.end method

.method public final h()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->g:Ls9/d;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Laf/e0$a$a$b;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Laf/e0$a$a$b;->c:Ls9/d;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->d:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->e:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->f:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->g:Ls9/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->h:Lhf/h;

    invoke-virtual {v1}, Lhf/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Laf/e0$a$a$b;->i:Lhf/h;

    invoke-virtual {v1}, Lhf/h;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->f:Ls9/d;

    return-object v0
.end method

.method public final j()Ls9/d;
    .locals 1

    iget-object v0, p0, Laf/e0$a$a$b;->d:Ls9/d;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Laf/e0$a$a$b;->a:Ljava/lang/Boolean;

    iget-boolean v1, p0, Laf/e0$a$a$b;->b:Z

    iget-object v2, p0, Laf/e0$a$a$b;->c:Ls9/d;

    iget-object v3, p0, Laf/e0$a$a$b;->d:Ls9/d;

    iget-object v4, p0, Laf/e0$a$a$b;->e:Ls9/d;

    iget-object v5, p0, Laf/e0$a$a$b;->f:Ls9/d;

    iget-object v6, p0, Laf/e0$a$a$b;->g:Ls9/d;

    iget-object v7, p0, Laf/e0$a$a$b;->h:Lhf/h;

    iget-object v8, p0, Laf/e0$a$a$b;->i:Lhf/h;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Result(advancedTestEnabled="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", startTestButtonEnabled="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", selectedTestServerName="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timestamp="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", direction="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", speed="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latency="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chartDown="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", chartUp="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
