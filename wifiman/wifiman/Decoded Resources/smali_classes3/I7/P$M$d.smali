.class public final LI7/P$M$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$M;->h(LI7/P$b;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI7/P;


# direct methods
.method public constructor <init>(LI7/P;)V
    .locals 0

    iput-object p1, p0, LI7/P$M$d;->a:LI7/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LI7/P$M$d;->a:LI7/P;

    invoke-static {v0}, LI7/P;->L(LI7/P;)Lcom/wireguard/android/backend/a;

    move-result-object v0

    iget-object v1, p0, LI7/P$M$d;->a:LI7/P;

    invoke-interface {v0, v1}, Lcom/wireguard/android/backend/a;->c(Lcom/wireguard/android/backend/c;)Lcom/wireguard/android/backend/b;

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
