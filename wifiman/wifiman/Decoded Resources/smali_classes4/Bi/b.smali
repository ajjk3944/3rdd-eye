.class public final LBi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBi/b$a;
    }
.end annotation


# static fields
.field public static final c:LBi/b$a;

.field private static final d:LBi/b;

.field private static final e:Ljava/util/Comparator;


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LBi/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LBi/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LBi/b;->c:LBi/b$a;

    new-instance v0, LBi/b;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2, v1, v2}, LBi/b;-><init>(JJ)V

    sput-object v0, LBi/b;->d:LBi/b;

    new-instance v0, LBi/a;

    invoke-direct {v0}, LBi/a;-><init>()V

    sput-object v0, LBi/b;->e:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LBi/b;->a:J

    iput-wide p3, p0, LBi/b;->b:J

    return-void
.end method

.method public static synthetic a(LBi/b;LBi/b;)I
    .locals 0

    invoke-static {p0, p1}, LBi/b;->c(LBi/b;LBi/b;)I

    move-result p0

    return p0
.end method

.method private static final c(LBi/b;LBi/b;)I
    .locals 4

    const-string v0, "a"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, LBi/b;->a:J

    iget-wide v2, p1, LBi/b;->a:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    iget-wide p0, p1, LBi/b;->a:J

    invoke-static {p0, p1}, LYg/E;->b(J)J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, LBi/b;->b:J

    invoke-static {v0, v1}, LYg/E;->b(J)J

    move-result-wide v0

    iget-wide p0, p1, LBi/b;->b:J

    invoke-static {p0, p1}, LYg/E;->b(J)J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final synthetic d()LBi/b;
    .locals 1

    sget-object v0, LBi/b;->d:LBi/b;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LBi/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-wide v3, p0, LBi/b;->a:J

    check-cast p1, LBi/b;

    iget-wide v5, p1, LBi/b;->a:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, LBi/b;->b:J

    iget-wide v5, p1, LBi/b;->b:J

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, LBi/b;->a:J

    iget-wide v2, p0, LBi/b;->b:J

    xor-long/2addr v0, v2

    const/16 v2, 0x20

    shr-long v2, v0, v2

    long-to-int v2, v2

    long-to-int v0, v0

    xor-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    const/16 v0, 0x24

    new-array v0, v0, [B

    iget-wide v1, p0, LBi/b;->b:J

    const/16 v3, 0x18

    const/4 v4, 0x6

    invoke-static {v1, v2, v0, v3, v4}, LBi/d;->b(J[BII)V

    const/16 v1, 0x17

    const/16 v2, 0x2d

    aput-byte v2, v0, v1

    iget-wide v3, p0, LBi/b;->b:J

    const/16 v1, 0x30

    ushr-long/2addr v3, v1

    const/16 v1, 0x13

    const/4 v5, 0x2

    invoke-static {v3, v4, v0, v1, v5}, LBi/d;->b(J[BII)V

    const/16 v1, 0x12

    aput-byte v2, v0, v1

    iget-wide v3, p0, LBi/b;->a:J

    const/16 v1, 0xe

    invoke-static {v3, v4, v0, v1, v5}, LBi/d;->b(J[BII)V

    const/16 v1, 0xd

    aput-byte v2, v0, v1

    iget-wide v3, p0, LBi/b;->a:J

    const/16 v1, 0x10

    ushr-long/2addr v3, v1

    const/16 v1, 0x9

    invoke-static {v3, v4, v0, v1, v5}, LBi/d;->b(J[BII)V

    const/16 v1, 0x8

    aput-byte v2, v0, v1

    iget-wide v1, p0, LBi/b;->a:J

    const/16 v3, 0x20

    ushr-long/2addr v1, v3

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {v1, v2, v0, v3, v4}, LBi/d;->b(J[BII)V

    invoke-static {v0}, Lkotlin/text/t;->y([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
