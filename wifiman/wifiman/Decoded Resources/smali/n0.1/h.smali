.class public Ln0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/h$a;,
        Ln0/h$b;
    }
.end annotation


# static fields
.field public static final g:Ln0/h$a;


# instance fields
.field private final a:Ln0/c;

.field private final b:Ln0/c;

.field private final c:Ln0/c;

.field private final d:Ln0/c;

.field private final e:I

.field private final f:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln0/h;->g:Ln0/h$a;

    return-void
.end method

.method private constructor <init>(Ln0/c;Ln0/c;I)V
    .locals 12

    .line 10
    invoke-virtual {p1}, Ln0/c;->e()J

    move-result-wide v0

    sget-object v2, Ln0/b;->a:Ln0/b$a;

    invoke-virtual {v2}, Ln0/b$a;->b()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ln0/b;->e(JJ)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Ln0/k;->a:Ln0/k;

    invoke-virtual {v0}, Ln0/k;->b()Ln0/z;

    move-result-object v0

    invoke-static {p1, v0, v3, v1, v3}, Ln0/d;->d(Ln0/c;Ln0/z;Ln0/a;ILjava/lang/Object;)Ln0/c;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, p1

    .line 11
    :goto_0
    invoke-virtual {p2}, Ln0/c;->e()J

    move-result-wide v4

    invoke-virtual {v2}, Ln0/b$a;->b()J

    move-result-wide v8

    invoke-static {v4, v5, v8, v9}, Ln0/b;->e(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    sget-object v0, Ln0/k;->a:Ln0/k;

    invoke-virtual {v0}, Ln0/k;->b()Ln0/z;

    move-result-object v0

    invoke-static {p2, v0, v3, v1, v3}, Ln0/d;->d(Ln0/c;Ln0/z;Ln0/a;ILjava/lang/Object;)Ln0/c;

    move-result-object v0

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v8, p2

    .line 13
    :goto_1
    sget-object v0, Ln0/h;->g:Ln0/h$a;

    invoke-static {v0, p1, p2, p3}, Ln0/h$a;->a(Ln0/h$a;Ln0/c;Ln0/c;I)[F

    move-result-object v10

    const/4 v11, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move v9, p3

    .line 14
    invoke-direct/range {v4 .. v11}, Ln0/h;-><init>(Ln0/c;Ln0/c;Ln0/c;Ln0/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ln0/c;Ln0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ln0/h;-><init>(Ln0/c;Ln0/c;I)V

    return-void
.end method

.method private constructor <init>(Ln0/c;Ln0/c;Ln0/c;Ln0/c;I[F)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ln0/h;->a:Ln0/c;

    .line 5
    iput-object p2, p0, Ln0/h;->b:Ln0/c;

    .line 6
    iput-object p3, p0, Ln0/h;->c:Ln0/c;

    .line 7
    iput-object p4, p0, Ln0/h;->d:Ln0/c;

    .line 8
    iput p5, p0, Ln0/h;->e:I

    .line 9
    iput-object p6, p0, Ln0/h;->f:[F

    return-void
.end method

.method public synthetic constructor <init>(Ln0/c;Ln0/c;Ln0/c;Ln0/c;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, Ln0/h;-><init>(Ln0/c;Ln0/c;Ln0/c;Ln0/c;I[F)V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 9

    invoke-static {p1, p2}, Lm0/v0;->r(J)F

    move-result v0

    invoke-static {p1, p2}, Lm0/v0;->q(J)F

    move-result v1

    invoke-static {p1, p2}, Lm0/v0;->o(J)F

    move-result v2

    invoke-static {p1, p2}, Lm0/v0;->n(J)F

    move-result v7

    iget-object p1, p0, Ln0/h;->c:Ln0/c;

    invoke-virtual {p1, v0, v1, v2}, Ln0/c;->h(FFF)J

    move-result-wide p1

    const/16 v3, 0x20

    shr-long v3, p1, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr p1, v4

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-object p2, p0, Ln0/h;->c:Ln0/c;

    invoke-virtual {p2, v0, v1, v2}, Ln0/c;->i(FFF)F

    move-result p2

    iget-object v0, p0, Ln0/h;->f:[F

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    aget v1, v0, v1

    mul-float/2addr v3, v1

    const/4 v1, 0x1

    aget v1, v0, v1

    mul-float/2addr p1, v1

    const/4 v1, 0x2

    aget v0, v0, v1

    mul-float/2addr p2, v0

    :cond_0
    move v5, p1

    move v6, p2

    move v4, v3

    iget-object v3, p0, Ln0/h;->d:Ln0/c;

    iget-object v8, p0, Ln0/h;->b:Ln0/c;

    invoke-virtual/range {v3 .. v8}, Ln0/c;->j(FFFFLn0/c;)J

    move-result-wide p1

    return-wide p1
.end method
