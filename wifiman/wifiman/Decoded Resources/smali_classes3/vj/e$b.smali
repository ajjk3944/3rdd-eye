.class final Lvj/e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/e;-><init>(Lvj/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvj/e;


# direct methods
.method constructor <init>(Lvj/e;)V
    .locals 0

    iput-object p1, p0, Lvj/e$b;->a:Lvj/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lvj/d;
    .locals 2

    iget-object v0, p0, Lvj/e$b;->a:Lvj/e;

    invoke-static {v0}, Lvj/e;->a(Lvj/e;)Lvj/d;

    move-result-object v0

    invoke-virtual {v0}, Lvj/d;->e()Lmh/a;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvj/e$b;->a:Lvj/e;

    invoke-static {v0}, Lvj/e;->a(Lvj/e;)Lvj/d;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DI has not been initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvj/e$b;->a()Lvj/d;

    move-result-object v0

    return-object v0
.end method
