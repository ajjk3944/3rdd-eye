.class public final LX9/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c;->i1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LX9/c;


# direct methods
.method public constructor <init>(LX9/c;)V
    .locals 0

    iput-object p1, p0, LX9/c$h;->a:LX9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LX9/c$h;->a:LX9/c;

    invoke-static {v0}, LX9/c;->P0(LX9/c;)Lka/a;

    move-result-object v0

    sget-object v1, Lka/a$a;->TICK:Lka/a$a;

    invoke-interface {v0, v1}, Lka/a;->a(Lka/a$a;)V

    iget-object v0, p0, LX9/c$h;->a:LX9/c;

    invoke-virtual {v0}, LX9/c;->W0()LLi/z;

    move-result-object v0

    iget-object v1, p0, LX9/c$h;->a:LX9/c;

    invoke-virtual {v1}, LX9/c;->Z0()Ls9/d;

    move-result-object v1

    invoke-interface {v0, v1}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX9/c$h;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
