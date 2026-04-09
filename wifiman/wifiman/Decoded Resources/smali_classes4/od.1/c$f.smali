.class public final Lod/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lod/c;->b(JLjava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lod/c;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lod/c;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lod/c$f;->a:Lod/c;

    iput-wide p2, p0, Lod/c$f;->b:J

    iput-object p4, p0, Lod/c$f;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lod/c$f;->a:Lod/c;

    invoke-static {v0}, Lod/c;->h(Lod/c;)LWb/a;

    move-result-object v0

    iget-wide v1, p0, Lod/c$f;->b:J

    iget-object v3, p0, Lod/c$f;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, LWb/a;->b(JLjava/lang/String;)I

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
