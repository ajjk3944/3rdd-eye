.class LP6/v$a$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/v$a;->a(Lgg/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/t;

.field final synthetic b:LP6/v$a;


# direct methods
.method constructor <init>(LP6/v$a;Lgg/t;)V
    .locals 0

    iput-object p1, p0, LP6/v$a$a;->b:LP6/v$a;

    iput-object p2, p0, LP6/v$a$a;->a:Lgg/t;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, LP6/v$a$a;->b:LP6/v$a;

    iget-object p1, p1, LP6/v$a;->a:LP6/v;

    iget-object p1, p1, LP6/v;->b:LP6/x;

    invoke-interface {p1}, LP6/x;->a()Z

    move-result p1

    iget-object p2, p0, LP6/v$a$a;->a:Lgg/t;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p2, p1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method
