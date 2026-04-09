.class public final LY9/l$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/l;->G0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LY9/l;


# direct methods
.method public constructor <init>(LY9/l;)V
    .locals 0

    iput-object p1, p0, LY9/l$f;->a:LY9/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LY9/l$f;->a:LY9/l;

    invoke-static {v0}, LY9/l;->J0(LY9/l;)LFg/a;

    move-result-object v0

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, v1}, LFg/a;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LY9/l$f;->a:LY9/l;

    invoke-virtual {v0}, LY9/l;->M0()LLi/z;

    move-result-object v0

    sget-object v1, LY9/k$a;->AUTH:LY9/k$a;

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY9/l$f;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
