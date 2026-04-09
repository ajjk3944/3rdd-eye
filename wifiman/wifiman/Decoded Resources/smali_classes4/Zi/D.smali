.class public final LZi/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/D;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZi/D;

    invoke-direct {v0}, LZi/D;-><init>()V

    sput-object v0, LZi/D;->a:LZi/D;

    new-instance v0, LZi/N0;

    const-string v1, "kotlin.time.Duration"

    sget-object v2, LXi/e$i;->a:LXi/e$i;

    invoke-direct {v0, v1, v2}, LZi/N0;-><init>(Ljava/lang/String;LXi/e;)V

    sput-object v0, LZi/D;->b:LXi/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LXi/f;
    .locals 1

    sget-object v0, LZi/D;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, LZi/D;->g(LYi/e;)J

    move-result-wide v0

    invoke-static {v0, v1}, LAi/a;->g(J)LAi/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, LAi/a;

    invoke-virtual {p2}, LAi/a;->g0()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LZi/D;->h(LYi/f;J)V

    return-void
.end method

.method public g(LYi/e;)J
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LAi/a;->b:LAi/a$a;

    invoke-interface {p1}, LYi/e;->s()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LAi/a$a;->c(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public h(LYi/f;J)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, LAi/a;->W(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, LYi/f;->G(Ljava/lang/String;)V

    return-void
.end method
