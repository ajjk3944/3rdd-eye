.class public final Lcom/ui/wmw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lh9/a;

.field private final b:Lh9/a;

.field private final c:Lcom/ui/wmw/api/v1/a;


# direct methods
.method public constructor <init>(Lh9/a;Lh9/a;LT8/d;)V
    .locals 3

    const-string v0, "mac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "btleMac"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "btleSession"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/h;->a:Lh9/a;

    iput-object p2, p0, Lcom/ui/wmw/h;->b:Lh9/a;

    new-instance p1, Lcom/ui/wmw/api/v1/f;

    invoke-direct {p0}, Lcom/ui/wmw/h;->d()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Le9/d;

    new-instance v1, Lcom/ui/comm/v4/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ui/comm/v4/d;-><init>(Z)V

    invoke-direct {v0, p3, v1}, Le9/d;-><init>(LT8/d;Le9/c;)V

    const/4 p3, 0x0

    invoke-direct {p1, p2, v0, p3}, Lcom/ui/wmw/api/v1/f;-><init>(Ljava/lang/String;Le9/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ui/wmw/h;->c:Lcom/ui/wmw/api/v1/a;

    return-void
.end method

.method public static final synthetic a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/h;->c:Lcom/ui/wmw/api/v1/a;

    return-object p0
.end method

.method public static final synthetic b(Lcom/ui/wmw/h;)Lh9/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wmw/h;->a:Lh9/a;

    return-object p0
.end method

.method public static final synthetic c(Lcom/ui/wmw/h;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/ui/wmw/h;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ui/wmw/h;->b:Lh9/a;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/ui/wmw/g$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e()Lgg/z;
    .locals 2

    iget-object v0, p0, Lcom/ui/wmw/h;->c:Lcom/ui/wmw/api/v1/a;

    invoke-interface {v0}, LLf/b;->getVersion()Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wmw/h$a;->a:Lcom/ui/wmw/h$a;

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wmw/h$b;

    invoke-direct {v1, p0}, Lcom/ui/wmw/h$b;-><init>(Lcom/ui/wmw/h;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wmw/h$c;->a:Lcom/ui/wmw/h$c;

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    const-string v1, "doOnSuccess(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
