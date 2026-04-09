.class public final Lrg/b;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/b$a;
    }
.end annotation


# instance fields
.field final a:Lgg/q;


# direct methods
.method public constructor <init>(Lgg/q;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/b;->a:Lgg/q;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 1

    new-instance v0, Lrg/b$a;

    invoke-direct {v0, p1}, Lrg/b$a;-><init>(Lgg/p;)V

    invoke-interface {p1, v0}, Lgg/p;->c(Lhg/c;)V

    :try_start_0
    iget-object p1, p0, Lrg/b;->a:Lgg/q;

    invoke-interface {p1, v0}, Lgg/q;->a(Lgg/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lrg/b$a;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
