.class public abstract Laj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVi/A;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/b$a;
    }
.end annotation


# static fields
.field public static final d:Laj/b$a;


# instance fields
.field private final a:Laj/g;

.field private final b:Lcj/e;

.field private final c:Lbj/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Laj/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Laj/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Laj/b;->d:Laj/b$a;

    return-void
.end method

.method private constructor <init>(Laj/g;Lcj/e;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Laj/b;->a:Laj/g;

    .line 4
    iput-object p2, p0, Laj/b;->b:Lcj/e;

    .line 5
    new-instance p1, Lbj/n;

    invoke-direct {p1}, Lbj/n;-><init>()V

    iput-object p1, p0, Laj/b;->c:Lbj/n;

    return-void
.end method

.method public synthetic constructor <init>(Laj/g;Lcj/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Laj/b;-><init>(Laj/g;Lcj/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcj/e;
    .locals 1

    iget-object v0, p0, Laj/b;->b:Lcj/e;

    return-object v0
.end method

.method public final b(LVi/a;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Lbj/I;->a(Laj/b;Ljava/lang/String;)Lbj/H;

    move-result-object p2

    new-instance v0, Lbj/E;

    sget-object v3, Lbj/M;->OBJ:Lbj/M;

    invoke-interface {p1}, LVi/a;->a()LXi/f;

    move-result-object v5

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lbj/E;-><init>(Laj/b;Lbj/M;Lbj/a;LXi/f;Lbj/E$a;)V

    invoke-virtual {v0, p1}, Lbj/E;->t(LVi/a;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lbj/a;->x()V

    return-object p1
.end method

.method public final c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbj/y;

    invoke-direct {v0}, Lbj/y;-><init>()V

    :try_start_0
    invoke-static {p0, v0, p1, p2}, Lbj/x;->a(Laj/b;Lbj/o;LVi/o;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbj/y;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lbj/y;->h()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lbj/y;->h()V

    throw p1
.end method

.method public final d(LVi/a;Laj/j;)Ljava/lang/Object;
    .locals 1

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lbj/L;->a(Laj/b;Laj/j;LVi/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e()Laj/g;
    .locals 1

    iget-object v0, p0, Laj/b;->a:Laj/g;

    return-object v0
.end method

.method public final f()Lbj/n;
    .locals 1

    iget-object v0, p0, Laj/b;->c:Lbj/n;

    return-object v0
.end method
