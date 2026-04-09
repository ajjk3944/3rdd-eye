.class LG6/E$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/E$a;->a(Lgg/t;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/BroadcastReceiver;

.field final synthetic b:LG6/E$a;


# direct methods
.method constructor <init>(LG6/E$a;Landroid/content/BroadcastReceiver;)V
    .locals 0

    iput-object p1, p0, LG6/E$a$b;->b:LG6/E$a;

    iput-object p2, p0, LG6/E$a$b;->a:Landroid/content/BroadcastReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 2

    iget-object v0, p0, LG6/E$a$b;->b:LG6/E$a;

    iget-object v0, v0, LG6/E$a;->a:Landroid/content/Context;

    iget-object v1, p0, LG6/E$a$b;->a:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
