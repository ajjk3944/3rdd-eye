.class public final LH/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:LH/p$a$a;

.field private static final b:Lc0/k;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH/p$a$a;

    invoke-direct {v0}, LH/p$a$a;-><init>()V

    sput-object v0, LH/p$a$a;->a:LH/p$a$a;

    sget-object v0, LK/f;->d:LK/f$a;

    sget-object v0, LK/d;->i:LK/d$b;

    invoke-virtual {v0}, LK/d$b;->a()Lc0/k;

    move-result-object v0

    new-instance v1, LH/p$a$a$a;

    invoke-direct {v1, v0}, LH/p$a$a$a;-><init>(Lc0/k;)V

    sput-object v1, LH/p$a$a;->b:Lc0/k;

    const/16 v0, 0x8

    sput v0, LH/p$a$a;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LH/p$a$a;->c(Ljava/lang/Object;)LH/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, LH/p;

    invoke-virtual {p0, p1, p2}, LH/p$a$a;->d(Lc0/m;LH/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Object;)LH/p;
    .locals 2

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<*>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_0

    sget-object v1, LK/d;->i:LK/d$b;

    invoke-virtual {v1}, LK/d$b;->a()Lc0/k;

    move-result-object v1

    invoke-interface {v1, v0}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LH/p$a$a;->b:Lc0/k;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v1, p1}, Lc0/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK/f;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v1, LH/p;

    invoke-direct {v1, v0, p1}, LH/p;-><init>(LK/d;LK/f;)V

    return-object v1
.end method

.method public d(Lc0/m;LH/p;)Ljava/lang/Object;
    .locals 2

    invoke-static {p2}, LH/p;->a(LH/p;)LK/d;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LK/d;->i:LK/d$b;

    invoke-virtual {v1}, LK/d$b;->a()Lc0/k;

    move-result-object v1

    invoke-interface {v1, p1, v0}, Lc0/k;->b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, LH/p$a$a;->b:Lc0/k;

    invoke-static {p2}, LH/p;->b(LH/p;)LK/f;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Lc0/k;->b(Lc0/m;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
