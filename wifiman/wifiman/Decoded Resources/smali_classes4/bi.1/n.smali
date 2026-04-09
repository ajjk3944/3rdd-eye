.class public abstract Lbi/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(LBh/b;)V
.end method

.method public abstract b(LBh/b;LBh/b;)V
.end method

.method public abstract c(LBh/b;LBh/b;)V
.end method

.method public d(LBh/b;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overridden"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LBh/b;->x0(Ljava/util/Collection;)V

    return-void
.end method
