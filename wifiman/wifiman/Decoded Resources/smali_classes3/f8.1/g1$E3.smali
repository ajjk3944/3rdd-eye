.class public final Lf8/g1$E3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;


# direct methods
.method public constructor <init>(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Lf8/g1$E3;->a:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Luj/b;Landroidx/lifecycle/E;)Landroidx/lifecycle/N;
    .locals 1

    const-string v0, "$this$Factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "savedState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf8/g1$E3;->a:Lmh/p;

    invoke-interface {v0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/N;

    invoke-static {p1, p2}, Lze/g;->a(Landroidx/lifecycle/N;Landroidx/lifecycle/E;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luj/b;

    check-cast p2, Landroidx/lifecycle/E;

    invoke-virtual {p0, p1, p2}, Lf8/g1$E3;->a(Luj/b;Landroidx/lifecycle/E;)Landroidx/lifecycle/N;

    move-result-object p1

    return-object p1
.end method
