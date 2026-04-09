.class final LN/c$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/c;->a(ZLmh/a;Landroidx/compose/ui/e;JLandroidx/compose/foundation/o;Landroidx/compose/ui/window/r;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/q0;


# direct methods
.method constructor <init>(LT/q0;)V
    .locals 0

    iput-object p1, p0, LN/c$c;->a:LT/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/p;LY0/p;)V
    .locals 1

    iget-object v0, p0, LN/c$c;->a:LT/q0;

    invoke-static {p1, p2}, LN/j0;->h(LY0/p;LY0/p;)J

    move-result-wide p1

    invoke-static {p1, p2}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/p;

    check-cast p2, LY0/p;

    invoke-virtual {p0, p1, p2}, LN/c$c;->a(LY0/p;LY0/p;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
