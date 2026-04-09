.class final Lz7/g$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/g;-><init>(Ljava/lang/String;Ljava/util/List;LA7/d;Ljava/lang/Integer;Lz7/x;Lmh/l;ZLp7/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/g;


# direct methods
.method constructor <init>(Lz7/g;)V
    .locals 0

    iput-object p1, p0, Lz7/g$i;->a:Lz7/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lz7/w;
    .locals 3

    new-instance v0, Lz7/w;

    iget-object v1, p0, Lz7/g$i;->a:Lz7/g;

    invoke-virtual {v1}, Lz7/g;->k()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lz7/g$i;->a:Lz7/g;

    invoke-static {v2}, Lz7/g;->g(Lz7/g;)Lp7/b;

    move-result-object v2

    invoke-interface {v2}, Lp7/b;->a()Lgg/y;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lz7/w;-><init>(Ljava/util/List;Lgg/y;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz7/g$i;->a()Lz7/w;

    move-result-object v0

    return-object v0
.end method
