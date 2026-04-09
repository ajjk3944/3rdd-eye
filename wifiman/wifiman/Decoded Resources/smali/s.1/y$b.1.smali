.class final Ls/y$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/y;->E2(Ly/m;Ly/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly/m;

.field final synthetic b:Ly/j;


# direct methods
.method constructor <init>(Ly/m;Ly/j;)V
    .locals 0

    iput-object p1, p0, Ls/y$b;->a:Ly/m;

    iput-object p2, p0, Ls/y$b;->b:Ly/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Ls/y$b;->a:Ly/m;

    iget-object v0, p0, Ls/y$b;->b:Ly/j;

    invoke-interface {p1, v0}, Ly/m;->c(Ly/j;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ls/y$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
