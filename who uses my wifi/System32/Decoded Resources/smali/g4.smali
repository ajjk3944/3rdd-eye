.class public final Lg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Liq3;
.implements Lhk1;
.implements Lch3;
.implements Lt9;
.implements Lu9;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const/16 v0, 0x11

    iput v0, p0, Lg4;->f:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lg4;->j:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->h:Ljava/lang/Object;

    new-instance p2, Landroid/os/HandlerThread;

    const-string p3, "GassClient"

    invoke-direct {p2, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lg4;->k:Ljava/lang/Object;

    .line 7
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 8
    new-instance v0, Lvd3;

    .line 9
    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v2

    const v5, 0x8c6180

    move-object v4, p0

    move-object v3, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lvd3;-><init>(Landroid/content/Context;Landroid/os/Looper;Lt9;Lu9;I)V

    iput-object v0, v3, Lg4;->g:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, v3, Lg4;->i:Ljava/lang/Object;

    .line 11
    invoke-virtual {v0}, Lw9;->n()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljg2;Ljg2;Lmv2;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lg4;->f:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lg4;->h:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->j:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lg4;->k:Ljava/lang/Object;

    iput-object p4, p0, Lg4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk62;Le51;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lg4;->f:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg4;->g:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lg4;->j:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->k:Ljava/lang/Object;

    iput-object p2, p0, Lg4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable$Callback;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lg4;->f:I

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Lof0;

    .line 64
    invoke-direct {v0}, Lof0;-><init>()V

    .line 65
    iput-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lg4;->h:Ljava/lang/Object;

    .line 68
    const-string v0, ".ttf"

    iput-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 69
    instance-of v0, p1, Landroid/view/View;

    if-nez v0, :cond_0

    .line 70
    const-string p1, "LottieDrawable must be inside of a view for images to work."

    invoke-static {p1}, Lj80;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 71
    iput-object p1, p0, Lg4;->i:Ljava/lang/Object;

    goto :goto_0

    .line 72
    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iput-object p1, p0, Lg4;->i:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lb4;Lc4;Lc4;Lc4;Lc4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg4;->f:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    .line 51
    iput-object p2, p0, Lg4;->h:Ljava/lang/Object;

    .line 52
    iput-object p3, p0, Lg4;->i:Ljava/lang/Object;

    .line 53
    iput-object p4, p0, Lg4;->j:Ljava/lang/Object;

    .line 54
    iput-object p5, p0, Lg4;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf32;)V
    .locals 5

    const/4 v0, 0x7

    iput v0, p0, Lg4;->f:I

    .line 20
    const-string v0, ""

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lg4;->j:Ljava/lang/Object;

    new-instance v1, Lj51;

    invoke-direct {v1}, Lj51;-><init>()V

    iput-object v1, p0, Lg4;->i:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lg4;->k:Ljava/lang/Object;

    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 24
    :try_start_0
    invoke-interface {p1}, Lf32;->c()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 26
    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_2

    .line 27
    check-cast v2, Landroid/os/IBinder;

    .line 28
    const-string v3, "com.google.android.gms.ads.internal.formats.client.INativeAdImage"

    .line 29
    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lb22;

    if-eqz v4, :cond_1

    .line 30
    check-cast v3, Lb22;

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance v3, La22;

    invoke-direct {v3, v2}, La22;-><init>(Landroid/os/IBinder;)V

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_0

    .line 31
    iget-object v2, p0, Lg4;->j:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    new-instance v4, Lc22;

    .line 32
    invoke-direct {v4, v3}, Lc22;-><init>(Lb22;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 33
    :goto_2
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    :cond_3
    :try_start_1
    iget-object p1, p0, Lg4;->g:Ljava/lang/Object;

    check-cast p1, Lf32;

    .line 35
    invoke-interface {p1}, Lf32;->X()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 37
    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_5

    .line 38
    check-cast v2, Landroid/os/IBinder;

    invoke-static {v2}, Lc63;->B3(Landroid/os/IBinder;)Lnq2;

    move-result-object v2

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_5

    :cond_5
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_4

    iget-object v3, p0, Lg4;->k:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    new-instance v4, Lzs3;

    .line 39
    invoke-direct {v4, v2}, Lzs3;-><init>(Lnq2;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 40
    :goto_5
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    :cond_6
    :try_start_2
    iget-object p1, p0, Lg4;->g:Ljava/lang/Object;

    check-cast p1, Lf32;

    .line 42
    invoke-interface {p1}, Lf32;->f()Lb22;

    move-result-object p1

    if-eqz p1, :cond_7

    new-instance v2, Lc22;

    .line 43
    invoke-direct {v2, p1}, Lc22;-><init>(Lb22;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v2

    goto :goto_6

    :catch_2
    move-exception p1

    .line 44
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    :cond_7
    :goto_6
    iput-object v1, p0, Lg4;->h:Ljava/lang/Object;

    :try_start_3
    iget-object p1, p0, Lg4;->g:Ljava/lang/Object;

    check-cast p1, Lf32;

    .line 46
    invoke-interface {p1}, Lf32;->m()Lx12;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p1, Lih;

    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    check-cast v1, Lf32;

    .line 47
    invoke-interface {v1}, Lf32;->m()Lx12;

    move-result-object v1

    invoke-direct {p1, v1}, Lih;-><init>(Lx12;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    :catch_3
    move-exception p1

    .line 48
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_7
    return-void
.end method

.method public constructor <init>(Lfv1;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lg4;->f:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lg4;->j:Ljava/lang/Object;

    iput-object p4, p0, Lg4;->h:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgl1;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lg4;->f:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->i:Ljava/lang/Object;

    iput-object p4, p0, Lg4;->k:Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lg4;->h:Ljava/lang/Object;

    .line 14
    new-instance p2, Ljava/util/TreeSet;

    invoke-direct {p2}, Ljava/util/TreeSet;-><init>()V

    const/4 p3, 0x0

    .line 15
    invoke-virtual {p1, p2, p3}, Lgl1;->f(Ljava/util/TreeSet;Z)V

    .line 16
    invoke-virtual {p2}, Ljava/util/TreeSet;->size()I

    move-result p1

    new-array p1, p1, [J

    .line 17
    invoke-virtual {p2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Long;

    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    add-int/lit8 p4, p3, 0x1

    .line 18
    aput-wide v0, p1, p3

    move p3, p4

    goto :goto_0

    .line 19
    :cond_0
    iput-object p1, p0, Lg4;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p6, p0, Lg4;->f:I

    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    iput-object p2, p0, Lg4;->j:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->h:Ljava/lang/Object;

    iput-object p4, p0, Lg4;->i:Ljava/lang/Object;

    iput-object p5, p0, Lg4;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 4
    iput p6, p0, Lg4;->f:I

    iput-object p2, p0, Lg4;->g:Ljava/lang/Object;

    iput-object p3, p0, Lg4;->j:Ljava/lang/Object;

    iput-object p4, p0, Lg4;->h:Ljava/lang/Object;

    iput-object p5, p0, Lg4;->i:Ljava/lang/Object;

    iput-object p1, p0, Lg4;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lg4;->f:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    iput-object p1, p0, Lg4;->g:Ljava/lang/Object;

    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    iput-object p2, p0, Lg4;->j:Ljava/lang/Object;

    .line 78
    iput-object p3, p0, Lg4;->h:Ljava/lang/Object;

    .line 79
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    iput-object p4, p0, Lg4;->i:Ljava/lang/Object;

    .line 81
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "-"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 82
    iput-object p1, p0, Lg4;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lg4;->f:I

    const-string v0, "initialState"

    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 57
    iput-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 58
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lg4;->j:Ljava/lang/Object;

    .line 59
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 60
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lg4;->i:Ljava/lang/Object;

    .line 61
    new-instance p1, Lpw;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p0}, Lpw;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lg4;->k:Ljava/lang/Object;

    return-void
.end method

.method public static i(Landroid/content/Context;Le51;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v1, Ls02;->d:Lso1;

    .line 7
    .line 8
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const-string v1, "package_name"

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    :cond_0
    const-string v1, "js"

    .line 30
    .line 31
    iget-object p1, p1, Le51;->f:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string p1, "mf"

    .line 37
    .line 38
    sget-object v1, Ls02;->e:Lso1;

    .line 39
    .line 40
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    const-string p1, "cl"

    .line 48
    .line 49
    const-string v1, "811902923"

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    const-string p1, "rapid_rc"

    .line 55
    .line 56
    const-string v1, "dev"

    .line 57
    .line 58
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    const-string p1, "rapid_rollup"

    .line 62
    .line 63
    const-string v1, "HEAD"

    .line 64
    .line 65
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    const-string p1, "admob_module_version"

    .line 69
    .line 70
    const v1, 0xbdfcb8

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string p1, "dynamite_local_version"

    .line 77
    .line 78
    const v2, 0xf212370

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    const-string p1, "dynamite_version"

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-static {p0, v2}, Lar;->d(Landroid/content/Context;Z)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    invoke-virtual {v0, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    const-string p0, "container_version"

    .line 95
    .line 96
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    :catch_0
    return-object v0
.end method

.method private final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public static k()Lqr1;
    .locals 3

    .line 1
    invoke-static {}, Lqr1;->C0()Lfr1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/32 v1, 0x8000

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lfr1;->h(J)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lqr1;

    .line 16
    .line 17
    return-object v0
.end method


# virtual methods
.method public T(I)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lg4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 4
    .line 5
    invoke-static {}, Lg4;->k()Lqr1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    return-void
.end method

.method public U(Lrh;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lg4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 4
    .line 5
    invoke-static {}, Lg4;->k()Lqr1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    return-void
.end method

.method public Y()V
    .locals 8

    .line 1
    iget-object v0, p0, Lg4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 4
    .line 5
    iget-object v1, p0, Lg4;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/os/HandlerThread;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    iget-object v3, p0, Lg4;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lvd3;

    .line 13
    .line 14
    invoke-virtual {v3}, Lw9;->t()Landroid/os/IInterface;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, Lyd3;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-object v3, v2

    .line 22
    :goto_0
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :try_start_1
    new-instance v4, Lwd3;

    .line 25
    .line 26
    iget-object v5, p0, Lg4;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/lang/String;

    .line 29
    .line 30
    iget-object v6, p0, Lg4;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Ljava/lang/String;

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    invoke-direct {v4, v7, v5, v6}, Lwd3;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Lsb1;->U()Landroid/os/Parcel;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-static {v5, v4}, Liv1;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v5, v7}, Lsb1;->Y(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v4, Lxd3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 50
    .line 51
    invoke-static {v3, v4}, Liv1;->b(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Lxd3;

    .line 56
    .line 57
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 58
    .line 59
    .line 60
    iget-object v3, v4, Lxd3;->g:Lqr1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    if-nez v3, :cond_0

    .line 63
    .line 64
    :try_start_2
    iget-object v3, v4, Lxd3;->h:[B

    .line 65
    .line 66
    sget-object v5, Lh54;->a:Lh54;

    .line 67
    .line 68
    sget v5, Lu44;->a:I

    .line 69
    .line 70
    sget-object v5, Lh54;->b:Lh54;

    .line 71
    .line 72
    invoke-static {v3, v5}, Lqr1;->B0([BLh54;)Lqr1;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iput-object v3, v4, Lxd3;->g:Lqr1;

    .line 77
    .line 78
    iput-object v2, v4, Lxd3;->h:[B
    :try_end_2
    .catch La64; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catch_1
    move-exception v2

    .line 82
    goto :goto_1

    .line 83
    :catch_2
    move-exception v2

    .line 84
    :goto_1
    :try_start_3
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v3

    .line 90
    :cond_0
    :goto_2
    invoke-virtual {v4}, Lxd3;->a()V

    .line 91
    .line 92
    .line 93
    iget-object v2, v4, Lxd3;->g:Lqr1;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    .line 97
    .line 98
    :catch_3
    :goto_3
    invoke-virtual {p0}, Lg4;->d()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catchall_0
    :try_start_4
    invoke-static {}, Lg4;->k()Lqr1;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    invoke-virtual {p0}, Lg4;->d()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_1
    return-void
.end method

.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    return v0
.end method

.method public b(J)Ljava/util/ArrayList;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg4;->h:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, v1

    .line 6
    check-cast v5, Ljava/util/Map;

    .line 7
    .line 8
    iget-object v1, v0, Lg4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v6, v1

    .line 11
    check-cast v6, Ljava/util/HashMap;

    .line 12
    .line 13
    iget-object v1, v0, Lg4;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v2, v0, Lg4;->g:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lgl1;

    .line 20
    .line 21
    new-instance v13, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v7, v2, Lgl1;->h:Ljava/lang/String;

    .line 27
    .line 28
    move-wide/from16 v3, p1

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4, v7, v13}, Lgl1;->g(JLjava/lang/String;Ljava/util/ArrayList;)V

    .line 31
    .line 32
    .line 33
    new-instance v8, Ljava/util/TreeMap;

    .line 34
    .line 35
    invoke-direct {v8}, Ljava/util/TreeMap;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    move-object v11, v7

    .line 40
    move-object v12, v8

    .line 41
    move-object v7, v2

    .line 42
    move-wide v8, v3

    .line 43
    invoke-virtual/range {v7 .. v12}, Lgl1;->h(JZLjava/lang/String;Ljava/util/TreeMap;)V

    .line 44
    .line 45
    .line 46
    move-object v7, v11

    .line 47
    move-object v8, v12

    .line 48
    invoke-virtual/range {v2 .. v8}, Lgl1;->j(JLjava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/util/TreeMap;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v4, 0x0

    .line 61
    move v5, v4

    .line 62
    :goto_0
    if-ge v5, v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Landroid/util/Pair;

    .line 69
    .line 70
    iget-object v9, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    check-cast v9, Ljava/lang/String;

    .line 77
    .line 78
    if-nez v9, :cond_0

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    invoke-static {v9, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    array-length v10, v9

    .line 86
    invoke-static {v9, v4, v10}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    move-result-object v18

    .line 90
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Ljl1;

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    iget v9, v7, Ljl1;->b:F

    .line 102
    .line 103
    iget v10, v7, Ljl1;->c:F

    .line 104
    .line 105
    iget v11, v7, Ljl1;->e:I

    .line 106
    .line 107
    iget v12, v7, Ljl1;->f:F

    .line 108
    .line 109
    iget v14, v7, Ljl1;->g:F

    .line 110
    .line 111
    iget v7, v7, Ljl1;->j:I

    .line 112
    .line 113
    move/from16 v27, v14

    .line 114
    .line 115
    new-instance v14, Lfi2;

    .line 116
    .line 117
    const/4 v15, 0x0

    .line 118
    const/16 v16, 0x0

    .line 119
    .line 120
    const/16 v20, 0x0

    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    const/high16 v24, -0x80000000

    .line 125
    .line 126
    const v25, -0x800001

    .line 127
    .line 128
    .line 129
    const/16 v29, 0x0

    .line 130
    .line 131
    const/16 v30, 0x0

    .line 132
    .line 133
    move-object/from16 v17, v16

    .line 134
    .line 135
    move/from16 v28, v7

    .line 136
    .line 137
    move/from16 v22, v9

    .line 138
    .line 139
    move/from16 v19, v10

    .line 140
    .line 141
    move/from16 v21, v11

    .line 142
    .line 143
    move/from16 v26, v12

    .line 144
    .line 145
    invoke-direct/range {v14 .. v30}, Lfi2;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFIFI)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {v8}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_d

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    check-cast v3, Ljava/util/Map$Entry;

    .line 173
    .line 174
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    check-cast v5, Ljl1;

    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, Luh2;

    .line 192
    .line 193
    iget-object v7, v3, Luh2;->a:Ljava/lang/CharSequence;

    .line 194
    .line 195
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    check-cast v7, Landroid/text/SpannableStringBuilder;

    .line 199
    .line 200
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    const-class v9, Lel1;

    .line 205
    .line 206
    invoke-virtual {v7, v4, v8, v9}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    check-cast v8, [Lel1;

    .line 211
    .line 212
    array-length v9, v8

    .line 213
    move v10, v4

    .line 214
    :goto_3
    if-ge v10, v9, :cond_2

    .line 215
    .line 216
    aget-object v11, v8, v10

    .line 217
    .line 218
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 219
    .line 220
    .line 221
    move-result v12

    .line 222
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result v11

    .line 226
    const-string v13, ""

    .line 227
    .line 228
    invoke-virtual {v7, v12, v11, v13}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 229
    .line 230
    .line 231
    add-int/lit8 v10, v10, 0x1

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_2
    move v8, v4

    .line 235
    :goto_4
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    const/16 v10, 0x20

    .line 240
    .line 241
    if-ge v8, v9, :cond_5

    .line 242
    .line 243
    add-int/lit8 v9, v8, 0x1

    .line 244
    .line 245
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 246
    .line 247
    .line 248
    move-result v11

    .line 249
    if-ne v11, v10, :cond_4

    .line 250
    .line 251
    move v11, v9

    .line 252
    :goto_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    if-ge v11, v12, :cond_3

    .line 257
    .line 258
    invoke-virtual {v7, v11}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    if-ne v12, v10, :cond_3

    .line 263
    .line 264
    add-int/lit8 v11, v11, 0x1

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_3
    sub-int/2addr v11, v9

    .line 268
    if-lez v11, :cond_4

    .line 269
    .line 270
    add-int/2addr v11, v8

    .line 271
    invoke-virtual {v7, v8, v11}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 272
    .line 273
    .line 274
    :cond_4
    move v8, v9

    .line 275
    goto :goto_4

    .line 276
    :cond_5
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-lez v8, :cond_6

    .line 281
    .line 282
    invoke-virtual {v7, v4}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-ne v8, v10, :cond_6

    .line 287
    .line 288
    const/4 v8, 0x1

    .line 289
    invoke-virtual {v7, v4, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 290
    .line 291
    .line 292
    :cond_6
    move v8, v4

    .line 293
    :goto_6
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 294
    .line 295
    .line 296
    move-result v9

    .line 297
    add-int/lit8 v9, v9, -0x1

    .line 298
    .line 299
    const/16 v11, 0xa

    .line 300
    .line 301
    if-ge v8, v9, :cond_8

    .line 302
    .line 303
    add-int/lit8 v9, v8, 0x1

    .line 304
    .line 305
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    if-ne v12, v11, :cond_7

    .line 310
    .line 311
    invoke-virtual {v7, v9}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 312
    .line 313
    .line 314
    move-result v11

    .line 315
    if-ne v11, v10, :cond_7

    .line 316
    .line 317
    add-int/lit8 v8, v8, 0x2

    .line 318
    .line 319
    invoke-virtual {v7, v9, v8}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 320
    .line 321
    .line 322
    :cond_7
    move v8, v9

    .line 323
    goto :goto_6

    .line 324
    :cond_8
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-lez v8, :cond_9

    .line 329
    .line 330
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    add-int/lit8 v8, v8, -0x1

    .line 335
    .line 336
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 337
    .line 338
    .line 339
    move-result v8

    .line 340
    if-ne v8, v10, :cond_9

    .line 341
    .line 342
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    add-int/lit8 v8, v8, -0x1

    .line 347
    .line 348
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 349
    .line 350
    .line 351
    move-result v9

    .line 352
    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 353
    .line 354
    .line 355
    :cond_9
    move v8, v4

    .line 356
    :goto_7
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    add-int/lit8 v9, v9, -0x1

    .line 361
    .line 362
    if-ge v8, v9, :cond_b

    .line 363
    .line 364
    add-int/lit8 v9, v8, 0x1

    .line 365
    .line 366
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 367
    .line 368
    .line 369
    move-result v12

    .line 370
    if-ne v12, v10, :cond_a

    .line 371
    .line 372
    invoke-virtual {v7, v9}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 373
    .line 374
    .line 375
    move-result v12

    .line 376
    if-ne v12, v11, :cond_a

    .line 377
    .line 378
    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 379
    .line 380
    .line 381
    :cond_a
    move v8, v9

    .line 382
    goto :goto_7

    .line 383
    :cond_b
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 384
    .line 385
    .line 386
    move-result v8

    .line 387
    if-lez v8, :cond_c

    .line 388
    .line 389
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    add-int/lit8 v8, v8, -0x1

    .line 394
    .line 395
    invoke-virtual {v7, v8}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 396
    .line 397
    .line 398
    move-result v8

    .line 399
    if-ne v8, v11, :cond_c

    .line 400
    .line 401
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 402
    .line 403
    .line 404
    move-result v8

    .line 405
    add-int/lit8 v8, v8, -0x1

    .line 406
    .line 407
    invoke-virtual {v7}, Landroid/text/SpannableStringBuilder;->length()I

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    invoke-virtual {v7, v8, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 412
    .line 413
    .line 414
    :cond_c
    iget v7, v5, Ljl1;->c:F

    .line 415
    .line 416
    iget v8, v5, Ljl1;->d:I

    .line 417
    .line 418
    iput v7, v3, Luh2;->e:F

    .line 419
    .line 420
    iput v8, v3, Luh2;->f:I

    .line 421
    .line 422
    iget v7, v5, Ljl1;->e:I

    .line 423
    .line 424
    iput v7, v3, Luh2;->g:I

    .line 425
    .line 426
    iget v7, v5, Ljl1;->b:F

    .line 427
    .line 428
    iput v7, v3, Luh2;->h:F

    .line 429
    .line 430
    iget v7, v5, Ljl1;->f:F

    .line 431
    .line 432
    iput v7, v3, Luh2;->l:F

    .line 433
    .line 434
    iget v7, v5, Ljl1;->i:F

    .line 435
    .line 436
    iget v8, v5, Ljl1;->h:I

    .line 437
    .line 438
    iput v7, v3, Luh2;->k:F

    .line 439
    .line 440
    iput v8, v3, Luh2;->j:I

    .line 441
    .line 442
    iget v5, v5, Ljl1;->j:I

    .line 443
    .line 444
    iput v5, v3, Luh2;->n:I

    .line 445
    .line 446
    invoke-virtual {v3}, Luh2;->a()Lfi2;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto/16 :goto_2

    .line 454
    .line 455
    :cond_d
    return-object v2
.end method

.method public c(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [J

    .line 4
    .line 5
    aget-wide v1, v0, p1

    .line 6
    .line 7
    return-wide v1
.end method

.method public d()V
    .locals 2

    .line 1
    iget v0, p0, Lg4;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lvd3;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lw9;->a()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lw9;->f()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Lw9;->k()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :pswitch_0
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p2, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lg4;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lpf0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast v0, Lay0;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lay0;->F(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lg4;->i:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Lpf0;

    .line 39
    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    check-cast p2, Lay0;

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Lay0;->F(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public f()Ln70;
    .locals 5

    .line 1
    iget-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lg4;->h:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/content/SharedPreferences;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/content/Context;

    .line 17
    .line 18
    const-string v2, "google_ads_flags_meta"

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lg4;->h:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    :goto_0
    iget-object v0, p0, Lg4;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const-wide/16 v1, 0x0

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const-string v3, "js_last_update"

    .line 38
    .line 39
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    :goto_1
    sget-object v0, Lhg4;->C:Lhg4;

    .line 44
    .line 45
    iget-object v0, v0, Lhg4;->k:Lym;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    sub-long/2addr v3, v1

    .line 55
    sget-object v0, Ls02;->f:Lso1;

    .line 56
    .line 57
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    cmp-long v0, v3, v0

    .line 68
    .line 69
    if-gez v0, :cond_2

    .line 70
    .line 71
    sget-object v0, Llq3;->g:Llq3;

    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_2
    iget-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/content/Context;

    .line 77
    .line 78
    iget-object v1, p0, Lg4;->k:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Le51;

    .line 81
    .line 82
    iget-object v2, p0, Lg4;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lk62;

    .line 85
    .line 86
    invoke-static {v0, v1}, Lg4;->i(Landroid/content/Context;Le51;)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v2, v0}, Lk62;->a(Ljava/lang/Object;)Ln70;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Lvn1;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, v2, p0}, Lvn1;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    sget-object v2, Lmd2;->g:Lld2;

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, Lpu1;->P(Ln70;Lzk3;Ljava/util/concurrent/Executor;)Lrp3;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    return-object v0

    .line 107
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    throw v1
.end method

.method public g(Ljava/lang/String;)Ln70;
    .locals 4

    .line 1
    sget-object v0, Leg4;->g:Leg4;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    sget-object v1, Lmz1;->f:Liz1;

    .line 6
    .line 7
    sget-object v2, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    :cond_0
    const-wide/16 v1, 0x0

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    :try_start_0
    invoke-virtual {p0, v3, v1, v2, p1}, Lg4;->n(IJLjava/lang/String;)Ln70;

    .line 33
    .line 34
    .line 35
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p1

    .line 37
    :catch_0
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public l()[B
    .locals 9

    .line 1
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lg4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/io/File;

    .line 11
    .line 12
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_1
    sget-object v0, La54;->g:Ly44;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0x100

    .line 25
    .line 26
    :goto_0
    new-array v4, v3, [B

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move v6, v5

    .line 30
    :goto_1
    if-ge v6, v3, :cond_1

    .line 31
    .line 32
    sub-int v7, v3, v6

    .line 33
    .line 34
    invoke-virtual {v2, v4, v6, v7}, Ljava/io/InputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, -0x1

    .line 39
    if-ne v7, v8, :cond_0

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    add-int/2addr v6, v7

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_4

    .line 46
    :cond_1
    :goto_2
    if-nez v6, :cond_2

    .line 47
    .line 48
    move-object v4, v1

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-static {v4, v5, v6}, La54;->n([BII)Ly44;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :goto_3
    if-nez v4, :cond_3

    .line 55
    .line 56
    invoke-static {v0}, La54;->o(Ljava/util/ArrayList;)La54;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, La54;->p()[B

    .line 61
    .line 62
    .line 63
    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    invoke-static {v2}, Lg82;->c(Ljava/io/Closeable;)V

    .line 65
    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_3
    :try_start_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/2addr v3, v3

    .line 72
    const/16 v4, 0x2000

    .line 73
    .line 74
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 75
    .line 76
    .line 77
    move-result v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    goto :goto_0

    .line 79
    :goto_4
    move-object v1, v2

    .line 80
    goto :goto_5

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    :goto_5
    invoke-static {v1}, Lg82;->c(Ljava/io/Closeable;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :catch_0
    move-object v2, v1

    .line 87
    :catch_1
    invoke-static {v2}, Lg82;->c(Ljava/io/Closeable;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v1

    .line 91
    :goto_6
    iput-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 92
    .line 93
    :cond_4
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, [B

    .line 96
    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_5
    array-length v1, v0

    .line 101
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0
.end method

.method public m(Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lg4;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lsq0;

    .line 4
    .line 5
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lb23;

    .line 8
    .line 9
    iget-object v0, v0, Lb23;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lvg0;

    .line 12
    .line 13
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lh83;

    .line 16
    .line 17
    iget-object v2, p0, Lg4;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, La83;

    .line 20
    .line 21
    iget-object v3, p0, Lg4;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lpd2;

    .line 24
    .line 25
    new-instance v4, Lju2;

    .line 26
    .line 27
    new-instance v5, Lf20;

    .line 28
    .line 29
    invoke-direct {v5, v0, v2}, Lf20;-><init>(Lvg0;La83;)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x1

    .line 33
    const/4 v7, 0x0

    .line 34
    invoke-direct {v4, v5, v7, v6}, Lju2;-><init>(Lqq2;Lag2;I)V

    .line 35
    .line 36
    .line 37
    new-instance v5, Lxb4;

    .line 38
    .line 39
    invoke-direct {v5, v1, v2, v7}, Lxb4;-><init>(Lh83;La83;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lvg0;->g:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lei2;

    .line 45
    .line 46
    new-instance v2, Ldi2;

    .line 47
    .line 48
    iget-object v6, v1, Lei2;->b:Lth2;

    .line 49
    .line 50
    iget-object v1, v1, Lei2;->c:Lei2;

    .line 51
    .line 52
    invoke-direct {v2, v6, v1, v5, v4}, Ldi2;-><init>(Lth2;Lei2;Lxb4;Ll92;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Lug0;

    .line 56
    .line 57
    const/16 v4, 0x1a

    .line 58
    .line 59
    invoke-direct {v1, v0, v2, v4}, Lug0;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    monitor-enter p1

    .line 63
    :try_start_0
    iput-object v1, p1, Lsq0;->g:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    monitor-exit p1

    .line 66
    invoke-virtual {v2}, Ldi2;->y()Lhq2;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v3, p1}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw v0
.end method

.method public n(IJLjava/lang/String;)Ln70;
    .locals 7

    .line 1
    iget-object v0, p0, Lg4;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqq3;

    .line 4
    .line 5
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcd4;

    .line 8
    .line 9
    iget v2, v1, Lcd4;->a:I

    .line 10
    .line 11
    if-le p1, v2, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lg4;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lbb3;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-boolean p2, v1, Lcd4;->d:Z

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    new-instance v0, Lwo1;

    .line 24
    .line 25
    sget-object p2, Lhg4;->C:Lhg4;

    .line 26
    .line 27
    iget-object p2, p2, Lhg4;->k:Lym;

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    const-string v3, ""

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    move-object v4, p4

    .line 40
    invoke-direct/range {v0 .. v5}, Lwo1;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p1, Lbb3;->a:Ljz2;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p2, Lmr2;

    .line 49
    .line 50
    const/4 p3, 0x4

    .line 51
    const/4 p4, 0x0

    .line 52
    invoke-direct {p2, p1, v0, p3, p4}, Lmr2;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljz2;->a(Lo93;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Leg4;->i:Leg4;

    .line 59
    .line 60
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :cond_0
    sget-object p1, Leg4;->h:Leg4;

    .line 66
    .line 67
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_1
    move-object v4, p4

    .line 73
    sget-object p4, Lmz1;->k9:Liz1;

    .line 74
    .line 75
    sget-object v1, Ltw1;->e:Ltw1;

    .line 76
    .line 77
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 78
    .line 79
    invoke-virtual {v1, p4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p4

    .line 83
    check-cast p4, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_2

    .line 90
    .line 91
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 92
    .line 93
    .line 94
    move-result-object p4

    .line 95
    invoke-virtual {p4}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-virtual {p4}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object p4

    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v3, "pa"

    .line 112
    .line 113
    invoke-virtual {p4, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    add-int/2addr v2, v3

    .line 141
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const-string v2, "&"

    .line 145
    .line 146
    invoke-static {v5, p4, v2, v1}, Lex0;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p4

    .line 150
    goto :goto_0

    .line 151
    :cond_2
    move-object p4, v4

    .line 152
    :goto_0
    new-instance v1, Lab3;

    .line 153
    .line 154
    move-object v2, p0

    .line 155
    move v3, p1

    .line 156
    move-object v6, v4

    .line 157
    move-wide v4, p2

    .line 158
    invoke-direct/range {v1 .. v6}, Lab3;-><init>(Lg4;IJLjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    const-wide/16 p1, 0x0

    .line 162
    .line 163
    cmp-long p1, v4, p1

    .line 164
    .line 165
    if-nez p1, :cond_3

    .line 166
    .line 167
    new-instance p1, Lza3;

    .line 168
    .line 169
    const/4 p2, 0x1

    .line 170
    invoke-direct {p1, p0, p4, p2}, Lza3;-><init>(Lg4;Ljava/lang/String;I)V

    .line 171
    .line 172
    .line 173
    move-object p2, v0

    .line 174
    check-cast p2, Lld2;

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Lld2;->c(Ljava/util/concurrent/Callable;)Ln70;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1, v1, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    return-object p1

    .line 185
    :cond_3
    new-instance p1, Lza3;

    .line 186
    .line 187
    const/4 p2, 0x0

    .line 188
    invoke-direct {p1, p0, p4, p2}, Lza3;-><init>(Lg4;Ljava/lang/String;I)V

    .line 189
    .line 190
    .line 191
    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 192
    .line 193
    check-cast v0, Luq3;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    new-instance p3, Lar3;

    .line 199
    .line 200
    invoke-direct {p3, p1}, Lar3;-><init>(Ljava/util/concurrent/Callable;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, v0, Luq3;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 204
    .line 205
    invoke-interface {p1, p3, v4, v5, p2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    new-instance p2, Lsq3;

    .line 210
    .line 211
    invoke-direct {p2, p3, p1}, Lsq3;-><init>(Lgp3;Ljava/util/concurrent/ScheduledFuture;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p2, v1, v0}, Lpu1;->O(Ln70;Lyp3;Ljava/util/concurrent/Executor;)Lqp3;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    return-object p1
.end method

.method public o(Ljava/lang/String;)Leg4;
    .locals 6

    .line 1
    iget-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lug4;

    .line 4
    .line 5
    sget-object v1, Lmz1;->C9:Liz1;

    .line 6
    .line 7
    sget-object v2, Ltw1;->e:Ltw1;

    .line 8
    .line 9
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 10
    .line 11
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    iget-object v1, p0, Lg4;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lch2;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    sget-object v4, Lhg4;->C:Lhg4;

    .line 31
    .line 32
    iget-object v5, v4, Lhg4;->c:Llf4;

    .line 33
    .line 34
    invoke-virtual {v5, p1}, Llf4;->E(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    iget-object v4, v4, Lhg4;->c:Llf4;

    .line 41
    .line 42
    invoke-virtual {v4, p1}, Llf4;->F(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    :cond_0
    iget-object v1, v1, Lch2;->c:Lo94;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Ls44;->b()[B

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    sget-object v4, Lmz1;->D9:Liz1;

    .line 70
    .line 71
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 72
    .line 73
    invoke-virtual {v2, v4}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-virtual {v0, p1, v1}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :cond_3
    invoke-virtual {v0, p1, v3}, Lug4;->a(Ljava/lang/String;Ljava/util/HashMap;)Leg4;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public p(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget v0, p0, Lg4;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv73;

    .line 9
    .line 10
    check-cast p1, Liu2;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Lel2;->b()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_0
    :goto_0
    iget-object v1, p1, Lel2;->g:Lpo2;

    .line 23
    .line 24
    iget-object v1, v1, Lpo2;->f:Lug0;

    .line 25
    .line 26
    iget-object v2, v0, Lv73;->d:Ls73;

    .line 27
    .line 28
    iget-object v1, v1, Lug0;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lpo2;

    .line 31
    .line 32
    iput-object v2, v1, Lpo2;->j:Ls73;

    .line 33
    .line 34
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, Ly23;

    .line 37
    .line 38
    invoke-interface {v1, p1}, Ly23;->w(Lel2;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, Lv73;->b:Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    iget-object v2, v0, Lv73;->d:Ls73;

    .line 44
    .line 45
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    new-instance v3, Lbs2;

    .line 49
    .line 50
    const/16 v4, 0x13

    .line 51
    .line 52
    invoke-direct {v3, v4, v2}, Lbs2;-><init>(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, v0, Lv73;->d:Ls73;

    .line 59
    .line 60
    invoke-virtual {v1}, Ls73;->l()V

    .line 61
    .line 62
    .line 63
    sget-object v1, Ln02;->c:Lso1;

    .line 64
    .line 65
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    const/4 v2, 0x1

    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Lda3;

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    iget-object v3, p1, Lel2;->a:Lh83;

    .line 85
    .line 86
    iget-object v3, v3, Lh83;->b:Lp21;

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Lda3;->e(Lp21;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 92
    .line 93
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, p1}, Lda3;->g(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Laa3;

    .line 101
    .line 102
    invoke-interface {p1, v2}, Laa3;->b(Z)Laa3;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, p1}, Lda3;->a(Laa3;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lda3;->h()V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    iget-object v1, v0, Lv73;->g:Lea3;

    .line 113
    .line 114
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v3, Laa3;

    .line 117
    .line 118
    iget-object v4, p1, Lel2;->a:Lh83;

    .line 119
    .line 120
    iget-object v4, v4, Lh83;->b:Lp21;

    .line 121
    .line 122
    invoke-interface {v3, v4}, Laa3;->o(Lp21;)Laa3;

    .line 123
    .line 124
    .line 125
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 126
    .line 127
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 128
    .line 129
    invoke-interface {v3, p1}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 130
    .line 131
    .line 132
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 133
    .line 134
    .line 135
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 140
    .line 141
    .line 142
    :goto_1
    monitor-exit v0

    .line 143
    return-void

    .line 144
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    throw p1

    .line 146
    :sswitch_0
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lq73;

    .line 149
    .line 150
    check-cast p1, Lhq2;

    .line 151
    .line 152
    monitor-enter v0

    .line 153
    if-eqz p1, :cond_2

    .line 154
    .line 155
    :try_start_1
    invoke-virtual {p1}, Lel2;->b()V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    :cond_2
    :goto_3
    const/4 v1, 0x0

    .line 163
    iput-object v1, v0, Lq73;->i:Lq93;

    .line 164
    .line 165
    sget-object v1, Lmz1;->Q8:Liz1;

    .line 166
    .line 167
    sget-object v2, Ltw1;->e:Ltw1;

    .line 168
    .line 169
    iget-object v3, v2, Ltw1;->c:Lkz1;

    .line 170
    .line 171
    invoke-virtual {v3, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Ljava/lang/Boolean;

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_3

    .line 182
    .line 183
    iget-object v3, p1, Lel2;->g:Lpo2;

    .line 184
    .line 185
    iget-object v3, v3, Lpo2;->f:Lug0;

    .line 186
    .line 187
    iget-object v4, v0, Lq73;->d:Ls23;

    .line 188
    .line 189
    iget-object v3, v3, Lug0;->g:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v3, Lpo2;

    .line 192
    .line 193
    iput-object v4, v3, Lpo2;->g:Ls23;

    .line 194
    .line 195
    iget-object v4, v0, Lq73;->e:Ls73;

    .line 196
    .line 197
    iput-object v4, v3, Lpo2;->j:Ls73;

    .line 198
    .line 199
    :cond_3
    iget-object v3, p0, Lg4;->g:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v3, Ly23;

    .line 202
    .line 203
    invoke-interface {v3, p1}, Ly23;->w(Lel2;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 207
    .line 208
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Ljava/lang/Boolean;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_4

    .line 219
    .line 220
    iget-object v1, v0, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 221
    .line 222
    new-instance v2, Lo73;

    .line 223
    .line 224
    const/4 v3, 0x1

    .line 225
    invoke-direct {v2, p0, v3}, Lo73;-><init>(Lg4;I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 229
    .line 230
    .line 231
    iget-object v1, v0, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 232
    .line 233
    new-instance v2, Lo73;

    .line 234
    .line 235
    const/4 v3, 0x0

    .line 236
    invoke-direct {v2, p0, v3}, Lo73;-><init>(Lg4;I)V

    .line 237
    .line 238
    .line 239
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 240
    .line 241
    .line 242
    :cond_4
    sget-object v1, Ln02;->c:Lso1;

    .line 243
    .line 244
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    check-cast v1, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    const/4 v2, 0x1

    .line 255
    if-eqz v1, :cond_5

    .line 256
    .line 257
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, Lda3;

    .line 260
    .line 261
    if-eqz v1, :cond_5

    .line 262
    .line 263
    iget-object v3, p1, Lel2;->a:Lh83;

    .line 264
    .line 265
    iget-object v3, v3, Lh83;->b:Lp21;

    .line 266
    .line 267
    invoke-virtual {v1, v3}, Lda3;->e(Lp21;)V

    .line 268
    .line 269
    .line 270
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 271
    .line 272
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {v1, p1}, Lda3;->g(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p1, Laa3;

    .line 280
    .line 281
    invoke-interface {p1, v2}, Laa3;->b(Z)Laa3;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, p1}, Lda3;->a(Laa3;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lda3;->h()V

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_5
    iget-object v1, v0, Lq73;->g:Lea3;

    .line 292
    .line 293
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v3, Laa3;

    .line 296
    .line 297
    iget-object v4, p1, Lel2;->a:Lh83;

    .line 298
    .line 299
    iget-object v4, v4, Lh83;->b:Lp21;

    .line 300
    .line 301
    invoke-interface {v3, v4}, Laa3;->o(Lp21;)Laa3;

    .line 302
    .line 303
    .line 304
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 305
    .line 306
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 307
    .line 308
    invoke-interface {v3, p1}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 309
    .line 310
    .line 311
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 312
    .line 313
    .line 314
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 319
    .line 320
    .line 321
    :goto_4
    monitor-exit v0

    .line 322
    return-void

    .line 323
    :goto_5
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 324
    throw p1

    .line 325
    :sswitch_1
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Lt63;

    .line 328
    .line 329
    check-cast p1, Lel2;

    .line 330
    .line 331
    monitor-enter v0

    .line 332
    if-eqz p1, :cond_6

    .line 333
    .line 334
    :try_start_2
    invoke-virtual {p1}, Lel2;->b()V

    .line 335
    .line 336
    .line 337
    goto :goto_6

    .line 338
    :catchall_2
    move-exception p1

    .line 339
    goto/16 :goto_8

    .line 340
    .line 341
    :cond_6
    :goto_6
    const/4 v1, 0x0

    .line 342
    iput-object v1, v0, Lt63;->j:Ln70;

    .line 343
    .line 344
    sget-object v1, Lmz1;->P8:Liz1;

    .line 345
    .line 346
    sget-object v2, Ltw1;->e:Ltw1;

    .line 347
    .line 348
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 349
    .line 350
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Ljava/lang/Boolean;

    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_7

    .line 361
    .line 362
    iget-object v1, p1, Lel2;->g:Lpo2;

    .line 363
    .line 364
    iget-object v1, v1, Lpo2;->f:Lug0;

    .line 365
    .line 366
    iget-object v2, v0, Lt63;->d:Ls63;

    .line 367
    .line 368
    iget-object v1, v1, Lug0;->g:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, Lpo2;

    .line 371
    .line 372
    iput-object v2, v1, Lpo2;->i:Ls63;

    .line 373
    .line 374
    :cond_7
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v1, Ly23;

    .line 377
    .line 378
    invoke-interface {v1, p1}, Ly23;->w(Lel2;)V

    .line 379
    .line 380
    .line 381
    sget-object v1, Ln02;->c:Lso1;

    .line 382
    .line 383
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, Ljava/lang/Boolean;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    const/4 v2, 0x1

    .line 394
    if-eqz v1, :cond_8

    .line 395
    .line 396
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v1, Lda3;

    .line 399
    .line 400
    if-eqz v1, :cond_8

    .line 401
    .line 402
    iget-object v3, p1, Lel2;->a:Lh83;

    .line 403
    .line 404
    iget-object v3, v3, Lh83;->b:Lp21;

    .line 405
    .line 406
    invoke-virtual {v1, v3}, Lda3;->e(Lp21;)V

    .line 407
    .line 408
    .line 409
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 410
    .line 411
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 412
    .line 413
    invoke-virtual {v1, p1}, Lda3;->g(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    iget-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast p1, Laa3;

    .line 419
    .line 420
    invoke-interface {p1, v2}, Laa3;->b(Z)Laa3;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, p1}, Lda3;->a(Laa3;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1}, Lda3;->h()V

    .line 427
    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_8
    iget-object v1, v0, Lt63;->h:Lea3;

    .line 431
    .line 432
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, Laa3;

    .line 435
    .line 436
    iget-object v4, p1, Lel2;->a:Lh83;

    .line 437
    .line 438
    iget-object v4, v4, Lh83;->b:Lp21;

    .line 439
    .line 440
    invoke-interface {v3, v4}, Laa3;->o(Lp21;)Laa3;

    .line 441
    .line 442
    .line 443
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 444
    .line 445
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 446
    .line 447
    invoke-interface {v3, p1}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 448
    .line 449
    .line 450
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 451
    .line 452
    .line 453
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 458
    .line 459
    .line 460
    :goto_7
    monitor-exit v0

    .line 461
    return-void

    .line 462
    :goto_8
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 463
    throw p1

    .line 464
    :sswitch_2
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v0, Lbu1;

    .line 467
    .line 468
    check-cast p1, Lel2;

    .line 469
    .line 470
    monitor-enter v0

    .line 471
    if-eqz p1, :cond_9

    .line 472
    .line 473
    :try_start_3
    invoke-virtual {p1}, Lel2;->b()V

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :catchall_3
    move-exception p1

    .line 478
    goto/16 :goto_b

    .line 479
    .line 480
    :cond_9
    :goto_9
    iget-object v1, p1, Lel2;->g:Lpo2;

    .line 481
    .line 482
    iget-object v1, v1, Lpo2;->f:Lug0;

    .line 483
    .line 484
    iget-object v2, v0, Lbu1;->j:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v2, Lt83;

    .line 487
    .line 488
    iget-object v2, v2, Lt83;->h:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v2, Ls23;

    .line 491
    .line 492
    iget-object v1, v1, Lug0;->g:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v1, Lpo2;

    .line 495
    .line 496
    iput-object v2, v1, Lpo2;->g:Ls23;

    .line 497
    .line 498
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, Lf23;

    .line 501
    .line 502
    invoke-virtual {v1, p1}, Lf23;->w(Lel2;)V

    .line 503
    .line 504
    .line 505
    iget-object v1, v0, Lbu1;->h:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v1, Lth2;

    .line 508
    .line 509
    invoke-virtual {v1}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    new-instance v2, Ljl2;

    .line 514
    .line 515
    const/4 v3, 0x1

    .line 516
    invoke-direct {v2, p0, v3}, Ljl2;-><init>(Lg4;I)V

    .line 517
    .line 518
    .line 519
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 520
    .line 521
    .line 522
    sget-object v1, Ln02;->c:Lso1;

    .line 523
    .line 524
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    check-cast v1, Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    const/4 v2, 0x1

    .line 535
    if-eqz v1, :cond_a

    .line 536
    .line 537
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v1, Lda3;

    .line 540
    .line 541
    if-eqz v1, :cond_a

    .line 542
    .line 543
    iget-object v3, p1, Lel2;->a:Lh83;

    .line 544
    .line 545
    iget-object v3, v3, Lh83;->b:Lp21;

    .line 546
    .line 547
    invoke-virtual {v1, v3}, Lda3;->e(Lp21;)V

    .line 548
    .line 549
    .line 550
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 551
    .line 552
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v1, p1}, Lda3;->g(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    iget-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast p1, Laa3;

    .line 560
    .line 561
    invoke-interface {p1, v2}, Laa3;->b(Z)Laa3;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1, p1}, Lda3;->a(Laa3;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1}, Lda3;->h()V

    .line 568
    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_a
    iget-object v1, v0, Lbu1;->k:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v1, Lea3;

    .line 574
    .line 575
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v3, Laa3;

    .line 578
    .line 579
    iget-object v4, p1, Lel2;->a:Lh83;

    .line 580
    .line 581
    iget-object v4, v4, Lh83;->b:Lp21;

    .line 582
    .line 583
    invoke-interface {v3, v4}, Laa3;->o(Lp21;)Laa3;

    .line 584
    .line 585
    .line 586
    iget-object p1, p1, Lel2;->f:Lrm2;

    .line 587
    .line 588
    iget-object p1, p1, Lrm2;->f:Ljava/lang/String;

    .line 589
    .line 590
    invoke-interface {v3, p1}, Laa3;->q0(Ljava/lang/String;)Laa3;

    .line 591
    .line 592
    .line 593
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 594
    .line 595
    .line 596
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 601
    .line 602
    .line 603
    :goto_a
    monitor-exit v0

    .line 604
    return-void

    .line 605
    :goto_b
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 606
    throw p1

    .line 607
    :sswitch_3
    const-string v0, "SignalGeneratorImpl.generateSignals.onSuccess"

    .line 608
    .line 609
    const-string v1, ""

    .line 610
    .line 611
    const-string v2, "QueryInfo generation has been disabled."

    .line 612
    .line 613
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v3, Ltc2;

    .line 616
    .line 617
    iget-object v4, p0, Lg4;->i:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v4, Laa3;

    .line 620
    .line 621
    iget-object v5, p0, Lg4;->g:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v5, Ln70;

    .line 624
    .line 625
    iget-object v6, p0, Lg4;->k:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v6, Lcr1;

    .line 628
    .line 629
    iget-object v7, v6, Lcr1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 630
    .line 631
    check-cast p1, Ll22;

    .line 632
    .line 633
    iget-object v8, p0, Lg4;->j:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v8, Lad2;

    .line 636
    .line 637
    invoke-static {v5, v8}, Lcr1;->K3(Ln70;Lad2;)Lda3;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    const/4 v8, 0x1

    .line 642
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 643
    .line 644
    .line 645
    sget-object v7, Lmz1;->b8:Liz1;

    .line 646
    .line 647
    sget-object v9, Ltw1;->e:Ltw1;

    .line 648
    .line 649
    iget-object v9, v9, Ltw1;->c:Lkz1;

    .line 650
    .line 651
    invoke-virtual {v9, v7}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v7

    .line 655
    check-cast v7, Ljava/lang/Boolean;

    .line 656
    .line 657
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 658
    .line 659
    .line 660
    move-result v7

    .line 661
    const-string v9, "Internal error for request JSON: "

    .line 662
    .line 663
    const/4 v10, 0x0

    .line 664
    if-nez v7, :cond_c

    .line 665
    .line 666
    if-eqz v3, :cond_b

    .line 667
    .line 668
    :try_start_4
    invoke-interface {v3, v2}, Ltc2;->w(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    .line 669
    .line 670
    .line 671
    goto :goto_c

    .line 672
    :catch_0
    move-exception p1

    .line 673
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object p1

    .line 677
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    invoke-static {p1}, Lgi2;->Z(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    :cond_b
    :goto_c
    sget-object p1, Ln02;->e:Lso1;

    .line 685
    .line 686
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    check-cast p1, Ljava/lang/Boolean;

    .line 691
    .line 692
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 693
    .line 694
    .line 695
    move-result p1

    .line 696
    if-eqz p1, :cond_18

    .line 697
    .line 698
    if-eqz v5, :cond_18

    .line 699
    .line 700
    invoke-interface {v4, v2}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 701
    .line 702
    .line 703
    invoke-interface {v4, v10}, Laa3;->b(Z)Laa3;

    .line 704
    .line 705
    .line 706
    invoke-virtual {v5, v4}, Lda3;->a(Laa3;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v5}, Lda3;->h()V

    .line 710
    .line 711
    .line 712
    goto/16 :goto_13

    .line 713
    .line 714
    :cond_c
    if-nez p1, :cond_e

    .line 715
    .line 716
    if-eqz v3, :cond_d

    .line 717
    .line 718
    const/4 p1, 0x0

    .line 719
    :try_start_5
    invoke-interface {v3, p1, p1, p1}, Ltc2;->t3(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    goto :goto_d

    .line 723
    :catchall_4
    move-exception p1

    .line 724
    goto/16 :goto_14

    .line 725
    .line 726
    :catch_1
    move-exception p1

    .line 727
    goto/16 :goto_12

    .line 728
    .line 729
    :cond_d
    :goto_d
    invoke-interface {v4, v8}, Laa3;->b(Z)Laa3;
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 730
    .line 731
    .line 732
    sget-object p1, Ln02;->e:Lso1;

    .line 733
    .line 734
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object p1

    .line 738
    check-cast p1, Ljava/lang/Boolean;

    .line 739
    .line 740
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 741
    .line 742
    .line 743
    move-result p1

    .line 744
    if-eqz p1, :cond_18

    .line 745
    .line 746
    if-eqz v5, :cond_18

    .line 747
    .line 748
    :goto_e
    invoke-virtual {v5, v4}, Lda3;->a(Laa3;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v5}, Lda3;->h()V

    .line 752
    .line 753
    .line 754
    goto/16 :goto_13

    .line 755
    .line 756
    :cond_e
    :try_start_6
    iget-object v2, p1, Ll22;->a:Ljava/lang/String;

    .line 757
    .line 758
    iget-object v7, p1, Ll22;->c:Ljava/lang/String;

    .line 759
    .line 760
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    if-nez v7, :cond_f

    .line 765
    .line 766
    new-instance v7, Lorg/json/JSONObject;

    .line 767
    .line 768
    iget-object v11, p1, Ll22;->c:Ljava/lang/String;

    .line 769
    .line 770
    invoke-direct {v7, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    goto :goto_f

    .line 774
    :catch_2
    move-exception p1

    .line 775
    goto/16 :goto_11

    .line 776
    .line 777
    :cond_f
    new-instance v7, Lorg/json/JSONObject;

    .line 778
    .line 779
    iget-object v11, p1, Ll22;->b:Ljava/lang/String;

    .line 780
    .line 781
    invoke-direct {v7, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 782
    .line 783
    .line 784
    :goto_f
    :try_start_7
    const-string v9, "request_id"

    .line 785
    .line 786
    invoke-virtual {v7, v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 791
    .line 792
    .line 793
    move-result v7

    .line 794
    if-eqz v7, :cond_11

    .line 795
    .line 796
    const-string p1, "The request ID is empty in request JSON."

    .line 797
    .line 798
    invoke-static {p1}, Lgi2;->i0(Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    if-eqz v3, :cond_10

    .line 802
    .line 803
    const-string p1, "Internal error: request ID is empty in request JSON."

    .line 804
    .line 805
    invoke-interface {v3, p1}, Ltc2;->w(Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    :cond_10
    const-string p1, "Request ID empty"

    .line 809
    .line 810
    invoke-interface {v4, p1}, Laa3;->m(Ljava/lang/String;)Laa3;

    .line 811
    .line 812
    .line 813
    invoke-interface {v4, v10}, Laa3;->b(Z)Laa3;
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 814
    .line 815
    .line 816
    sget-object p1, Ln02;->e:Lso1;

    .line 817
    .line 818
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    check-cast p1, Ljava/lang/Boolean;

    .line 823
    .line 824
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 825
    .line 826
    .line 827
    move-result p1

    .line 828
    if-eqz p1, :cond_18

    .line 829
    .line 830
    if-eqz v5, :cond_18

    .line 831
    .line 832
    goto :goto_e

    .line 833
    :cond_11
    :try_start_8
    iget-object v7, p1, Ll22;->f:Landroid/os/Bundle;

    .line 834
    .line 835
    iget-boolean v9, v6, Lcr1;->v:Z
    :try_end_8
    .catch Landroid/os/RemoteException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 836
    .line 837
    iget-object v11, v6, Lcr1;->w:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v12, v6, Lcr1;->x:Ljava/lang/String;

    .line 840
    .line 841
    if-eqz v9, :cond_12

    .line 842
    .line 843
    if-eqz v7, :cond_12

    .line 844
    .line 845
    const/4 v9, -0x1

    .line 846
    :try_start_9
    invoke-virtual {v7, v12, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 847
    .line 848
    .line 849
    move-result v13

    .line 850
    if-ne v13, v9, :cond_12

    .line 851
    .line 852
    iget-object v9, v6, Lcr1;->y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 853
    .line 854
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 855
    .line 856
    .line 857
    move-result v9

    .line 858
    invoke-virtual {v7, v12, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 859
    .line 860
    .line 861
    :cond_12
    iget-boolean v9, v6, Lcr1;->u:Z

    .line 862
    .line 863
    if-eqz v9, :cond_14

    .line 864
    .line 865
    if-eqz v7, :cond_14

    .line 866
    .line 867
    invoke-virtual {v7, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v9

    .line 871
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 872
    .line 873
    .line 874
    move-result v9

    .line 875
    if-eqz v9, :cond_14

    .line 876
    .line 877
    iget-object v9, v6, Lcr1;->A:Ljava/lang/String;

    .line 878
    .line 879
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 880
    .line 881
    .line 882
    move-result v9

    .line 883
    if-eqz v9, :cond_13

    .line 884
    .line 885
    sget-object v9, Lhg4;->C:Lhg4;

    .line 886
    .line 887
    iget-object v9, v9, Lhg4;->c:Llf4;

    .line 888
    .line 889
    iget-object v12, v6, Lcr1;->h:Landroid/content/Context;

    .line 890
    .line 891
    iget-object v13, v6, Lcr1;->z:Le51;

    .line 892
    .line 893
    iget-object v13, v13, Le51;->f:Ljava/lang/String;

    .line 894
    .line 895
    invoke-virtual {v9, v12, v13}, Llf4;->D(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v9

    .line 899
    iput-object v9, v6, Lcr1;->A:Ljava/lang/String;

    .line 900
    .line 901
    :cond_13
    iget-object v6, v6, Lcr1;->A:Ljava/lang/String;

    .line 902
    .line 903
    invoke-virtual {v7, v11, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    :cond_14
    if-eqz v3, :cond_16

    .line 907
    .line 908
    iget-object v6, p1, Ll22;->c:Ljava/lang/String;

    .line 909
    .line 910
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 911
    .line 912
    .line 913
    move-result v6

    .line 914
    if-nez v6, :cond_15

    .line 915
    .line 916
    iget-object p1, p1, Ll22;->c:Ljava/lang/String;

    .line 917
    .line 918
    invoke-interface {v3, v2, v7, p1}, Ltc2;->t3(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    goto :goto_10

    .line 922
    :cond_15
    iget-object p1, p1, Ll22;->b:Ljava/lang/String;

    .line 923
    .line 924
    invoke-interface {v3, v2, v7, p1}, Ltc2;->t3(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    :cond_16
    :goto_10
    invoke-interface {v4, v8}, Laa3;->b(Z)Laa3;
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 928
    .line 929
    .line 930
    sget-object p1, Ln02;->e:Lso1;

    .line 931
    .line 932
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object p1

    .line 936
    check-cast p1, Ljava/lang/Boolean;

    .line 937
    .line 938
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 939
    .line 940
    .line 941
    move-result p1

    .line 942
    if-eqz p1, :cond_18

    .line 943
    .line 944
    if-eqz v5, :cond_18

    .line 945
    .line 946
    goto/16 :goto_e

    .line 947
    .line 948
    :goto_11
    :try_start_a
    const-string v2, "Failed to create JSON object from the request string."

    .line 949
    .line 950
    invoke-static {v2}, Lgi2;->i0(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    if-eqz v3, :cond_17

    .line 954
    .line 955
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 960
    .line 961
    .line 962
    move-result v6

    .line 963
    add-int/lit8 v6, v6, 0x21

    .line 964
    .line 965
    new-instance v7, Ljava/lang/StringBuilder;

    .line 966
    .line 967
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-interface {v3, v2}, Ltc2;->w(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    :cond_17
    invoke-interface {v4, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 984
    .line 985
    .line 986
    invoke-interface {v4, v10}, Laa3;->b(Z)Laa3;

    .line 987
    .line 988
    .line 989
    sget-object v2, Lhg4;->C:Lhg4;

    .line 990
    .line 991
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 992
    .line 993
    invoke-virtual {v2, v0, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Landroid/os/RemoteException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 994
    .line 995
    .line 996
    sget-object p1, Ln02;->e:Lso1;

    .line 997
    .line 998
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object p1

    .line 1002
    check-cast p1, Ljava/lang/Boolean;

    .line 1003
    .line 1004
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1005
    .line 1006
    .line 1007
    move-result p1

    .line 1008
    if-eqz p1, :cond_18

    .line 1009
    .line 1010
    if-eqz v5, :cond_18

    .line 1011
    .line 1012
    goto/16 :goto_e

    .line 1013
    .line 1014
    :goto_12
    :try_start_b
    invoke-interface {v4, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 1015
    .line 1016
    .line 1017
    invoke-interface {v4, v10}, Laa3;->b(Z)Laa3;

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v1, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1021
    .line 1022
    .line 1023
    sget-object v1, Lhg4;->C:Lhg4;

    .line 1024
    .line 1025
    iget-object v1, v1, Lhg4;->h:Lgd2;

    .line 1026
    .line 1027
    invoke-virtual {v1, v0, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 1028
    .line 1029
    .line 1030
    sget-object p1, Ln02;->e:Lso1;

    .line 1031
    .line 1032
    invoke-virtual {p1}, Lso1;->w()Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object p1

    .line 1036
    check-cast p1, Ljava/lang/Boolean;

    .line 1037
    .line 1038
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1039
    .line 1040
    .line 1041
    move-result p1

    .line 1042
    if-eqz p1, :cond_18

    .line 1043
    .line 1044
    if-eqz v5, :cond_18

    .line 1045
    .line 1046
    goto/16 :goto_e

    .line 1047
    .line 1048
    :cond_18
    :goto_13
    return-void

    .line 1049
    :goto_14
    sget-object v0, Ln02;->e:Lso1;

    .line 1050
    .line 1051
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    check-cast v0, Ljava/lang/Boolean;

    .line 1056
    .line 1057
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    if-eqz v0, :cond_19

    .line 1062
    .line 1063
    if-eqz v5, :cond_19

    .line 1064
    .line 1065
    invoke-virtual {v5, v4}, Lda3;->a(Laa3;)V

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v5}, Lda3;->h()V

    .line 1069
    .line 1070
    .line 1071
    :cond_19
    throw p1

    .line 1072
    nop

    .line 1073
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public s(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget v0, p0, Lg4;->f:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmz1;->h6:Liz1;

    .line 7
    .line 8
    sget-object v1, Ltw1;->e:Ltw1;

    .line 9
    .line 10
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lgi2;->R()Z

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lv73;

    .line 30
    .line 31
    iget-object v1, v0, Lv73;->e:Lk73;

    .line 32
    .line 33
    invoke-interface {v1}, Lk73;->l()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lji2;

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {p1, v2}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v1}, Lji2;->a()Lnl2;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-object v2, v2, Lnl2;->l:Le03;

    .line 52
    .line 53
    invoke-static {p1, v2}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_0
    monitor-enter v0

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    :try_start_0
    iget-object v1, v1, Lji2;->m:Lba4;

    .line 61
    .line 62
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lvm2;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lvm2;->d0(Lnx2;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v0, Lv73;->b:Ljava/util/concurrent/Executor;

    .line 72
    .line 73
    new-instance v3, Lsz2;

    .line 74
    .line 75
    const/4 v4, 0x7

    .line 76
    invoke-direct {v3, p0, v2, v4}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    iget-object v1, v0, Lv73;->d:Ls73;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ls73;->d0(Lnx2;)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lg4;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lu73;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lv73;->b(Li73;)Lyh2;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Lyh2;->b()Lji2;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Lji2;->a()Lnl2;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, Lnl2;->f:Lzo2;

    .line 107
    .line 108
    invoke-virtual {v1}, Lzo2;->p()V

    .line 109
    .line 110
    .line 111
    :goto_1
    iget v1, v2, Lnx2;->f:I

    .line 112
    .line 113
    const-string v3, "RewardedAdLoader.onFailure"

    .line 114
    .line 115
    invoke-static {v1, p1, v3}, Lyc0;->p(ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Ly23;

    .line 121
    .line 122
    invoke-interface {v1}, Ly23;->a()V

    .line 123
    .line 124
    .line 125
    sget-object v1, Ln02;->c:Lso1;

    .line 126
    .line 127
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const/4 v3, 0x0

    .line 138
    if-eqz v1, :cond_3

    .line 139
    .line 140
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v1, Lda3;

    .line 143
    .line 144
    if-eqz v1, :cond_3

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lda3;->f(Lnx2;)V

    .line 147
    .line 148
    .line 149
    iget-object v2, p0, Lg4;->h:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Laa3;

    .line 152
    .line 153
    invoke-interface {v2, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 154
    .line 155
    .line 156
    invoke-interface {v2, v3}, Laa3;->b(Z)Laa3;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2}, Lda3;->a(Laa3;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lda3;->h()V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_3
    iget-object v1, v0, Lv73;->g:Lea3;

    .line 167
    .line 168
    iget-object v4, p0, Lg4;->h:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, Laa3;

    .line 171
    .line 172
    invoke-interface {v4, v2}, Laa3;->k(Lnx2;)Laa3;

    .line 173
    .line 174
    .line 175
    invoke-interface {v4, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 176
    .line 177
    .line 178
    invoke-interface {v4, v3}, Laa3;->b(Z)Laa3;

    .line 179
    .line 180
    .line 181
    invoke-interface {v4}, Laa3;->n()Lca3;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 186
    .line 187
    .line 188
    :goto_2
    monitor-exit v0

    .line 189
    return-void

    .line 190
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    throw p1

    .line 192
    :sswitch_0
    sget-object v0, Lmz1;->h6:Liz1;

    .line 193
    .line 194
    sget-object v1, Ltw1;->e:Ltw1;

    .line 195
    .line 196
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 197
    .line 198
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_4

    .line 209
    .line 210
    invoke-static {}, Lgi2;->R()Z

    .line 211
    .line 212
    .line 213
    :cond_4
    iget-object v0, p0, Lg4;->i:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lei2;

    .line 216
    .line 217
    iget-object v2, v0, Lei2;->m:Lba4;

    .line 218
    .line 219
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Lnl2;

    .line 224
    .line 225
    iget-object v2, v2, Lnl2;->l:Le03;

    .line 226
    .line 227
    invoke-static {p1, v2}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    iget-object v3, p0, Lg4;->k:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, Lq73;

    .line 234
    .line 235
    monitor-enter v3

    .line 236
    const/4 v4, 0x0

    .line 237
    :try_start_1
    iput-object v4, v3, Lq73;->i:Lq93;

    .line 238
    .line 239
    iget-object v0, v0, Lei2;->i:Lba4;

    .line 240
    .line 241
    invoke-virtual {v0}, Lba4;->d()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, Lvm2;

    .line 246
    .line 247
    invoke-virtual {v0, v2}, Lvm2;->d0(Lnx2;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, Lmz1;->Q8:Liz1;

    .line 251
    .line 252
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 253
    .line 254
    invoke-virtual {v1, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_5

    .line 265
    .line 266
    iget-object v0, v3, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 267
    .line 268
    new-instance v1, Lp73;

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    invoke-direct {v1, p0, v2, v4}, Lp73;-><init>(Lg4;Lnx2;I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 275
    .line 276
    .line 277
    iget-object v0, v3, Lq73;->b:Ljava/util/concurrent/Executor;

    .line 278
    .line 279
    new-instance v1, Lp73;

    .line 280
    .line 281
    const/4 v4, 0x1

    .line 282
    invoke-direct {v1, p0, v2, v4}, Lp73;-><init>(Lg4;Lnx2;I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :catchall_1
    move-exception p1

    .line 290
    goto :goto_6

    .line 291
    :cond_5
    :goto_4
    iget v0, v2, Lnx2;->f:I

    .line 292
    .line 293
    const-string v1, "InterstitialAdLoader.onFailure"

    .line 294
    .line 295
    invoke-static {v0, p1, v1}, Lyc0;->p(ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Ly23;

    .line 301
    .line 302
    invoke-interface {v0}, Ly23;->a()V

    .line 303
    .line 304
    .line 305
    sget-object v0, Ln02;->c:Lso1;

    .line 306
    .line 307
    invoke-virtual {v0}, Lso1;->w()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    const/4 v1, 0x0

    .line 318
    if-eqz v0, :cond_6

    .line 319
    .line 320
    iget-object v0, p0, Lg4;->j:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lda3;

    .line 323
    .line 324
    if-eqz v0, :cond_6

    .line 325
    .line 326
    invoke-virtual {v0, v2}, Lda3;->f(Lnx2;)V

    .line 327
    .line 328
    .line 329
    iget-object v2, p0, Lg4;->h:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v2, Laa3;

    .line 332
    .line 333
    invoke-interface {v2, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 334
    .line 335
    .line 336
    invoke-interface {v2, v1}, Laa3;->b(Z)Laa3;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0, v2}, Lda3;->a(Laa3;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0}, Lda3;->h()V

    .line 343
    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_6
    iget-object v0, v3, Lq73;->g:Lea3;

    .line 347
    .line 348
    iget-object v4, p0, Lg4;->h:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v4, Laa3;

    .line 351
    .line 352
    invoke-interface {v4, v2}, Laa3;->k(Lnx2;)Laa3;

    .line 353
    .line 354
    .line 355
    invoke-interface {v4, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 356
    .line 357
    .line 358
    invoke-interface {v4, v1}, Laa3;->b(Z)Laa3;

    .line 359
    .line 360
    .line 361
    invoke-interface {v4}, Laa3;->n()Lca3;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-virtual {v0, p1}, Lea3;->b(Lca3;)V

    .line 366
    .line 367
    .line 368
    :goto_5
    monitor-exit v3

    .line 369
    return-void

    .line 370
    :goto_6
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 371
    throw p1

    .line 372
    :sswitch_1
    sget-object v0, Lmz1;->h6:Liz1;

    .line 373
    .line 374
    sget-object v1, Ltw1;->e:Ltw1;

    .line 375
    .line 376
    iget-object v2, v1, Ltw1;->c:Lkz1;

    .line 377
    .line 378
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    check-cast v0, Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-eqz v0, :cond_7

    .line 389
    .line 390
    invoke-static {}, Lgi2;->R()Z

    .line 391
    .line 392
    .line 393
    :cond_7
    iget-object v0, p0, Lg4;->k:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Lt63;

    .line 396
    .line 397
    iget-object v2, v0, Lt63;->e:Lk73;

    .line 398
    .line 399
    invoke-interface {v2}, Lk73;->l()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    check-cast v2, Lzh2;

    .line 404
    .line 405
    const/4 v3, 0x0

    .line 406
    if-nez v2, :cond_8

    .line 407
    .line 408
    invoke-static {p1, v3}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    goto :goto_7

    .line 413
    :cond_8
    invoke-virtual {v2}, Lzh2;->a()Lnl2;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    iget-object v4, v4, Lnl2;->l:Le03;

    .line 418
    .line 419
    invoke-static {p1, v4}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    :goto_7
    monitor-enter v0

    .line 424
    :try_start_2
    iput-object v3, v0, Lt63;->j:Ln70;

    .line 425
    .line 426
    if-eqz v2, :cond_9

    .line 427
    .line 428
    iget-object v2, v2, Lzh2;->k:Lba4;

    .line 429
    .line 430
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    check-cast v2, Lvm2;

    .line 435
    .line 436
    invoke-virtual {v2, v4}, Lvm2;->d0(Lnx2;)V

    .line 437
    .line 438
    .line 439
    sget-object v2, Lmz1;->P8:Liz1;

    .line 440
    .line 441
    iget-object v1, v1, Ltw1;->c:Lkz1;

    .line 442
    .line 443
    invoke-virtual {v1, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Ljava/lang/Boolean;

    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 450
    .line 451
    .line 452
    move-result v1

    .line 453
    if-eqz v1, :cond_a

    .line 454
    .line 455
    iget-object v1, v0, Lt63;->b:Ljava/util/concurrent/Executor;

    .line 456
    .line 457
    new-instance v2, Lsz2;

    .line 458
    .line 459
    const/4 v3, 0x5

    .line 460
    invoke-direct {v2, p0, v4, v3}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 464
    .line 465
    .line 466
    goto :goto_8

    .line 467
    :catchall_2
    move-exception p1

    .line 468
    goto :goto_a

    .line 469
    :cond_9
    iget-object v1, v0, Lt63;->d:Ls63;

    .line 470
    .line 471
    invoke-virtual {v1, v4}, Ls63;->d0(Lnx2;)V

    .line 472
    .line 473
    .line 474
    iget-object v1, p0, Lg4;->i:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v1, Lr63;

    .line 477
    .line 478
    invoke-virtual {v0, v1}, Lt63;->b(Li73;)Lyh2;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    invoke-virtual {v1}, Lyh2;->a()Lzh2;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Lzh2;->a()Lnl2;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iget-object v1, v1, Lnl2;->f:Lzo2;

    .line 491
    .line 492
    invoke-virtual {v1}, Lzo2;->p()V

    .line 493
    .line 494
    .line 495
    :cond_a
    :goto_8
    iget v1, v4, Lnx2;->f:I

    .line 496
    .line 497
    const-string v2, "AppOpenAdLoader.onFailure"

    .line 498
    .line 499
    invoke-static {v1, p1, v2}, Lyc0;->p(ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    iget-object v1, p0, Lg4;->g:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Ly23;

    .line 505
    .line 506
    invoke-interface {v1}, Ly23;->a()V

    .line 507
    .line 508
    .line 509
    sget-object v1, Ln02;->c:Lso1;

    .line 510
    .line 511
    invoke-virtual {v1}, Lso1;->w()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    check-cast v1, Ljava/lang/Boolean;

    .line 516
    .line 517
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    const/4 v2, 0x0

    .line 522
    if-eqz v1, :cond_b

    .line 523
    .line 524
    iget-object v1, p0, Lg4;->j:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v1, Lda3;

    .line 527
    .line 528
    if-eqz v1, :cond_b

    .line 529
    .line 530
    invoke-virtual {v1, v4}, Lda3;->f(Lnx2;)V

    .line 531
    .line 532
    .line 533
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v3, Laa3;

    .line 536
    .line 537
    invoke-interface {v3, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 538
    .line 539
    .line 540
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v3}, Lda3;->a(Laa3;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1}, Lda3;->h()V

    .line 547
    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_b
    iget-object v1, v0, Lt63;->h:Lea3;

    .line 551
    .line 552
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v3, Laa3;

    .line 555
    .line 556
    invoke-interface {v3, v4}, Laa3;->k(Lnx2;)Laa3;

    .line 557
    .line 558
    .line 559
    invoke-interface {v3, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 560
    .line 561
    .line 562
    invoke-interface {v3, v2}, Laa3;->b(Z)Laa3;

    .line 563
    .line 564
    .line 565
    invoke-interface {v3}, Laa3;->n()Lca3;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 570
    .line 571
    .line 572
    :goto_9
    monitor-exit v0

    .line 573
    return-void

    .line 574
    :goto_a
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 575
    throw p1

    .line 576
    :sswitch_2
    iget-object v0, p0, Lg4;->h:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, Laa3;

    .line 579
    .line 580
    sget-object v1, Lmz1;->h6:Liz1;

    .line 581
    .line 582
    sget-object v2, Ltw1;->e:Ltw1;

    .line 583
    .line 584
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 585
    .line 586
    invoke-virtual {v2, v1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    check-cast v1, Ljava/lang/Boolean;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-eqz v1, :cond_c

    .line 597
    .line 598
    invoke-static {}, Lgi2;->R()Z

    .line 599
    .line 600
    .line 601
    :cond_c
    iget-object v1, p0, Lg4;->i:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v1, Lsh2;

    .line 604
    .line 605
    iget-object v2, v1, Lsh2;->n:Lba4;

    .line 606
    .line 607
    invoke-virtual {v2}, Lba4;->d()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    check-cast v2, Lnl2;

    .line 612
    .line 613
    iget-object v2, v2, Lnl2;->l:Le03;

    .line 614
    .line 615
    invoke-static {p1, v2}, Lzt0;->J(Ljava/lang/Throwable;Le03;)Lnx2;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    iget-object v1, v1, Lsh2;->j:Lba4;

    .line 620
    .line 621
    invoke-virtual {v1}, Lba4;->d()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    check-cast v1, Lvm2;

    .line 626
    .line 627
    invoke-virtual {v1, v2}, Lvm2;->d0(Lnx2;)V

    .line 628
    .line 629
    .line 630
    iget-object v1, p0, Lg4;->k:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v1, Lbu1;

    .line 633
    .line 634
    iget-object v3, v1, Lbu1;->h:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v3, Lth2;

    .line 637
    .line 638
    invoke-virtual {v3}, Lth2;->b()Ljava/util/concurrent/Executor;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    new-instance v4, Lsz2;

    .line 643
    .line 644
    const/4 v5, 0x4

    .line 645
    invoke-direct {v4, p0, v2, v5}, Lsz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 646
    .line 647
    .line 648
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 649
    .line 650
    .line 651
    iget v3, v2, Lnx2;->f:I

    .line 652
    .line 653
    const-string v4, "NativeAdLoader.onFailure"

    .line 654
    .line 655
    invoke-static {v3, p1, v4}, Lyc0;->p(ILjava/lang/Throwable;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    iget-object v3, p0, Lg4;->g:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v3, Lf23;

    .line 661
    .line 662
    invoke-virtual {v3}, Lf23;->a()V

    .line 663
    .line 664
    .line 665
    sget-object v3, Ln02;->c:Lso1;

    .line 666
    .line 667
    invoke-virtual {v3}, Lso1;->w()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    check-cast v3, Ljava/lang/Boolean;

    .line 672
    .line 673
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 674
    .line 675
    .line 676
    move-result v3

    .line 677
    const/4 v4, 0x0

    .line 678
    if-eqz v3, :cond_d

    .line 679
    .line 680
    iget-object v3, p0, Lg4;->j:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast v3, Lda3;

    .line 683
    .line 684
    if-eqz v3, :cond_d

    .line 685
    .line 686
    invoke-virtual {v3, v2}, Lda3;->f(Lnx2;)V

    .line 687
    .line 688
    .line 689
    invoke-interface {v0, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 690
    .line 691
    .line 692
    invoke-interface {v0, v4}, Laa3;->b(Z)Laa3;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v3, v0}, Lda3;->a(Laa3;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v3}, Lda3;->h()V

    .line 699
    .line 700
    .line 701
    goto :goto_b

    .line 702
    :cond_d
    iget-object v1, v1, Lbu1;->k:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v1, Lea3;

    .line 705
    .line 706
    invoke-interface {v0, v2}, Laa3;->k(Lnx2;)Laa3;

    .line 707
    .line 708
    .line 709
    invoke-interface {v0, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 710
    .line 711
    .line 712
    invoke-interface {v0, v4}, Laa3;->b(Z)Laa3;

    .line 713
    .line 714
    .line 715
    invoke-interface {v0}, Laa3;->n()Lca3;

    .line 716
    .line 717
    .line 718
    move-result-object p1

    .line 719
    invoke-virtual {v1, p1}, Lea3;->b(Lca3;)V

    .line 720
    .line 721
    .line 722
    :goto_b
    return-void

    .line 723
    :sswitch_3
    const-string v0, "SignalGeneratorImpl.generateSignals"

    .line 724
    .line 725
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    sget-object v2, Lmz1;->h8:Liz1;

    .line 730
    .line 731
    sget-object v3, Ltw1;->e:Ltw1;

    .line 732
    .line 733
    iget-object v3, v3, Ltw1;->c:Lkz1;

    .line 734
    .line 735
    invoke-virtual {v3, v2}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    check-cast v2, Ljava/lang/Boolean;

    .line 740
    .line 741
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 742
    .line 743
    .line 744
    move-result v2

    .line 745
    const-string v3, "Internal error. "

    .line 746
    .line 747
    if-eqz v2, :cond_e

    .line 748
    .line 749
    sget-object v2, Lhg4;->C:Lhg4;

    .line 750
    .line 751
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 752
    .line 753
    invoke-virtual {v2, v0, p1}, Lgd2;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 754
    .line 755
    .line 756
    goto :goto_c

    .line 757
    :cond_e
    sget-object v2, Lhg4;->C:Lhg4;

    .line 758
    .line 759
    iget-object v2, v2, Lhg4;->h:Lgd2;

    .line 760
    .line 761
    invoke-virtual {v2, v0, p1}, Lgd2;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 762
    .line 763
    .line 764
    :goto_c
    iget-object v0, p0, Lg4;->g:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v0, Ln70;

    .line 767
    .line 768
    iget-object v2, p0, Lg4;->j:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v2, Lad2;

    .line 771
    .line 772
    invoke-static {v0, v2}, Lcr1;->K3(Ln70;Lad2;)Lda3;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    sget-object v2, Ln02;->e:Lso1;

    .line 777
    .line 778
    invoke-virtual {v2}, Lso1;->w()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    check-cast v2, Ljava/lang/Boolean;

    .line 783
    .line 784
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 785
    .line 786
    .line 787
    move-result v2

    .line 788
    if-eqz v2, :cond_f

    .line 789
    .line 790
    if-eqz v0, :cond_f

    .line 791
    .line 792
    iget-object v2, p0, Lg4;->i:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v2, Laa3;

    .line 795
    .line 796
    invoke-interface {v2, p1}, Laa3;->j(Ljava/lang/Throwable;)Laa3;

    .line 797
    .line 798
    .line 799
    const/4 p1, 0x0

    .line 800
    invoke-interface {v2, p1}, Laa3;->b(Z)Laa3;

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v2}, Lda3;->a(Laa3;)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v0}, Lda3;->h()V

    .line 807
    .line 808
    .line 809
    :cond_f
    iget-object p1, p0, Lg4;->h:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast p1, Ltc2;

    .line 812
    .line 813
    if-nez p1, :cond_10

    .line 814
    .line 815
    goto :goto_e

    .line 816
    :cond_10
    :try_start_3
    const-string v0, "Unknown format is no longer supported."

    .line 817
    .line 818
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v0

    .line 822
    if-eqz v0, :cond_11

    .line 823
    .line 824
    goto :goto_d

    .line 825
    :cond_11
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    add-int/lit8 v0, v0, 0x10

    .line 834
    .line 835
    new-instance v2, Ljava/lang/StringBuilder;

    .line 836
    .line 837
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    :goto_d
    invoke-interface {p1, v1}, Ltc2;->w(Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 851
    .line 852
    .line 853
    goto :goto_e

    .line 854
    :catch_0
    move-exception p1

    .line 855
    const-string v0, ""

    .line 856
    .line 857
    invoke-static {v0, p1}, Lgi2;->c0(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 858
    .line 859
    .line 860
    :goto_e
    return-void

    .line 861
    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget v0, p0, Lg4;->f:I

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
    iget-object v0, p0, Lg4;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "FontRequest {mProviderAuthority: "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, Lg4;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, ", mProviderPackage: "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lg4;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v3, ", mQuery: "

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v3, p0, Lg4;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v3, ", mCertificates:"

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    move v3, v2

    .line 72
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-ge v3, v4, :cond_1

    .line 77
    .line 78
    const-string v4, " ["

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Ljava/util/List;

    .line 88
    .line 89
    move v5, v2

    .line 90
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-ge v5, v6, :cond_0

    .line 95
    .line 96
    const-string v6, " \""

    .line 97
    .line 98
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, [B

    .line 106
    .line 107
    invoke-static {v6, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v6, "\""

    .line 115
    .line 116
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    add-int/lit8 v5, v5, 0x1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    const-string v4, " ]"

    .line 123
    .line 124
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    add-int/lit8 v3, v3, 0x1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    const-string v0, "}mCertificatesArray: 0"

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
