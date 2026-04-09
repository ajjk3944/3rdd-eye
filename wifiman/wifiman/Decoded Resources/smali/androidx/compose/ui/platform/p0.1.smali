.class public final synthetic Landroidx/compose/ui/platform/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/d$c;


# instance fields
.field public final synthetic a:Lc0/h;


# direct methods
.method public synthetic constructor <init>(Lc0/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/p0;->a:Lc0/h;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/p0;->a:Lc0/h;

    invoke-static {v0}, Landroidx/compose/ui/platform/q0;->a(Lc0/h;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
