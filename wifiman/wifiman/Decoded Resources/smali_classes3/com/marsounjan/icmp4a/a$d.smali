.class final Lcom/marsounjan/icmp4a/a$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/marsounjan/icmp4a/a;->k(Lcom/marsounjan/icmp4a/a$b;Ljava/lang/Integer;JIJLandroid/net/Network;)LLi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field g:I

.field h:I

.field i:J

.field j:I

.field private synthetic k:Ljava/lang/Object;

.field final synthetic l:Lcom/marsounjan/icmp4a/a$b;

.field final synthetic m:Lcom/marsounjan/icmp4a/a;

.field final synthetic n:Landroid/net/Network;

.field final synthetic o:J

.field final synthetic p:I

.field final synthetic q:Ljava/lang/Integer;

.field final synthetic r:J


# direct methods
.method constructor <init>(Lcom/marsounjan/icmp4a/a$b;Lcom/marsounjan/icmp4a/a;Landroid/net/Network;JILjava/lang/Integer;JLdh/e;)V
    .locals 0

    iput-object p1, p0, Lcom/marsounjan/icmp4a/a$d;->l:Lcom/marsounjan/icmp4a/a$b;

    iput-object p2, p0, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    iput-object p3, p0, Lcom/marsounjan/icmp4a/a$d;->n:Landroid/net/Network;

    iput-wide p4, p0, Lcom/marsounjan/icmp4a/a$d;->o:J

    iput p6, p0, Lcom/marsounjan/icmp4a/a$d;->p:I

    iput-object p7, p0, Lcom/marsounjan/icmp4a/a$d;->q:Ljava/lang/Integer;

    iput-wide p8, p0, Lcom/marsounjan/icmp4a/a$d;->r:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 12

    new-instance v11, Lcom/marsounjan/icmp4a/a$d;

    iget-object v1, p0, Lcom/marsounjan/icmp4a/a$d;->l:Lcom/marsounjan/icmp4a/a$b;

    iget-object v2, p0, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    iget-object v3, p0, Lcom/marsounjan/icmp4a/a$d;->n:Landroid/net/Network;

    iget-wide v4, p0, Lcom/marsounjan/icmp4a/a$d;->o:J

    iget v6, p0, Lcom/marsounjan/icmp4a/a$d;->p:I

    iget-object v7, p0, Lcom/marsounjan/icmp4a/a$d;->q:Ljava/lang/Integer;

    iget-wide v8, p0, Lcom/marsounjan/icmp4a/a$d;->r:J

    move-object v0, v11

    move-object v10, p2

    invoke-direct/range {v0 .. v10}, Lcom/marsounjan/icmp4a/a$d;-><init>(Lcom/marsounjan/icmp4a/a$b;Lcom/marsounjan/icmp4a/a;Landroid/net/Network;JILjava/lang/Integer;JLdh/e;)V

    iput-object p1, v11, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    return-object v11
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$d;->n(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v7, p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v8

    iget v0, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    const/4 v9, 0x7

    const/4 v10, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v1, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    check-cast v2, Lcom/marsounjan/icmp4a/c;

    iget-object v3, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    check-cast v3, Lcom/marsounjan/icmp4a/b;

    iget-object v4, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    check-cast v4, [Landroid/system/StructPollfd;

    iget-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    check-cast v5, Landroid/system/StructPollfd;

    iget-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    check-cast v6, Ljava/io/FileDescriptor;

    iget-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    check-cast v11, Ljava/net/InetAddress;

    iget-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    check-cast v12, LKi/t;

    :try_start_0
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v10, v9

    move-object v14, v11

    move-object v15, v12

    move-object v11, v4

    move-object v12, v5

    move v4, v1

    move-object v5, v2

    :cond_0
    move-object v1, v6

    move-object v6, v3

    goto/16 :goto_1a

    :catchall_0
    move-exception v0

    goto/16 :goto_1b

    :pswitch_1
    iget-wide v0, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v2, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v4, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    check-cast v4, Lcom/marsounjan/icmp4a/c;

    iget-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    check-cast v5, Lcom/marsounjan/icmp4a/b;

    iget-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    check-cast v6, [Landroid/system/StructPollfd;

    iget-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    check-cast v11, Landroid/system/StructPollfd;

    iget-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    check-cast v12, Ljava/io/FileDescriptor;

    iget-object v13, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    check-cast v13, Ljava/net/InetAddress;

    iget-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    check-cast v14, LKi/t;

    :try_start_1
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_14

    :catchall_1
    move-exception v0

    move-object v6, v12

    goto/16 :goto_1b

    :pswitch_2
    iget-wide v0, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v2, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v4, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    check-cast v4, Lcom/marsounjan/icmp4a/c;

    iget-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    check-cast v5, Lcom/marsounjan/icmp4a/b;

    iget-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    check-cast v6, [Landroid/system/StructPollfd;

    iget-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    check-cast v11, Landroid/system/StructPollfd;

    iget-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    check-cast v12, Ljava/io/FileDescriptor;

    iget-object v13, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    check-cast v13, Ljava/net/InetAddress;

    iget-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    check-cast v14, LKi/t;

    :try_start_2
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move v10, v9

    goto/16 :goto_18

    :pswitch_3
    iget-wide v1, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/marsounjan/icmp4a/c;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/marsounjan/icmp4a/b;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/io/FileDescriptor;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/net/InetAddress;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, LKi/t;

    :goto_0
    :try_start_3
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/system/ErrnoException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto/16 :goto_d

    :catchall_2
    move-exception v0

    move-object v6, v13

    goto/16 :goto_1b

    :catch_0
    move-exception v0

    move-object v9, v0

    move-wide v0, v1

    move v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v13

    :goto_1
    move-object v13, v14

    move-object v14, v15

    goto/16 :goto_13

    :catch_1
    move-exception v0

    move-object v9, v0

    move-wide v0, v1

    move v2, v3

    move v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v13

    :goto_2
    move-object v13, v14

    move-object v14, v15

    goto/16 :goto_16

    :pswitch_4
    iget-wide v1, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/marsounjan/icmp4a/c;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/marsounjan/icmp4a/b;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/io/FileDescriptor;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/net/InetAddress;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, LKi/t;

    goto :goto_0

    :pswitch_5
    iget-wide v1, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/marsounjan/icmp4a/c;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/marsounjan/icmp4a/b;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/io/FileDescriptor;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/net/InetAddress;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, LKi/t;

    :try_start_4
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/system/ErrnoException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/net/SocketException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-wide/from16 v16, v1

    move-object v9, v6

    move-object v6, v13

    goto/16 :goto_f

    :pswitch_6
    iget-wide v1, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/marsounjan/icmp4a/c;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/marsounjan/icmp4a/b;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/io/FileDescriptor;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/net/InetAddress;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, LKi/t;

    goto/16 :goto_0

    :pswitch_7
    iget-wide v1, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    iget v3, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iget v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/marsounjan/icmp4a/c;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/marsounjan/icmp4a/b;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    move-object v12, v0

    check-cast v12, Landroid/system/StructPollfd;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/io/FileDescriptor;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/net/InetAddress;

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, LKi/t;

    :try_start_5
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/system/ErrnoException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/net/SocketException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move v0, v3

    move-object v1, v13

    goto/16 :goto_8

    :pswitch_8
    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    check-cast v0, LKi/t;

    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_3

    :pswitch_9
    invoke-static/range {p1 .. p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    check-cast v0, LKi/t;

    iget-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->l:Lcom/marsounjan/icmp4a/a$b;

    instance-of v2, v1, Lcom/marsounjan/icmp4a/a$b$b;

    if-eqz v2, :cond_1

    check-cast v1, Lcom/marsounjan/icmp4a/a$b$b;

    invoke-virtual {v1}, Lcom/marsounjan/icmp4a/a$b$b;->a()Ljava/net/InetAddress;

    move-result-object v1

    goto :goto_4

    :cond_1
    instance-of v2, v1, Lcom/marsounjan/icmp4a/a$b$a;

    if-eqz v2, :cond_17

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    iget-object v3, v7, Lcom/marsounjan/icmp4a/a$d;->n:Landroid/net/Network;

    check-cast v1, Lcom/marsounjan/icmp4a/a$b$a;

    invoke-virtual {v1}, Lcom/marsounjan/icmp4a/a$b$a;->a()Ljava/lang/String;

    move-result-object v4

    iget-wide v5, v7, Lcom/marsounjan/icmp4a/a$d;->o:J

    iput-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-wide v4, v5

    move-object/from16 v6, p0

    invoke-static/range {v1 .. v6}, Lcom/marsounjan/icmp4a/a;->f(Lcom/marsounjan/icmp4a/a;Landroid/net/Network;Ljava/lang/String;JLdh/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_2

    return-object v8

    :cond_2
    :goto_3
    check-cast v1, Lcom/marsounjan/icmp4a/a$c;

    instance-of v2, v1, Lcom/marsounjan/icmp4a/a$c$b;

    if-eqz v2, :cond_13

    check-cast v1, Lcom/marsounjan/icmp4a/a$c$b;

    invoke-virtual {v1}, Lcom/marsounjan/icmp4a/a$c$b;->a()Ljava/net/InetAddress;

    move-result-object v1

    :goto_4
    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    invoke-static {v2, v1}, Lcom/marsounjan/icmp4a/a;->c(Lcom/marsounjan/icmp4a/a;Ljava/net/InetAddress;)Ljava/io/FileDescriptor;

    move-result-object v6

    :try_start_6
    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    invoke-static {v2, v6}, Lcom/marsounjan/icmp4a/a;->g(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;)V

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->n:Landroid/net/Network;

    if-eqz v2, :cond_3

    iget-object v3, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    invoke-static {v3, v6, v2}, Lcom/marsounjan/icmp4a/a;->b(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;Landroid/net/Network;)V

    :cond_3
    new-instance v2, Landroid/system/StructPollfd;

    invoke-direct {v2}, Landroid/system/StructPollfd;-><init>()V

    iput-object v6, v2, Landroid/system/StructPollfd;->fd:Ljava/io/FileDescriptor;

    sget v3, Landroid/system/OsConstants;->POLLIN:I

    int-to-short v3, v3

    filled-new-array {v2}, [Landroid/system/StructPollfd;

    move-result-object v4

    iget-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    iget v11, v7, Lcom/marsounjan/icmp4a/a$d;->p:I

    invoke-static {v5, v1, v11}, Lcom/marsounjan/icmp4a/a;->d(Lcom/marsounjan/icmp4a/a;Ljava/net/InetAddress;I)Lcom/marsounjan/icmp4a/b;

    move-result-object v5

    new-instance v11, Lcom/marsounjan/icmp4a/c;

    invoke-direct {v11, v1}, Lcom/marsounjan/icmp4a/c;-><init>(Ljava/net/InetAddress;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object v15, v0

    move-object v14, v1

    move-object v12, v2

    move-object v1, v6

    move v0, v10

    move-object v6, v5

    move-object v5, v11

    move-object v11, v4

    move v4, v3

    :goto_5
    :try_start_7
    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->q:Ljava/lang/Integer;

    const/4 v3, 0x2

    if-eqz v2, :cond_5

    add-int/lit8 v13, v0, 0x1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v0, v2, :cond_4

    :goto_6
    move v2, v4

    goto :goto_7

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Processed all of requested "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->q:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " Echo messages"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v15, v0, v2, v3, v2}, LIi/O;->e(LIi/N;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-static {v1}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_8
    .catch Landroid/system/ErrnoException; {:try_start_8 .. :try_end_8} :catch_2

    :catch_2
    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0

    :catchall_3
    move-exception v0

    move-object v6, v1

    goto/16 :goto_1b

    :cond_5
    move v13, v0

    goto :goto_6

    :goto_7
    :try_start_9
    iget-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->r:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    invoke-virtual {v6}, Lcom/marsounjan/icmp4a/b;->i()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v1, v0, v10, v14, v9}, Landroid/system/Os;->sendto(Ljava/io/FileDescriptor;Ljava/nio/ByteBuffer;ILjava/net/InetAddress;I)I

    move-result v0

    if-gez v0, :cond_7

    new-instance v9, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_a
    .catch Landroid/system/ErrnoException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/net/SocketException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v18, v8

    :try_start_b
    const-string/jumbo v8, "sendto failed with "

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v13, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iput-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v8, 0x2

    iput v8, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v15, v0, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_b
    .catch Landroid/system/ErrnoException; {:try_start_b .. :try_end_b} :catch_4
    .catch Ljava/net/SocketException; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object/from16 v8, v18

    if-ne v0, v8, :cond_6

    return-object v8

    :cond_6
    move v4, v2

    move v0, v13

    :goto_8
    const/4 v9, 0x7

    :goto_9
    const/4 v10, 0x0

    goto/16 :goto_5

    :catch_3
    move-exception v0

    move-object/from16 v8, v18

    :goto_a
    move-object v9, v0

    move-object/from16 v23, v6

    move-object v6, v1

    move-wide v0, v3

    move-object v4, v5

    move-object/from16 v5, v23

    move v3, v2

    move v2, v13

    goto/16 :goto_1

    :catch_4
    move-exception v0

    move-object/from16 v8, v18

    :goto_b
    move-object v9, v0

    move-object/from16 v23, v6

    move-object v6, v1

    move-wide v0, v3

    move-object v4, v5

    move-object/from16 v5, v23

    move v3, v2

    move v2, v13

    goto/16 :goto_2

    :catch_5
    move-exception v0

    goto :goto_a

    :catch_6
    move-exception v0

    goto :goto_b

    :cond_7
    :goto_c
    int-to-short v0, v2

    :try_start_c
    iput-short v0, v12, Landroid/system/StructPollfd;->events:S

    iget-wide v9, v7, Lcom/marsounjan/icmp4a/a$d;->o:J

    long-to-int v0, v9

    invoke-static {v11, v0}, Landroid/system/Os;->poll([Landroid/system/StructPollfd;I)I

    move-result v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long v9, v9, v16

    if-gez v0, :cond_9

    new-instance v9, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_c
    .catch Landroid/system/ErrnoException; {:try_start_c .. :try_end_c} :catch_6
    .catch Ljava/net/SocketException; {:try_start_c .. :try_end_c} :catch_5
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    move-object/from16 v18, v8

    :try_start_d
    const-string/jumbo v8, "poll failed with "

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v13, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iput-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v8, 0x3

    iput v8, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v15, v0, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_d
    .catch Landroid/system/ErrnoException; {:try_start_d .. :try_end_d} :catch_4
    .catch Ljava/net/SocketException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    move-object/from16 v8, v18

    if-ne v0, v8, :cond_8

    return-object v8

    :cond_8
    move/from16 v23, v13

    move-object v13, v1

    move-wide/from16 v24, v3

    move v4, v2

    move-wide/from16 v1, v24

    move/from16 v3, v23

    :goto_d
    move v0, v3

    move-object v3, v6

    move-object v6, v13

    :goto_e
    const/4 v10, 0x7

    goto/16 :goto_19

    :cond_9
    :try_start_e
    iget-short v0, v12, Landroid/system/StructPollfd;->revents:S

    if-eq v0, v2, :cond_b

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$c$a$c;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v10, "Request timeout for "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " seq "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9
    :try_end_e
    .catch Landroid/system/ErrnoException; {:try_start_e .. :try_end_e} :catch_6
    .catch Ljava/net/SocketException; {:try_start_e .. :try_end_e} :catch_5
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    move-wide/from16 v19, v3

    :try_start_f
    iget-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->o:J

    invoke-direct {v0, v9, v3, v4}, Lcom/marsounjan/icmp4a/Icmp$c$a$c;-><init>(Ljava/lang/String;J)V

    invoke-virtual {v5, v0}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v13, v7, Lcom/marsounjan/icmp4a/a$d;->h:I
    :try_end_f
    .catch Landroid/system/ErrnoException; {:try_start_f .. :try_end_f} :catch_c
    .catch Ljava/net/SocketException; {:try_start_f .. :try_end_f} :catch_b
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    move-wide/from16 v3, v19

    :try_start_10
    iput-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v9, 0x4

    iput v9, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v15, v0, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catch Landroid/system/ErrnoException; {:try_start_10 .. :try_end_10} :catch_6
    .catch Ljava/net/SocketException; {:try_start_10 .. :try_end_10} :catch_5
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    if-ne v0, v8, :cond_a

    return-object v8

    :cond_a
    move-wide/from16 v16, v3

    move-object v9, v6

    move v3, v13

    move-object v6, v1

    move v4, v2

    :goto_f
    :try_start_11
    iget-wide v0, v7, Lcom/marsounjan/icmp4a/a$d;->r:J
    :try_end_11
    .catch Landroid/system/ErrnoException; {:try_start_11 .. :try_end_11} :catch_a
    .catch Ljava/net/SocketException; {:try_start_11 .. :try_end_11} :catch_9
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    move/from16 p1, v3

    :try_start_12
    iget-wide v2, v7, Lcom/marsounjan/icmp4a/a$d;->o:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1
    :try_end_12
    .catch Landroid/system/ErrnoException; {:try_start_12 .. :try_end_12} :catch_8
    .catch Ljava/net/SocketException; {:try_start_12 .. :try_end_12} :catch_7
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    move/from16 v0, p1

    move-object v3, v9

    goto :goto_e

    :catch_7
    move-exception v0

    :goto_10
    move/from16 v2, p1

    move v3, v4

    move-object v4, v5

    move-object v5, v9

    move-object v13, v14

    move-object v14, v15

    move-object v9, v0

    move-wide/from16 v0, v16

    goto/16 :goto_13

    :catch_8
    move-exception v0

    :goto_11
    move/from16 v2, p1

    move v3, v4

    move-object v4, v5

    move-object v5, v9

    move-object v13, v14

    move-object v14, v15

    move-object v9, v0

    move-wide/from16 v0, v16

    goto/16 :goto_16

    :catch_9
    move-exception v0

    move/from16 p1, v3

    goto :goto_10

    :catch_a
    move-exception v0

    move/from16 p1, v3

    goto :goto_11

    :catch_b
    move-exception v0

    move-wide/from16 v3, v19

    goto/16 :goto_a

    :catch_c
    move-exception v0

    move-wide/from16 v3, v19

    goto/16 :goto_b

    :cond_b
    :try_start_13
    iget-object v0, v7, Lcom/marsounjan/icmp4a/a$d;->m:Lcom/marsounjan/icmp4a/a;

    move-wide/from16 v18, v9

    invoke-virtual {v6}, Lcom/marsounjan/icmp4a/b;->c()[B

    move-result-object v9

    invoke-static {v0, v1, v9}, Lcom/marsounjan/icmp4a/a;->e(Lcom/marsounjan/icmp4a/a;Ljava/io/FileDescriptor;[B)I

    move-result v0

    if-gez v0, :cond_c

    new-instance v9, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_13
    .catch Landroid/system/ErrnoException; {:try_start_13 .. :try_end_13} :catch_6
    .catch Ljava/net/SocketException; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    move-object/from16 v20, v8

    :try_start_14
    const-string/jumbo v8, "recvfrom failed with "

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v13, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iput-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v8, 0x5

    iput v8, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v15, v0, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_14
    .catch Landroid/system/ErrnoException; {:try_start_14 .. :try_end_14} :catch_e
    .catch Ljava/net/SocketException; {:try_start_14 .. :try_end_14} :catch_d
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    move-object/from16 v8, v20

    if-ne v0, v8, :cond_8

    return-object v8

    :catch_d
    move-exception v0

    move-object/from16 v8, v20

    goto/16 :goto_a

    :catch_e
    move-exception v0

    move-object/from16 v8, v20

    goto/16 :goto_b

    :cond_c
    :try_start_15
    invoke-virtual {v6}, Lcom/marsounjan/icmp4a/b;->c()[B

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v9, v10, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v9

    const-string/jumbo v10, "wrap(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_15
    .catch Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException; {:try_start_15 .. :try_end_15} :catch_12
    .catch Landroid/system/ErrnoException; {:try_start_15 .. :try_end_15} :catch_6
    .catch Ljava/net/SocketException; {:try_start_15 .. :try_end_15} :catch_5
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    move-wide/from16 v21, v3

    move-wide/from16 v3, v18

    :try_start_16
    invoke-virtual {v6, v9, v0, v3, v4}, Lcom/marsounjan/icmp4a/b;->k(Ljava/nio/ByteBuffer;IJ)Lcom/marsounjan/icmp4a/Icmp$c;

    move-result-object v0
    :try_end_16
    .catch Lcom/marsounjan/icmp4a/IcmpMessageSerializer$InvalidMessageContentException; {:try_start_16 .. :try_end_16} :catch_11
    .catch Landroid/system/ErrnoException; {:try_start_16 .. :try_end_16} :catch_10
    .catch Ljava/net/SocketException; {:try_start_16 .. :try_end_16} :catch_f
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    if-eqz v0, :cond_d

    :try_start_17
    invoke-virtual {v5, v0}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v0

    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v1, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v13, v7, Lcom/marsounjan/icmp4a/a$d;->h:I
    :try_end_17
    .catch Landroid/system/ErrnoException; {:try_start_17 .. :try_end_17} :catch_10
    .catch Ljava/net/SocketException; {:try_start_17 .. :try_end_17} :catch_f
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    move-wide/from16 v3, v21

    :try_start_18
    iput-wide v3, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v9, 0x6

    iput v9, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v15, v0, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_8

    return-object v8

    :catch_f
    move-exception v0

    move-wide/from16 v3, v21

    goto/16 :goto_a

    :catch_10
    move-exception v0

    move-wide/from16 v3, v21

    goto/16 :goto_b

    :cond_d
    move-wide/from16 v3, v21

    goto/16 :goto_c

    :catch_11
    move-exception v0

    move-wide/from16 v3, v21

    goto :goto_12

    :catch_12
    move-exception v0

    :goto_12
    new-instance v9, Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;

    const-string/jumbo v10, "Failed to deserialize incoming packet"

    invoke-direct {v9, v10, v0}, Lcom/marsounjan/icmp4a/Icmp$Error$ProtocolException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v9
    :try_end_18
    .catch Landroid/system/ErrnoException; {:try_start_18 .. :try_end_18} :catch_6
    .catch Ljava/net/SocketException; {:try_start_18 .. :try_end_18} :catch_5
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    :goto_13
    :try_start_19
    new-instance v10, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_e

    const-string/jumbo v9, "Socket Exception"

    :cond_e
    invoke-direct {v10, v9}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v9

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v13, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v4, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v3, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iput-wide v0, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/16 v10, 0x8

    iput v10, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v14, v9, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_f

    return-object v8

    :cond_f
    move-object/from16 v23, v12

    move-object v12, v6

    move-object v6, v11

    move-object/from16 v11, v23

    :goto_14
    move-object v15, v14

    const/4 v10, 0x7

    :goto_15
    move-object v14, v13

    move-wide/from16 v23, v0

    move v0, v2

    move-wide/from16 v1, v23

    move-object/from16 v25, v4

    move v4, v3

    move-object v3, v5

    move-object/from16 v5, v25

    move-object/from16 v26, v11

    move-object v11, v6

    move-object v6, v12

    move-object/from16 v12, v26

    goto :goto_19

    :goto_16
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v15, "Err: "

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v15, v9, Landroid/system/ErrnoException;->errno:I

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Landroid/system/ErrnoException;->getMessage()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_11

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " ("

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x29

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_10

    goto :goto_17

    :cond_10
    move-object v10, v9

    :cond_11
    :goto_17
    new-instance v9, Lcom/marsounjan/icmp4a/Icmp$c$a$b;

    invoke-direct {v9, v10}, Lcom/marsounjan/icmp4a/Icmp$c$a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v9}, Lcom/marsounjan/icmp4a/c;->b(Lcom/marsounjan/icmp4a/Icmp$c;)Lcom/marsounjan/icmp4a/Icmp$d;

    move-result-object v9

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v13, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v4, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v3, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v2, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    iput-wide v0, v7, Lcom/marsounjan/icmp4a/a$d;->i:J

    const/4 v10, 0x7

    iput v10, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-interface {v14, v9, v7}, LKi/w;->b(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_12

    return-object v8

    :cond_12
    move-object/from16 v23, v12

    move-object v12, v6

    move-object v6, v11

    move-object/from16 v11, v23

    :goto_18
    move-object v15, v14

    goto :goto_15

    :goto_19
    iput-object v15, v7, Lcom/marsounjan/icmp4a/a$d;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/marsounjan/icmp4a/a$d;->a:Ljava/lang/Object;

    iput-object v6, v7, Lcom/marsounjan/icmp4a/a$d;->b:Ljava/lang/Object;

    iput-object v12, v7, Lcom/marsounjan/icmp4a/a$d;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/marsounjan/icmp4a/a$d;->d:Ljava/lang/Object;

    iput-object v3, v7, Lcom/marsounjan/icmp4a/a$d;->e:Ljava/lang/Object;

    iput-object v5, v7, Lcom/marsounjan/icmp4a/a$d;->f:Ljava/lang/Object;

    iput v4, v7, Lcom/marsounjan/icmp4a/a$d;->g:I

    iput v0, v7, Lcom/marsounjan/icmp4a/a$d;->h:I

    const/16 v9, 0x9

    iput v9, v7, Lcom/marsounjan/icmp4a/a$d;->j:I

    invoke-static {v1, v2, v7}, LIi/Y;->a(JLdh/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    if-ne v1, v8, :cond_0

    return-object v8

    :goto_1a
    move v9, v10

    goto/16 :goto_9

    :goto_1b
    :try_start_1a
    invoke-static {v6}, Landroid/system/Os;->close(Ljava/io/FileDescriptor;)V
    :try_end_1a
    .catch Landroid/system/ErrnoException; {:try_start_1a .. :try_end_1a} :catch_13

    :catch_13
    throw v0

    :cond_13
    instance-of v0, v1, Lcom/marsounjan/icmp4a/a$c$a$c;

    if-nez v0, :cond_16

    instance-of v0, v1, Lcom/marsounjan/icmp4a/a$c$a$b;

    if-nez v0, :cond_15

    instance-of v0, v1, Lcom/marsounjan/icmp4a/a$c$a$a;

    if-eqz v0, :cond_14

    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;

    const-string/jumbo v1, "Security manager exists doesn\'t allow hostname resolution"

    invoke-direct {v0, v1}, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_15
    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Failed to resolve host "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->l:Lcom/marsounjan/icmp4a/a$b;

    check-cast v2, Lcom/marsounjan/icmp4a/a$b$a;

    invoke-virtual {v2}, Lcom/marsounjan/icmp4a/a$b$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v7, Lcom/marsounjan/icmp4a/a$d;->o:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Unknown host \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v7, Lcom/marsounjan/icmp4a/a$d;->l:Lcom/marsounjan/icmp4a/a$b;

    check-cast v2, Lcom/marsounjan/icmp4a/a$b$a;

    invoke-virtual {v2}, Lcom/marsounjan/icmp4a/a$b$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/marsounjan/icmp4a/Icmp$Error$UnknownHost;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/marsounjan/icmp4a/a$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lcom/marsounjan/icmp4a/a$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lcom/marsounjan/icmp4a/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
