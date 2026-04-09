.class final LN/b$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/b;-><init>(Ljava/lang/Object;Lmh/l;Lmh/a;Lr/i;Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/b;


# direct methods
.method constructor <init>(LN/b;)V
    .locals 0

    iput-object p1, p0, LN/b$g;->a:LN/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LN/b$g;->a:LN/b;

    invoke-static {v0}, LN/b;->d(LN/b;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LN/b$g;->a:LN/b;

    invoke-virtual {v0}, LN/b;->w()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, LN/b;->b(LN/b;FLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    :goto_0
    return-object v0
.end method
