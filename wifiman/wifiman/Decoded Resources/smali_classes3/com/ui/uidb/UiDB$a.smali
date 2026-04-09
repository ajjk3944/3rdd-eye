.class public final Lcom/ui/uidb/UiDB$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/uidb/UiDB;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lcom/ui/uidb/UiDB$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/uidb/UiDB$a;

    invoke-direct {v0}, Lcom/ui/uidb/UiDB$a;-><init>()V

    sput-object v0, Lcom/ui/uidb/UiDB$a;->a:Lcom/ui/uidb/UiDB$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/ui/uidb/UiDB$a;Lcom/ui/uidb/UiDB$b;ZLokhttp3/OkHttpClient;Lbb/b;ILjava/lang/Object;)Lcom/ui/uidb/UiDB;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, Lcom/ui/uidb/UiDB$b;->PRODUCTION:Lcom/ui/uidb/UiDB$b;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/4 p2, 0x1

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    new-instance p3, Lokhttp3/OkHttpClient;

    invoke-direct {p3}, Lokhttp3/OkHttpClient;-><init>()V

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    sget-object p4, Lbb/b;->a:Lbb/b$a;

    invoke-virtual {p4, p2}, Lbb/b$a;->a(Z)Lbb/b;

    move-result-object p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/uidb/UiDB$a;->a(Lcom/ui/uidb/UiDB$b;ZLokhttp3/OkHttpClient;Lbb/b;)Lcom/ui/uidb/UiDB;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/ui/uidb/UiDB$b;ZLokhttp3/OkHttpClient;Lbb/b;)Lcom/ui/uidb/UiDB;
    .locals 10

    const-string/jumbo v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sharedOkhttpClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "snapshotSerializer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lab/f;

    invoke-direct {v6}, Lab/f;-><init>()V

    new-instance v0, Lcom/ui/uidb/a;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v3, p1

    move v4, p2

    move-object v5, p4

    invoke-direct/range {v1 .. v9}, Lcom/ui/uidb/a;-><init>(Lokhttp3/OkHttpClient;Lcom/ui/uidb/UiDB$b;ZLbb/b;Lab/f;LXa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
