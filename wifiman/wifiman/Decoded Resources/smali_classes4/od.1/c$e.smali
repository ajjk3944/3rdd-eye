.class public final Lod/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod/c;->d(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Lod/c;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLod/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lod/c$e;->a:Ljava/lang/String;

    iput-object p2, p0, Lod/c$e;->b:Ljava/lang/String;

    iput-wide p3, p0, Lod/c$e;->c:J

    iput-object p5, p0, Lod/c$e;->d:Lod/c;

    iput-object p6, p0, Lod/c$e;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 11

    :try_start_0
    new-instance v9, LWb/d;

    iget-object v3, p0, Lod/c$e;->a:Ljava/lang/String;

    iget-object v4, p0, Lod/c$e;->b:Ljava/lang/String;

    iget-wide v5, p0, Lod/c$e;->c:J

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LWb/d;-><init>(JLjava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lod/c$e;->d:Lod/c;

    invoke-static {v0}, Lod/c;->h(Lod/c;)LWb/a;

    move-result-object v0

    iget-object v1, p0, Lod/c$e;->e:Ljava/lang/String;

    invoke-interface {v0, v9, v1}, LWb/a;->f(LWb/d;Ljava/lang/String;)J

    move-result-wide v1

    iget-object v10, p0, Lod/c$e;->d:Lod/c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-object v0, v9

    invoke-static/range {v0 .. v8}, LWb/d;->b(LWb/d;JLjava/lang/String;Ljava/lang/String;JILjava/lang/Object;)LWb/d;

    move-result-object v0

    invoke-static {v10, v0}, Lod/c;->g(Lod/c;LWb/d;)Lod/a;

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
