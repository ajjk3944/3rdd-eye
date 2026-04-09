.class final Landroidx/compose/ui/platform/O$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/O;->b(Landroidx/compose/ui/platform/L0;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/L0;

.field final synthetic b:Landroidx/compose/ui/platform/O;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/L0;Landroidx/compose/ui/platform/O;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/O$b;->a:Landroidx/compose/ui/platform/L0;

    iput-object p2, p0, Landroidx/compose/ui/platform/O$b;->b:Landroidx/compose/ui/platform/O;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LIi/N;)Landroidx/compose/ui/platform/x0;
    .locals 3

    new-instance p1, Landroidx/compose/ui/platform/x0;

    iget-object v0, p0, Landroidx/compose/ui/platform/O$b;->a:Landroidx/compose/ui/platform/L0;

    new-instance v1, Landroidx/compose/ui/platform/O$b$a;

    iget-object v2, p0, Landroidx/compose/ui/platform/O$b;->b:Landroidx/compose/ui/platform/O;

    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/O$b$a;-><init>(Landroidx/compose/ui/platform/O;)V

    invoke-direct {p1, v0, v1}, Landroidx/compose/ui/platform/x0;-><init>(Landroidx/compose/ui/platform/L0;Lmh/a;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/O$b;->a(LIi/N;)Landroidx/compose/ui/platform/x0;

    move-result-object p1

    return-object p1
.end method
