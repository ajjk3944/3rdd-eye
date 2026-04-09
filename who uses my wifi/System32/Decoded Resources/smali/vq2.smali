.class public Lvq2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lul0;
.implements Lkk1;
.implements Leo1;
.implements Lf41;
.implements Lad0;
.implements Lws2;
.implements Liq3;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lvq2;->f:I

    sparse-switch p1, :sswitch_data_0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 88
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    .line 89
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lkz2;

    invoke-direct {p1}, Lkz2;-><init>()V

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    new-instance p1, Lnl1;

    .line 90
    invoke-direct {p1}, Lnl1;-><init>()V

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    .line 91
    :sswitch_1
    sget-object p1, Lfz;->d:Lfz;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 93
    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    .line 94
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 95
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance p1, Lk90;

    .line 97
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 99
    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    .line 100
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance p1, Lkh0;

    invoke-direct {p1}, Lkh0;-><init>()V

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 102
    new-instance p1, Lnh0;

    invoke-direct {p1}, Lnh0;-><init>()V

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_4
        0xa -> :sswitch_3
        0x10 -> :sswitch_2
        0x11 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lvq2;->f:I

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 85
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lvq2;->f:I

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 105
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    iput p2, p0, Lvq2;->f:I

    packed-switch p2, :pswitch_data_0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-class p2, Lcc0;

    .line 47
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f040378

    .line 48
    invoke-static {v0, p1, p2}, Lqb1;->p(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    move-result-object p2

    iget p2, p2, Landroid/util/TypedValue;->data:I

    .line 49
    sget-object v0, Lgn0;->u:[I

    .line 50
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 51
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 52
    invoke-static {p1, v0}, Lpz;->g(Landroid/content/Context;I)Lpz;

    const/4 v0, 0x2

    .line 53
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 54
    invoke-static {p1, v0}, Lpz;->g(Landroid/content/Context;I)Lpz;

    const/4 v0, 0x3

    .line 55
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 56
    invoke-static {p1, v0}, Lpz;->g(Landroid/content/Context;I)Lpz;

    const/4 v0, 0x5

    .line 57
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 58
    invoke-static {p1, v0}, Lpz;->g(Landroid/content/Context;I)Lpz;

    const/4 v0, 0x7

    .line 59
    invoke-static {p1, p2, v0}, Lob1;->e(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    const/16 v2, 0x9

    .line 60
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 61
    invoke-static {p1, v2}, Lpz;->g(Landroid/content/Context;I)Lpz;

    move-result-object v2

    iput-object v2, p0, Lvq2;->g:Ljava/lang/Object;

    const/16 v2, 0x8

    .line 62
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 63
    invoke-static {p1, v2}, Lpz;->g(Landroid/content/Context;I)Lpz;

    const/16 v2, 0xa

    .line 64
    invoke-virtual {p2, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 65
    invoke-static {p1, v1}, Lpz;->g(Landroid/content/Context;I)Lpz;

    move-result-object p1

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 66
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 67
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 68
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    .line 69
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lvq2;->g:Ljava/lang/Object;

    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 5

    const/4 v0, 0x7

    iput v0, p0, Lvq2;->f:I

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 108
    new-instance v0, Lhs;

    invoke-direct {v0, p1}, Lhs;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    .line 109
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 110
    sget-object v0, Lwr;->b:Lwr;

    if-nez v0, :cond_1

    .line 111
    sget-object v0, Lwr;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 112
    :try_start_0
    sget-object v1, Lwr;->b:Lwr;

    if-nez v1, :cond_0

    .line 113
    new-instance v1, Lwr;

    .line 114
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 116
    const-class v3, Lwr;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lwr;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    :catchall_0
    :try_start_2
    sput-object v1, Lwr;->b:Lwr;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 118
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 119
    :cond_1
    :goto_2
    sget-object v0, Lwr;->b:Lwr;

    .line 120
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public constructor <init>(Lbh;Ljava/lang/String;Lyb;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lvq2;->f:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;)V
    .locals 5

    const/16 v0, 0xb

    iput v0, p0, Lvq2;->f:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lah0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 19
    const-string v3, "nic4.db"

    invoke-direct {v0, p1, v3, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 20
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    .line 21
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 23
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 24
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 25
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    const-string v2, "open(...)"

    invoke-static {p1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v1, 0x2000

    .line 28
    new-array v1, v1, [B

    .line 29
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    :goto_0
    if-ltz v3, :cond_1

    const/4 v4, 0x0

    .line 30
    invoke-virtual {v2, v1, v4, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 31
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v3

    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    .line 33
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 34
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    .line 35
    :cond_2
    iput-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcw0;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lvq2;->f:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Lk90;

    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 44
    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lvq2;->f:I

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    iput-object p2, p0, Lvq2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 2
    iput p3, p0, Lvq2;->f:I

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    iput-object p2, p0, Lvq2;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p4, p0, Lvq2;->f:I

    iput-object p2, p0, Lvq2;->g:Ljava/lang/Object;

    iput-object p3, p0, Lvq2;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v0, 0x9

    iput v0, p0, Lvq2;->f:I

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 79
    new-array v1, v0, [I

    iput-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 80
    new-array v1, v0, [F

    iput-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 81
    iget-object v2, p0, Lvq2;->g:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 82
    iget-object v2, p0, Lvq2;->h:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lmd1;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lvq2;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln51;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lvq2;->f:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 73
    new-instance p1, Lm51;

    .line 74
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 75
    iput v0, p1, Lm51;->a:I

    .line 76
    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lth2;Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    const/16 v0, 0x1b

    iput v0, p0, Lvq2;->f:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lda4;->a(Ljava/lang/Object;)Lda4;

    move-result-object v2

    iget-object p2, p1, Lth2;->I0:Lba4;

    iget-object v0, p1, Lth2;->J0:Lba4;

    .line 8
    new-instance v5, Ll73;

    const/4 v1, 0x1

    invoke-direct {v5, v2, p2, v0, v1}, Ll73;-><init>(Lda4;Lba4;Lba4;I)V

    .line 9
    new-instance v0, Lu43;

    const/4 v1, 0x7

    invoke-direct {v0, p2, v1}, Lu43;-><init>(Lga4;I)V

    .line 10
    invoke-static {v0}, Lba4;->a(Lga4;)Lba4;

    move-result-object v6

    sget-object p2, Lyc0;->k:Lp63;

    invoke-static {p2}, Lba4;->a(Lga4;)Lba4;

    move-result-object v7

    iget-object v3, p1, Lth2;->c:Lba4;

    iget-object v4, p1, Lth2;->D:Lda4;

    .line 11
    new-instance v1, Lar2;

    const/16 v8, 0x8

    invoke-direct/range {v1 .. v8}, Lar2;-><init>(Lda4;Lba4;Lda4;Lca4;Lba4;Lga4;I)V

    move-object v5, v6

    move-object v6, v7

    .line 12
    invoke-static {v1}, Lba4;->a(Lga4;)Lba4;

    move-result-object v3

    .line 13
    new-instance p2, Ldz1;

    const/4 v0, 0x1

    invoke-direct {p2, v3, v5, v6, v0}, Ldz1;-><init>(Lba4;Lba4;Lba4;I)V

    .line 14
    invoke-static {p2}, Lba4;->a(Lga4;)Lba4;

    move-result-object p2

    iput-object p2, p0, Lvq2;->g:Ljava/lang/Object;

    invoke-static {p3}, Lda4;->b(Ljava/lang/Object;)Lda4;

    move-result-object p2

    iget-object v7, p1, Lth2;->h:Lph2;

    iget-object v8, p1, Lth2;->E:Lba4;

    iget-object v9, p1, Lth2;->j:Lba4;

    .line 15
    new-instance v1, Les2;

    move-object v4, v2

    move-object v2, p2

    invoke-direct/range {v1 .. v9}, Les2;-><init>(Lda4;Lba4;Lda4;Lba4;Lba4;Lph2;Lba4;Lba4;)V

    .line 16
    invoke-static {v1}, Lba4;->a(Lga4;)Lba4;

    move-result-object p1

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltz1;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lvq2;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lus0;)V
    .locals 3

    const/16 v0, 0x15

    iput v0, p0, Lvq2;->f:I

    .line 4
    new-instance v0, Lso1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lso1;-><init>(IZ)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    iput-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzs0;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lvq2;->f:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public C(Lr2;)V
    .locals 9

    .line 1
    const-string v0, ". ErrorDomain = "

    .line 2
    .line 3
    const-string v1, ". ErrorMessage = "

    .line 4
    .line 5
    const-string v2, "failed to load mediation ad: ErrorCode = "

    .line 6
    .line 7
    :try_start_0
    iget-object v3, p0, Lvq2;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lf3;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget v4, p1, Lr2;->g:I

    .line 20
    .line 21
    iget-object v5, p1, Lr2;->h:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, p1, Lr2;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    add-int/lit8 v7, v7, 0x29

    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    add-int/2addr v7, v8

    .line 48
    add-int/lit8 v7, v7, 0x11

    .line 49
    .line 50
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    add-int/2addr v7, v8

    .line 59
    add-int/lit8 v7, v7, 0x10

    .line 60
    .line 61
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    add-int/2addr v7, v8

    .line 70
    new-instance v8, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lgi2;->U(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lz62;

    .line 106
    .line 107
    invoke-virtual {p1}, Lr2;->d()Lnx2;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {v0, p1}, Lz62;->K0(Lnx2;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v5, v4}, Lz62;->w0(Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v0, v4}, Lz62;->m0(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catch_0
    move-exception p1

    .line 122
    const-string v0, ""

    .line 123
    .line 124
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    invoke-virtual {v0}, Lls2;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Laa2;

    .line 10
    .line 11
    sget-object v1, Lok2;->a:Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {v1}, Lpu1;->s(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lvq2;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lbu1;

    .line 19
    .line 20
    invoke-virtual {v2}, Lbu1;->p()Lgi1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Lu82;

    .line 25
    .line 26
    invoke-direct {v3, v0, v1, v2}, Lu82;-><init>(Laa2;Landroid/os/Handler;Lgi1;)V

    .line 27
    .line 28
    .line 29
    return-object v3
.end method

.method public b(Landroidx/preference/Preference;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/preference/PreferenceGroup;

    .line 4
    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    iput v0, p1, Landroidx/preference/PreferenceGroup;->X:I

    .line 9
    .line 10
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lem0;

    .line 13
    .line 14
    iget-object v0, p1, Lem0;->m:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object p1, p1, Lem0;->n:La9;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public c(Ljo1;)Lho1;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget-object v3, v2, Ljo1;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, v2, Ljo1;->q:Ltg0;

    .line 8
    .line 9
    const-string v5, "]"

    .line 10
    .line 11
    const-string v6, "Error occurred when closing InputStream"

    .line 12
    .line 13
    sget-object v7, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    :goto_0
    :try_start_0
    iget-object v0, v2, Ljo1;->o:Lao1;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catch_0
    move-exception v0

    .line 27
    move-wide/from16 v20, v8

    .line 28
    .line 29
    goto/16 :goto_12

    .line 30
    .line 31
    :cond_0
    new-instance v12, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v13, v0, Lao1;->b:Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v13, :cond_1

    .line 39
    .line 40
    const-string v14, "If-None-Match"

    .line 41
    .line 42
    invoke-virtual {v12, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-wide v13, v0, Lao1;->d:J

    .line 46
    .line 47
    const-wide/16 v15, 0x0

    .line 48
    .line 49
    cmp-long v0, v13, v15

    .line 50
    .line 51
    if-lez v0, :cond_2

    .line 52
    .line 53
    const-string v0, "If-Modified-Since"

    .line 54
    .line 55
    const-string v15, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    .line 56
    .line 57
    new-instance v10, Ljava/text/SimpleDateFormat;

    .line 58
    .line 59
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 60
    .line 61
    invoke-direct {v10, v15, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 62
    .line 63
    .line 64
    const-string v11, "GMT"

    .line 65
    .line 66
    invoke-static {v11}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-virtual {v10, v11}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 71
    .line 72
    .line 73
    new-instance v11, Ljava/util/Date;

    .line 74
    .line 75
    invoke-direct {v11, v13, v14}, Ljava/util/Date;-><init>(J)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v10, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    invoke-virtual {v12, v0, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_2
    move-object v0, v12

    .line 86
    :goto_1
    iget-object v10, v1, Lvq2;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v10, Lus0;

    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v0}, Lus0;->m(Ljo1;Ljava/util/Map;)Lts;

    .line 94
    .line 95
    .line 96
    move-result-object v10
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :try_start_1
    iget v0, v10, Lts;->a:I

    .line 98
    .line 99
    iget-object v11, v10, Lts;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v11, Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-static {v11}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v11

    .line 107
    const/16 v12, 0x130

    .line 108
    .line 109
    if-ne v0, v12, :cond_9

    .line 110
    .line 111
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 112
    .line 113
    .line 114
    iget-object v0, v2, Ljo1;->o:Lao1;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    :try_start_2
    new-instance v0, Lho1;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 119
    .line 120
    const/4 v13, 0x1

    .line 121
    const/4 v14, 0x0

    .line 122
    :try_start_3
    invoke-direct {v0, v12, v14, v13, v11}, Lho1;-><init>(I[BZLjava/util/List;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :catch_1
    move-exception v0

    .line 128
    :goto_2
    move-wide/from16 v20, v8

    .line 129
    .line 130
    goto/16 :goto_10

    .line 131
    .line 132
    :catch_2
    move-exception v0

    .line 133
    const/4 v14, 0x0

    .line 134
    goto :goto_2

    .line 135
    :cond_3
    const/4 v14, 0x0

    .line 136
    new-instance v13, Ljava/util/TreeSet;

    .line 137
    .line 138
    invoke-direct {v13, v7}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    if-nez v15, :cond_4

    .line 146
    .line 147
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v17

    .line 155
    if-eqz v17, :cond_4

    .line 156
    .line 157
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v17

    .line 161
    move-object/from16 v14, v17

    .line 162
    .line 163
    check-cast v14, Ldo1;

    .line 164
    .line 165
    iget-object v14, v14, Ldo1;->a:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v13, v14}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    goto :goto_3

    .line 172
    :cond_4
    new-instance v14, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v14, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 175
    .line 176
    .line 177
    iget-object v11, v0, Lao1;->h:Ljava/util/List;

    .line 178
    .line 179
    if-eqz v11, :cond_7

    .line 180
    .line 181
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    if-nez v11, :cond_6

    .line 186
    .line 187
    iget-object v11, v0, Lao1;->h:Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    if-eqz v15, :cond_6

    .line 198
    .line 199
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v15

    .line 203
    check-cast v15, Ldo1;

    .line 204
    .line 205
    iget-object v12, v15, Ldo1;->a:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v13, v12}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-nez v12, :cond_5

    .line 212
    .line 213
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    :cond_5
    const/16 v12, 0x130

    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_6
    move-wide/from16 v20, v8

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_7
    iget-object v11, v0, Lao1;->g:Ljava/util/Map;

    .line 223
    .line 224
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v11

    .line 228
    if-nez v11, :cond_6

    .line 229
    .line 230
    iget-object v11, v0, Lao1;->g:Ljava/util/Map;

    .line 231
    .line 232
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    :cond_8
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    if-eqz v12, :cond_6

    .line 245
    .line 246
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    check-cast v12, Ljava/util/Map$Entry;

    .line 251
    .line 252
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v15

    .line 256
    invoke-virtual {v13, v15}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v15

    .line 260
    if-nez v15, :cond_8

    .line 261
    .line 262
    new-instance v15, Ldo1;

    .line 263
    .line 264
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v19
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 268
    move-wide/from16 v20, v8

    .line 269
    .line 270
    :try_start_4
    move-object/from16 v8, v19

    .line 271
    .line 272
    check-cast v8, Ljava/lang/String;

    .line 273
    .line 274
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    check-cast v9, Ljava/lang/String;

    .line 279
    .line 280
    invoke-direct {v15, v8, v9}, Ldo1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-wide/from16 v8, v20

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :catch_3
    move-exception v0

    .line 290
    goto/16 :goto_10

    .line 291
    .line 292
    :goto_6
    new-instance v8, Lho1;

    .line 293
    .line 294
    iget-object v0, v0, Lao1;->a:[B

    .line 295
    .line 296
    const/16 v9, 0x130

    .line 297
    .line 298
    const/4 v13, 0x1

    .line 299
    invoke-direct {v8, v9, v0, v13, v14}, Lho1;-><init>(I[BZLjava/util/List;)V

    .line 300
    .line 301
    .line 302
    move-object v0, v8

    .line 303
    :goto_7
    return-object v0

    .line 304
    :cond_9
    move-wide/from16 v20, v8

    .line 305
    .line 306
    iget-object v8, v10, Lts;->d:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v8, Ljava/io/InputStream;

    .line 309
    .line 310
    if-eqz v8, :cond_a

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_a
    const/4 v8, 0x0

    .line 314
    :goto_8
    const/4 v9, 0x0

    .line 315
    if-eqz v8, :cond_c

    .line 316
    .line 317
    iget v12, v10, Lts;->b:I

    .line 318
    .line 319
    iget-object v13, v1, Lvq2;->h:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v13, Lso1;

    .line 322
    .line 323
    new-instance v14, Lyo1;

    .line 324
    .line 325
    invoke-direct {v14, v13, v12}, Lyo1;-><init>(Lso1;I)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 326
    .line 327
    .line 328
    const/16 v12, 0x400

    .line 329
    .line 330
    :try_start_5
    invoke-virtual {v13, v12}, Lso1;->q(I)[B

    .line 331
    .line 332
    .line 333
    move-result-object v12
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 334
    :goto_9
    :try_start_6
    invoke-virtual {v8, v12}, Ljava/io/InputStream;->read([B)I

    .line 335
    .line 336
    .line 337
    move-result v15

    .line 338
    const/4 v1, -0x1

    .line 339
    if-eq v15, v1, :cond_b

    .line 340
    .line 341
    invoke-virtual {v14, v12, v9, v15}, Lyo1;->write([BII)V

    .line 342
    .line 343
    .line 344
    move-object/from16 v1, p0

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :catchall_0
    move-exception v0

    .line 348
    goto :goto_b

    .line 349
    :cond_b
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 350
    .line 351
    .line 352
    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 353
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 354
    .line 355
    .line 356
    goto :goto_a

    .line 357
    :catch_4
    :try_start_8
    new-array v8, v9, [Ljava/lang/Object;

    .line 358
    .line 359
    invoke-static {v6, v8}, Lro1;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :goto_a
    invoke-virtual {v13, v12}, Lso1;->t([B)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Lyo1;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    .line 366
    .line 367
    .line 368
    goto :goto_d

    .line 369
    :catchall_1
    move-exception v0

    .line 370
    const/4 v12, 0x0

    .line 371
    :goto_b
    :try_start_9
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5

    .line 372
    .line 373
    .line 374
    goto :goto_c

    .line 375
    :catch_5
    :try_start_a
    new-array v1, v9, [Ljava/lang/Object;

    .line 376
    .line 377
    invoke-static {v6, v1}, Lro1;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    :goto_c
    invoke-virtual {v13, v12}, Lso1;->t([B)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v14}, Lyo1;->close()V

    .line 384
    .line 385
    .line 386
    throw v0

    .line 387
    :cond_c
    new-array v1, v9, [B
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    .line 388
    .line 389
    :goto_d
    :try_start_b
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 390
    .line 391
    .line 392
    move-result-wide v12

    .line 393
    sub-long v12, v12, v20

    .line 394
    .line 395
    sget-boolean v8, Lro1;->a:Z

    .line 396
    .line 397
    if-nez v8, :cond_d

    .line 398
    .line 399
    const-wide/16 v14, 0xbb8

    .line 400
    .line 401
    cmp-long v8, v12, v14

    .line 402
    .line 403
    if-lez v8, :cond_f

    .line 404
    .line 405
    :cond_d
    const-string v8, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    .line 406
    .line 407
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    if-eqz v1, :cond_e

    .line 412
    .line 413
    array-length v13, v1

    .line 414
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v13

    .line 418
    goto :goto_e

    .line 419
    :catch_6
    move-exception v0

    .line 420
    goto :goto_f

    .line 421
    :cond_e
    const-string v13, "null"

    .line 422
    .line 423
    :goto_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    iget v15, v4, Ltg0;->b:I

    .line 428
    .line 429
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v15

    .line 433
    filled-new-array {v2, v12, v13, v14, v15}, [Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v12

    .line 437
    invoke-static {v8, v12}, Lro1;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    :cond_f
    const/16 v8, 0xc8

    .line 441
    .line 442
    if-lt v0, v8, :cond_10

    .line 443
    .line 444
    const/16 v8, 0x12b

    .line 445
    .line 446
    if-gt v0, v8, :cond_10

    .line 447
    .line 448
    new-instance v8, Lho1;

    .line 449
    .line 450
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 451
    .line 452
    .line 453
    invoke-direct {v8, v0, v1, v9, v11}, Lho1;-><init>(I[BZLjava/util/List;)V

    .line 454
    .line 455
    .line 456
    return-object v8

    .line 457
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 458
    .line 459
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 460
    .line 461
    .line 462
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    .line 463
    :goto_f
    move-object/from16 v18, v1

    .line 464
    .line 465
    move-object v11, v10

    .line 466
    goto :goto_13

    .line 467
    :goto_10
    move-object v11, v10

    .line 468
    :goto_11
    const/16 v18, 0x0

    .line 469
    .line 470
    goto :goto_13

    .line 471
    :goto_12
    const/4 v11, 0x0

    .line 472
    goto :goto_11

    .line 473
    :goto_13
    instance-of v1, v0, Ljava/net/SocketTimeoutException;

    .line 474
    .line 475
    if-eqz v1, :cond_11

    .line 476
    .line 477
    new-instance v0, Lgo1;

    .line 478
    .line 479
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 480
    .line 481
    .line 482
    const-string v1, "socket"

    .line 483
    .line 484
    goto/16 :goto_18

    .line 485
    .line 486
    :cond_11
    instance-of v1, v0, Ljava/net/MalformedURLException;

    .line 487
    .line 488
    if-nez v1, :cond_1c

    .line 489
    .line 490
    if-eqz v11, :cond_1b

    .line 491
    .line 492
    iget v0, v11, Lts;->a:I

    .line 493
    .line 494
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    const-string v8, "Unexpected response code %d for %s"

    .line 503
    .line 504
    invoke-static {v8, v1}, Lro1;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    if-eqz v18, :cond_19

    .line 508
    .line 509
    iget-object v1, v11, Lts;->c:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v1, Ljava/util/ArrayList;

    .line 512
    .line 513
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 518
    .line 519
    .line 520
    if-nez v1, :cond_12

    .line 521
    .line 522
    goto :goto_15

    .line 523
    :cond_12
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    if-eqz v8, :cond_13

    .line 528
    .line 529
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 530
    .line 531
    goto :goto_15

    .line 532
    :cond_13
    new-instance v8, Ljava/util/TreeMap;

    .line 533
    .line 534
    invoke-direct {v8, v7}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v9

    .line 541
    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    if-eqz v10, :cond_14

    .line 546
    .line 547
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    check-cast v10, Ldo1;

    .line 552
    .line 553
    iget-object v11, v10, Ldo1;->a:Ljava/lang/String;

    .line 554
    .line 555
    iget-object v10, v10, Ldo1;->b:Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {v8, v11, v10}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    goto :goto_14

    .line 561
    :cond_14
    :goto_15
    if-nez v1, :cond_15

    .line 562
    .line 563
    goto :goto_16

    .line 564
    :cond_15
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 565
    .line 566
    .line 567
    :goto_16
    const/16 v1, 0x191

    .line 568
    .line 569
    if-eq v0, v1, :cond_18

    .line 570
    .line 571
    const/16 v1, 0x193

    .line 572
    .line 573
    if-ne v0, v1, :cond_16

    .line 574
    .line 575
    goto :goto_17

    .line 576
    :cond_16
    const/16 v1, 0x190

    .line 577
    .line 578
    if-lt v0, v1, :cond_17

    .line 579
    .line 580
    const/16 v1, 0x1f3

    .line 581
    .line 582
    if-gt v0, v1, :cond_17

    .line 583
    .line 584
    new-instance v0, Lco1;

    .line 585
    .line 586
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 587
    .line 588
    .line 589
    throw v0

    .line 590
    :cond_17
    new-instance v0, Lgo1;

    .line 591
    .line 592
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 593
    .line 594
    .line 595
    throw v0

    .line 596
    :cond_18
    :goto_17
    new-instance v0, Lzn1;

    .line 597
    .line 598
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 599
    .line 600
    .line 601
    const-string v1, "auth"

    .line 602
    .line 603
    goto :goto_18

    .line 604
    :cond_19
    new-instance v0, Lgo1;

    .line 605
    .line 606
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 607
    .line 608
    .line 609
    const-string v1, "network"

    .line 610
    .line 611
    :goto_18
    iget v8, v4, Ltg0;->a:I

    .line 612
    .line 613
    :try_start_c
    iget v9, v4, Ltg0;->b:I

    .line 614
    .line 615
    const/4 v13, 0x1

    .line 616
    add-int/2addr v9, v13

    .line 617
    iput v9, v4, Ltg0;->b:I

    .line 618
    .line 619
    int-to-float v10, v8

    .line 620
    float-to-int v10, v10

    .line 621
    add-int/2addr v10, v8

    .line 622
    iput v10, v4, Ltg0;->a:I
    :try_end_c
    .catch Loo1; {:try_start_c .. :try_end_c} :catch_7

    .line 623
    .line 624
    if-gt v9, v13, :cond_1a

    .line 625
    .line 626
    new-instance v0, Ljava/lang/StringBuilder;

    .line 627
    .line 628
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 632
    .line 633
    .line 634
    const-string v1, "-retry [timeout="

    .line 635
    .line 636
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v2, v0}, Ljo1;->a(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    move-object/from16 v1, p0

    .line 653
    .line 654
    move-wide/from16 v8, v20

    .line 655
    .line 656
    goto/16 :goto_0

    .line 657
    .line 658
    :cond_1a
    :try_start_d
    throw v0
    :try_end_d
    .catch Loo1; {:try_start_d .. :try_end_d} :catch_7

    .line 659
    :catch_7
    move-exception v0

    .line 660
    new-instance v3, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    .line 668
    const-string v1, "-timeout-giveup [timeout="

    .line 669
    .line 670
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v1

    .line 683
    invoke-virtual {v2, v1}, Ljo1;->a(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    throw v0

    .line 687
    :cond_1b
    new-instance v1, Lio1;

    .line 688
    .line 689
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 690
    .line 691
    .line 692
    throw v1

    .line 693
    :cond_1c
    new-instance v1, Ljava/lang/RuntimeException;

    .line 694
    .line 695
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    const-string v3, "Bad URL "

    .line 700
    .line 701
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 706
    .line 707
    .line 708
    throw v1
.end method

.method public d()Lkj1;
    .locals 3

    .line 1
    invoke-static {}, Lzt0;->E()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v2, p0, Lvq2;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/content/Context;

    .line 15
    .line 16
    invoke-static {v2}, Lgi2;->B(Landroid/content/Context;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :cond_1
    :goto_0
    new-instance v0, Lkj1;

    .line 29
    .line 30
    invoke-direct {v0, v1, p0}, Lkj1;-><init>(ZLvq2;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public e(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 4

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzs0;

    .line 4
    .line 5
    iget-boolean v1, v0, Lzs0;->g:Z

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    iget-object v1, v0, Lzs0;->f:Landroid/os/Bundle;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-static {v1, p1}, Lm54;->n(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v3, v2

    .line 27
    :goto_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iput-object v2, v0, Lzs0;->f:Landroid/os/Bundle;

    .line 37
    .line 38
    :cond_2
    return-object v3

    .line 39
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "You can \'consumeRestoredStateForKey\' only after the corresponding component has moved to the \'CREATED\' state"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public f(IIII)Landroid/view/View;
    .locals 9

    .line 1
    iget-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm51;

    .line 4
    .line 5
    iget-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln51;

    .line 8
    .line 9
    invoke-interface {v1}, Ln51;->J()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {v1}, Ln51;->l()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-le p2, p1, :cond_0

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v4, -0x1

    .line 22
    :goto_0
    const/4 v5, 0x0

    .line 23
    :goto_1
    if-eq p1, p2, :cond_3

    .line 24
    .line 25
    invoke-interface {v1, p1}, Ln51;->H(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-interface {v1, v6}, Ln51;->r(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    invoke-interface {v1, v6}, Ln51;->R(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iput v2, v0, Lm51;->b:I

    .line 38
    .line 39
    iput v3, v0, Lm51;->c:I

    .line 40
    .line 41
    iput v7, v0, Lm51;->d:I

    .line 42
    .line 43
    iput v8, v0, Lm51;->e:I

    .line 44
    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iput p3, v0, Lm51;->a:I

    .line 48
    .line 49
    invoke-virtual {v0}, Lm51;->a()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_1
    if-eqz p4, :cond_2

    .line 57
    .line 58
    iput p4, v0, Lm51;->a:I

    .line 59
    .line 60
    invoke-virtual {v0}, Lm51;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_2

    .line 65
    .line 66
    move-object v5, v6

    .line 67
    :cond_2
    add-int/2addr p1, v4

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    return-object v5
.end method

.method public g([BIILlk1;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    add-int v2, v0, p3

    .line 6
    .line 7
    iget-object v3, v1, Lvq2;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lkz2;

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-virtual {v3, v2, v4}, Lkz2;->z(I[B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v0}, Lkz2;->E(I)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    :try_start_0
    const-string v2, "Expected WEBVTT. Got "

    .line 25
    .line 26
    iget v4, v3, Lkz2;->b:I

    .line 27
    .line 28
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 29
    .line 30
    invoke-virtual {v3, v5}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x0

    .line 35
    if-eqz v6, :cond_3c

    .line 36
    .line 37
    const-string v8, "WEBVTT"

    .line 38
    .line 39
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v6
    :try_end_0
    .catch Llq1; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz v6, :cond_3c

    .line 44
    .line 45
    :goto_0
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3b

    .line 56
    .line 57
    new-instance v2, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_1
    const/4 v4, -0x1

    .line 63
    const/4 v5, 0x0

    .line 64
    move v6, v4

    .line 65
    move v8, v5

    .line 66
    :goto_2
    const/4 v10, 0x1

    .line 67
    const/4 v11, 0x2

    .line 68
    if-ne v6, v4, :cond_4

    .line 69
    .line 70
    iget v8, v3, Lkz2;->b:I

    .line 71
    .line 72
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    invoke-virtual {v3, v6}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    move v6, v5

    .line 81
    goto :goto_2

    .line 82
    :cond_1
    const-string v12, "STYLE"

    .line 83
    .line 84
    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-eqz v12, :cond_2

    .line 89
    .line 90
    move v6, v11

    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const-string v11, "NOTE"

    .line 93
    .line 94
    invoke-virtual {v6, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_3

    .line 99
    .line 100
    move v6, v10

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    const/4 v6, 0x3

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-virtual {v3, v8}, Lkz2;->E(I)V

    .line 105
    .line 106
    .line 107
    if-eqz v6, :cond_3a

    .line 108
    .line 109
    if-ne v6, v10, :cond_5

    .line 110
    .line 111
    :goto_3
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 112
    .line 113
    invoke-virtual {v3, v4}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_0

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    if-ne v6, v11, :cond_36

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eqz v6, :cond_35

    .line 131
    .line 132
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 133
    .line 134
    invoke-virtual {v3, v6}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    iget-object v6, v1, Lvq2;->h:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v6, Lnl1;

    .line 140
    .line 141
    iget-object v8, v6, Lnl1;->b:Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 144
    .line 145
    .line 146
    iget v12, v3, Lkz2;->b:I

    .line 147
    .line 148
    :goto_4
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 149
    .line 150
    invoke-virtual {v3, v13}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v13

    .line 158
    if-eqz v13, :cond_34

    .line 159
    .line 160
    iget-object v6, v6, Lnl1;->a:Lkz2;

    .line 161
    .line 162
    iget-object v13, v3, Lkz2;->a:[B

    .line 163
    .line 164
    iget v14, v3, Lkz2;->b:I

    .line 165
    .line 166
    invoke-virtual {v6, v14, v13}, Lkz2;->z(I[B)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6, v12}, Lkz2;->E(I)V

    .line 170
    .line 171
    .line 172
    new-instance v12, Ljava/util/ArrayList;

    .line 173
    .line 174
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 175
    .line 176
    .line 177
    :goto_5
    invoke-static {v6}, Lnl1;->a(Lkz2;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6}, Lkz2;->B()I

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    const-string v14, ""

    .line 185
    .line 186
    const-string v15, "{"

    .line 187
    .line 188
    const/4 v9, 0x5

    .line 189
    if-ge v13, v9, :cond_6

    .line 190
    .line 191
    :goto_6
    move-object v9, v7

    .line 192
    goto/16 :goto_a

    .line 193
    .line 194
    :cond_6
    sget-object v13, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 195
    .line 196
    invoke-virtual {v6, v9, v13}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    const-string v13, "::cue"

    .line 201
    .line 202
    invoke-virtual {v13, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    if-nez v9, :cond_7

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_7
    iget v9, v6, Lkz2;->b:I

    .line 210
    .line 211
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    if-nez v13, :cond_8

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_8
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v16

    .line 222
    if-eqz v16, :cond_9

    .line 223
    .line 224
    invoke-virtual {v6, v9}, Lkz2;->E(I)V

    .line 225
    .line 226
    .line 227
    move-object v9, v14

    .line 228
    goto :goto_a

    .line 229
    :cond_9
    const-string v9, "("

    .line 230
    .line 231
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_c

    .line 236
    .line 237
    iget v9, v6, Lkz2;->b:I

    .line 238
    .line 239
    iget v13, v6, Lkz2;->c:I

    .line 240
    .line 241
    move/from16 v16, v5

    .line 242
    .line 243
    :goto_7
    if-ge v9, v13, :cond_b

    .line 244
    .line 245
    if-nez v16, :cond_b

    .line 246
    .line 247
    iget-object v11, v6, Lkz2;->a:[B

    .line 248
    .line 249
    add-int/lit8 v16, v9, 0x1

    .line 250
    .line 251
    aget-byte v9, v11, v9

    .line 252
    .line 253
    int-to-char v9, v9

    .line 254
    const/16 v11, 0x29

    .line 255
    .line 256
    if-ne v9, v11, :cond_a

    .line 257
    .line 258
    move v9, v10

    .line 259
    goto :goto_8

    .line 260
    :cond_a
    move v9, v5

    .line 261
    :goto_8
    move/from16 v11, v16

    .line 262
    .line 263
    move/from16 v16, v9

    .line 264
    .line 265
    move v9, v11

    .line 266
    const/4 v11, 0x2

    .line 267
    goto :goto_7

    .line 268
    :cond_b
    add-int/lit8 v9, v9, -0x1

    .line 269
    .line 270
    iget v11, v6, Lkz2;->b:I

    .line 271
    .line 272
    sub-int/2addr v9, v11

    .line 273
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 274
    .line 275
    invoke-virtual {v6, v9, v11}, Lkz2;->k(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v9

    .line 279
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    goto :goto_9

    .line 284
    :cond_c
    move-object v9, v7

    .line 285
    :goto_9
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    const-string v13, ")"

    .line 290
    .line 291
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    if-nez v11, :cond_d

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_d
    :goto_a
    if-eqz v9, :cond_32

    .line 299
    .line 300
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    if-nez v11, :cond_e

    .line 309
    .line 310
    goto/16 :goto_1d

    .line 311
    .line 312
    :cond_e
    new-instance v11, Lol1;

    .line 313
    .line 314
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 315
    .line 316
    .line 317
    iput-object v14, v11, Lol1;->a:Ljava/lang/String;

    .line 318
    .line 319
    iput-object v14, v11, Lol1;->b:Ljava/lang/String;

    .line 320
    .line 321
    sget-object v13, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 322
    .line 323
    iput-object v13, v11, Lol1;->c:Ljava/util/Set;

    .line 324
    .line 325
    iput-object v14, v11, Lol1;->d:Ljava/lang/String;

    .line 326
    .line 327
    iput-object v7, v11, Lol1;->e:Ljava/lang/String;

    .line 328
    .line 329
    iput-boolean v5, v11, Lol1;->g:Z

    .line 330
    .line 331
    iput-boolean v5, v11, Lol1;->i:Z

    .line 332
    .line 333
    iput v4, v11, Lol1;->j:I

    .line 334
    .line 335
    iput v4, v11, Lol1;->k:I

    .line 336
    .line 337
    iput v4, v11, Lol1;->l:I

    .line 338
    .line 339
    iput v4, v11, Lol1;->m:I

    .line 340
    .line 341
    iput v4, v11, Lol1;->o:I

    .line 342
    .line 343
    iput-boolean v5, v11, Lol1;->p:Z

    .line 344
    .line 345
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    if-eqz v13, :cond_10

    .line 350
    .line 351
    :cond_f
    :goto_b
    move v9, v5

    .line 352
    move-object v13, v7

    .line 353
    goto :goto_d

    .line 354
    :cond_10
    const/16 v13, 0x5b

    .line 355
    .line 356
    invoke-virtual {v9, v13}, Ljava/lang/String;->indexOf(I)I

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-eq v13, v4, :cond_12

    .line 361
    .line 362
    sget-object v14, Lnl1;->c:Ljava/util/regex/Pattern;

    .line 363
    .line 364
    invoke-virtual {v9, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v15

    .line 368
    invoke-virtual {v14, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->matches()Z

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    if-eqz v15, :cond_11

    .line 377
    .line 378
    invoke-virtual {v14, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iput-object v14, v11, Lol1;->d:Ljava/lang/String;

    .line 386
    .line 387
    :cond_11
    invoke-virtual {v9, v5, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    :cond_12
    sget-object v13, Lv23;->a:Ljava/lang/String;

    .line 392
    .line 393
    const-string v13, "\\."

    .line 394
    .line 395
    invoke-virtual {v9, v13, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v9

    .line 399
    aget-object v13, v9, v5

    .line 400
    .line 401
    const/16 v14, 0x23

    .line 402
    .line 403
    invoke-virtual {v13, v14}, Ljava/lang/String;->indexOf(I)I

    .line 404
    .line 405
    .line 406
    move-result v14

    .line 407
    if-eq v14, v4, :cond_13

    .line 408
    .line 409
    invoke-virtual {v13, v5, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v15

    .line 413
    iput-object v15, v11, Lol1;->b:Ljava/lang/String;

    .line 414
    .line 415
    add-int/lit8 v14, v14, 0x1

    .line 416
    .line 417
    invoke-virtual {v13, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v13

    .line 421
    iput-object v13, v11, Lol1;->a:Ljava/lang/String;

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :cond_13
    iput-object v13, v11, Lol1;->b:Ljava/lang/String;

    .line 425
    .line 426
    :goto_c
    array-length v13, v9

    .line 427
    if-le v13, v10, :cond_f

    .line 428
    .line 429
    invoke-static {v9, v10, v13}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    check-cast v9, [Ljava/lang/String;

    .line 434
    .line 435
    new-instance v13, Ljava/util/HashSet;

    .line 436
    .line 437
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    invoke-direct {v13, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 442
    .line 443
    .line 444
    iput-object v13, v11, Lol1;->c:Ljava/util/Set;

    .line 445
    .line 446
    goto :goto_b

    .line 447
    :goto_d
    const-string v14, "}"

    .line 448
    .line 449
    if-nez v9, :cond_30

    .line 450
    .line 451
    iget v9, v6, Lkz2;->b:I

    .line 452
    .line 453
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v13

    .line 457
    if-eqz v13, :cond_14

    .line 458
    .line 459
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v15

    .line 463
    if-eqz v15, :cond_15

    .line 464
    .line 465
    :cond_14
    move v15, v10

    .line 466
    goto :goto_e

    .line 467
    :cond_15
    move v15, v5

    .line 468
    :goto_e
    if-nez v15, :cond_16

    .line 469
    .line 470
    invoke-virtual {v6, v9}, Lkz2;->E(I)V

    .line 471
    .line 472
    .line 473
    invoke-static {v6}, Lnl1;->a(Lkz2;)V

    .line 474
    .line 475
    .line 476
    invoke-static {v6, v8}, Lnl1;->c(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 481
    .line 482
    .line 483
    move-result v16

    .line 484
    if-eqz v16, :cond_17

    .line 485
    .line 486
    :cond_16
    :goto_f
    move v7, v10

    .line 487
    :goto_10
    const/4 v1, 0x2

    .line 488
    const/4 v5, 0x3

    .line 489
    goto/16 :goto_1c

    .line 490
    .line 491
    :cond_17
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    const-string v5, ":"

    .line 496
    .line 497
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    if-nez v4, :cond_18

    .line 502
    .line 503
    goto :goto_f

    .line 504
    :cond_18
    invoke-static {v6}, Lnl1;->a(Lkz2;)V

    .line 505
    .line 506
    .line 507
    new-instance v4, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const/4 v5, 0x0

    .line 513
    :goto_11
    const-string v7, ";"

    .line 514
    .line 515
    if-nez v5, :cond_1c

    .line 516
    .line 517
    iget v10, v6, Lkz2;->b:I

    .line 518
    .line 519
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-nez v1, :cond_19

    .line 524
    .line 525
    const/4 v1, 0x0

    .line 526
    goto :goto_14

    .line 527
    :cond_19
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    move-result v17

    .line 531
    if-nez v17, :cond_1b

    .line 532
    .line 533
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    move-result v7

    .line 537
    if-eqz v7, :cond_1a

    .line 538
    .line 539
    goto :goto_13

    .line 540
    :cond_1a
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    :goto_12
    move-object/from16 v1, p0

    .line 544
    .line 545
    const/4 v10, 0x1

    .line 546
    goto :goto_11

    .line 547
    :cond_1b
    :goto_13
    invoke-virtual {v6, v10}, Lkz2;->E(I)V

    .line 548
    .line 549
    .line 550
    const/4 v5, 0x1

    .line 551
    goto :goto_12

    .line 552
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    :goto_14
    if-eqz v1, :cond_1d

    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    if-eqz v4, :cond_1e

    .line 563
    .line 564
    :cond_1d
    :goto_15
    const/4 v1, 0x2

    .line 565
    :goto_16
    const/4 v5, 0x3

    .line 566
    const/4 v7, 0x1

    .line 567
    goto/16 :goto_1c

    .line 568
    .line 569
    :cond_1e
    iget v4, v6, Lkz2;->b:I

    .line 570
    .line 571
    invoke-static {v6, v8}, Lnl1;->b(Lkz2;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    if-eqz v7, :cond_1f

    .line 580
    .line 581
    goto :goto_17

    .line 582
    :cond_1f
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-eqz v5, :cond_1d

    .line 587
    .line 588
    invoke-virtual {v6, v4}, Lkz2;->E(I)V

    .line 589
    .line 590
    .line 591
    :goto_17
    const-string v4, "color"

    .line 592
    .line 593
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    if-eqz v4, :cond_21

    .line 598
    .line 599
    const/4 v4, 0x1

    .line 600
    invoke-static {v1, v4}, Lyo2;->a(Ljava/lang/String;Z)I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    iput v1, v11, Lol1;->f:I

    .line 605
    .line 606
    iput-boolean v4, v11, Lol1;->g:Z

    .line 607
    .line 608
    :cond_20
    :goto_18
    move v7, v4

    .line 609
    goto :goto_10

    .line 610
    :cond_21
    const/4 v4, 0x1

    .line 611
    const-string v5, "background-color"

    .line 612
    .line 613
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    if-eqz v5, :cond_22

    .line 618
    .line 619
    invoke-static {v1, v4}, Lyo2;->a(Ljava/lang/String;Z)I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    iput v1, v11, Lol1;->h:I

    .line 624
    .line 625
    iput-boolean v4, v11, Lol1;->i:Z

    .line 626
    .line 627
    goto :goto_18

    .line 628
    :cond_22
    const-string v5, "ruby-position"

    .line 629
    .line 630
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    if-eqz v5, :cond_24

    .line 635
    .line 636
    const-string v5, "over"

    .line 637
    .line 638
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    if-eqz v5, :cond_23

    .line 643
    .line 644
    iput v4, v11, Lol1;->o:I

    .line 645
    .line 646
    goto :goto_18

    .line 647
    :cond_23
    const-string v4, "under"

    .line 648
    .line 649
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    if-eqz v1, :cond_1d

    .line 654
    .line 655
    const/4 v1, 0x2

    .line 656
    iput v1, v11, Lol1;->o:I

    .line 657
    .line 658
    goto :goto_16

    .line 659
    :cond_24
    const-string v4, "text-combine-upright"

    .line 660
    .line 661
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v4

    .line 665
    if-eqz v4, :cond_27

    .line 666
    .line 667
    const-string v4, "all"

    .line 668
    .line 669
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    if-nez v4, :cond_25

    .line 674
    .line 675
    const-string v4, "digits"

    .line 676
    .line 677
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    if-eqz v1, :cond_26

    .line 682
    .line 683
    :cond_25
    const/4 v1, 0x1

    .line 684
    goto :goto_19

    .line 685
    :cond_26
    const/4 v1, 0x0

    .line 686
    :goto_19
    iput-boolean v1, v11, Lol1;->p:Z

    .line 687
    .line 688
    goto :goto_15

    .line 689
    :cond_27
    const-string v4, "text-decoration"

    .line 690
    .line 691
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-eqz v4, :cond_28

    .line 696
    .line 697
    const-string v4, "underline"

    .line 698
    .line 699
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    if-eqz v1, :cond_1d

    .line 704
    .line 705
    const/4 v4, 0x1

    .line 706
    iput v4, v11, Lol1;->j:I

    .line 707
    .line 708
    goto :goto_18

    .line 709
    :cond_28
    const-string v4, "font-family"

    .line 710
    .line 711
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    if-eqz v4, :cond_29

    .line 716
    .line 717
    invoke-static {v1}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    iput-object v1, v11, Lol1;->e:Ljava/lang/String;

    .line 722
    .line 723
    goto/16 :goto_15

    .line 724
    .line 725
    :cond_29
    const-string v4, "font-weight"

    .line 726
    .line 727
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    move-result v4

    .line 731
    if-eqz v4, :cond_2a

    .line 732
    .line 733
    const-string v4, "bold"

    .line 734
    .line 735
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    if-eqz v1, :cond_1d

    .line 740
    .line 741
    const/4 v4, 0x1

    .line 742
    iput v4, v11, Lol1;->k:I

    .line 743
    .line 744
    goto/16 :goto_18

    .line 745
    .line 746
    :cond_2a
    const/4 v4, 0x1

    .line 747
    const-string v5, "font-style"

    .line 748
    .line 749
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    if-eqz v5, :cond_2b

    .line 754
    .line 755
    const-string v5, "italic"

    .line 756
    .line 757
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    if-eqz v1, :cond_20

    .line 762
    .line 763
    iput v4, v11, Lol1;->l:I

    .line 764
    .line 765
    goto/16 :goto_18

    .line 766
    .line 767
    :cond_2b
    const-string v4, "font-size"

    .line 768
    .line 769
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    if-eqz v4, :cond_1d

    .line 774
    .line 775
    sget-object v4, Lnl1;->d:Ljava/util/regex/Pattern;

    .line 776
    .line 777
    invoke-static {v1}, Lum;->D(Ljava/lang/String;)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v5

    .line 781
    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 786
    .line 787
    .line 788
    move-result v5

    .line 789
    if-nez v5, :cond_2c

    .line 790
    .line 791
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    new-instance v5, Ljava/lang/StringBuilder;

    .line 796
    .line 797
    add-int/lit8 v4, v4, 0x16

    .line 798
    .line 799
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 800
    .line 801
    .line 802
    const-string v4, "Invalid font-size: \'"

    .line 803
    .line 804
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    const-string v1, "\'."

    .line 811
    .line 812
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    invoke-static {v1}, La30;->x(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    goto/16 :goto_15

    .line 823
    .line 824
    :cond_2c
    const/4 v1, 0x2

    .line 825
    invoke-virtual {v4, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v5

    .line 829
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 833
    .line 834
    .line 835
    move-result v1

    .line 836
    const/16 v7, 0x25

    .line 837
    .line 838
    if-eq v1, v7, :cond_2e

    .line 839
    .line 840
    const/16 v7, 0xca8

    .line 841
    .line 842
    if-eq v1, v7, :cond_2d

    .line 843
    .line 844
    const/16 v7, 0xe08

    .line 845
    .line 846
    if-ne v1, v7, :cond_2f

    .line 847
    .line 848
    const-string v1, "px"

    .line 849
    .line 850
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v1

    .line 854
    if-eqz v1, :cond_2f

    .line 855
    .line 856
    const/4 v1, 0x1

    .line 857
    iput v1, v11, Lol1;->m:I

    .line 858
    .line 859
    move v7, v1

    .line 860
    const/4 v1, 0x2

    .line 861
    const/4 v5, 0x3

    .line 862
    goto :goto_1b

    .line 863
    :cond_2d
    const-string v1, "em"

    .line 864
    .line 865
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-eqz v1, :cond_2f

    .line 870
    .line 871
    const/4 v1, 0x2

    .line 872
    iput v1, v11, Lol1;->m:I

    .line 873
    .line 874
    const/4 v5, 0x3

    .line 875
    :goto_1a
    const/4 v7, 0x1

    .line 876
    goto :goto_1b

    .line 877
    :cond_2e
    const/4 v1, 0x2

    .line 878
    const-string v7, "%"

    .line 879
    .line 880
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 881
    .line 882
    .line 883
    move-result v5

    .line 884
    if-eqz v5, :cond_2f

    .line 885
    .line 886
    const/4 v5, 0x3

    .line 887
    iput v5, v11, Lol1;->m:I

    .line 888
    .line 889
    goto :goto_1a

    .line 890
    :goto_1b
    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 898
    .line 899
    .line 900
    move-result v4

    .line 901
    iput v4, v11, Lol1;->n:F

    .line 902
    .line 903
    goto :goto_1c

    .line 904
    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 905
    .line 906
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 907
    .line 908
    .line 909
    throw v0

    .line 910
    :goto_1c
    move-object/from16 v1, p0

    .line 911
    .line 912
    move v10, v7

    .line 913
    move v9, v15

    .line 914
    const/4 v4, -0x1

    .line 915
    const/4 v5, 0x0

    .line 916
    const/4 v7, 0x0

    .line 917
    goto/16 :goto_d

    .line 918
    .line 919
    :cond_30
    move v7, v10

    .line 920
    const/4 v1, 0x2

    .line 921
    const/4 v5, 0x3

    .line 922
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v4

    .line 926
    if-eqz v4, :cond_31

    .line 927
    .line 928
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 929
    .line 930
    .line 931
    :cond_31
    move v11, v1

    .line 932
    move v10, v7

    .line 933
    const/4 v4, -0x1

    .line 934
    const/4 v5, 0x0

    .line 935
    const/4 v7, 0x0

    .line 936
    move-object/from16 v1, p0

    .line 937
    .line 938
    goto/16 :goto_5

    .line 939
    .line 940
    :cond_32
    :goto_1d
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 941
    .line 942
    .line 943
    :cond_33
    :goto_1e
    move-object/from16 v1, p0

    .line 944
    .line 945
    const/4 v7, 0x0

    .line 946
    goto/16 :goto_1

    .line 947
    .line 948
    :cond_34
    move-object/from16 v1, p0

    .line 949
    .line 950
    goto/16 :goto_4

    .line 951
    .line 952
    :cond_35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 953
    .line 954
    const-string v1, "A style block was found after the first cue."

    .line 955
    .line 956
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    throw v0

    .line 960
    :cond_36
    sget-object v1, Lul1;->a:Ljava/util/regex/Pattern;

    .line 961
    .line 962
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 963
    .line 964
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    if-nez v4, :cond_37

    .line 969
    .line 970
    goto :goto_1f

    .line 971
    :cond_37
    sget-object v5, Lul1;->a:Ljava/util/regex/Pattern;

    .line 972
    .line 973
    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 974
    .line 975
    .line 976
    move-result-object v6

    .line 977
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 978
    .line 979
    .line 980
    move-result v7

    .line 981
    if-nez v7, :cond_39

    .line 982
    .line 983
    invoke-virtual {v3, v1}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    if-eqz v1, :cond_38

    .line 988
    .line 989
    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    if-eqz v5, :cond_38

    .line 998
    .line 999
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v4

    .line 1003
    invoke-static {v4, v1, v3, v0}, Lul1;->b(Ljava/lang/String;Ljava/util/regex/Matcher;Lkz2;Ljava/util/ArrayList;)Lpl1;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    goto :goto_20

    .line 1008
    :cond_38
    :goto_1f
    const/4 v1, 0x0

    .line 1009
    goto :goto_20

    .line 1010
    :cond_39
    const/4 v1, 0x0

    .line 1011
    invoke-static {v1, v6, v3, v0}, Lul1;->b(Ljava/lang/String;Ljava/util/regex/Matcher;Lkz2;Ljava/util/ArrayList;)Lpl1;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v4

    .line 1015
    move-object v1, v4

    .line 1016
    :goto_20
    if-eqz v1, :cond_33

    .line 1017
    .line 1018
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    goto :goto_1e

    .line 1022
    :cond_3a
    new-instance v0, Lt83;

    .line 1023
    .line 1024
    invoke-direct {v0, v2}, Lt83;-><init>(Ljava/util/ArrayList;)V

    .line 1025
    .line 1026
    .line 1027
    move-object/from16 v1, p4

    .line 1028
    .line 1029
    invoke-static {v0, v1}, La30;->p(Lhk1;Llk1;)V

    .line 1030
    .line 1031
    .line 1032
    return-void

    .line 1033
    :cond_3b
    move-object/from16 v1, p4

    .line 1034
    .line 1035
    move-object/from16 v1, p0

    .line 1036
    .line 1037
    goto/16 :goto_0

    .line 1038
    .line 1039
    :catch_0
    move-exception v0

    .line 1040
    goto :goto_21

    .line 1041
    :cond_3c
    :try_start_1
    invoke-virtual {v3, v4}, Lkz2;->E(I)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v3, v5}, Lkz2;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    const/4 v1, 0x0

    .line 1057
    invoke-static {v1, v0}, Llq1;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Llq1;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    throw v0
    :try_end_1
    .catch Llq1; {:try_start_1 .. :try_end_1} :catch_0

    .line 1062
    :goto_21
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1063
    .line 1064
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 1065
    .line 1066
    .line 1067
    throw v1
.end method

.method public h()Lys0;
    .locals 6

    .line 1
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    .line 2
    .line 3
    iget-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lzs0;

    .line 6
    .line 7
    iget-object v2, v1, Lzs0;->c:Lus0;

    .line 8
    .line 9
    monitor-enter v2

    .line 10
    :try_start_0
    iget-object v1, v1, Lzs0;->d:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lys0;

    .line 44
    .line 45
    invoke-static {v5, v0}, Li30;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    move-object v4, v3

    .line 52
    :cond_1
    if-eqz v4, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    monitor-exit v2

    .line 58
    return-object v4

    .line 59
    :goto_1
    monitor-exit v2

    .line 60
    throw v0
.end method

.method public i(Lk90;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcw0;

    .line 4
    .line 5
    return-object p1
.end method

.method public j(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lk90;

    .line 4
    .line 5
    iput p1, v0, Lk90;->a:F

    .line 6
    .line 7
    iput p2, v0, Lk90;->b:F

    .line 8
    .line 9
    iput-object p3, v0, Lk90;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, v0, Lk90;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iput p5, v0, Lk90;->c:F

    .line 14
    .line 15
    iput p6, v0, Lk90;->d:F

    .line 16
    .line 17
    iput p7, v0, Lk90;->e:F

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lvq2;->i(Lk90;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public k(Lbw1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li5;

    .line 4
    .line 5
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Llz;

    .line 8
    .line 9
    invoke-virtual {p1, v0, v1}, Lbw1;->a(Li5;Llz;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public l(Ltn0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lmb1;

    .line 18
    .line 19
    iget-object v1, v0, Lmb1;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, Lmb1;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v0, v0, Lmb1;->b:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public m(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm51;

    .line 4
    .line 5
    iget-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln51;

    .line 8
    .line 9
    invoke-interface {v1}, Ln51;->J()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-interface {v1}, Ln51;->l()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-interface {v1, p1}, Ln51;->r(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-interface {v1, p1}, Ln51;->R(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput v2, v0, Lm51;->b:I

    .line 26
    .line 27
    iput v3, v0, Lm51;->c:I

    .line 28
    .line 29
    iput v4, v0, Lm51;->d:I

    .line 30
    .line 31
    iput p1, v0, Lm51;->e:I

    .line 32
    .line 33
    const/16 p1, 0x6003

    .line 34
    .line 35
    iput p1, v0, Lm51;->a:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lm51;->a()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public n(Lc2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp21;

    .line 4
    .line 5
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/ActionMode$Callback;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lp21;->k(Lc2;)Ldz0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v1, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lh6;

    .line 19
    .line 20
    iget-object v0, p1, Lh6;->B:Landroid/widget/PopupWindow;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p1, Lh6;->q:Landroid/view/Window;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p1, Lh6;->C:Lv5;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p1, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p1, Lh6;->D:Lw61;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Lw61;->b()V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, p1, Lh6;->A:Landroidx/appcompat/widget/ActionBarContextView;

    .line 47
    .line 48
    invoke-static {v0}, Le61;->a(Landroid/view/View;)Lw61;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {v0, v1}, Lw61;->a(F)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p1, Lh6;->D:Lw61;

    .line 57
    .line 58
    new-instance v1, Lw5;

    .line 59
    .line 60
    const/4 v2, 0x2

    .line 61
    invoke-direct {v1, v2, p0}, Lw5;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lw61;->d(Ly61;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    const/4 v0, 0x0

    .line 68
    iput-object v0, p1, Lh6;->z:Lc2;

    .line 69
    .line 70
    iget-object v0, p1, Lh6;->F:Landroid/view/ViewGroup;

    .line 71
    .line 72
    sget-object v1, Le61;->a:Ljava/util/WeakHashMap;

    .line 73
    .line 74
    invoke-static {v0}, Lr51;->c(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lh6;->I()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public o(Lc2;Landroid/view/Menu;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lvq2;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh6;

    .line 4
    .line 5
    iget-object v0, v0, Lh6;->F:Landroid/view/ViewGroup;

    .line 6
    .line 7
    sget-object v1, Le61;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-static {v0}, Lr51;->c(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lp21;

    .line 15
    .line 16
    iget-object v1, v0, Lp21;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/view/ActionMode$Callback;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lp21;->k(Lc2;)Ldz0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v2, v0, Lp21;->i:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lbw0;

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Lbw0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/view/Menu;

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    new-instance v3, Lie0;

    .line 37
    .line 38
    iget-object v0, v0, Lp21;->g:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Landroid/content/Context;

    .line 41
    .line 42
    move-object v4, p2

    .line 43
    check-cast v4, Lod0;

    .line 44
    .line 45
    invoke-direct {v3, v0, v4}, Lie0;-><init>(Landroid/content/Context;Lod0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p2, v3}, Lbw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-interface {v1, p1, v3}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1
.end method

.method public p(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Lvq2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Lhl2;

    .line 7
    .line 8
    iget-object p1, p1, Lhl2;->a:Ljava/util/List;

    .line 9
    .line 10
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lg4;

    .line 13
    .line 14
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lkl2;

    .line 17
    .line 18
    iget-object v2, v1, Lkl2;->a:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-object v3, Llq3;->g:Llq3;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ln70;

    .line 46
    .line 47
    new-instance v5, Lu42;

    .line 48
    .line 49
    const/4 v6, 0x3

    .line 50
    invoke-direct {v5, v6, v0}, Lu42;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-class v6, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-static {v3, v6, v5, v2}, Lpu1;->L(Ln70;Ljava/lang/Class;Lyp3;Ljava/util/concurrent/Executor;)Lwo3;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v5, Lop1;

    .line 60
    .line 61
    const/4 v6, 0x1

    .line 62
    invoke-direct {v5, v1, v0, v4, v6}, Lop1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3, v5, v2}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    new-instance p1, Lgw3;

    .line 71
    .line 72
    invoke-direct {p1, v1, v0}, Lgw3;-><init>(Lkl2;Lg4;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Ljq3;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-direct {v0, v3, p1, v1}, Ljq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-interface {v3, v0, v2}, Ln70;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :goto_1
    new-instance p1, Ljl2;

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    invoke-direct {p1, v0, v1}, Ljl2;-><init>(Lg4;I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    return-void

    .line 95
    :pswitch_1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v5, v0

    .line 98
    check-cast v5, Ljava/lang/String;

    .line 99
    .line 100
    move-object v6, p1

    .line 101
    check-cast v6, Ljava/lang/String;

    .line 102
    .line 103
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Lnj2;

    .line 106
    .line 107
    invoke-virtual {p1}, Lnj2;->p()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    iget-object v8, p1, Lnj2;->t:Lgm2;

    .line 112
    .line 113
    iget-object v1, p1, Lnj2;->l:Ldb3;

    .line 114
    .line 115
    iget-object v2, p1, Lnj2;->j:Lh83;

    .line 116
    .line 117
    iget-object v3, p1, Lnj2;->k:La83;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    invoke-virtual/range {v1 .. v8}, Ldb3;->b(Lh83;La83;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lgm2;)Ljava/util/ArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget-object v1, p1, Lnj2;->s:Lao2;

    .line 125
    .line 126
    iget-object p1, p1, Lnj2;->m:Lq83;

    .line 127
    .line 128
    invoke-virtual {p1, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_2
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ltd2;

    .line 135
    .line 136
    invoke-interface {v0, p1}, Ltd2;->c(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public q(Ljava/lang/String;Lys0;)V
    .locals 3

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lzs0;

    .line 9
    .line 10
    iget-object v1, v0, Lzs0;->c:Lus0;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-object v2, v0, Lzs0;->d:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lzs0;->d:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit v1

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_1
    const-string p1, "SavedStateProvider with the given key is already registered"

    .line 31
    .line 32
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :goto_0
    monitor-exit v1

    .line 39
    throw p1
.end method

.method public r()V
    .locals 5

    .line 1
    const-class v0, Lj50;

    .line 2
    .line 3
    iget-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lzs0;

    .line 6
    .line 7
    iget-boolean v1, v1, Lzs0;->h:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lg5;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Lg5;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Lg5;-><init>(Lvq2;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iput-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lg5;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v1, Lg5;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :catch_0
    move-exception v1

    .line 47
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    new-instance v3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v4, "Class "

    .line 52
    .line 53
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " must have default constructor in order to be automatically recreated"

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    throw v2

    .line 76
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v1, "Can not perform this action after onSaveInstanceState"

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v0
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 8

    .line 1
    iget v0, p0, Lvq2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lg4;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lg4;->s(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lkl2;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v0, Lmd2;->f:Lld2;

    .line 21
    .line 22
    new-instance v1, Lfu1;

    .line 23
    .line 24
    const/16 v2, 0x18

    .line 25
    .line 26
    invoke-direct {v1, v2, p1}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lld2;->execute(Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_1
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Lnj2;

    .line 36
    .line 37
    iget-object v0, p1, Lnj2;->l:Ldb3;

    .line 38
    .line 39
    iget-object v1, p1, Lnj2;->j:Lh83;

    .line 40
    .line 41
    iget-object v2, p1, Lnj2;->k:La83;

    .line 42
    .line 43
    iget-object v3, p0, Lvq2;->g:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v4, v3

    .line 46
    check-cast v4, Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1}, Lnj2;->p()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    iget-object v7, p1, Lnj2;->t:Lgm2;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-virtual/range {v0 .. v7}, Ldb3;->b(Lh83;La83;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lgm2;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object p1, p1, Lnj2;->m:Lq83;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {p1, v0, v1}, Lq83;->a(Ljava/util/ArrayList;Lao2;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    iget-object p1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lrd2;

    .line 70
    .line 71
    invoke-interface {p1}, Lrd2;->a()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public t()V
    .locals 6

    .line 1
    iget-object v0, p0, Lvq2;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbh;

    .line 4
    .line 5
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lbh;->g:Landroid/os/Bundle;

    .line 10
    .line 11
    iget-object v3, v0, Lbh;->f:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    const-string v4, "key"

    .line 14
    .line 15
    invoke-static {v1, v4}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v4, v0, Lbh;->d:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    iget-object v4, v0, Lbh;->b:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object v5, v0, Lbh;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-interface {v5, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v4, v0, Lbh;->e:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-interface {v4, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v4, 0x22

    .line 71
    .line 72
    const-class v5, Ll2;

    .line 73
    .line 74
    if-lt v3, v4, :cond_2

    .line 75
    .line 76
    invoke-static {v2, v1, v5}, Lic;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v5, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    const/4 v3, 0x0

    .line 93
    :goto_0
    check-cast v3, Ll2;

    .line 94
    .line 95
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    iget-object v0, v0, Lbh;->c:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_5

    .line 108
    .line 109
    return-void

    .line 110
    :cond_5
    new-instance v0, Ljava/lang/ClassCastException;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lvq2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Bounds{lower="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lvq2;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ly20;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " upper="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lvq2;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ly20;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, "}"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method
