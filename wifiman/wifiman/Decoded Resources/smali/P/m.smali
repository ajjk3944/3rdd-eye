.class public final synthetic LP/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LP/n;


# direct methods
.method public synthetic constructor <init>(LP/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP/m;->a:LP/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LP/m;->a:LP/n;

    invoke-static {v0}, LP/n;->a(LP/n;)V

    return-void
.end method
