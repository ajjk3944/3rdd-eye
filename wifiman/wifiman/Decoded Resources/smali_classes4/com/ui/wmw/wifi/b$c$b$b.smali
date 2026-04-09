.class public final Lcom/ui/wmw/wifi/b$c$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/wifi/b$c$b;->a(Ljava/lang/Throwable;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/wifi/b$c$b$b;->a:Ljava/lang/Throwable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/ui/wmw/wifi/b$c$b$a;->a:Lcom/ui/wmw/wifi/b$c$b$a;

    iget-object v1, p0, Lcom/ui/wmw/wifi/b$c$b$b;->a:Ljava/lang/Throwable;

    invoke-static {v0, v1}, LNf/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
