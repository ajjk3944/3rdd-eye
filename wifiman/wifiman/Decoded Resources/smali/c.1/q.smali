.class public final synthetic Lc/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/r;


# direct methods
.method public synthetic constructor <init>(Lc/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/q;->a:Lc/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc/q;->a:Lc/r;

    invoke-static {v0}, Lc/r;->a(Lc/r;)V

    return-void
.end method
