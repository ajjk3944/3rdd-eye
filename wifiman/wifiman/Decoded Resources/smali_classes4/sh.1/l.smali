.class public final Lsh/l;
.super Lsh/j;
.source "SourceFile"

# interfaces
.implements Lsh/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/l$a;
    }
.end annotation


# static fields
.field public static final e:Lsh/l$a;

.field private static final f:Lsh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsh/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsh/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsh/l;->e:Lsh/l$a;

    new-instance v0, Lsh/l;

    const-wide/16 v1, 0x1

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lsh/l;-><init>(JJ)V

    sput-object v0, Lsh/l;->f:Lsh/l;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 7

    const-wide/16 v5, 0x1

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v6}, Lsh/j;-><init>(JJJ)V

    return-void
.end method

.method public static final synthetic q()Lsh/l;
    .locals 1

    sget-object v0, Lsh/l;->f:Lsh/l;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic e()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, Lsh/l;->u()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Lsh/l;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lsh/l;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lsh/l;

    invoke-virtual {v0}, Lsh/l;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v0

    check-cast p1, Lsh/l;

    invoke-virtual {p1}, Lsh/j;->i()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v0

    invoke-virtual {p1}, Lsh/j;->j()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic g()Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0}, Lsh/l;->s()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 7

    invoke-virtual {p0}, Lsh/l;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x1f

    int-to-long v0, v0

    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v2

    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v4

    const/16 v6, 0x20

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    mul-long/2addr v0, v2

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v2

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v4

    ushr-long/2addr v4, v6

    xor-long/2addr v2, v4

    add-long/2addr v0, v2

    long-to-int v0, v0

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 4

    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lsh/j;->j()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/lang/Long;
    .locals 2

    invoke-virtual {p0}, Lsh/j;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
