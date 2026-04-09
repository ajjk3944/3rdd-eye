.class public final LQ0/F;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LQ0/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LQ0/M;->a()LQ0/I;

    move-result-object v0

    iput-object v0, p0, LQ0/F;->a:LQ0/I;

    return-void
.end method


# virtual methods
.method public a(LQ0/S;LQ0/G;Lmh/l;Lmh/l;)LQ0/U;
    .locals 1

    invoke-virtual {p1}, LQ0/S;->c()LQ0/k;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    instance-of p3, p2, LQ0/h;

    :goto_0
    const/4 p4, 0x0

    if-eqz p3, :cond_1

    iget-object p2, p0, LQ0/F;->a:LQ0/I;

    invoke-virtual {p1}, LQ0/S;->f()LQ0/A;

    move-result-object p3

    invoke-virtual {p1}, LQ0/S;->d()I

    move-result p1

    invoke-interface {p2, p3, p1}, LQ0/I;->b(LQ0/A;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_1

    :cond_1
    instance-of p2, p2, LQ0/E;

    if-eqz p2, :cond_2

    iget-object p2, p0, LQ0/F;->a:LQ0/I;

    invoke-virtual {p1}, LQ0/S;->c()LQ0/k;

    move-result-object p3

    check-cast p3, LQ0/E;

    invoke-virtual {p1}, LQ0/S;->f()LQ0/A;

    move-result-object v0

    invoke-virtual {p1}, LQ0/S;->d()I

    move-result p1

    invoke-interface {p2, p3, v0, p1}, LQ0/I;->a(LQ0/E;LQ0/A;I)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_1
    new-instance p2, LQ0/U$b;

    const/4 p3, 0x0

    const/4 v0, 0x2

    invoke-direct {p2, p1, p3, v0, p4}, LQ0/U$b;-><init>(Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2

    :cond_2
    return-object p4
.end method
