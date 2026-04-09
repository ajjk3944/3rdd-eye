.class public abstract Li8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/s$a;,
        Li8/s$b;,
        Li8/s$c;,
        Li8/s$d;,
        Li8/s$e;,
        Li8/s$f;,
        Li8/s$g;
    }
.end annotation


# static fields
.field public static final a:Li8/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li8/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li8/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li8/s;->a:Li8/s$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Li8/s;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Landroid/net/Uri;
.end method
