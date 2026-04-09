.class public final Lxe/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxe/r0;


# instance fields
.field private final a:LP7/a;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LP7/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/v0;->a:LP7/a;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lxe/v0;->b:Ljava/util/Map;

    return-void
.end method

.method public static synthetic c(Lxe/v0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxe/v0;->e(Lxe/v0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V

    return-void
.end method

.method private static final e(Lxe/v0;Lf2/n;Lf2/r;Landroid/os/Bundle;)V
    .locals 0

    const-string p3, "<unused var>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "destination"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lf2/r;->w()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lxe/v0;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LP7/b;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lxe/v0;->a(LP7/b;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(LP7/b;)V
    .locals 3

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Analytics screen: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lxe/v0;->a:LP7/a;

    invoke-static {v0, p1, v1, v2, v1}, LP7/a$a;->a(LP7/a;LP7/b;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public b(LAe/p;)V
    .locals 2

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxe/t0;->c(LAe/p;)LP7/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lxe/v0;->b:Ljava/util/Map;

    invoke-interface {p1}, LAe/p;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public d(Lf2/n;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxe/u0;

    invoke-direct {v0, p0}, Lxe/u0;-><init>(Lxe/v0;)V

    invoke-virtual {p1, v0}, Lf2/n;->r(Lf2/n$c;)V

    return-void
.end method
