.class final Landroidx/compose/ui/platform/O$c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/x0;

.field final synthetic b:Landroidx/compose/ui/platform/O;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/x0;Landroidx/compose/ui/platform/O;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O$c$a;->a:Landroidx/compose/ui/platform/x0;

    iput-object p2, p0, Landroidx/compose/ui/platform/O$c$a;->b:Landroidx/compose/ui/platform/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/O$c$a;->a:Landroidx/compose/ui/platform/x0;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/x0;->d()V

    iget-object p1, p0, Landroidx/compose/ui/platform/O$c$a;->b:Landroidx/compose/ui/platform/O;

    invoke-static {p1}, Landroidx/compose/ui/platform/O;->d(Landroidx/compose/ui/platform/O;)LR0/T;

    move-result-object p1

    invoke-virtual {p1}, LR0/T;->f()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/O$c$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
