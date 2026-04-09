.class public final LAd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAd/a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/result/e;

.field private final b:Lbe/e;

.field private final c:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/e;Lbe/e;)V
    .locals 1

    const-string v0, "speedtestResultManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiApiManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAd/b;->a:Lcom/ui/wifiman/model/speedtest/result/e;

    iput-object p2, p0, LAd/b;->b:Lbe/e;

    invoke-interface {p2}, Lbe/e;->c()Lgg/i;

    move-result-object p1

    sget-object p2, LAd/b$b;->a:LAd/b$b;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LAd/b;->c:Lgg/i;

    return-void
.end method

.method public static final synthetic c(LAd/b;LAd/a$b;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, LAd/b;->e(LAd/a$b;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private final d(J)Lgg/n;
    .locals 1

    iget-object v0, p0, LAd/b;->a:Lcom/ui/wifiman/model/speedtest/result/e;

    invoke-interface {v0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/e;->f(J)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->o0()Lgg/z;

    move-result-object p1

    sget-object p2, LAd/b$a;->a:LAd/b$a;

    invoke-virtual {p1, p2}, Lgg/z;->u(Lkg/n;)Lgg/n;

    move-result-object p1

    const-string p2, "flatMapMaybe(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final e(LAd/a$b;Lcom/ui/wifiman/model/speedtest/result/b;)Lgg/b;
    .locals 2

    invoke-virtual {p1}, LAd/a$b;->a()LAd/a$b$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAd/b;->b:Lbe/e;

    invoke-interface {v0}, Lbe/e;->c()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, LAd/b$d;

    invoke-direct {v1, p2, p1}, LAd/b$d;-><init>(Lcom/ui/wifiman/model/speedtest/result/b;LAd/a$b;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(LAd/a$b;)Lgg/b;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LAd/a$b;->b()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LAd/b;->d(J)Lgg/n;

    move-result-object v0

    new-instance v1, LAd/b$c;

    invoke-direct {v1, p0, p1}, LAd/b$c;-><init>(LAd/b;LAd/a$b;)V

    invoke-virtual {v0, v1}, Lgg/n;->k(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LAd/b;->c:Lgg/i;

    return-object v0
.end method
