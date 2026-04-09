.class public final synthetic Landroidx/compose/ui/window/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmh/a;


# direct methods
.method public synthetic constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/window/l;->a:Lmh/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/window/l;->a:Lmh/a;

    invoke-static {v0}, Landroidx/compose/ui/window/k$g;->a(Lmh/a;)V

    return-void
.end method
