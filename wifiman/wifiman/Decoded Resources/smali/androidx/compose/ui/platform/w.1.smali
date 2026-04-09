.class public final synthetic Landroidx/compose/ui/platform/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/platform/x;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/w;->a:Landroidx/compose/ui/platform/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/w;->a:Landroidx/compose/ui/platform/x;

    invoke-static {v0}, Landroidx/compose/ui/platform/x;->p(Landroidx/compose/ui/platform/x;)V

    return-void
.end method
