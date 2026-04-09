.class final Lc/j$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/j;


# direct methods
.method constructor <init>(Lc/j;)V
    .locals 0

    iput-object p1, p0, Lc/j$i;->a:Lc/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lc/D;
    .locals 4

    new-instance v0, Lc/D;

    iget-object v1, p0, Lc/j$i;->a:Lc/j;

    invoke-static {v1}, Lc/j;->d0(Lc/j;)Lc/j$e;

    move-result-object v1

    new-instance v2, Lc/j$i$a;

    iget-object v3, p0, Lc/j$i;->a:Lc/j;

    invoke-direct {v2, v3}, Lc/j$i$a;-><init>(Lc/j;)V

    invoke-direct {v0, v1, v2}, Lc/D;-><init>(Ljava/util/concurrent/Executor;Lmh/a;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lc/j$i;->a()Lc/D;

    move-result-object v0

    return-object v0
.end method
