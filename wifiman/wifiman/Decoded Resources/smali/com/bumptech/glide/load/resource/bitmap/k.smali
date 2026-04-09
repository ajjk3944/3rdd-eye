.class public abstract Lcom/bumptech/glide/load/resource/bitmap/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/resource/bitmap/k$a;,
        Lcom/bumptech/glide/load/resource/bitmap/k$b;,
        Lcom/bumptech/glide/load/resource/bitmap/k$e;,
        Lcom/bumptech/glide/load/resource/bitmap/k$c;,
        Lcom/bumptech/glide/load/resource/bitmap/k$d;,
        Lcom/bumptech/glide/load/resource/bitmap/k$f;,
        Lcom/bumptech/glide/load/resource/bitmap/k$g;
    }
.end annotation


# static fields
.field public static final a:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final b:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final c:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final d:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final e:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final f:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final g:Lcom/bumptech/glide/load/resource/bitmap/k;

.field public static final h:LC2/f;

.field static final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/k$a;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->a:Lcom/bumptech/glide/load/resource/bitmap/k;

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k$b;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/k$b;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->b:Lcom/bumptech/glide/load/resource/bitmap/k;

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k$e;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/k$e;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->c:Lcom/bumptech/glide/load/resource/bitmap/k;

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k$c;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/k$c;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->d:Lcom/bumptech/glide/load/resource/bitmap/k;

    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/k$d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/k$d;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->e:Lcom/bumptech/glide/load/resource/bitmap/k;

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/k$f;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/k$f;-><init>()V

    sput-object v1, Lcom/bumptech/glide/load/resource/bitmap/k;->f:Lcom/bumptech/glide/load/resource/bitmap/k;

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->g:Lcom/bumptech/glide/load/resource/bitmap/k;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    invoke-static {v1, v0}, LC2/f;->f(Ljava/lang/String;Ljava/lang/Object;)LC2/f;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/k;->h:LC2/f;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/k;->i:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(IIII)Lcom/bumptech/glide/load/resource/bitmap/k$g;
.end method

.method public abstract b(IIII)F
.end method
