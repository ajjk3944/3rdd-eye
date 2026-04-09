.class public final Lxa/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lxa/a$a;

.field private static b:Li9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa/a$a;

    invoke-direct {v0}, Lxa/a$a;-><init>()V

    sput-object v0, Lxa/a$a;->a:Lxa/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li9/a;
    .locals 1

    sget-object v0, Lxa/a$a;->b:Li9/a;

    return-object v0
.end method

.method public final b(LIi/N;Lcom/ui/uidb/UiDB$b;Lokhttp3/OkHttpClient;Lza/d;Lxa/a$c;)Lxa/a;
    .locals 3

    const-string/jumbo v0, "externalScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "environment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    new-instance v0, Lya/d;

    invoke-direct {v0, p5}, Lya/d;-><init>(Lxa/a$c;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lxa/j;

    new-instance v2, Lya/m;

    invoke-direct {v2, p2, p3, p4, v0}, Lya/m;-><init>(Lcom/ui/uidb/UiDB$b;Lokhttp3/OkHttpClient;Lza/d;Lya/n;)V

    invoke-direct {v1, p1, v0, v2, p5}, Lxa/j;-><init>(LIi/N;Lya/n;Lya/n;Lxa/a$c;)V

    return-object v1
.end method
