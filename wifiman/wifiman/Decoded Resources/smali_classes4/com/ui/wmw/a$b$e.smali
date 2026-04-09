.class public final Lcom/ui/wmw/a$b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/a$b;->a(Ljava/util/concurrent/atomic/AtomicInteger;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/a$b$e;->a:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/ui/wmw/a$b$e;->a:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Lcom/ui/wmw/g;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/ui/wmw/WMWizard$a$a$a$b;

    invoke-direct {v1, v0}, Lcom/ui/wmw/WMWizard$a$a$a$b;-><init>(Lcom/ui/wmw/g;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v1, Lcom/ui/wmw/WMWizard$a$a$b$a;->a:Lcom/ui/wmw/WMWizard$a$a$b$a;

    :goto_0
    invoke-interface {p1, v1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
