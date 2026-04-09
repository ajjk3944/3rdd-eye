.class public final LLi/G;
.super LMi/c;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:Ldh/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LMi/c;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, LLi/G;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LLi/E;

    invoke-virtual {p0, p1}, LLi/G;->c(LLi/E;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Ldh/e;
    .locals 0

    check-cast p1, LLi/E;

    invoke-virtual {p0, p1}, LLi/G;->d(LLi/E;)[Ldh/e;

    move-result-object p1

    return-object p1
.end method

.method public c(LLi/E;)Z
    .locals 4

    iget-wide v0, p0, LLi/G;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LLi/E;->Z()J

    move-result-wide v0

    iput-wide v0, p0, LLi/G;->a:J

    const/4 p1, 0x1

    return p1
.end method

.method public d(LLi/E;)[Ldh/e;
    .locals 4

    iget-wide v0, p0, LLi/G;->a:J

    const-wide/16 v2, -0x1

    iput-wide v2, p0, LLi/G;->a:J

    const/4 v2, 0x0

    iput-object v2, p0, LLi/G;->b:Ldh/e;

    invoke-virtual {p1, v0, v1}, LLi/E;->Y(J)[Ldh/e;

    move-result-object p1

    return-object p1
.end method
