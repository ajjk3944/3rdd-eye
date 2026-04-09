.class final Landroidx/compose/ui/platform/O$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O$b;->a(LIi/N;)Landroidx/compose/ui/platform/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/O;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/O;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O$b$a;->a:Landroidx/compose/ui/platform/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/O$b$a;->a:Landroidx/compose/ui/platform/O;

    invoke-static {v0}, Landroidx/compose/ui/platform/O;->c(Landroidx/compose/ui/platform/O;)LIi/N;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/O;->f(LIi/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/O$b$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
