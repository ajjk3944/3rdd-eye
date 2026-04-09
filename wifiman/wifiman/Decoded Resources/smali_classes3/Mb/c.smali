.class public final LMb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMb/c$a;
    }
.end annotation


# static fields
.field public static final e:LMb/c$a;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/Long;

.field private final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LMb/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LMb/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LMb/c;->e:LMb/c$a;

    return-void
.end method

.method public constructor <init>(IILjava/lang/Long;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LMb/c;->a:I

    iput p2, p0, LMb/c;->b:I

    iput-object p3, p0, LMb/c;->c:Ljava/lang/Long;

    iput-boolean p4, p0, LMb/c;->d:Z

    return-void
.end method

.method public static synthetic b(LMb/c;IILjava/lang/Long;ZILjava/lang/Object;)LMb/c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, LMb/c;->a:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, LMb/c;->b:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, LMb/c;->c:Ljava/lang/Long;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, LMb/c;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LMb/c;->a(IILjava/lang/Long;Z)LMb/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IILjava/lang/Long;Z)LMb/c;
    .locals 1

    new-instance v0, LMb/c;

    invoke-direct {v0, p1, p2, p3, p4}, LMb/c;-><init>(IILjava/lang/Long;Z)V

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LMb/c;->b:I

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LMb/c;->d:Z

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LMb/c;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LMb/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LMb/c;

    iget v1, p0, LMb/c;->a:I

    iget v3, p1, LMb/c;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LMb/c;->b:I

    iget v3, p1, LMb/c;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LMb/c;->c:Ljava/lang/Long;

    iget-object v3, p1, LMb/c;->c:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LMb/c;->d:Z

    iget-boolean p1, p1, LMb/c;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, LMb/c;->c:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LMb/c;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LMb/c;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LMb/c;->c:Ljava/lang/Long;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LMb/c;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, LMb/c;->a:I

    iget v1, p0, LMb/c;->b:I

    iget-object v2, p0, LMb/c;->c:Ljava/lang/Long;

    iget-boolean v3, p0, LMb/c;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "RoomAppReviewState(id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", appLaunchedDaysCount="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lastAppLaunchTimestamp="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", appReviewFlowDisplayed="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
