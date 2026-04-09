.class final LMj/r$o;
.super LMj/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation


# static fields
.field static final a:LMj/r$o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LMj/r$o;

    invoke-direct {v0}, LMj/r$o;-><init>()V

    sput-object v0, LMj/r$o;->a:LMj/r$o;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LMj/r;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic a(LMj/u;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lokhttp3/MultipartBody$Part;

    invoke-virtual {p0, p1, p2}, LMj/r$o;->d(LMj/u;Lokhttp3/MultipartBody$Part;)V

    return-void
.end method

.method d(LMj/u;Lokhttp3/MultipartBody$Part;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, LMj/u;->e(Lokhttp3/MultipartBody$Part;)V

    :cond_0
    return-void
.end method
