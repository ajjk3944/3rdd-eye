.class public abstract Lsh/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/j$a;
    }
.end annotation


# static fields
.field public static final d:Lsh/j$a;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsh/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsh/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsh/j;->d:Lsh/j$a;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p5, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lsh/j;->a:J

    invoke-static/range {p1 .. p6}, Lgh/c;->d(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lsh/j;->b:J

    iput-wide p5, p0, Lsh/j;->c:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final i()J
    .locals 2

    iget-wide v0, p0, Lsh/j;->a:J

    return-wide v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lsh/j;->k()LZg/S;

    move-result-object v0

    return-object v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Lsh/j;->b:J

    return-wide v0
.end method

.method public k()LZg/S;
    .locals 8

    new-instance v7, Lsh/k;

    iget-wide v1, p0, Lsh/j;->a:J

    iget-wide v3, p0, Lsh/j;->b:J

    iget-wide v5, p0, Lsh/j;->c:J

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lsh/k;-><init>(JJJ)V

    return-object v7
.end method
