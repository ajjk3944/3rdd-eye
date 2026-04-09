.class public final synthetic LI/C0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:LM/G;


# direct methods
.method public synthetic constructor <init>(LM/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/C0;->a:LM/G;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, LI/C0;->a:LM/G;

    invoke-static {v0}, LI/E0;->a(LM/G;)V

    return-void
.end method
