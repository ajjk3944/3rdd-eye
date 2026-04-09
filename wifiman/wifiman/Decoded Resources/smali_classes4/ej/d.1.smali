.class final Lej/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lej/B;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Z(Lej/e;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Lej/e;->d(J)V

    return-void
.end method

.method public c()Lej/E;
    .locals 1

    sget-object v0, Lej/E;->f:Lej/E;

    return-object v0
.end method

.method public close()V
    .locals 0

    return-void
.end method

.method public flush()V
    .locals 0

    return-void
.end method
