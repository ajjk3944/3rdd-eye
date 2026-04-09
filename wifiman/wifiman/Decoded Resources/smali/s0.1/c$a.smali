.class final Ls0/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/c;


# direct methods
.method constructor <init>(Ls0/c;)V
    .locals 0

    iput-object p1, p0, Ls0/c$a;->a:Ls0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls0/k;)V
    .locals 1

    iget-object v0, p0, Ls0/c$a;->a:Ls0/c;

    invoke-static {v0, p1}, Ls0/c;->e(Ls0/c;Ls0/k;)V

    iget-object v0, p0, Ls0/c$a;->a:Ls0/c;

    invoke-virtual {v0}, Ls0/c;->b()Lmh/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls0/k;

    invoke-virtual {p0, p1}, Ls0/c$a;->a(Ls0/k;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
