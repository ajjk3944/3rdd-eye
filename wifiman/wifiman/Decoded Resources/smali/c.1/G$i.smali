.class final Lc/G$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field private final a:Lc/F;

.field final synthetic b:Lc/G;


# direct methods
.method public constructor <init>(Lc/G;Lc/F;)V
    .locals 1

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lc/G$i;->b:Lc/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/G$i;->a:Lc/F;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, Lc/G$i;->b:Lc/G;

    invoke-static {v0}, Lc/G;->b(Lc/G;)LZg/m;

    move-result-object v0

    iget-object v1, p0, Lc/G$i;->a:Lc/F;

    invoke-virtual {v0, v1}, LZg/m;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lc/G$i;->b:Lc/G;

    invoke-static {v0}, Lc/G;->a(Lc/G;)Lc/F;

    move-result-object v0

    iget-object v1, p0, Lc/G$i;->a:Lc/F;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/G$i;->a:Lc/F;

    invoke-virtual {v0}, Lc/F;->c()V

    iget-object v0, p0, Lc/G$i;->b:Lc/G;

    invoke-static {v0, v1}, Lc/G;->f(Lc/G;Lc/F;)V

    :cond_0
    iget-object v0, p0, Lc/G$i;->a:Lc/F;

    invoke-virtual {v0, p0}, Lc/F;->i(Lc/c;)V

    iget-object v0, p0, Lc/G$i;->a:Lc/F;

    invoke-virtual {v0}, Lc/F;->b()Lmh/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lc/G$i;->a:Lc/F;

    invoke-virtual {v0, v1}, Lc/F;->k(Lmh/a;)V

    return-void
.end method
