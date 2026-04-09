.class public final Li8/r$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/r$e;->a(Ljava/lang/Boolean;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Li8/r$e$a;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Li8/r$e$a;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxe/f$a$b$a;

    sget-object v1, Lxe/F$a;->a:Lxe/F$a;

    invoke-direct {v0, v1}, Lxe/f$a$b$a;-><init>(Lxe/F;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
