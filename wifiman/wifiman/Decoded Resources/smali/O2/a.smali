.class public LO2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO2/a$b;,
        LO2/a$a;
    }
.end annotation


# static fields
.field private static final f:LO2/a$a;

.field private static final g:LO2/a$b;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;

.field private final c:LO2/a$b;

.field private final d:LO2/a$a;

.field private final e:LO2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO2/a$a;

    invoke-direct {v0}, LO2/a$a;-><init>()V

    sput-object v0, LO2/a;->f:LO2/a$a;

    new-instance v0, LO2/a$b;

    invoke-direct {v0}, LO2/a$b;-><init>()V

    sput-object v0, LO2/a;->g:LO2/a$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;LF2/d;LF2/b;)V
    .locals 7

    .line 1
    sget-object v5, LO2/a;->g:LO2/a$b;

    sget-object v6, LO2/a;->f:LO2/a$a;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, LO2/a;-><init>(Landroid/content/Context;Ljava/util/List;LF2/d;LF2/b;LO2/a$b;LO2/a$a;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/util/List;LF2/d;LF2/b;LO2/a$b;LO2/a$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LO2/a;->a:Landroid/content/Context;

    .line 4
    iput-object p2, p0, LO2/a;->b:Ljava/util/List;

    .line 5
    iput-object p6, p0, LO2/a;->d:LO2/a$a;

    .line 6
    new-instance p1, LO2/b;

    invoke-direct {p1, p3, p4}, LO2/b;-><init>(LF2/d;LF2/b;)V

    iput-object p1, p0, LO2/a;->e:LO2/b;

    .line 7
    iput-object p5, p0, LO2/a;->c:LO2/a$b;

    return-void
.end method

.method private c(Ljava/nio/ByteBuffer;IILB2/d;LC2/g;)LO2/e;
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "Decoded GIF from stream in "

    const-string v3, "BufferGifDecoder"

    invoke-static {}, LW2/g;->b()J

    move-result-wide v4

    const/4 v6, 0x2

    :try_start_0
    invoke-virtual/range {p4 .. p4}, LB2/d;->c()LB2/c;

    move-result-object v0

    invoke-virtual {v0}, LB2/c;->b()I

    move-result v7

    const/4 v8, 0x0

    if-lez v7, :cond_5

    invoke-virtual {v0}, LB2/c;->c()I

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v7, LO2/i;->a:LC2/f;

    move-object/from16 v9, p5

    invoke-virtual {v9, v7}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object v7

    sget-object v9, LC2/b;->PREFER_RGB_565:LC2/b;

    if-ne v7, v9, :cond_1

    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_0
    move/from16 v13, p2

    move/from16 v14, p3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_1
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :goto_1
    invoke-static {v0, v13, v14}, LO2/a;->e(LB2/c;II)I

    move-result v9

    iget-object v10, v1, LO2/a;->d:LO2/a$a;

    iget-object v11, v1, LO2/a;->e:LO2/b;

    move-object/from16 v12, p1

    invoke-virtual {v10, v11, v0, v12, v9}, LO2/a$a;->a(LB2/a$a;LB2/c;Ljava/nio/ByteBuffer;I)LB2/a;

    move-result-object v11

    invoke-interface {v11, v7}, LB2/a;->f(Landroid/graphics/Bitmap$Config;)V

    invoke-interface {v11}, LB2/a;->c()V

    invoke-interface {v11}, LB2/a;->getNextFrame()Landroid/graphics/Bitmap;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v15, :cond_3

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LW2/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v8

    :cond_3
    :try_start_1
    invoke-static {}, LK2/j;->c()LK2/j;

    move-result-object v12

    new-instance v0, LO2/c;

    iget-object v10, v1, LO2/a;->a:Landroid/content/Context;

    move-object v9, v0

    move/from16 v13, p2

    move/from16 v14, p3

    invoke-direct/range {v9 .. v15}, LO2/c;-><init>(Landroid/content/Context;LB2/a;LC2/k;IILandroid/graphics/Bitmap;)V

    new-instance v7, LO2/e;

    invoke-direct {v7, v0}, LO2/e;-><init>(LO2/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LW2/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-object v7

    :cond_5
    :goto_2
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LW2/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-object v8

    :goto_3
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, LW2/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    throw v0
.end method

.method private static e(LB2/c;II)I
    .locals 4

    invoke-virtual {p0}, LB2/c;->a()I

    move-result v0

    div-int/2addr v0, p2

    invoke-virtual {p0}, LB2/c;->d()I

    move-result v1

    div-int/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v2, 0x2

    const-string v3, "BufferGifDecoder"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    if-le v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downsampling GIF, sampleSize: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", target dimens: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], actual dimens: ["

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB2/c;->d()I

    move-result p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB2/c;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2}, LO2/a;->f(Ljava/nio/ByteBuffer;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1, p2, p3, p4}, LO2/a;->d(Ljava/nio/ByteBuffer;IILC2/g;)LO2/e;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/nio/ByteBuffer;IILC2/g;)LO2/e;
    .locals 7

    iget-object v0, p0, LO2/a;->c:LO2/a$b;

    invoke-virtual {v0, p1}, LO2/a$b;->a(Ljava/nio/ByteBuffer;)LB2/d;

    move-result-object v0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, v0

    move-object v6, p4

    :try_start_0
    invoke-direct/range {v1 .. v6}, LO2/a;->c(Ljava/nio/ByteBuffer;IILB2/d;LC2/g;)LO2/e;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, LO2/a;->c:LO2/a$b;

    invoke-virtual {p2, v0}, LO2/a$b;->b(LB2/d;)V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, LO2/a;->c:LO2/a$b;

    invoke-virtual {p2, v0}, LO2/a$b;->b(LB2/d;)V

    throw p1
.end method

.method public f(Ljava/nio/ByteBuffer;LC2/g;)Z
    .locals 1

    sget-object v0, LO2/i;->b:LC2/f;

    invoke-virtual {p2, v0}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, LO2/a;->b:Ljava/util/List;

    invoke-static {p2, p1}, Lcom/bumptech/glide/load/a;->g(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
