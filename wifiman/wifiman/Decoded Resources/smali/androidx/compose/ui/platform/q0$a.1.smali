.class final Landroidx/compose/ui/platform/q0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/q0;->c(Ljava/lang/String;Lq2/f;)Landroidx/compose/ui/platform/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lq2/d;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(ZLq2/d;Ljava/lang/String;)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/q0$a;->a:Z

    iput-object p2, p0, Landroidx/compose/ui/platform/q0$a;->b:Lq2/d;

    iput-object p3, p0, Landroidx/compose/ui/platform/q0$a;->c:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/platform/q0$a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/q0$a;->b:Lq2/d;

    iget-object v1, p0, Landroidx/compose/ui/platform/q0$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lq2/d;->j(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/q0$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
