.class public final Ln8/f$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/f$a;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/f$a;


# direct methods
.method public constructor <init>(Ln8/f$a;)V
    .locals 0

    iput-object p1, p0, Ln8/f$a$d;->a:Ln8/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ln8/f$a$d;->a:Ln8/f$a;

    invoke-static {v0}, Ln8/f$a;->c(Ln8/f$a;)La8/b;

    move-result-object v0

    iget-object v1, p0, Ln8/f$a$d;->a:Ln8/f$a;

    invoke-static {v1}, Ln8/f$a;->b(Ln8/f$a;)Linet/ipaddr/g;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
