.class public final synthetic LI/D0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:LI/o1;


# direct methods
.method public synthetic constructor <init>(LI/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/D0;->a:LI/o1;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, LI/D0;->a:LI/o1;

    invoke-static {v0}, LI/E0;->b(LI/o1;)V

    return-void
.end method
