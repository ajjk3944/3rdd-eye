.class final LB/G$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/G$b;->a(Lc0/h;)Lc0/k;
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

    iput-object p1, p0, LB/G$b$b;->a:Lc0/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)LB/G;
    .locals 2

    new-instance v0, LB/G;

    iget-object v1, p0, LB/G$b$b;->a:Lc0/h;

    invoke-direct {v0, v1, p1}, LB/G;-><init>(Lc0/h;Ljava/util/Map;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LB/G$b$b;->a(Ljava/util/Map;)LB/G;

    move-result-object p1

    return-object p1
.end method
