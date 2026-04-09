.class final Landroidx/compose/ui/window/b$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/k;

.field final synthetic b:Landroidx/compose/ui/window/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/k;Landroidx/compose/ui/window/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/k;

    iput-object p2, p0, Landroidx/compose/ui/window/b$d;->b:Landroidx/compose/ui/window/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/L;)LT/K;
    .locals 1

    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/k;

    iget-object v0, p0, Landroidx/compose/ui/window/b$d;->b:Landroidx/compose/ui/window/q;

    invoke-virtual {p1, v0}, Landroidx/compose/ui/window/k;->setPositionProvider(Landroidx/compose/ui/window/q;)V

    iget-object p1, p0, Landroidx/compose/ui/window/b$d;->a:Landroidx/compose/ui/window/k;

    invoke-virtual {p1}, Landroidx/compose/ui/window/k;->x()V

    new-instance p1, Landroidx/compose/ui/window/b$d$a;

    invoke-direct {p1}, Landroidx/compose/ui/window/b$d$a;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/L;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/window/b$d;->a(LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method
