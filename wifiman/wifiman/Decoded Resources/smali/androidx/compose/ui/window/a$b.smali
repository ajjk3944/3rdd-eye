.class final Landroidx/compose/ui/window/a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/a;->a(Lmh/a;Landroidx/compose/ui/window/i;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/j;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/window/i;

.field final synthetic d:LY0/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/j;Lmh/a;Landroidx/compose/ui/window/i;LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/a$b;->a:Landroidx/compose/ui/window/j;

    iput-object p2, p0, Landroidx/compose/ui/window/a$b;->b:Lmh/a;

    iput-object p3, p0, Landroidx/compose/ui/window/a$b;->c:Landroidx/compose/ui/window/i;

    iput-object p4, p0, Landroidx/compose/ui/window/a$b;->d:LY0/t;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/window/a$b;->a:Landroidx/compose/ui/window/j;

    iget-object v1, p0, Landroidx/compose/ui/window/a$b;->b:Lmh/a;

    iget-object v2, p0, Landroidx/compose/ui/window/a$b;->c:Landroidx/compose/ui/window/i;

    iget-object v3, p0, Landroidx/compose/ui/window/a$b;->d:LY0/t;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/compose/ui/window/j;->o(Lmh/a;Landroidx/compose/ui/window/i;LY0/t;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/window/a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
