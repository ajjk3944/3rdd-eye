.class public final Lje/D$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/D;-><init>(Lje/u;Lfe/u;LT7/d;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lje/D;

.field final synthetic b:J


# direct methods
.method public constructor <init>(Lje/D;J)V
    .locals 0

    iput-object p1, p0, Lje/D$e;->a:Lje/D;

    iput-wide p2, p0, Lje/D$e;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lje/D$e;->a:Lje/D;

    new-instance v1, Lje/D$a;

    iget-wide v2, p0, Lje/D$e;->b:J

    invoke-direct {v1, v0, v2, v3}, Lje/D$a;-><init>(Lje/D;J)V

    invoke-static {v0, v1}, Lje/D;->f(Lje/D;Lmh/a;)V

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
