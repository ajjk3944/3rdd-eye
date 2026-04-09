.class public abstract Lk8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/m$a;
    }
.end annotation


# static fields
.field public static final f:Lk8/m$a;

.field public static final g:I


# instance fields
.field private final a:Lmh/p;

.field private final b:LFg/a;

.field private final c:Lgg/m;

.field private final d:Lgg/i;

.field private final e:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk8/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk8/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lk8/m;->f:Lk8/m$a;

    const/16 v0, 0x8

    sput v0, Lk8/m;->g:I

    return-void
.end method

.method public constructor <init>(Lmh/p;)V
    .locals 3

    const-string/jumbo v0, "filterFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/m;->a:Lmh/p;

    const-string p1, ""

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo v0, "createDefault(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk8/m;->b:LFg/a;

    new-instance v0, Lk8/l;

    invoke-direct {v0, p0}, Lk8/l;-><init>(Lk8/m;)V

    iput-object v0, p0, Lk8/m;->c:Lgg/m;

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk8/m;->d:Lgg/i;

    iput-object p1, p0, Lk8/m;->e:Lgg/i;

    return-void
.end method

.method public static synthetic a(Lk8/m;Lgg/i;)LDj/a;
    .locals 0

    invoke-static {p0, p1}, Lk8/m;->d(Lk8/m;Lgg/i;)LDj/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk8/m;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lk8/m;->c(Lk8/m;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lk8/m;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk8/m;->a:Lmh/p;

    iget-object p0, p0, Lk8/m;->b:LFg/a;

    invoke-virtual {p0}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    invoke-interface {v0, p1, p0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final d(Lk8/m;Lgg/i;)LDj/a;
    .locals 2

    const-string/jumbo v0, "dataStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/m;->b:LFg/a;

    new-instance v1, Lk8/m$b;

    invoke-direct {v1, p0}, Lk8/m$b;-><init>(Lk8/m;)V

    invoke-static {p1, v0, v1}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()Lmh/l;
    .locals 1

    new-instance v0, Lk8/k;

    invoke-direct {v0, p0}, Lk8/k;-><init>(Lk8/m;)V

    return-object v0
.end method

.method public final f()Lgg/i;
    .locals 1

    iget-object v0, p0, Lk8/m;->e:Lgg/i;

    return-object v0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "newQuery"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk8/m;->b:LFg/a;

    invoke-virtual {v0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method
