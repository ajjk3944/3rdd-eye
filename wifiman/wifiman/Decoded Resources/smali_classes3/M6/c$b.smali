.class LM6/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/E;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/c;->j()Lgg/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/c;


# direct methods
.method constructor <init>(LM6/c;)V
    .locals 0

    iput-object p1, p0, LM6/c$b;->a:LM6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lgg/z;)Lgg/D;
    .locals 0

    invoke-virtual {p0, p1}, LM6/c$b;->b(Lgg/z;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public b(Lgg/z;)Lgg/z;
    .locals 8

    iget-object v0, p0, LM6/c$b;->a:LM6/c;

    iget-boolean v1, v0, LM6/c;->f:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, LM6/c;->e:LM6/x;

    iget-wide v3, v1, LM6/x;->a:J

    iget-object v5, v1, LM6/x;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v6, v1, LM6/x;->c:Lgg/y;

    invoke-virtual {v0}, LM6/c;->h()Lgg/z;

    move-result-object v7

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lgg/z;->R(JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method
