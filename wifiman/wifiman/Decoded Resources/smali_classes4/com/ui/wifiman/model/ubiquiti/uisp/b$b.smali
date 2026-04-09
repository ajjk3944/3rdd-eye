.class public final Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/ubiquiti/uisp/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/uisp/b$b$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/ui/wifiman/model/ubiquiti/uisp/b$b$a;


# instance fields
.field private final a:Lokhttp3/HttpUrl;

.field private final b:Z

.field private final c:Z

.field private final d:Z

.field private final e:Ljava/lang/String;

.field private final f:LYg/m;

.field private final g:LYg/m;

.field private final h:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->i:Lcom/ui/wifiman/model/ubiquiti/uisp/b$b$a;

    return-void
.end method

.method public constructor <init>(Lokhttp3/HttpUrl;ZZZ)V
    .locals 1

    const-string v0, "baseUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->a:Lokhttp3/HttpUrl;

    .line 3
    iput-boolean p2, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->b:Z

    .line 4
    iput-boolean p3, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->c:Z

    .line 5
    iput-boolean p4, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->d:Z

    .line 6
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->i()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x2

    const/4 p3, 0x0

    .line 7
    const-string p4, "%"

    const/4 v0, 0x0

    invoke-static {p1, p4, v0, p2, p3}, Lkotlin/text/t;->W(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 8
    new-instance p2, Lkotlin/text/p;

    .line 9
    const-string p3, "%\\w+"

    invoke-direct {p2, p3}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    const-string p3, ""

    invoke-virtual {p2, p1, p3}, Lkotlin/text/p;->n(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lkotlin/text/p;

    .line 10
    const-string p4, "[\\[\\]]"

    invoke-direct {p2, p4}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1, p3}, Lkotlin/text/p;->n(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    :cond_0
    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->e:Ljava/lang/String;

    .line 13
    new-instance p1, LXd/j;

    invoke-direct {p1, p0}, LXd/j;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->f:LYg/m;

    .line 14
    new-instance p1, LXd/k;

    invoke-direct {p1, p0}, LXd/k;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->g:LYg/m;

    .line 15
    new-instance p1, LXd/l;

    invoke-direct {p1, p0}, LXd/l;-><init>(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->h:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Lokhttp3/HttpUrl;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x1

    if-eqz p6, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    .line 16
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;-><init>(Lokhttp3/HttpUrl;ZZZ)V

    return-void
.end method

.method public static synthetic b(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->h(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->j(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->i(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->h:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final h(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method private static final i(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->a:Lokhttp3/HttpUrl;

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->t()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "://"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->a:Lokhttp3/HttpUrl;

    invoke-virtual {v0}, Lokhttp3/HttpUrl;->t()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "://"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 3

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->j()Lokhttp3/Request;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request;->i()Lokhttp3/Request$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->b:Z

    if-eqz v1, :cond_0

    const-string v1, "Host"

    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_0
    iget-boolean v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->c:Z

    if-eqz v1, :cond_1

    const-string v1, "Origin"

    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_1
    iget-boolean v1, p0, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->d:Z

    if-eqz v1, :cond_2

    const-string v1, "Referer"

    invoke-direct {p0}, Lcom/ui/wifiman/model/ubiquiti/uisp/b$b;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    :cond_2
    const-string v1, "Content-Type"

    const-string v2, "application/x-www-form-urlencoded; charset=UTF-8"

    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    move-result-object v0

    invoke-interface {p1, v0}, Lokhttp3/Interceptor$Chain;->b(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    return-object p1
.end method
