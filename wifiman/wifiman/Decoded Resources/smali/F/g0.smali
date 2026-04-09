.class final LF/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:LY0/t;

.field private b:LY0/d;

.field private c:LQ0/k$b;

.field private d:LL0/U;

.field private e:Ljava/lang/Object;

.field private f:J


# direct methods
.method public constructor <init>(LY0/t;LY0/d;LQ0/k$b;LL0/U;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/g0;->a:LY0/t;

    iput-object p2, p0, LF/g0;->b:LY0/d;

    iput-object p3, p0, LF/g0;->c:LQ0/k$b;

    iput-object p4, p0, LF/g0;->d:LL0/U;

    iput-object p5, p0, LF/g0;->e:Ljava/lang/Object;

    invoke-direct {p0}, LF/g0;->a()J

    move-result-wide p1

    iput-wide p1, p0, LF/g0;->f:J

    return-void
.end method

.method private final a()J
    .locals 7

    iget-object v0, p0, LF/g0;->d:LL0/U;

    iget-object v1, p0, LF/g0;->b:LY0/d;

    iget-object v2, p0, LF/g0;->c:LQ0/k$b;

    const/16 v5, 0x18

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LF/X;->b(LL0/U;LY0/d;LQ0/k$b;Ljava/lang/String;IILjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final b()J
    .locals 2

    iget-wide v0, p0, LF/g0;->f:J

    return-wide v0
.end method

.method public final c(LY0/t;LY0/d;LQ0/k$b;LL0/U;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LF/g0;->a:LY0/t;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LF/g0;->b:LY0/d;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/g0;->c:LQ0/k$b;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/g0;->d:LL0/U;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/g0;->e:Ljava/lang/Object;

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, LF/g0;->a:LY0/t;

    iput-object p2, p0, LF/g0;->b:LY0/d;

    iput-object p3, p0, LF/g0;->c:LQ0/k$b;

    iput-object p4, p0, LF/g0;->d:LL0/U;

    iput-object p5, p0, LF/g0;->e:Ljava/lang/Object;

    invoke-direct {p0}, LF/g0;->a()J

    move-result-wide p1

    iput-wide p1, p0, LF/g0;->f:J

    :cond_1
    return-void
.end method
