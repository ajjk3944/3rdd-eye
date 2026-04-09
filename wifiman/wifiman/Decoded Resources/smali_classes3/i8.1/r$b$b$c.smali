.class public final Li8/r$b$b$c;
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 3

    :try_start_0
    new-instance v0, Lxe/f$a$b$a;

    new-instance v1, Lxe/F$g;

    sget-object v2, LQe/c$a;->TELEPORT:LQe/c$a;

    invoke-direct {v1, v2}, Lxe/F$g;-><init>(LQe/c$a;)V

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
