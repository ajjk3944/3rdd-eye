.class public final Landroidx/compose/ui/platform/J1$d;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/J1;->e(Landroid/content/Context;)LLi/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LKi/g;


# direct methods
.method constructor <init>(LKi/g;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/J1$d;->a:LKi/g;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(ZLandroid/net/Uri;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/J1$d;->a:LKi/g;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-interface {p1, p2}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
