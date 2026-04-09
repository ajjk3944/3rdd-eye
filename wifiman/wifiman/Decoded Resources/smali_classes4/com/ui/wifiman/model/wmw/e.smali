.class public final Lcom/ui/wifiman/model/wmw/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/wmw/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/wmw/e$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/ui/wifiman/model/wmw/e$a;


# instance fields
.field private final a:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/wmw/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/wmw/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/wmw/e;->b:Lcom/ui/wifiman/model/wmw/e$a;

    return-void
.end method

.method public constructor <init>(Lwc/h;Lcom/ui/wifiman/model/wmw/b$d;)V
    .locals 2

    const-string v0, "bleScanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adoptionManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-interface {p2}, Lcom/ui/wifiman/model/wmw/b$d;->a()Lgg/i;

    move-result-object p2

    sget-object v1, Lwc/f;->BLE:Lwc/f;

    invoke-interface {p1, v1}, Lwc/h;->a(Lwc/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/wmw/e$b;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/wmw/e$b;-><init>(Lcom/ui/wifiman/model/wmw/e;)V

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/wmw/e$c;->a:Lcom/ui/wifiman/model/wmw/e$c;

    invoke-virtual {p1, p2}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    new-instance p2, Lqe/j;

    invoke-direct {p2}, Lqe/j;-><init>()V

    invoke-virtual {p1, p2}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    sget-object p2, Lcom/ui/wifiman/model/wmw/e$d;->a:Lcom/ui/wifiman/model/wmw/e$d;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/wmw/e;->a:Lgg/i;

    return-void
.end method

.method public static synthetic b()V
    .locals 0

    invoke-static {}, Lcom/ui/wifiman/model/wmw/e;->e()V

    return-void
.end method

.method public static final synthetic c(Lcom/ui/wifiman/model/wmw/e;Lwc/a;Lcom/ui/wifiman/model/wmw/b;)Lcom/ui/wifiman/model/wmw/d$a$a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/ui/wifiman/model/wmw/e;->d(Lwc/a;Lcom/ui/wifiman/model/wmw/b;)Lcom/ui/wifiman/model/wmw/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lwc/a;Lcom/ui/wifiman/model/wmw/b;)Lcom/ui/wifiman/model/wmw/d$a$a;
    .locals 1

    instance-of v0, p2, Lcom/ui/wifiman/model/wmw/b$a;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/ui/wifiman/model/wmw/b$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/wmw/b$a;->a()Lh9/a;

    move-result-object p2

    invoke-virtual {p1}, Lwc/a;->h()Lh9/a;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/wmw/d$a$a;->ADOPTED:Lcom/ui/wifiman/model/wmw/d$a$a;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lwc/a;->i()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lwc/a;->i()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/ui/wifiman/model/wmw/d$a$a;->ADOPTED_BY_OTHER:Lcom/ui/wifiman/model/wmw/d$a$a;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/ui/wifiman/model/wmw/d$a$a;->FREE:Lcom/ui/wifiman/model/wmw/d$a$a;

    :goto_0
    return-object p1
.end method

.method private static final e()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "WMW Discovery FINISHED"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/wmw/e;->a:Lgg/i;

    return-object v0
.end method
