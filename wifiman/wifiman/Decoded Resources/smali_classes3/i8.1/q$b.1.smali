.class final Li8/q$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:J

.field private final b:Li8/a$b;


# direct methods
.method public constructor <init>(JLi8/a$b;)V
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Li8/q$b;->a:J

    iput-object p3, p0, Li8/q$b;->b:Li8/a$b;

    return-void
.end method


# virtual methods
.method public final a()Li8/a$b;
    .locals 1

    iget-object v0, p0, Li8/q$b;->b:Li8/a$b;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Li8/q$b;->a:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    instance-of v0, p1, Li8/q$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li8/q$b;->b:Li8/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    check-cast p1, Li8/q$b;

    iget-object v1, p1, Li8/q$b;->b:Li8/a$b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p1, Li8/q$b;->a:J

    iget-wide v2, p0, Li8/q$b;->a:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Li8/q$b;->b:Li8/a$b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
