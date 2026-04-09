.class public final Landroidx/compose/ui/platform/r$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/r;-><init>(Landroid/content/Context;Ldh/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:Ly0/t;

.field final synthetic b:Landroidx/compose/ui/platform/r;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/r;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->b:Landroidx/compose/ui/platform/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Ly0/t;->a:Ly0/t$a;

    invoke-virtual {p1}, Ly0/t$a;->a()Ly0/t;

    move-result-object p1

    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->a:Ly0/t;

    return-void
.end method


# virtual methods
.method public a(Ly0/t;)V
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Ly0/t;->a:Ly0/t$a;

    invoke-virtual {p1}, Ly0/t$a;->a()Ly0/t;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Landroidx/compose/ui/platform/r$q;->a:Ly0/t;

    sget-object v0, Landroidx/compose/ui/platform/K;->a:Landroidx/compose/ui/platform/K;

    iget-object v1, p0, Landroidx/compose/ui/platform/r$q;->b:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0, v1, p1}, Landroidx/compose/ui/platform/K;->a(Landroid/view/View;Ly0/t;)V

    return-void
.end method
