.class public final synthetic Lnc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lnc/i;

.field public final synthetic b:Lec/a;


# direct methods
.method public synthetic constructor <init>(Lnc/i;Lec/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnc/f;->a:Lnc/i;

    iput-object p2, p0, Lnc/f;->b:Lec/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lnc/f;->a:Lnc/i;

    iget-object v1, p0, Lnc/f;->b:Lec/a;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lnc/i;->h(Lnc/i;Lec/a;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
