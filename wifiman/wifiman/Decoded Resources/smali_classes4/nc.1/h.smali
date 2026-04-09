.class public final synthetic Lnc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lnc/i;

.field public final synthetic b:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lnc/i;Landroid/net/Uri;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/h;->a:Lnc/i;

    iput-object p2, p0, Lnc/h;->b:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnc/h;->a:Lnc/i;

    iget-object v1, p0, Lnc/h;->b:Landroid/net/Uri;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lnc/i;->m(Lnc/i;Landroid/net/Uri;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
