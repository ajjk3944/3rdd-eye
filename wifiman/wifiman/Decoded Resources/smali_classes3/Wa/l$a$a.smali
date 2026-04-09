.class final LWa/l$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWa/l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:LWa/l$a$b;


# direct methods
.method constructor <init>(Landroid/content/Context;LWa/l$a$b;)V
    .locals 0

    iput-object p1, p0, LWa/l$a$a;->a:Landroid/content/Context;

    iput-object p2, p0, LWa/l$a$a;->b:LWa/l$a$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LWa/l$a$a;->a:Landroid/content/Context;

    iget-object v1, p0, LWa/l$a$a;->b:LWa/l$a$b;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    sget-object v0, LWa/l$a$a$a;->a:LWa/l$a$a$a;

    invoke-static {v0}, LUa/a;->e(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWa/l$a$a;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
