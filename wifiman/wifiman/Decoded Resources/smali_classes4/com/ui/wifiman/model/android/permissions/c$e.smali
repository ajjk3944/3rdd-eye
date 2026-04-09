.class public final Lcom/ui/wifiman/model/android/permissions/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/android/permissions/c;->a([Lcom/ui/wifiman/model/android/permissions/a;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:[Lcom/ui/wifiman/model/android/permissions/a;

.field final synthetic b:Lcom/ui/wifiman/model/android/permissions/c;


# direct methods
.method public constructor <init>([Lcom/ui/wifiman/model/android/permissions/a;Lcom/ui/wifiman/model/android/permissions/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c$e;->a:[Lcom/ui/wifiman/model/android/permissions/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/android/permissions/c$e;->b:Lcom/ui/wifiman/model/android/permissions/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lcom/ui/wifiman/model/android/permissions/c$e;->a:[Lcom/ui/wifiman/model/android/permissions/a;

    const-string v1, ","

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LZg/n;->I0([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PERMISSION - REQUEST "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/android/permissions/c$e;->b:Lcom/ui/wifiman/model/android/permissions/c;

    invoke-static {v0}, Lcom/ui/wifiman/model/android/permissions/c;->e(Lcom/ui/wifiman/model/android/permissions/c;)LHg/b;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/android/permissions/c$e;->a:[Lcom/ui/wifiman/model/android/permissions/a;

    invoke-static {v1}, LZg/n;->d1([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, LHg/b;->h(Ljava/lang/Object;)V

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
