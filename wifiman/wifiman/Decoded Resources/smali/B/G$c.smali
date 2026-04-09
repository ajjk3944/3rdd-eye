.class final LB/G$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/G;->d(Ljava/lang/Object;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LB/G;

.field final synthetic b:Ljava/lang/Object;


# direct methods
.method constructor <init>(LB/G;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LB/G$c;->a:LB/G;

    iput-object p2, p0, LB/G$c;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 2

    iget-object p1, p0, LB/G$c;->a:LB/G;

    invoke-static {p1}, LB/G;->g(LB/G;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    iget-object v0, p0, LB/G$c;->b:Ljava/lang/Object;

    invoke-interface {p1, v0}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LB/G$c;->a:LB/G;

    iget-object v0, p0, LB/G$c;->b:Ljava/lang/Object;

    new-instance v1, LB/G$c$a;

    invoke-direct {v1, p1, v0}, LB/G$c$a;-><init>(LB/G;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, LB/G$c;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
