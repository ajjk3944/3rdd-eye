.class public final Lfe/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfe/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lgg/y;
    .locals 2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const-string v1, "computation(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lgg/y;
    .locals 2

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    const-string v1, "io(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
