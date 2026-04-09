.class public final Li8/r$b$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r$b$b;->a(Li8/s;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/s;


# direct methods
.method public constructor <init>(Li8/s;)V
    .locals 0

    iput-object p1, p0, Li8/r$b$b$b;->a:Li8/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 4

    :try_start_0
    new-instance v0, Lxe/f$a$b$a;

    new-instance v1, Lxe/F$m$c;

    new-instance v2, Lsf/b;

    iget-object v3, p0, Li8/r$b$b$b;->a:Li8/s;

    check-cast v3, Li8/s$g;

    invoke-virtual {v3}, Li8/s$g;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lsf/b;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lxe/F$m$c;-><init>(Lsf/b;)V

    invoke-direct {v0, v1}, Lxe/f$a$b$a;-><init>(Lxe/F;)V

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
