.class public final Lz/C;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/p0;


# instance fields
.field private n:Lf0/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lf0/c$b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Lz/C;->n:Lf0/c$b;

    return-void
.end method


# virtual methods
.method public D2(LY0/d;Ljava/lang/Object;)Lz/V;
    .locals 7

    instance-of p1, p2, Lz/V;

    if-eqz p1, :cond_0

    check-cast p2, Lz/V;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    new-instance p2, Lz/V;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v6}, Lz/V;-><init>(FZLz/m;Lz/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    sget-object p1, Lz/m;->a:Lz/m$b;

    iget-object v0, p0, Lz/C;->n:Lf0/c$b;

    invoke-virtual {p1, v0}, Lz/m$b;->a(Lf0/c$b;)Lz/m;

    move-result-object p1

    invoke-virtual {p2, p1}, Lz/V;->e(Lz/m;)V

    return-object p2
.end method

.method public final E2(Lf0/c$b;)V
    .locals 0

    iput-object p1, p0, Lz/C;->n:Lf0/c$b;

    return-void
.end method

.method public bridge synthetic M(LY0/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz/C;->D2(LY0/d;Ljava/lang/Object;)Lz/V;

    move-result-object p1

    return-object p1
.end method
