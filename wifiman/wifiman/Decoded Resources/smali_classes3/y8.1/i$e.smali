.class final Ly8/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/i;-><init>(Ly8/a$b;Ly8/r;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/i$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/i$e;

    invoke-direct {v0}, Ly8/i$e;-><init>()V

    sput-object v0, Ly8/i$e;->a:Ly8/i$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldd/i;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    check-cast p4, Ldd/i;

    check-cast p5, Ljava/util/List;

    invoke-virtual/range {p0 .. p5}, Ly8/i$e;->b(Ldd/i;Ll9/a;Ll9/a;Ldd/i;Ljava/util/List;)Ly8/i$b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ldd/i;Ll9/a;Ll9/a;Ldd/i;Ljava/util/List;)Ly8/i$b;
    .locals 6

    const-string/jumbo v0, "latency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dnsResolveTime"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "packetLossHistory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, Ldd/i;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ldd/i;

    new-instance p2, Ly8/i$b;

    move-object v0, p2

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ly8/i$b;-><init>(Ldd/i;Ldd/i;Ldd/i;Ldd/i;Ljava/util/List;)V

    return-object p2
.end method
