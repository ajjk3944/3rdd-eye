.class public final LP7/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP7/h;->a(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LP7/h;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LP7/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LP7/h$c;->a:LP7/h;

    iput-object p2, p0, LP7/h$c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, LP7/h$c;->a:LP7/h;

    invoke-static {v0}, LP7/h;->e(LP7/h;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    iget-object v1, p0, LP7/h$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->b(Ljava/lang/String;)V

    iget-object v0, p0, LP7/h$c;->a:LP7/h;

    invoke-static {v0}, LP7/h;->e(LP7/h;)Lcom/google/firebase/analytics/FirebaseAnalytics;

    move-result-object v0

    const-string/jumbo v1, "id"

    iget-object v2, p0, LP7/h$c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->c(Ljava/lang/String;Ljava/lang/String;)V

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
