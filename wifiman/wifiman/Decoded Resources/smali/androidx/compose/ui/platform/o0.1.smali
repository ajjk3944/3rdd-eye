.class public final Landroidx/compose/ui/platform/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/h;


# instance fields
.field private final a:Lmh/a;

.field private final synthetic b:Lc0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lc0/h;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/o0;->a:Lmh/a;

    iput-object p1, p0, Landroidx/compose/ui/platform/o0;->b:Lc0/h;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o0;->b:Lc0/h;

    invoke-interface {v0, p1}, Lc0/h;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o0;->b:Lc0/h;

    invoke-interface {v0}, Lc0/h;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o0;->b:Lc0/h;

    invoke-interface {v0, p1}, Lc0/h;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o0;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public e(Ljava/lang/String;Lmh/a;)Lc0/h$a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/o0;->b:Lc0/h;

    invoke-interface {v0, p1, p2}, Lc0/h;->e(Ljava/lang/String;Lmh/a;)Lc0/h$a;

    move-result-object p1

    return-object p1
.end method
