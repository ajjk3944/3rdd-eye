.class public final LL8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL8/e;

    invoke-direct {v0}, LL8/e;-><init>()V

    sput-object v0, LL8/e;->a:LL8/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/net/URI;
    .locals 3

    const-string/jumbo v0, "domain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL8/j;->a:LL8/j;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "https://www.google.com/s2/favicons?sz=64&domain="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LL8/j;->a(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    return-object p1
.end method
