.class final LF/m0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:LL0/d$c;

.field final synthetic c:Landroidx/compose/ui/platform/t1;


# direct methods
.method constructor <init>(LF/m0;LL0/d$c;Landroidx/compose/ui/platform/t1;)V
    .locals 0

    iput-object p1, p0, LF/m0$b;->a:LF/m0;

    iput-object p2, p0, LF/m0$b;->b:LL0/d$c;

    iput-object p3, p0, LF/m0$b;->c:Landroidx/compose/ui/platform/t1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LF/m0$b;->a:LF/m0;

    iget-object v1, p0, LF/m0$b;->b:LL0/d$c;

    invoke-virtual {v1}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL0/i;

    iget-object v2, p0, LF/m0$b;->c:Landroidx/compose/ui/platform/t1;

    invoke-static {v0, v1, v2}, LF/m0;->f(LF/m0;LL0/i;Landroidx/compose/ui/platform/t1;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF/m0$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
