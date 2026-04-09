.class final Lr/c0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0;-><init>(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/c0;


# direct methods
.method constructor <init>(Lr/c0;)V
    .locals 0

    iput-object p1, p0, Lr/c0$f;->a:Lr/c0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lr/c0$f;->a:Lr/c0;

    invoke-static {v0}, Lr/c0;->p(Lr/c0;)Lr/o0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lr/o0;->q()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lr/c0;->W(J)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lr/c0$f;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
