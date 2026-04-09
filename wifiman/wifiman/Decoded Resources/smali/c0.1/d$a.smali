.class final Lc0/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc0/d;-><init>(Lc0/k;Lc0/h;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc0/d;


# direct methods
.method constructor <init>(Lc0/d;)V
    .locals 0

    iput-object p1, p0, Lc0/d$a;->a:Lc0/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lc0/d$a;->a:Lc0/d;

    invoke-static {v0}, Lc0/d;->e(Lc0/d;)Lc0/k;

    move-result-object v0

    iget-object v1, p0, Lc0/d$a;->a:Lc0/d;

    invoke-static {v1}, Lc0/d;->f(Lc0/d;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v2}, Lc0/k;->b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Value should be initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
