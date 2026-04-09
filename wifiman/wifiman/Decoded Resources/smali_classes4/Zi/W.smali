.class public final LZi/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final a:LZi/W;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LZi/W;

    invoke-direct {v0}, LZi/W;-><init>()V

    sput-object v0, LZi/W;->a:LZi/W;

    new-instance v0, LZi/N0;

    const-string v1, "kotlin.Int"

    sget-object v2, LXi/e$f;->a:LXi/e$f;

    invoke-direct {v0, v1, v2}, LZi/N0;-><init>(Ljava/lang/String;LXi/e;)V

    sput-object v0, LZi/W;->b:LXi/f;

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

    sget-object v0, LZi/W;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/W;->g(LYi/e;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LZi/W;->h(LYi/f;I)V

    return-void
.end method

.method public g(LYi/e;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYi/e;->n()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public h(LYi/f;I)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, LYi/f;->A(I)V

    return-void
.end method
