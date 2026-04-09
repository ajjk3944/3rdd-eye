.class public final LWa/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWa/k;


# instance fields
.field private final a:LLi/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;LIi/J;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherDefault"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LWa/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LWa/l$a;-><init>(Landroid/content/Context;Ldh/e;)V

    invoke-static {v0}, LLi/i;->e(Lmh/p;)LLi/g;

    move-result-object p1

    invoke-static {p1, p2}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p1

    iput-object p1, p0, LWa/l;->a:LLi/g;

    return-void
.end method


# virtual methods
.method public a()LLi/g;
    .locals 1

    iget-object v0, p0, LWa/l;->a:LLi/g;

    return-object v0
.end method
