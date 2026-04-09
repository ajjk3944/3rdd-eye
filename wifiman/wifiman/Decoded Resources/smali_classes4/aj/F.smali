.class public final Laj/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/F$a;
    }
.end annotation


# static fields
.field public static final a:Laj/F;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laj/F;

    invoke-direct {v0}, Laj/F;-><init>()V

    sput-object v0, Laj/F;->a:Laj/F;

    sget-object v0, Laj/F$a;->b:Laj/F$a;

    sput-object v0, Laj/F;->b:LXi/f;

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

    sget-object v0, Laj/F;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/F;->g(LYi/e;)Laj/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/E;

    invoke-virtual {p0, p1, p2}, Laj/F;->h(LYi/f;Laj/E;)V

    return-void
.end method

.method public g(LYi/e;)Laj/E;
    .locals 3

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->b(LYi/e;)V

    new-instance v0, Laj/E;

    sget-object v1, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v1}, LWi/a;->K(Lkotlin/jvm/internal/U;)LVi/b;

    move-result-object v1

    sget-object v2, Laj/r;->a:Laj/r;

    invoke-static {v1, v2}, LWi/a;->k(LVi/b;LVi/b;)LVi/b;

    move-result-object v1

    invoke-interface {v1, p1}, LVi/a;->c(LYi/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {v0, p1}, Laj/E;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public h(LYi/f;Laj/E;)V
    .locals 2

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    sget-object v0, Lkotlin/jvm/internal/U;->a:Lkotlin/jvm/internal/U;

    invoke-static {v0}, LWi/a;->K(Lkotlin/jvm/internal/U;)LVi/b;

    move-result-object v0

    sget-object v1, Laj/r;->a:Laj/r;

    invoke-static {v0, v1}, LWi/a;->k(LVi/b;LVi/b;)LVi/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    return-void
.end method
