.class final LA/B$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/B;-><init>(IILA/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA/B;

.field final synthetic b:I


# direct methods
.method constructor <init>(LA/B;I)V
    .locals 0

    iput-object p1, p0, LA/B$e;->a:LA/B;

    iput p2, p0, LA/B$e;->b:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LB/L;)V
    .locals 6

    iget-object v0, p0, LA/B$e;->a:LA/B;

    invoke-static {v0}, LA/B;->h(LA/B;)LA/w;

    move-result-object v0

    iget v1, p0, LA/B$e;->b:I

    sget-object v2, Landroidx/compose/runtime/snapshots/g;->e:Landroidx/compose/runtime/snapshots/g$a;

    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/g$a;->d()Landroidx/compose/runtime/snapshots/g;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/g;->h()Lmh/l;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/g$a;->f(Landroidx/compose/runtime/snapshots/g;)Landroidx/compose/runtime/snapshots/g;

    move-result-object v5

    invoke-virtual {v2, v3, v5, v4}, Landroidx/compose/runtime/snapshots/g$a;->m(Landroidx/compose/runtime/snapshots/g;Landroidx/compose/runtime/snapshots/g;Lmh/l;)V

    invoke-interface {v0, p1, v1}, LA/w;->a(LB/L;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LB/L;

    invoke-virtual {p0, p1}, LA/B$e;->a(LB/L;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
