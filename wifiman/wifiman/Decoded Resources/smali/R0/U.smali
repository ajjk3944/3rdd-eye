.class public final synthetic LR0/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LR0/V;


# direct methods
.method public synthetic constructor <init>(LR0/V;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/U;->a:LR0/V;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LR0/U;->a:LR0/V;

    invoke-static {v0}, LR0/V;->i(LR0/V;)V

    return-void
.end method
