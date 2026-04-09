.class public final Ltg/g;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/g$a;
    }
.end annotation


# instance fields
.field final a:Lgg/u;


# direct methods
.method public constructor <init>(Lgg/u;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/g;->a:Lgg/u;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    new-instance v0, Ltg/g$a;

    invoke-direct {v0, p1}, Ltg/g$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    :try_start_0
    iget-object p1, p0, Ltg/g;->a:Lgg/u;

    invoke-interface {p1, v0}, Lgg/u;->a(Lgg/t;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Ltg/g$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
