.class public final Lre/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lre/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/q$a;,
        Lre/q$b;,
        Lre/q$c;
    }
.end annotation


# static fields
.field public static final d:Lre/q$b;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lre/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lre/q$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lre/q;->d:Lre/q$b;

    return-void
.end method

.method public constructor <init>(Lcom/ui/wmw/g;Lre/c;)V
    .locals 2

    const-string v0, "wizardSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p2}, Lre/c;->b()Lgg/i;

    move-result-object p2

    new-instance v0, Lre/o;

    invoke-direct {v0}, Lre/o;-><init>()V

    sget-object v1, Lre/q$d;->a:Lre/q$d;

    invoke-virtual {p2, v0, v1}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p2

    sget-object v0, Lre/q$e;->a:Lre/q$e;

    invoke-virtual {p2, v0}, Lgg/i;->B(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string v0, "concatMap(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lre/q;->a:Lgg/i;

    new-instance v0, Lre/p;

    invoke-direct {v0}, Lre/p;-><init>()V

    sget-object v1, Lre/q$f;->a:Lre/q$f;

    invoke-virtual {p2, v0, v1}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p2

    sget-object v0, Lre/q$g;->a:Lre/q$g;

    invoke-virtual {p2, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string v0, "map(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lre/q;->b:Lgg/i;

    sget-object v0, LAg/c;->a:LAg/c;

    invoke-interface {p1}, Lcom/ui/wmw/g;->d()Lcom/ui/wmw/wifi/a$a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/wifi/a$a;->b()Lgg/i;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    const-wide/16 v0, 0x3e8

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p2, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    sget-object p2, Lre/q$h;->a:Lre/q$h;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lre/q;->c:Lgg/i;

    return-void
.end method

.method public static synthetic a()LYg/s;
    .locals 1

    invoke-static {}, Lre/q;->d()LYg/s;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/util/HashMap;
    .locals 1

    invoke-static {}, Lre/q;->e()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method private static final d()LYg/s;
    .locals 2

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method

.method private static final e()Ljava/util/HashMap;
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lre/q;->c:Lgg/i;

    return-object v0
.end method
