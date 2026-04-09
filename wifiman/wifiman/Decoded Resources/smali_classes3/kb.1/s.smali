.class public final Lkb/s;
.super Lkb/r;
.source "SourceFile"


# instance fields
.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 1

    const-string/jumbo v0, "onResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lkb/r;-><init>()V

    iput-object p1, p0, Lkb/s;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lkb/p;
    .locals 1

    invoke-virtual {p0}, Lkb/s;->g()Lkb/t;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lkb/p;)V
    .locals 0

    check-cast p1, Lkb/t;

    invoke-virtual {p0, p1}, Lkb/s;->h(Lkb/t;)V

    return-void
.end method

.method protected g()Lkb/t;
    .locals 1

    new-instance v0, Lkb/t;

    invoke-direct {v0}, Lkb/t;-><init>()V

    return-object v0
.end method

.method protected h(Lkb/t;)V
    .locals 1

    const-string/jumbo v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkb/s;->b:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
