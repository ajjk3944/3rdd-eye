.class public final synthetic LI0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic a:LIi/y0;


# direct methods
.method public synthetic constructor <init>(LIi/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI0/e;->a:LIi/y0;

    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 1

    iget-object v0, p0, LI0/e;->a:LIi/y0;

    invoke-static {v0}, LI0/f;->a(LIi/y0;)V

    return-void
.end method
