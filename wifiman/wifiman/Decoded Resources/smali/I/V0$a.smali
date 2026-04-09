.class final LI/V0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/V0;->performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/V0;


# direct methods
.method constructor <init>(LI/V0;)V
    .locals 0

    iput-object p1, p0, LI/V0$a;->a:LI/V0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LR0/i;)V
    .locals 1

    iget-object v0, p0, LI/V0$a;->a:LI/V0;

    invoke-static {v0, p1}, LI/V0;->b(LI/V0;LR0/i;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LR0/i;

    invoke-virtual {p0, p1}, LI/V0$a;->a(LR0/i;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
