.class final LF/m$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;


# direct methods
.method constructor <init>(LF/E;)V
    .locals 0

    iput-object p1, p0, LF/m$g;->a:LF/E;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/r;)V
    .locals 1

    iget-object v0, p0, LF/m$g;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LF/j0;->h(LC0/r;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/r;

    invoke-virtual {p0, p1}, LF/m$g;->a(LC0/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
