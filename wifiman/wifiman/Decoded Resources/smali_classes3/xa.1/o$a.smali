.class public final Lxa/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lxa/o$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa/o$a;

    invoke-direct {v0}, Lxa/o$a;-><init>()V

    sput-object v0, Lxa/o$a;->a:Lxa/o$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/uidb/UiDB$b;Lokhttp3/OkHttpClient;Lza/d;Lxa/a$c;)Lxa/o;
    .locals 7

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "storage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxa/p;

    sget-object v1, Lxa/a;->a:Lxa/a$a;

    invoke-static {}, LIi/c0;->a()LIi/J;

    move-result-object v2

    invoke-static {v2}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lxa/a$a;->b(LIi/N;Lcom/ui/uidb/UiDB$b;Lokhttp3/OkHttpClient;Lza/d;Lxa/a$c;)Lxa/a;

    move-result-object p1

    invoke-direct {v0, p1}, Lxa/p;-><init>(Lxa/a;)V

    return-object v0
.end method
