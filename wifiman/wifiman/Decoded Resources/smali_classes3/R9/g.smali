.class public final synthetic LR9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR9/g;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LR9/g;->a:Lmh/p;

    check-cast p1, Lq2/f;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {v0, p1, p2}, LR9/i;->b(Lmh/p;Lq2/f;Landroid/os/Bundle;)Landroidx/lifecycle/P$c;

    move-result-object p1

    return-object p1
.end method
