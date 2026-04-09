.class final Ls0/p$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/p;-><init>(Ls0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/p;


# direct methods
.method constructor <init>(Ls0/p;)V
    .locals 0

    iput-object p1, p0, Ls0/p$a;->a:Ls0/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ls0/p$a;->a:Ls0/p;

    invoke-static {v0}, Ls0/p;->o(Ls0/p;)I

    move-result v0

    iget-object v1, p0, Ls0/p$a;->a:Ls0/p;

    invoke-static {v1}, Ls0/p;->p(Ls0/p;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ls0/p$a;->a:Ls0/p;

    invoke-static {v0}, Ls0/p;->p(Ls0/p;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ls0/p;->q(Ls0/p;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls0/p$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
