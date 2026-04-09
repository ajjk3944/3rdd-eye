.class final Lyd/b$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LW7/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lyd/b$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyd/b$n;

    invoke-direct {v0}, Lyd/b$n;-><init>()V

    sput-object v0, Lyd/b$n;->a:Lyd/b$n;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lle/i;)Z
    .locals 0

    invoke-static {p0}, Lyd/b$n;->c(Lle/i;)Z

    move-result p0

    return p0
.end method

.method private static final c(Lle/i;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lle/i;->m()Lke/a;

    move-result-object p0

    instance-of p0, p0, Lke/a$a$a;

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lyd/b$n;->b(Ljava/util/List;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;)Ll9/a;
    .locals 2

    const-string v0, "signals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object p1

    new-instance v1, Lyd/c;

    invoke-direct {v1}, Lyd/c;-><init>()V

    invoke-static {p1, v1}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object p1

    new-instance v1, Lyd/b$n$a;

    invoke-direct {v1}, Lyd/b$n$a;-><init>()V

    invoke-static {p1, v1}, Lzi/m;->T(Lzi/j;Ljava/util/Comparator;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->G(Lzi/j;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
