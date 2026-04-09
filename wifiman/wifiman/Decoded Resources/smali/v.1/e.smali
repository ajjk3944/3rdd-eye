.class public final Lv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/q;


# instance fields
.field private final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lv/e;->a:J

    return-void
.end method

.method public synthetic constructor <init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lv/e;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(LY0/p;JLY0/t;J)J
    .locals 7

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v0

    iget-wide v1, p0, Lv/e;->a:J

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v1

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result v2

    sget-object v3, LY0/t;->Ltr:LY0/t;

    if-ne p4, v3, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {v0, v1, v2, p4}, Lv/f;->b(IIIZ)I

    move-result p4

    invoke-virtual {p1}, LY0/p;->h()I

    move-result p1

    iget-wide v0, p0, Lv/e;->a:J

    invoke-static {v0, v1}, LY0/n;->i(J)I

    move-result v0

    add-int v1, p1, v0

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v2

    invoke-static {p2, p3}, LY0/r;->f(J)I

    move-result v3

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lv/f;->c(IIIZILjava/lang/Object;)I

    move-result p1

    invoke-static {p4, p1}, LY0/o;->a(II)J

    move-result-wide p1

    return-wide p1
.end method
