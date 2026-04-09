.class final Landroidx/compose/animation/a$f$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$d;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/runtime/snapshots/k;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/snapshots/k;Ljava/lang/Object;Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$d$a;->a:Landroidx/compose/runtime/snapshots/k;

    iput-object p2, p0, Landroidx/compose/animation/a$f$d$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f$d$a;->c:Landroidx/compose/animation/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 3

    iget-object p1, p0, Landroidx/compose/animation/a$f$d$a;->a:Landroidx/compose/runtime/snapshots/k;

    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a;->b:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a;->c:Landroidx/compose/animation/e;

    new-instance v2, Landroidx/compose/animation/a$f$d$a$a;

    invoke-direct {v2, p1, v0, v1}, Landroidx/compose/animation/a$f$d$a$a;-><init>(Landroidx/compose/runtime/snapshots/k;Ljava/lang/Object;Landroidx/compose/animation/e;)V

    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$f$d$a;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
