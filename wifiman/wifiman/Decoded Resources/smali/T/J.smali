.class final LT/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/S0;


# instance fields
.field private final a:Lmh/l;

.field private b:LT/K;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/J;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LT/J;->b:LT/K;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/K;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LT/J;->b:LT/K;

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LT/J;->a:Lmh/l;

    invoke-static {}, LT/O;->h()LT/L;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/K;

    iput-object v0, p0, LT/J;->b:LT/K;

    return-void
.end method
