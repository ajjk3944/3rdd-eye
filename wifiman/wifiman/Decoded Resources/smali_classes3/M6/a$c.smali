.class LM6/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/a;->j(ILjava/nio/ByteBuffer;LM6/a$g;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgg/s;

.field final synthetic b:Ljava/nio/ByteBuffer;

.field final synthetic c:I

.field final synthetic d:LM6/a$g;

.field final synthetic e:LM6/a;


# direct methods
.method constructor <init>(LM6/a;Lgg/s;Ljava/nio/ByteBuffer;ILM6/a$g;)V
    .locals 0

    iput-object p1, p0, LM6/a$c;->e:LM6/a;

    iput-object p2, p0, LM6/a$c;->a:Lgg/s;

    iput-object p3, p0, LM6/a$c;->b:Ljava/nio/ByteBuffer;

    iput p4, p0, LM6/a$c;->c:I

    iput-object p5, p0, LM6/a$c;->d:LM6/a$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lgg/t;)V
    .locals 3

    iget-object v0, p0, LM6/a$c;->a:Lgg/s;

    invoke-static {p1}, LP6/u;->a(Lgg/t;)LCg/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->N0(Lgg/x;)Lgg/x;

    move-result-object v0

    check-cast v0, LCg/a;

    invoke-interface {p1, v0}, Lgg/t;->g(Lhg/c;)V

    :try_start_0
    iget-object v0, p0, LM6/a$c;->e:LM6/a;

    iget-object v1, p0, LM6/a$c;->b:Ljava/nio/ByteBuffer;

    iget v2, p0, LM6/a$c;->c:I

    invoke-virtual {v0, v1, v2}, LM6/a;->h(Ljava/nio/ByteBuffer;I)[B

    move-result-object v0

    iget-object v1, p0, LM6/a$c;->e:LM6/a;

    iget-object v2, p0, LM6/a$c;->d:LM6/a$g;

    invoke-virtual {v1, v0, v2}, LM6/a;->l([BLM6/a$g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/h;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
