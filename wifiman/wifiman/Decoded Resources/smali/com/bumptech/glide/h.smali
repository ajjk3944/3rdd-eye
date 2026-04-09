.class abstract Lcom/bumptech/glide/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Lcom/bumptech/glide/b;Ljava/util/List;LR2/a;)Lcom/bumptech/glide/Registry;
    .locals 5

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->f()LF2/d;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->e()LF2/b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->i()Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p0}, Lcom/bumptech/glide/b;->i()Lcom/bumptech/glide/d;

    move-result-object v3

    invoke-virtual {v3}, Lcom/bumptech/glide/d;->f()Lcom/bumptech/glide/e;

    move-result-object v3

    new-instance v4, Lcom/bumptech/glide/Registry;

    invoke-direct {v4}, Lcom/bumptech/glide/Registry;-><init>()V

    invoke-static {v2, v4, v0, v1, v3}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;Lcom/bumptech/glide/Registry;LF2/d;LF2/b;Lcom/bumptech/glide/e;)V

    invoke-static {v2, p0, v4, p1, p2}, Lcom/bumptech/glide/h;->c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;Ljava/util/List;LR2/a;)V

    return-object v4
.end method

.method private static b(Landroid/content/Context;Lcom/bumptech/glide/Registry;LF2/d;LF2/b;Lcom/bumptech/glide/e;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;

    invoke-direct {v4}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser;-><init>()V

    invoke-virtual {v1, v4}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1b

    if-lt v4, v5, :cond_0

    new-instance v5, Lcom/bumptech/glide/load/resource/bitmap/o;

    invoke-direct {v5}, Lcom/bumptech/glide/load/resource/bitmap/o;-><init>()V

    invoke-virtual {v1, v5}, Lcom/bumptech/glide/Registry;->o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v6

    new-instance v7, LO2/a;

    invoke-direct {v7, v0, v6, v2, v3}, LO2/a;-><init>(Landroid/content/Context;Ljava/util/List;LF2/d;LF2/b;)V

    invoke-static/range {p2 .. p2}, Lcom/bumptech/glide/load/resource/bitmap/A;->m(LF2/d;)LC2/i;

    move-result-object v8

    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/l;

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/Registry;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-direct {v9, v10, v11, v2, v3}, Lcom/bumptech/glide/load/resource/bitmap/l;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;LF2/d;LF2/b;)V

    const/16 v10, 0x1c

    if-lt v4, v10, :cond_1

    const-class v11, Lcom/bumptech/glide/c$b;

    move-object/from16 v12, p4

    invoke-virtual {v12, v11}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_1

    new-instance v11, Lcom/bumptech/glide/load/resource/bitmap/r;

    invoke-direct {v11}, Lcom/bumptech/glide/load/resource/bitmap/r;-><init>()V

    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/j;

    invoke-direct {v12}, Lcom/bumptech/glide/load/resource/bitmap/j;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v12, Lcom/bumptech/glide/load/resource/bitmap/h;

    invoke-direct {v12, v9}, Lcom/bumptech/glide/load/resource/bitmap/h;-><init>(Lcom/bumptech/glide/load/resource/bitmap/l;)V

    new-instance v11, Lcom/bumptech/glide/load/resource/bitmap/w;

    invoke-direct {v11, v9, v3}, Lcom/bumptech/glide/load/resource/bitmap/w;-><init>(Lcom/bumptech/glide/load/resource/bitmap/l;LF2/b;)V

    :goto_0
    const-string v13, "Animation"

    const-class v14, Ljava/nio/ByteBuffer;

    const-class v15, Landroid/graphics/drawable/Drawable;

    move-object/from16 v16, v7

    const-class v7, Ljava/io/InputStream;

    if-lt v4, v10, :cond_2

    invoke-static {v6, v3}, LM2/h;->f(Ljava/util/List;LF2/b;)LC2/i;

    move-result-object v10

    invoke-virtual {v1, v13, v7, v15, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    invoke-static {v6, v3}, LM2/h;->a(Ljava/util/List;LF2/b;)LC2/i;

    move-result-object v10

    invoke-virtual {v1, v13, v14, v15, v10}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    :cond_2
    new-instance v10, LM2/l;

    invoke-direct {v10, v0}, LM2/l;-><init>(Landroid/content/Context;)V

    move/from16 v17, v4

    new-instance v4, Lcom/bumptech/glide/load/resource/bitmap/c;

    invoke-direct {v4, v3}, Lcom/bumptech/glide/load/resource/bitmap/c;-><init>(LF2/b;)V

    new-instance v0, LP2/a;

    invoke-direct {v0}, LP2/a;-><init>()V

    move-object/from16 p4, v0

    new-instance v0, LP2/d;

    invoke-direct {v0}, LP2/d;-><init>()V

    move-object/from16 v18, v0

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v19, v0

    new-instance v0, LI2/c;

    invoke-direct {v0}, LI2/c;-><init>()V

    invoke-virtual {v1, v14, v0}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;LC2/d;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v20, v10

    new-instance v10, LI2/u;

    invoke-direct {v10, v3}, LI2/u;-><init>(LF2/b;)V

    invoke-virtual {v0, v7, v10}, Lcom/bumptech/glide/Registry;->a(Ljava/lang/Class;LC2/d;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    const-string v10, "Bitmap"

    move-object/from16 v21, v15

    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v10, v14, v15, v12}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v10, v7, v15, v11}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->c()Z

    move-result v0

    move-object/from16 v22, v13

    const-class v13, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/t;

    invoke-direct {v0, v9}, Lcom/bumptech/glide/load/resource/bitmap/t;-><init>(Lcom/bumptech/glide/load/resource/bitmap/l;)V

    invoke-virtual {v1, v10, v13, v15, v0}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    :cond_3
    invoke-static/range {p2 .. p2}, Lcom/bumptech/glide/load/resource/bitmap/A;->c(LF2/d;)LC2/i;

    move-result-object v0

    const-class v9, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1, v10, v9, v15, v0}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    invoke-virtual {v1, v10, v13, v15, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v23, v9

    invoke-static {}, LI2/w$a;->a()LI2/w$a;

    move-result-object v9

    invoke-virtual {v0, v15, v15, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/y;

    invoke-direct {v9}, Lcom/bumptech/glide/load/resource/bitmap/y;-><init>()V

    invoke-virtual {v0, v10, v15, v15, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LC2/j;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v9, v5, v12}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;LC2/i;)V

    const-string v12, "BitmapDrawable"

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0, v12, v14, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v9, v5, v11}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;LC2/i;)V

    invoke-virtual {v0, v12, v7, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v9, v5, v8}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;LC2/i;)V

    invoke-virtual {v0, v12, v13, v1, v9}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v8, Lcom/bumptech/glide/load/resource/bitmap/b;

    invoke-direct {v8, v2, v4}, Lcom/bumptech/glide/load/resource/bitmap/b;-><init>(LF2/d;LC2/j;)V

    invoke-virtual {v0, v1, v8}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LC2/j;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LO2/j;

    move-object/from16 v8, v16

    invoke-direct {v4, v6, v8, v3}, LO2/j;-><init>(Ljava/util/List;LC2/i;LF2/b;)V

    const-class v6, LO2/c;

    move-object/from16 v9, v22

    invoke-virtual {v0, v9, v7, v6, v4}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v9, v14, v6, v8}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LO2/d;

    invoke-direct {v4}, LO2/d;-><init>()V

    invoke-virtual {v0, v6, v4}, Lcom/bumptech/glide/Registry;->b(Ljava/lang/Class;LC2/j;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, LI2/w$a;->a()LI2/w$a;

    move-result-object v4

    const-class v8, LB2/a;

    invoke-virtual {v0, v8, v8, v4}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v4, LO2/h;

    invoke-direct {v4, v2}, LO2/h;-><init>(LF2/d;)V

    invoke-virtual {v0, v10, v8, v15, v4}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    const-class v4, Landroid/net/Uri;

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    invoke-virtual {v0, v4, v8, v9}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v10, Lcom/bumptech/glide/load/resource/bitmap/v;

    invoke-direct {v10, v9, v2}, Lcom/bumptech/glide/load/resource/bitmap/v;-><init>(LM2/l;LF2/d;)V

    invoke-virtual {v0, v4, v15, v10}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, LL2/a$a;

    invoke-direct {v9}, LL2/a$a;-><init>()V

    invoke-virtual {v0, v9}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, LI2/d$b;

    invoke-direct {v9}, LI2/d$b;-><init>()V

    const-class v10, Ljava/io/File;

    invoke-virtual {v0, v10, v14, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, LI2/g$e;

    invoke-direct {v9}, LI2/g$e;-><init>()V

    invoke-virtual {v0, v10, v7, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, LN2/a;

    invoke-direct {v9}, LN2/a;-><init>()V

    invoke-virtual {v0, v10, v10, v9}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, LI2/g$b;

    invoke-direct {v9}, LI2/g$b;-><init>()V

    invoke-virtual {v0, v10, v13, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, LI2/w$a;->a()LI2/w$a;

    move-result-object v9

    invoke-virtual {v0, v10, v10, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v9, Lcom/bumptech/glide/load/data/k$a;

    invoke-direct {v9, v3}, Lcom/bumptech/glide/load/data/k$a;-><init>(LF2/b;)V

    invoke-virtual {v0, v9}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    invoke-static {}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    move-object v3, v1

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/Registry;->p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;

    goto :goto_1

    :cond_4
    move-object v3, v1

    move-object/from16 v1, p1

    :goto_1
    invoke-static/range {p0 .. p0}, LI2/f;->g(Landroid/content/Context;)LI2/o;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LI2/f;->c(Landroid/content/Context;)LI2/o;

    move-result-object v9

    invoke-static/range {p0 .. p0}, LI2/f;->e(Landroid/content/Context;)LI2/o;

    move-result-object v11

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v16, v6

    invoke-virtual {v1, v12, v7, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v6

    const-class v2, Ljava/lang/Integer;

    invoke-virtual {v6, v2, v7, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v6, v23

    invoke-virtual {v0, v12, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v2, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v12, v8, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v2, v8, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LI2/t;->f(Landroid/content/Context;)LI2/o;

    move-result-object v9

    invoke-virtual {v0, v4, v7, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static/range {p0 .. p0}, LI2/t;->e(Landroid/content/Context;)LI2/o;

    move-result-object v9

    invoke-virtual {v0, v4, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    new-instance v0, LI2/s$c;

    invoke-direct {v0, v5}, LI2/s$c;-><init>(Landroid/content/res/Resources;)V

    new-instance v9, LI2/s$a;

    invoke-direct {v9, v5}, LI2/s$a;-><init>(Landroid/content/res/Resources;)V

    new-instance v11, LI2/s$b;

    invoke-direct {v11, v5}, LI2/s$b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v20, v3

    invoke-virtual {v1, v2, v4, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v3

    invoke-virtual {v3, v12, v4, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v2, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v12, v6, v9}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v2, v7, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v12, v7, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    new-instance v0, LI2/e$c;

    invoke-direct {v0}, LI2/e$c;-><init>()V

    const-class v2, Ljava/lang/String;

    invoke-virtual {v1, v2, v7, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, LI2/e$c;

    invoke-direct {v3}, LI2/e$c;-><init>()V

    invoke-virtual {v0, v4, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, LI2/v$c;

    invoke-direct {v3}, LI2/v$c;-><init>()V

    invoke-virtual {v0, v2, v7, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, LI2/v$b;

    invoke-direct {v3}, LI2/v$b;-><init>()V

    invoke-virtual {v0, v2, v13, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v3, LI2/v$a;

    invoke-direct {v3}, LI2/v$a;-><init>()V

    invoke-virtual {v0, v2, v6, v3}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/a$c;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, LI2/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/a$b;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-direct {v2, v3}, LI2/a$b;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v0, v4, v6, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LJ2/b$a;

    move-object/from16 v3, p0

    move-object/from16 v9, p4

    invoke-direct {v2, v3}, LJ2/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LJ2/c$a;

    invoke-direct {v2, v3}, LJ2/c$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    const/16 v0, 0x1d

    move/from16 v2, v17

    if-lt v2, v0, :cond_5

    new-instance v0, LJ2/d$c;

    invoke-direct {v0, v3}, LJ2/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4, v7, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    new-instance v0, LJ2/d$b;

    invoke-direct {v0, v3}, LJ2/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v4, v13, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    :cond_5
    new-instance v0, LI2/x$d;

    move-object/from16 v2, v19

    invoke-direct {v0, v2}, LI2/x$d;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v1, v4, v7, v0}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, LI2/x$b;

    invoke-direct {v11, v2}, LI2/x$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v13, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v11, LI2/x$a;

    invoke-direct {v11, v2}, LI2/x$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v0, v4, v6, v11}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/y$a;

    invoke-direct {v2}, LI2/y$a;-><init>()V

    invoke-virtual {v0, v4, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LJ2/g$a;

    invoke-direct {v2}, LJ2/g$a;-><init>()V

    const-class v6, Ljava/net/URL;

    invoke-virtual {v0, v6, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/l$a;

    invoke-direct {v2, v3}, LI2/l$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4, v10, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LJ2/a$a;

    invoke-direct {v2}, LJ2/a$a;-><init>()V

    const-class v3, LI2/h;

    invoke-virtual {v0, v3, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/b$a;

    invoke-direct {v2}, LI2/b$a;-><init>()V

    const-class v3, [B

    invoke-virtual {v0, v3, v14, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LI2/b$d;

    invoke-direct {v2}, LI2/b$d;-><init>()V

    invoke-virtual {v0, v3, v7, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, LI2/w$a;->a()LI2/w$a;

    move-result-object v2

    invoke-virtual {v0, v4, v4, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-static {}, LI2/w$a;->a()LI2/w$a;

    move-result-object v2

    invoke-virtual {v0, v8, v8, v2}, Lcom/bumptech/glide/Registry;->d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LM2/m;

    invoke-direct {v2}, LM2/m;-><init>()V

    invoke-virtual {v0, v8, v8, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LP2/b;

    invoke-direct {v2, v5}, LP2/b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v4, v20

    invoke-virtual {v0, v15, v4, v2}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, v15, v3, v9}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    new-instance v2, LP2/c;

    move-object/from16 v6, p2

    move-object/from16 v7, v18

    invoke-direct {v2, v6, v9, v7}, LP2/c;-><init>(LF2/d;LP2/e;LP2/e;)V

    invoke-virtual {v0, v8, v3, v2}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)Lcom/bumptech/glide/Registry;

    move-result-object v0

    move-object/from16 v2, v16

    invoke-virtual {v0, v2, v3, v7}, Lcom/bumptech/glide/Registry;->q(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)Lcom/bumptech/glide/Registry;

    invoke-static/range {p2 .. p2}, Lcom/bumptech/glide/load/resource/bitmap/A;->d(LF2/d;)LC2/i;

    move-result-object v0

    invoke-virtual {v1, v14, v15, v0}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {v2, v5, v0}, Lcom/bumptech/glide/load/resource/bitmap/a;-><init>(Landroid/content/res/Resources;LC2/i;)V

    invoke-virtual {v1, v14, v4, v2}, Lcom/bumptech/glide/Registry;->c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    return-void
.end method

.method private static c(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;Ljava/util/List;LR2/a;)V
    .locals 1

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    invoke-virtual {p4, p0, p1, p2}, LR2/c;->a(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/Registry;)V

    :cond_0
    return-void

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method static d(Lcom/bumptech/glide/b;Ljava/util/List;LR2/a;)LW2/f$b;
    .locals 1

    new-instance v0, Lcom/bumptech/glide/h$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/h$a;-><init>(Lcom/bumptech/glide/b;Ljava/util/List;LR2/a;)V

    return-object v0
.end method
