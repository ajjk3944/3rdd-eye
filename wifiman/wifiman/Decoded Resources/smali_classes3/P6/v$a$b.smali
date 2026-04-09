.class LP6/v$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/v$a;->a(Lgg/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/BroadcastReceiver;

.field final synthetic b:LP6/v$a;


# direct methods
.method constructor <init>(LP6/v$a;Landroid/content/BroadcastReceiver;)V
    .locals 0

    iput-object p1, p0, LP6/v$a$b;->b:LP6/v$a;

    iput-object p2, p0, LP6/v$a$b;->a:Landroid/content/BroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, LP6/v$a$b;->b:LP6/v$a;

    iget-object v0, v0, LP6/v$a;->a:LP6/v;

    iget-object v0, v0, LP6/v;->a:Landroid/content/Context;

    iget-object v1, p0, LP6/v$a$b;->a:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
