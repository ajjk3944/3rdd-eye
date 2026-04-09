.class public final LWa/l$a$b;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWa/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKi/t;


# direct methods
.method constructor <init>(LKi/t;)V
    .locals 0

    iput-object p1, p0, LWa/l$a$b;->a:LKi/t;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    const-string/jumbo p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LWa/l$a$b;->a:LKi/t;

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v1

    new-instance v3, LWa/l$a$b$a;

    iget-object p1, p0, LWa/l$a$b;->a:LKi/t;

    const/4 p2, 0x0

    invoke-direct {v3, p1, p2}, LWa/l$a$b$a;-><init>(LKi/t;Ldh/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
