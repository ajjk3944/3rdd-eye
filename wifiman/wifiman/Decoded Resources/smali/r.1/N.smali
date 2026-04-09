.class public final Lr/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/i;


# static fields
.field public static final d:I = 0x8


# instance fields
.field private final a:Lr/D;

.field private final b:Lr/b0;

.field private final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lr/D;Lr/b0;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lr/N;->a:Lr/D;

    .line 4
    iput-object p2, p0, Lr/N;->b:Lr/b0;

    .line 5
    iput-wide p3, p0, Lr/N;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lr/D;Lr/b0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lr/N;-><init>(Lr/D;Lr/b0;J)V

    return-void
.end method


# virtual methods
.method public a(Lr/s0;)Lr/v0;
    .locals 7

    new-instance v6, Lr/C0;

    iget-object v0, p0, Lr/N;->a:Lr/D;

    invoke-interface {v0, p1}, Lr/D;->a(Lr/s0;)Lr/y0;

    move-result-object v1

    iget-object v2, p0, Lr/N;->b:Lr/b0;

    iget-wide v3, p0, Lr/N;->c:J

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lr/C0;-><init>(Lr/y0;Lr/b0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lr/N;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lr/N;

    iget-object v0, p1, Lr/N;->a:Lr/D;

    iget-object v2, p0, Lr/N;->a:Lr/D;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lr/N;->b:Lr/b0;

    iget-object v2, p0, Lr/N;->b:Lr/b0;

    if-ne v0, v2, :cond_0

    iget-wide v2, p1, Lr/N;->c:J

    iget-wide v4, p0, Lr/N;->c:J

    invoke-static {v2, v3, v4, v5}, Lr/k0;->d(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lr/N;->a:Lr/D;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lr/N;->b:Lr/b0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lr/N;->c:J

    invoke-static {v1, v2}, Lr/k0;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
