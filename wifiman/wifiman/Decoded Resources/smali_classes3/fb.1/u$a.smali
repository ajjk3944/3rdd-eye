.class public final Lfb/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfb/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfb/u$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lfb/u$a;)Ljavax/net/ssl/X509TrustManager;
    .locals 0

    invoke-direct {p0}, Lfb/u$a;->b()Ljavax/net/ssl/X509TrustManager;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    invoke-static {}, Lfb/u;->b()LYg/m;

    move-result-object v0

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    return-object v0
.end method
