.class final Landroidx/compose/foundation/f$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/f;->Q2(Ly0/G;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/f$c;->a:Landroidx/compose/foundation/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/foundation/f$c;->a:Landroidx/compose/foundation/f;

    invoke-static {p1}, Landroidx/compose/foundation/f;->d3(Landroidx/compose/foundation/f;)Lmh/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/f$c;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
