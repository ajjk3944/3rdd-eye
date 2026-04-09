.class public final synthetic Lc/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lc/j$f;


# direct methods
.method public synthetic constructor <init>(Lc/j$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/k;->a:Lc/j$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc/k;->a:Lc/j$f;

    invoke-static {v0}, Lc/j$f;->a(Lc/j$f;)V

    return-void
.end method
