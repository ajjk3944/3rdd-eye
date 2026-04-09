.class final Lx9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lm0/U0;

.field private final b:Lm0/X0;

.field private final c:Lm0/U0;

.field private final d:Lo0/k;

.field private final e:J


# direct methods
.method private constructor <init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;J)V
    .locals 1

    const-string/jumbo v0, "checkPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "pathMeasure"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "pathToDraw"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "stroke"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lx9/a;->a:Lm0/U0;

    .line 4
    iput-object p2, p0, Lx9/a;->b:Lm0/X0;

    .line 5
    iput-object p3, p0, Lx9/a;->c:Lm0/U0;

    .line 6
    iput-object p4, p0, Lx9/a;->d:Lo0/k;

    .line 7
    iput-wide p5, p0, Lx9/a;->e:J

    return-void
.end method

.method public synthetic constructor <init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p7, 0x1

    if-eqz v0, :cond_0

    .line 8
    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v0, p7, 0x2

    if-eqz v0, :cond_1

    .line 9
    invoke-static {}, Lm0/X;->a()Lm0/X0;

    move-result-object v0

    move-object v3, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_2

    .line 10
    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    move-object v4, v0

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    const/4 v8, 0x0

    move-object v1, p0

    move-object v5, p4

    move-wide v6, p5

    .line 11
    invoke-direct/range {v1 .. v8}, Lx9/a;-><init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lx9/a;-><init>(Lm0/U0;Lm0/X0;Lm0/U0;Lo0/k;J)V

    return-void
.end method


# virtual methods
.method public final a()Lm0/U0;
    .locals 1

    iget-object v0, p0, Lx9/a;->a:Lm0/U0;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lx9/a;->e:J

    return-wide v0
.end method

.method public final c()Lm0/X0;
    .locals 1

    iget-object v0, p0, Lx9/a;->b:Lm0/X0;

    return-object v0
.end method

.method public final d()Lm0/U0;
    .locals 1

    iget-object v0, p0, Lx9/a;->c:Lm0/U0;

    return-object v0
.end method

.method public final e()Lo0/k;
    .locals 1

    iget-object v0, p0, Lx9/a;->d:Lo0/k;

    return-object v0
.end method
