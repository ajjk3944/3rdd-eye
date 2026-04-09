.class public final Laj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/d$a;
    }
.end annotation


# static fields
.field public static final a:Laj/d;

.field private static final b:LXi/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laj/d;

    invoke-direct {v0}, Laj/d;-><init>()V

    sput-object v0, Laj/d;->a:Laj/d;

    sget-object v0, Laj/d$a;->b:Laj/d$a;

    sput-object v0, Laj/d;->b:LXi/f;

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

    sget-object v0, Laj/d;->b:LXi/f;

    return-object v0
.end method

.method public bridge synthetic c(LYi/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Laj/d;->g(LYi/e;)Laj/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(LYi/f;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Laj/c;

    invoke-virtual {p0, p1, p2}, Laj/d;->h(LYi/f;Laj/c;)V

    return-void
.end method

.method public g(LYi/e;)Laj/c;
    .locals 2

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->b(LYi/e;)V

    new-instance v0, Laj/c;

    sget-object v1, Laj/r;->a:Laj/r;

    invoke-static {v1}, LWi/a;->h(LVi/b;)LVi/b;

    move-result-object v1

    invoke-interface {v1, p1}, LVi/a;->c(LYi/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Laj/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public h(LYi/f;Laj/c;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Laj/s;->c(LYi/f;)V

    sget-object v0, Laj/r;->a:Laj/r;

    invoke-static {v0}, LWi/a;->h(LVi/b;)LVi/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LVi/o;->e(LYi/f;Ljava/lang/Object;)V

    return-void
.end method
