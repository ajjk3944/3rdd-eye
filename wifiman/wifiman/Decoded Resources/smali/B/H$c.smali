.class final LB/H$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/H;->a(Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/h;


# direct methods
.method constructor <init>(Lc0/h;)V
    .locals 0

    iput-object p1, p0, LB/H$c;->a:Lc0/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LB/G;
    .locals 3

    new-instance v0, LB/G;

    iget-object v1, p0, LB/H$c;->a:Lc0/h;

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LB/G;-><init>(Lc0/h;Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB/H$c;->a()LB/G;

    move-result-object v0

    return-object v0
.end method
