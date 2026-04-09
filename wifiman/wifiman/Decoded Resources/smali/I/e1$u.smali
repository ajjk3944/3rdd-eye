.class final LI/e1$u;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;->r0(Landroid/view/KeyEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$u;->a:LI/e1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LI/e1$u;->a:LI/e1;

    invoke-virtual {v0}, LI/e1;->a3()LF/D;

    move-result-object v1

    invoke-virtual {v1}, LF/D;->g()I

    move-result v1

    invoke-static {v0, v1}, LI/e1;->Q2(LI/e1;I)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$u;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
